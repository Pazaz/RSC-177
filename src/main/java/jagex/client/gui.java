package jagex.client;

// was: a.a.e
public class gui {

    public gui(pixmap pixmap, int i) {
        anInt78 = -1;
        aBoolean92 = true;
        aPixmap_53 = pixmap;
        anInt55 = i;
        aBooleanArray56 = new boolean[i];
        aBooleanArray57 = new boolean[i];
        aBooleanArray58 = new boolean[i];
        aBooleanArray59 = new boolean[i];
        aBooleanArray64 = new boolean[i];
        anIntArray60 = new int[i];
        anIntArray61 = new int[i];
        anIntArray62 = new int[i];
        anIntArray63 = new int[i];
        anIntArray65 = new int[i];
        anIntArray66 = new int[i];
        anIntArray67 = new int[i];
        anIntArray68 = new int[i];
        anIntArray69 = new int[i];
        anIntArray70 = new int[i];
        anIntArray71 = new int[i];
        aStringArray72 = new String[i];
        aStringArrayArray73 = new String[i][];
        anInt80 = method132(114, 114, 176);
        anInt81 = method132(14, 14, 62);
        anInt82 = method132(200, 208, 232);
        anInt83 = method132(96, 129, 184);
        anInt84 = method132(53, 95, 115);
        anInt85 = method132(117, 142, 171);
        anInt86 = method132(98, 122, 158);
        anInt87 = method132(86, 100, 136);
        anInt88 = method132(135, 146, 179);
        anInt89 = method132(97, 112, 151);
        anInt90 = method132(88, 102, 136);
        anInt91 = method132(84, 93, 120);
    }

    public int method132(int i, int j, int k) {
        return pixmap.method221((anInt95 * i) / 114, (anInt96 * j) / 114, (anInt97 * k) / 176);
    }

    public void method133(int i, int j, int k, int l) {
        anInt74 = i;
        anInt75 = j;
        anInt77 = l;
        if (k != 0)
            anInt76 = k;
        if (k == 1) {
            for (int i1 = 0; i1 < anInt54; i1++) {
                if (aBooleanArray56[i1] && anIntArray67[i1] == 10 && anInt74 >= anIntArray65[i1] && anInt75 >= anIntArray66[i1] && anInt74 <= anIntArray65[i1] + anIntArray68[i1] && anInt75 <= anIntArray66[i1] + anIntArray69[i1])
                    aBooleanArray59[i1] = true;
                if (aBooleanArray56[i1] && anIntArray67[i1] == 14 && anInt74 >= anIntArray65[i1] && anInt75 >= anIntArray66[i1] && anInt74 <= anIntArray65[i1] + anIntArray68[i1] && anInt75 <= anIntArray66[i1] + anIntArray69[i1])
                    anIntArray62[i1] = 1 - anIntArray62[i1];
            }

        }
        if (l == 1)
            anInt79++;
        else
            anInt79 = 0;
        if (k == 1 || anInt79 > 20) {
            for (int j1 = 0; j1 < anInt54; j1++)
                if (aBooleanArray56[j1] && anIntArray67[j1] == 15 && anInt74 >= anIntArray65[j1] && anInt75 >= anIntArray66[j1] && anInt74 <= anIntArray65[j1] + anIntArray68[j1] && anInt75 <= anIntArray66[j1] + anIntArray69[j1])
                    aBooleanArray59[j1] = true;

            anInt79 -= 5;
        }
    }

    public boolean method134(int i) {
        if (aBooleanArray56[i] && aBooleanArray59[i]) {
            aBooleanArray59[i] = false;
            return true;
        } else {
            return false;
        }
    }

    public void method135(int i) {
        if (i == 0)
            return;
        if (anInt78 != -1 && aStringArray72[anInt78] != null && aBooleanArray56[anInt78]) {
            int j = aStringArray72[anInt78].length();
            if (i == 8 && j > 0)
                aStringArray72[anInt78] = aStringArray72[anInt78].substring(0, j - 1);
            if ((i == 10 || i == 13) && j > 0)
                aBooleanArray59[anInt78] = true;
            String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\243$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
            if (j < anIntArray70[anInt78]) {
                for (int k = 0; k < s.length(); k++)
                    if (i == s.charAt(k))
                        aStringArray72[anInt78] += (char) i;

            }
            if (i == 9)
                do
                    anInt78 = (anInt78 + 1) % anInt54;
                while (anIntArray67[anInt78] != 5 && anIntArray67[anInt78] != 6);
        }
    }

