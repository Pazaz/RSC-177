package jagex.client;

// was: a.a.j
public class world3d {

    public world3d(pixmap pixmap, int i, int j, int k) {
        anInt242 = 50;
        anIntArray243 = new int[anInt242];
        anIntArrayArray244 = new int[anInt242][256];
        anInt247 = 5;
        anInt248 = 1000;
        anInt249 = 1000;
        anInt250 = 20;
        anInt251 = 10;
        aBoolean254 = false;
        aDouble255 = 1.1000000000000001D;
        anInt256 = 1;
        aBoolean257 = false;
        anInt261 = 100;
        aObject3dArray262 = new object3d[anInt261];
        anIntArray263 = new int[anInt261];
        anInt264 = 512;
        anInt265 = 256;
        anInt266 = 192;
        anInt267 = 256;
        anInt268 = 256;
        anInt269 = 8;
        anInt270 = 4;
        anIntArray309 = new int[40];
        anIntArray310 = new int[40];
        anIntArray311 = new int[40];
        anIntArray312 = new int[40];
        anIntArray313 = new int[40];
        anIntArray314 = new int[40];
        aBoolean315 = false;
        aPixmap_304 = pixmap;
        anInt265 = pixmap.width / 2;
        anInt266 = pixmap.height / 2;
        anIntArray305 = pixmap.pixels;
        anInt277 = 0;
        anInt278 = i;
        aObject3dArray279 = new object3d[anInt278];
        anIntArray280 = new int[anInt278];
        anInt281 = 0;
        aPolygon3dArray282 = new polygon3d[j];
        for (int l = 0; l < j; l++)
            aPolygon3dArray282[l] = new polygon3d();

        anInt283 = 0;
        aObject3d_291 = new object3d(k * 2, k);
        anIntArray284 = new int[k];
        anIntArray288 = new int[k];
        anIntArray289 = new int[k];
        anIntArray285 = new int[k];
        anIntArray286 = new int[k];
        anIntArray287 = new int[k];
        anIntArray290 = new int[k];
        if (aByteArray302 == null)
            aByteArray302 = new byte[17691];
        anInt271 = 0;
        anInt272 = 0;
        anInt273 = 0;
        anInt274 = 0;
        anInt275 = 0;
        anInt276 = 0;
        for (int i1 = 0; i1 < 256; i1++) {
            anIntArray253[i1] = (int) (Math.sin((double) i1 * 0.02454369D) * 32768D);
            anIntArray253[i1 + 256] = (int) (Math.cos((double) i1 * 0.02454369D) * 32768D);
        }

        for (int j1 = 0; j1 < 1024; j1++) {
            anIntArray252[j1] = (int) (Math.sin((double) j1 * 0.00613592315D) * 32768D);
            anIntArray252[j1 + 1024] = (int) (Math.cos((double) j1 * 0.00613592315D) * 32768D);
        }

    }

    public void method259(object3d object3d) {
        if (object3d == null)
            System.out.println("Warning tried to add null object!");
        if (anInt277 < anInt278) {
            anIntArray280[anInt277] = 0;
            aObject3dArray279[anInt277++] = object3d;
        }
    }

    public void method260(object3d object3d) {
        for (int i = 0; i < anInt277; i++)
            if (aObject3dArray279[i] == object3d) {
                anInt277--;
                for (int j = i; j < anInt277; j++) {
                    aObject3dArray279[j] = aObject3dArray279[j + 1];
                    anIntArray280[j] = anIntArray280[j + 1];
                }

            }

    }

    public void method261() {
        method262();
        for (int i = 0; i < anInt277; i++)
            aObject3dArray279[i] = null;

        anInt277 = 0;
    }

    public void method262() {
        anInt283 = 0;
        aObject3d_291.method175();
    }

    public void method263(int i) {
        anInt283 -= i;
        aObject3d_291.method176(i, i * 2);
        if (anInt283 < 0)
            anInt283 = 0;
    }

    public int method264(int i, int j, int k, int l, int i1, int j1, int k1) {
        anIntArray284[anInt283] = i;
        anIntArray285[anInt283] = j;
        anIntArray286[anInt283] = k;
        anIntArray287[anInt283] = l;
        anIntArray288[anInt283] = i1;
        anIntArray289[anInt283] = j1;
        anIntArray290[anInt283] = 0;
        int l1 = aObject3d_291.method179(j, k, l);
        int i2 = aObject3d_291.method179(j, k - j1, l);
        int[] ai = {
                l1, i2
        };
        aObject3d_291.method180(2, ai, 0, 0);
        aObject3d_291.anIntArray131[anInt283] = k1;
        aObject3d_291.aByteArray132[anInt283++] = 0;
        return anInt283 - 1;
    }

    public void method265(int i) {
        aObject3d_291.aByteArray132[i] = 1;
    }

    public void method266(int i, int j) {
        anIntArray290[i] = j;
    }

    public void method267(int i, int j) {
        anInt258 = i - anInt267;
        anInt259 = j;
        anInt260 = 0;
        aBoolean257 = true;
    }

    public int method268() {
        return anInt260;
    }

    public int[] method269() {
        return anIntArray263;
    }

    public object3d[] method270() {
        return aObject3dArray262;
    }

    public void method271(int i, int j, int k, int l, int i1, int j1) {
        anInt265 = k;
        anInt266 = l;
        anInt267 = i;
        anInt268 = j;
        anInt264 = i1;
        anInt269 = j1;
        aScanlineArray306 = new scanline[l + j];
        for (int k1 = 0; k1 < l + j; k1++)
            aScanlineArray306[k1] = new scanline();

    }

    public void method272(polygon3d[] aclass4, int i, int j) {
        if (i < j) {
            int k = i - 1;
            int l = j + 1;
            int i1 = (i + j) / 2;
            polygon3d polygon3d = aclass4[i1];
            aclass4[i1] = aclass4[i];
            aclass4[i] = polygon3d;
            int j1 = polygon3d.anInt229;
            while (k < l) {
                do
                    l--;
                while (aclass4[l].anInt229 < j1);
                do
                    k++;
                while (aclass4[k].anInt229 > j1);
                if (k < l) {
                    polygon3d polygon3d_1 = aclass4[k];
                    aclass4[k] = aclass4[l];
                    aclass4[l] = polygon3d_1;
                }
            }
            method272(aclass4, i, l);
            method272(aclass4, l + 1, j);
        }
    }

    public void method273(int i, polygon3d[] aclass4, int j) {
        for (int k = 0; k <= j; k++) {
            aclass4[k].aBoolean235 = false;
            aclass4[k].anInt236 = k;
            aclass4[k].anInt237 = -1;
        }

        int l = 0;
        do {
            while (aclass4[l].aBoolean235)
                l++;
            if (l == j)
                return;
            polygon3d polygon3d = aclass4[l];
            polygon3d.aBoolean235 = true;
            int i1 = l;
            int j1 = l + i;
            if (j1 >= j)
                j1 = j - 1;
            for (int k1 = j1; k1 >= i1 + 1; k1--) {
                polygon3d polygon3d_1 = aclass4[k1];
                if (polygon3d.anInt221 < polygon3d_1.anInt223 && polygon3d_1.anInt221 < polygon3d.anInt223 && polygon3d.anInt222 < polygon3d_1.anInt224 && polygon3d_1.anInt222 < polygon3d.anInt224 && polygon3d.anInt236 != polygon3d_1.anInt237 && !method291(polygon3d, polygon3d_1) && method292(polygon3d_1, polygon3d)) {
                    method274(aclass4, i1, k1);
                    if (aclass4[k1] != polygon3d_1)
                        k1++;
                    i1 = anInt322;
                    polygon3d_1.anInt237 = polygon3d.anInt236;
                }
            }

        } while (true);
    }

    public boolean method274(polygon3d[] aclass4, int i, int j) {
        do {
            polygon3d polygon3d = aclass4[i];
            for (int k = i + 1; k <= j; k++) {
                polygon3d polygon3d_1 = aclass4[k];
                if (!method291(polygon3d_1, polygon3d))
                    break;
                aclass4[i] = polygon3d_1;
                aclass4[k] = polygon3d;
                i = k;
                if (i == j) {
                    anInt322 = i;
                    anInt323 = i - 1;
                    return true;
                }
            }

            polygon3d polygon3d_2 = aclass4[j];
            for (int l = j - 1; l >= i; l--) {
                polygon3d polygon3d_3 = aclass4[l];
                if (!method291(polygon3d_2, polygon3d_3))
                    break;
                aclass4[j] = polygon3d_3;
                aclass4[l] = polygon3d_2;
                j = l;
                if (i == j) {
                    anInt322 = j + 1;
                    anInt323 = j;
                    return true;
                }
            }

            if (i + 1 >= j) {
                anInt322 = i;
                anInt323 = j;
                return false;
            }
            if (!method274(aclass4, i + 1, j)) {
                anInt322 = i;
                return false;
            }
            j = anInt323;
        } while (true);
    }

    public void method275(int i, int j, int k) {
        int l = -anInt274 + 1024 & 0x3ff;
        int i1 = -anInt275 + 1024 & 0x3ff;
        int j1 = -anInt276 + 1024 & 0x3ff;
        if (j1 != 0) {
            int k1 = anIntArray252[j1];
            int j2 = anIntArray252[j1 + 1024];
            int i3 = j * k1 + i * j2 >> 15;
            j = j * j2 - i * k1 >> 15;
            i = i3;
        }
        if (l != 0) {
            int l1 = anIntArray252[l];
            int k2 = anIntArray252[l + 1024];
            int j3 = j * k2 - k * l1 >> 15;
            k = j * l1 + k * k2 >> 15;
            j = j3;
        }
        if (i1 != 0) {
            int i2 = anIntArray252[i1];
            int l2 = anIntArray252[i1 + 1024];
            int k3 = k * i2 + i * l2 >> 15;
            k = k * l2 - i * i2 >> 15;
            i = k3;
        }
        if (i < anInt316)
            anInt316 = i;
        if (i > anInt317)
            anInt317 = i;
        if (j < anInt318)
            anInt318 = j;
        if (j > anInt319)
            anInt319 = j;
        if (k < anInt320)
            anInt320 = k;
        if (k > anInt321)
            anInt321 = k;
    }

