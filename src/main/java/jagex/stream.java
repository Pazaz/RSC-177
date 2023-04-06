package jagex;

import java.io.IOException;
import java.math.BigInteger;

// was: a.e
public class stream {

    public stream() {
        anInt378 = 0x2fefd8;
        anInt380 = 0x2fefd8;
        anInt384 = 5000;
        aBoolean385 = false;
        aString386 = "";
        anInt405 = 3;
        anInt406 = 8;
    }

    public void method317() {
    }

    public int method318()
            throws IOException {
        return 0;
    }

    public int method319()
            throws IOException {
        return 0;
    }

    public void method320(int i, int j, byte[] abyte0)
            throws IOException {
    }

    public void method321(byte[] abyte0, int i, int j)
            throws IOException {
    }

    public int method322()
            throws IOException {
        return method318();
    }

    public int method323()
            throws IOException {
        int i = method322();
        int j = method322();
        return i * 256 + j;
    }

    public int method324()
            throws IOException {
        int i = method323();
        int j = method323();
        return i * 0x10000 + j;
    }

    public void method325(int i, byte[] abyte0)
            throws IOException {
        method320(i, 0, abyte0);
    }

    public int method326(byte[] abyte0) {
        try {
            anInt402++;
            if (anInt403 > 0 && anInt402 > anInt403) {
                aBoolean385 = true;
                aString386 = "time-out";
                anInt403 += anInt403;
                return 0;
            }
            if (anInt401 == 0 && method319() >= 2) {
                anInt401 = method318();
                if (anInt401 >= 160)
                    anInt401 = (anInt401 - 160) * 256 + method318();
            }
            if (anInt401 > 0 && method319() >= anInt401) {
                if (anInt401 >= 160) {
                    method325(anInt401, abyte0);
                } else {
                    abyte0[anInt401 - 1] = (byte) method318();
                    if (anInt401 > 1)
                        method325(anInt401 - 1, abyte0);
                }
                int i = anInt401;
                anInt401 = 0;
                anInt402 = 0;
                return i;
            }
        } catch (IOException ioexception) {
            aBoolean385 = true;
            aString386 = ioexception.getMessage();
        }
        return 0;
    }

    public void p1(int i) {
        aByteArray407[anInt405++] = (byte) i;
    }

    public void p2(int i) {
        aByteArray407[anInt405++] = (byte) (i >> 8);
        aByteArray407[anInt405++] = (byte) i;
    }

    public void p4(int i) {
        aByteArray407[anInt405++] = (byte) (i >> 24);
        aByteArray407[anInt405++] = (byte) (i >> 16);
        aByteArray407[anInt405++] = (byte) (i >> 8);
        aByteArray407[anInt405++] = (byte) i;
    }

    public void p8(long l) {
        p4((int) (l >> 32));
        p4((int) (l & -1L));
    }

    public void pstr(String s) {
        s.getBytes(0, s.length(), aByteArray407, anInt405);
        anInt405 += s.length();
    }

    public void pdata(byte[] abyte0, int i, int j) {
        for (int k = 0; k < j; k++)
            aByteArray407[anInt405++] = abyte0[i + k];

    }

    public void rsaenc(String s, int i, BigInteger biginteger, BigInteger biginteger1) {
        byte[] abyte0 = s.getBytes();
        int j = abyte0.length;
        byte[] abyte1 = new byte[15];
        for (int k = 0; k < j; k += 7) {
            abyte1[0] = (byte) (int) (1.0D + Math.random() * 127D);
            abyte1[1] = (byte) (int) (Math.random() * 256D);
            abyte1[2] = (byte) (int) (Math.random() * 256D);
            abyte1[3] = (byte) (int) (Math.random() * 256D);
            tools.method342(abyte1, 4, i);
            for (int l = 0; l < 7; l++)
                if (k + l < j)
                    abyte1[8 + l] = abyte0[k + l];
                else
                    abyte1[8 + l] = 32;

            BigInteger biginteger2 = new BigInteger(1, abyte1);
            BigInteger biginteger3 = biginteger2.modPow(biginteger, biginteger1);
            byte[] abyte2 = biginteger3.toByteArray();
            aByteArray407[anInt405++] = (byte) abyte2.length;
            for (int i1 = 0; i1 < abyte2.length; i1++)
                aByteArray407[anInt405++] = abyte2[i1];

        }

    }

    public void method334(int i, int j) {
        anInt381 = j;
        if (anInt404 > (anInt384 * 4) / 5)
            try {
                method338(0);
            } catch (IOException ioexception) {
                aBoolean385 = true;
                aString386 = ioexception.getMessage();
            }
        if (aByteArray407 == null)
            aByteArray407 = new byte[anInt384];
        aByteArray407[anInt404 + 2] = (byte) i;
        aByteArray407[anInt404 + 3] = 0;
        anInt405 = anInt404 + 3;
        anInt406 = 8;
    }

    public int method335(int i, int[] ai) {
        int j = i - anInt380 & 0xff;
        int k = ai[j];
        anInt379 = (anInt379 + k) % anInt376;
        char c = "All RuneScape code and data, including this message, are copyright 2003 Jagex Ltd. Unauthorised reproduction in any form is strictly prohibited.  The RuneScape network protocol is copyright 2003 Jagex Ltd and is protected by international copyright laws. The RuneScape network protocol also incorporates a copy protection mechanism to prevent unauthorised access or use of our servers. Attempting to break, bypass or duplicate this mechanism is an infringement of the Digital Millienium Copyright Act and may lead to prosecution. Decompiling, or reverse-engineering the RuneScape code in any way is strictly prohibited. RuneScape and Jagex are registered trademarks of Jagex Ltd. You should not be reading this message, you have been warned...".charAt(anInt379);
        anInt380 = anInt380 * 3 + c + k & 0xffff;
        return j;
    }

