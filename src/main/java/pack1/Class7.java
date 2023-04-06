// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package pack1;

import java.io.PrintStream;

// Referenced classes of package pack1:
//            Class8, Class10

public class Class7
{

    public static int method306(byte abyte0[], int i, byte abyte1[], int j, int k)
    {
        Class8 class8 = new Class8();
        class8.aByteArray333 = abyte1;
        class8.anInt334 = k;
        class8.aByteArray338 = abyte0;
        class8.anInt339 = 0;
        class8.anInt335 = j;
        class8.anInt340 = i;
        class8.anInt347 = 0;
        class8.anInt346 = 0;
        class8.anInt336 = 0;
        class8.anInt337 = 0;
        class8.anInt341 = 0;
        class8.anInt342 = 0;
        class8.anInt349 = 0;
        method308(class8);
        i -= class8.anInt340;
        return i;
    }

    public static void method307(Class8 class8)
    {
        byte byte4 = class8.aByte343;
        int i = class8.anInt344;
        int j = class8.anInt354;
        int k = class8.anInt352;
        int ai[] = Class8.anIntArray357;
        int l = class8.anInt351;
        byte abyte0[] = class8.aByteArray338;
        int i1 = class8.anInt339;
        int j1 = class8.anInt340;
        int k1 = j1;
        int l1 = class8.anInt371 + 1;
label0:
        do
        {
            if(i > 0)
            {
                do
                {
                    if(j1 == 0)
                        break label0;
                    if(i == 1)
                        break;
                    abyte0[i1] = byte4;
                    i--;
                    i1++;
                    j1--;
                } while(true);
                if(j1 == 0)
                {
                    i = 1;
                    break;
                }
                abyte0[i1] = byte4;
                i1++;
                j1--;
            }
            boolean flag = true;
            while(flag) 
            {
                flag = false;
                if(j == l1)
                {
                    i = 0;
                    break label0;
                }
                byte4 = (byte)k;
                l = ai[l];
                byte byte0 = (byte)(l & 0xff);
                l >>= 8;
                j++;
                if(byte0 != k)
                {
                    k = byte0;
                    if(j1 == 0)
                    {
                        i = 1;
                    } else
                    {
                        abyte0[i1] = byte4;
                        i1++;
                        j1--;
                        flag = true;
                        continue;
                    }
                    break label0;
                }
                if(j != l1)
                    continue;
                if(j1 == 0)
                {
                    i = 1;
                    break label0;
                }
                abyte0[i1] = byte4;
                i1++;
                j1--;
                flag = true;
            }
            i = 2;
            l = ai[l];
            byte byte1 = (byte)(l & 0xff);
            l >>= 8;
            if(++j != l1)
                if(byte1 != k)
                {
                    k = byte1;
                } else
                {
                    i = 3;
                    l = ai[l];
                    byte byte2 = (byte)(l & 0xff);
                    l >>= 8;
                    if(++j != l1)
                        if(byte2 != k)
                        {
                            k = byte2;
                        } else
                        {
                            l = ai[l];
                            byte byte3 = (byte)(l & 0xff);
                            l >>= 8;
                            j++;
                            i = (byte3 & 0xff) + 4;
                            l = ai[l];
                            k = (byte)(l & 0xff);
                            l >>= 8;
                            j++;
                        }
                }
        } while(true);
        int i2 = class8.anInt341;
        class8.anInt341 += k1 - j1;
        if(class8.anInt341 < i2)
            class8.anInt342++;
        class8.aByte343 = byte4;
        class8.anInt344 = i;
        class8.anInt354 = j;
        class8.anInt352 = k;
        Class8.anIntArray357 = ai;
        class8.anInt351 = l;
        class8.aByteArray338 = abyte0;
        class8.anInt339 = i1;
        class8.anInt340 = j1;
    }

