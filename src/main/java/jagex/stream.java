package jagex;

import java.io.IOException;
import java.math.BigInteger;

// was: a.e
public class stream {

    public stream() {
        encryptionOut = 3141592; // pi
        encyptionIn = 3141592; // pi
        packetMaxLength = 5000;
        ioerror = false;
        exception = "";
        pos = 3;
        packet8Check = 8;
    }

    public void close() {
    }

    public int g1()
            throws IOException {
        return 0;
    }

    public int available()
            throws IOException {
        return 0;
    }

    public void g1(int i, int j, byte[] abyte0)
            throws IOException {
    }

    public void write(byte[] abyte0, int i, int j)
            throws IOException {
    }

    // this one might as well not exist!
//    public int g1_0()
//            throws IOException {
//        return g1();
//    }

    public int g2()
            throws IOException {
        int i = g1();
        int j = g1();
        return i * 256 + j;
    }

    public int g4()
            throws IOException {
        int i = g2();
        int j = g2();
        return i * 0x10000 + j;
    }

    public void method325(int i, byte[] abyte0)
            throws IOException {
        g1(i, 0, abyte0);
    }

    public int method326(byte[] abyte0) {
        try {
            anInt402++;
            if (maxReadTries > 0 && anInt402 > maxReadTries) {
                ioerror = true;
                exception = "time-out";
                maxReadTries += maxReadTries;
                return 0;
            }
            if (anInt401 == 0 && available() >= 2) {
                anInt401 = g1();
                if (anInt401 >= 160)
                    anInt401 = (anInt401 - 160) * 256 + g1();
            }
            if (anInt401 > 0 && available() >= anInt401) {
                if (anInt401 >= 160) {
                    method325(anInt401, abyte0);
                } else {
                    abyte0[anInt401 - 1] = (byte) g1();
                    if (anInt401 > 1)
                        method325(anInt401 - 1, abyte0);
                }
                int i = anInt401;
                anInt401 = 0;
                anInt402 = 0;
                return i;
            }
        } catch (IOException ioexception) {
            ioerror = true;
            this.exception = ioexception.getMessage();
        }
        return 0;
    }

    public void p1(int i) {
        data[pos++] = (byte) i;
    }

    public void p2(int i) {
        data[pos++] = (byte) (i >> 8);
        data[pos++] = (byte) i;
    }

    public void p4(int i) {
        data[pos++] = (byte) (i >> 24);
        data[pos++] = (byte) (i >> 16);
        data[pos++] = (byte) (i >> 8);
        data[pos++] = (byte) i;
    }

    public void p8(long l) {
        p4((int) (l >> 32));
        p4((int) (l));
    }

    public void pstr(String s) {
        s.getBytes(0, s.length(), data, pos);
        pos += s.length();
    }

    public void pdata(byte[] src, int offset, int length) {
        for (int k = 0; k < length; k++)
            data[pos++] = src[offset + k];

    }

    public void rsaenc(String password, int sessionId, BigInteger exp, BigInteger mod) {
        byte[] passRaw = password.getBytes();
        int passLength = passRaw.length;

        byte[] abyte1 = new byte[15];
        for (int k = 0; k < passLength; k += 7) {
            abyte1[0] = (byte) (int) (1.0D + Math.random() * 127D);
            abyte1[1] = (byte) (int) (Math.random() * 256D);
            abyte1[2] = (byte) (int) (Math.random() * 256D);
            abyte1[3] = (byte) (int) (Math.random() * 256D);

            tools.method342(abyte1, 4, sessionId);
            for (int l = 0; l < 7; l++)
                if (k + l < passLength)
                    abyte1[8 + l] = passRaw[k + l];
                else
                    abyte1[8 + l] = ' ';

            BigInteger biginteger2 = new BigInteger(1, abyte1);
            BigInteger biginteger3 = biginteger2.modPow(exp, mod);
            byte[] abyte2 = biginteger3.toByteArray();

            data[pos++] = (byte) abyte2.length;
            for (int i1 = 0; i1 < abyte2.length; i1++)
                data[pos++] = abyte2[i1];
        }
    }

    public void p1opcode(int opcode, int j) {
        anInt381 = j;
        if (packetStart > (packetMaxLength * 4) / 5)
            try {
                writePacket(0);
            } catch (IOException ex) {
                ioerror = true;
                this.exception = ex.getMessage();
            }
        if (data == null)
            data = new byte[packetMaxLength];
        data[packetStart + 2] = (byte) opcode;
        data[packetStart + 3] = 0;
        pos = packetStart + 3;
        packet8Check = 8;
    }

