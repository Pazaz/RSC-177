package jagex.client;

import jagex.tools;
import jagex.wordfilter4;
import jagex.wordpack;

import java.awt.*;
import java.io.IOException;
import java.math.BigInteger;

// was: a.a.b
public class client extends gameshell {

    public void method21(BigInteger biginteger, BigInteger biginteger1) {
        aBigInteger627 = biginteger;
        aBigInteger628 = biginteger1;
    }

    public int method22() {
        return 0;
    }

    public void method23(String s, String s1, boolean flag) {
        if (anInt630 > 0) {
            method40(aStringArray607[6], aStringArray607[7]);
            try {
                Thread.sleep(2000L);
            } catch (Exception _ex) {
            }
            method40(aStringArray607[8], aStringArray607[9]);
            return;
        }
        try {
            aString612 = s;
            s = tools.method350(s, 20);
            aString613 = s1;
            s1 = tools.method350(s1, 20);
            if (s.trim().length() == 0) {
                method40(aStringArray607[0], aStringArray607[1]);
                return;
            }
            if (flag)
                method26(aStringArray607[2], aStringArray607[3]);
            else
                method40(aStringArray607[6], aStringArray607[7]);
            aClientstream_614 = new clientstream(method19(aString610, anInt611), this);
            aClientstream_614.anInt403 = anInt609;
            int i = aClientstream_614.method324();
            anInt629 = i;
            System.out.println("Session id: " + i);
            int j = 0;
            try {
                if (method7()) {
                    String s2 = getParameter("referid");
                    j = Integer.parseInt(s2);
                    String s3 = getParameter("limit30");
                    if (s3.equals("1"))
                        j += 50;
                }
            } catch (Exception _ex) {
            }
            if (flag)
                aClientstream_614.method334(19, 712);
            else
                aClientstream_614.method334(0, 625);
            aClientstream_614.p2(anInt608);
            aClientstream_614.p2(j);
            aClientstream_614.p8(tools.method353(s));
            aClientstream_614.rsaenc(s1, i, aBigInteger627, aBigInteger628);
            aClientstream_614.p4(method22());
            aClientstream_614.method337();
            aClientstream_614.g1();
            int k = aClientstream_614.g1();
            k = aClientstream_614.method335(k, anIntArray631);
            System.out.println("Login response: " + k);
            if (k == 0) {
                anInt616 = 0;
                method42();
                return;
            }
            if (k == 1) {
                anInt616 = 0;
                method41();
                return;
            }
            if (flag) {
                s = "";
                s1 = "";
                method43();
                return;
            }
            if (k == 3) {
                method40(aStringArray607[10], aStringArray607[11]);
                return;
            }
            if (k == 4) {
                method40(aStringArray607[4], aStringArray607[5]);
                return;
            }
            if (k == 5) {
                method40(aStringArray607[16], aStringArray607[17]);
                return;
            }
            if (k == 6) {
                method40(aStringArray607[18], aStringArray607[19]);
                return;
            }
            if (k == 7) {
                method40(aStringArray607[20], aStringArray607[21]);
                return;
            }
            if (k == 11) {
                method40(aStringArray607[22], aStringArray607[23]);
                return;
            }
            if (k == 12) {
                method40(aStringArray607[24], aStringArray607[25]);
                return;
            }
            if (k == 13) {
                method40(aStringArray607[14], aStringArray607[15]);
                return;
            }
            if (k == 14) {
                method40(aStringArray607[8], aStringArray607[9]);
                anInt630 = 1500;
                return;
            }
            if (k == 15) {
                method40(aStringArray607[26], aStringArray607[27]);
                return;
            }
            if (k == 16) {
                method40(aStringArray607[28], aStringArray607[29]);
                return;
            } else {
                method40(aStringArray607[12], aStringArray607[13]);
                return;
            }
        } catch (Exception exception) {
            System.out.println(exception);
        }
        if (anInt616 > 0) {
            try {
                Thread.sleep(5000L);
            } catch (Exception _ex) {
            }
            anInt616--;
            method23(aString612, aString613, flag);
        }
        if (flag) {
            aString612 = "";
            aString613 = "";
            method43();
        } else {
            method40(aStringArray607[12], aStringArray607[13]);
        }
    }

    public void method24() {
        if (aClientstream_614 != null)
            try {
                aClientstream_614.method334(1, 325);
                aClientstream_614.method337();
            } catch (IOException _ex) {
            }
        aString612 = "";
        aString613 = "";
        method43();
    }

    public void method25() {
        System.out.println("Lost connection");
        anInt616 = 10;
        method23(aString612, aString613, true);
    }