    public static void method308(Class8 class8)
    {
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        boolean flag6 = false;
        boolean flag7 = false;
        boolean flag8 = false;
        boolean flag9 = false;
        boolean flag10 = false;
        boolean flag11 = false;
        boolean flag12 = false;
        boolean flag13 = false;
        boolean flag14 = false;
        boolean flag15 = false;
        boolean flag16 = false;
        boolean flag17 = false;
        boolean flag18 = false;
        int k8 = 0;
        int ai[] = null;
        int ai1[] = null;
        int ai2[] = null;
        class8.anInt348 = 1;
        if(Class8.anIntArray357 == null)
            Class8.anIntArray357 = new int[class8.anInt348 * 0x186a0];
        boolean flag19 = true;
        while(flag19) 
        {
            byte byte0 = method309(class8);
            if(byte0 == 23)
                return;
            byte0 = method309(class8);
            byte0 = method309(class8);
            byte0 = method309(class8);
            byte0 = method309(class8);
            byte0 = method309(class8);
            class8.anInt349++;
            byte0 = method309(class8);
            byte0 = method309(class8);
            byte0 = method309(class8);
            byte0 = method309(class8);
            byte0 = method310(class8);
            if(byte0 != 0)
                class8.aBoolean345 = true;
            else
                class8.aBoolean345 = false;
            if(class8.aBoolean345)
                System.out.println("PANIC! RANDOMISED BLOCK!");
            class8.anInt350 = 0;
            byte0 = method309(class8);
            class8.anInt350 = class8.anInt350 << 8 | byte0 & 0xff;
            byte0 = method309(class8);
            class8.anInt350 = class8.anInt350 << 8 | byte0 & 0xff;
            byte0 = method309(class8);
            class8.anInt350 = class8.anInt350 << 8 | byte0 & 0xff;
            for(int j = 0; j < 16; j++)
            {
                byte byte1 = method310(class8);
                if(byte1 == 1)
                    class8.aBooleanArray360[j] = true;
                else
                    class8.aBooleanArray360[j] = false;
            }

            for(int k = 0; k < 256; k++)
                class8.aBooleanArray359[k] = false;

            for(int l = 0; l < 16; l++)
                if(class8.aBooleanArray360[l])
                {
                    for(int i3 = 0; i3 < 16; i3++)
                    {
                        byte byte2 = method310(class8);
                        if(byte2 == 1)
                            class8.aBooleanArray359[l * 16 + i3] = true;
                    }

                }

            method312(class8);
            int i4 = class8.anInt358 + 2;
            int j4 = method311(3, class8);
            int k4 = method311(15, class8);
            for(int i1 = 0; i1 < k4; i1++)
            {
                int j3 = 0;
                do
                {
                    byte byte3 = method310(class8);
                    if(byte3 == 0)
                        break;
                    j3++;
                } while(true);
                class8.aByteArray365[i1] = (byte)j3;
            }

            byte abyte0[] = new byte[6];
            for(byte byte16 = 0; byte16 < j4; byte16++)
                abyte0[byte16] = byte16;

            for(int j1 = 0; j1 < k4; j1++)
            {
                byte byte17 = class8.aByteArray365[j1];
                byte byte15 = abyte0[byte17];
                for(; byte17 > 0; byte17--)
                    abyte0[byte17] = abyte0[byte17 - 1];

                abyte0[0] = byte15;
                class8.aByteArray364[j1] = byte15;
            }

            for(int k3 = 0; k3 < j4; k3++)
            {
                int l6 = method311(5, class8);
                for(int k1 = 0; k1 < i4; k1++)
                {
                    do
                    {
                        byte byte4 = method310(class8);
                        if(byte4 == 0)
                            break;
                        byte4 = method310(class8);
                        if(byte4 == 0)
                            l6++;
                        else
                            l6--;
                    } while(true);
                    class8.aByteArrayArray366[k3][k1] = (byte)l6;
                }

            }

            for(int l3 = 0; l3 < j4; l3++)
            {
                byte byte8 = 32;
                int i = 0;
                for(int l1 = 0; l1 < i4; l1++)
                {
                    if(class8.aByteArrayArray366[l3][l1] > i)
                        i = class8.aByteArrayArray366[l3][l1];
                    if(class8.aByteArrayArray366[l3][l1] < byte8)
                        byte8 = class8.aByteArrayArray366[l3][l1];
                }

                method313(class8.anIntArrayArray367[l3], class8.anIntArrayArray368[l3], class8.anIntArrayArray369[l3], class8.aByteArrayArray366[l3], byte8, i, i4);
                class8.anIntArray370[l3] = byte8;
            }

            int l4 = class8.anInt358 + 1;
            int l5 = 0x186a0 * class8.anInt348;
            int i5 = -1;
            int j5 = 0;
            for(int i2 = 0; i2 <= 255; i2++)
                class8.anIntArray353[i2] = 0;

            int j9 = 4095;
            for(int l8 = 15; l8 >= 0; l8--)
            {
                for(int i9 = 15; i9 >= 0; i9--)
                {
                    class8.aByteArray362[j9] = (byte)(l8 * 16 + i9);
                    j9--;
                }

                class8.anIntArray363[l8] = j9 + 1;
            }

            int i6 = 0;
            if(j5 == 0)
            {
                i5++;
                j5 = 50;
                byte byte12 = class8.aByteArray364[i5];
                k8 = class8.anIntArray370[byte12];
                ai = class8.anIntArrayArray367[byte12];
                ai2 = class8.anIntArrayArray369[byte12];
                ai1 = class8.anIntArrayArray368[byte12];
            }
            j5--;
            int i7 = k8;
            int l7;
            byte byte9;
            for(l7 = method311(i7, class8); l7 > ai[i7]; l7 = l7 << 1 | byte9)
            {
                i7++;
                byte9 = method310(class8);
            }

            for(int k5 = ai2[l7 - ai1[i7]]; k5 != l4;)
                if(k5 == 0 || k5 == 1)
                {
                    int j6 = -1;
                    int k6 = 1;
                    do
                    {
                        if(k5 == 0)
                            j6 += k6;
                        else
                        if(k5 == 1)
                            j6 += 2 * k6;
                        k6 *= 2;
                        if(j5 == 0)
                        {
                            i5++;
                            j5 = 50;
                            byte byte13 = class8.aByteArray364[i5];
                            k8 = class8.anIntArray370[byte13];
                            ai = class8.anIntArrayArray367[byte13];
                            ai2 = class8.anIntArrayArray369[byte13];
                            ai1 = class8.anIntArrayArray368[byte13];
                        }
                        j5--;
                        int j7 = k8;
                        int i8;
                        byte byte10;
                        for(i8 = method311(j7, class8); i8 > ai[j7]; i8 = i8 << 1 | byte10)
                        {
                            j7++;
                            byte10 = method310(class8);
                        }

                        k5 = ai2[i8 - ai1[j7]];
                    } while(k5 == 0 || k5 == 1);
                    j6++;
                    byte byte5 = class8.aByteArray361[class8.aByteArray362[class8.anIntArray363[0]] & 0xff];
                    class8.anIntArray353[byte5 & 0xff] += j6;
                    for(; j6 > 0; j6--)
                    {
                        Class8.anIntArray357[i6] = byte5 & 0xff;
                        i6++;
                    }

                } else
                {
                    int j11 = k5 - 1;
                    byte byte6;
                    if(j11 < 16)
                    {
                        int j10 = class8.anIntArray363[0];
                        byte6 = class8.aByteArray362[j10 + j11];
                        for(; j11 > 3; j11 -= 4)
                        {
                            int k11 = j10 + j11;
                            class8.aByteArray362[k11] = class8.aByteArray362[k11 - 1];
                            class8.aByteArray362[k11 - 1] = class8.aByteArray362[k11 - 2];
                            class8.aByteArray362[k11 - 2] = class8.aByteArray362[k11 - 3];
                            class8.aByteArray362[k11 - 3] = class8.aByteArray362[k11 - 4];
                        }

                        for(; j11 > 0; j11--)
                            class8.aByteArray362[j10 + j11] = class8.aByteArray362[(j10 + j11) - 1];

                        class8.aByteArray362[j10] = byte6;
                    } else
                    {
                        int l10 = j11 / 16;
                        int i11 = j11 % 16;
                        int k10 = class8.anIntArray363[l10] + i11;
                        byte6 = class8.aByteArray362[k10];
                        for(; k10 > class8.anIntArray363[l10]; k10--)
                            class8.aByteArray362[k10] = class8.aByteArray362[k10 - 1];

                        class8.anIntArray363[l10]++;
                        for(; l10 > 0; l10--)
                        {
                            class8.anIntArray363[l10]--;
                            class8.aByteArray362[class8.anIntArray363[l10]] = class8.aByteArray362[(class8.anIntArray363[l10 - 1] + 16) - 1];
                        }

                        class8.anIntArray363[0]--;
                        class8.aByteArray362[class8.anIntArray363[0]] = byte6;
                        if(class8.anIntArray363[0] == 0)
                        {
                            int i10 = 4095;
                            for(int k9 = 15; k9 >= 0; k9--)
                            {
                                for(int l9 = 15; l9 >= 0; l9--)
                                {
                                    class8.aByteArray362[i10] = class8.aByteArray362[class8.anIntArray363[k9] + l9];
                                    i10--;
                                }

                                class8.anIntArray363[k9] = i10 + 1;
                            }

                        }
                    }
                    class8.anIntArray353[class8.aByteArray361[byte6 & 0xff] & 0xff]++;
                    Class8.anIntArray357[i6] = class8.aByteArray361[byte6 & 0xff] & 0xff;
                    i6++;
                    if(j5 == 0)
                    {
                        i5++;
                        j5 = 50;
                        byte byte14 = class8.aByteArray364[i5];
                        k8 = class8.anIntArray370[byte14];
                        ai = class8.anIntArrayArray367[byte14];
                        ai2 = class8.anIntArrayArray369[byte14];
                        ai1 = class8.anIntArrayArray368[byte14];
                    }
                    j5--;
                    int k7 = k8;
                    int j8;
                    byte byte11;
                    for(j8 = method311(k7, class8); j8 > ai[k7]; j8 = j8 << 1 | byte11)
                    {
                        k7++;
                        byte11 = method310(class8);
                    }

                    k5 = ai2[j8 - ai1[k7]];
                }

            class8.anInt344 = 0;
            class8.aByte343 = 0;
            class8.anIntArray355[0] = 0;
            for(int j2 = 1; j2 <= 256; j2++)
                class8.anIntArray355[j2] = class8.anIntArray353[j2 - 1];

            for(int k2 = 1; k2 <= 256; k2++)
                class8.anIntArray355[k2] += class8.anIntArray355[k2 - 1];

            for(int l2 = 0; l2 < i6; l2++)
            {
                byte byte7 = (byte)(Class8.anIntArray357[l2] & 0xff);
                Class8.anIntArray357[class8.anIntArray355[byte7 & 0xff]] |= l2 << 8;
                class8.anIntArray355[byte7 & 0xff]++;
            }

            class8.anInt351 = Class8.anIntArray357[class8.anInt350] >> 8;
            class8.anInt354 = 0;
            class8.anInt351 = Class8.anIntArray357[class8.anInt351];
            class8.anInt352 = (byte)(class8.anInt351 & 0xff);
            class8.anInt351 >>= 8;
            class8.anInt354++;
            class8.anInt371 = i6;
            method307(class8);
            if(class8.anInt354 == class8.anInt371 + 1 && class8.anInt344 == 0)
                flag19 = true;
            else
                flag19 = false;
        }
    }