    public void method136() {
        for (int i = 0; i < anInt54; i++)
            if (aBooleanArray56[i])
                if (anIntArray67[i] == 0)
                    method138(i, anIntArray65[i], anIntArray66[i], aStringArray72[i], anIntArray71[i]);
                else if (anIntArray67[i] == 1)
                    method138(i, anIntArray65[i] - aPixmap_53.method258(aStringArray72[i], anIntArray71[i]) / 2, anIntArray66[i], aStringArray72[i], anIntArray71[i]);
                else if (anIntArray67[i] == 2)
                    method141(anIntArray65[i], anIntArray66[i], anIntArray68[i], anIntArray69[i]);
                else if (anIntArray67[i] == 3)
                    method144(anIntArray65[i], anIntArray66[i], anIntArray68[i]);
                else if (anIntArray67[i] == 4)
                    method145(i, anIntArray65[i], anIntArray66[i], anIntArray68[i], anIntArray69[i], anIntArray71[i], aStringArrayArray73[i], anIntArray61[i], anIntArray60[i]);
                else if (anIntArray67[i] == 5 || anIntArray67[i] == 6)
                    method140(i, anIntArray65[i], anIntArray66[i], anIntArray68[i], anIntArray69[i], aStringArray72[i], anIntArray71[i]);
                else if (anIntArray67[i] == 7)
                    method147(i, anIntArray65[i], anIntArray66[i], anIntArray71[i], aStringArrayArray73[i]);
                else if (anIntArray67[i] == 8)
                    method148(i, anIntArray65[i], anIntArray66[i], anIntArray71[i], aStringArrayArray73[i]);
                else if (anIntArray67[i] == 9)
                    method149(i, anIntArray65[i], anIntArray66[i], anIntArray68[i], anIntArray69[i], anIntArray71[i], aStringArrayArray73[i], anIntArray61[i], anIntArray60[i]);
                else if (anIntArray67[i] == 11)
                    method142(anIntArray65[i], anIntArray66[i], anIntArray68[i], anIntArray69[i]);
                else if (anIntArray67[i] == 12)
                    method143(anIntArray65[i], anIntArray66[i], anIntArray71[i]);
                else if (anIntArray67[i] == 14)
                    method137(i, anIntArray65[i], anIntArray66[i], anIntArray68[i], anIntArray69[i]);

        anInt76 = 0;
    }

    protected void method137(int i, int j, int k, int l, int i1) {
        aPixmap_53.method214(j, k, l, i1, 0xffffff);
        aPixmap_53.method216(j, k, l, anInt88);
        aPixmap_53.method217(j, k, i1, anInt88);
        aPixmap_53.method216(j, (k + i1) - 1, l, anInt91);
        aPixmap_53.method217((j + l) - 1, k, i1, anInt91);
        if (anIntArray62[i] == 1) {
            for (int j1 = 0; j1 < i1; j1++) {
                aPixmap_53.method216(j + j1, k + j1, 1, 0);
                aPixmap_53.method216((j + l) - 1 - j1, k + j1, 1, 0);
            }

        }
    }

    protected void method138(int i, int j, int k, String s, int l) {
        int i1 = k + aPixmap_53.method257(l) / 3;
        method139(i, j, i1, s, l);
    }

    protected void method139(int i, int j, int k, String s, int l) {
        int i1;
        if (aBooleanArray64[i])
            i1 = 0xffffff;
        else
            i1 = 0;
        aPixmap_53.drawstring(s, j, k, l, i1);
    }