    public void method26(String s, String s1) {
        Graphics g = getGraphics();
        Font font = new Font("Helvetica", 1, 15);
        char c = '\u0200';
        char c1 = '\u0158';
        g.setColor(Color.black);
        g.fillRect(c / 2 - 140, c1 / 2 - 25, 280, 50);
        g.setColor(Color.white);
        g.drawRect(c / 2 - 140, c1 / 2 - 25, 280, 50);
        method16(g, s, font, c / 2, c1 / 2 - 10);
        method16(g, s1, font, c / 2, c1 / 2 + 10);
    }

    public void method27(String s, String s1) {
        if (anInt630 > 0) {
            method40(aStringArray607[6], aStringArray607[7]);
            try {
                Thread.sleep(2000L);
            } catch (Exception _ex) {
            }
            method40(aStringArray607[8], aStringArray607[9]);
            return;
        }
        try {
            s = tools.method350(s, 20);
            s1 = tools.method350(s1, 20);
            method40(aStringArray607[6], aStringArray607[7]);
            aClientstream_614 = new clientstream(method19(aString610, anInt611), this);
            int i = aClientstream_614.method324();
            anInt629 = i;
            System.out.println("Session id: " + i);
            int j = 0;
            try {
                if (method7()) {
                    String s2 = getParameter("referid");
                    j = Integer.parseInt(s2);
                    String s3 = getParameter("limit30");
                    if (s3.equals("1"))
                        j += 50;
                }
            } catch (Exception _ex) {
            }
            aClientstream_614.method334(2, 129);
            aClientstream_614.p2(anInt608);
            aClientstream_614.p8(tools.method353(s));
            aClientstream_614.p2(j);
            aClientstream_614.rsaenc(s1, i, aBigInteger627, aBigInteger628);
            aClientstream_614.p4(method22());
            aClientstream_614.method337();
            aClientstream_614.g1();
            int k = aClientstream_614.g1();
            aClientstream_614.close();
            k = aClientstream_614.method335(k, anIntArray631);
            System.out.println("Newplayer response: " + k);
            if (k == 2) {
                method45();
                return;
            }
            if (k == 3) {
                method40(aStringArray607[14], aStringArray607[15]);
                return;
            }
            if (k == 4) {
                method40(aStringArray607[4], aStringArray607[5]);
                return;
            }
            if (k == 5) {
                method40(aStringArray607[16], aStringArray607[17]);
                return;
            }
            if (k == 6) {
                method40(aStringArray607[18], aStringArray607[19]);
                return;
            }
            if (k == 7) {
                method40(aStringArray607[20], aStringArray607[21]);
                return;
            }
            if (k == 11) {
                method40(aStringArray607[22], aStringArray607[23]);
                return;
            }
            if (k == 12) {
                method40(aStringArray607[24], aStringArray607[25]);
                return;
            }
            if (k == 13) {
                method40(aStringArray607[14], aStringArray607[15]);
                return;
            }
            if (k == 14) {
                method40(aStringArray607[8], aStringArray607[9]);
                anInt630 = 1500;
                return;
            }
            if (k == 15) {
                method40(aStringArray607[26], aStringArray607[27]);
                return;
            }
            if (k == 16) {
                method40(aStringArray607[28], aStringArray607[29]);
                return;
            } else {
                method40(aStringArray607[12], aStringArray607[13]);
                return;
            }
        } catch (Exception exception) {
            System.out.println(exception);
        }
        method40(aStringArray607[12], aStringArray607[13]);
    }

    public void method28() {
        long l = System.currentTimeMillis();
        if (aClientstream_614.method339())
            aLong617 = l;
        if (l - aLong617 > 5000L) {
            aLong617 = l;
            aClientstream_614.method334(5, 348);
            aClientstream_614.method336();
        }
        try {
            aClientstream_614.method338(20);
        } catch (IOException _ex) {
            method25();
            return;
        }
        if (!method48())
            return;
        int i = aClientstream_614.method326(aByteArray615);
        if (i > 0)
            method29(aByteArray615[0] & 0xff, i);
    }

