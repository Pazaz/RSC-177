package jagex;

import java.util.zip.CRC32;

// was: a.d
public class r1packet {

    public r1packet() {
    }

    public r1packet(byte[] src) {
        data = src;
        pos = 0;
    }

    public int g1() {
        return data[pos++] & 0xff;
    }

    public int g2() {
        pos += 2;
        return ((data[pos - 2] & 0xff) << 8) + (data[pos - 1] & 0xff);
    }

    public int g4() {
        pos += 4;
        return ((data[pos - 4] & 0xff) << 24) + ((data[pos - 3] & 0xff) << 16) + ((data[pos - 2] & 0xff) << 8) + (data[pos - 1] & 0xff);
    }

    public byte[] data;
    public int pos;

    public static CRC32 crc = new CRC32();
    public static final int[] BITMASK = {
            0, 1, 3, 7, 0xf, 0x1f, 0x3f, 0x7f, 0xff, 0x1ff,
            0x3ff, 0x7ff, 0xfff, 0x1fff, 0x3fff, 0x7fff, 0xffff, 0x1ffff, 0x3ffff, 0x7ffff,
            0xfffff, 0x1fffff, 0x3fffff, 0x7fffff, 0xffffff, 0x1ffffff, 0x3ffffff, 0x7ffffff, 0xfffffff, 0x1fffffff,
            0x3fffffff, 0x7fffffff, 0xffffffff
    };

}