    public static byte method309(Class8 class8)
    {
        return (byte)method311(8, class8);
    }

    public static byte method310(Class8 class8)
    {
        return (byte)method311(1, class8);
    }

    public static int method311(int i, Class8 class8)
    {
        int j;
        do
        {
            if(class8.anInt347 >= i)
            {
                int k = class8.anInt346 >> class8.anInt347 - i & (1 << i) - 1;
                class8.anInt347 -= i;
                j = k;
                break;
            }
            class8.anInt346 = class8.anInt346 << 8 | class8.aByteArray333[class8.anInt334] & 0xff;
            class8.anInt347 += 8;
            class8.anInt334++;
            class8.anInt335--;
            class8.anInt336++;
            if(class8.anInt336 == 0)
                class8.anInt337++;
        } while(true);
        return j;
    }

    public static void method312(Class8 class8)
    {
        class8.anInt358 = 0;
        for(int i = 0; i < 256; i++)
            if(class8.aBooleanArray359[i])
            {
                class8.aByteArray361[class8.anInt358] = (byte)i;
                class8.anInt358++;
            }

    }

    public static void method313(int ai[], int ai1[], int ai2[], byte abyte0[], int i, int j, int k)
    {
        int l = 0;
        for(int i1 = i; i1 <= j; i1++)
        {
            for(int l2 = 0; l2 < k; l2++)
                if(abyte0[l2] == i1)
                {
                    ai2[l] = l2;
                    l++;
                }

        }

        for(int j1 = 0; j1 < 23; j1++)
            ai1[j1] = 0;

        for(int k1 = 0; k1 < k; k1++)
            ai1[abyte0[k1] + 1]++;

        for(int l1 = 1; l1 < 23; l1++)
            ai1[l1] += ai1[l1 - 1];

        for(int i2 = 0; i2 < 23; i2++)
            ai[i2] = 0;

        int i3 = 0;
        for(int j2 = i; j2 <= j; j2++)
        {
            i3 += ai1[j2 + 1] - ai1[j2];
            ai[j2] = i3 - 1;
            i3 <<= 1;
        }

        for(int k2 = i + 1; k2 <= j; k2++)
            ai1[k2] = (ai[k2 - 1] + 1 << 1) - ai1[k2];

    }
}