    protected void method140(int i, int j, int k, int l, int i1, String s, int j1) {
        if (aBooleanArray58[i]) {
            int k1 = s.length();
            s = "";
            for (int i2 = 0; i2 < k1; i2++)
                s = s + "X";

        }
        if (anIntArray67[i] == 5) {
            if (anInt76 == 1 && anInt74 >= j && anInt75 >= k - i1 / 2 && anInt74 <= j + l && anInt75 <= k + i1 / 2)
                anInt78 = i;
        } else if (anIntArray67[i] == 6) {
            if (anInt76 == 1 && anInt74 >= j - l / 2 && anInt75 >= k - i1 / 2 && anInt74 <= j + l / 2 && anInt75 <= k + i1 / 2)
                anInt78 = i;
            j -= aPixmap_53.method258(s, j1) / 2;
        }
        if (anInt78 == i)
            s = s + "*";
        int l1 = k + aPixmap_53.method257(j1) / 3;
        method139(i, j, l1, s, j1);
    }

    public void method141(int i, int j, int k, int l) {
        aPixmap_53.method207(i, j, i + k, j + l);
        aPixmap_53.method213(i, j, k, l, anInt91, anInt88);
        if (aBoolean93) {
            for (int i1 = i - (j & 0x3f); i1 < i + k; i1 += 128) {
                for (int j1 = j - (j & 0x1f); j1 < j + l; j1 += 128)
                    aPixmap_53.method231(i1, j1, 6 + anInt94, 128);

            }

        }
        aPixmap_53.method216(i, j, k, anInt88);
        aPixmap_53.method216(i + 1, j + 1, k - 2, anInt88);
        aPixmap_53.method216(i + 2, j + 2, k - 4, anInt89);
        aPixmap_53.method217(i, j, l, anInt88);
        aPixmap_53.method217(i + 1, j + 1, l - 2, anInt88);
        aPixmap_53.method217(i + 2, j + 2, l - 4, anInt89);
        aPixmap_53.method216(i, (j + l) - 1, k, anInt91);
        aPixmap_53.method216(i + 1, (j + l) - 2, k - 2, anInt91);
        aPixmap_53.method216(i + 2, (j + l) - 3, k - 4, anInt90);
        aPixmap_53.method217((i + k) - 1, j, l, anInt91);
        aPixmap_53.method217((i + k) - 2, j + 1, l - 2, anInt91);
        aPixmap_53.method217((i + k) - 3, j + 2, l - 4, anInt90);
        aPixmap_53.method208();
    }

    public void method142(int i, int j, int k, int l) {
        aPixmap_53.method214(i, j, k, l, 0);
        aPixmap_53.method215(i, j, k, l, anInt85);
        aPixmap_53.method215(i + 1, j + 1, k - 2, l - 2, anInt86);
        aPixmap_53.method215(i + 2, j + 2, k - 4, l - 4, anInt87);
        aPixmap_53.method229(i, j, 2 + anInt94);
        aPixmap_53.method229((i + k) - 7, j, 3 + anInt94);
        aPixmap_53.method229(i, (j + l) - 7, 4 + anInt94);
        aPixmap_53.method229((i + k) - 7, (j + l) - 7, 5 + anInt94);
    }

    protected void method143(int i, int j, int k) {
        aPixmap_53.method229(i, j, k);
    }

    protected void method144(int i, int j, int k) {
        aPixmap_53.method216(i, j, k, 0);
    }