    public void method276() {
        aBoolean315 = aPixmap_304.aBoolean208;
        int i3 = anInt265 * anInt248 >> anInt269;
        int j3 = anInt266 * anInt248 >> anInt269;
        anInt316 = 0;
        anInt317 = 0;
        anInt318 = 0;
        anInt319 = 0;
        anInt320 = 0;
        anInt321 = 0;
        method275(-i3, -j3, anInt248);
        method275(-i3, j3, anInt248);
        method275(i3, -j3, anInt248);
        method275(i3, j3, anInt248);
        method275(-anInt265, -anInt266, 0);
        method275(-anInt265, anInt266, 0);
        method275(anInt265, -anInt266, 0);
        method275(anInt265, anInt266, 0);
        anInt316 += anInt271;
        anInt317 += anInt271;
        anInt318 += anInt272;
        anInt319 += anInt272;
        anInt320 += anInt273;
        anInt321 += anInt273;
        aObject3dArray279[anInt277] = aObject3d_291;
        aObject3d_291.anInt119 = 2;
        for (int i = 0; i < anInt277; i++)
            aObject3dArray279[i].method200(anInt271, anInt272, anInt273, anInt274, anInt275, anInt276, anInt269, anInt247);

        aObject3dArray279[anInt277].method200(anInt271, anInt272, anInt273, anInt274, anInt275, anInt276, anInt269, anInt247);
        anInt281 = 0;
        for (int k3 = 0; k3 < anInt277; k3++) {
            object3d object3d = aObject3dArray279[k3];
            if (object3d.aBoolean120) {
                for (int j = 0; j < object3d.anInt107; j++) {
                    int l3 = object3d.anIntArray108[j];
                    int[] ai1 = object3d.anIntArrayArray109[j];
                    boolean flag = false;
                    for (int k4 = 0; k4 < l3; k4++) {
                        int i1 = object3d.anIntArray102[ai1[k4]];
                        if (i1 <= anInt247 || i1 >= anInt248)
                            continue;
                        flag = true;
                        break;
                    }

                    if (flag) {
                        int l1 = 0;
                        for (int k5 = 0; k5 < l3; k5++) {
                            int j1 = object3d.anIntArray103[ai1[k5]];
                            if (j1 > -anInt265)
                                l1 |= 1;
                            if (j1 < anInt265)
                                l1 |= 2;
                            if (l1 == 3)
                                break;
                        }

                        if (l1 == 3) {
                            int i2 = 0;
                            for (int l6 = 0; l6 < l3; l6++) {
                                int k1 = object3d.anIntArray104[ai1[l6]];
                                if (k1 > -anInt266)
                                    i2 |= 1;
                                if (k1 < anInt266)
                                    i2 |= 2;
                                if (i2 == 3)
                                    break;
                            }

                            if (i2 == 3) {
                                polygon3d polygon3d_1 = aPolygon3dArray282[anInt281];
                                polygon3d_1.aObject3d_227 = object3d;
                                polygon3d_1.anInt228 = j;
                                method289(anInt281);
                                int l8;
                                if (polygon3d_1.anInt233 < 0)
                                    l8 = object3d.anIntArray110[j];
                                else
                                    l8 = object3d.anIntArray111[j];
                                if (l8 != 0xbc614e) {
                                    int j2 = 0;
                                    for (int l9 = 0; l9 < l3; l9++)
                                        j2 += object3d.anIntArray102[ai1[l9]];

                                    int l2;
                                    polygon3d_1.anInt229 = l2 = j2 / l3 + object3d.anInt118;
                                    polygon3d_1.anInt234 = l8;
                                    anInt281++;
                                }
                            }
                        }
                    }
                }

            }
        }

        object3d object3d_1 = aObject3d_291;
        if (object3d_1.aBoolean120) {
            for (int k = 0; k < object3d_1.anInt107; k++) {
                int[] ai = object3d_1.anIntArrayArray109[k];
                int j4 = ai[0];
                int l4 = object3d_1.anIntArray103[j4];
                int l5 = object3d_1.anIntArray104[j4];
                int i7 = object3d_1.anIntArray102[j4];
                if (i7 > anInt247 && i7 < anInt249) {
                    int i8 = (anIntArray288[k] << anInt269) / i7;
                    int i9 = (anIntArray289[k] << anInt269) / i7;
                    if (l4 - i8 / 2 <= anInt265 && l4 + i8 / 2 >= -anInt265 && l5 - i9 <= anInt266 && l5 >= -anInt266) {
                        polygon3d polygon3d_2 = aPolygon3dArray282[anInt281];
                        polygon3d_2.aObject3d_227 = object3d_1;
                        polygon3d_2.anInt228 = k;
                        method290(anInt281);
                        polygon3d_2.anInt229 = (i7 + object3d_1.anIntArray102[ai[1]]) / 2;
                        anInt281++;
                    }
                }
            }

        }
        if (anInt281 == 0)
            return;
        anInt246 = anInt281;
        method272(aPolygon3dArray282, 0, anInt281 - 1);
        method273(100, aPolygon3dArray282, anInt281);
        for (int i4 = 0; i4 < anInt281; i4++) {
            polygon3d polygon3d = aPolygon3dArray282[i4];
            object3d object3d = polygon3d.aObject3d_227;
            int l = polygon3d.anInt228;
            if (object3d == aObject3d_291) {
                int[] ai2 = object3d.anIntArrayArray109[l];
                int i6 = ai2[0];
                int j7 = object3d.anIntArray103[i6];
                int j8 = object3d.anIntArray104[i6];
                int j9 = object3d.anIntArray102[i6];
                int i10 = (anIntArray288[l] << anInt269) / j9;
                int k10 = (anIntArray289[l] << anInt269) / j9;
                int i11 = j8 - object3d.anIntArray104[ai2[1]];
                int j11 = ((object3d.anIntArray103[ai2[1]] - j7) * i11) / k10;
                j11 = object3d.anIntArray103[ai2[1]] - j7;
                int l11 = j7 - i10 / 2;
                int j12 = (anInt268 + j8) - k10;
                aPixmap_304.method244(l11 + anInt267, j12, i10, k10, anIntArray284[l], j11, (256 << anInt269) / j9);
                if (aBoolean257 && anInt260 < anInt261) {
                    l11 += (anIntArray290[l] << anInt269) / j9;
                    if (anInt259 >= j12 && anInt259 <= j12 + k10 && anInt258 >= l11 && anInt258 <= l11 + i10 && !object3d.aBoolean136 && object3d.aByteArray132[l] == 0) {
                        aObject3dArray262[anInt260] = object3d;
                        anIntArray263[anInt260] = l;
                        anInt260++;
                    }
                }
            } else {
                int k8 = 0;
                int j10 = 0;
                int l10 = object3d.anIntArray108[l];
                int[] ai3 = object3d.anIntArrayArray109[l];
                if (object3d.anIntArray114[l] != 0xbc614e)
                    if (polygon3d.anInt233 < 0)
                        j10 = object3d.anInt181 - object3d.anIntArray114[l];
                    else
                        j10 = object3d.anInt181 + object3d.anIntArray114[l];
                for (int k11 = 0; k11 < l10; k11++) {
                    int k2 = ai3[k11];
                    anIntArray312[k11] = object3d.anIntArray100[k2];
                    anIntArray313[k11] = object3d.anIntArray101[k2];
                    anIntArray314[k11] = object3d.anIntArray102[k2];
                    if (object3d.anIntArray114[l] == 0xbc614e)
                        if (polygon3d.anInt233 < 0)
                            j10 = (object3d.anInt181 - object3d.anIntArray105[k2]) + object3d.aByteArray106[k2];
                        else
                            j10 = object3d.anInt181 + object3d.anIntArray105[k2] + object3d.aByteArray106[k2];
                    if (object3d.anIntArray102[k2] >= anInt247) {
                        anIntArray309[k8] = object3d.anIntArray103[k2];
                        anIntArray310[k8] = object3d.anIntArray104[k2];
                        anIntArray311[k8] = j10;
                        if (object3d.anIntArray102[k2] > anInt251)
                            anIntArray311[k8] += (object3d.anIntArray102[k2] - anInt251) / anInt250;
                        k8++;
                    } else {
                        int k9;
                        if (k11 == 0)
                            k9 = ai3[l10 - 1];
                        else
                            k9 = ai3[k11 - 1];
                        if (object3d.anIntArray102[k9] >= anInt247) {
                            int k7 = object3d.anIntArray102[k2] - object3d.anIntArray102[k9];
                            int i5 = object3d.anIntArray100[k2] - ((object3d.anIntArray100[k2] - object3d.anIntArray100[k9]) * (object3d.anIntArray102[k2] - anInt247)) / k7;
                            int j6 = object3d.anIntArray101[k2] - ((object3d.anIntArray101[k2] - object3d.anIntArray101[k9]) * (object3d.anIntArray102[k2] - anInt247)) / k7;
                            anIntArray309[k8] = (i5 << anInt269) / anInt247;
                            anIntArray310[k8] = (j6 << anInt269) / anInt247;
                            anIntArray311[k8] = j10;
                            k8++;
                        }
                        if (k11 == l10 - 1)
                            k9 = ai3[0];
                        else
                            k9 = ai3[k11 + 1];
                        if (object3d.anIntArray102[k9] >= anInt247) {
                            int l7 = object3d.anIntArray102[k2] - object3d.anIntArray102[k9];
                            int j5 = object3d.anIntArray100[k2] - ((object3d.anIntArray100[k2] - object3d.anIntArray100[k9]) * (object3d.anIntArray102[k2] - anInt247)) / l7;
                            int k6 = object3d.anIntArray101[k2] - ((object3d.anIntArray101[k2] - object3d.anIntArray101[k9]) * (object3d.anIntArray102[k2] - anInt247)) / l7;
                            anIntArray309[k8] = (j5 << anInt269) / anInt247;
                            anIntArray310[k8] = (k6 << anInt269) / anInt247;
                            anIntArray311[k8] = j10;
                            k8++;
                        }
                    }
                }

                for (int i12 = 0; i12 < l10; i12++) {
                    if (anIntArray311[i12] < 0)
                        anIntArray311[i12] = 0;
                    else if (anIntArray311[i12] > 255)
                        anIntArray311[i12] = 255;
                    if (polygon3d.anInt234 >= 0)
                        if (anIntArray295[polygon3d.anInt234] == 1)
                            anIntArray311[i12] <<= 9;
                        else
                            anIntArray311[i12] <<= 6;
                }

                method277(0, 0, 0, 0, k8, anIntArray309, anIntArray310, anIntArray311, object3d, l);
                if (anInt308 > anInt307)
                    method278(0, 0, l10, anIntArray312, anIntArray313, anIntArray314, polygon3d.anInt234, object3d);
            }
        }

        aBoolean257 = false;
    }

    public void method277(int i, int j, int k, int l, int i1, int[] ai, int[] ai1,
                          int[] ai2, object3d object3d, int j1) {
        if (i1 == 3) {
            int k1 = ai1[0] + anInt268;
            int k2 = ai1[1] + anInt268;
            int k3 = ai1[2] + anInt268;
            int k4 = ai[0];
            int l5 = ai[1];
            int j7 = ai[2];
            int l8 = ai2[0];
            int j10 = ai2[1];
            int j11 = ai2[2];
            int j12 = (anInt268 + anInt266) - 1;
            int l12 = 0;
            int j13 = 0;
            int l13 = 0;
            int j14 = 0;
            int l14 = 0xbc614e;
            int j15 = 0xff439eb2;
            if (k3 != k1) {
                j13 = (j7 - k4 << 8) / (k3 - k1);
                j14 = (j11 - l8 << 8) / (k3 - k1);
                if (k1 < k3) {
                    l12 = k4 << 8;
                    l13 = l8 << 8;
                    l14 = k1;
                    j15 = k3;
                } else {
                    l12 = j7 << 8;
                    l13 = j11 << 8;
                    l14 = k3;
                    j15 = k1;
                }
                if (l14 < 0) {
                    l12 -= j13 * l14;
                    l13 -= j14 * l14;
                    l14 = 0;
                }
                if (j15 > j12)
                    j15 = j12;
            }
            int l15 = 0;
            int j16 = 0;
            int l16 = 0;
            int j17 = 0;
            int l17 = 0xbc614e;
            int j18 = 0xff439eb2;
            if (k2 != k1) {
                j16 = (l5 - k4 << 8) / (k2 - k1);
                j17 = (j10 - l8 << 8) / (k2 - k1);
                if (k1 < k2) {
                    l15 = k4 << 8;
                    l16 = l8 << 8;
                    l17 = k1;
                    j18 = k2;
                } else {
                    l15 = l5 << 8;
                    l16 = j10 << 8;
                    l17 = k2;
                    j18 = k1;
                }
                if (l17 < 0) {
                    l15 -= j16 * l17;
                    l16 -= j17 * l17;
                    l17 = 0;
                }
                if (j18 > j12)
                    j18 = j12;
            }
            int l18 = 0;
            int j19 = 0;
            int l19 = 0;
            int j20 = 0;
            int l20 = 0xbc614e;
            int j21 = 0xff439eb2;
            if (k3 != k2) {
                j19 = (j7 - l5 << 8) / (k3 - k2);
                j20 = (j11 - j10 << 8) / (k3 - k2);
                if (k2 < k3) {
                    l18 = l5 << 8;
                    l19 = j10 << 8;
                    l20 = k2;
                    j21 = k3;
                } else {
                    l18 = j7 << 8;
                    l19 = j11 << 8;
                    l20 = k3;
                    j21 = k2;
                }
                if (l20 < 0) {
                    l18 -= j19 * l20;
                    l19 -= j20 * l20;
                    l20 = 0;
                }
                if (j21 > j12)
                    j21 = j12;
            }
            anInt307 = l14;
            if (l17 < anInt307)
                anInt307 = l17;
            if (l20 < anInt307)
                anInt307 = l20;
            anInt308 = j15;
            if (j18 > anInt308)
                anInt308 = j18;
            if (j21 > anInt308)
                anInt308 = j21;
            int l21 = 0;
            for (k = anInt307; k < anInt308; k++) {
                if (k >= l14 && k < j15) {
                    i = j = l12;
                    l = l21 = l13;
                    l12 += j13;
                    l13 += j14;
                } else {
                    i = 0xa0000;
                    j = 0xfff60000;
                }
                if (k >= l17 && k < j18) {
                    if (l15 < i) {
                        i = l15;
                        l = l16;
                    }
                    if (l15 > j) {
                        j = l15;
                        l21 = l16;
                    }
                    l15 += j16;
                    l16 += j17;
                }
                if (k >= l20 && k < j21) {
                    if (l18 < i) {
                        i = l18;
                        l = l19;
                    }
                    if (l18 > j) {
                        j = l18;
                        l21 = l19;
                    }
                    l18 += j19;
                    l19 += j20;
                }
                scanline scanline_6 = aScanlineArray306[k];
                scanline_6.startX = i;
                scanline_6.endX = j;
                scanline_6.startS = l;
                scanline_6.endS = l21;
            }

            if (anInt307 < anInt268 - anInt266)
                anInt307 = anInt268 - anInt266;
        } else if (i1 == 4) {
            int l1 = ai1[0] + anInt268;
            int l2 = ai1[1] + anInt268;
            int l3 = ai1[2] + anInt268;
            int l4 = ai1[3] + anInt268;
            int i6 = ai[0];
            int k7 = ai[1];
            int i9 = ai[2];
            int k10 = ai[3];
            int k11 = ai2[0];
            int k12 = ai2[1];
            int i13 = ai2[2];
            int k13 = ai2[3];
            int i14 = (anInt268 + anInt266) - 1;
            int k14 = 0;
            int i15 = 0;
            int k15 = 0;
            int i16 = 0;
            int k16 = 0xbc614e;
            int i17 = 0xff439eb2;
            if (l4 != l1) {
                i15 = (k10 - i6 << 8) / (l4 - l1);
                i16 = (k13 - k11 << 8) / (l4 - l1);
                if (l1 < l4) {
                    k14 = i6 << 8;
                    k15 = k11 << 8;
                    k16 = l1;
                    i17 = l4;
                } else {
                    k14 = k10 << 8;
                    k15 = k13 << 8;
                    k16 = l4;
                    i17 = l1;
                }
                if (k16 < 0) {
                    k14 -= i15 * k16;
                    k15 -= i16 * k16;
                    k16 = 0;
                }
                if (i17 > i14)
                    i17 = i14;
            }
            int k17 = 0;
            int i18 = 0;
            int k18 = 0;
            int i19 = 0;
            int k19 = 0xbc614e;
            int i20 = 0xff439eb2;
            if (l2 != l1) {
                i18 = (k7 - i6 << 8) / (l2 - l1);
                i19 = (k12 - k11 << 8) / (l2 - l1);
                if (l1 < l2) {
                    k17 = i6 << 8;
                    k18 = k11 << 8;
                    k19 = l1;
                    i20 = l2;
                } else {
                    k17 = k7 << 8;
                    k18 = k12 << 8;
                    k19 = l2;
                    i20 = l1;
                }
                if (k19 < 0) {
                    k17 -= i18 * k19;
                    k18 -= i19 * k19;
                    k19 = 0;
                }
                if (i20 > i14)
                    i20 = i14;
            }
            int k20 = 0;
            int i21 = 0;
            int k21 = 0;
            int i22 = 0;
            int j22 = 0xbc614e;
            int k22 = 0xff439eb2;
            if (l3 != l2) {
                i21 = (i9 - k7 << 8) / (l3 - l2);
                i22 = (i13 - k12 << 8) / (l3 - l2);
                if (l2 < l3) {
                    k20 = k7 << 8;
                    k21 = k12 << 8;
                    j22 = l2;
                    k22 = l3;
                } else {
                    k20 = i9 << 8;
                    k21 = i13 << 8;
                    j22 = l3;
                    k22 = l2;
                }
                if (j22 < 0) {
                    k20 -= i21 * j22;
                    k21 -= i22 * j22;
                    j22 = 0;
                }
                if (k22 > i14)
                    k22 = i14;
            }
            int l22 = 0;
            int i23 = 0;
            int j23 = 0;
            int k23 = 0;
            int l23 = 0xbc614e;
            int i24 = 0xff439eb2;
            if (l4 != l3) {
                i23 = (k10 - i9 << 8) / (l4 - l3);
                k23 = (k13 - i13 << 8) / (l4 - l3);
                if (l3 < l4) {
                    l22 = i9 << 8;
                    j23 = i13 << 8;
                    l23 = l3;
                    i24 = l4;
                } else {
                    l22 = k10 << 8;
                    j23 = k13 << 8;
                    l23 = l4;
                    i24 = l3;
                }
                if (l23 < 0) {
                    l22 -= i23 * l23;
                    j23 -= k23 * l23;
                    l23 = 0;
                }
                if (i24 > i14)
                    i24 = i14;
            }
            anInt307 = k16;
            if (k19 < anInt307)
                anInt307 = k19;
            if (j22 < anInt307)
                anInt307 = j22;
            if (l23 < anInt307)
                anInt307 = l23;
            anInt308 = i17;
            if (i20 > anInt308)
                anInt308 = i20;
            if (k22 > anInt308)
                anInt308 = k22;
            if (i24 > anInt308)
                anInt308 = i24;
            int j24 = 0;
            for (k = anInt307; k < anInt308; k++) {
                if (k >= k16 && k < i17) {
                    i = j = k14;
                    l = j24 = k15;
                    k14 += i15;
                    k15 += i16;
                } else {
                    i = 0xa0000;
                    j = 0xfff60000;
                }
                if (k >= k19 && k < i20) {
                    if (k17 < i) {
                        i = k17;
                        l = k18;
                    }
                    if (k17 > j) {
                        j = k17;
                        j24 = k18;
                    }
                    k17 += i18;
                    k18 += i19;
                }
                if (k >= j22 && k < k22) {
                    if (k20 < i) {
                        i = k20;
                        l = k21;
                    }
                    if (k20 > j) {
                        j = k20;
                        j24 = k21;
                    }
                    k20 += i21;
                    k21 += i22;
                }
                if (k >= l23 && k < i24) {
                    if (l22 < i) {
                        i = l22;
                        l = j23;
                    }
                    if (l22 > j) {
                        j = l22;
                        j24 = j23;
                    }
                    l22 += i23;
                    j23 += k23;
                }
                scanline scanline_7 = aScanlineArray306[k];
                scanline_7.startX = i;
                scanline_7.endX = j;
                scanline_7.startS = l;
                scanline_7.endS = j24;
            }

            if (anInt307 < anInt268 - anInt266)
                anInt307 = anInt268 - anInt266;
        } else {
            anInt308 = anInt307 = ai1[0] += anInt268;
            for (k = 1; k < i1; k++) {
                int i2;
                if ((i2 = ai1[k] += anInt268) < anInt307)
                    anInt307 = i2;
                else if (i2 > anInt308)
                    anInt308 = i2;
            }

            if (anInt307 < anInt268 - anInt266)
                anInt307 = anInt268 - anInt266;
            if (anInt308 >= anInt268 + anInt266)
                anInt308 = (anInt268 + anInt266) - 1;
            if (anInt307 >= anInt308)
                return;
            for (k = anInt307; k < anInt308; k++) {
                scanline scanline = aScanlineArray306[k];
                scanline.startX = 0xa0000;
                scanline.endX = 0xfff60000;
            }

            int j2 = i1 - 1;
            int i3 = ai1[0];
            int i4 = ai1[j2];
            if (i3 < i4) {
                int i5 = ai[0] << 8;
                int j6 = (ai[j2] - ai[0] << 8) / (i4 - i3);
                int l7 = ai2[0] << 8;
                int j9 = (ai2[j2] - ai2[0] << 8) / (i4 - i3);
                if (i3 < 0) {
                    i5 -= j6 * i3;
                    l7 -= j9 * i3;
                    i3 = 0;
                }
                if (i4 > anInt308)
                    i4 = anInt308;
                for (k = i3; k <= i4; k++) {
                    scanline scanline_2 = aScanlineArray306[k];
                    scanline_2.startX = scanline_2.endX = i5;
                    scanline_2.startS = scanline_2.endS = l7;
                    i5 += j6;
                    l7 += j9;
                }

            } else if (i3 > i4) {
                int j5 = ai[j2] << 8;
                int k6 = (ai[0] - ai[j2] << 8) / (i3 - i4);
                int i8 = ai2[j2] << 8;
                int k9 = (ai2[0] - ai2[j2] << 8) / (i3 - i4);
                if (i4 < 0) {
                    j5 -= k6 * i4;
                    i8 -= k9 * i4;
                    i4 = 0;
                }
                if (i3 > anInt308)
                    i3 = anInt308;
                for (k = i4; k <= i3; k++) {
                    scanline scanline_3 = aScanlineArray306[k];
                    scanline_3.startX = scanline_3.endX = j5;
                    scanline_3.startS = scanline_3.endS = i8;
                    j5 += k6;
                    i8 += k9;
                }

            }
            for (k = 0; k < j2; k++) {
                int k5 = k + 1;
                int j3 = ai1[k];
                int j4 = ai1[k5];
                if (j3 < j4) {
                    int l6 = ai[k] << 8;
                    int j8 = (ai[k5] - ai[k] << 8) / (j4 - j3);
                    int l9 = ai2[k] << 8;
                    int l10 = (ai2[k5] - ai2[k] << 8) / (j4 - j3);
                    if (j3 < 0) {
                        l6 -= j8 * j3;
                        l9 -= l10 * j3;
                        j3 = 0;
                    }
                    if (j4 > anInt308)
                        j4 = anInt308;
                    for (int l11 = j3; l11 <= j4; l11++) {
                        scanline scanline_4 = aScanlineArray306[l11];
                        if (l6 < scanline_4.startX) {
                            scanline_4.startX = l6;
                            scanline_4.startS = l9;
                        }
                        if (l6 > scanline_4.endX) {
                            scanline_4.endX = l6;
                            scanline_4.endS = l9;
                        }
                        l6 += j8;
                        l9 += l10;
                    }

                } else if (j3 > j4) {
                    int i7 = ai[k5] << 8;
                    int k8 = (ai[k] - ai[k5] << 8) / (j3 - j4);
                    int i10 = ai2[k5] << 8;
                    int i11 = (ai2[k] - ai2[k5] << 8) / (j3 - j4);
                    if (j4 < 0) {
                        i7 -= k8 * j4;
                        i10 -= i11 * j4;
                        j4 = 0;
                    }
                    if (j3 > anInt308)
                        j3 = anInt308;
                    for (int i12 = j4; i12 <= j3; i12++) {
                        scanline scanline = aScanlineArray306[i12];
                        if (i7 < scanline.startX) {
                            scanline.startX = i7;
                            scanline.startS = i10;
                        }
                        if (i7 > scanline.endX) {
                            scanline.endX = i7;
                            scanline.endS = i10;
                        }
                        i7 += k8;
                        i10 += i11;
                    }

                }
            }

            if (anInt307 < anInt268 - anInt266)
                anInt307 = anInt268 - anInt266;
        }
        if (aBoolean257 && anInt260 < anInt261 && anInt259 >= anInt307 && anInt259 < anInt308) {
            scanline scanline_1 = aScanlineArray306[anInt259];
            if (anInt258 >= scanline_1.startX >> 8 && anInt258 <= scanline_1.endX >> 8 && scanline_1.startX <= scanline_1.endX && !object3d.aBoolean136 && object3d.aByteArray132[j1] == 0) {
                aObject3dArray262[anInt260] = object3d;
                anIntArray263[anInt260] = j1;
                anInt260++;
            }
        }
    }

