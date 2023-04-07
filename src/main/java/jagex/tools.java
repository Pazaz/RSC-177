package jagex;

import java.io.*;
import java.net.URL;

// was: a.f
public class tools {

    public static InputStream openFile(String name)
            throws IOException {
        Object obj;
        if (codeBase == null) {
            obj = new BufferedInputStream(new FileInputStream(name));
        } else {
            URL url = new URL(codeBase, name);
            obj = url.openStream();
        }
        return ((InputStream) (obj));
    }

    public static void downloadFile(String name, byte[] dest, int length)
            throws IOException {
        InputStream inputstream = openFile(name);
        DataInputStream datainputstream = new DataInputStream(inputstream);
        try {
            datainputstream.readFully(dest, 0, length);
        } catch (EOFException _ex) {
        }
        datainputstream.close();
    }

    public static void method342(byte[] data, int i, int j) {
        data[i] = (byte) (j >> 24);
        data[i + 1] = (byte) (j >> 16);
        data[i + 2] = (byte) (j >> 8);
        data[i + 3] = (byte) j;
    }

    public static int g1(byte value) {
        return value & 0xff;
    }

    public static int g2(byte[] src, int off) {
        return ((src[off] & 0xff) << 8) + (src[off + 1] & 0xff);
    }

    public static int g4(byte[] src, int off) {
        return ((src[off] & 0xff) << 24) + ((src[off + 1] & 0xff) << 16) + ((src[off + 2] & 0xff) << 8) + (src[off + 3] & 0xff);
    }

    public static long g8(byte[] src, int i) {
        return (((long) g4(src, i) & 0xffffffffL) << 32) + ((long) g4(src, i + 4) & 0xffffffffL);
    }

    public static int g2s(byte[] src, int off) {
        int value = g1(src[off]) * 256 + g1(src[off + 1]);
        if (value > 32767)
            value -= 0x10000;
        return value;
    }

    public static int method348(byte[] src, int off) {
        if ((src[off] & 0xff) < 128)
            return src[off];
        else
            return ((src[off] & 0xff) - 128 << 24) + ((src[off + 1] & 0xff) << 16) + ((src[off + 2] & 0xff) << 8) + (src[off + 3] & 0xff);
    }

    public static int gBit(byte[] src, int bitPos, int n) {
        int bytePos = bitPos >> 3;
        int remainder = 8 - (bitPos & 7);
        int value = 0;
        for (; n > remainder; remainder = 8) {
            value += (src[bytePos++] & BITMASK[remainder]) << n - remainder;
            n -= remainder;
        }

        if (n == remainder)
            value += src[bytePos] & BITMASK[remainder];
        else
            value += src[bytePos] >> remainder - n & BITMASK[n];
        return value;
    }

    public static String formatAuthString(String s, int i) {
        String s1 = "";
        for (int j = 0; j < i; j++)
            if (j >= s.length()) {
                s1 = s1 + " ";
            } else {
                char c = s.charAt(j);
                if (c >= 'a' && c <= 'z')
                    s1 = s1 + c;
                else if (c >= 'A' && c <= 'Z')
                    s1 = s1 + c;
                else if (c >= '0' && c <= '9')
                    s1 = s1 + c;
                else
                    s1 = s1 + '_';
            }

        return s1;
    }

    public static String formatAlphaOnly(String s, int i) {
        s = s.toLowerCase();
        String s1 = "";
        for (int j = 0; j < s.length() && j < i; j++) {
            char c = s.charAt(j);
            if (c >= 'a' && c <= 'z')
                s1 = s1 + c;
            if (c >= '0' && c <= '9')
                s1 = s1 + c;
        }

        return s1;
    }

    public static String formatIPv4(int ip) {
        return (ip >> 24 & 0xff) + "." + (ip >> 16 & 0xff) + "." + (ip >> 8 & 0xff) + "." + (ip & 0xff);
    }