    protected void method145(int i, int j, int k, int l, int i1, int j1, String[] as,
                             int k1, int l1) {
        int i2 = i1 / aPixmap_53.method257(j1);
        if (l1 > k1 - i2)
            l1 = k1 - i2;
        if (l1 < 0)
            l1 = 0;
        anIntArray60[i] = l1;
        if (i2 < k1) {
            int j2 = (j + l) - 12;
            int l2 = ((i1 - 27) * i2) / k1;
            if (l2 < 6)
                l2 = 6;
            int j3 = ((i1 - 27 - l2) * l1) / (k1 - i2);
            if (anInt77 == 1 && anInt74 >= j2 && anInt74 <= j2 + 12) {
                if (anInt75 > k && anInt75 < k + 12 && l1 > 0)
                    l1--;
                if (anInt75 > (k + i1) - 12 && anInt75 < k + i1 && l1 < k1 - i2)
                    l1++;
                anIntArray60[i] = l1;
            }
            if (anInt77 == 1 && (anInt74 >= j2 && anInt74 <= j2 + 12 || anInt74 >= j2 - 12 && anInt74 <= j2 + 24 && aBooleanArray57[i])) {
                if (anInt75 > k + 12 && anInt75 < (k + i1) - 12) {
                    aBooleanArray57[i] = true;
                    int l3 = anInt75 - k - 12 - l2 / 2;
                    l1 = (l3 * k1) / (i1 - 24);
                    if (l1 > k1 - i2)
                        l1 = k1 - i2;
                    if (l1 < 0)
                        l1 = 0;
                    anIntArray60[i] = l1;
                }
            } else {
                aBooleanArray57[i] = false;
            }
            j3 = ((i1 - 27 - l2) * l1) / (k1 - i2);
            method146(j, k, l, i1, j3, l2);
        }
        int k2 = i1 - i2 * aPixmap_53.method257(j1);
        int i3 = k + (aPixmap_53.method257(j1) * 5) / 6 + k2 / 2;
        for (int k3 = l1; k3 < k1; k3++) {
            method139(i, j + 2, i3, as[k3], j1);
            i3 += aPixmap_53.method257(j1) - anInt98;
            if (i3 >= k + i1)
                return;
        }

    }

    protected void method146(int i, int j, int k, int l, int i1, int j1) {
        int k1 = (i + k) - 12;
        aPixmap_53.method215(k1, j, 12, l, 0);
        aPixmap_53.method229(k1 + 1, j + 1, anInt94);
        aPixmap_53.method229(k1 + 1, (j + l) - 12, 1 + anInt94);
        aPixmap_53.method216(k1, j + 13, 12, 0);
        aPixmap_53.method216(k1, (j + l) - 13, 12, 0);
        aPixmap_53.method213(k1 + 1, j + 14, 11, l - 27, anInt80, anInt81);
        aPixmap_53.method214(k1 + 3, i1 + j + 14, 7, j1, anInt83);
        aPixmap_53.method217(k1 + 2, i1 + j + 14, j1, anInt82);
        aPixmap_53.method217(k1 + 2 + 8, i1 + j + 14, j1, anInt84);
    }

    protected void method147(int i, int j, int k, int l, String[] as) {
        int i1 = 0;
        int j1 = as.length;
        for (int k1 = 0; k1 < j1; k1++) {
            i1 += aPixmap_53.method258(as[k1], l);
            if (k1 < j1 - 1)
                i1 += aPixmap_53.method258("  ", l);
        }

        int l1 = j - i1 / 2;
        int i2 = k + aPixmap_53.method257(l) / 3;
        for (int j2 = 0; j2 < j1; j2++) {
            int k2;
            if (aBooleanArray64[i])
                k2 = 0xffffff;
            else
                k2 = 0;
            if (anInt74 >= l1 && anInt74 <= l1 + aPixmap_53.method258(as[j2], l) && anInt75 <= i2 && anInt75 > i2 - aPixmap_53.method257(l)) {
                if (aBooleanArray64[i])
                    k2 = 0x808080;
                else
                    k2 = 0xffffff;
                if (anInt76 == 1) {
                    anIntArray62[i] = j2;
                    aBooleanArray59[i] = true;
                }
            }
            if (anIntArray62[i] == j2)
                if (aBooleanArray64[i])
                    k2 = 0xff0000;
                else
                    k2 = 0xc00000;
            aPixmap_53.drawstring(as[j2], l1, i2, l, k2);
            l1 += aPixmap_53.method258(as[j2] + "  ", l);
        }

    }

    protected void method148(int i, int j, int k, int l, String[] as) {
        int i1 = as.length;
        int j1 = k - (aPixmap_53.method257(l) * (i1 - 1)) / 2;
        for (int k1 = 0; k1 < i1; k1++) {
            int l1;
            if (aBooleanArray64[i])
                l1 = 0xffffff;
            else
                l1 = 0;
            int i2 = aPixmap_53.method258(as[k1], l);
            if (anInt74 >= j - i2 / 2 && anInt74 <= j + i2 / 2 && anInt75 - 2 <= j1 && anInt75 - 2 > j1 - aPixmap_53.method257(l)) {
                if (aBooleanArray64[i])
                    l1 = 0x808080;
                else
                    l1 = 0xffffff;
                if (anInt76 == 1) {
                    anIntArray62[i] = k1;
                    aBooleanArray59[i] = true;
                }
            }
            if (anIntArray62[i] == k1)
                if (aBooleanArray64[i])
                    l1 = 0xff0000;
                else
                    l1 = 0xc00000;
            aPixmap_53.drawstring(as[k1], j - i2 / 2, j1, l, l1);
            j1 += aPixmap_53.method257(l);
        }

    }