    public void method278(int i, int j, int k, int[] ai, int[] ai1, int[] ai2, int l,
                          object3d object3d) {
        if (l == -2)
            return;
        if (l >= 0) {
            if (l >= anInt292)
                l = 0;
            method295(l);
            int i1 = ai[0];
            int k1 = ai1[0];
            int j2 = ai2[0];
            int i3 = i1 - ai[1];
            int k3 = k1 - ai1[1];
            int i4 = j2 - ai2[1];
            k--;
            int i6 = ai[k] - i1;
            int j7 = ai1[k] - k1;
            int k8 = ai2[k] - j2;
            if (anIntArray295[l] == 1) {
                int l9 = i6 * k1 - j7 * i1 << 12;
                int k10 = j7 * j2 - k8 * k1 << (5 - anInt269) + 7 + 4;
                int i11 = k8 * i1 - i6 * j2 << (5 - anInt269) + 7;
                int k11 = i3 * k1 - k3 * i1 << 12;
                int i12 = k3 * j2 - i4 * k1 << (5 - anInt269) + 7 + 4;
                int k12 = i4 * i1 - i3 * j2 << (5 - anInt269) + 7;
                int i13 = k3 * i6 - i3 * j7 << 5;
                int k13 = i4 * j7 - k3 * k8 << (5 - anInt269) + 4;
                int i14 = i3 * k8 - i4 * i6 >> anInt269 - 5;
                int k14 = k10 >> 4;
                int i15 = i12 >> 4;
                int k15 = k13 >> 4;
                int i16 = anInt307 - anInt268;
                int k16 = anInt264;
                int i17 = anInt267 + anInt307 * k16;
                byte byte1 = 1;
                l9 += i11 * i16;
                k11 += k12 * i16;
                i13 += i14 * i16;
                if (aBoolean315) {
                    if ((anInt307 & 1) == 1) {
                        anInt307++;
                        l9 += i11;
                        k11 += k12;
                        i13 += i14;
                        i17 += k16;
                    }
                    i11 <<= 1;
                    k12 <<= 1;
                    i14 <<= 1;
                    k16 <<= 1;
                    byte1 = 2;
                }
                if (object3d.aBoolean128) {
                    for (i = anInt307; i < anInt308; i += byte1) {
                        scanline scanline_3 = aScanlineArray306[i];
                        j = scanline_3.startX >> 8;
                        int k17 = scanline_3.endX >> 8;
                        int k20 = k17 - j;
                        if (k20 <= 0) {
                            l9 += i11;
                            k11 += k12;
                            i13 += i14;
                            i17 += k16;
                        } else {
                            int i22 = scanline_3.startS;
                            int k23 = (scanline_3.endS - i22) / k20;
                            if (j < -anInt265) {
                                i22 += (-anInt265 - j) * k23;
                                j = -anInt265;
                                k20 = k17 - j;
                            }
                            if (k17 > anInt265) {
                                int l17 = anInt265;
                                k20 = l17 - j;
                            }
                            method280(anIntArray305, anIntArrayArray297[l], 0, 0, l9 + k14 * j, k11 + i15 * j, i13 + k15 * j, k10, i12, k13, k20, i17 + j, i22, k23 << 2);
                            l9 += i11;
                            k11 += k12;
                            i13 += i14;
                            i17 += k16;
                        }
                    }

                    return;
                }
                if (!aBooleanArray298[l]) {
                    for (i = anInt307; i < anInt308; i += byte1) {
                        scanline scanline_4 = aScanlineArray306[i];
                        j = scanline_4.startX >> 8;
                        int i18 = scanline_4.endX >> 8;
                        int l20 = i18 - j;
                        if (l20 <= 0) {
                            l9 += i11;
                            k11 += k12;
                            i13 += i14;
                            i17 += k16;
                        } else {
                            int j22 = scanline_4.startS;
                            int l23 = (scanline_4.endS - j22) / l20;
                            if (j < -anInt265) {
                                j22 += (-anInt265 - j) * l23;
                                j = -anInt265;
                                l20 = i18 - j;
                            }
                            if (i18 > anInt265) {
                                int j18 = anInt265;
                                l20 = j18 - j;
                            }
                            method279(anIntArray305, anIntArrayArray297[l], 0, 0, l9 + k14 * j, k11 + i15 * j, i13 + k15 * j, k10, i12, k13, l20, i17 + j, j22, l23 << 2);
                            l9 += i11;
                            k11 += k12;
                            i13 += i14;
                            i17 += k16;
                        }
                    }

                    return;
                }
                for (i = anInt307; i < anInt308; i += byte1) {
                    scanline scanline = aScanlineArray306[i];
                    j = scanline.startX >> 8;
                    int k18 = scanline.endX >> 8;
                    int i21 = k18 - j;
                    if (i21 <= 0) {
                        l9 += i11;
                        k11 += k12;
                        i13 += i14;
                        i17 += k16;
                    } else {
                        int k22 = scanline.startS;
                        int i24 = (scanline.endS - k22) / i21;
                        if (j < -anInt265) {
                            k22 += (-anInt265 - j) * i24;
                            j = -anInt265;
                            i21 = k18 - j;
                        }
                        if (k18 > anInt265) {
                            int l18 = anInt265;
                            i21 = l18 - j;
                        }
                        method281(anIntArray305, 0, 0, 0, anIntArrayArray297[l], l9 + k14 * j, k11 + i15 * j, i13 + k15 * j, k10, i12, k13, i21, i17 + j, k22, i24);
                        l9 += i11;
                        k11 += k12;
                        i13 += i14;
                        i17 += k16;
                    }
                }

                return;
            }
            int i10 = i6 * k1 - j7 * i1 << 11;
            int l10 = j7 * j2 - k8 * k1 << (5 - anInt269) + 6 + 4;
            int j11 = k8 * i1 - i6 * j2 << (5 - anInt269) + 6;
            int l11 = i3 * k1 - k3 * i1 << 11;
            int j12 = k3 * j2 - i4 * k1 << (5 - anInt269) + 6 + 4;
            int l12 = i4 * i1 - i3 * j2 << (5 - anInt269) + 6;
            int j13 = k3 * i6 - i3 * j7 << 5;
            int l13 = i4 * j7 - k3 * k8 << (5 - anInt269) + 4;
            int j14 = i3 * k8 - i4 * i6 >> anInt269 - 5;
            int l14 = l10 >> 4;
            int j15 = j12 >> 4;
            int l15 = l13 >> 4;
            int j16 = anInt307 - anInt268;
            int l16 = anInt264;
            int j17 = anInt267 + anInt307 * l16;
            byte byte2 = 1;
            i10 += j11 * j16;
            l11 += l12 * j16;
            j13 += j14 * j16;
            if (aBoolean315) {
                if ((anInt307 & 1) == 1) {
                    anInt307++;
                    i10 += j11;
                    l11 += l12;
                    j13 += j14;
                    j17 += l16;
                }
                j11 <<= 1;
                l12 <<= 1;
                j14 <<= 1;
                l16 <<= 1;
                byte2 = 2;
            }
            if (object3d.aBoolean128) {
                for (i = anInt307; i < anInt308; i += byte2) {
                    scanline scanline_6 = aScanlineArray306[i];
                    j = scanline_6.startX >> 8;
                    int i19 = scanline_6.endX >> 8;
                    int j21 = i19 - j;
                    if (j21 <= 0) {
                        i10 += j11;
                        l11 += l12;
                        j13 += j14;
                        j17 += l16;
                    } else {
                        int l22 = scanline_6.startS;
                        int j24 = (scanline_6.endS - l22) / j21;
                        if (j < -anInt265) {
                            l22 += (-anInt265 - j) * j24;
                            j = -anInt265;
                            j21 = i19 - j;
                        }
                        if (i19 > anInt265) {
                            int j19 = anInt265;
                            j21 = j19 - j;
                        }
                        method283(anIntArray305, anIntArrayArray297[l], 0, 0, i10 + l14 * j, l11 + j15 * j, j13 + l15 * j, l10, j12, l13, j21, j17 + j, l22, j24);
                        i10 += j11;
                        l11 += l12;
                        j13 += j14;
                        j17 += l16;
                    }
                }

                return;
            }
            if (!aBooleanArray298[l]) {
                for (i = anInt307; i < anInt308; i += byte2) {
                    scanline scanline_7 = aScanlineArray306[i];
                    j = scanline_7.startX >> 8;
                    int k19 = scanline_7.endX >> 8;
                    int k21 = k19 - j;
                    if (k21 <= 0) {
                        i10 += j11;
                        l11 += l12;
                        j13 += j14;
                        j17 += l16;
                    } else {
                        int i23 = scanline_7.startS;
                        int k24 = (scanline_7.endS - i23) / k21;
                        if (j < -anInt265) {
                            i23 += (-anInt265 - j) * k24;
                            j = -anInt265;
                            k21 = k19 - j;
                        }
                        if (k19 > anInt265) {
                            int l19 = anInt265;
                            k21 = l19 - j;
                        }
                        method282(anIntArray305, anIntArrayArray297[l], 0, 0, i10 + l14 * j, l11 + j15 * j, j13 + l15 * j, l10, j12, l13, k21, j17 + j, i23, k24);
                        i10 += j11;
                        l11 += l12;
                        j13 += j14;
                        j17 += l16;
                    }
                }

                return;
            }
            for (i = anInt307; i < anInt308; i += byte2) {
                scanline scanline_8 = aScanlineArray306[i];
                j = scanline_8.startX >> 8;
                int i20 = scanline_8.endX >> 8;
                int l21 = i20 - j;
                if (l21 <= 0) {
                    i10 += j11;
                    l11 += l12;
                    j13 += j14;
                    j17 += l16;
                } else {
                    int j23 = scanline_8.startS;
                    int l24 = (scanline_8.endS - j23) / l21;
                    if (j < -anInt265) {
                        j23 += (-anInt265 - j) * l24;
                        j = -anInt265;
                        l21 = i20 - j;
                    }
                    if (i20 > anInt265) {
                        int j20 = anInt265;
                        l21 = j20 - j;
                    }
                    method284(anIntArray305, 0, 0, 0, anIntArrayArray297[l], i10 + l14 * j, l11 + j15 * j, j13 + l15 * j, l10, j12, l13, l21, j17 + j, j23, l24);
                    i10 += j11;
                    l11 += l12;
                    j13 += j14;
                    j17 += l16;
                }
            }

            return;
        }
        for (int j1 = 0; j1 < anInt242; j1++) {
            if (anIntArray243[j1] == l) {
                anIntArray245 = anIntArrayArray244[j1];
                break;
            }
            if (j1 == anInt242 - 1) {
                int l1 = (int) (Math.random() * (double) anInt242);
                anIntArray243[l1] = l;
                l = -1 - l;
                int k2 = (l >> 10 & 0x1f) * 8;
                int j3 = (l >> 5 & 0x1f) * 8;
                int l3 = (l & 0x1f) * 8;
                for (int j4 = 0; j4 < 256; j4++) {
                    int j6 = j4 * j4;
                    int k7 = (k2 * j6) / 0x10000;
                    int l8 = (j3 * j6) / 0x10000;
                    int j10 = (l3 * j6) / 0x10000;
                    anIntArrayArray244[l1][255 - j4] = (k7 << 16) + (l8 << 8) + j10;
                }

                anIntArray245 = anIntArrayArray244[l1];
            }
        }

        int i2 = anInt264;
        int l2 = anInt267 + anInt307 * i2;
        byte byte0 = 1;
        if (aBoolean315) {
            if ((anInt307 & 1) == 1) {
                anInt307++;
                l2 += i2;
            }
            i2 <<= 1;
            byte0 = 2;
        }
        if (object3d.aBoolean129) {
            for (i = anInt307; i < anInt308; i += byte0) {
                scanline scanline = aScanlineArray306[i];
                j = scanline.startX >> 8;
                int k4 = scanline.endX >> 8;
                int k6 = k4 - j;
                if (k6 <= 0) {
                    l2 += i2;
                } else {
                    int l7 = scanline.startS;
                    int i9 = (scanline.endS - l7) / k6;
                    if (j < -anInt265) {
                        l7 += (-anInt265 - j) * i9;
                        j = -anInt265;
                        k6 = k4 - j;
                    }
                    if (k4 > anInt265) {
                        int l4 = anInt265;
                        k6 = l4 - j;
                    }
                    method286(anIntArray305, -k6, l2 + j, 0, anIntArray245, l7, i9);
                    l2 += i2;
                }
            }

            return;
        }
        if (aBoolean254) {
            for (i = anInt307; i < anInt308; i += byte0) {
                scanline scanline_1 = aScanlineArray306[i];
                j = scanline_1.startX >> 8;
                int i5 = scanline_1.endX >> 8;
                int l6 = i5 - j;
                if (l6 <= 0) {
                    l2 += i2;
                } else {
                    int i8 = scanline_1.startS;
                    int j9 = (scanline_1.endS - i8) / l6;
                    if (j < -anInt265) {
                        i8 += (-anInt265 - j) * j9;
                        j = -anInt265;
                        l6 = i5 - j;
                    }
                    if (i5 > anInt265) {
                        int j5 = anInt265;
                        l6 = j5 - j;
                    }
                    method285(anIntArray305, -l6, l2 + j, 0, anIntArray245, i8, j9);
                    l2 += i2;
                }
            }

            return;
        }
        for (i = anInt307; i < anInt308; i += byte0) {
            scanline scanline_2 = aScanlineArray306[i];
            j = scanline_2.startX >> 8;
            int k5 = scanline_2.endX >> 8;
            int i7 = k5 - j;
            if (i7 <= 0) {
                l2 += i2;
            } else {
                int j8 = scanline_2.startS;
                int k9 = (scanline_2.endS - j8) / i7;
                if (j < -anInt265) {
                    j8 += (-anInt265 - j) * k9;
                    j = -anInt265;
                    i7 = k5 - j;
                }
                if (k5 > anInt265) {
                    int l5 = anInt265;
                    i7 = l5 - j;
                }
                method287(anIntArray305, -i7, l2 + j, 0, anIntArray245, j8, k9);
                l2 += i2;
            }
        }

    }

