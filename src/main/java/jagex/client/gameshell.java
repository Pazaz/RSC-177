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

    public void method1() {
    }

    public synchronized void method2() {
    }

    public void method3() {
    }

    public synchronized void method4() {
    }

    public void method5() {
    }

    public void method6(int i, int j, String s, boolean flag) {
        aBoolean8 = false;
        System.out.println("Started application");
        anInt1 = i;
        anInt2 = j;
        aViewbox_7 = new viewbox(this, i, j, s, flag, false);
        anInt13 = 1;
        aThread3 = new Thread(this);
        aThread3.start();
        aThread3.setPriority(1);
    }

    public boolean method7() {
        return aBoolean8;
    }

    public void method8(int i) {
        anInt4 = 1000 / i;
    }

    public void method9() {
        for (int i = 0; i < 10; i++)
            aLongArray6[i] = 0L;

    }

    public synchronized boolean keyDown(Event event, int i) {
        method10(i);
        anInt37 = i;
        anInt38 = i;
        anInt12 = 0;
        if (i == 1006)
            aBoolean26 = true;
        if (i == 1007)
            aBoolean27 = true;
        if (i == 1004)
            aBoolean28 = true;
        if (i == 1005)
            aBoolean29 = true;
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
            aBoolean26 = false;
        if (i == 1007)
            aBoolean27 = false;
        if (i == 1004)
            aBoolean28 = false;
        if (i == 1005)
            aBoolean29 = false;
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
        anInt33 = i;
        anInt34 = j + anInt11;
        anInt35 = 0;
        anInt12 = 0;
        return true;
    }

    public synchronized boolean mouseUp(Event event, int i, int j) {
        anInt33 = i;
        anInt34 = j + anInt11;
        anInt35 = 0;
        return true;
    }

    public synchronized boolean mouseDown(Event event, int i, int j) {
        anInt33 = i;
        anInt34 = j + anInt11;
        if (event.metaDown())
            anInt35 = 2;
        else
            anInt35 = 1;
        anInt36 = anInt35;
        anInt12 = 0;
        method11(anInt35, i, j);
        return true;
    }

    public void method11(int i, int j, int k) {
    }

    public synchronized boolean mouseDrag(Event event, int i, int j) {
        anInt33 = i;
        anInt34 = j + anInt11;
        if (event.metaDown())
            anInt35 = 2;
        else
            anInt35 = 1;
        return true;
    }

    public void init() {
        aBoolean8 = true;
        System.out.println("Started applet");
        anInt1 = 512;
        anInt2 = 344;
        anInt13 = 1;
        tools.anURL410 = getCodeBase();
        method20(this);
    }

    public void start() {
        if (anInt9 >= 0)
            anInt9 = 0;
    }

    public void stop() {
        if (anInt9 >= 0)
            anInt9 = 4000 / anInt4;
    }

    public void destroy() {
        anInt9 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception _ex) {
        }
        if (anInt9 == -1) {
            System.out.println("5 seconds expired, forcing kill");
            method12();
            if (aThread3 != null) {
                aThread3.stop();
                aThread3 = null;
            }
        }
    }

    public void method12() {
        anInt9 = -2;
        System.out.println("Closing program");
        method3();
        try {
            Thread.sleep(1000L);
        } catch (Exception _ex) {
        }
        if (aViewbox_7 != null)
            aViewbox_7.dispose();
        if (!aBoolean8)
            System.exit(0);
    }

    public void run() {
        if (anInt13 == 1) {
            anInt13 = 2;
            aGraphics22 = getGraphics();
            method13();
            method14(0, "Loading...");
            method1();
            anInt13 = 0;
        }
        int i = 0;
        int j = 256;
        int k = 1;
        int i1 = 0;
        for (int j1 = 0; j1 < 10; j1++)
            aLongArray6[j1] = System.currentTimeMillis();

        long l = System.currentTimeMillis();
        while (anInt9 >= 0) {
            if (anInt9 > 0) {
                anInt9--;
                if (anInt9 == 0) {
                    method12();
                    aThread3 = null;
                    return;
                }
            }
            int k1 = j;
            int i2 = k;
            j = 300;
            k = 1;
            long l1 = System.currentTimeMillis();
            if (aLongArray6[i] == 0L) {
                j = k1;
                k = i2;
            } else if (l1 > aLongArray6[i])
                j = (int) ((long) (2560L * anInt4) / (l1 - aLongArray6[i]));
            if (j < 25)
                j = 25;
            if (j > 256) {
                j = 256;
                k = (int) ((long) anInt4 - (l1 - aLongArray6[i]) / 10L);
                if (k < anInt32)
                    k = anInt32;
            }
            try {
                Thread.sleep(k);
            } catch (InterruptedException _ex) {
            }
            aLongArray6[i] = l1;
            i = (i + 1) % 10;
            if (k > 1) {
                for (int j2 = 0; j2 < 10; j2++)
                    if (aLongArray6[j2] != 0L)
                        aLongArray6[j2] += k;

            }
            int k2 = 0;
            while (i1 < 256) {
                method2();
                i1 += j;
                if (++k2 > anInt5) {
                    i1 = 0;
                    anInt10 += 6;
                    if (anInt10 > 25) {
                        anInt10 = 0;
                        aBoolean39 = true;
                    }
                    break;
                }
            }
            anInt10--;
            i1 &= 0xff;
            method4();
        }
        if (anInt9 == -1)
            method12();
        aThread3 = null;
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        if (anInt13 == 2 && anImage21 != null) {
            method14(anInt16, aString17);
            return;
        }
        if (anInt13 == 0)
            method5();
    }

    public void method13() {
        aGraphics22.setColor(Color.black);
        aGraphics22.fillRect(0, 0, anInt1, anInt2);
        byte[] abyte0 = method18("jagex.jag", "Jagex library", 0);
        if (abyte0 == null) {
        } else {
            byte[] abyte1 = tools.method357("logo.tga", 0, abyte0);
            anImage21 = method17(abyte1);
            pixmap.method250(tools.method357("h11p.jf", 0, abyte0));
            pixmap.method250(tools.method357("h12b.jf", 0, abyte0));
            pixmap.method250(tools.method357("h12p.jf", 0, abyte0));
            pixmap.method250(tools.method357("h13b.jf", 0, abyte0));
            pixmap.method250(tools.method357("h14b.jf", 0, abyte0));
            pixmap.method250(tools.method357("h16b.jf", 0, abyte0));
            pixmap.method250(tools.method357("h20b.jf", 0, abyte0));
            pixmap.method250(tools.method357("h24b.jf", 0, abyte0));
        }
    }

    public void method14(int i, String s) {
        try {
            int j = (anInt1 - 281) / 2;
            int k = (anInt2 - 148) / 2;
            aGraphics22.setColor(Color.black);
            aGraphics22.fillRect(0, 0, anInt1, anInt2);
            if (!aBoolean15)
                aGraphics22.drawImage(anImage21, j, k, this);
            j += 2;
            k += 90;
            anInt16 = i;
            aString17 = s;
            aGraphics22.setColor(new Color(132, 132, 132));
            if (aBoolean15)
                aGraphics22.setColor(new Color(220, 0, 0));
            aGraphics22.drawRect(j - 2, k - 2, 280, 23);
            aGraphics22.fillRect(j, k, (277 * i) / 100, 20);
            aGraphics22.setColor(new Color(198, 198, 198));
            if (aBoolean15)
                aGraphics22.setColor(new Color(255, 255, 255));
            method16(aGraphics22, s, aFont18, j + 138, k + 10);
            if (!aBoolean15) {
                method16(aGraphics22, "Created by JAGeX - visit www.jagex.com", aFont19, j + 138, k + 30);
                method16(aGraphics22, "\2512001-2002 Andrew Gower and Jagex Ltd", aFont19, j + 138, k + 44);
            } else {
                aGraphics22.setColor(new Color(132, 132, 152));
                method16(aGraphics22, "\2512001-2002 Andrew Gower and Jagex Ltd", aFont20, j + 138, anInt2 - 20);
            }
            if (aString14 != null) {
                aGraphics22.setColor(Color.white);
                method16(aGraphics22, aString14, aFont19, j + 138, k - 120);
            }
        } catch (Exception _ex) {
        }
    }

    public void method15(int i, String s) {
        try {
            int j = (anInt1 - 281) / 2;
            int k = (anInt2 - 148) / 2;
            j += 2;
            k += 90;
            anInt16 = i;
            aString17 = s;
            int l = (277 * i) / 100;
            aGraphics22.setColor(new Color(132, 132, 132));
            if (aBoolean15)
                aGraphics22.setColor(new Color(220, 0, 0));
            aGraphics22.fillRect(j, k, l, 20);
            aGraphics22.setColor(Color.black);
            aGraphics22.fillRect(j + l, k, 277 - l, 20);
            aGraphics22.setColor(new Color(198, 198, 198));
            if (aBoolean15)
                aGraphics22.setColor(new Color(255, 255, 255));
            method16(aGraphics22, s, aFont18, j + 138, k + 10);
        } catch (Exception _ex) {
        }
    }

    public void method16(Graphics g, String s, Font font, int i, int j) {
        Object obj;
        if (aViewbox_7 == null)
            obj = this;
        else
            obj = aViewbox_7;
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

    public byte[] method18(String s, String s1, int i) {
        System.out.println("Using default load");
        int j = 0;
        int k = 0;
        byte[] abyte0 = null;
        try {
            method15(i, "Loading " + s1 + " - 0%");
            java.io.InputStream inputstream = tools.method340(s);
            DataInputStream datainputstream = new DataInputStream(inputstream);
            byte[] abyte2 = new byte[6];
            datainputstream.readFully(abyte2, 0, 6);
            j = ((abyte2[0] & 0xff) << 16) + ((abyte2[1] & 0xff) << 8) + (abyte2[2] & 0xff);
            k = ((abyte2[3] & 0xff) << 16) + ((abyte2[4] & 0xff) << 8) + (abyte2[5] & 0xff);
            method15(i, "Loading " + s1 + " - 5%");
            int l = 0;
            abyte0 = new byte[k];
            while (l < k) {
                int i1 = k - l;
                if (i1 > 1000)
                    i1 = 1000;
                datainputstream.readFully(abyte0, l, i1);
                l += i1;
                method15(i, "Loading " + s1 + " - " + (5 + (l * 95) / k) + "%");
            }
            datainputstream.close();
        } catch (IOException _ex) {
        }
        method15(i, "Unpacking " + s1);
        if (k != j) {
            byte[] abyte1 = new byte[j];
            bzip2.method306(abyte1, j, abyte0, k, 0);
            return abyte1;
        } else {
            return abyte0;
        }
    }

    public Graphics getGraphics() {
        if (aViewbox_7 != null)
            return aViewbox_7.getGraphics();
        else
            return super.getGraphics();
    }

    public Image createImage(int i, int j) {
        if (aViewbox_7 != null)
            return aViewbox_7.createImage(i, j);
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

    public Socket method19(String s, int i)
            throws IOException {
        Socket socket;
        if (method7())
            socket = new Socket(InetAddress.getByName(getCodeBase().getHost()), i);
        else
            socket = new Socket(InetAddress.getByName(s), i);
        socket.setSoTimeout(30000);
        socket.setTcpNoDelay(true);
        return socket;
    }

    public void method20(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();
    }

    public gameshell() {
        anInt1 = 512;
        anInt2 = 384;
        anInt4 = 20;
        anInt5 = 1000;
        aLongArray6 = new long[10];
        anInt13 = 1;
        aBoolean15 = false;
        aString17 = "Loading";
        aFont18 = new Font("TimesRoman", 0, 15);
        aFont19 = new Font("Helvetica", 1, 13);
        aFont20 = new Font("Helvetica", 0, 12);
        aBoolean24 = false;
        aBoolean25 = false;
        aBoolean26 = false;
        aBoolean27 = false;
        aBoolean28 = false;
        aBoolean29 = false;
        aBoolean30 = false;
        aBoolean31 = false;
        anInt32 = 1;
        aBoolean39 = false;
        aString40 = "";
        aString41 = "";
        aString42 = "";
        aString43 = "";
    }

    public int anInt1;
    public int anInt2;
    public Thread aThread3;
    public int anInt4;
    public int anInt5;
    public long[] aLongArray6;
    public static viewbox aViewbox_7 = null;
    public boolean aBoolean8;
    public int anInt9;
    public int anInt10;
    public int anInt11;
    public int anInt12;
    public int anInt13;
    public String aString14;
    public boolean aBoolean15;
    public int anInt16;
    public String aString17;
    public Font aFont18;
    public Font aFont19;
    public Font aFont20;
    public Image anImage21;
    public Graphics aGraphics22;
    public static String aString23 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\243$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
    public boolean aBoolean24;
    public boolean aBoolean25;
    public boolean aBoolean26;
    public boolean aBoolean27;
    public boolean aBoolean28;
    public boolean aBoolean29;
    public boolean aBoolean30;
    public boolean aBoolean31;
    public int anInt32;
    public int anInt33;
    public int anInt34;
    public int anInt35;
    public int anInt36;
    public int anInt37;
    public int anInt38;
    public boolean aBoolean39;
    public String aString40;
    public String aString41;
    public String aString42;
    public String aString43;

}
