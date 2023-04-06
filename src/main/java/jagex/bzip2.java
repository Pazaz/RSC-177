package jagex;

// was: a.b
public class bzip2 {

    public static int read(byte[] abyte0, int i, byte[] abyte1, int j, int k) {
        Context context = new Context();
        context.stream = abyte1;
        context.next_in = k;
        context.decompressed = abyte0;
        context.next_out = 0;
        context.avail_in = j;
        context.avail_out = i;
        context.bsLive = 0;
        context.bsBuff = 0;
        context.total_in_lo32 = 0;
        context.total_in_hi32 = 0;
        context.total_out_lo32 = 0;
        context.total_out_hi32 = 0;
        context.currBlockNo = 0;
        decompress(context);
        i -= context.avail_out;
        return i;
    }

    public static void finish(Context context) {
        byte byte4 = context.state_out_ch;
        int i = context.state_out_len;
        int j = context.c_nblock_used;
        int k = context.k0;
        int[] ai = Context.tt;
        int l = context.tPos;
        byte[] abyte0 = context.decompressed;
        int i1 = context.next_out;
        int j1 = context.avail_out;
        int k1 = j1;
        int l1 = context.save_nblock + 1;
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
        int i2 = context.total_out_lo32;
        context.total_out_lo32 += k1 - j1;
        if (context.total_out_lo32 < i2)
            context.total_out_hi32++;
        context.state_out_ch = byte4;
        context.state_out_len = i;
        context.c_nblock_used = j;
        context.k0 = k;
        Context.tt = ai;
        context.tPos = l;
        context.decompressed = abyte0;
        context.next_out = i1;
        context.avail_out = j1;
    }