    public static void method279(int[] ai, int[] ai1, int i, int j, int k, int l, int i1, int j1,
                                 int k1, int l1, int i2, int j2, int k2, int l2) {
        if (i2 <= 0)
            return;
        int i3 = 0;
        int j3 = 0;
        int i4 = 0;
        if (i1 != 0) {
            i = k / i1 << 7;
            j = l / i1 << 7;
        }
        if (i < 0)
            i = 0;
        else if (i > 16256)
            i = 16256;
        k += j1;
        l += k1;
        i1 += l1;
        if (i1 != 0) {
            i3 = k / i1 << 7;
            j3 = l / i1 << 7;
        }
        if (i3 < 0)
            i3 = 0;
        else if (i3 > 16256)
            i3 = 16256;
        int k3 = i3 - i >> 4;
        int l3 = j3 - j >> 4;
        for (int j4 = i2 >> 4; j4 > 0; j4--) {
            i += k2 & 0x600000;
            i4 = k2 >> 23;
            k2 += l2;
            ai[j2++] = ai1[(j & 0x3f80) + (i >> 7)] >>> i4;
            i += k3;
            j += l3;
            ai[j2++] = ai1[(j & 0x3f80) + (i >> 7)] >>> i4;
            i += k3;
            j += l3;
            ai[j2++] = ai1[(j & 0x3f80) + (i >> 7)] >>> i4;
            i += k3;
            j += l3;
            ai[j2++] = ai1[(j & 0x3f80) + (i >> 7)] >>> i4;
            i += k3;
            j += l3;
            i = (i & 0x3fff) + (k2 & 0x600000);
            i4 = k2 >> 23;
            k2 += l2;
            ai[j2++] = ai1[(j & 0x3f80) + (i >> 7)] >>> i4;
            i += k3;
            j += l3;
            ai[j2++] = ai1[(j & 0x3f80) + (i >> 7)] >>> i4;
            i += k3;
            j += l3;
            ai[j2++] = ai1[(j & 0x3f80) + (i >> 7)] >>> i4;
            i += k3;
            j += l3;
            ai[j2++] = ai1[(j & 0x3f80) + (i >> 7)] >>> i4;
            i += k3;
            j += l3;
            i = (i & 0x3fff) + (k2 & 0x600000);
            i4 = k2 >> 23;
            k2 += l2;
            ai[j2++] = ai1[(j & 0x3f80) + (i >> 7)] >>> i4;
            i += k3;
            j += l3;
            ai[j2++] = ai1[(j & 0x3f80) + (i >> 7)] >>> i4;
            i += k3;
            j += l3;
            ai[j2++] = ai1[(j & 0x3f80) + (i >> 7)] >>> i4;
            i += k3;
            j += l3;
            ai[j2++] = ai1[(j & 0x3f80) + (i >> 7)] >>> i4;
            i += k3;
            j += l3;
            i = (i & 0x3fff) + (k2 & 0x600000);
            i4 = k2 >> 23;
            k2 += l2;
            ai[j2++] = ai1[(j & 0x3f80) + (i >> 7)] >>> i4;
            i += k3;
            j += l3;
            ai[j2++] = ai1[(j & 0x3f80) + (i >> 7)] >>> i4;
            i += k3;
            j += l3;
            ai[j2++] = ai1[(j & 0x3f80) + (i >> 7)] >>> i4;
            i += k3;
            j += l3;
            ai[j2++] = ai1[(j & 0x3f80) + (i >> 7)] >>> i4;
            i = i3;
            j = j3;
            k += j1;
            l += k1;
            i1 += l1;
            if (i1 != 0) {
                i3 = k / i1 << 7;
                j3 = l / i1 << 7;
            }
            if (i3 < 0)
                i3 = 0;
            else if (i3 > 16256)
                i3 = 16256;
            k3 = i3 - i >> 4;
            l3 = j3 - j >> 4;
        }

        for (int k4 = 0; k4 < (i2 & 0xf); k4++) {
            if ((k4 & 3) == 0) {
                i = (i & 0x3fff) + (k2 & 0x600000);
                i4 = k2 >> 23;
                k2 += l2;
            }
            ai[j2++] = ai1[(j & 0x3f80) + (i >> 7)] >>> i4;
            i += k3;
            j += l3;
        }

    }

    public static void method280(int[] ai, int[] ai1, int i, int j, int k, int l, int i1, int j1,
                                 int k1, int l1, int i2, int j2, int k2, int l2) {
        if (i2 <= 0)
            return;
        int i3 = 0;
        int j3 = 0;
        int i4 = 0;
        if (i1 != 0) {
            i = k / i1 << 7;
            j = l / i1 << 7;
        }
        if (i < 0)
            i = 0;
        else if (i > 16256)
            i = 16256;
        k += j1;
        l += k1;
        i1 += l1;
        if (i1 != 0) {
            i3 = k / i1 << 7;
            j3 = l / i1 << 7;
        }
        if (i3 < 0)
            i3 = 0;
        else if (i3 > 16256)
            i3 = 16256;
        int k3 = i3 - i >> 4;
        int l3 = j3 - j >> 4;
        for (int j4 = i2 >> 4; j4 > 0; j4--) {
            i += k2 & 0x600000;
            i4 = k2 >> 23;
            k2 += l2;
            ai[j2++] = (ai1[(j & 0x3f80) + (i >> 7)] >>> i4) + (ai[j2] >> 1 & 0x7f7f7f);
            i += k3;
            j += l3;
            ai[j2++] = (ai1[(j & 0x3f80) + (i >> 7)] >>> i4) + (ai[j2] >> 1 & 0x7f7f7f);
            i += k3;
            j += l3;
            ai[j2++] = (ai1[(j & 0x3f80) + (i >> 7)] >>> i4) + (ai[j2] >> 1 & 0x7f7f7f);
            i += k3;
            j += l3;
            ai[j2++] = (ai1[(j & 0x3f80) + (i >> 7)] >>> i4) + (ai[j2] >> 1 & 0x7f7f7f);
            i += k3;
            j += l3;
            i = (i & 0x3fff) + (k2 & 0x600000);
            i4 = k2 >> 23;
            k2 += l2;
            ai[j2++] = (ai1[(j & 0x3f80) + (i >> 7)] >>> i4) + (ai[j2] >> 1 & 0x7f7f7f);
            i += k3;
            j += l3;
            ai[j2++] = (ai1[(j & 0x3f80) + (i >> 7)] >>> i4) + (ai[j2] >> 1 & 0x7f7f7f);
            i += k3;
            j += l3;
            ai[j2++] = (ai1[(j & 0x3f80) + (i >> 7)] >>> i4) + (ai[j2] >> 1 & 0x7f7f7f);
            i += k3;
            j += l3;
            ai[j2++] = (ai1[(j & 0x3f80) + (i >> 7)] >>> i4) + (ai[j2] >> 1 & 0x7f7f7f);
            i += k3;
            j += l3;
            i = (i & 0x3fff) + (k2 & 0x600000);
            i4 = k2 >> 23;
            k2 += l2;
            ai[j2++] = (ai1[(j & 0x3f80) + (i >> 7)] >>> i4) + (ai[j2] >> 1 & 0x7f7f7f);
            i += k3;
            j += l3;
            ai[j2++] = (ai1[(j & 0x3f80) + (i >> 7)] >>> i4) + (ai[j2] >> 1 & 0x7f7f7f);
            i += k3;
            j += l3;
            ai[j2++] = (ai1[(j & 0x3f80) + (i >> 7)] >>> i4) + (ai[j2] >> 1 & 0x7f7f7f);
            i += k3;
            j += l3;
            ai[j2++] = (ai1[(j & 0x3f80) + (i >> 7)] >>> i4) + (ai[j2] >> 1 & 0x7f7f7f);
            i += k3;
            j += l3;
            i = (i & 0x3fff) + (k2 & 0x600000);
            i4 = k2 >> 23;
            k2 += l2;
            ai[j2++] = (ai1[(j & 0x3f80) + (i >> 7)] >>> i4) + (ai[j2] >> 1 & 0x7f7f7f);
            i += k3;
            j += l3;
            ai[j2++] = (ai1[(j & 0x3f80) + (i >> 7)] >>> i4) + (ai[j2] >> 1 & 0x7f7f7f);
            i += k3;
            j += l3;
            ai[j2++] = (ai1[(j & 0x3f80) + (i >> 7)] >>> i4) + (ai[j2] >> 1 & 0x7f7f7f);
            i += k3;
            j += l3;
            ai[j2++] = (ai1[(j & 0x3f80) + (i >> 7)] >>> i4) + (ai[j2] >> 1 & 0x7f7f7f);
            i = i3;
            j = j3;
            k += j1;
            l += k1;
            i1 += l1;
            if (i1 != 0) {
                i3 = k / i1 << 7;
                j3 = l / i1 << 7;
            }
            if (i3 < 0)
                i3 = 0;
            else if (i3 > 16256)
                i3 = 16256;
            k3 = i3 - i >> 4;
            l3 = j3 - j >> 4;
        }

        for (int k4 = 0; k4 < (i2 & 0xf); k4++) {
            if ((k4 & 3) == 0) {
                i = (i & 0x3fff) + (k2 & 0x600000);
                i4 = k2 >> 23;
                k2 += l2;
            }
            ai[j2++] = (ai1[(j & 0x3f80) + (i >> 7)] >>> i4) + (ai[j2] >> 1 & 0x7f7f7f);
            i += k3;
            j += l3;
        }

    }