    protected void method149(int i, int j, int k, int l, int i1, int j1, String[] as,
                             int k1, int l1) {
        int i2 = i1 / aPixmap_53.method257(j1);
        if (i2 < k1) {
            int j2 = (j + l) - 12;
            int l2 = ((i1 - 27) * i2) / k1;
            if (l2 < 6)
                l2 = 6;
            int j3 = ((i1 - 27 - l2) * l1) / (k1 - i2);
            if (anInt77 == 1 && anInt74 >= j2 && anInt74 <= j2 + 12) {
                if (anInt75 > k && anInt75 < k + 12 && l1 > 0)
                    l1--;
                if (anInt75 > (k + i1) - 12 && anInt75 < k + i1 && l1 < k1 - i2)
                    l1++;
                anIntArray60[i] = l1;
            }
            if (anInt77 == 1 && (anInt74 >= j2 && anInt74 <= j2 + 12 || anInt74 >= j2 - 12 && anInt74 <= j2 + 24 && aBooleanArray57[i])) {
                if (anInt75 > k + 12 && anInt75 < (k + i1) - 12) {
                    aBooleanArray57[i] = true;
                    int l3 = anInt75 - k - 12 - l2 / 2;
                    l1 = (l3 * k1) / (i1 - 24);
                    if (l1 < 0)
                        l1 = 0;
                    if (l1 > k1 - i2)
                        l1 = k1 - i2;
                    anIntArray60[i] = l1;
                }
            } else {
                aBooleanArray57[i] = false;
            }
            j3 = ((i1 - 27 - l2) * l1) / (k1 - i2);
            method146(j, k, l, i1, j3, l2);
        } else {
            l1 = 0;
            anIntArray60[i] = 0;
        }
        anIntArray63[i] = -1;
        int k2 = i1 - i2 * aPixmap_53.method257(j1);
        int i3 = k + (aPixmap_53.method257(j1) * 5) / 6 + k2 / 2;
        for (int k3 = l1; k3 < k1; k3++) {
            int i4;
            if (aBooleanArray64[i])
                i4 = 0xffffff;
            else
                i4 = 0;
            if (anInt74 >= j + 2 && anInt74 <= j + 2 + aPixmap_53.method258(as[k3], j1) && anInt75 - 2 <= i3 && anInt75 - 2 > i3 - aPixmap_53.method257(j1)) {
                if (aBooleanArray64[i])
                    i4 = 0x808080;
                else
                    i4 = 0xffffff;
                anIntArray63[i] = k3;
                if (anInt76 == 1) {
                    anIntArray62[i] = k3;
                    aBooleanArray59[i] = true;
                }
            }
            if (anIntArray62[i] == k3 && aBoolean92)
                i4 = 0xff0000;
            aPixmap_53.drawstring(as[k3], j + 2, i3, j1, i4);
            i3 += aPixmap_53.method257(j1);
            if (i3 >= k + i1)
                return;
        }

    }

    public int method150(int i, int j, String s, int k, boolean flag) {
        anIntArray67[anInt54] = 0;
        aBooleanArray56[anInt54] = true;
        aBooleanArray59[anInt54] = false;
        anIntArray71[anInt54] = k;
        aBooleanArray64[anInt54] = flag;
        anIntArray65[anInt54] = i;
        anIntArray66[anInt54] = j;
        aStringArray72[anInt54] = s;
        return anInt54++;
    }