    public void method29(int i, int j) {
        i = aClientstream_614.method335(i, anIntArray631);
        if (i == 8) {
            String s = new String(aByteArray615, 1, j - 1);
            method47(s);
        }
        if (i == 9)
            method24();
        if (i == 10) {
            method44();
            return;
        }
        if (i == 23) {
            anInt618 = tools.method343(aByteArray615[1]);
            for (int k = 0; k < anInt618; k++) {
                aLongArray619[k] = tools.method346(aByteArray615, 2 + k * 9);
                anIntArray620[k] = tools.method343(aByteArray615[10 + k * 9]);
            }

            method30();
            return;
        }
        if (i == 24) {
            long l = tools.method346(aByteArray615, 1);
            int j1 = aByteArray615[9] & 0xff;
            for (int k1 = 0; k1 < anInt618; k1++)
                if (aLongArray619[k1] == l) {
                    if (anIntArray620[k1] == 0 && j1 != 0)
                        method47("@pri@" + tools.method354(l) + " has logged in");
                    if (anIntArray620[k1] != 0 && j1 == 0)
                        method47("@pri@" + tools.method354(l) + " has logged out");
                    anIntArray620[k1] = j1;
                    j = 0;
                    method30();
                    return;
                }

            aLongArray619[anInt618] = l;
            anIntArray620[anInt618] = j1;
            anInt618++;
            method47("@pri@" + tools.method354(l) + " has been added to your friends list");
            method30();
            return;
        }
        if (i == 26) {
            anInt621 = tools.method343(aByteArray615[1]);
            for (int i1 = 0; i1 < anInt621; i1++)
                aLongArray622[i1] = tools.method346(aByteArray615, 2 + i1 * 8);

            return;
        }
        if (i == 27) {
            anInt623 = aByteArray615[1];
            anInt624 = aByteArray615[2];
            anInt625 = aByteArray615[3];
            anInt626 = aByteArray615[4];
            return;
        }
        if (i == 28) {
            long l1 = tools.method346(aByteArray615, 1);
            String s1 = wordfilter4.method365(wordpack.method390(aByteArray615, 9, j - 9));
            method47("@pri@" + tools.method354(l1) + ": tells you " + s1);
        } else {
            method46(i, j, aByteArray615);
        }
    }