    public int method335(int i, int[] ai) {
        int j = i - encyptionIn & 0xff;
        int k = ai[j];
        anInt379 = (anInt379 + k) % anInt376;
        char c = "All RuneScape code and data, including this message, are copyright 2003 Jagex Ltd. Unauthorised reproduction in any form is strictly prohibited.  The RuneScape network protocol is copyright 2003 Jagex Ltd and is protected by international copyright laws. The RuneScape network protocol also incorporates a copy protection mechanism to prevent unauthorised access or use of our servers. Attempting to break, bypass or duplicate this mechanism is an infringement of the Digital Millienium Copyright Act and may lead to prosecution. Decompiling, or reverse-engineering the RuneScape code in any way is strictly prohibited. RuneScape and Jagex are registered trademarks of Jagex Ltd. You should not be reading this message, you have been warned...".charAt(anInt379);
        encyptionIn = encyptionIn * 3 + c + k & 0xffff;
        return j;
    }

    public void sendPacket() {
        int i = data[packetStart + 2] & 0xff;
        data[packetStart + 2] = (byte) (i + encryptionOut);

        int j = anInt381;
        anInt377 = (anInt377 + j) % anInt376;
        char c = "All RuneScape code and data, including this message, are copyright 2003 Jagex Ltd. Unauthorised reproduction in any form is strictly prohibited.  The RuneScape network protocol is copyright 2003 Jagex Ltd and is protected by international copyright laws. The RuneScape network protocol also incorporates a copy protection mechanism to prevent unauthorised access or use of our servers. Attempting to break, bypass or duplicate this mechanism is an infringement of the Digital Millienium Copyright Act and may lead to prosecution. Decompiling, or reverse-engineering the RuneScape code in any way is strictly prohibited. RuneScape and Jagex are registered trademarks of Jagex Ltd. You should not be reading this message, you have been warned...".charAt(anInt377);
        encryptionOut = encryptionOut * 3 + c + j & 0xffff;

        if (packet8Check != 8)
            pos++;

        int k = pos - packetStart - 2;
        if (k >= 160) {
            data[packetStart] = (byte) (160 + k / 256);
            data[packetStart + 1] = (byte) (k & 0xff);
        } else {
            data[packetStart] = (byte) k;
            pos--;
            data[packetStart + 1] = data[pos];
        }

        if (packetMaxLength <= 10000) {
            int l = data[packetStart + 2] & 0xff;
            anIntArray382[l]++;
            anIntArray383[l] += pos - packetStart;
        }

        packetStart = pos;
    }

    public void flush()
            throws IOException {
        sendPacket();
        writePacket(0);
    }

    public void writePacket(int i)
            throws IOException {
        if (ioerror) {
            packetStart = 0;
            pos = 3;
            ioerror = false;
            throw new IOException(exception);
        }
        anInt387++;
        if (anInt387 < i)
            return;
        if (packetStart > 0) {
            anInt387 = 0;
            write(data, 0, packetStart);
        }
        packetStart = 0;
        pos = 3;
    }

    public boolean method339() {
        return packetStart > 0;
    }

    public static final int anInt376 = "All RuneScape code and data, including this message, are copyright 2003 Jagex Ltd. Unauthorised reproduction in any form is strictly prohibited.  The RuneScape network protocol is copyright 2003 Jagex Ltd and is protected by international copyright laws. The RuneScape network protocol also incorporates a copy protection mechanism to prevent unauthorised access or use of our servers. Attempting to break, bypass or duplicate this mechanism is an infringement of the Digital Millienium Copyright Act and may lead to prosecution. Decompiling, or reverse-engineering the RuneScape code in any way is strictly prohibited. RuneScape and Jagex are registered trademarks of Jagex Ltd. You should not be reading this message, you have been warned...".length();
    public int anInt377;
    public int encryptionOut;
    public int anInt379;
    public int encyptionIn;
    public int anInt381;
    public static int[] anIntArray382 = new int[256];
    public static int[] anIntArray383 = new int[256];
    protected int packetMaxLength;
    protected boolean ioerror;
    protected String exception;
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
    public int maxReadTries;
    public int packetStart;
    public int pos;
    public int packet8Check;
    public byte[] data;
    public static int[] BITMASK = {
            0, 1, 3, 7, 0xf, 0x1f, 0x3f, 0x7f, 0xff, 0x1ff,
            0x3ff, 0x7ff, 0xfff, 0x1fff, 0x3fff, 0x7fff, 0xffff, 0x1ffff, 0x3ffff, 0x7ffff,
            0xfffff, 0x1fffff, 0x3fffff, 0x7fffff, 0xffffff, 0x1ffffff, 0x3ffffff, 0x7ffffff, 0xfffffff, 0x1fffffff,
            0x3fffffff, 0x7fffffff, 0xffffffff
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