    public int method151(int i, int j, String s, int k, boolean flag) {
        anIntArray67[anInt54] = 1;
        aBooleanArray56[anInt54] = true;
        aBooleanArray59[anInt54] = false;
        anIntArray71[anInt54] = k;
        aBooleanArray64[anInt54] = flag;
        anIntArray65[anInt54] = i;
        anIntArray66[anInt54] = j;
        aStringArray72[anInt54] = s;
        return anInt54++;
    }

    public int method152(int i, int j, int k, int l) {
        anIntArray67[anInt54] = 2;
        aBooleanArray56[anInt54] = true;
        aBooleanArray59[anInt54] = false;
        anIntArray65[anInt54] = i - k / 2;
        anIntArray66[anInt54] = j - l / 2;
        anIntArray68[anInt54] = k;
        anIntArray69[anInt54] = l;
        return anInt54++;
    }

    public int method153(int i, int j, int k, int l) {
        anIntArray67[anInt54] = 11;
        aBooleanArray56[anInt54] = true;
        aBooleanArray59[anInt54] = false;
        anIntArray65[anInt54] = i - k / 2;
        anIntArray66[anInt54] = j - l / 2;
        anIntArray68[anInt54] = k;
        anIntArray69[anInt54] = l;
        return anInt54++;
    }

    public int method154(int i, int j, int k) {
        int l = aPixmap_53.anIntArray197[k];
        int i1 = aPixmap_53.anIntArray198[k];
        anIntArray67[anInt54] = 12;
        aBooleanArray56[anInt54] = true;
        aBooleanArray59[anInt54] = false;
        anIntArray65[anInt54] = i - l / 2;
        anIntArray66[anInt54] = j - i1 / 2;
        anIntArray68[anInt54] = l;
        anIntArray69[anInt54] = i1;
        anIntArray71[anInt54] = k;
        return anInt54++;
    }

    public int method155(int i, int j, int k, int l, int i1, int j1, boolean flag) {
        anIntArray67[anInt54] = 4;
        aBooleanArray56[anInt54] = true;
        aBooleanArray59[anInt54] = false;
        anIntArray65[anInt54] = i;
        anIntArray66[anInt54] = j;
        anIntArray68[anInt54] = k;
        anIntArray69[anInt54] = l;
        aBooleanArray64[anInt54] = flag;
        anIntArray71[anInt54] = i1;
        anIntArray70[anInt54] = j1;
        anIntArray61[anInt54] = 0;
        anIntArray60[anInt54] = 0;
        aStringArrayArray73[anInt54] = new String[j1];
        return anInt54++;
    }

    public int method156(int i, int j, int k, int l, int i1, int j1, boolean flag,
                         boolean flag1) {
        anIntArray67[anInt54] = 5;
        aBooleanArray56[anInt54] = true;
        aBooleanArray58[anInt54] = flag;
        aBooleanArray59[anInt54] = false;
        anIntArray71[anInt54] = i1;
        aBooleanArray64[anInt54] = flag1;
        anIntArray65[anInt54] = i;
        anIntArray66[anInt54] = j;
        anIntArray68[anInt54] = k;
        anIntArray69[anInt54] = l;
        anIntArray70[anInt54] = j1;
        aStringArray72[anInt54] = "";
        return anInt54++;
    }

    public int method157(int i, int j, int k, int l, int i1, int j1, boolean flag,
                         boolean flag1) {
        anIntArray67[anInt54] = 6;
        aBooleanArray56[anInt54] = true;
        aBooleanArray58[anInt54] = flag;
        aBooleanArray59[anInt54] = false;
        anIntArray71[anInt54] = i1;
        aBooleanArray64[anInt54] = flag1;
        anIntArray65[anInt54] = i;
        anIntArray66[anInt54] = j;
        anIntArray68[anInt54] = k;
        anIntArray69[anInt54] = l;
        anIntArray70[anInt54] = j1;
        aStringArray72[anInt54] = "";
        return anInt54++;
    }

