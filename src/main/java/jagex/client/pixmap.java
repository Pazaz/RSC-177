package jagex.client;

import jagex.tools;

import java.awt.*;
import java.awt.image.*;

// was: a.a.g
public class pixmap
        implements ImageProducer, ImageObserver {

    public pixmap(int i, int j, int k, Component component) {
        aBoolean208 = false;
        aBoolean212 = false;
        aComponent192 = component;
        anInt205 = j;
        anInt207 = i;
        anInt187 = anInt184 = i;
        anInt188 = anInt185 = j;
        anInt186 = i * j;
        anIntArray190 = new int[i * j];
        anIntArrayArray194 = new int[k][];
        aBooleanArray203 = new boolean[k];
        aByteArrayArray195 = new byte[k][];
        anIntArrayArray196 = new int[k][];
        anIntArray197 = new int[k];
        anIntArray198 = new int[k];
        anIntArray201 = new int[k];
        anIntArray202 = new int[k];
        anIntArray199 = new int[k];
        anIntArray200 = new int[k];
        if (i > 1 && j > 1 && component != null) {
            aColorModel189 = new DirectColorModel(32, 0xff0000, 65280, 255);
            int l = anInt184 * anInt185;
            for (int i1 = 0; i1 < l; i1++)
                anIntArray190[i1] = 0;

            anImage193 = component.createImage(this);
            method206();
            component.prepareImage(anImage193, component);
            method206();
            component.prepareImage(anImage193, component);
            method206();
            component.prepareImage(anImage193, component);
        }
    }

    public synchronized void addConsumer(ImageConsumer imageconsumer) {
        anImageConsumer191 = imageconsumer;
        imageconsumer.setDimensions(anInt184, anInt185);
        imageconsumer.setProperties(null);
        imageconsumer.setColorModel(aColorModel189);
        imageconsumer.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer imageconsumer) {
        return anImageConsumer191 == imageconsumer;
    }

    public synchronized void removeConsumer(ImageConsumer imageconsumer) {
        if (anImageConsumer191 == imageconsumer)
            anImageConsumer191 = null;
    }

    public void startProduction(ImageConsumer imageconsumer) {
        addConsumer(imageconsumer);
    }

    public void requestTopDownLeftRightResend(ImageConsumer imageconsumer) {
        System.out.println("TDLR");
    }

    public synchronized void method206() {
        if (anImageConsumer191 == null) {
        } else {
            anImageConsumer191.setPixels(0, 0, anInt184, anInt185, aColorModel189, anIntArray190, 0, anInt184);
            anImageConsumer191.imageComplete(2);
        }
    }

    public void method207(int i, int j, int k, int l) {
        if (i < 0)
            i = 0;
        if (j < 0)
            j = 0;
        if (k > anInt184)
            k = anInt184;
        if (l > anInt185)
            l = anInt185;
        anInt206 = i;
        anInt204 = j;
        anInt207 = k;
        anInt205 = l;
    }

    public void method208() {
        anInt206 = 0;
        anInt204 = 0;
        anInt207 = anInt184;
        anInt205 = anInt185;
    }

    public void method209(Graphics g, int i, int j) {
        method206();
        g.drawImage(anImage193, i, j, this);
    }

    public void method210() {
        int i = anInt184 * anInt185;
        if (!aBoolean208) {
            for (int j = 0; j < i; j++)
                anIntArray190[j] = 0;

            return;
        }
        int k = 0;
        for (int l = -anInt185; l < 0; l += 2) {
            for (int i1 = -anInt184; i1 < 0; i1++)
                anIntArray190[k++] = 0;

            k += anInt184;
        }

    }

    public void method211(int i, int j, int k, int l, int i1) {
        int j1 = 256 - i1;
        int k1 = (l >> 16 & 0xff) * i1;
        int l1 = (l >> 8 & 0xff) * i1;
        int i2 = (l & 0xff) * i1;
        int i3 = j - k;
        if (i3 < 0)
            i3 = 0;
        int j3 = j + k;
        if (j3 >= anInt185)
            j3 = anInt185 - 1;
        byte byte0 = 1;
        if (aBoolean208) {
            byte0 = 2;
            if ((i3 & 1) != 0)
                i3++;
        }
        for (int k3 = i3; k3 <= j3; k3 += byte0) {
            int l3 = k3 - j;
            int i4 = (int) Math.sqrt(k * k - l3 * l3);
            int j4 = i - i4;
            if (j4 < 0)
                j4 = 0;
            int k4 = i + i4;
            if (k4 >= anInt184)
                k4 = anInt184 - 1;
            int l4 = j4 + k3 * anInt184;
            for (int i5 = j4; i5 <= k4; i5++) {
                int j2 = (anIntArray190[l4] >> 16 & 0xff) * j1;
                int k2 = (anIntArray190[l4] >> 8 & 0xff) * j1;
                int l2 = (anIntArray190[l4] & 0xff) * j1;
                int j5 = ((k1 + j2 >> 8) << 16) + ((l1 + k2 >> 8) << 8) + (i2 + l2 >> 8);
                anIntArray190[l4++] = j5;
            }

        }

    }

    public void method212(int i, int j, int k, int l, int i1, int j1) {
        if (i < anInt206) {
            k -= anInt206 - i;
            i = anInt206;
        }
        if (j < anInt204) {
            l -= anInt204 - j;
            j = anInt204;
        }
        if (i + k > anInt207)
            k = anInt207 - i;
        if (j + l > anInt205)
            l = anInt205 - j;
        int k1 = 256 - j1;
        int l1 = (i1 >> 16 & 0xff) * j1;
        int i2 = (i1 >> 8 & 0xff) * j1;
        int j2 = (i1 & 0xff) * j1;
        int j3 = anInt184 - k;
        byte byte0 = 1;
        if (aBoolean208) {
            byte0 = 2;
            j3 += anInt184;
            if ((j & 1) != 0) {
                j++;
                l--;
            }
        }
        int k3 = i + j * anInt184;
        for (int l3 = 0; l3 < l; l3 += byte0) {
            for (int i4 = -k; i4 < 0; i4++) {
                int k2 = (anIntArray190[k3] >> 16 & 0xff) * k1;
                int l2 = (anIntArray190[k3] >> 8 & 0xff) * k1;
                int i3 = (anIntArray190[k3] & 0xff) * k1;
                int j4 = ((l1 + k2 >> 8) << 16) + ((i2 + l2 >> 8) << 8) + (j2 + i3 >> 8);
                anIntArray190[k3++] = j4;
            }

            k3 += j3;
        }

    }

    public void method213(int i, int j, int k, int l, int i1, int j1) {
        if (i < anInt206) {
            k -= anInt206 - i;
            i = anInt206;
        }
        if (i + k > anInt207)
            k = anInt207 - i;
        int k1 = j1 >> 16 & 0xff;
        int l1 = j1 >> 8 & 0xff;
        int i2 = j1 & 0xff;
        int j2 = i1 >> 16 & 0xff;
        int k2 = i1 >> 8 & 0xff;
        int l2 = i1 & 0xff;
        int i3 = anInt184 - k;
        byte byte0 = 1;
        if (aBoolean208) {
            byte0 = 2;
            i3 += anInt184;
            if ((j & 1) != 0) {
                j++;
                l--;
            }
        }
        int j3 = i + j * anInt184;
        for (int k3 = 0; k3 < l; k3 += byte0)
            if (k3 + j >= anInt204 && k3 + j < anInt205) {
                int l3 = ((k1 * k3 + j2 * (l - k3)) / l << 16) + ((l1 * k3 + k2 * (l - k3)) / l << 8) + (i2 * k3 + l2 * (l - k3)) / l;
                for (int i4 = -k; i4 < 0; i4++)
                    anIntArray190[j3++] = l3;

                j3 += i3;
            } else {
                j3 += anInt184;
            }

    }

    public void method214(int i, int j, int k, int l, int i1) {
        if (i < anInt206) {
            k -= anInt206 - i;
            i = anInt206;
        }
        if (j < anInt204) {
            l -= anInt204 - j;
            j = anInt204;
        }
        if (i + k > anInt207)
            k = anInt207 - i;
        if (j + l > anInt205)
            l = anInt205 - j;
        int j1 = anInt184 - k;
        byte byte0 = 1;
        if (aBoolean208) {
            byte0 = 2;
            j1 += anInt184;
            if ((j & 1) != 0) {
                j++;
                l--;
            }
        }
        int k1 = i + j * anInt184;
        for (int l1 = -l; l1 < 0; l1 += byte0) {
            for (int i2 = -k; i2 < 0; i2++)
                anIntArray190[k1++] = i1;

            k1 += j1;
        }

    }

    public void method215(int i, int j, int k, int l, int i1) {
        method216(i, j, k, i1);
        method216(i, (j + l) - 1, k, i1);
        method217(i, j, l, i1);
        method217((i + k) - 1, j, l, i1);
    }

    public void method216(int i, int j, int k, int l) {
        if (j < anInt204 || j >= anInt205)
            return;
        if (i < anInt206) {
            k -= anInt206 - i;
            i = anInt206;
        }
        if (i + k > anInt207)
            k = anInt207 - i;
        int i1 = i + j * anInt184;
        for (int j1 = 0; j1 < k; j1++)
            anIntArray190[i1 + j1] = l;

    }

    public void method217(int i, int j, int k, int l) {
        if (i < anInt206 || i >= anInt207)
            return;
        if (j < anInt204) {
            k -= anInt204 - j;
            j = anInt204;
        }
        if (j + k > anInt207)
            k = anInt205 - j;
        int i1 = i + j * anInt184;
        for (int j1 = 0; j1 < k; j1++)
            anIntArray190[i1 + j1 * anInt184] = l;

    }

    public void method218(int i, int j, int k) {
        if (i < anInt206 || j < anInt204 || i >= anInt207 || j >= anInt205) {
        } else {
            anIntArray190[i + j * anInt184] = k;
        }
    }

    public void method219() {
        int k = anInt184 * anInt185;
        for (int j = 0; j < k; j++) {
            int i = anIntArray190[j] & 0xffffff;
            anIntArray190[j] = (i >>> 1 & 0x7f7f7f) + (i >>> 2 & 0x3f3f3f) + (i >>> 3 & 0x1f1f1f) + (i >>> 4 & 0xf0f0f);
        }

    }

    public void method220(int i, int j, int k, int l, int i1, int j1) {
        for (int k1 = k; k1 < k + i1; k1++) {
            for (int l1 = l; l1 < l + j1; l1++) {
                int i2 = 0;
                int j2 = 0;
                int k2 = 0;
                int l2 = 0;
                for (int i3 = k1 - i; i3 <= k1 + i; i3++)
                    if (i3 >= 0 && i3 < anInt184) {
                        for (int j3 = l1 - j; j3 <= l1 + j; j3++)
                            if (j3 >= 0 && j3 < anInt185) {
                                int k3 = anIntArray190[i3 + anInt184 * j3];
                                i2 += k3 >> 16 & 0xff;
                                j2 += k3 >> 8 & 0xff;
                                k2 += k3 & 0xff;
                                l2++;
                            }

                    }

                anIntArray190[k1 + anInt184 * l1] = (i2 / l2 << 16) + (j2 / l2 << 8) + k2 / l2;
            }

        }

    }

    public static int method221(int i, int j, int k) {
        return (i << 16) + (j << 8) + k;
    }

    public void method222() {
        for (int i = 0; i < anIntArrayArray194.length; i++) {
            anIntArrayArray194[i] = null;
            anIntArray197[i] = 0;
            anIntArray198[i] = 0;
            aByteArrayArray195[i] = null;
            anIntArrayArray196[i] = null;
        }

    }

    public void method223(int i, byte[] abyte0, byte[] abyte1, int j) {
        int k = tools.method344(abyte0, 0);
        int l = tools.method344(abyte1, k);
        k += 2;
        int i1 = tools.method344(abyte1, k);
        k += 2;
        int j1 = abyte1[k++] & 0xff;
        int[] ai = new int[j1];
        ai[0] = 0xff00ff;
        for (int k1 = 0; k1 < j1 - 1; k1++) {
            ai[k1 + 1] = ((abyte1[k] & 0xff) << 16) + ((abyte1[k + 1] & 0xff) << 8) + (abyte1[k + 2] & 0xff);
            k += 3;
        }

        int l1 = 2;
        for (int i2 = i; i2 < i + j; i2++) {
            anIntArray199[i2] = abyte1[k++] & 0xff;
            anIntArray200[i2] = abyte1[k++] & 0xff;
            anIntArray197[i2] = tools.method344(abyte1, k);
            k += 2;
            anIntArray198[i2] = tools.method344(abyte1, k);
            k += 2;
            int j2 = abyte1[k++] & 0xff;
            int k2 = anIntArray197[i2] * anIntArray198[i2];
            aByteArrayArray195[i2] = new byte[k2];
            anIntArrayArray196[i2] = ai;
            anIntArray201[i2] = l;
            anIntArray202[i2] = i1;
            anIntArrayArray194[i2] = null;
            aBooleanArray203[i2] = anIntArray199[i2] != 0 || anIntArray200[i2] != 0;
            if (j2 == 0) {
                for (int l2 = 0; l2 < k2; l2++) {
                    aByteArrayArray195[i2][l2] = abyte0[l1++];
                    if (aByteArrayArray195[i2][l2] == 0)
                        aBooleanArray203[i2] = true;
                }

            } else if (j2 == 1) {
                for (int i3 = 0; i3 < anIntArray197[i2]; i3++) {
                    for (int j3 = 0; j3 < anIntArray198[i2]; j3++) {
                        aByteArrayArray195[i2][i3 + j3 * anIntArray197[i2]] = abyte0[l1++];
                        if (aByteArrayArray195[i2][i3 + j3 * anIntArray197[i2]] == 0)
                            aBooleanArray203[i2] = true;
                    }

                }

            }
        }

    }

    public void method224(int i, byte[] abyte0) {
        int[] ai = anIntArrayArray194[i] = new int[10200];
        anIntArray197[i] = 255;
        anIntArray198[i] = 40;
        anIntArray199[i] = 0;
        anIntArray200[i] = 0;
        anIntArray201[i] = 255;
        anIntArray202[i] = 40;
        aBooleanArray203[i] = false;
        int j = 0;
        int k = 1;
        int l;
        for (l = 0; l < 255; ) {
            int i1 = abyte0[k++] & 0xff;
            for (int k1 = 0; k1 < i1; k1++)
                ai[l++] = j;

            j = 0xffffff - j;
        }

        for (int j1 = 1; j1 < 40; j1++) {
            for (int l1 = 0; l1 < 255; ) {
                int i2 = abyte0[k++] & 0xff;
                for (int j2 = 0; j2 < i2; j2++) {
                    ai[l] = ai[l - 255];
                    l++;
                    l1++;
                }

                if (l1 < 255) {
                    ai[l] = 0xffffff - ai[l - 255];
                    l++;
                    l1++;
                }
            }

        }

    }

    public void method225(int i) {
        int j = anIntArray197[i] * anIntArray198[i];
        int[] ai = anIntArrayArray194[i];
        int[] ai1 = new int[32768];
        for (int k = 0; k < j; k++) {
            int l = ai[k];
            ai1[((l & 0xf80000) >> 9) + ((l & 0xf800) >> 6) + ((l & 0xf8) >> 3)]++;
        }

        int[] ai2 = new int[256];
        ai2[0] = 0xff00ff;
        int[] ai3 = new int[256];
        for (int i1 = 0; i1 < 32768; i1++) {
            int j1 = ai1[i1];
            if (j1 > ai3[255]) {
                for (int k1 = 1; k1 < 256; k1++) {
                    if (j1 <= ai3[k1])
                        continue;
                    for (int i2 = 255; i2 > k1; i2--) {
                        ai2[i2] = ai2[i2 - 1];
                        ai3[i2] = ai3[i2 - 1];
                    }

                    ai2[k1] = ((i1 & 0x7c00) << 9) + ((i1 & 0x3e0) << 6) + ((i1 & 0x1f) << 3) + 0x40404;
                    ai3[k1] = j1;
                    break;
                }

            }
            ai1[i1] = -1;
        }

        byte[] abyte0 = new byte[j];
        for (int l1 = 0; l1 < j; l1++) {
            int j2 = ai[l1];
            int k2 = ((j2 & 0xf80000) >> 9) + ((j2 & 0xf800) >> 6) + ((j2 & 0xf8) >> 3);
            int l2 = ai1[k2];
            if (l2 == -1) {
                int i3 = 0x3b9ac9ff;
                int j3 = j2 >> 16 & 0xff;
                int k3 = j2 >> 8 & 0xff;
                int l3 = j2 & 0xff;
                for (int i4 = 0; i4 < 256; i4++) {
                    int j4 = ai2[i4];
                    int k4 = j4 >> 16 & 0xff;
                    int l4 = j4 >> 8 & 0xff;
                    int i5 = j4 & 0xff;
                    int j5 = (j3 - k4) * (j3 - k4) + (k3 - l4) * (k3 - l4) + (l3 - i5) * (l3 - i5);
                    if (j5 < i3) {
                        i3 = j5;
                        l2 = i4;
                    }
                }

                ai1[k2] = l2;
            }
            abyte0[l1] = (byte) l2;
        }

        aByteArrayArray195[i] = abyte0;
        anIntArrayArray196[i] = ai2;
        anIntArrayArray194[i] = null;
    }

    public void method226(int i) {
        if (aByteArrayArray195[i] == null)
            return;
        int j = anIntArray197[i] * anIntArray198[i];
        byte[] abyte0 = aByteArrayArray195[i];
        int[] ai = anIntArrayArray196[i];
        int[] ai1 = new int[j];
        for (int k = 0; k < j; k++) {
            int l = ai[abyte0[k] & 0xff];
            if (l == 0)
                l = 1;
            else if (l == 0xff00ff)
                l = 0;
            ai1[k] = l;
        }

        anIntArrayArray194[i] = ai1;
        aByteArrayArray195[i] = null;
        anIntArrayArray196[i] = null;
    }

    public void method227(int i, int j, int k, int l, int i1) {
        anIntArray197[i] = l;
        anIntArray198[i] = i1;
        aBooleanArray203[i] = false;
        anIntArray199[i] = 0;
        anIntArray200[i] = 0;
        anIntArray201[i] = l;
        anIntArray202[i] = i1;
        int j1 = l * i1;
        int k1 = 0;
        anIntArrayArray194[i] = new int[j1];
        for (int l1 = j; l1 < j + l; l1++) {
            for (int i2 = k; i2 < k + i1; i2++)
                anIntArrayArray194[i][k1++] = anIntArray190[l1 + i2 * anInt184];

        }

    }

    public void method228(int i, int j, int k, int l, int i1) {
        anIntArray197[i] = l;
        anIntArray198[i] = i1;
        aBooleanArray203[i] = false;
        anIntArray199[i] = 0;
        anIntArray200[i] = 0;
        anIntArray201[i] = l;
        anIntArray202[i] = i1;
        int j1 = l * i1;
        int k1 = 0;
        anIntArrayArray194[i] = new int[j1];
        for (int l1 = k; l1 < k + i1; l1++) {
            for (int i2 = j; i2 < j + l; i2++)
                anIntArrayArray194[i][k1++] = anIntArray190[i2 + l1 * anInt184];

        }

    }

    public void method229(int i, int j, int k) {
        if (aBooleanArray203[k]) {
            i += anIntArray199[k];
            j += anIntArray200[k];
        }
        int l = i + j * anInt184;
        int i1 = 0;
        int j1 = anIntArray198[k];
        int k1 = anIntArray197[k];
        int l1 = anInt184 - k1;
        int i2 = 0;
        if (j < anInt204) {
            int j2 = anInt204 - j;
            j1 -= j2;
            j = anInt204;
            i1 += j2 * k1;
            l += j2 * anInt184;
        }
        if (j + j1 >= anInt205)
            j1 -= ((j + j1) - anInt205) + 1;
        if (i < anInt206) {
            int k2 = anInt206 - i;
            k1 -= k2;
            i = anInt206;
            i1 += k2;
            l += k2;
            i2 += k2;
            l1 += k2;
        }
        if (i + k1 >= anInt207) {
            int l2 = ((i + k1) - anInt207) + 1;
            k1 -= l2;
            i2 += l2;
            l1 += l2;
        }
        if (k1 <= 0 || j1 <= 0)
            return;
        byte byte0 = 1;
        if (aBoolean208) {
            byte0 = 2;
            l1 += anInt184;
            i2 += anIntArray197[k];
            if ((j & 1) != 0) {
                l += anInt184;
                j1--;
            }
        }
        if (anIntArrayArray194[k] == null) {
            method235(anIntArray190, aByteArrayArray195[k], anIntArrayArray196[k], i1, l, k1, j1, l1, i2, byte0);
        } else {
            method234(anIntArray190, anIntArrayArray194[k], 0, i1, l, k1, j1, l1, i2, byte0);
        }
    }

    public void method230(int i, int j, int k, int l, int i1) {
        try {
            int j1 = anIntArray197[i1];
            int k1 = anIntArray198[i1];
            int l1 = 0;
            int i2 = 0;
            int j2 = (j1 << 16) / k;
            int k2 = (k1 << 16) / l;
            if (aBooleanArray203[i1]) {
                int l2 = anIntArray201[i1];
                int j3 = anIntArray202[i1];
                j2 = (l2 << 16) / k;
                k2 = (j3 << 16) / l;
                i += ((anIntArray199[i1] * k + l2) - 1) / l2;
                j += ((anIntArray200[i1] * l + j3) - 1) / j3;
                if ((anIntArray199[i1] * k) % l2 != 0)
                    l1 = (l2 - (anIntArray199[i1] * k) % l2 << 16) / k;
                if ((anIntArray200[i1] * l) % j3 != 0)
                    i2 = (j3 - (anIntArray200[i1] * l) % j3 << 16) / l;
                k = (k * (anIntArray197[i1] - (l1 >> 16))) / l2;
                l = (l * (anIntArray198[i1] - (i2 >> 16))) / j3;
            }
            int i3 = i + j * anInt184;
            int k3 = anInt184 - k;
            if (j < anInt204) {
                int l3 = anInt204 - j;
                l -= l3;
                j = 0;
                i3 += l3 * anInt184;
                i2 += k2 * l3;
            }
            if (j + l >= anInt205)
                l -= ((j + l) - anInt205) + 1;
            if (i < anInt206) {
                int i4 = anInt206 - i;
                k -= i4;
                i = 0;
                i3 += i4;
                l1 += j2 * i4;
                k3 += i4;
            }
            if (i + k >= anInt207) {
                int j4 = ((i + k) - anInt207) + 1;
                k -= j4;
                k3 += j4;
            }
            byte byte0 = 1;
            if (aBoolean208) {
                byte0 = 2;
                k3 += anInt184;
                k2 += k2;
                if ((j & 1) != 0) {
                    i3 += anInt184;
                    l--;
                }
            }
            method236(anIntArray190, anIntArrayArray194[i1], 0, l1, i2, i3, k3, k, l, j2, k2, j1, byte0);
        } catch (Exception _ex) {
            System.out.println("error in sprite clipping routine");
        }
    }

    public void method231(int i, int j, int k, int l) {
        if (aBooleanArray203[k]) {
            i += anIntArray199[k];
            j += anIntArray200[k];
        }
        int i1 = i + j * anInt184;
        int j1 = 0;
        int k1 = anIntArray198[k];
        int l1 = anIntArray197[k];
        int i2 = anInt184 - l1;
        int j2 = 0;
        if (j < anInt204) {
            int k2 = anInt204 - j;
            k1 -= k2;
            j = anInt204;
            j1 += k2 * l1;
            i1 += k2 * anInt184;
        }
        if (j + k1 >= anInt205)
            k1 -= ((j + k1) - anInt205) + 1;
        if (i < anInt206) {
            int l2 = anInt206 - i;
            l1 -= l2;
            i = anInt206;
            j1 += l2;
            i1 += l2;
            j2 += l2;
            i2 += l2;
        }
        if (i + l1 >= anInt207) {
            int i3 = ((i + l1) - anInt207) + 1;
            l1 -= i3;
            j2 += i3;
            i2 += i3;
        }
        if (l1 <= 0 || k1 <= 0)
            return;
        byte byte0 = 1;
        if (aBoolean208) {
            byte0 = 2;
            i2 += anInt184;
            j2 += anIntArray197[k];
            if ((j & 1) != 0) {
                i1 += anInt184;
                k1--;
            }
        }
        if (anIntArrayArray194[k] == null) {
            method238(anIntArray190, aByteArrayArray195[k], anIntArrayArray196[k], j1, i1, l1, k1, i2, j2, byte0, l);
        } else {
            method237(anIntArray190, anIntArrayArray194[k], 0, j1, i1, l1, k1, i2, j2, byte0, l);
        }
    }

    public void method232(int i, int j, int k, int l, int i1, int j1) {
        try {
            int k1 = anIntArray197[i1];
            int l1 = anIntArray198[i1];
            int i2 = 0;
            int j2 = 0;
            int k2 = (k1 << 16) / k;
            int l2 = (l1 << 16) / l;
            if (aBooleanArray203[i1]) {
                int i3 = anIntArray201[i1];
                int k3 = anIntArray202[i1];
                k2 = (i3 << 16) / k;
                l2 = (k3 << 16) / l;
                i += ((anIntArray199[i1] * k + i3) - 1) / i3;
                j += ((anIntArray200[i1] * l + k3) - 1) / k3;
                if ((anIntArray199[i1] * k) % i3 != 0)
                    i2 = (i3 - (anIntArray199[i1] * k) % i3 << 16) / k;
                if ((anIntArray200[i1] * l) % k3 != 0)
                    j2 = (k3 - (anIntArray200[i1] * l) % k3 << 16) / l;
                k = (k * (anIntArray197[i1] - (i2 >> 16))) / i3;
                l = (l * (anIntArray198[i1] - (j2 >> 16))) / k3;
            }
            int j3 = i + j * anInt184;
            int l3 = anInt184 - k;
            if (j < anInt204) {
                int i4 = anInt204 - j;
                l -= i4;
                j = 0;
                j3 += i4 * anInt184;
                j2 += l2 * i4;
            }
            if (j + l >= anInt205)
                l -= ((j + l) - anInt205) + 1;
            if (i < anInt206) {
                int j4 = anInt206 - i;
                k -= j4;
                i = 0;
                j3 += j4;
                i2 += k2 * j4;
                l3 += j4;
            }
            if (i + k >= anInt207) {
                int k4 = ((i + k) - anInt207) + 1;
                k -= k4;
                l3 += k4;
            }
            byte byte0 = 1;
            if (aBoolean208) {
                byte0 = 2;
                l3 += anInt184;
                l2 += l2;
                if ((j & 1) != 0) {
                    j3 += anInt184;
                    l--;
                }
            }
            method239(anIntArray190, anIntArrayArray194[i1], 0, i2, j2, j3, l3, k, l, k2, l2, k1, byte0, j1);
        } catch (Exception _ex) {
            System.out.println("error in sprite clipping routine");
        }
    }

    public void method233(int i, int j, int k, int l, int i1, int j1) {
        try {
            int k1 = anIntArray197[i1];
            int l1 = anIntArray198[i1];
            int i2 = 0;
            int j2 = 0;
            int k2 = (k1 << 16) / k;
            int l2 = (l1 << 16) / l;
            if (aBooleanArray203[i1]) {
                int i3 = anIntArray201[i1];
                int k3 = anIntArray202[i1];
                k2 = (i3 << 16) / k;
                l2 = (k3 << 16) / l;
                i += ((anIntArray199[i1] * k + i3) - 1) / i3;
                j += ((anIntArray200[i1] * l + k3) - 1) / k3;
                if ((anIntArray199[i1] * k) % i3 != 0)
                    i2 = (i3 - (anIntArray199[i1] * k) % i3 << 16) / k;
                if ((anIntArray200[i1] * l) % k3 != 0)
                    j2 = (k3 - (anIntArray200[i1] * l) % k3 << 16) / l;
                k = (k * (anIntArray197[i1] - (i2 >> 16))) / i3;
                l = (l * (anIntArray198[i1] - (j2 >> 16))) / k3;
            }
            int j3 = i + j * anInt184;
            int l3 = anInt184 - k;
            if (j < anInt204) {
                int i4 = anInt204 - j;
                l -= i4;
                j = 0;
                j3 += i4 * anInt184;
                j2 += l2 * i4;
            }
            if (j + l >= anInt205)
                l -= ((j + l) - anInt205) + 1;
            if (i < anInt206) {
                int j4 = anInt206 - i;
                k -= j4;
                i = 0;
                j3 += j4;
                i2 += k2 * j4;
                l3 += j4;
            }
            if (i + k >= anInt207) {
                int k4 = ((i + k) - anInt207) + 1;
                k -= k4;
                l3 += k4;
            }
            byte byte0 = 1;
            if (aBoolean208) {
                byte0 = 2;
                l3 += anInt184;
                l2 += l2;
                if ((j & 1) != 0) {
                    j3 += anInt184;
                    l--;
                }
            }
            method240(anIntArray190, anIntArrayArray194[i1], 0, i2, j2, j3, l3, k, l, k2, l2, k1, byte0, j1);
        } catch (Exception _ex) {
            System.out.println("error in sprite clipping routine");
        }
    }

    public void method234(int[] ai, int[] ai1, int i, int j, int k, int l, int i1,
                          int j1, int k1, int l1) {
        int i2 = -(l >> 2);
        l = -(l & 3);
        for (int j2 = -i1; j2 < 0; j2 += l1) {
            for (int k2 = i2; k2 < 0; k2++) {
                i = ai1[j++];
                if (i != 0)
                    ai[k++] = i;
                else
                    k++;
                i = ai1[j++];
                if (i != 0)
                    ai[k++] = i;
                else
                    k++;
                i = ai1[j++];
                if (i != 0)
                    ai[k++] = i;
                else
                    k++;
                i = ai1[j++];
                if (i != 0)
                    ai[k++] = i;
                else
                    k++;
            }

            for (int l2 = l; l2 < 0; l2++) {
                i = ai1[j++];
                if (i != 0)
                    ai[k++] = i;
                else
                    k++;
            }

            k += j1;
            j += k1;
        }

    }

    public void method235(int[] ai, byte[] abyte0, int[] ai1, int i, int j, int k, int l,
                          int i1, int j1, int k1) {
        int l1 = -(k >> 2);
        k = -(k & 3);
        for (int i2 = -l; i2 < 0; i2 += k1) {
            for (int j2 = l1; j2 < 0; j2++) {
                byte byte0 = abyte0[i++];
                if (byte0 != 0)
                    ai[j++] = ai1[byte0 & 0xff];
                else
                    j++;
                byte0 = abyte0[i++];
                if (byte0 != 0)
                    ai[j++] = ai1[byte0 & 0xff];
                else
                    j++;
                byte0 = abyte0[i++];
                if (byte0 != 0)
                    ai[j++] = ai1[byte0 & 0xff];
                else
                    j++;
                byte0 = abyte0[i++];
                if (byte0 != 0)
                    ai[j++] = ai1[byte0 & 0xff];
                else
                    j++;
            }

            for (int k2 = k; k2 < 0; k2++) {
                byte byte1 = abyte0[i++];
                if (byte1 != 0)
                    ai[j++] = ai1[byte1 & 0xff];
                else
                    j++;
            }

            j += i1;
            i += j1;
        }

    }

    public void method236(int[] ai, int[] ai1, int i, int j, int k, int l, int i1,
                          int j1, int k1, int l1, int i2, int j2, int k2) {
        try {
            int l2 = j;
            for (int i3 = -k1; i3 < 0; i3 += k2) {
                int j3 = (k >> 16) * j2;
                for (int k3 = -j1; k3 < 0; k3++) {
                    i = ai1[(j >> 16) + j3];
                    if (i != 0)
                        ai[l++] = i;
                    else
                        l++;
                    j += l1;
                }

                k += i2;
                j = l2;
                l += i1;
            }

        } catch (Exception _ex) {
            System.out.println("error in plot_scale");
        }
    }

    public void method237(int[] ai, int[] ai1, int i, int j, int k, int l, int i1,
                          int j1, int k1, int l1, int i2) {
        int j2 = 256 - i2;
        for (int k2 = -i1; k2 < 0; k2 += l1) {
            for (int l2 = -l; l2 < 0; l2++) {
                i = ai1[j++];
                if (i != 0) {
                    int i3 = ai[k];
                    ai[k++] = ((i & 0xff00ff) * i2 + (i3 & 0xff00ff) * j2 & 0xff00ff00) + ((i & 0xff00) * i2 + (i3 & 0xff00) * j2 & 0xff0000) >> 8;
                } else {
                    k++;
                }
            }

            k += j1;
            j += k1;
        }

    }

    public void method238(int[] ai, byte[] abyte0, int[] ai1, int i, int j, int k, int l,
                          int i1, int j1, int k1, int l1) {
        int i2 = 256 - l1;
        for (int j2 = -l; j2 < 0; j2 += k1) {
            for (int k2 = -k; k2 < 0; k2++) {
                int l2 = abyte0[i++];
                if (l2 != 0) {
                    l2 = ai1[l2 & 0xff];
                    int i3 = ai[j];
                    ai[j++] = ((l2 & 0xff00ff) * l1 + (i3 & 0xff00ff) * i2 & 0xff00ff00) + ((l2 & 0xff00) * l1 + (i3 & 0xff00) * i2 & 0xff0000) >> 8;
                } else {
                    j++;
                }
            }

            j += i1;
            i += j1;
        }

    }

    public void method239(int[] ai, int[] ai1, int i, int j, int k, int l, int i1,
                          int j1, int k1, int l1, int i2, int j2, int k2, int l2) {
        int i3 = 256 - l2;
        try {
            int j3 = j;
            for (int k3 = -k1; k3 < 0; k3 += k2) {
                int l3 = (k >> 16) * j2;
                for (int i4 = -j1; i4 < 0; i4++) {
                    i = ai1[(j >> 16) + l3];
                    if (i != 0) {
                        int j4 = ai[l];
                        ai[l++] = ((i & 0xff00ff) * l2 + (j4 & 0xff00ff) * i3 & 0xff00ff00) + ((i & 0xff00) * l2 + (j4 & 0xff00) * i3 & 0xff0000) >> 8;
                    } else {
                        l++;
                    }
                    j += l1;
                }

                k += i2;
                j = j3;
                l += i1;
            }

        } catch (Exception _ex) {
            System.out.println("error in tran_scale");
        }
    }

    public void method240(int[] ai, int[] ai1, int i, int j, int k, int l, int i1,
                          int j1, int k1, int l1, int i2, int j2, int k2, int l2) {
        int i3 = l2 >> 16 & 0xff;
        int j3 = l2 >> 8 & 0xff;
        int k3 = l2 & 0xff;
        try {
            int l3 = j;
            for (int i4 = -k1; i4 < 0; i4 += k2) {
                int j4 = (k >> 16) * j2;
                for (int k4 = -j1; k4 < 0; k4++) {
                    i = ai1[(j >> 16) + j4];
                    if (i != 0) {
                        int l4 = i >> 16 & 0xff;
                        int i5 = i >> 8 & 0xff;
                        int j5 = i & 0xff;
                        if (l4 == i5 && i5 == j5)
                            ai[l++] = ((l4 * i3 >> 8) << 16) + ((i5 * j3 >> 8) << 8) + (j5 * k3 >> 8);
                        else
                            ai[l++] = i;
                    } else {
                        l++;
                    }
                    j += l1;
                }

                k += i2;
                j = l3;
                l += i1;
            }

        } catch (Exception _ex) {
            System.out.println("error in plot_scale");
        }
    }

    public void method241(int i, int j, int k, int l, int i1) {
        int j1 = anInt184;
        int k1 = anInt185;
        if (anIntArray213 == null) {
            anIntArray213 = new int[512];
            for (int l1 = 0; l1 < 256; l1++) {
                anIntArray213[l1] = (int) (Math.sin((double) l1 * 0.02454369D) * 32768D);
                anIntArray213[l1 + 256] = (int) (Math.cos((double) l1 * 0.02454369D) * 32768D);
            }

        }
        int i2 = -anIntArray201[k] / 2;
        int j2 = -anIntArray202[k] / 2;
        if (aBooleanArray203[k]) {
            i2 += anIntArray199[k];
            j2 += anIntArray200[k];
        }
        int k2 = i2 + anIntArray197[k];
        int l2 = j2 + anIntArray198[k];
        int i3 = k2;
        int j3 = j2;
        int k3 = i2;
        int l3 = l2;
        l &= 0xff;
        int i4 = anIntArray213[l] * i1;
        int j4 = anIntArray213[l + 256] * i1;
        int k4 = i + (j2 * i4 + i2 * j4 >> 22);
        int l4 = j + (j2 * j4 - i2 * i4 >> 22);
        int i5 = i + (j3 * i4 + i3 * j4 >> 22);
        int j5 = j + (j3 * j4 - i3 * i4 >> 22);
        int k5 = i + (l2 * i4 + k2 * j4 >> 22);
        int l5 = j + (l2 * j4 - k2 * i4 >> 22);
        int i6 = i + (l3 * i4 + k3 * j4 >> 22);
        int j6 = j + (l3 * j4 - k3 * i4 >> 22);
        int k6 = l4;
        int l6 = l4;
        if (j5 < k6)
            k6 = j5;
        else if (j5 > l6)
            l6 = j5;
        if (l5 < k6)
            k6 = l5;
        else if (l5 > l6)
            l6 = l5;
        if (j6 < k6)
            k6 = j6;
        else if (j6 > l6)
            l6 = j6;
        if (k6 < anInt204)
            k6 = anInt204;
        if (l6 > anInt205)
            l6 = anInt205;
        if (anIntArray214 == null || anIntArray214.length != k1 + 1) {
            anIntArray214 = new int[k1 + 1];
            anIntArray215 = new int[k1 + 1];
            anIntArray216 = new int[k1 + 1];
            anIntArray217 = new int[k1 + 1];
            anIntArray218 = new int[k1 + 1];
            anIntArray219 = new int[k1 + 1];
        }
        for (int i7 = k6; i7 <= l6; i7++) {
            anIntArray214[i7] = 0x5f5e0ff;
            anIntArray215[i7] = 0xfa0a1f01;
        }

        int i8 = 0;
        int k8 = 0;
        int i9 = 0;
        int j9 = anIntArray197[k];
        int k9 = anIntArray198[k];
        i2 = 0;
        j2 = 0;
        i3 = j9 - 1;
        j3 = 0;
        k2 = j9 - 1;
        l2 = k9 - 1;
        k3 = 0;
        l3 = k9 - 1;
        if (j6 != l4) {
            i8 = (i6 - k4 << 8) / (j6 - l4);
            i9 = (l3 - j2 << 8) / (j6 - l4);
        }
        int j7;
        int k7;
        int l7;
        int l8;
        if (l4 > j6) {
            l7 = i6 << 8;
            l8 = l3 << 8;
            j7 = j6;
            k7 = l4;
        } else {
            l7 = k4 << 8;
            l8 = j2 << 8;
            j7 = l4;
            k7 = j6;
        }
        if (j7 < 0) {
            l7 -= i8 * j7;
            l8 -= i9 * j7;
            j7 = 0;
        }
        if (k7 > k1 - 1)
            k7 = k1 - 1;
        for (int l9 = j7; l9 <= k7; l9++) {
            anIntArray214[l9] = anIntArray215[l9] = l7;
            l7 += i8;
            anIntArray216[l9] = anIntArray217[l9] = 0;
            anIntArray218[l9] = anIntArray219[l9] = l8;
            l8 += i9;
        }

        if (j5 != l4) {
            i8 = (i5 - k4 << 8) / (j5 - l4);
            k8 = (i3 - i2 << 8) / (j5 - l4);
        }
        int j8;
        if (l4 > j5) {
            l7 = i5 << 8;
            j8 = i3 << 8;
            j7 = j5;
            k7 = l4;
        } else {
            l7 = k4 << 8;
            j8 = i2 << 8;
            j7 = l4;
            k7 = j5;
        }
        if (j7 < 0) {
            l7 -= i8 * j7;
            j8 -= k8 * j7;
            j7 = 0;
        }
        if (k7 > k1 - 1)
            k7 = k1 - 1;
        for (int i10 = j7; i10 <= k7; i10++) {
            if (l7 < anIntArray214[i10]) {
                anIntArray214[i10] = l7;
                anIntArray216[i10] = j8;
                anIntArray218[i10] = 0;
            }
            if (l7 > anIntArray215[i10]) {
                anIntArray215[i10] = l7;
                anIntArray217[i10] = j8;
                anIntArray219[i10] = 0;
            }
            l7 += i8;
            j8 += k8;
        }

        if (l5 != j5) {
            i8 = (k5 - i5 << 8) / (l5 - j5);
            i9 = (l2 - j3 << 8) / (l5 - j5);
        }
        if (j5 > l5) {
            l7 = k5 << 8;
            j8 = k2 << 8;
            l8 = l2 << 8;
            j7 = l5;
            k7 = j5;
        } else {
            l7 = i5 << 8;
            j8 = i3 << 8;
            l8 = j3 << 8;
            j7 = j5;
            k7 = l5;
        }
        if (j7 < 0) {
            l7 -= i8 * j7;
            l8 -= i9 * j7;
            j7 = 0;
        }
        if (k7 > k1 - 1)
            k7 = k1 - 1;
        for (int j10 = j7; j10 <= k7; j10++) {
            if (l7 < anIntArray214[j10]) {
                anIntArray214[j10] = l7;
                anIntArray216[j10] = j8;
                anIntArray218[j10] = l8;
            }
            if (l7 > anIntArray215[j10]) {
                anIntArray215[j10] = l7;
                anIntArray217[j10] = j8;
                anIntArray219[j10] = l8;
            }
            l7 += i8;
            l8 += i9;
        }

        if (j6 != l5) {
            i8 = (i6 - k5 << 8) / (j6 - l5);
            k8 = (k3 - k2 << 8) / (j6 - l5);
        }
        if (l5 > j6) {
            l7 = i6 << 8;
            j8 = k3 << 8;
            l8 = l3 << 8;
            j7 = j6;
            k7 = l5;
        } else {
            l7 = k5 << 8;
            j8 = k2 << 8;
            l8 = l2 << 8;
            j7 = l5;
            k7 = j6;
        }
        if (j7 < 0) {
            l7 -= i8 * j7;
            j8 -= k8 * j7;
            j7 = 0;
        }
        if (k7 > k1 - 1)
            k7 = k1 - 1;
        for (int k10 = j7; k10 <= k7; k10++) {
            if (l7 < anIntArray214[k10]) {
                anIntArray214[k10] = l7;
                anIntArray216[k10] = j8;
                anIntArray218[k10] = l8;
            }
            if (l7 > anIntArray215[k10]) {
                anIntArray215[k10] = l7;
                anIntArray217[k10] = j8;
                anIntArray219[k10] = l8;
            }
            l7 += i8;
            j8 += k8;
        }

        int l10 = k6 * j1;
        int[] ai = anIntArrayArray194[k];
        for (int i11 = k6; i11 < l6; i11++) {
            int j11 = anIntArray214[i11] >> 8;
            int k11 = anIntArray215[i11] >> 8;
            if (k11 - j11 <= 0) {
                l10 += j1;
            } else {
                int l11 = anIntArray216[i11] << 9;
                int i12 = ((anIntArray217[i11] << 9) - l11) / (k11 - j11);
                int j12 = anIntArray218[i11] << 9;
                int k12 = ((anIntArray219[i11] << 9) - j12) / (k11 - j11);
                if (j11 < anInt206) {
                    l11 += (anInt206 - j11) * i12;
                    j12 += (anInt206 - j11) * k12;
                    j11 = anInt206;
                }
                if (k11 > anInt207)
                    k11 = anInt207;
                if (!aBoolean208 || (i11 & 1) == 0)
                    if (!aBooleanArray203[k])
                        method242(anIntArray190, ai, 0, l10 + j11, l11, j12, i12, k12, j11 - k11, j9);
                    else
                        method243(anIntArray190, ai, 0, l10 + j11, l11, j12, i12, k12, j11 - k11, j9);
                l10 += j1;
            }
        }

    }

    public void method242(int[] ai, int[] ai1, int i, int j, int k, int l, int i1,
                          int j1, int k1, int l1) {
        for (i = k1; i < 0; i++) {
            anIntArray190[j++] = ai1[(k >> 17) + (l >> 17) * l1];
            k += i1;
            l += j1;
        }

    }

    public void method243(int[] ai, int[] ai1, int i, int j, int k, int l, int i1,
                          int j1, int k1, int l1) {
        for (int i2 = k1; i2 < 0; i2++) {
            i = ai1[(k >> 17) + (l >> 17) * l1];
            if (i != 0)
                anIntArray190[j++] = i;
            else
                j++;
            k += i1;
            l += j1;
        }

    }

    public void method244(int i, int j, int k, int l, int i1, int j1, int k1) {
        method230(i, j, k, l, i1);
    }

    public void method245(int i, int j, int k, int l, int i1, int j1, int k1,
                          int l1, boolean flag) {
        try {
            if (j1 == 0)
                j1 = 0xffffff;
            if (k1 == 0)
                k1 = 0xffffff;
            int i2 = anIntArray197[i1];
            int j2 = anIntArray198[i1];
            int k2 = 0;
            int l2 = 0;
            int i3 = l1 << 16;
            int j3 = (i2 << 16) / k;
            int k3 = (j2 << 16) / l;
            int l3 = -(l1 << 16) / l;
            if (aBooleanArray203[i1]) {
                int i4 = anIntArray201[i1];
                int k4 = anIntArray202[i1];
                j3 = (i4 << 16) / k;
                k3 = (k4 << 16) / l;
                int j5 = anIntArray199[i1];
                int k5 = anIntArray200[i1];
                if (flag)
                    j5 = i4 - anIntArray197[i1] - j5;
                i += ((j5 * k + i4) - 1) / i4;
                int l5 = ((k5 * l + k4) - 1) / k4;
                j += l5;
                i3 += l5 * l3;
                if ((j5 * k) % i4 != 0)
                    k2 = (i4 - (j5 * k) % i4 << 16) / k;
                if ((k5 * l) % k4 != 0)
                    l2 = (k4 - (k5 * l) % k4 << 16) / l;
                k = ((((anIntArray197[i1] << 16) - k2) + j3) - 1) / j3;
                l = ((((anIntArray198[i1] << 16) - l2) + k3) - 1) / k3;
            }
            int j4 = j * anInt184;
            i3 += i << 16;
            if (j < anInt204) {
                int l4 = anInt204 - j;
                l -= l4;
                j = anInt204;
                j4 += l4 * anInt184;
                l2 += k3 * l4;
                i3 += l3 * l4;
            }
            if (j + l >= anInt205)
                l -= ((j + l) - anInt205) + 1;
            int i5 = j4 / anInt184 & 1;
            if (!aBoolean208)
                i5 = 2;
            if (k1 == 0xffffff) {
                if (anIntArrayArray194[i1] != null)
                    if (!flag) {
                        method246(anIntArray190, anIntArrayArray194[i1], 0, k2, l2, j4, k, l, j3, k3, i2, j1, i3, l3, i5);
                        return;
                    } else {
                        method246(anIntArray190, anIntArrayArray194[i1], 0, (anIntArray197[i1] << 16) - k2 - 1, l2, j4, k, l, -j3, k3, i2, j1, i3, l3, i5);
                        return;
                    }
                if (!flag) {
                    method248(anIntArray190, aByteArrayArray195[i1], anIntArrayArray196[i1], 0, k2, l2, j4, k, l, j3, k3, i2, j1, i3, l3, i5);
                    return;
                } else {
                    method248(anIntArray190, aByteArrayArray195[i1], anIntArrayArray196[i1], 0, (anIntArray197[i1] << 16) - k2 - 1, l2, j4, k, l, -j3, k3, i2, j1, i3, l3, i5);
                    return;
                }
            }
            if (anIntArrayArray194[i1] != null)
                if (!flag) {
                    method247(anIntArray190, anIntArrayArray194[i1], 0, k2, l2, j4, k, l, j3, k3, i2, j1, k1, i3, l3, i5);
                    return;
                } else {
                    method247(anIntArray190, anIntArrayArray194[i1], 0, (anIntArray197[i1] << 16) - k2 - 1, l2, j4, k, l, -j3, k3, i2, j1, k1, i3, l3, i5);
                    return;
                }
            if (!flag) {
                method249(anIntArray190, aByteArrayArray195[i1], anIntArrayArray196[i1], 0, k2, l2, j4, k, l, j3, k3, i2, j1, k1, i3, l3, i5);
            } else {
                method249(anIntArray190, aByteArrayArray195[i1], anIntArrayArray196[i1], 0, (anIntArray197[i1] << 16) - k2 - 1, l2, j4, k, l, -j3, k3, i2, j1, k1, i3, l3, i5);
            }
        } catch (Exception _ex) {
            System.out.println("error in sprite clipping routine");
        }
    }

    public void method246(int[] ai, int[] ai1, int i, int j, int k, int l, int i1,
                          int j1, int k1, int l1, int i2, int j2, int k2, int l2,
                          int i3) {
        int i4 = j2 >> 16 & 0xff;
        int j4 = j2 >> 8 & 0xff;
        int k4 = j2 & 0xff;
        try {
            int l4 = j;
            for (int i5 = -j1; i5 < 0; i5++) {
                int j5 = (k >> 16) * i2;
                int k5 = k2 >> 16;
                int l5 = i1;
                if (k5 < anInt206) {
                    int i6 = anInt206 - k5;
                    l5 -= i6;
                    k5 = anInt206;
                    j += k1 * i6;
                }
                if (k5 + l5 >= anInt207) {
                    int j6 = (k5 + l5) - anInt207;
                    l5 -= j6;
                }
                i3 = 1 - i3;
                if (i3 != 0) {
                    for (int k6 = k5; k6 < k5 + l5; k6++) {
                        i = ai1[(j >> 16) + j5];
                        if (i != 0) {
                            int j3 = i >> 16 & 0xff;
                            int k3 = i >> 8 & 0xff;
                            int l3 = i & 0xff;
                            if (j3 == k3 && k3 == l3)
                                ai[k6 + l] = ((j3 * i4 >> 8) << 16) + ((k3 * j4 >> 8) << 8) + (l3 * k4 >> 8);
                            else
                                ai[k6 + l] = i;
                        }
                        j += k1;
                    }

                }
                k += l1;
                j = l4;
                l += anInt184;
                k2 += l2;
            }

        } catch (Exception _ex) {
            System.out.println("error in transparent sprite plot routine");
        }
    }

    public void method247(int[] ai, int[] ai1, int i, int j, int k, int l, int i1,
                          int j1, int k1, int l1, int i2, int j2, int k2, int l2,
                          int i3, int j3) {
        int j4 = j2 >> 16 & 0xff;
        int k4 = j2 >> 8 & 0xff;
        int l4 = j2 & 0xff;
        int i5 = k2 >> 16 & 0xff;
        int j5 = k2 >> 8 & 0xff;
        int k5 = k2 & 0xff;
        try {
            int l5 = j;
            for (int i6 = -j1; i6 < 0; i6++) {
                int j6 = (k >> 16) * i2;
                int k6 = l2 >> 16;
                int l6 = i1;
                if (k6 < anInt206) {
                    int i7 = anInt206 - k6;
                    l6 -= i7;
                    k6 = anInt206;
                    j += k1 * i7;
                }
                if (k6 + l6 >= anInt207) {
                    int j7 = (k6 + l6) - anInt207;
                    l6 -= j7;
                }
                j3 = 1 - j3;
                if (j3 != 0) {
                    for (int k7 = k6; k7 < k6 + l6; k7++) {
                        i = ai1[(j >> 16) + j6];
                        if (i != 0) {
                            int k3 = i >> 16 & 0xff;
                            int l3 = i >> 8 & 0xff;
                            int i4 = i & 0xff;
                            if (k3 == l3 && l3 == i4)
                                ai[k7 + l] = ((k3 * j4 >> 8) << 16) + ((l3 * k4 >> 8) << 8) + (i4 * l4 >> 8);
                            else if (k3 == 255 && l3 == i4)
                                ai[k7 + l] = ((k3 * i5 >> 8) << 16) + ((l3 * j5 >> 8) << 8) + (i4 * k5 >> 8);
                            else
                                ai[k7 + l] = i;
                        }
                        j += k1;
                    }

                }
                k += l1;
                j = l5;
                l += anInt184;
                l2 += i3;
            }

        } catch (Exception _ex) {
            System.out.println("error in transparent sprite plot routine");
        }
    }

    public void method248(int[] ai, byte[] abyte0, int[] ai1, int i, int j, int k, int l,
                          int i1, int j1, int k1, int l1, int i2, int j2, int k2,
                          int l2, int i3) {
        int i4 = j2 >> 16 & 0xff;
        int j4 = j2 >> 8 & 0xff;
        int k4 = j2 & 0xff;
        try {
            int l4 = j;
            for (int i5 = -j1; i5 < 0; i5++) {
                int j5 = (k >> 16) * i2;
                int k5 = k2 >> 16;
                int l5 = i1;
                if (k5 < anInt206) {
                    int i6 = anInt206 - k5;
                    l5 -= i6;
                    k5 = anInt206;
                    j += k1 * i6;
                }
                if (k5 + l5 >= anInt207) {
                    int j6 = (k5 + l5) - anInt207;
                    l5 -= j6;
                }
                i3 = 1 - i3;
                if (i3 != 0) {
                    for (int k6 = k5; k6 < k5 + l5; k6++) {
                        i = abyte0[(j >> 16) + j5] & 0xff;
                        if (i != 0) {
                            i = ai1[i];
                            int j3 = i >> 16 & 0xff;
                            int k3 = i >> 8 & 0xff;
                            int l3 = i & 0xff;
                            if (j3 == k3 && k3 == l3)
                                ai[k6 + l] = ((j3 * i4 >> 8) << 16) + ((k3 * j4 >> 8) << 8) + (l3 * k4 >> 8);
                            else
                                ai[k6 + l] = i;
                        }
                        j += k1;
                    }

                }
                k += l1;
                j = l4;
                l += anInt184;
                k2 += l2;
            }

        } catch (Exception _ex) {
            System.out.println("error in transparent sprite plot routine");
        }
    }

    public void method249(int[] ai, byte[] abyte0, int[] ai1, int i, int j, int k, int l,
                          int i1, int j1, int k1, int l1, int i2, int j2, int k2,
                          int l2, int i3, int j3) {
        int j4 = j2 >> 16 & 0xff;
        int k4 = j2 >> 8 & 0xff;
        int l4 = j2 & 0xff;
        int i5 = k2 >> 16 & 0xff;
        int j5 = k2 >> 8 & 0xff;
        int k5 = k2 & 0xff;
        try {
            int l5 = j;
            for (int i6 = -j1; i6 < 0; i6++) {
                int j6 = (k >> 16) * i2;
                int k6 = l2 >> 16;
                int l6 = i1;
                if (k6 < anInt206) {
                    int i7 = anInt206 - k6;
                    l6 -= i7;
                    k6 = anInt206;
                    j += k1 * i7;
                }
                if (k6 + l6 >= anInt207) {
                    int j7 = (k6 + l6) - anInt207;
                    l6 -= j7;
                }
                j3 = 1 - j3;
                if (j3 != 0) {
                    for (int k7 = k6; k7 < k6 + l6; k7++) {
                        i = abyte0[(j >> 16) + j6] & 0xff;
                        if (i != 0) {
                            i = ai1[i];
                            int k3 = i >> 16 & 0xff;
                            int l3 = i >> 8 & 0xff;
                            int i4 = i & 0xff;
                            if (k3 == l3 && l3 == i4)
                                ai[k7 + l] = ((k3 * j4 >> 8) << 16) + ((l3 * k4 >> 8) << 8) + (i4 * l4 >> 8);
                            else if (k3 == 255 && l3 == i4)
                                ai[k7 + l] = ((k3 * i5 >> 8) << 16) + ((l3 * j5 >> 8) << 8) + (i4 * k5 >> 8);
                            else
                                ai[k7 + l] = i;
                        }
                        j += k1;
                    }

                }
                k += l1;
                j = l5;
                l += anInt184;
                l2 += i3;
            }

        } catch (Exception _ex) {
            System.out.println("error in transparent sprite plot routine");
        }
    }

    public static int method250(byte[] abyte0) {
        aByteArrayArray209[anInt211] = abyte0;
        return anInt211++;
    }

    public void method251(String s, int i, int j, int k, int l) {
        method254(s, i - method258(s, k), j, k, l);
    }

    public void method252(String s, int i, int j, int k, int l) {
        method254(s, i - method258(s, k) / 2, j, k, l);
    }

    public void method253(String s, int i, int j, int k, int l, int i1) {
        try {
            int j1 = 0;
            byte[] abyte0 = aByteArrayArray209[k];
            int k1 = 0;
            int l1 = 0;
            for (int i2 = 0; i2 < s.length(); i2++) {
                if (s.charAt(i2) == '@' && i2 + 4 < s.length() && s.charAt(i2 + 4) == '@')
                    i2 += 4;
                else if (s.charAt(i2) == '~' && i2 + 4 < s.length() && s.charAt(i2 + 4) == '~')
                    i2 += 4;
                else
                    j1 += abyte0[anIntArray210[s.charAt(i2)] + 7];
                if (s.charAt(i2) == ' ')
                    l1 = i2;
                if (s.charAt(i2) == '%') {
                    l1 = i2;
                    j1 = 1000;
                }
                if (j1 > i1) {
                    if (l1 <= k1)
                        l1 = i2;
                    method252(s.substring(k1, l1), i, j, k, l);
                    j1 = 0;
                    k1 = i2 = l1 + 1;
                    j += method257(k);
                }
            }

            if (j1 > 0) {
                method252(s.substring(k1), i, j, k, l);
            }
        } catch (Exception exception) {
            System.out.println("centrepara: " + exception);
            exception.printStackTrace();
        }
    }

    public void method254(String s, int i, int j, int k, int l) {
        try {
            byte[] abyte0 = aByteArrayArray209[k];
            for (int i1 = 0; i1 < s.length(); i1++)
                if (s.charAt(i1) == '@' && i1 + 4 < s.length() && s.charAt(i1 + 4) == '@') {
                    if (s.substring(i1 + 1, i1 + 4).equalsIgnoreCase("red"))
                        l = 0xff0000;
                    else if (s.substring(i1 + 1, i1 + 4).equalsIgnoreCase("lre"))
                        l = 0xff9040;
                    else if (s.substring(i1 + 1, i1 + 4).equalsIgnoreCase("yel"))
                        l = 0xffff00;
                    else if (s.substring(i1 + 1, i1 + 4).equalsIgnoreCase("gre"))
                        l = 65280;
                    else if (s.substring(i1 + 1, i1 + 4).equalsIgnoreCase("blu"))
                        l = 255;
                    else if (s.substring(i1 + 1, i1 + 4).equalsIgnoreCase("cya"))
                        l = 65535;
                    else if (s.substring(i1 + 1, i1 + 4).equalsIgnoreCase("mag"))
                        l = 0xff00ff;
                    else if (s.substring(i1 + 1, i1 + 4).equalsIgnoreCase("whi"))
                        l = 0xffffff;
                    else if (s.substring(i1 + 1, i1 + 4).equalsIgnoreCase("bla"))
                        l = 0;
                    else if (s.substring(i1 + 1, i1 + 4).equalsIgnoreCase("dre"))
                        l = 0xc00000;
                    else if (s.substring(i1 + 1, i1 + 4).equalsIgnoreCase("ora"))
                        l = 0xff9040;
                    else if (s.substring(i1 + 1, i1 + 4).equalsIgnoreCase("ran"))
                        l = (int) (Math.random() * 16777215D);
                    else if (s.substring(i1 + 1, i1 + 4).equalsIgnoreCase("or1"))
                        l = 0xffb000;
                    else if (s.substring(i1 + 1, i1 + 4).equalsIgnoreCase("or2"))
                        l = 0xff7000;
                    else if (s.substring(i1 + 1, i1 + 4).equalsIgnoreCase("or3"))
                        l = 0xff3000;
                    else if (s.substring(i1 + 1, i1 + 4).equalsIgnoreCase("gr1"))
                        l = 0xc0ff00;
                    else if (s.substring(i1 + 1, i1 + 4).equalsIgnoreCase("gr2"))
                        l = 0x80ff00;
                    else if (s.substring(i1 + 1, i1 + 4).equalsIgnoreCase("gr3"))
                        l = 0x40ff00;
                    i1 += 4;
                } else if (s.charAt(i1) == '~' && i1 + 4 < s.length() && s.charAt(i1 + 4) == '~') {
                    char c = s.charAt(i1 + 1);
                    char c1 = s.charAt(i1 + 2);
                    char c2 = s.charAt(i1 + 3);
                    if (c >= '0' && c <= '9' && c1 >= '0' && c1 <= '9' && c2 >= '0' && c2 <= '9')
                        i = Integer.parseInt(s.substring(i1 + 1, i1 + 4));
                    i1 += 4;
                } else {
                    int j1 = anIntArray210[s.charAt(i1)];
                    if (aBoolean212 && l != 0)
                        method255(j1, i + 1, j, 0, abyte0);
                    if (aBoolean212 && l != 0)
                        method255(j1, i, j + 1, 0, abyte0);
                    method255(j1, i, j, l, abyte0);
                    i += abyte0[j1 + 7];
                }

        } catch (Exception exception) {
            System.out.println("drawstring: " + exception);
            exception.printStackTrace();
        }
    }

    public void method255(int i, int j, int k, int l, byte[] abyte0) {
        int i1 = j + abyte0[i + 5];
        int j1 = k - abyte0[i + 6];
        int k1 = abyte0[i + 3];
        int l1 = abyte0[i + 4];
        int i2 = abyte0[i] * 16384 + abyte0[i + 1] * 128 + abyte0[i + 2];
        int j2 = i1 + j1 * anInt184;
        int k2 = anInt184 - k1;
        int l2 = 0;
        if (j1 < anInt204) {
            int i3 = anInt204 - j1;
            l1 -= i3;
            j1 = anInt204;
            i2 += i3 * k1;
            j2 += i3 * anInt184;
        }
        if (j1 + l1 >= anInt205)
            l1 -= ((j1 + l1) - anInt205) + 1;
        if (i1 < anInt206) {
            int j3 = anInt206 - i1;
            k1 -= j3;
            i1 = anInt206;
            i2 += j3;
            j2 += j3;
            l2 += j3;
            k2 += j3;
        }
        if (i1 + k1 >= anInt207) {
            int k3 = ((i1 + k1) - anInt207) + 1;
            k1 -= k3;
            l2 += k3;
            k2 += k3;
        }
        if (k1 > 0 && l1 > 0)
            method256(anIntArray190, abyte0, l, i2, j2, k1, l1, k2, l2);
    }

    public void method256(int[] ai, byte[] abyte0, int i, int j, int k, int l, int i1,
                          int j1, int k1) {
        try {
            int l1 = -(l >> 2);
            l = -(l & 3);
            for (int i2 = -i1; i2 < 0; i2++) {
                for (int j2 = l1; j2 < 0; j2++) {
                    if (abyte0[j++] != 0)
                        ai[k++] = i;
                    else
                        k++;
                    if (abyte0[j++] != 0)
                        ai[k++] = i;
                    else
                        k++;
                    if (abyte0[j++] != 0)
                        ai[k++] = i;
                    else
                        k++;
                    if (abyte0[j++] != 0)
                        ai[k++] = i;
                    else
                        k++;
                }

                for (int k2 = l; k2 < 0; k2++)
                    if (abyte0[j++] != 0)
                        ai[k++] = i;
                    else
                        k++;

                k += j1;
                j += k1;
            }

        } catch (Exception exception) {
            System.out.println("plotletter: " + exception);
            exception.printStackTrace();
        }
    }

    public int method257(int i) {
        if (i == 0)
            return aByteArrayArray209[i][8] - 2;
        else
            return aByteArrayArray209[i][8] - 1;
    }

    public int method258(String s, int i) {
        int j = 0;
        byte[] abyte0 = aByteArrayArray209[i];
        for (int k = 0; k < s.length(); k++)
            if (s.charAt(k) == '@' && k + 4 < s.length() && s.charAt(k + 4) == '@')
                k += 4;
            else if (s.charAt(k) == '~' && k + 4 < s.length() && s.charAt(k + 4) == '~')
                k += 4;
            else
                j += abyte0[anIntArray210[s.charAt(k)] + 7];

        return j;
    }

    public boolean imageUpdate(Image image, int i, int j, int k, int l, int i1) {
        return true;
    }

    public int anInt184;
    public int anInt185;
    public int anInt186;
    public int anInt187;
    public int anInt188;
    public ColorModel aColorModel189;
    public int[] anIntArray190;
    public ImageConsumer anImageConsumer191;
    public Component aComponent192;
    public Image anImage193;
    public int[][] anIntArrayArray194;
    public byte[][] aByteArrayArray195;
    public int[][] anIntArrayArray196;
    public int[] anIntArray197;
    public int[] anIntArray198;
    public int[] anIntArray199;
    public int[] anIntArray200;
    public int[] anIntArray201;
    public int[] anIntArray202;
    public boolean[] aBooleanArray203;
    public int anInt204;
    public int anInt205;
    public int anInt206;
    public int anInt207;
    public boolean aBoolean208;
    public static byte[][] aByteArrayArray209 = new byte[50][];
    public static int[] anIntArray210;
    public static int anInt211;
    public boolean aBoolean212;
    public int[] anIntArray213;
    public int[] anIntArray214;
    public int[] anIntArray215;
    public int[] anIntArray216;
    public int[] anIntArray217;
    public int[] anIntArray218;
    public int[] anIntArray219;
    public static boolean aBoolean220;

    static {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\243$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        anIntArray210 = new int[256];
        for (int i = 0; i < 256; i++) {
            int j = s.indexOf(i);
            if (j == -1)
                j = 74;
            anIntArray210[i] = j * 9;
        }

    }
}