    public void method30() {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < anInt618 - 1; i++)
                if (anIntArray620[i] < anIntArray620[i + 1]) {
                    int j = anIntArray620[i];
                    anIntArray620[i] = anIntArray620[i + 1];
                    anIntArray620[i + 1] = j;
                    long l = aLongArray619[i];
                    aLongArray619[i] = aLongArray619[i + 1];
                    aLongArray619[i + 1] = l;
                    flag = true;
                }

        }
    }

    public void method31(String s, String s1) {
        s = tools.method350(s, 20);
        s1 = tools.method350(s1, 20);
        aClientstream_614.method334(25, 551);
        aClientstream_614.rsaenc(s + s1, anInt629, aBigInteger627, aBigInteger628);
        aClientstream_614.method336();
    }

    public void method32(int i, int j, int k, int l) {
        aClientstream_614.method334(31, 777);
        aClientstream_614.p1(i);
        aClientstream_614.p1(j);
        aClientstream_614.p1(k);
        aClientstream_614.p1(l);
        aClientstream_614.method336();
    }

    public void method33(String s) {
        long l = tools.method353(s);
        aClientstream_614.method334(29, 101);
        aClientstream_614.p8(l);
        aClientstream_614.method336();
        for (int i = 0; i < anInt621; i++)
            if (aLongArray622[i] == l)
                return;

        if (anInt621 >= 50) {
        } else {
            aLongArray622[anInt621++] = l;
        }
    }

    public void method34(long l) {
        aClientstream_614.method334(30, 511);
        aClientstream_614.p8(l);
        aClientstream_614.method336();
        for (int i = 0; i < anInt621; i++)
            if (aLongArray622[i] == l) {
                anInt621--;
                for (int j = i; j < anInt621; j++)
                    aLongArray622[j] = aLongArray622[j + 1];

                return;
            }

    }

    public void method35(String s) {
        aClientstream_614.method334(26, 622);
        aClientstream_614.p8(tools.method353(s));
        aClientstream_614.method336();
    }

    public void method36(long l) {
        aClientstream_614.method334(27, 707);
        aClientstream_614.p8(l);
        aClientstream_614.method336();
        for (int i = 0; i < anInt618; i++) {
            if (aLongArray619[i] != l)
                continue;
            anInt618--;
            for (int j = i; j < anInt618; j++) {
                aLongArray619[j] = aLongArray619[j + 1];
                anIntArray620[j] = anIntArray620[j + 1];
            }

            break;
        }

        method47("@pri@" + tools.method354(l) + " has been removed from your friends list");
    }

    public void method37(long l, byte[] abyte0, int i) {
        aClientstream_614.method334(28, 185);
        aClientstream_614.p8(l);
        aClientstream_614.pdata(abyte0, 0, i);
        aClientstream_614.method336();
    }

    public void method38(byte[] abyte0, int i) {
        aClientstream_614.method334(3, 643);
        aClientstream_614.pdata(abyte0, 0, i);
        aClientstream_614.method336();
    }

    public void method39(String s) {
        aClientstream_614.method334(7, 293);
        aClientstream_614.pstr(s);
        aClientstream_614.method336();
    }

    public void method40(String s, String s1) {
    }

    public void method41() {
    }

    public void method42() {
    }

    public void method43() {
    }

    public void method44() {
    }

    public void method45() {
    }

    public void method46(int i, int j, byte[] abyte0) {
    }

    public void method47(String s) {
    }

    public boolean method48() {
        return true;
    }

    public client() {
        aString610 = "127.0.0.1";
        anInt611 = 43594;
        aString612 = "";
        aString613 = "";
        aByteArray615 = new byte[5000];
        aLongArray619 = new long[100];
        anIntArray620 = new int[100];
        aLongArray622 = new long[50];
    }

    public static String[] aStringArray607;
    public static int anInt608 = 1;
    public static int anInt609;
    public String aString610;
    public int anInt611;
    public String aString612;
    public String aString613;
    public clientstream aClientstream_614;
    public byte[] aByteArray615;
    public int anInt616;
    public long aLong617;
    public int anInt618;
    public long[] aLongArray619;
    public int[] anIntArray620;
    public int anInt621;
    public long[] aLongArray622;
    public int anInt623;
    public int anInt624;
    public int anInt625;
    public int anInt626;
    public BigInteger aBigInteger627;
    public BigInteger aBigInteger628;
    public int anInt629;
    public int anInt630;
    public static final int[] anIntArray631 = {
            124, 345, 953, 124, 634, 636, 661, 127, 177, 295,
            559, 384, 321, 679, 871, 592, 679, 347, 926, 585,
            681, 195, 785, 679, 818, 115, 226, 799, 925, 852,
            194, 966, 32, 3, 4, 5, 6, 7, 8, 9,
            40, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            50, 444, 52, 3, 4, 5, 6, 7, 8, 9,
            60, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            70, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            80, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            90, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            100, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            110, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            120, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            130, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            140, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            150, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            160, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            170, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            180, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            694, 235, 846, 834, 300, 200, 298, 278, 247, 286,
            346, 144, 23, 913, 812, 765, 432, 176, 935, 452,
            542, 45, 346, 65, 637, 62, 354, 123, 34, 912,
            812, 834, 698, 324, 872, 912, 438, 765, 344, 731,
            625, 783, 176, 658, 128, 854, 489, 85, 6, 865,
            43, 573, 132, 527, 235, 434, 658, 912, 825, 298,
            753, 282, 652, 439, 629, 945
    };

    static {
        aStringArray607 = new String[50];
        aStringArray607[0] = "You must enter both a username";
        aStringArray607[1] = "and a password - Please try again";
        aStringArray607[2] = "Connection lost! Please wait...";
        aStringArray607[3] = "Attempting to re-establish";
        aStringArray607[4] = "That username is already in use.";
        aStringArray607[5] = "Wait 60 seconds then retry";
        aStringArray607[6] = "Please wait...";
        aStringArray607[7] = "Connecting to server";
        aStringArray607[8] = "Sorry! The server is currently full.";
        aStringArray607[9] = "Please try again later";
        aStringArray607[10] = "Invalid username or password.";
        aStringArray607[11] = "Try again, or create a new account";
        aStringArray607[12] = "Sorry! Unable to connect to server.";
        aStringArray607[13] = "Check your internet settings";
        aStringArray607[14] = "Username already taken.";
        aStringArray607[15] = "Please choose another username";
        aStringArray607[16] = "The client has been updated.";
        aStringArray607[17] = "Please reload this page";
        aStringArray607[18] = "You may only use 1 character at once.";
        aStringArray607[19] = "Your ip-address is already in use";
        aStringArray607[20] = "Login attempts exceeded!";
        aStringArray607[21] = "Please try again in 5 minutes";
        aStringArray607[22] = "Account has been temporarily disabled";
        aStringArray607[23] = "check your message inbox for details";
        aStringArray607[24] = "Account has been permanently disabled";
        aStringArray607[25] = "check your message inbox for details";
        aStringArray607[26] = "You need a members account";
        aStringArray607[27] = "to login to this server";
        aStringArray607[28] = "Please login to a members server";
        aStringArray607[29] = "to access member-only features";
    }
}