    public int method158(int i, int j, int k, int l, int i1, int j1, boolean flag) {
        anIntArray67[anInt54] = 9;
        aBooleanArray56[anInt54] = true;
        aBooleanArray59[anInt54] = false;
        anIntArray71[anInt54] = i1;
        aBooleanArray64[anInt54] = flag;
        anIntArray65[anInt54] = i;
        anIntArray66[anInt54] = j;
        anIntArray68[anInt54] = k;
        anIntArray69[anInt54] = l;
        anIntArray70[anInt54] = j1;
        aStringArrayArray73[anInt54] = new String[j1];
        anIntArray61[anInt54] = 0;
        anIntArray60[anInt54] = 0;
        anIntArray62[anInt54] = -1;
        anIntArray63[anInt54] = -1;
        return anInt54++;
    }

    public int method159(int i, int j, int k, int l) {
        anIntArray67[anInt54] = 10;
        aBooleanArray56[anInt54] = true;
        aBooleanArray59[anInt54] = false;
        anIntArray65[anInt54] = i - k / 2;
        anIntArray66[anInt54] = j - l / 2;
        anIntArray68[anInt54] = k;
        anIntArray69[anInt54] = l;
        return anInt54++;
    }

    public int method160(int i, int j, int k) {
        anIntArray67[anInt54] = 14;
        aBooleanArray56[anInt54] = true;
        aBooleanArray59[anInt54] = false;
        anIntArray65[anInt54] = i - k / 2;
        anIntArray66[anInt54] = j - k / 2;
        anIntArray68[anInt54] = k;
        anIntArray69[anInt54] = k;
        return anInt54++;
    }

    public void method161(int i) {
        anIntArray61[i] = 0;
    }

    public void method162(int i) {
        anIntArray60[i] = 0;
        anIntArray63[i] = -1;
    }

    public void method163(int i, int j, String s) {
        aStringArrayArray73[i][j] = s;
        if (j + 1 > anIntArray61[i])
            anIntArray61[i] = j + 1;
    }

    public void method164(int i, String s, boolean flag) {
        int j = anIntArray61[i]++;
        if (j >= anIntArray70[i]) {
            j--;
            anIntArray61[i]--;
            for (int k = 0; k < j; k++)
                aStringArrayArray73[i][k] = aStringArrayArray73[i][k + 1];

        }
        aStringArrayArray73[i][j] = s;
        if (flag)
            anIntArray60[i] = 0xf423f;
    }

    public void method165(int i, String s) {
        aStringArray72[i] = s;
    }

    public String method166(int i) {
        if (aStringArray72[i] == null)
            return "null";
        else
            return aStringArray72[i];
    }

    public void method167(int i) {
        aBooleanArray56[i] = true;
    }

    public void method168(int i) {
        aBooleanArray56[i] = false;
    }

    public void method169(int i) {
        anInt78 = i;
    }

    public int method170(int i) {
        return anIntArray62[i];
    }

    public int method171(int i) {
        int j = anIntArray63[i];
        return j;
    }

    public void method172(int i, int j) {
        anIntArray62[i] = j;
    }

    protected pixmap aPixmap_53;
    public int anInt54;
    public int anInt55;
    public boolean[] aBooleanArray56;
    public boolean[] aBooleanArray57;
    public boolean[] aBooleanArray58;
    public boolean[] aBooleanArray59;
    public int[] anIntArray60;
    public int[] anIntArray61;
    public int[] anIntArray62;
    public int[] anIntArray63;
    public boolean[] aBooleanArray64;
    public int[] anIntArray65;
    public int[] anIntArray66;
    public int[] anIntArray67;
    public int[] anIntArray68;
    public int[] anIntArray69;
    public int[] anIntArray70;
    public int[] anIntArray71;
    public String[] aStringArray72;
    public String[][] aStringArrayArray73;
    public int anInt74;
    public int anInt75;
    public int anInt76;
    public int anInt77;
    public int anInt78;
    public int anInt79;
    public int anInt80;
    public int anInt81;
    public int anInt82;
    public int anInt83;
    public int anInt84;
    public int anInt85;
    public int anInt86;
    public int anInt87;
    public int anInt88;
    public int anInt89;
    public int anInt90;
    public int anInt91;
    public boolean aBoolean92;
    public static boolean aBoolean93 = true;
    public static int anInt94;
    public static int anInt95 = 114;
    public static int anInt96 = 114;
    public static int anInt97 = 176;
    public static int anInt98;

}
