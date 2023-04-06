package jagex.client;

import jagex.stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

// was: a.a.k
public class clientstream extends stream
        implements Runnable {

    public clientstream(Socket socket, gameshell gameshell)
            throws IOException {
        closed = false;
        writing = true;
        s = socket;
        in = socket.getInputStream();
        out = socket.getOutputStream();
        writing = false;
        gameshell.startThread(this);
    }

    public void close() {
        super.close();
        closed = true;
        try {
            if (in != null)
                in.close();
            if (out != null)
                out.close();
            if (s != null)
                s.close();
        } catch (IOException _ex) {
            System.out.println("Error closing stream");
        }
        writing = true;
        synchronized (this) {
            notify();
        }
        buf = null;
    }

    public int g1()
            throws IOException {
        if (closed)
            return 0;
        else
            return in.read();
    }

    public int available()
            throws IOException {
        if (closed)
            return 0;
        else
            return in.available();
    }

    public void read(int i, int j, byte[] dest)
            throws IOException {
        if (closed)
            return;
        int k = 0;
        boolean flag = false;
        int l;
        for (; k < i; k += l)
            if ((l = in.read(dest, k + j, i - k)) <= 0)
                throw new IOException("EOF");

    }

    public void write(byte[] src, int offset, int length)
            throws IOException {
        if (closed)
            return;
        if (buf == null)
            buf = new byte[5000];
        synchronized (this) {
            for (int k = 0; k < length; k++) {
                buf[tnum] = src[k + offset];
                tnum = (tnum + 1) % 5000;
                if (tnum == (tcyl + 4900) % 5000)
                    throw new IOException("buffer overflow");
            }

            notify();
        }
    }

    public void run() {
        while (!writing) {
            int i;
            int j;
            synchronized (this) {
                if (tnum == tcyl)
                    try {
                        wait();
                    } catch (InterruptedException _ex) {
                    }
                if (writing)
                    return;
                j = tcyl;
                if (tnum >= tcyl)
                    i = tnum - tcyl;
                else
                    i = 5000 - tcyl;
            }
            if (i > 0) {
                try {
                    out.write(buf, j, i);
                } catch (IOException ioexception) {
                    super.ioerror = true;
                    super.exception = "Twriter:" + ioexception;
                }
                tcyl = (tcyl + i) % 5000;
                try {
                    if (tnum == tcyl)
                        out.flush();
                } catch (IOException ioexception1) {
                    super.ioerror = true;
                    super.exception = "Twriter:" + ioexception1;
                }
            }
        }
    }

    public InputStream in;
    public OutputStream out;
    public Socket s;
    public boolean closed;
    public byte[] buf;
    public int tcyl;
    public int tnum;
    public boolean writing;
}