    public static void decompress(Context context) {
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
        context.blockSize100k = 1;
        if (Context.tt == null)
            Context.tt = new int[context.blockSize100k * 0x186a0];
        boolean flag19 = true;
        while (flag19) {
            byte byte0 = getUnsignedChar(context);
            if (byte0 == 23)
                return;
            byte0 = getUnsignedChar(context);
            byte0 = getUnsignedChar(context);
            byte0 = getUnsignedChar(context);
            byte0 = getUnsignedChar(context);
            byte0 = getUnsignedChar(context);
            context.currBlockNo++;
            byte0 = getUnsignedChar(context);
            byte0 = getUnsignedChar(context);
            byte0 = getUnsignedChar(context);
            byte0 = getUnsignedChar(context);
            byte0 = getBit(context);
            context.blockRandomized = byte0 != 0;
            if (context.blockRandomized)
                System.out.println("PANIC! RANDOMISED BLOCK!");
            context.origPtr = 0;
            byte0 = getUnsignedChar(context);
            context.origPtr = context.origPtr << 8 | byte0 & 0xff;
            byte0 = getUnsignedChar(context);
            context.origPtr = context.origPtr << 8 | byte0 & 0xff;
            byte0 = getUnsignedChar(context);
            context.origPtr = context.origPtr << 8 | byte0 & 0xff;
            for (int j = 0; j < 16; j++) {
                byte byte1 = getBit(context);
                context.inUse16[j] = byte1 == 1;
            }

            for (int k = 0; k < 256; k++)
                context.inUse[k] = false;

            for (int l = 0; l < 16; l++)
                if (context.inUse16[l]) {
                    for (int i3 = 0; i3 < 16; i3++) {
                        byte byte2 = getBit(context);
                        if (byte2 == 1)
                            context.inUse[l * 16 + i3] = true;
                    }

                }

            makeMaps(context);
            int i4 = context.nInUse + 2;
            int j4 = getBits(3, context);
            int k4 = getBits(15, context);
            for (int i1 = 0; i1 < k4; i1++) {
                int j3 = 0;
                do {
                    byte byte3 = getBit(context);
                    if (byte3 == 0)
                        break;
                    j3++;
                } while (true);
                context.selectorMtf[i1] = (byte) j3;
            }

            byte[] abyte0 = new byte[6];
            for (byte byte16 = 0; byte16 < j4; byte16++)
                abyte0[byte16] = byte16;

            for (int j1 = 0; j1 < k4; j1++) {
                byte byte17 = context.selectorMtf[j1];
                byte byte15 = abyte0[byte17];
                for (; byte17 > 0; byte17--)
                    abyte0[byte17] = abyte0[byte17 - 1];

                abyte0[0] = byte15;
                context.selector[j1] = byte15;
            }

            for (int k3 = 0; k3 < j4; k3++) {
                int l6 = getBits(5, context);
                for (int k1 = 0; k1 < i4; k1++) {
                    do {
                        byte byte4 = getBit(context);
                        if (byte4 == 0)
                            break;
                        byte4 = getBit(context);
                        if (byte4 == 0)
                            l6++;
                        else
                            l6--;
                    } while (true);
                    context.len[k3][k1] = (byte) l6;
                }

            }

            for (int l3 = 0; l3 < j4; l3++) {
                byte byte8 = 32;
                int i = 0;
                for (int l1 = 0; l1 < i4; l1++) {
                    if (context.len[l3][l1] > i)
                        i = context.len[l3][l1];
                    if (context.len[l3][l1] < byte8)
                        byte8 = context.len[l3][l1];
                }

                createDecodeTables(context.limit[l3], context.base[l3], context.perm[l3], context.len[l3], byte8, i, i4);
                context.minLens[l3] = byte8;
            }

            int l4 = context.nInUse + 1;
            int l5 = 0x186a0 * context.blockSize100k;
            int i5 = -1;
            int j5 = 0;
            for (int i2 = 0; i2 <= 255; i2++)
                context.unzftab[i2] = 0;

            int j9 = 4095;
            for (int l8 = 15; l8 >= 0; l8--) {
                for (int i9 = 15; i9 >= 0; i9--) {
                    context.mtfa[j9] = (byte) (l8 * 16 + i9);
                    j9--;
                }

                context.mtfbase[l8] = j9 + 1;
            }

            int i6 = 0;
            if (j5 == 0) {
                i5++;
                j5 = 50;
                byte byte12 = context.selector[i5];
                k8 = context.minLens[byte12];
                ai = context.limit[byte12];
                ai2 = context.perm[byte12];
                ai1 = context.base[byte12];
            }
            j5--;
            int i7 = k8;
            int l7;
            byte byte9;
            for (l7 = getBits(i7, context); l7 > ai[i7]; l7 = l7 << 1 | byte9) {
                i7++;
                byte9 = getBit(context);
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
                            byte byte13 = context.selector[i5];
                            k8 = context.minLens[byte13];
                            ai = context.limit[byte13];
                            ai2 = context.perm[byte13];
                            ai1 = context.base[byte13];
                        }
                        j5--;
                        int j7 = k8;
                        int i8;
                        byte byte10;
                        for (i8 = getBits(j7, context); i8 > ai[j7]; i8 = i8 << 1 | byte10) {
                            j7++;
                            byte10 = getBit(context);
                        }

                        k5 = ai2[i8 - ai1[j7]];
                    } while (k5 == 0 || k5 == 1);
                    j6++;
                    byte byte5 = context.seqToUnseq[context.mtfa[context.mtfbase[0]] & 0xff];
                    context.unzftab[byte5 & 0xff] += j6;
                    for (; j6 > 0; j6--) {
                        Context.tt[i6] = byte5 & 0xff;
                        i6++;
                    }

                } else {
                    int j11 = k5 - 1;
                    byte byte6;
                    if (j11 < 16) {
                        int j10 = context.mtfbase[0];
                        byte6 = context.mtfa[j10 + j11];
                        for (; j11 > 3; j11 -= 4) {
                            int k11 = j10 + j11;
                            context.mtfa[k11] = context.mtfa[k11 - 1];
                            context.mtfa[k11 - 1] = context.mtfa[k11 - 2];
                            context.mtfa[k11 - 2] = context.mtfa[k11 - 3];
                            context.mtfa[k11 - 3] = context.mtfa[k11 - 4];
                        }

                        for (; j11 > 0; j11--)
                            context.mtfa[j10 + j11] = context.mtfa[(j10 + j11) - 1];

                        context.mtfa[j10] = byte6;
                    } else {
                        int l10 = j11 / 16;
                        int i11 = j11 % 16;
                        int k10 = context.mtfbase[l10] + i11;
                        byte6 = context.mtfa[k10];
                        for (; k10 > context.mtfbase[l10]; k10--)
                            context.mtfa[k10] = context.mtfa[k10 - 1];

                        context.mtfbase[l10]++;
                        for (; l10 > 0; l10--) {
                            context.mtfbase[l10]--;
                            context.mtfa[context.mtfbase[l10]] = context.mtfa[(context.mtfbase[l10 - 1] + 16) - 1];
                        }

                        context.mtfbase[0]--;
                        context.mtfa[context.mtfbase[0]] = byte6;
                        if (context.mtfbase[0] == 0) {
                            int i10 = 4095;
                            for (int k9 = 15; k9 >= 0; k9--) {
                                for (int l9 = 15; l9 >= 0; l9--) {
                                    context.mtfa[i10] = context.mtfa[context.mtfbase[k9] + l9];
                                    i10--;
                                }

                                context.mtfbase[k9] = i10 + 1;
                            }

                        }
                    }
                    context.unzftab[context.seqToUnseq[byte6 & 0xff] & 0xff]++;
                    Context.tt[i6] = context.seqToUnseq[byte6 & 0xff] & 0xff;
                    i6++;
                    if (j5 == 0) {
                        i5++;
                        j5 = 50;
                        byte byte14 = context.selector[i5];
                        k8 = context.minLens[byte14];
                        ai = context.limit[byte14];
                        ai2 = context.perm[byte14];
                        ai1 = context.base[byte14];
                    }
                    j5--;
                    int k7 = k8;
                    int j8;
                    byte byte11;
                    for (j8 = getBits(k7, context); j8 > ai[k7]; j8 = j8 << 1 | byte11) {
                        k7++;
                        byte11 = getBit(context);
                    }

                    k5 = ai2[j8 - ai1[k7]];
                }

