package jagex;

// was: a.b
public class bzip2 {

    public static int method306(byte[] abyte0, int i, byte[] abyte1, int j, int k) {
        Context context = new Context();
        context.aByteArray333 = abyte1;
        context.anInt334 = k;
        context.aByteArray338 = abyte0;
        context.anInt339 = 0;
        context.anInt335 = j;
        context.anInt340 = i;
        context.anInt347 = 0;
        context.anInt346 = 0;
        context.anInt336 = 0;
        context.anInt337 = 0;
        context.anInt341 = 0;
        context.anInt342 = 0;
        context.anInt349 = 0;
        method308(context);
        i -= context.anInt340;
        return i;
    }

    public static void method307(Context context) {
        byte byte4 = context.aByte343;
        int i = context.anInt344;
        int j = context.anInt354;
        int k = context.anInt352;
        int[] ai = Context.anIntArray357;
        int l = context.anInt351;
        byte[] abyte0 = context.aByteArray338;
        int i1 = context.anInt339;
        int j1 = context.anInt340;
        int k1 = j1;
        int l1 = context.anInt371 + 1;
        label0:
        do {
            if (i > 0) {
                do {
                    if (j1 == 0)
                        break label0;
                    if (i == 1)
                        break;
                    abyte0[i1] = byte4;
                    i--;
                    i1++;
                    j1--;
                } while (true);
                if (j1 == 0) {
                    i = 1;
                    break;
                }
                abyte0[i1] = byte4;
                i1++;
                j1--;
            }
            boolean flag = true;
            while (flag) {
                flag = false;
                if (j == l1) {
                    i = 0;
                    break label0;
                }
                byte4 = (byte) k;
                l = ai[l];
                byte byte0 = (byte) (l & 0xff);
                l >>= 8;
                j++;
                if (byte0 != k) {
                    k = byte0;
                    if (j1 == 0) {
                        i = 1;
                    } else {
                        abyte0[i1] = byte4;
                        i1++;
                        j1--;
                        flag = true;
                        continue;
                    }
                    break label0;
                }
                if (j != l1)
                    continue;
                if (j1 == 0) {
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
            byte byte1 = (byte) (l & 0xff);
            l >>= 8;
            if (++j != l1)
                if (byte1 != k) {
                    k = byte1;
                } else {
                    i = 3;
                    l = ai[l];
                    byte byte2 = (byte) (l & 0xff);
                    l >>= 8;
                    if (++j != l1)
                        if (byte2 != k) {
                            k = byte2;
                        } else {
                            l = ai[l];
                            byte byte3 = (byte) (l & 0xff);
                            l >>= 8;
                            j++;
                            i = (byte3 & 0xff) + 4;
                            l = ai[l];
                            k = (byte) (l & 0xff);
                            l >>= 8;
                            j++;
                        }
                }
        } while (true);
        int i2 = context.anInt341;
        context.anInt341 += k1 - j1;
        if (context.anInt341 < i2)
            context.anInt342++;
        context.aByte343 = byte4;
        context.anInt344 = i;
        context.anInt354 = j;
        context.anInt352 = k;
        Context.anIntArray357 = ai;
        context.anInt351 = l;
        context.aByteArray338 = abyte0;
        context.anInt339 = i1;
        context.anInt340 = j1;
    }

    public static void method308(Context context) {
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
        int[] ai = null;
        int[] ai1 = null;
        int[] ai2 = null;
        context.anInt348 = 1;
        if (Context.anIntArray357 == null)
            Context.anIntArray357 = new int[context.anInt348 * 0x186a0];
        boolean flag19 = true;
        while (flag19) {
            byte byte0 = method309(context);
            if (byte0 == 23)
                return;
            byte0 = method309(context);
            byte0 = method309(context);
            byte0 = method309(context);
            byte0 = method309(context);
            byte0 = method309(context);
            context.anInt349++;
            byte0 = method309(context);
            byte0 = method309(context);
            byte0 = method309(context);
            byte0 = method309(context);
            byte0 = method310(context);
            context.aBoolean345 = byte0 != 0;
            if (context.aBoolean345)
                System.out.println("PANIC! RANDOMISED BLOCK!");
            context.anInt350 = 0;
            byte0 = method309(context);
            context.anInt350 = context.anInt350 << 8 | byte0 & 0xff;
            byte0 = method309(context);
            context.anInt350 = context.anInt350 << 8 | byte0 & 0xff;
            byte0 = method309(context);
            context.anInt350 = context.anInt350 << 8 | byte0 & 0xff;
            for (int j = 0; j < 16; j++) {
                byte byte1 = method310(context);
                context.aBooleanArray360[j] = byte1 == 1;
            }

            for (int k = 0; k < 256; k++)
                context.aBooleanArray359[k] = false;

            for (int l = 0; l < 16; l++)
                if (context.aBooleanArray360[l]) {
                    for (int i3 = 0; i3 < 16; i3++) {
                        byte byte2 = method310(context);
                        if (byte2 == 1)
                            context.aBooleanArray359[l * 16 + i3] = true;
                    }

                }

            method312(context);
            int i4 = context.anInt358 + 2;
            int j4 = method311(3, context);
            int k4 = method311(15, context);
            for (int i1 = 0; i1 < k4; i1++) {
                int j3 = 0;
                do {
                    byte byte3 = method310(context);
                    if (byte3 == 0)
                        break;
                    j3++;
                } while (true);
                context.aByteArray365[i1] = (byte) j3;
            }

            byte[] abyte0 = new byte[6];
            for (byte byte16 = 0; byte16 < j4; byte16++)
                abyte0[byte16] = byte16;

            for (int j1 = 0; j1 < k4; j1++) {
                byte byte17 = context.aByteArray365[j1];
                byte byte15 = abyte0[byte17];
                for (; byte17 > 0; byte17--)
                    abyte0[byte17] = abyte0[byte17 - 1];

                abyte0[0] = byte15;
                context.aByteArray364[j1] = byte15;
            }

            for (int k3 = 0; k3 < j4; k3++) {
                int l6 = method311(5, context);
                for (int k1 = 0; k1 < i4; k1++) {
                    do {
                        byte byte4 = method310(context);
                        if (byte4 == 0)
                            break;
                        byte4 = method310(context);
                        if (byte4 == 0)
                            l6++;
                        else
                            l6--;
                    } while (true);
                    context.aByteArrayArray366[k3][k1] = (byte) l6;
                }

            }

            for (int l3 = 0; l3 < j4; l3++) {
                byte byte8 = 32;
                int i = 0;
                for (int l1 = 0; l1 < i4; l1++) {
                    if (context.aByteArrayArray366[l3][l1] > i)
                        i = context.aByteArrayArray366[l3][l1];
                    if (context.aByteArrayArray366[l3][l1] < byte8)
                        byte8 = context.aByteArrayArray366[l3][l1];
                }

                method313(context.anIntArrayArray367[l3], context.anIntArrayArray368[l3], context.anIntArrayArray369[l3], context.aByteArrayArray366[l3], byte8, i, i4);
                context.anIntArray370[l3] = byte8;
            }

            int l4 = context.anInt358 + 1;
            int l5 = 0x186a0 * context.anInt348;
            int i5 = -1;
            int j5 = 0;
            for (int i2 = 0; i2 <= 255; i2++)
                context.anIntArray353[i2] = 0;

            int j9 = 4095;
            for (int l8 = 15; l8 >= 0; l8--) {
                for (int i9 = 15; i9 >= 0; i9--) {
                    context.aByteArray362[j9] = (byte) (l8 * 16 + i9);
                    j9--;
                }

                context.anIntArray363[l8] = j9 + 1;
            }

            int i6 = 0;
            if (j5 == 0) {
                i5++;
                j5 = 50;
                byte byte12 = context.aByteArray364[i5];
                k8 = context.anIntArray370[byte12];
                ai = context.anIntArrayArray367[byte12];
                ai2 = context.anIntArrayArray369[byte12];
                ai1 = context.anIntArrayArray368[byte12];
            }
            j5--;
            int i7 = k8;
            int l7;
            byte byte9;
            for (l7 = method311(i7, context); l7 > ai[i7]; l7 = l7 << 1 | byte9) {
                i7++;
                byte9 = method310(context);
            }

            for (int k5 = ai2[l7 - ai1[i7]]; k5 != l4; )
                if (k5 == 0 || k5 == 1) {
                    int j6 = -1;
                    int k6 = 1;
                    do {
                        if (k5 == 0)
                            j6 += k6;
                        else if (k5 == 1)
                            j6 += 2 * k6;
                        k6 *= 2;
                        if (j5 == 0) {
                            i5++;
                            j5 = 50;
                            byte byte13 = context.aByteArray364[i5];
                            k8 = context.anIntArray370[byte13];
                            ai = context.anIntArrayArray367[byte13];
                            ai2 = context.anIntArrayArray369[byte13];
                            ai1 = context.anIntArrayArray368[byte13];
                        }
                        j5--;
                        int j7 = k8;
                        int i8;
                        byte byte10;
                        for (i8 = method311(j7, context); i8 > ai[j7]; i8 = i8 << 1 | byte10) {
                            j7++;
                            byte10 = method310(context);
                        }

                        k5 = ai2[i8 - ai1[j7]];
                    } while (k5 == 0 || k5 == 1);
                    j6++;
                    byte byte5 = context.aByteArray361[context.aByteArray362[context.anIntArray363[0]] & 0xff];
                    context.anIntArray353[byte5 & 0xff] += j6;
                    for (; j6 > 0; j6--) {
                        Context.anIntArray357[i6] = byte5 & 0xff;
                        i6++;
                    }

                } else {
                    int j11 = k5 - 1;
                    byte byte6;
                    if (j11 < 16) {
                        int j10 = context.anIntArray363[0];
                        byte6 = context.aByteArray362[j10 + j11];
                        for (; j11 > 3; j11 -= 4) {
                            int k11 = j10 + j11;
                            context.aByteArray362[k11] = context.aByteArray362[k11 - 1];
                            context.aByteArray362[k11 - 1] = context.aByteArray362[k11 - 2];
                            context.aByteArray362[k11 - 2] = context.aByteArray362[k11 - 3];
                            context.aByteArray362[k11 - 3] = context.aByteArray362[k11 - 4];
                        }

                        for (; j11 > 0; j11--)
                            context.aByteArray362[j10 + j11] = context.aByteArray362[(j10 + j11) - 1];

                        context.aByteArray362[j10] = byte6;
                    } else {
                        int l10 = j11 / 16;
                        int i11 = j11 % 16;
                        int k10 = context.anIntArray363[l10] + i11;
                        byte6 = context.aByteArray362[k10];
                        for (; k10 > context.anIntArray363[l10]; k10--)
                            context.aByteArray362[k10] = context.aByteArray362[k10 - 1];

                        context.anIntArray363[l10]++;
                        for (; l10 > 0; l10--) {
                            context.anIntArray363[l10]--;
                            context.aByteArray362[context.anIntArray363[l10]] = context.aByteArray362[(context.anIntArray363[l10 - 1] + 16) - 1];
                        }

                        context.anIntArray363[0]--;
                        context.aByteArray362[context.anIntArray363[0]] = byte6;
                        if (context.anIntArray363[0] == 0) {
                            int i10 = 4095;
                            for (int k9 = 15; k9 >= 0; k9--) {
                                for (int l9 = 15; l9 >= 0; l9--) {
                                    context.aByteArray362[i10] = context.aByteArray362[context.anIntArray363[k9] + l9];
                                    i10--;
                                }

                                context.anIntArray363[k9] = i10 + 1;
                            }

                        }
                    }
                    context.anIntArray353[context.aByteArray361[byte6 & 0xff] & 0xff]++;
                    Context.anIntArray357[i6] = context.aByteArray361[byte6 & 0xff] & 0xff;
                    i6++;
                    if (j5 == 0) {
                        i5++;
                        j5 = 50;
                        byte byte14 = context.aByteArray364[i5];
                        k8 = context.anIntArray370[byte14];
                        ai = context.anIntArrayArray367[byte14];
                        ai2 = context.anIntArrayArray369[byte14];
                        ai1 = context.anIntArrayArray368[byte14];
                    }
                    j5--;
                    int k7 = k8;
                    int j8;
                    byte byte11;
                    for (j8 = method311(k7, context); j8 > ai[k7]; j8 = j8 << 1 | byte11) {
                        k7++;
                        byte11 = method310(context);
                    }

                    k5 = ai2[j8 - ai1[k7]];
                }

            context.anInt344 = 0;
            context.aByte343 = 0;
            context.anIntArray355[0] = 0;
            System.arraycopy(context.anIntArray353, 0, context.anIntArray355, 1, 256);

            for (int k2 = 1; k2 <= 256; k2++)
                context.anIntArray355[k2] += context.anIntArray355[k2 - 1];

            for (int l2 = 0; l2 < i6; l2++) {
                byte byte7 = (byte) (Context.anIntArray357[l2] & 0xff);
                Context.anIntArray357[context.anIntArray355[byte7 & 0xff]] |= l2 << 8;
                context.anIntArray355[byte7 & 0xff]++;
            }

            context.anInt351 = Context.anIntArray357[context.anInt350] >> 8;
            context.anInt354 = 0;
            context.anInt351 = Context.anIntArray357[context.anInt351];
            context.anInt352 = (byte) (context.anInt351 & 0xff);
            context.anInt351 >>= 8;
            context.anInt354++;
            context.anInt371 = i6;
            method307(context);
            flag19 = context.anInt354 == context.anInt371 + 1 && context.anInt344 == 0;
        }
    }

    public static byte method309(Context context) {
        return (byte) method311(8, context);
    }

    public static byte method310(Context context) {
        return (byte) method311(1, context);
    }

    public static int method311(int i, Context context) {
        int j;
        do {
            if (context.anInt347 >= i) {
                int k = context.anInt346 >> context.anInt347 - i & (1 << i) - 1;
                context.anInt347 -= i;
                j = k;
                break;
            }
            context.anInt346 = context.anInt346 << 8 | context.aByteArray333[context.anInt334] & 0xff;
            context.anInt347 += 8;
            context.anInt334++;
            context.anInt335--;
            context.anInt336++;
            if (context.anInt336 == 0)
                context.anInt337++;
        } while (true);
        return j;
    }

    public static void method312(Context context) {
        context.anInt358 = 0;
        for (int i = 0; i < 256; i++)
            if (context.aBooleanArray359[i]) {
                context.aByteArray361[context.anInt358] = (byte) i;
                context.anInt358++;
            }

    }

    public static void method313(int[] ai, int[] ai1, int[] ai2, byte[] abyte0, int i, int j, int k) {
        int l = 0;
        for (int i1 = i; i1 <= j; i1++) {
            for (int l2 = 0; l2 < k; l2++)
                if (abyte0[l2] == i1) {
                    ai2[l] = l2;
                    l++;
                }

        }

        for (int j1 = 0; j1 < 23; j1++)
            ai1[j1] = 0;

        for (int k1 = 0; k1 < k; k1++)
            ai1[abyte0[k1] + 1]++;

        for (int l1 = 1; l1 < 23; l1++)
            ai1[l1] += ai1[l1 - 1];

        for (int i2 = 0; i2 < 23; i2++)
            ai[i2] = 0;

        int i3 = 0;
        for (int j2 = i; j2 <= j; j2++) {
            i3 += ai1[j2 + 1] - ai1[j2];
            ai[j2] = i3 - 1;
            i3 <<= 1;
        }

        for (int k2 = i + 1; k2 <= j; k2++)
            ai1[k2] = (ai[k2 - 1] + 1 << 1) - ai1[k2];

    }

    // was: a.c
    public static class Context {

        public Context() {
            anIntArray353 = new int[256];
            anIntArray355 = new int[257];
            anIntArray356 = new int[257];
            aBooleanArray359 = new boolean[256];
            aBooleanArray360 = new boolean[16];
            aByteArray361 = new byte[256];
            aByteArray362 = new byte[4096];
            anIntArray363 = new int[16];
            aByteArray364 = new byte[18002];
            aByteArray365 = new byte[18002];
            aByteArrayArray366 = new byte[6][258];
            anIntArrayArray367 = new int[6][258];
            anIntArrayArray368 = new int[6][258];
            anIntArrayArray369 = new int[6][258];
            anIntArray370 = new int[6];
        }

        public final int anInt324 = 4096;
        public final int anInt325 = 16;
        public final int anInt326 = 258;
        public final int anInt327 = 23;
        public final int anInt328 = 1;
        public final int anInt329 = 6;
        public final int anInt330 = 50;
        public final int anInt331 = 4;
        public final int anInt332 = 18002;
        public byte[] aByteArray333;
        public int anInt334;
        public int anInt335;
        public int anInt336;
        public int anInt337;
        public byte[] aByteArray338;
        public int anInt339;
        public int anInt340;
        public int anInt341;
        public int anInt342;
        public byte aByte343;
        public int anInt344;
        public boolean aBoolean345;
        public int anInt346;
        public int anInt347;
        public int anInt348;
        public int anInt349;
        public int anInt350;
        public int anInt351;
        public int anInt352;
        public int[] anIntArray353;
        public int anInt354;
        public int[] anIntArray355;
        public int[] anIntArray356;
        public static int[] anIntArray357;
        public int anInt358;
        public boolean[] aBooleanArray359;
        public boolean[] aBooleanArray360;
        public byte[] aByteArray361;
        public byte[] aByteArray362;
        public int[] anIntArray363;
        public byte[] aByteArray364;
        public byte[] aByteArray365;
        public byte[][] aByteArrayArray366;
        public int[][] anIntArrayArray367;
        public int[][] anIntArrayArray368;
        public int[][] anIntArrayArray369;
        public int[] anIntArray370;
        public int anInt371;
    }
}