    public static long toBase37(String name) {
        String s1 = "";
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c >= 'a' && c <= 'z')
                s1 = s1 + c;
            else if (c >= 'A' && c <= 'Z')
                s1 = s1 + (char) ((c + 97) - 65);
            else if (c >= '0' && c <= '9')
                s1 = s1 + c;
            else
                s1 = s1 + ' ';
        }

        s1 = s1.trim();
        if (s1.length() > 12)
            s1 = s1.substring(0, 12);
        long l = 0L;
        for (int j = 0; j < s1.length(); j++) {
            char c1 = s1.charAt(j);
            l *= 37L;
            if (c1 >= 'a' && c1 <= 'z')
                l += (1 + c1) - 97;
            else if (c1 >= '0' && c1 <= '9')
                l += (27 + c1) - 48;
        }

        return l;
    }

    public static String fromBase37(long name37) {
        if (name37 < 0L)
            return "invalid_name";
        String s = "";
        while (name37 != 0L) {
            int i = (int) (name37 % 37L);
            name37 /= 37L;
            if (i == 0)
                s = " " + s;
            else if (i < 27) {
                if (name37 % 37L == 0L)
                    s = (char) ((i + 65) - 1) + s;
                else
                    s = (char) ((i + 97) - 1) + s;
            } else {
                s = (char) ((i + 48) - 27) + s;
            }
        }
        return s;
    }

    public static int getDataFileOffset(String s, byte[] abyte0) {
        int i = g2(abyte0, 0);
        int j = 0;
        s = s.toUpperCase();
        for (int k = 0; k < s.length(); k++)
            j = (j * 61 + s.charAt(k)) - 32;

        int l = 2 + i * 10;
        for (int i1 = 0; i1 < i; i1++) {
            int j1 = (abyte0[i1 * 10 + 2] & 0xff) * 0x1000000 + (abyte0[i1 * 10 + 3] & 0xff) * 0x10000 + (abyte0[i1 * 10 + 4] & 0xff) * 256 + (abyte0[i1 * 10 + 5] & 0xff);
            int k1 = (abyte0[i1 * 10 + 9] & 0xff) * 0x10000 + (abyte0[i1 * 10 + 10] & 0xff) * 256 + (abyte0[i1 * 10 + 11] & 0xff);
            if (j1 == j)
                return l;
            l += k1;
        }

        return 0;
    }

    public static int getDataFileLength(String s, byte[] abyte0) {
        int i = g2(abyte0, 0);
        int j = 0;
        s = s.toUpperCase();
        for (int k = 0; k < s.length(); k++)
            j = (j * 61 + s.charAt(k)) - 32;

        int l = 2 + i * 10;
        for (int i1 = 0; i1 < i; i1++) {
            int j1 = (abyte0[i1 * 10 + 2] & 0xff) * 0x1000000 + (abyte0[i1 * 10 + 3] & 0xff) * 0x10000 + (abyte0[i1 * 10 + 4] & 0xff) * 256 + (abyte0[i1 * 10 + 5] & 0xff);
            int k1 = (abyte0[i1 * 10 + 6] & 0xff) * 0x10000 + (abyte0[i1 * 10 + 7] & 0xff) * 256 + (abyte0[i1 * 10 + 8] & 0xff);
            int l1 = (abyte0[i1 * 10 + 9] & 0xff) * 0x10000 + (abyte0[i1 * 10 + 10] & 0xff) * 256 + (abyte0[i1 * 10 + 11] & 0xff);
            if (j1 == j)
                return k1;
            l += l1;
        }

        return 0;
    }

    public static byte[] loadData(String s, int i, byte[] abyte0) {
        return unpackData(s, i, abyte0, null);
    }

    public static byte[] unpackData(String s, int i, byte[] abyte0, byte[] abyte1) {
        int j = (abyte0[0] & 0xff) * 256 + (abyte0[1] & 0xff);
        int k = 0;
        s = s.toUpperCase();
        for (int l = 0; l < s.length(); l++)
            k = (k * 61 + s.charAt(l)) - 32;

        int i1 = 2 + j * 10;
        for (int j1 = 0; j1 < j; j1++) {
            int k1 = (abyte0[j1 * 10 + 2] & 0xff) * 0x1000000 + (abyte0[j1 * 10 + 3] & 0xff) * 0x10000 + (abyte0[j1 * 10 + 4] & 0xff) * 256 + (abyte0[j1 * 10 + 5] & 0xff);
            int l1 = (abyte0[j1 * 10 + 6] & 0xff) * 0x10000 + (abyte0[j1 * 10 + 7] & 0xff) * 256 + (abyte0[j1 * 10 + 8] & 0xff);
            int i2 = (abyte0[j1 * 10 + 9] & 0xff) * 0x10000 + (abyte0[j1 * 10 + 10] & 0xff) * 256 + (abyte0[j1 * 10 + 11] & 0xff);
            if (k1 == k) {
                if (abyte1 == null)
                    abyte1 = new byte[l1 + i];
                if (l1 != i2) {
                    bzip2.read(abyte1, l1, abyte0, i2, i1);
                } else {
                    System.arraycopy(abyte0, i1 + 0, abyte1, 0, l1);

                }
                return abyte1;
            }
            i1 += i2;
        }

        return null;
    }

    public static URL codeBase = null;
    public static int[] BITMASK = {
            0, 1, 3, 7, 0xf, 0x1f, 0x3f, 0x7f, 0xff, 0x1ff,
            0x3ff, 0x7ff, 0xfff, 0x1fff, 0x3fff, 0x7fff, 0xffff, 0x1ffff, 0x3ffff, 0x7ffff,
            0xfffff, 0x1fffff, 0x3fffff, 0x7fffff, 0xffffff, 0x1ffffff, 0x3ffffff, 0x7ffffff, 0xfffffff, 0x1fffffff,
            0x3fffffff, 0x7fffffff, 0xffffffff
    };
    public static int anInt412;

}
