// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package pack1;

import java.util.zip.CRC32;

public class Class9
{

    public Class9()
    {
    }

    public Class9(byte abyte0[])
    {
        aByteArray372 = abyte0;
        anInt373 = 0;
    }

    public int method314()
    {
        return aByteArray372[anInt373++] & 0xff;
    }

    public int method315()
    {
        anInt373 += 2;
        return ((aByteArray372[anInt373 - 2] & 0xff) << 8) + (aByteArray372[anInt373 - 1] & 0xff);
    }

    public int method316()
    {
        anInt373 += 4;
        return ((aByteArray372[anInt373 - 4] & 0xff) << 24) + ((aByteArray372[anInt373 - 3] & 0xff) << 16) + ((aByteArray372[anInt373 - 2] & 0xff) << 8) + (aByteArray372[anInt373 - 1] & 0xff);
    }

    public byte aByteArray372[];
    public int anInt373;
    public static CRC32 aCRC32_374 = new CRC32();
    public static final int anIntArray375[] = {
        0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 
        1023, 2047, 4095, 8191, 16383, 32767, 65535, 0x1ffff, 0x3ffff, 0x7ffff, 
        0xfffff, 0x1fffff, 0x3fffff, 0x7fffff, 0xffffff, 0x1ffffff, 0x3ffffff, 0x7ffffff, 0xfffffff, 0x1fffffff, 
        0x3fffffff, 0x7fffffff, -1
    };

}