    public void method336() {
        int i = aByteArray407[anInt404 + 2] & 0xff;
        aByteArray407[anInt404 + 2] = (byte) (i + anInt378);
        int j = anInt381;
        anInt377 = (anInt377 + j) % anInt376;
        char c = "All RuneScape code and data, including this message, are copyright 2003 Jagex Ltd. Unauthorised reproduction in any form is strictly prohibited.  The RuneScape network protocol is copyright 2003 Jagex Ltd and is protected by international copyright laws. The RuneScape network protocol also incorporates a copy protection mechanism to prevent unauthorised access or use of our servers. Attempting to break, bypass or duplicate this mechanism is an infringement of the Digital Millienium Copyright Act and may lead to prosecution. Decompiling, or reverse-engineering the RuneScape code in any way is strictly prohibited. RuneScape and Jagex are registered trademarks of Jagex Ltd. You should not be reading this message, you have been warned...".charAt(anInt377);
        anInt378 = anInt378 * 3 + c + j & 0xffff;
        if (anInt406 != 8)
            anInt405++;
        int k = anInt405 - anInt404 - 2;
        if (k >= 160) {
            aByteArray407[anInt404] = (byte) (160 + k / 256);
            aByteArray407[anInt404 + 1] = (byte) (k & 0xff);
        } else {
            aByteArray407[anInt404] = (byte) k;
            anInt405--;
            aByteArray407[anInt404 + 1] = aByteArray407[anInt405];
        }
        if (anInt384 <= 10000) {
            int l = aByteArray407[anInt404 + 2] & 0xff;
            anIntArray382[l]++;
            anIntArray383[l] += anInt405 - anInt404;
        }
        anInt404 = anInt405;
    }

    public void method337()
            throws IOException {
        method336();
        method338(0);
    }

    public void method338(int i)
            throws IOException {
        if (aBoolean385) {
            anInt404 = 0;
            anInt405 = 3;
            aBoolean385 = false;
            throw new IOException(aString386);
        }
        anInt387++;
        if (anInt387 < i)
            return;
        if (anInt404 > 0) {
            anInt387 = 0;
            method321(aByteArray407, 0, anInt404);
        }
        anInt404 = 0;
        anInt405 = 3;
    }

    public boolean method339() {
        return anInt404 > 0;
    }

    public static final int anInt376 = "All RuneScape code and data, including this message, are copyright 2003 Jagex Ltd. Unauthorised reproduction in any form is strictly prohibited.  The RuneScape network protocol is copyright 2003 Jagex Ltd and is protected by international copyright laws. The RuneScape network protocol also incorporates a copy protection mechanism to prevent unauthorised access or use of our servers. Attempting to break, bypass or duplicate this mechanism is an infringement of the Digital Millienium Copyright Act and may lead to prosecution. Decompiling, or reverse-engineering the RuneScape code in any way is strictly prohibited. RuneScape and Jagex are registered trademarks of Jagex Ltd. You should not be reading this message, you have been warned...".length();
    public int anInt377;
    public int anInt378;
    public int anInt379;
    public int anInt380;
    public int anInt381;
    public static int[] anIntArray382 = new int[256];
    public static int[] anIntArray383 = new int[256];
    protected int anInt384;
    protected boolean aBoolean385;
    protected String aString386;
    protected int anInt387;
    public final int anInt388 = 61;
    public final int anInt389 = 59;
    public final int anInt390 = 42;
    public final int anInt391 = 43;
    public final int anInt392 = 44;
    public final int anInt393 = 45;
    public final int anInt394 = 46;
    public final int anInt395 = 47;
    public final int anInt396 = 92;
    public final int anInt397 = 32;
    public final int anInt398 = 124;
    public final int anInt399 = 34;
    public static char[] aCharArray400;
    protected int anInt401;
    public int anInt402;
    public int anInt403;
    public int anInt404;
    public int anInt405;
    public int anInt406;
    public byte[] aByteArray407;
    public static int[] anIntArray408 = {
            0, 1, 3, 7, 15, 31, 63, 127, 255, 511,
            1023, 2047, 4095, 8191, 16383, 32767, 65535, 0x1ffff, 0x3ffff, 0x7ffff,
            0xfffff, 0x1fffff, 0x3fffff, 0x7fffff, 0xffffff, 0x1ffffff, 0x3ffffff, 0x7ffffff, 0xfffffff, 0x1fffffff,
            0x3fffffff, 0x7fffffff, -1
    };
    public static int anInt409;

    static {
        aCharArray400 = new char[256];
        for (int i = 0; i < 256; i++)
            aCharArray400[i] = (char) i;

        aCharArray400[61] = '=';
        aCharArray400[59] = ';';
        aCharArray400[42] = '*';
        aCharArray400[43] = '+';
        aCharArray400[44] = ',';
        aCharArray400[45] = '-';
        aCharArray400[46] = '.';
        aCharArray400[47] = '/';
        aCharArray400[92] = '\\';
        aCharArray400[124] = '|';
        aCharArray400[33] = '!';
        aCharArray400[34] = '"';
    }
}