    public static void method281(int[] ai, int i, int j, int k, int[] ai1, int l, int i1, int j1,
                                 int k1, int l1, int i2, int j2, int k2, int l2, int i3) {
        if (j2 <= 0)
            return;
        int j3 = 0;
        int k3 = 0;
        i3 <<= 2;
        if (j1 != 0) {
            j3 = l / j1 << 7;
            k3 = i1 / j1 << 7;
        }
        if (j3 < 0)
            j3 = 0;
        else if (j3 > 16256)
            j3 = 16256;
        for (int j4 = j2; j4 > 0; j4 -= 16) {
            l += k1;
            i1 += l1;
            j1 += i2;
            j = j3;
            k = k3;
            if (j1 != 0) {
                j3 = l / j1 << 7;
                k3 = i1 / j1 << 7;
            }
            if (j3 < 0)
                j3 = 0;
            else if (j3 > 16256)
                j3 = 16256;
            int l3 = j3 - j >> 4;
            int i4 = k3 - k >> 4;
            int k4 = l2 >> 23;
            j += l2 & 0x600000;
            l2 += i3;
            if (j4 < 16) {
                for (int l4 = 0; l4 < j4; l4++) {
                    if ((i = ai1[(k & 0x3f80) + (j >> 7)] >>> k4) != 0)
                        ai[k2] = i;
                    k2++;
                    j += l3;
                    k += i4;
                    if ((l4 & 3) == 3) {
                        j = (j & 0x3fff) + (l2 & 0x600000);
                        k4 = l2 >> 23;
                        l2 += i3;
                    }
                }

            } else {
                if ((i = ai1[(k & 0x3f80) + (j >> 7)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                if ((i = ai1[(k & 0x3f80) + (j >> 7)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                if ((i = ai1[(k & 0x3f80) + (j >> 7)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                if ((i = ai1[(k & 0x3f80) + (j >> 7)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                j = (j & 0x3fff) + (l2 & 0x600000);
                k4 = l2 >> 23;
                l2 += i3;
                if ((i = ai1[(k & 0x3f80) + (j >> 7)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                if ((i = ai1[(k & 0x3f80) + (j >> 7)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                if ((i = ai1[(k & 0x3f80) + (j >> 7)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                if ((i = ai1[(k & 0x3f80) + (j >> 7)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                j = (j & 0x3fff) + (l2 & 0x600000);
                k4 = l2 >> 23;
                l2 += i3;
                if ((i = ai1[(k & 0x3f80) + (j >> 7)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                if ((i = ai1[(k & 0x3f80) + (j >> 7)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                if ((i = ai1[(k & 0x3f80) + (j >> 7)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                if ((i = ai1[(k & 0x3f80) + (j >> 7)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                j = (j & 0x3fff) + (l2 & 0x600000);
                k4 = l2 >> 23;
                l2 += i3;
                if ((i = ai1[(k & 0x3f80) + (j >> 7)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                if ((i = ai1[(k & 0x3f80) + (j >> 7)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                if ((i = ai1[(k & 0x3f80) + (j >> 7)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                if ((i = ai1[(k & 0x3f80) + (j >> 7)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
            }
        }

    }

    public static void method282(int[] ai, int[] ai1, int i, int j, int k, int l, int i1, int j1,
                                 int k1, int l1, int i2, int j2, int k2, int l2) {
        if (i2 <= 0)
            return;
        int i3 = 0;
        int j3 = 0;
        l2 <<= 2;
        if (i1 != 0) {
            i3 = k / i1 << 6;
            j3 = l / i1 << 6;
        }
        if (i3 < 0)
            i3 = 0;
        else if (i3 > 4032)
            i3 = 4032;
        for (int i4 = i2; i4 > 0; i4 -= 16) {
            k += j1;
            l += k1;
            i1 += l1;
            i = i3;
            j = j3;
            if (i1 != 0) {
                i3 = k / i1 << 6;
                j3 = l / i1 << 6;
            }
            if (i3 < 0)
                i3 = 0;
            else if (i3 > 4032)
                i3 = 4032;
            int k3 = i3 - i >> 4;
            int l3 = j3 - j >> 4;
            int j4 = k2 >> 20;
            i += k2 & 0xc0000;
            k2 += l2;
            if (i4 < 16) {
                for (int k4 = 0; k4 < i4; k4++) {
                    ai[j2++] = ai1[(j & 0xfc0) + (i >> 6)] >>> j4;
                    i += k3;
                    j += l3;
                    if ((k4 & 3) == 3) {
                        i = (i & 0xfff) + (k2 & 0xc0000);
                        j4 = k2 >> 20;
                        k2 += l2;
                    }
                }

            } else {
                ai[j2++] = ai1[(j & 0xfc0) + (i >> 6)] >>> j4;
                i += k3;
                j += l3;
                ai[j2++] = ai1[(j & 0xfc0) + (i >> 6)] >>> j4;
                i += k3;
                j += l3;
                ai[j2++] = ai1[(j & 0xfc0) + (i >> 6)] >>> j4;
                i += k3;
                j += l3;
                ai[j2++] = ai1[(j & 0xfc0) + (i >> 6)] >>> j4;
                i += k3;
                j += l3;
                i = (i & 0xfff) + (k2 & 0xc0000);
                j4 = k2 >> 20;
                k2 += l2;
                ai[j2++] = ai1[(j & 0xfc0) + (i >> 6)] >>> j4;
                i += k3;
                j += l3;
                ai[j2++] = ai1[(j & 0xfc0) + (i >> 6)] >>> j4;
                i += k3;
                j += l3;
                ai[j2++] = ai1[(j & 0xfc0) + (i >> 6)] >>> j4;
                i += k3;
                j += l3;
                ai[j2++] = ai1[(j & 0xfc0) + (i >> 6)] >>> j4;
                i += k3;
                j += l3;
                i = (i & 0xfff) + (k2 & 0xc0000);
                j4 = k2 >> 20;
                k2 += l2;
                ai[j2++] = ai1[(j & 0xfc0) + (i >> 6)] >>> j4;
                i += k3;
                j += l3;
                ai[j2++] = ai1[(j & 0xfc0) + (i >> 6)] >>> j4;
                i += k3;
                j += l3;
                ai[j2++] = ai1[(j & 0xfc0) + (i >> 6)] >>> j4;
                i += k3;
                j += l3;
                ai[j2++] = ai1[(j & 0xfc0) + (i >> 6)] >>> j4;
                i += k3;
                j += l3;
                i = (i & 0xfff) + (k2 & 0xc0000);
                j4 = k2 >> 20;
                k2 += l2;
                ai[j2++] = ai1[(j & 0xfc0) + (i >> 6)] >>> j4;
                i += k3;
                j += l3;
                ai[j2++] = ai1[(j & 0xfc0) + (i >> 6)] >>> j4;
                i += k3;
                j += l3;
                ai[j2++] = ai1[(j & 0xfc0) + (i >> 6)] >>> j4;
                i += k3;
                j += l3;
                ai[j2++] = ai1[(j & 0xfc0) + (i >> 6)] >>> j4;
            }
        }

    }

    public static void method283(int[] ai, int[] ai1, int i, int j, int k, int l, int i1, int j1,
                                 int k1, int l1, int i2, int j2, int k2, int l2) {
        if (i2 <= 0)
            return;
        int i3 = 0;
        int j3 = 0;
        l2 <<= 2;
        if (i1 != 0) {
            i3 = k / i1 << 6;
            j3 = l / i1 << 6;
        }
        if (i3 < 0)
            i3 = 0;
        else if (i3 > 4032)
            i3 = 4032;
        for (int i4 = i2; i4 > 0; i4 -= 16) {
            k += j1;
            l += k1;
            i1 += l1;
            i = i3;
            j = j3;
            if (i1 != 0) {
                i3 = k / i1 << 6;
                j3 = l / i1 << 6;
            }
            if (i3 < 0)
                i3 = 0;
            else if (i3 > 4032)
                i3 = 4032;
            int k3 = i3 - i >> 4;
            int l3 = j3 - j >> 4;
            int j4 = k2 >> 20;
            i += k2 & 0xc0000;
            k2 += l2;
            if (i4 < 16) {
                for (int k4 = 0; k4 < i4; k4++) {
                    ai[j2++] = (ai1[(j & 0xfc0) + (i >> 6)] >>> j4) + (ai[j2] >> 1 & 0x7f7f7f);
                    i += k3;
                    j += l3;
                    if ((k4 & 3) == 3) {
                        i = (i & 0xfff) + (k2 & 0xc0000);
                        j4 = k2 >> 20;
                        k2 += l2;
                    }
                }

            } else {
                ai[j2++] = (ai1[(j & 0xfc0) + (i >> 6)] >>> j4) + (ai[j2] >> 1 & 0x7f7f7f);
                i += k3;
                j += l3;
                ai[j2++] = (ai1[(j & 0xfc0) + (i >> 6)] >>> j4) + (ai[j2] >> 1 & 0x7f7f7f);
                i += k3;
                j += l3;
                ai[j2++] = (ai1[(j & 0xfc0) + (i >> 6)] >>> j4) + (ai[j2] >> 1 & 0x7f7f7f);
                i += k3;
                j += l3;
                ai[j2++] = (ai1[(j & 0xfc0) + (i >> 6)] >>> j4) + (ai[j2] >> 1 & 0x7f7f7f);
                i += k3;
                j += l3;
                i = (i & 0xfff) + (k2 & 0xc0000);
                j4 = k2 >> 20;
                k2 += l2;
                ai[j2++] = (ai1[(j & 0xfc0) + (i >> 6)] >>> j4) + (ai[j2] >> 1 & 0x7f7f7f);
                i += k3;
                j += l3;
                ai[j2++] = (ai1[(j & 0xfc0) + (i >> 6)] >>> j4) + (ai[j2] >> 1 & 0x7f7f7f);
                i += k3;
                j += l3;
                ai[j2++] = (ai1[(j & 0xfc0) + (i >> 6)] >>> j4) + (ai[j2] >> 1 & 0x7f7f7f);
                i += k3;
                j += l3;
                ai[j2++] = (ai1[(j & 0xfc0) + (i >> 6)] >>> j4) + (ai[j2] >> 1 & 0x7f7f7f);
                i += k3;
                j += l3;
                i = (i & 0xfff) + (k2 & 0xc0000);
                j4 = k2 >> 20;
                k2 += l2;
                ai[j2++] = (ai1[(j & 0xfc0) + (i >> 6)] >>> j4) + (ai[j2] >> 1 & 0x7f7f7f);
                i += k3;
                j += l3;
                ai[j2++] = (ai1[(j & 0xfc0) + (i >> 6)] >>> j4) + (ai[j2] >> 1 & 0x7f7f7f);
                i += k3;
                j += l3;
                ai[j2++] = (ai1[(j & 0xfc0) + (i >> 6)] >>> j4) + (ai[j2] >> 1 & 0x7f7f7f);
                i += k3;
                j += l3;
                ai[j2++] = (ai1[(j & 0xfc0) + (i >> 6)] >>> j4) + (ai[j2] >> 1 & 0x7f7f7f);
                i += k3;
                j += l3;
                i = (i & 0xfff) + (k2 & 0xc0000);
                j4 = k2 >> 20;
                k2 += l2;
                ai[j2++] = (ai1[(j & 0xfc0) + (i >> 6)] >>> j4) + (ai[j2] >> 1 & 0x7f7f7f);
                i += k3;
                j += l3;
                ai[j2++] = (ai1[(j & 0xfc0) + (i >> 6)] >>> j4) + (ai[j2] >> 1 & 0x7f7f7f);
                i += k3;
                j += l3;
                ai[j2++] = (ai1[(j & 0xfc0) + (i >> 6)] >>> j4) + (ai[j2] >> 1 & 0x7f7f7f);
                i += k3;
                j += l3;
                ai[j2++] = (ai1[(j & 0xfc0) + (i >> 6)] >>> j4) + (ai[j2] >> 1 & 0x7f7f7f);
            }
        }

    }

    public static void method284(int[] ai, int i, int j, int k, int[] ai1, int l, int i1, int j1,
                                 int k1, int l1, int i2, int j2, int k2, int l2, int i3) {
        if (j2 <= 0)
            return;
        int j3 = 0;
        int k3 = 0;
        i3 <<= 2;
        if (j1 != 0) {
            j3 = l / j1 << 6;
            k3 = i1 / j1 << 6;
        }
        if (j3 < 0)
            j3 = 0;
        else if (j3 > 4032)
            j3 = 4032;
        for (int j4 = j2; j4 > 0; j4 -= 16) {
            l += k1;
            i1 += l1;
            j1 += i2;
            j = j3;
            k = k3;
            if (j1 != 0) {
                j3 = l / j1 << 6;
                k3 = i1 / j1 << 6;
            }
            if (j3 < 0)
                j3 = 0;
            else if (j3 > 4032)
                j3 = 4032;
            int l3 = j3 - j >> 4;
            int i4 = k3 - k >> 4;
            int k4 = l2 >> 20;
            j += l2 & 0xc0000;
            l2 += i3;
            if (j4 < 16) {
                for (int l4 = 0; l4 < j4; l4++) {
                    if ((i = ai1[(k & 0xfc0) + (j >> 6)] >>> k4) != 0)
                        ai[k2] = i;
                    k2++;
                    j += l3;
                    k += i4;
                    if ((l4 & 3) == 3) {
                        j = (j & 0xfff) + (l2 & 0xc0000);
                        k4 = l2 >> 20;
                        l2 += i3;
                    }
                }

            } else {
                if ((i = ai1[(k & 0xfc0) + (j >> 6)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                if ((i = ai1[(k & 0xfc0) + (j >> 6)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                if ((i = ai1[(k & 0xfc0) + (j >> 6)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                if ((i = ai1[(k & 0xfc0) + (j >> 6)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                j = (j & 0xfff) + (l2 & 0xc0000);
                k4 = l2 >> 20;
                l2 += i3;
                if ((i = ai1[(k & 0xfc0) + (j >> 6)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                if ((i = ai1[(k & 0xfc0) + (j >> 6)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                if ((i = ai1[(k & 0xfc0) + (j >> 6)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                if ((i = ai1[(k & 0xfc0) + (j >> 6)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                j = (j & 0xfff) + (l2 & 0xc0000);
                k4 = l2 >> 20;
                l2 += i3;
                if ((i = ai1[(k & 0xfc0) + (j >> 6)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                if ((i = ai1[(k & 0xfc0) + (j >> 6)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                if ((i = ai1[(k & 0xfc0) + (j >> 6)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                if ((i = ai1[(k & 0xfc0) + (j >> 6)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                j = (j & 0xfff) + (l2 & 0xc0000);
                k4 = l2 >> 20;
                l2 += i3;
                if ((i = ai1[(k & 0xfc0) + (j >> 6)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                if ((i = ai1[(k & 0xfc0) + (j >> 6)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                if ((i = ai1[(k & 0xfc0) + (j >> 6)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
                j += l3;
                k += i4;
                if ((i = ai1[(k & 0xfc0) + (j >> 6)] >>> k4) != 0)
                    ai[k2] = i;
                k2++;
            }
        }

    }

    public static void method285(int[] ai, int i, int j, int k, int[] ai1, int l, int i1) {
        if (i >= 0)
            return;
        i1 <<= 1;
        k = ai1[l >> 8 & 0xff];
        l += i1;
        int j1 = i / 8;
        for (int k1 = j1; k1 < 0; k1++) {
            ai[j++] = k;
            ai[j++] = k;
            k = ai1[l >> 8 & 0xff];
            l += i1;
            ai[j++] = k;
            ai[j++] = k;
            k = ai1[l >> 8 & 0xff];
            l += i1;
            ai[j++] = k;
            ai[j++] = k;
            k = ai1[l >> 8 & 0xff];
            l += i1;
            ai[j++] = k;
            ai[j++] = k;
            k = ai1[l >> 8 & 0xff];
            l += i1;
        }

        j1 = -(i % 8);
        for (int l1 = 0; l1 < j1; l1++) {
            ai[j++] = k;
            if ((l1 & 1) == 1) {
                k = ai1[l >> 8 & 0xff];
                l += i1;
            }
        }

    }

    public static void method286(int[] ai, int i, int j, int k, int[] ai1, int l, int i1) {
        if (i >= 0)
            return;
        i1 <<= 2;
        k = ai1[l >> 8 & 0xff];
        l += i1;
        int j1 = i / 16;
        for (int k1 = j1; k1 < 0; k1++) {
            ai[j++] = k + (ai[j] >> 1 & 0x7f7f7f);
            ai[j++] = k + (ai[j] >> 1 & 0x7f7f7f);
            ai[j++] = k + (ai[j] >> 1 & 0x7f7f7f);
            ai[j++] = k + (ai[j] >> 1 & 0x7f7f7f);
            k = ai1[l >> 8 & 0xff];
            l += i1;
            ai[j++] = k + (ai[j] >> 1 & 0x7f7f7f);
            ai[j++] = k + (ai[j] >> 1 & 0x7f7f7f);
            ai[j++] = k + (ai[j] >> 1 & 0x7f7f7f);
            ai[j++] = k + (ai[j] >> 1 & 0x7f7f7f);
            k = ai1[l >> 8 & 0xff];
            l += i1;
            ai[j++] = k + (ai[j] >> 1 & 0x7f7f7f);
            ai[j++] = k + (ai[j] >> 1 & 0x7f7f7f);
            ai[j++] = k + (ai[j] >> 1 & 0x7f7f7f);
            ai[j++] = k + (ai[j] >> 1 & 0x7f7f7f);
            k = ai1[l >> 8 & 0xff];
            l += i1;
            ai[j++] = k + (ai[j] >> 1 & 0x7f7f7f);
            ai[j++] = k + (ai[j] >> 1 & 0x7f7f7f);
            ai[j++] = k + (ai[j] >> 1 & 0x7f7f7f);
            ai[j++] = k + (ai[j] >> 1 & 0x7f7f7f);
            k = ai1[l >> 8 & 0xff];
            l += i1;
        }

        j1 = -(i % 16);
        for (int l1 = 0; l1 < j1; l1++) {
            ai[j++] = k + (ai[j] >> 1 & 0x7f7f7f);
            if ((l1 & 3) == 3) {
                k = ai1[l >> 8 & 0xff];
                l += i1;
                l += i1;
            }
        }

    }

    public static void method287(int[] ai, int i, int j, int k, int[] ai1, int l, int i1) {
        if (i >= 0)
            return;
        i1 <<= 2;
        k = ai1[l >> 8 & 0xff];
        l += i1;
        int j1 = i / 16;
        for (int k1 = j1; k1 < 0; k1++) {
            ai[j++] = k;
            ai[j++] = k;
            ai[j++] = k;
            ai[j++] = k;
            k = ai1[l >> 8 & 0xff];
            l += i1;
            ai[j++] = k;
            ai[j++] = k;
            ai[j++] = k;
            ai[j++] = k;
            k = ai1[l >> 8 & 0xff];
            l += i1;
            ai[j++] = k;
            ai[j++] = k;
            ai[j++] = k;
            ai[j++] = k;
            k = ai1[l >> 8 & 0xff];
            l += i1;
            ai[j++] = k;
            ai[j++] = k;
            ai[j++] = k;
            ai[j++] = k;
            k = ai1[l >> 8 & 0xff];
            l += i1;
        }

        j1 = -(i % 16);
        for (int l1 = 0; l1 < j1; l1++) {
            ai[j++] = k;
            if ((l1 & 3) == 3) {
                k = ai1[l >> 8 & 0xff];
                l += i1;
            }
        }

    }

    public void method288(int i, int j, int k, int l, int i1, int j1, int k1) {
        l &= 0x3ff;
        i1 &= 0x3ff;
        j1 &= 0x3ff;
        anInt274 = 1024 - l & 0x3ff;
        anInt275 = 1024 - i1 & 0x3ff;
        anInt276 = 1024 - j1 & 0x3ff;
        int l1 = 0;
        int i2 = 0;
        int j2 = k1;
        if (l != 0) {
            int k2 = anIntArray252[l];
            int j3 = anIntArray252[l + 1024];
            int i4 = i2 * j3 - j2 * k2 >> 15;
            j2 = i2 * k2 + j2 * j3 >> 15;
            i2 = i4;
        }
        if (i1 != 0) {
            int l2 = anIntArray252[i1];
            int k3 = anIntArray252[i1 + 1024];
            int j4 = j2 * l2 + l1 * k3 >> 15;
            j2 = j2 * k3 - l1 * l2 >> 15;
            l1 = j4;
        }
        if (j1 != 0) {
            int i3 = anIntArray252[j1];
            int l3 = anIntArray252[j1 + 1024];
            int k4 = i2 * i3 + l1 * l3 >> 15;
            i2 = i2 * l3 - l1 * i3 >> 15;
            l1 = k4;
        }
        anInt271 = i - l1;
        anInt272 = j - i2;
        anInt273 = k - j2;
    }

    public void method289(int i) {
        polygon3d polygon3d = aPolygon3dArray282[i];
        object3d object3d = polygon3d.aObject3d_227;
        int j = polygon3d.anInt228;
        int[] ai = object3d.anIntArrayArray109[j];
        int k = object3d.anIntArray108[j];
        int l = object3d.anIntArray113[j];
        int j1 = object3d.anIntArray100[ai[0]];
        int k1 = object3d.anIntArray101[ai[0]];
        int l1 = object3d.anIntArray102[ai[0]];
        int i2 = object3d.anIntArray100[ai[1]] - j1;
        int j2 = object3d.anIntArray101[ai[1]] - k1;
        int k2 = object3d.anIntArray102[ai[1]] - l1;
        int l2 = object3d.anIntArray100[ai[2]] - j1;
        int i3 = object3d.anIntArray101[ai[2]] - k1;
        int j3 = object3d.anIntArray102[ai[2]] - l1;
        int k3 = j2 * j3 - i3 * k2;
        int l3 = k2 * l2 - j3 * i2;
        int i4 = i2 * i3 - l2 * j2;
        if (l == -1) {
            l = 0;
            for (; k3 > 25000 || l3 > 25000 || i4 > 25000 || k3 < -25000 || l3 < -25000 || i4 < -25000; i4 >>= 1) {
                l++;
                k3 >>= 1;
                l3 >>= 1;
            }

            object3d.anIntArray113[j] = l;
            object3d.anIntArray112[j] = (int) ((double) anInt270 * Math.sqrt(k3 * k3 + l3 * l3 + i4 * i4));
        } else {
            k3 >>= l;
            l3 >>= l;
            i4 >>= l;
        }
        polygon3d.anInt233 = j1 * k3 + k1 * l3 + l1 * i4;
        polygon3d.anInt230 = k3;
        polygon3d.anInt231 = l3;
        polygon3d.anInt232 = i4;
        int j4 = object3d.anIntArray102[ai[0]];
        int k4 = j4;
        int l4 = object3d.anIntArray103[ai[0]];
        int i5 = l4;
        int j5 = object3d.anIntArray104[ai[0]];
        int k5 = j5;
        for (int l5 = 1; l5 < k; l5++) {
            int i1 = object3d.anIntArray102[ai[l5]];
            if (i1 > k4)
                k4 = i1;
            else if (i1 < j4)
                j4 = i1;
            i1 = object3d.anIntArray103[ai[l5]];
            if (i1 > i5)
                i5 = i1;
            else if (i1 < l4)
                l4 = i1;
            i1 = object3d.anIntArray104[ai[l5]];
            if (i1 > k5)
                k5 = i1;
            else if (i1 < j5)
                j5 = i1;
        }

        polygon3d.anInt225 = j4;
        polygon3d.anInt226 = k4;
        polygon3d.anInt221 = l4;
        polygon3d.anInt223 = i5;
        polygon3d.anInt222 = j5;
        polygon3d.anInt224 = k5;
    }

    public void method290(int i) {
        polygon3d polygon3d = aPolygon3dArray282[i];
        object3d object3d = polygon3d.aObject3d_227;
        int j = polygon3d.anInt228;
        int[] ai = object3d.anIntArrayArray109[j];
        int l = 0;
        int i1 = 0;
        int j1 = 1;
        int k1 = object3d.anIntArray100[ai[0]];
        int l1 = object3d.anIntArray101[ai[0]];
        int i2 = object3d.anIntArray102[ai[0]];
        object3d.anIntArray112[j] = 1;
        object3d.anIntArray113[j] = 0;
        polygon3d.anInt233 = k1 * l + l1 * i1 + i2 * j1;
        polygon3d.anInt230 = l;
        polygon3d.anInt231 = i1;
        polygon3d.anInt232 = j1;
        int j2 = object3d.anIntArray102[ai[0]];
        int k2 = j2;
        int l2 = object3d.anIntArray103[ai[0]];
        int i3 = l2;
        if (object3d.anIntArray103[ai[1]] < l2)
            l2 = object3d.anIntArray103[ai[1]];
        else
            i3 = object3d.anIntArray103[ai[1]];
        int j3 = object3d.anIntArray104[ai[1]];
        int k3 = object3d.anIntArray104[ai[0]];
        int k = object3d.anIntArray102[ai[1]];
        if (k > k2)
            k2 = k;
        else if (k < j2)
            j2 = k;
        k = object3d.anIntArray103[ai[1]];
        if (k > i3)
            i3 = k;
        else if (k < l2)
            l2 = k;
        k = object3d.anIntArray104[ai[1]];
        if (k > k3)
            k3 = k;
        else if (k < j3)
            j3 = k;
        polygon3d.anInt225 = j2;
        polygon3d.anInt226 = k2;
        polygon3d.anInt221 = l2 - 20;
        polygon3d.anInt223 = i3 + 20;
        polygon3d.anInt222 = j3;
        polygon3d.anInt224 = k3;
    }

    public boolean method291(polygon3d polygon3d, polygon3d polygon3d_1) {
        if (polygon3d.anInt221 >= polygon3d_1.anInt223)
            return true;
        if (polygon3d_1.anInt221 >= polygon3d.anInt223)
            return true;
        if (polygon3d.anInt222 >= polygon3d_1.anInt224)
            return true;
        if (polygon3d_1.anInt222 >= polygon3d.anInt224)
            return true;
        if (polygon3d.anInt225 >= polygon3d_1.anInt226)
            return true;
        if (polygon3d_1.anInt225 > polygon3d.anInt226)
            return false;
        object3d object3d = polygon3d.aObject3d_227;
        object3d object3d_1 = polygon3d_1.aObject3d_227;
        int i = polygon3d.anInt228;
        int j = polygon3d_1.anInt228;
        int[] ai = object3d.anIntArrayArray109[i];
        int[] ai1 = object3d_1.anIntArrayArray109[j];
        int k = object3d.anIntArray108[i];
        int l = object3d_1.anIntArray108[j];
        int k2 = object3d_1.anIntArray100[ai1[0]];
        int l2 = object3d_1.anIntArray101[ai1[0]];
        int i3 = object3d_1.anIntArray102[ai1[0]];
        int j3 = polygon3d_1.anInt230;
        int k3 = polygon3d_1.anInt231;
        int l3 = polygon3d_1.anInt232;
        int i4 = object3d_1.anIntArray112[j];
        int j4 = polygon3d_1.anInt233;
        boolean flag = false;
        for (int k4 = 0; k4 < k; k4++) {
            int i1 = ai[k4];
            int i2 = (k2 - object3d.anIntArray100[i1]) * j3 + (l2 - object3d.anIntArray101[i1]) * k3 + (i3 - object3d.anIntArray102[i1]) * l3;
            if ((i2 >= -i4 || j4 >= 0) && (i2 <= i4 || j4 <= 0))
                continue;
            flag = true;
            break;
        }

        if (!flag)
            return true;
        k2 = object3d.anIntArray100[ai[0]];
        l2 = object3d.anIntArray101[ai[0]];
        i3 = object3d.anIntArray102[ai[0]];
        j3 = polygon3d.anInt230;
        k3 = polygon3d.anInt231;
        l3 = polygon3d.anInt232;
        i4 = object3d.anIntArray112[i];
        j4 = polygon3d.anInt233;
        flag = false;
        for (int l4 = 0; l4 < l; l4++) {
            int j1 = ai1[l4];
            int j2 = (k2 - object3d_1.anIntArray100[j1]) * j3 + (l2 - object3d_1.anIntArray101[j1]) * k3 + (i3 - object3d_1.anIntArray102[j1]) * l3;
            if ((j2 >= -i4 || j4 <= 0) && (j2 <= i4 || j4 >= 0))
                continue;
            flag = true;
            break;
        }

        if (!flag)
            return true;
        int[] ai2;
        int[] ai3;
        if (k == 2) {
            ai2 = new int[4];
            ai3 = new int[4];
            int i5 = ai[0];
            int k1 = ai[1];
            ai2[0] = object3d.anIntArray103[i5] - 20;
            ai2[1] = object3d.anIntArray103[k1] - 20;
            ai2[2] = object3d.anIntArray103[k1] + 20;
            ai2[3] = object3d.anIntArray103[i5] + 20;
            ai3[0] = ai3[3] = object3d.anIntArray104[i5];
            ai3[1] = ai3[2] = object3d.anIntArray104[k1];
        } else {
            ai2 = new int[k];
            ai3 = new int[k];
            for (int j5 = 0; j5 < k; j5++) {
                int i6 = ai[j5];
                ai2[j5] = object3d.anIntArray103[i6];
                ai3[j5] = object3d.anIntArray104[i6];
            }

        }
        int[] ai4;
        int[] ai5;
        if (l == 2) {
            ai4 = new int[4];
            ai5 = new int[4];
            int k5 = ai1[0];
            int l1 = ai1[1];
            ai4[0] = object3d_1.anIntArray103[k5] - 20;
            ai4[1] = object3d_1.anIntArray103[l1] - 20;
            ai4[2] = object3d_1.anIntArray103[l1] + 20;
            ai4[3] = object3d_1.anIntArray103[k5] + 20;
            ai5[0] = ai5[3] = object3d_1.anIntArray104[k5];
            ai5[1] = ai5[2] = object3d_1.anIntArray104[l1];
        } else {
            ai4 = new int[l];
            ai5 = new int[l];
            for (int l5 = 0; l5 < l; l5++) {
                int j6 = ai1[l5];
                ai4[l5] = object3d_1.anIntArray103[j6];
                ai5[l5] = object3d_1.anIntArray104[j6];
            }

        }
        return !method305(ai2, ai3, ai4, ai5);
    }

    public boolean method292(polygon3d polygon3d, polygon3d polygon3d_1) {
        object3d object3d = polygon3d.aObject3d_227;
        object3d object3d_1 = polygon3d_1.aObject3d_227;
        int i = polygon3d.anInt228;
        int j = polygon3d_1.anInt228;
        int[] ai = object3d.anIntArrayArray109[i];
        int[] ai1 = object3d_1.anIntArrayArray109[j];
        int k = object3d.anIntArray108[i];
        int l = object3d_1.anIntArray108[j];
        int i2 = object3d_1.anIntArray100[ai1[0]];
        int j2 = object3d_1.anIntArray101[ai1[0]];
        int k2 = object3d_1.anIntArray102[ai1[0]];
        int l2 = polygon3d_1.anInt230;
        int i3 = polygon3d_1.anInt231;
        int j3 = polygon3d_1.anInt232;
        int k3 = object3d_1.anIntArray112[j];
        int l3 = polygon3d_1.anInt233;
        boolean flag = false;
        for (int i4 = 0; i4 < k; i4++) {
            int i1 = ai[i4];
            int k1 = (i2 - object3d.anIntArray100[i1]) * l2 + (j2 - object3d.anIntArray101[i1]) * i3 + (k2 - object3d.anIntArray102[i1]) * j3;
            if ((k1 >= -k3 || l3 >= 0) && (k1 <= k3 || l3 <= 0))
                continue;
            flag = true;
            break;
        }

        if (!flag)
            return true;
        i2 = object3d.anIntArray100[ai[0]];
        j2 = object3d.anIntArray101[ai[0]];
        k2 = object3d.anIntArray102[ai[0]];
        l2 = polygon3d.anInt230;
        i3 = polygon3d.anInt231;
        j3 = polygon3d.anInt232;
        k3 = object3d.anIntArray112[i];
        l3 = polygon3d.anInt233;
        flag = false;
        for (int j4 = 0; j4 < l; j4++) {
            int j1 = ai1[j4];
            int l1 = (i2 - object3d_1.anIntArray100[j1]) * l2 + (j2 - object3d_1.anIntArray101[j1]) * i3 + (k2 - object3d_1.anIntArray102[j1]) * j3;
            if ((l1 >= -k3 || l3 <= 0) && (l1 <= k3 || l3 >= 0))
                continue;
            flag = true;
            break;
        }

        return !flag;
    }

    public void method293(int i, int j, int k) {
        anInt292 = i;
        aByteArrayArray293 = new byte[i][];
        anIntArrayArray294 = new int[i][];
        anIntArray295 = new int[i];
        aLongArray296 = new long[i];
        aBooleanArray298 = new boolean[i];
        anIntArrayArray297 = new int[i][];
        aLong299 = 0L;
        anIntArrayArray300 = new int[j][];
        anIntArrayArray301 = new int[k][];
    }

    public void method294(int i, byte[] abyte0, int[] ai, int j) {
        aByteArrayArray293[i] = abyte0;
        anIntArrayArray294[i] = ai;
        anIntArray295[i] = j;
        aLongArray296[i] = 0L;
        aBooleanArray298[i] = false;
        anIntArrayArray297[i] = null;
        method295(i);
    }

    public void method295(int i) {
        if (i < 0)
            return;
        aLongArray296[i] = aLong299++;
        if (anIntArrayArray297[i] != null)
            return;
        if (anIntArray295[i] == 0) {
            for (int j = 0; j < anIntArrayArray300.length; j++)
                if (anIntArrayArray300[j] == null) {
                    anIntArrayArray300[j] = new int[16384];
                    anIntArrayArray297[i] = anIntArrayArray300[j];
                    method296(i);
                    return;
                }

            long l = 1L << 30;
            int i1 = 0;
            for (int k1 = 0; k1 < anInt292; k1++)
                if (k1 != i && anIntArray295[k1] == 0 && anIntArrayArray297[k1] != null && aLongArray296[k1] < l) {
                    l = aLongArray296[k1];
                    i1 = k1;
                }

            anIntArrayArray297[i] = anIntArrayArray297[i1];
            anIntArrayArray297[i1] = null;
            method296(i);
            return;
        }
        for (int k = 0; k < anIntArrayArray301.length; k++)
            if (anIntArrayArray301[k] == null) {
                anIntArrayArray301[k] = new int[0x10000];
                anIntArrayArray297[i] = anIntArrayArray301[k];
                method296(i);
                return;
            }

        long l1 = 1L << 30;
        int j1 = 0;
        for (int i2 = 0; i2 < anInt292; i2++)
            if (i2 != i && anIntArray295[i2] == 1 && anIntArrayArray297[i2] != null && aLongArray296[i2] < l1) {
                l1 = aLongArray296[i2];
                j1 = i2;
            }

        anIntArrayArray297[i] = anIntArrayArray297[j1];
        anIntArrayArray297[j1] = null;
        method296(i);
    }

    public void method296(int i) {
        char c;
        if (anIntArray295[i] == 0)
            c = '@';
        else
            c = '\200';
        int[] ai = anIntArrayArray297[i];
        int j = 0;
        for (int k = 0; k < c; k++) {
            for (int l = 0; l < c; l++) {
                int j1 = anIntArrayArray294[i][aByteArrayArray293[i][l + k * c] & 0xff];
                j1 &= 0xf8f8ff;
                if (j1 == 0)
                    j1 = 1;
                else if (j1 == 0xf800ff) {
                    j1 = 0;
                    aBooleanArray298[i] = true;
                }
                ai[j++] = j1;
            }

        }

        for (int i1 = 0; i1 < j; i1++) {
            int k1 = ai[i1];
            ai[j + i1] = k1 - (k1 >>> 3) & 0xf8f8ff;
            ai[j * 2 + i1] = k1 - (k1 >>> 2) & 0xf8f8ff;
            ai[j * 3 + i1] = k1 - (k1 >>> 2) - (k1 >>> 3) & 0xf8f8ff;
        }

    }

    public void method297(int i) {
        if (anIntArrayArray297[i] == null)
            return;
        int[] ai = anIntArrayArray297[i];
        for (int j = 0; j < 64; j++) {
            int k = j + 4032;
            int l = ai[k];
            for (int j1 = 0; j1 < 63; j1++) {
                ai[k] = ai[k - 64];
                k -= 64;
            }

            anIntArrayArray297[i][k] = l;
        }

        char c = '\u1000';
        for (int i1 = 0; i1 < c; i1++) {
            int k1 = ai[i1];
            ai[c + i1] = k1 - (k1 >>> 3) & 0xf8f8ff;
            ai[c * 2 + i1] = k1 - (k1 >>> 2) & 0xf8f8ff;
            ai[c * 3 + i1] = k1 - (k1 >>> 2) - (k1 >>> 3) & 0xf8f8ff;
        }

    }

    public int method298(int i) {
        if (i == 0xbc614e)
            return 0;
        method295(i);
        if (i >= 0)
            return anIntArrayArray297[i][0];
        if (i < 0) {
            i = -(i + 1);
            int j = i >> 10 & 0x1f;
            int k = i >> 5 & 0x1f;
            int l = i & 0x1f;
            return (j << 19) + (k << 11) + (l << 3);
        } else {
            return 0;
        }
    }

    public void method299(int i, int j, int k) {
        if (i == 0 && j == 0 && k == 0)
            i = 32;
        for (int l = 0; l < anInt277; l++)
            aObject3dArray279[l].method185(i, j, k);

    }

    public void method300(int i, int j, int k, int l, int i1) {
        if (k == 0 && l == 0 && i1 == 0)
            k = 32;
        for (int j1 = 0; j1 < anInt277; j1++)
            aObject3dArray279[j1].method184(i, j, k, l, i1);

    }

    public static int method301(int i, int j, int k) {
        return -1 - (i / 8) * 1024 - (j / 8) * 32 - k / 8;
    }

    public int method302(int i, int j, int k, int l, int i1) {
        if (l == j)
            return i;
        else
            return i + ((k - i) * (i1 - j)) / (l - j);
    }

    public boolean method303(int i, int j, int k, int l, boolean flag) {
        if (flag && i <= k || i < k) {
            if (i > l)
                return true;
            if (j > k)
                return true;
            if (j > l)
                return true;
            return !flag;
        }
        if (i < l)
            return true;
        if (j < k)
            return true;
        if (j < l)
            return true;
        else
            return flag;
    }

    public boolean method304(int i, int j, int k, boolean flag) {
        if (flag && i <= k || i < k) {
            if (j > k)
                return true;
            return !flag;
        }
        if (j < k)
            return true;
        else
            return flag;
    }

    public boolean method305(int[] ai, int[] ai1, int[] ai2, int[] ai3) {
        int i = ai.length;
        int j = ai2.length;
        byte byte0 = 0;
        int i20;
        int k20 = i20 = ai1[0];
        int k = 0;
        int j20;
        int l20 = j20 = ai3[0];
        int i1 = 0;
        for (int i21 = 1; i21 < i; i21++)
            if (ai1[i21] < i20) {
                i20 = ai1[i21];
                k = i21;
            } else if (ai1[i21] > k20)
                k20 = ai1[i21];

        for (int j21 = 1; j21 < j; j21++)
            if (ai3[j21] < j20) {
                j20 = ai3[j21];
                i1 = j21;
            } else if (ai3[j21] > l20)
                l20 = ai3[j21];

        if (j20 >= k20)
            return false;
        if (i20 >= l20)
            return false;
        int l;
        int j1;
        boolean flag;
        if (ai1[k] < ai3[i1]) {
            for (l = k; ai1[l] < ai3[i1]; l = (l + 1) % i) ;
            for (; ai1[k] < ai3[i1]; k = ((k - 1) + i) % i) ;
            int k1 = method302(ai[(k + 1) % i], ai1[(k + 1) % i], ai[k], ai1[k], ai3[i1]);
            int k6 = method302(ai[((l - 1) + i) % i], ai1[((l - 1) + i) % i], ai[l], ai1[l], ai3[i1]);
            int l10 = ai2[i1];
            flag = (k1 < l10) | (k6 < l10);
            if (method304(k1, k6, l10, flag))
                return true;
            j1 = (i1 + 1) % j;
            i1 = ((i1 - 1) + j) % j;
            if (k == l)
                byte0 = 1;
        } else {
            for (j1 = i1; ai3[j1] < ai1[k]; j1 = (j1 + 1) % j) ;
            for (; ai3[i1] < ai1[k]; i1 = ((i1 - 1) + j) % j) ;
            int l1 = ai[k];
            int i11 = method302(ai2[(i1 + 1) % j], ai3[(i1 + 1) % j], ai2[i1], ai3[i1], ai1[k]);
            int l15 = method302(ai2[((j1 - 1) + j) % j], ai3[((j1 - 1) + j) % j], ai2[j1], ai3[j1], ai1[k]);
            flag = (l1 < i11) | (l1 < l15);
            if (method304(i11, l15, l1, !flag))
                return true;
            l = (k + 1) % i;
            k = ((k - 1) + i) % i;
            if (i1 == j1)
                byte0 = 2;
        }
        while (byte0 == 0)
            if (ai1[k] < ai1[l]) {
                if (ai1[k] < ai3[i1]) {
                    if (ai1[k] < ai3[j1]) {
                        int i2 = ai[k];
                        int l6 = method302(ai[((l - 1) + i) % i], ai1[((l - 1) + i) % i], ai[l], ai1[l], ai1[k]);
                        int j11 = method302(ai2[(i1 + 1) % j], ai3[(i1 + 1) % j], ai2[i1], ai3[i1], ai1[k]);
                        int i16 = method302(ai2[((j1 - 1) + j) % j], ai3[((j1 - 1) + j) % j], ai2[j1], ai3[j1], ai1[k]);
                        if (method303(i2, l6, j11, i16, flag))
                            return true;
                        k = ((k - 1) + i) % i;
                        if (k == l)
                            byte0 = 1;
                    } else {
                        int j2 = method302(ai[(k + 1) % i], ai1[(k + 1) % i], ai[k], ai1[k], ai3[j1]);
                        int i7 = method302(ai[((l - 1) + i) % i], ai1[((l - 1) + i) % i], ai[l], ai1[l], ai3[j1]);
                        int k11 = method302(ai2[(i1 + 1) % j], ai3[(i1 + 1) % j], ai2[i1], ai3[i1], ai3[j1]);
                        int j16 = ai2[j1];
                        if (method303(j2, i7, k11, j16, flag))
                            return true;
                        j1 = (j1 + 1) % j;
                        if (i1 == j1)
                            byte0 = 2;
                    }
                } else if (ai3[i1] < ai3[j1]) {
                    int k2 = method302(ai[(k + 1) % i], ai1[(k + 1) % i], ai[k], ai1[k], ai3[i1]);
                    int j7 = method302(ai[((l - 1) + i) % i], ai1[((l - 1) + i) % i], ai[l], ai1[l], ai3[i1]);
                    int l11 = ai2[i1];
                    int k16 = method302(ai2[((j1 - 1) + j) % j], ai3[((j1 - 1) + j) % j], ai2[j1], ai3[j1], ai3[i1]);
                    if (method303(k2, j7, l11, k16, flag))
                        return true;
                    i1 = ((i1 - 1) + j) % j;
                    if (i1 == j1)
                        byte0 = 2;
                } else {
                    int l2 = method302(ai[(k + 1) % i], ai1[(k + 1) % i], ai[k], ai1[k], ai3[j1]);
                    int k7 = method302(ai[((l - 1) + i) % i], ai1[((l - 1) + i) % i], ai[l], ai1[l], ai3[j1]);
                    int i12 = method302(ai2[(i1 + 1) % j], ai3[(i1 + 1) % j], ai2[i1], ai3[i1], ai3[j1]);
                    int l16 = ai2[j1];
                    if (method303(l2, k7, i12, l16, flag))
                        return true;
                    j1 = (j1 + 1) % j;
                    if (i1 == j1)
                        byte0 = 2;
                }
            } else if (ai1[l] < ai3[i1]) {
                if (ai1[l] < ai3[j1]) {
                    int i3 = method302(ai[(k + 1) % i], ai1[(k + 1) % i], ai[k], ai1[k], ai1[l]);
                    int l7 = ai[l];
                    int j12 = method302(ai2[(i1 + 1) % j], ai3[(i1 + 1) % j], ai2[i1], ai3[i1], ai1[l]);
                    int i17 = method302(ai2[((j1 - 1) + j) % j], ai3[((j1 - 1) + j) % j], ai2[j1], ai3[j1], ai1[l]);
                    if (method303(i3, l7, j12, i17, flag))
                        return true;
                    l = (l + 1) % i;
                    if (k == l)
                        byte0 = 1;
                } else {
                    int j3 = method302(ai[(k + 1) % i], ai1[(k + 1) % i], ai[k], ai1[k], ai3[j1]);
                    int i8 = method302(ai[((l - 1) + i) % i], ai1[((l - 1) + i) % i], ai[l], ai1[l], ai3[j1]);
                    int k12 = method302(ai2[(i1 + 1) % j], ai3[(i1 + 1) % j], ai2[i1], ai3[i1], ai3[j1]);
                    int j17 = ai2[j1];
                    if (method303(j3, i8, k12, j17, flag))
                        return true;
                    j1 = (j1 + 1) % j;
                    if (i1 == j1)
                        byte0 = 2;
                }
            } else if (ai3[i1] < ai3[j1]) {
                int k3 = method302(ai[(k + 1) % i], ai1[(k + 1) % i], ai[k], ai1[k], ai3[i1]);
                int j8 = method302(ai[((l - 1) + i) % i], ai1[((l - 1) + i) % i], ai[l], ai1[l], ai3[i1]);
                int l12 = ai2[i1];
                int k17 = method302(ai2[((j1 - 1) + j) % j], ai3[((j1 - 1) + j) % j], ai2[j1], ai3[j1], ai3[i1]);
                if (method303(k3, j8, l12, k17, flag))
                    return true;
                i1 = ((i1 - 1) + j) % j;
                if (i1 == j1)
                    byte0 = 2;
            } else {
                int l3 = method302(ai[(k + 1) % i], ai1[(k + 1) % i], ai[k], ai1[k], ai3[j1]);
                int k8 = method302(ai[((l - 1) + i) % i], ai1[((l - 1) + i) % i], ai[l], ai1[l], ai3[j1]);
                int i13 = method302(ai2[(i1 + 1) % j], ai3[(i1 + 1) % j], ai2[i1], ai3[i1], ai3[j1]);
                int l17 = ai2[j1];
                if (method303(l3, k8, i13, l17, flag))
                    return true;
                j1 = (j1 + 1) % j;
                if (i1 == j1)
                    byte0 = 2;
            }
        while (byte0 == 1)
            if (ai1[k] < ai3[i1]) {
                if (ai1[k] < ai3[j1]) {
                    int i4 = ai[k];
                    int j13 = method302(ai2[(i1 + 1) % j], ai3[(i1 + 1) % j], ai2[i1], ai3[i1], ai1[k]);
                    int i18 = method302(ai2[((j1 - 1) + j) % j], ai3[((j1 - 1) + j) % j], ai2[j1], ai3[j1], ai1[k]);
                    return method304(j13, i18, i4, !flag);
                }
                int j4 = method302(ai[(k + 1) % i], ai1[(k + 1) % i], ai[k], ai1[k], ai3[j1]);
                int l8 = method302(ai[((l - 1) + i) % i], ai1[((l - 1) + i) % i], ai[l], ai1[l], ai3[j1]);
                int k13 = method302(ai2[(i1 + 1) % j], ai3[(i1 + 1) % j], ai2[i1], ai3[i1], ai3[j1]);
                int j18 = ai2[j1];
                if (method303(j4, l8, k13, j18, flag))
                    return true;
                j1 = (j1 + 1) % j;
                if (i1 == j1)
                    byte0 = 0;
            } else if (ai3[i1] < ai3[j1]) {
                int k4 = method302(ai[(k + 1) % i], ai1[(k + 1) % i], ai[k], ai1[k], ai3[i1]);
                int i9 = method302(ai[((l - 1) + i) % i], ai1[((l - 1) + i) % i], ai[l], ai1[l], ai3[i1]);
                int l13 = ai2[i1];
                int k18 = method302(ai2[((j1 - 1) + j) % j], ai3[((j1 - 1) + j) % j], ai2[j1], ai3[j1], ai3[i1]);
                if (method303(k4, i9, l13, k18, flag))
                    return true;
                i1 = ((i1 - 1) + j) % j;
                if (i1 == j1)
                    byte0 = 0;
            } else {
                int l4 = method302(ai[(k + 1) % i], ai1[(k + 1) % i], ai[k], ai1[k], ai3[j1]);
                int j9 = method302(ai[((l - 1) + i) % i], ai1[((l - 1) + i) % i], ai[l], ai1[l], ai3[j1]);
                int i14 = method302(ai2[(i1 + 1) % j], ai3[(i1 + 1) % j], ai2[i1], ai3[i1], ai3[j1]);
                int l18 = ai2[j1];
                if (method303(l4, j9, i14, l18, flag))
                    return true;
                j1 = (j1 + 1) % j;
                if (i1 == j1)
                    byte0 = 0;
            }
        while (byte0 == 2)
            if (ai3[i1] < ai1[k]) {
                if (ai3[i1] < ai1[l]) {
                    int i5 = method302(ai[(k + 1) % i], ai1[(k + 1) % i], ai[k], ai1[k], ai3[i1]);
                    int k9 = method302(ai[((l - 1) + i) % i], ai1[((l - 1) + i) % i], ai[l], ai1[l], ai3[i1]);
                    int j14 = ai2[i1];
                    return method304(i5, k9, j14, flag);
                }
                int j5 = method302(ai[(k + 1) % i], ai1[(k + 1) % i], ai[k], ai1[k], ai1[l]);
                int l9 = ai[l];
                int k14 = method302(ai2[(i1 + 1) % j], ai3[(i1 + 1) % j], ai2[i1], ai3[i1], ai1[l]);
                int i19 = method302(ai2[((j1 - 1) + j) % j], ai3[((j1 - 1) + j) % j], ai2[j1], ai3[j1], ai1[l]);
                if (method303(j5, l9, k14, i19, flag))
                    return true;
                l = (l + 1) % i;
                if (k == l)
                    byte0 = 0;
            } else if (ai1[k] < ai1[l]) {
                int k5 = ai[k];
                int i10 = method302(ai[((l - 1) + i) % i], ai1[((l - 1) + i) % i], ai[l], ai1[l], ai1[k]);
                int l14 = method302(ai2[(i1 + 1) % j], ai3[(i1 + 1) % j], ai2[i1], ai3[i1], ai1[k]);
                int j19 = method302(ai2[((j1 - 1) + j) % j], ai3[((j1 - 1) + j) % j], ai2[j1], ai3[j1], ai1[k]);
                if (method303(k5, i10, l14, j19, flag))
                    return true;
                k = ((k - 1) + i) % i;
                if (k == l)
                    byte0 = 0;
            } else {
                int l5 = method302(ai[(k + 1) % i], ai1[(k + 1) % i], ai[k], ai1[k], ai1[l]);
                int j10 = ai[l];
                int i15 = method302(ai2[(i1 + 1) % j], ai3[(i1 + 1) % j], ai2[i1], ai3[i1], ai1[l]);
                int k19 = method302(ai2[((j1 - 1) + j) % j], ai3[((j1 - 1) + j) % j], ai2[j1], ai3[j1], ai1[l]);
                if (method303(l5, j10, i15, k19, flag))
                    return true;
                l = (l + 1) % i;
                if (k == l)
                    byte0 = 0;
            }
        if (ai1[k] < ai3[i1]) {
            int i6 = ai[k];
            int j15 = method302(ai2[(i1 + 1) % j], ai3[(i1 + 1) % j], ai2[i1], ai3[i1], ai1[k]);
            int l19 = method302(ai2[((j1 - 1) + j) % j], ai3[((j1 - 1) + j) % j], ai2[j1], ai3[j1], ai1[k]);
            return method304(j15, l19, i6, !flag);
        }
        int j6 = method302(ai[(k + 1) % i], ai1[(k + 1) % i], ai[k], ai1[k], ai3[i1]);
        int k10 = method302(ai[((l - 1) + i) % i], ai1[((l - 1) + i) % i], ai[l], ai1[l], ai3[i1]);
        int k15 = ai2[i1];
        return method304(j6, k10, k15, flag);
    }

    public int anInt242;
    public int[] anIntArray243;
    public int[][] anIntArrayArray244;
    public int[] anIntArray245;
    public int anInt246;
    public int anInt247;
    public int anInt248;
    public int anInt249;
    public int anInt250;
    public int anInt251;
    public static int[] anIntArray252 = new int[2048];
    public static int[] anIntArray253 = new int[512];
    public boolean aBoolean254;
    public double aDouble255;
    public int anInt256;
    public boolean aBoolean257;
    public int anInt258;
    public int anInt259;
    public int anInt260;
    public int anInt261;
    public object3d[] aObject3dArray262;
    public int[] anIntArray263;
    public int anInt264;
    public int anInt265;
    public int anInt266;
    public int anInt267;
    public int anInt268;
    public int anInt269;
    public int anInt270;
    public int anInt271;
    public int anInt272;
    public int anInt273;
    public int anInt274;
    public int anInt275;
    public int anInt276;
    public int anInt277;
    public int anInt278;
    public object3d[] aObject3dArray279;
    public int[] anIntArray280;
    public int anInt281;
    public polygon3d[] aPolygon3dArray282;
    public int anInt283;
    public int[] anIntArray284;
    public int[] anIntArray285;
    public int[] anIntArray286;
    public int[] anIntArray287;
    public int[] anIntArray288;
    public int[] anIntArray289;
    public int[] anIntArray290;
    public object3d aObject3d_291;
    public int anInt292;
    public byte[][] aByteArrayArray293;
    public int[][] anIntArrayArray294;
    public int[] anIntArray295;
    public long[] aLongArray296;
    public int[][] anIntArrayArray297;
    public boolean[] aBooleanArray298;
    public static long aLong299;
    public int[][] anIntArrayArray300;
    public int[][] anIntArrayArray301;
    public static byte[] aByteArray302;
    public static int[] anIntArray303 = new int[256];
    public pixmap aPixmap_304;
    public int[] anIntArray305;
    public scanline[] aScanlineArray306;
    public int anInt307;
    public int anInt308;
    public int[] anIntArray309;
    public int[] anIntArray310;
    public int[] anIntArray311;
    public int[] anIntArray312;
    public int[] anIntArray313;
    public int[] anIntArray314;
    public boolean aBoolean315;
    public static int anInt316;
    public static int anInt317;
    public static int anInt318;
    public static int anInt319;
    public static int anInt320;
    public static int anInt321;
    public int anInt322;
    public int anInt323;

}
