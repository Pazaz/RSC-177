package jagex.client;

import jagex.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@OriginalClass("mudclient!a/a/k")
public final class ClientStream extends Stream implements Runnable {

	@OriginalMember(owner = "mudclient!a/a/k", name = "M", descriptor = "[B")
	private byte[] buf;

	@OriginalMember(owner = "mudclient!a/a/k", name = "N", descriptor = "I")
	private int bufLen;

	@OriginalMember(owner = "mudclient!a/a/k", name = "O", descriptor = "I")
	private int bufPos;

	@OriginalMember(owner = "mudclient!a/a/k", name = "L", descriptor = "Z")
	private boolean closed = false;

	@OriginalMember(owner = "mudclient!a/a/k", name = "P", descriptor = "Z")
	private boolean writerClosed = true;

	@OriginalMember(owner = "mudclient!a/a/k", name = "K", descriptor = "Ljava/net/Socket;")
	private Socket socket;

	@OriginalMember(owner = "mudclient!a/a/k", name = "I", descriptor = "Ljava/io/InputStream;")
	private InputStream in;

	@OriginalMember(owner = "mudclient!a/a/k", name = "J", descriptor = "Ljava/io/OutputStream;")
	private OutputStream out;

	@OriginalMember(owner = "mudclient!a/a/k", name = "<init>", descriptor = "(Ljava/net/Socket;Lmudclient!a/a/a;)V")
	public ClientStream(@OriginalArg(0) Socket socket, @OriginalArg(1) GameShell shell) throws IOException {
		this.socket = socket;
		this.in = socket.getInputStream();
		this.out = socket.getOutputStream();
		this.writerClosed = false;
		shell.startThread(this);
	}

	@OriginalMember(owner = "mudclient!a/a/k", name = "a", descriptor = "()V")
	@Override
	public void close() {
		super.close();
		this.closed = true;

		try {
			if (this.in != null) {
				this.in.close();
			}

			if (this.out != null) {
				this.out.close();
			}

			if (this.socket != null) {
				this.socket.close();
			}
		} catch (@Pc(24) IOException ignored) {
			System.out.println("Error closing stream");
		}

		this.writerClosed = true;

		synchronized (this) {
			this.notify();
		}

		this.buf = null;
	}

	@OriginalMember(owner = "mudclient!a/a/k", name = "b", descriptor = "()I")
	@Override
	public int read() throws IOException {
		return this.closed ? 0 : this.in.read();
	}

	@OriginalMember(owner = "mudclient!a/a/k", name = "c", descriptor = "()I")
	@Override
	protected int available() throws IOException {
		return this.closed ? 0 : this.in.available();
	}

	@OriginalMember(owner = "mudclient!a/a/k", name = "a", descriptor = "(II[B)V")
	@Override
	protected void read(@OriginalArg(0) int length, @OriginalArg(1) int offset, @OriginalArg(2) byte[] dest) throws IOException {
		if (this.closed) {
			return;
		}

		@Pc(22) int read;
		for (@Pc(6) int i = 0; i < length; i += read) {
			if ((read = this.in.read(dest, i + offset, length - i)) <= 0) {
				throw new IOException("EOF");
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/a/k", name = "a", descriptor = "([BII)V")
	@Override
	protected void write(@OriginalArg(0) byte[] src, @OriginalArg(1) int offset, @OriginalArg(2) int length) throws IOException {
		if (this.closed) {
			return;
		}

		if (this.buf == null) {
			this.buf = new byte[5000];
		}

		synchronized (this) {
			for (@Pc(17) int i = 0; i < length; i++) {
				this.buf[this.bufPos] = src[i + offset];
				this.bufPos = (this.bufPos + 1) % 5000;

				if (this.bufPos == (this.bufLen + 4900) % 5000) {
					throw new IOException("buffer overflow");
				}
			}

			this.notify();
		}
	}

	@OriginalMember(owner = "mudclient!a/a/k", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.writerClosed) {
			@Pc(38) int len;
			@Pc(27) int off;

			synchronized (this) {
				if (this.bufPos == this.bufLen) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException ignored) {
					}
				}

				if (this.writerClosed) {
					return;
				}

				off = this.bufLen;

				if (this.bufPos >= this.bufLen) {
					len = this.bufPos - this.bufLen;
				} else {
					len = 5000 - this.bufLen;
				}
			}

			if (len > 0) {
				try {
					this.out.write(this.buf, off, len);
				} catch (@Pc(62) IOException ex) {
					super.ioError = true;
					super.ioException = "Twriter:" + ex;
				}

				this.bufLen = (this.bufLen + len) % 5000;

				try {
					if (this.bufPos == this.bufLen) {
						this.out.flush();
					}
				} catch (@Pc(92) IOException ex) {
					super.ioError = true;
					super.ioException = "Twriter:" + ex;
				}
			}
		}
	}
}
