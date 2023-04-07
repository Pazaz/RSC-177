package jagex.client;

import jagex.bzip2;
import jagex.tools;

import java.applet.Applet;
import java.awt.*;
import java.awt.image.IndexColorModel;
import java.awt.image.MemoryImageSource;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

// was a.a.a
public class gameshell extends Applet
        implements Runnable {

    public void load() {
    }

    public synchronized void update() {
    }

    public void unload() {
    }

    public synchronized void draw() {
    }

    public void refresh() {
    }

    public void initApplication(int i, int j, String title, boolean resizable) {
        isApplet = false;
        System.out.println("Started application");
        width = i;
        height = j;
        box = new viewbox(this, i, j, title, resizable, false);
        anInt13 = 1;
        thread = new Thread(this);
        thread.start();
        thread.setPriority(1);
    }

    public boolean getIsApplet() {
        return isApplet;
    }

    public void setFramerate(int fps) {
        deltime = 1000 / fps;
    }

    public void clearFrameAverages() {
        for (int i = 0; i < 10; i++)
            otim[i] = 0L;

    }

    public synchronized boolean keyDown(Event event, int i) {
        method10(i);
        anInt37 = i;
        anInt38 = i;
        anInt12 = 0;
        if (i == 1006)
            arrowKeyLeft = true;
        if (i == 1007)
            arrowKeyRight = true;
        if (i == 1004)
            arrowKeyUp = true;
        if (i == 1005)
            arrowKeyDown = true;
        if ((char) i == ' ')
            aBoolean30 = true;
        if ((char) i == 'n' || (char) i == 'm')
            aBoolean31 = true;
        if ((char) i == 'N' || (char) i == 'M')
            aBoolean31 = true;
        if ((char) i == '{')
            aBoolean24 = true;
        if ((char) i == '}')
            aBoolean25 = true;
        if ((char) i == '\u03F0')
            aBoolean39 = !aBoolean39;
        boolean flag = false;
        for (int j = 0; j < aString23.length(); j++) {
            if (i != aString23.charAt(j))
                continue;
            flag = true;
            break;
        }

        if (flag && aString40.length() < 20)
            aString40 += (char) i;
        if (flag && aString42.length() < 80)
            aString42 += (char) i;
        if (i == 8 && aString40.length() > 0)
            aString40 = aString40.substring(0, aString40.length() - 1);
        if (i == 8 && aString42.length() > 0)
            aString42 = aString42.substring(0, aString42.length() - 1);
        if (i == 10 || i == 13) {
            aString41 = aString40;
            aString43 = aString42;
        }
        return true;
    }

    public void method10(int i) {
    }

    public synchronized boolean keyUp(Event event, int i) {
        anInt37 = 0;
        if (i == 1006)
            arrowKeyLeft = false;
        if (i == 1007)
            arrowKeyRight = false;
        if (i == 1004)
            arrowKeyUp = false;
        if (i == 1005)
            arrowKeyDown = false;
        if ((char) i == ' ')
            aBoolean30 = false;
        if ((char) i == 'n' || (char) i == 'm')
            aBoolean31 = false;
        if ((char) i == 'N' || (char) i == 'M')
            aBoolean31 = false;
        if ((char) i == '{')
            aBoolean24 = false;
        if ((char) i == '}')
            aBoolean25 = false;
        return true;
    }

    public synchronized boolean mouseMove(Event event, int i, int j) {
        mouseX = i;
        mouseY = j + offsetY;
        mouseButton = 0;
        anInt12 = 0;
        return true;
    }

    public synchronized boolean mouseUp(Event event, int i, int j) {
        mouseX = i;
        mouseY = j + offsetY;
        mouseButton = 0;
        return true;
    }

    public synchronized boolean mouseDown(Event event, int i, int j) {
        mouseX = i;
        mouseY = j + offsetY;
        if (event.metaDown())
            mouseButton = 2;
        else
            mouseButton = 1;
        anInt36 = mouseButton;
        anInt12 = 0;
        method11(mouseButton, i, j);
        return true;
    }

    public void method11(int i, int j, int k) {
    }

    public synchronized boolean mouseDrag(Event event, int i, int j) {
        mouseX = i;
        mouseY = j + offsetY;
        if (event.metaDown())
            mouseButton = 2;
        else
            mouseButton = 1;
        return true;
    }

    public void init() {
        isApplet = true;
        System.out.println("Started applet");
        width = 512;
        height = 344;
        anInt13 = 1;
        tools.codeBase = getCodeBase();
        startThread(this);
    }

    public void start() {
        if (state >= 0)
            state = 0;
    }

    public void stop() {
        if (state >= 0)
            state = 4000 / deltime;
    }

    public void destroy() {
        state = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception _ex) {
        }
        if (state == -1) {
            System.out.println("5 seconds expired, forcing kill");
            shutdown();
            if (thread != null) {
                thread.stop();
                thread = null;
            }
        }
    }

    public void shutdown() {
        state = -2;
        System.out.println("Closing program");
        unload();
        try {
            Thread.sleep(1000L);
        } catch (Exception _ex) {
        }
        if (box != null)
            box.dispose();
        if (!isApplet)
            System.exit(0);
    }

    public void run() {
        if (anInt13 == 1) {
            anInt13 = 2;
            g = getGraphics();
            method13();
            showProgress(0, "Loading...");
            load();
            anInt13 = 0;
        }
        int opos = 0;
        int ratio = 256;
        int delta = 1;
        int count = 0;
        for (int i = 0; i < 10; i++)
            otim[i] = System.currentTimeMillis();

        long l = System.currentTimeMillis();
        while (state >= 0) {
            if (state > 0) {
                state--;
                if (state == 0) {
                    shutdown();
                    thread = null;
                    return;
                }
            }
            int k1 = ratio;
            int i2 = delta;
            ratio = 300;
            delta = 1;
            long l1 = System.currentTimeMillis();
            if (otim[opos] == 0L) {
                ratio = k1;
                delta = i2;
            } else if (l1 > otim[opos])
                ratio = (int) ((long) (2560L * deltime) / (l1 - otim[opos]));
            if (ratio < 25)
                ratio = 25;
            if (ratio > 256) {
                ratio = 256;
                delta = (int) ((long) deltime - (l1 - otim[opos]) / 10L);
                if (delta < mindel)
                    delta = mindel;
            }
            try {
                Thread.sleep(delta);
            } catch (InterruptedException _ex) {
            }
            otim[opos] = l1;
            opos = (opos + 1) % 10;
            if (delta > 1) {
                for (int j2 = 0; j2 < 10; j2++)
                    if (otim[j2] != 0L)
                        otim[j2] += delta;

            }
            int k2 = 0;
            while (count < 256) {
                update();
                count += ratio;
                if (++k2 > anInt5) {
                    count = 0;
                    anInt10 += 6;
                    if (anInt10 > 25) {
                        anInt10 = 0;
                        aBoolean39 = true;
                    }
                    break;
                }
            }
            anInt10--;
            count &= 0xff;
            draw();
        }
        if (state == -1)
            shutdown();
        thread = null;
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        if (anInt13 == 2 && image != null) {
            showProgress(anInt16, aString17);
            return;
        }
        if (anInt13 == 0)
            refresh();
    }

    public void method13() {
        g.setColor(Color.black);
        g.fillRect(0, 0, width, height);
        byte[] abyte0 = loadJagfile("jagex.jag", "Jagex library", 0);
        if (abyte0 == null) {
        } else {
            byte[] abyte1 = tools.loadData("logo.tga", 0, abyte0);
            image = method17(abyte1);
            pixmap.method250(tools.loadData("h11p.jf", 0, abyte0));
            pixmap.method250(tools.loadData("h12b.jf", 0, abyte0));
            pixmap.method250(tools.loadData("h12p.jf", 0, abyte0));
            pixmap.method250(tools.loadData("h13b.jf", 0, abyte0));
            pixmap.method250(tools.loadData("h14b.jf", 0, abyte0));
            pixmap.method250(tools.loadData("h16b.jf", 0, abyte0));
            pixmap.method250(tools.loadData("h20b.jf", 0, abyte0));
            pixmap.method250(tools.loadData("h24b.jf", 0, abyte0));
        }
    }

    public void showProgress(int i, String s) {
        try {
            int j = (width - 281) / 2;
            int k = (height - 148) / 2;
            g.setColor(Color.black);
            g.fillRect(0, 0, width, height);
            if (!aBoolean15)
                g.drawImage(image, j, k, this);
            j += 2;
            k += 90;
            anInt16 = i;
            aString17 = s;
            g.setColor(new Color(132, 132, 132));
            if (aBoolean15)
                g.setColor(new Color(220, 0, 0));
            g.drawRect(j - 2, k - 2, 280, 23);
            g.fillRect(j, k, (277 * i) / 100, 20);
            g.setColor(new Color(198, 198, 198));
            if (aBoolean15)
                g.setColor(new Color(255, 255, 255));
            drawText(g, s, tr15, j + 138, k + 10);
            if (!aBoolean15) {
                drawText(g, "Created by JAGeX - visit www.jagex.com", h13b, j + 138, k + 30);
                drawText(g, "\2512001-2002 Andrew Gower and Jagex Ltd", h13b, j + 138, k + 44);
            } else {
                g.setColor(new Color(132, 132, 152));
                drawText(g, "\2512001-2002 Andrew Gower and Jagex Ltd", h12, j + 138, height - 20);
            }
            if (aString14 != null) {
                g.setColor(Color.white);
                drawText(g, aString14, h13b, j + 138, k - 120);
            }
        } catch (Exception _ex) {
        }
    }

    public void drawProgress(int i, String s) {
        try {
            int j = (width - 281) / 2;
            int k = (height - 148) / 2;
            j += 2;
            k += 90;
            anInt16 = i;
            aString17 = s;
            int l = (277 * i) / 100;
            g.setColor(new Color(132, 132, 132));
            if (aBoolean15)
                g.setColor(new Color(220, 0, 0));
            g.fillRect(j, k, l, 20);
            g.setColor(Color.black);
            g.fillRect(j + l, k, 277 - l, 20);
            g.setColor(new Color(198, 198, 198));
            if (aBoolean15)
                g.setColor(new Color(255, 255, 255));
            drawText(g, s, tr15, j + 138, k + 10);
        } catch (Exception _ex) {
        }
    }

    public void drawText(Graphics g, String s, Font font, int i, int j) {
        Object obj;
        if (box == null)
            obj = this;
        else
            obj = box;
        FontMetrics fontmetrics = ((Component) (obj)).getFontMetrics(font);
        fontmetrics.stringWidth(s);
        g.setFont(font);
        g.drawString(s, i - fontmetrics.stringWidth(s) / 2, j + fontmetrics.getHeight() / 4);
    }

    public Image method17(byte[] abyte0) {
        int i = abyte0[13] * 256 + abyte0[12];
        int j = abyte0[15] * 256 + abyte0[14];
        byte[] abyte1 = new byte[256];
        byte[] abyte2 = new byte[256];
        byte[] abyte3 = new byte[256];
        for (int k = 0; k < 256; k++) {
            abyte1[k] = abyte0[20 + k * 3];
            abyte2[k] = abyte0[19 + k * 3];
            abyte3[k] = abyte0[18 + k * 3];
        }

        IndexColorModel indexcolormodel = new IndexColorModel(8, 256, abyte1, abyte2, abyte3);
        byte[] abyte4 = new byte[i * j];
        int l = 0;
        for (int i1 = j - 1; i1 >= 0; i1--) {
            for (int j1 = 0; j1 < i; j1++)
                abyte4[l++] = abyte0[786 + j1 + i1 * i];

        }

        MemoryImageSource memoryimagesource = new MemoryImageSource(i, j, indexcolormodel, abyte4, 0, i);
        Image image = createImage(memoryimagesource);
        return image;
    }

    public byte[] loadJagfile(String s, String s1, int i) {
        System.out.println("Using default load");
        int j = 0;
        int k = 0;
        byte[] abyte0 = null;
        try {
            drawProgress(i, "Loading " + s1 + " - 0%");
            java.io.InputStream inputstream = tools.openFile(s);
            DataInputStream datainputstream = new DataInputStream(inputstream);
            byte[] abyte2 = new byte[6];
            datainputstream.readFully(abyte2, 0, 6);
            j = ((abyte2[0] & 0xff) << 16) + ((abyte2[1] & 0xff) << 8) + (abyte2[2] & 0xff);
            k = ((abyte2[3] & 0xff) << 16) + ((abyte2[4] & 0xff) << 8) + (abyte2[5] & 0xff);
            drawProgress(i, "Loading " + s1 + " - 5%");
            int l = 0;
            abyte0 = new byte[k];
            while (l < k) {
                int i1 = k - l;
                if (i1 > 1000)
                    i1 = 1000;
                datainputstream.readFully(abyte0, l, i1);
                l += i1;
                drawProgress(i, "Loading " + s1 + " - " + (5 + (l * 95) / k) + "%");
            }
            datainputstream.close();
        } catch (IOException _ex) {
        }
        drawProgress(i, "Unpacking " + s1);
        if (k != j) {
            byte[] abyte1 = new byte[j];
            bzip2.read(abyte1, j, abyte0, k, 0);
            return abyte1;
        } else {
            return abyte0;
        }
    }

    public Graphics getGraphics() {
        if (box != null)
            return box.getGraphics();
        else
            return super.getGraphics();
    }

    public Image createImage(int i, int j) {
        if (box != null)
            return box.createImage(i, j);
        else
            return super.createImage(i, j);
    }

    public URL getCodeBase() {
        return super.getCodeBase();
    }

    public URL getDocumentBase() {
        return super.getDocumentBase();
    }

    public String getParameter(String s) {
        return super.getParameter(s);
    }

    public Socket openSocket(String host, int port)
            throws IOException {
        Socket socket;
        if (getIsApplet())
            socket = new Socket(InetAddress.getByName(getCodeBase().getHost()), port);
        else
            socket = new Socket(InetAddress.getByName(host), port);
        socket.setSoTimeout(30000);
        socket.setTcpNoDelay(true);
        return socket;
    }

    public void startThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();
    }

    public gameshell() {
        width = 512;
        height = 384;
        deltime = 20;
        anInt5 = 1000;
        otim = new long[10];
        anInt13 = 1;
        aBoolean15 = false;
        aString17 = "Loading";
        tr15 = new Font("TimesRoman", Font.PLAIN, 15);
        h13b = new Font("Helvetica", Font.BOLD, 13);
        h12 = new Font("Helvetica", Font.PLAIN, 12);
        aBoolean24 = false;
        aBoolean25 = false;
        arrowKeyLeft = false;
        arrowKeyRight = false;
        arrowKeyUp = false;
        arrowKeyDown = false;
        aBoolean30 = false;
        aBoolean31 = false;
        mindel = 1;
        aBoolean39 = false;
        aString40 = "";
        aString41 = "";
        aString42 = "";
        aString43 = "";
    }

    public int width;
    public int height;
    public Thread thread;
    public int deltime;
    public int anInt5;
    public long[] otim;
    public static viewbox box = null;
    public boolean isApplet;
    public int state;
    public int anInt10;
    public int offsetY;
    public int anInt12;
    public int anInt13;
    public String aString14;
    public boolean aBoolean15;
    public int anInt16;
    public String aString17;
    public Font tr15;
    public Font h13b;
    public Font h12;
    public Image image;
    public Graphics g;
    public static String aString23 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\243$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
    public boolean aBoolean24;
    public boolean aBoolean25;
    public boolean arrowKeyLeft;
    public boolean arrowKeyRight;
    public boolean arrowKeyUp;
    public boolean arrowKeyDown;
    public boolean aBoolean30;
    public boolean aBoolean31;
    public int mindel;
    public int mouseX;
    public int mouseY;
    public int mouseButton;
    public int anInt36;
    public int anInt37;
    public int anInt38;
    public boolean aBoolean39;
    public String aString40;
    public String aString41;
    public String aString42;
    public String aString43;

}
