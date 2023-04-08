package jagex;

import java.io.IOException;
import java.math.BigInteger;

// was: a.e
public class stream {

    public stream() {
        encodeKey = 3141592; // pi
        decodeKey = 3141592; // pi
        packetMaxLength = 5000;
        ioerror = false;
        exception = "";
        packetEnd = 3;
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

    public void gdata(int i, int j, byte[] abyte0)
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

    public void gdata(int i, byte[] abyte0)
            throws IOException {
        gdata(i, 0, abyte0);
    }

    public int readPacket(byte[] src) {
        try {
            readTries++;

            if (maxReadTries > 0 && readTries > maxReadTries) {
                ioerror = true;
                exception = "time-out";
                maxReadTries += maxReadTries;
                return 0;
            }

            if (length == 0 && available() >= 2) {
                length = g1();

                if (length >= 160) {
                    length = (length - 160) * 256 + g1();
                }
            }

            if (length > 0 && available() >= length) {
                if (length >= 160) {
                    gdata(length, src);
                } else {
                    src[length - 1] = (byte) g1();

                    if (length > 1) {
                        gdata(length - 1, src);
                    }
                }

                int i = length;
                length = 0;
                readTries = 0;
                return i;
            }
        } catch (IOException ex) {
            ioerror = true;
            this.exception = ex.getMessage();
        }

        return 0;
    }

    public void p1(int value) {
        data[packetEnd++] = (byte) value;
    }

    public void p2(int value) {
        data[packetEnd++] = (byte) (value >> 8);
        data[packetEnd++] = (byte) value;
    }

    public void p4(int value) {
        data[packetEnd++] = (byte) (value >> 24);
        data[packetEnd++] = (byte) (value >> 16);
        data[packetEnd++] = (byte) (value >> 8);
        data[packetEnd++] = (byte) value;
    }

    public void p8(long l) {
        p4((int) (l >> 32));
        p4((int) (l));
    }

    public void pstr(String s) {
        s.getBytes(0, s.length(), data, packetEnd);
        packetEnd += s.length();
    }

    public void pdata(byte[] src, int offset, int length) {
        for (int k = 0; k < length; k++) {
            data[packetEnd++] = src[offset + k];
        }
    }

    public void rsaenc(String password, int sessionId, BigInteger exp, BigInteger mod) {
        byte[] passRaw = password.getBytes();
        int passLength = passRaw.length;

        byte[] block = new byte[15];
        for (int k = 0; k < passLength; k += 7) {
            block[0] = (byte) (int) (1.0D + Math.random() * 127D);
            block[1] = (byte) (int) (Math.random() * 256D);
            block[2] = (byte) (int) (Math.random() * 256D);
            block[3] = (byte) (int) (Math.random() * 256D);
            tools.rotData(block, 4, sessionId);

            for (int l = 0; l < 7; l++) {
                if (k + l < passLength) {
                    block[8 + l] = passRaw[k + l];
                } else {
                    block[8 + l] = ' ';
                }
            }

            BigInteger rawBig = new BigInteger(1, block);
            BigInteger encBig = rawBig.modPow(exp, mod);
            byte[] encRaw = encBig.toByteArray();

            data[packetEnd++] = (byte) encRaw.length;
            System.arraycopy(encRaw, 0, data, packetEnd, encRaw.length);
            packetEnd += encRaw.length;
        }
    }

    public void p1opcode(int opcode, int friend) {
        opcodeFriend = friend;

        if (packetStart > (packetMaxLength * 4) / 5) {
            try {
                writePacket(0);
            } catch (IOException ex) {
                ioerror = true;
                this.exception = ex.getMessage();
            }
        }

        if (data == null) {
            data = new byte[packetMaxLength];
        }

        data[packetStart + 2] = (byte) opcode;
        data[packetStart + 3] = 0;
        packetEnd = packetStart + 3;
        packet8Check = 8;
    }

    public int g1opcode(int opcode, int[] encryption) {
        int real = opcode - decodeKey & 0xff;
        int decoded = encryption[real];

        readThreatIndex = (readThreatIndex + decoded) % SPOOKY_LENGTH;
        char threatChar = SPOOKY_THREAT.charAt(readThreatIndex);
        decodeKey = (decodeKey * 3 + threatChar + decoded) & 0xffff;

        return real;
    }

    public void sendPacket() {
        int opcode = data[packetStart + 2] & 0xff;
        data[packetStart + 2] = (byte) (opcode + encodeKey);

        int encoded = opcodeFriend;
        writeThreatIndex = (writeThreatIndex + encoded) % SPOOKY_LENGTH;
        char threatChar = SPOOKY_THREAT.charAt(writeThreatIndex);
        encodeKey = (encodeKey * 3 + threatChar + encoded) & 0xffff;

        if (packet8Check != 8) {
            packetEnd++;
        }

        int length = packetEnd - packetStart - 2;
        if (length >= 160) {
            data[packetStart] = (byte) (160 + (length / 256));
            data[packetStart + 1] = (byte) (length & 0xff);
        } else {
            data[packetStart] = (byte) length;
            packetEnd--;
            data[packetStart + 1] = data[packetEnd];
        }

        if (packetMaxLength <= 10000) {
            int l = data[packetStart + 2] & 0xff;
            overallPacketCounter[l]++;
            overallPacketSizes[l] += packetEnd - packetStart;
        }

        packetStart = packetEnd;
    }

    public void flush()
            throws IOException {
        sendPacket();
        writePacket(0);
    }

    public void writePacket(int retries)
            throws IOException {
        if (ioerror) {
            packetStart = 0;
            packetEnd = 3;
            ioerror = false;
            throw new IOException(exception);
        }

        writeTries++;
        if (writeTries < retries) {
            return;
        }

        if (packetStart > 0) {
            writeTries = 0;
            write(data, 0, packetStart);
        }

        packetStart = 0;
        packetEnd = 3;
    }

    public boolean hasPacket() {
        return packetStart > 0;
    }

    public static final String SPOOKY_THREAT = "All RuneScape code and data, including this message, are copyright 2003 Jagex Ltd. Unauthorised reproduction in any form is strictly prohibited.  The RuneScape network protocol is copyright 2003 Jagex Ltd and is protected by international copyright laws. The RuneScape network protocol also incorporates a copy protection mechanism to prevent unauthorised access or use of our servers. Attempting to break, bypass or duplicate this mechanism is an infringement of the Digital Millienium Copyright Act and may lead to prosecution. Decompiling, or reverse-engineering the RuneScape code in any way is strictly prohibited. RuneScape and Jagex are registered trademarks of Jagex Ltd. You should not be reading this message, you have been warned...";
    public static final int SPOOKY_LENGTH = SPOOKY_THREAT.length();
    public int writeThreatIndex;
    public int encodeKey;
    public int readThreatIndex;
    public int decodeKey;
    public int opcodeFriend;
    public static int[] overallPacketCounter = new int[256];
    public static int[] overallPacketSizes = new int[256];
    protected int packetMaxLength;
    protected boolean ioerror;
    protected String exception;
    protected int writeTries;
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
    protected int length;
    public int readTries;
    public int maxReadTries;
    public int packetStart;
    public int packetEnd;
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