            context.state_out_len = 0;
            context.state_out_ch = 0;
            context.cftab[0] = 0;
            System.arraycopy(context.unzftab, 0, context.cftab, 1, 256);

            for (int k2 = 1; k2 <= 256; k2++)
                context.cftab[k2] += context.cftab[k2 - 1];

            for (int l2 = 0; l2 < i6; l2++) {
                byte byte7 = (byte) (Context.tt[l2] & 0xff);
                Context.tt[context.cftab[byte7 & 0xff]] |= l2 << 8;
                context.cftab[byte7 & 0xff]++;
            }

            context.tPos = Context.tt[context.origPtr] >> 8;
            context.c_nblock_used = 0;
            context.tPos = Context.tt[context.tPos];
            context.k0 = (byte) (context.tPos & 0xff);
            context.tPos >>= 8;
            context.c_nblock_used++;
            context.save_nblock = i6;
            finish(context);
            flag19 = context.c_nblock_used == context.save_nblock + 1 && context.state_out_len == 0;
        }
    }

    public static byte getUnsignedChar(Context context) {
        return (byte) getBits(8, context);
    }

    public static byte getBit(Context context) {
        return (byte) getBits(1, context);
    }

    public static int getBits(int i, Context context) {
        int j;
        do {
            if (context.bsLive >= i) {
                int k = context.bsBuff >> context.bsLive - i & (1 << i) - 1;
                context.bsLive -= i;
                j = k;
                break;
            }
            context.bsBuff = context.bsBuff << 8 | context.stream[context.next_in] & 0xff;
            context.bsLive += 8;
            context.next_in++;
            context.avail_in--;
            context.total_in_lo32++;
            if (context.total_in_lo32 == 0)
                context.total_in_hi32++;
        } while (true);
        return j;
    }

    public static void makeMaps(Context context) {
        context.nInUse = 0;
        for (int i = 0; i < 256; i++)
            if (context.inUse[i]) {
                context.seqToUnseq[context.nInUse] = (byte) i;
                context.nInUse++;
            }

    }

    public static void createDecodeTables(int[] ai, int[] ai1, int[] ai2, byte[] abyte0, int i, int j, int k) {
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

        public final int MTFA_SIZE = 4096;
        public final int MTFL_SIZE = 16;
        public final int BZ_MAX_ALPHA_SIZE = 258;
        public final int BZ_MAX_CODE_LEN = 23;
        public final int anInt328 = 1;
        public final int BZ_N_GROUPS = 6;
        public final int BZ_G_SIZE = 50;
        public final int anInt331 = 4;
        public final int BZ_MAX_SELECTORS = (2 + (900000 / BZ_G_SIZE)); // 18002

        public byte[] stream;
        public int next_in;
        public int avail_in;
        public int total_in_lo32;
        public int total_in_hi32;
        public byte[] decompressed;
        public int next_out;
        public int avail_out;
        public int total_out_lo32;
        public int total_out_hi32;
        public byte state_out_ch;
        public int state_out_len;
        public boolean blockRandomized;
        public int bsBuff;
        public int bsLive;
        public int blockSize100k;
        public int currBlockNo;
        public int origPtr;
        public int tPos;
        public int k0;
        public int[] unzftab = new int[256];
        public int c_nblock_used;
        public int[] cftab = new int[257];
        public int[] cftabCopy = new int[257];
        public static int[] tt;
        public int nInUse;
        public boolean[] inUse = new boolean[256];
        public boolean[] inUse16 = new boolean[16];
        public byte[] seqToUnseq = new byte[256];
        public byte[] mtfa = new byte[MTFA_SIZE];
        public int[] mtfbase = new int[256 / MTFL_SIZE];
        public byte[] selector = new byte[BZ_MAX_SELECTORS];
        public byte[] selectorMtf = new byte[BZ_MAX_SELECTORS];
        public byte[][] len = new byte[BZ_N_GROUPS][BZ_MAX_ALPHA_SIZE];
        public int[][] limit = new int[BZ_N_GROUPS][BZ_MAX_ALPHA_SIZE];
        public int[][] base = new int[BZ_N_GROUPS][BZ_MAX_ALPHA_SIZE];
        public int[][] perm = new int[BZ_N_GROUPS][BZ_MAX_ALPHA_SIZE];
        public int[] minLens = new int[BZ_N_GROUPS];
        public int save_nblock;
    }
}
