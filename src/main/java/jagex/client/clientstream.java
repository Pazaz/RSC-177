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
        aBoolean640 = true;
        s = socket;
        in = socket.getInputStream();
        out = socket.getOutputStream();
        aBoolean640 = false;
        gameshell.method20(this);
    }

    public void method317() {
        super.method317();
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
        aBoolean640 = true;
        synchronized (this) {
            notify();
        }
        aByteArray637 = null;
    }

    public int method318()
            throws IOException {
        if (closed)
            return 0;
        else
            return in.read();
    }

    public int method319()
            throws IOException {
        if (closed)
            return 0;
        else
            return in.available();
    }

    public void method320(int i, int j, byte[] abyte0)
            throws IOException {
        if (closed)
            return;
        int k = 0;
        boolean flag = false;
        int l;
        for (; k < i; k += l)
            if ((l = in.read(abyte0, k + j, i - k)) <= 0)
                throw new IOException("EOF");

    }

    public void method321(byte[] abyte0, int i, int j)
            throws IOException {
        if (closed)
            return;
        if (aByteArray637 == null)
            aByteArray637 = new byte[5000];
        synchronized (this) {
            for (int k = 0; k < j; k++) {
                aByteArray637[anInt639] = abyte0[k + i];
                anInt639 = (anInt639 + 1) % 5000;
                if (anInt639 == (anInt638 + 4900) % 5000)
                    throw new IOException("buffer overflow");
            }

            notify();
        }
    }

    public void run() {
        while (!aBoolean640) {
            int i;
            int j;
            synchronized (this) {
                if (anInt639 == anInt638)
                    try {
                        wait();
                    } catch (InterruptedException _ex) {
                    }
                if (aBoolean640)
                    return;
                j = anInt638;
                if (anInt639 >= anInt638)
                    i = anInt639 - anInt638;
                else
                    i = 5000 - anInt638;
            }
            if (i > 0) {
                try {
                    out.write(aByteArray637, j, i);
                } catch (IOException ioexception) {
                    super.aBoolean385 = true;
                    super.aString386 = "Twriter:" + ioexception;
                }
                anInt638 = (anInt638 + i) % 5000;
                try {
                    if (anInt639 == anInt638)
                        out.flush();
                } catch (IOException ioexception1) {
                    super.aBoolean385 = true;
                    super.aString386 = "Twriter:" + ioexception1;
                }
            }
        }
    }

    public InputStream in;
    public OutputStream out;
    public Socket s;
    public boolean closed;
    public byte[] aByteArray637;
    public int anInt638;
    public int anInt639;
    public boolean aBoolean640;
}
