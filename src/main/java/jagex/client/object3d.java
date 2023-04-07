package jagex.client;

import jagex.tools;

import java.io.DataInputStream;
import java.io.IOException;

// was: a.a.f
public class object3d {

    public object3d(int i, int j) {
        anInt119 = 1;
        aBoolean120 = true;
        aBoolean127 = true;
        aBoolean128 = false;
        aBoolean129 = false;
        anInt130 = -1;
        aBoolean133 = false;
        aBoolean134 = false;
        aBoolean135 = false;
        aBoolean136 = false;
        aBoolean137 = false;
        anInt142 = 4;
        anInt143 = 0xbc614e;
        anInt175 = 0xbc614e;
        anInt176 = 180;
        anInt177 = 155;
        anInt178 = 95;
        anInt179 = 256;
        anInt180 = 512;
        anInt181 = 32;
        method173(i, j);
        anIntArrayArray152 = new int[j][1];
        for (int k = 0; k < j; k++)
            anIntArrayArray152[k][0] = k;

    }

    public object3d(int i, int j, boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4) {
        anInt119 = 1;
        aBoolean120 = true;
        aBoolean127 = true;
        aBoolean128 = false;
        aBoolean129 = false;
        anInt130 = -1;
        aBoolean133 = false;
        aBoolean134 = false;
        aBoolean135 = false;
        aBoolean136 = false;
        aBoolean137 = false;
        anInt142 = 4;
        anInt143 = 0xbc614e;
        anInt175 = 0xbc614e;
        anInt176 = 180;
        anInt177 = 155;
        anInt178 = 95;
        anInt179 = 256;
        anInt180 = 512;
        anInt181 = 32;
        aBoolean133 = flag;
        aBoolean134 = flag1;
        aBoolean135 = flag2;
        aBoolean136 = flag3;
        aBoolean137 = flag4;
        method173(i, j);
    }

    public void method173(int i, int j) {
        anIntArray145 = new int[i];
        anIntArray146 = new int[i];
        anIntArray147 = new int[i];
        anIntArray105 = new int[i];
        aByteArray106 = new byte[i];
        anIntArray108 = new int[j];
        anIntArrayArray109 = new int[j][];
        anIntArray110 = new int[j];
        anIntArray111 = new int[j];
        anIntArray114 = new int[j];
        anIntArray113 = new int[j];
        anIntArray112 = new int[j];
        if (!aBoolean137) {
            anIntArray100 = new int[i];
            anIntArray101 = new int[i];
            anIntArray102 = new int[i];
            anIntArray103 = new int[i];
            anIntArray104 = new int[i];
        }
        if (!aBoolean136) {
            aByteArray132 = new byte[j];
            anIntArray131 = new int[j];
        }
        if (aBoolean133) {
            anIntArray148 = anIntArray145;
            anIntArray149 = anIntArray146;
            anIntArray150 = anIntArray147;
        } else {
            anIntArray148 = new int[i];
            anIntArray149 = new int[i];
            anIntArray150 = new int[i];
        }
        if (!aBoolean135 || !aBoolean134) {
            anIntArray115 = new int[j];
            anIntArray116 = new int[j];
            anIntArray117 = new int[j];
        }
        if (!aBoolean134) {
            anIntArray153 = new int[j];
            anIntArray154 = new int[j];
            anIntArray155 = new int[j];
            anIntArray156 = new int[j];
            anIntArray157 = new int[j];
            anIntArray158 = new int[j];
        }
        anInt107 = 0;
        anInt99 = 0;
        anInt144 = i;
        anInt151 = j;
        anInt159 = anInt160 = anInt161 = 0;
        anInt162 = anInt163 = anInt164 = 0;
        anInt165 = anInt166 = anInt167 = 256;
        anInt168 = anInt169 = anInt170 = anInt171 = anInt172 = anInt173 = 256;
        anInt174 = 0;
    }

    public void method174() {
        anIntArray100 = new int[anInt99];
        anIntArray101 = new int[anInt99];
        anIntArray102 = new int[anInt99];
        anIntArray103 = new int[anInt99];
        anIntArray104 = new int[anInt99];
    }

    public void method175() {
        anInt107 = 0;
        anInt99 = 0;
    }

    public void method176(int i, int j) {
        anInt107 -= i;
        if (anInt107 < 0)
            anInt107 = 0;
        anInt99 -= j;
        if (anInt99 < 0)
            anInt99 = 0;
    }

    public object3d(byte[] abyte0, int i, boolean flag) {
        anInt119 = 1;
        aBoolean120 = true;
        aBoolean127 = true;
        aBoolean128 = false;
        aBoolean129 = false;
        anInt130 = -1;
        aBoolean133 = false;
        aBoolean134 = false;
        aBoolean135 = false;
        aBoolean136 = false;
        aBoolean137 = false;
        anInt142 = 4;
        anInt143 = 0xbc614e;
        anInt175 = 0xbc614e;
        anInt176 = 180;
        anInt177 = 155;
        anInt178 = 95;
        anInt179 = 256;
        anInt180 = 512;
        anInt181 = 32;
        int j = tools.g2(abyte0, i);
        i += 2;
        int k = tools.g2(abyte0, i);
        i += 2;
        method173(j, k);
        anIntArrayArray152 = new int[k][1];
        for (int l = 0; l < j; l++) {
            anIntArray145[l] = tools.g2s(abyte0, i);
            i += 2;
        }

        for (int i1 = 0; i1 < j; i1++) {
            anIntArray146[i1] = tools.g2s(abyte0, i);
            i += 2;
        }

        for (int j1 = 0; j1 < j; j1++) {
            anIntArray147[j1] = tools.g2s(abyte0, i);
            i += 2;
        }

        anInt99 = j;
        for (int k1 = 0; k1 < k; k1++)
            anIntArray108[k1] = abyte0[i++] & 0xff;

        for (int l1 = 0; l1 < k; l1++) {
            anIntArray110[l1] = tools.g2s(abyte0, i);
            i += 2;
            if (anIntArray110[l1] == 32767)
                anIntArray110[l1] = anInt143;
        }

        for (int i2 = 0; i2 < k; i2++) {
            anIntArray111[i2] = tools.g2s(abyte0, i);
            i += 2;
            if (anIntArray111[i2] == 32767)
                anIntArray111[i2] = anInt143;
        }

        for (int j2 = 0; j2 < k; j2++) {
            int k2 = abyte0[i++] & 0xff;
            if (k2 == 0)
                anIntArray114[j2] = 0;
            else
                anIntArray114[j2] = anInt143;
        }

        for (int l2 = 0; l2 < k; l2++) {
            anIntArrayArray109[l2] = new int[anIntArray108[l2]];
            for (int i3 = 0; i3 < anIntArray108[l2]; i3++)
                if (j < 256) {
                    anIntArrayArray109[l2][i3] = abyte0[i++] & 0xff;
                } else {
                    anIntArrayArray109[l2][i3] = tools.g2(abyte0, i);
                    i += 2;
                }

        }

        anInt107 = k;
        anInt119 = 1;
    }

    public object3d(String s) {
        anInt119 = 1;
        aBoolean120 = true;
        aBoolean127 = true;
        aBoolean128 = false;
        aBoolean129 = false;
        anInt130 = -1;
        aBoolean133 = false;
        aBoolean134 = false;
        aBoolean135 = false;
        aBoolean136 = false;
        aBoolean137 = false;
        anInt142 = 4;
        anInt143 = 0xbc614e;
        anInt175 = 0xbc614e;
        anInt176 = 180;
        anInt177 = 155;
        anInt178 = 95;
        anInt179 = 256;
        anInt180 = 512;
        anInt181 = 32;
        boolean flag = false;
        boolean flag1 = false;
        byte[] abyte0 = null;
        try {
            java.io.InputStream inputstream = tools.openFile(s);
            DataInputStream datainputstream = new DataInputStream(inputstream);
            abyte0 = new byte[3];
            anInt182 = 0;
            anInt183 = 0;
            for (int i = 0; i < 3; i += datainputstream.read(abyte0, i, 3 - i)) ;
            int k = method205(abyte0);
            abyte0 = new byte[k];
            anInt182 = 0;
            anInt183 = 0;
            for (int j = 0; j < k; j += datainputstream.read(abyte0, j, k - j)) ;
            datainputstream.close();
        } catch (IOException _ex) {
            anInt99 = 0;
            anInt107 = 0;
            return;
        }
        int l = method205(abyte0);
        int i1 = method205(abyte0);
        boolean flag2 = false;
        method173(l, i1);
        anIntArrayArray152 = new int[i1][];
        for (int j3 = 0; j3 < l; j3++) {
            int j1 = method205(abyte0);
            int k1 = method205(abyte0);
            int l1 = method205(abyte0);
            method178(j1, k1, l1);
        }

        for (int k3 = 0; k3 < i1; k3++) {
            int i2 = method205(abyte0);
            int j2 = method205(abyte0);
            int k2 = method205(abyte0);
            int l2 = method205(abyte0);
            anInt180 = method205(abyte0);
            anInt181 = method205(abyte0);
            int i3 = method205(abyte0);
            int[] ai = new int[i2];
            for (int l3 = 0; l3 < i2; l3++)
                ai[l3] = method205(abyte0);

            int[] ai1 = new int[l2];
            for (int i4 = 0; i4 < l2; i4++)
                ai1[i4] = method205(abyte0);

            int j4 = method180(i2, ai, j2, k2);
            anIntArrayArray152[k3] = ai1;
            if (i3 == 0)
                anIntArray114[j4] = 0;
            else
                anIntArray114[j4] = anInt143;
        }

        anInt119 = 1;
    }

    public object3d(object3d[] aclass2, int i, boolean flag, boolean flag1, boolean flag2, boolean flag3) {
        anInt119 = 1;
        aBoolean120 = true;
        aBoolean127 = true;
        aBoolean128 = false;
        aBoolean129 = false;
        anInt130 = -1;
        aBoolean133 = false;
        aBoolean134 = false;
        aBoolean135 = false;
        aBoolean136 = false;
        aBoolean137 = false;
        anInt142 = 4;
        anInt143 = 0xbc614e;
        anInt175 = 0xbc614e;
        anInt176 = 180;
        anInt177 = 155;
        anInt178 = 95;
        anInt179 = 256;
        anInt180 = 512;
        anInt181 = 32;
        aBoolean133 = flag;
        aBoolean134 = flag1;
        aBoolean135 = flag2;
        aBoolean136 = flag3;
        method177(aclass2, i, false);
    }

    public object3d(object3d[] aclass2, int i) {
        anInt119 = 1;
        aBoolean120 = true;
        aBoolean127 = true;
        aBoolean128 = false;
        aBoolean129 = false;
        anInt130 = -1;
        aBoolean133 = false;
        aBoolean134 = false;
        aBoolean135 = false;
        aBoolean136 = false;
        aBoolean137 = false;
        anInt142 = 4;
        anInt143 = 0xbc614e;
        anInt175 = 0xbc614e;
        anInt176 = 180;
        anInt177 = 155;
        anInt178 = 95;
        anInt179 = 256;
        anInt180 = 512;
        anInt181 = 32;
        method177(aclass2, i, true);
    }

    public void method177(object3d[] aclass2, int i, boolean flag) {
        int j = 0;
        int k = 0;
        for (int l = 0; l < i; l++) {
            j += aclass2[l].anInt107;
            k += aclass2[l].anInt99;
        }

        method173(k, j);
        if (flag)
            anIntArrayArray152 = new int[j][];
        for (int i1 = 0; i1 < i; i1++) {
            object3d object3d = aclass2[i1];
            object3d.method201();
            anInt181 = object3d.anInt181;
            anInt180 = object3d.anInt180;
            anInt176 = object3d.anInt176;
            anInt177 = object3d.anInt177;
            anInt178 = object3d.anInt178;
            anInt179 = object3d.anInt179;
            for (int j1 = 0; j1 < object3d.anInt107; j1++) {
                int[] ai = new int[object3d.anIntArray108[j1]];
                int[] ai1 = object3d.anIntArrayArray109[j1];
                for (int k1 = 0; k1 < object3d.anIntArray108[j1]; k1++)
                    ai[k1] = method178(object3d.anIntArray145[ai1[k1]], object3d.anIntArray146[ai1[k1]], object3d.anIntArray147[ai1[k1]]);

                int l1 = method180(object3d.anIntArray108[j1], ai, object3d.anIntArray110[j1], object3d.anIntArray111[j1]);
                anIntArray114[l1] = object3d.anIntArray114[j1];
                anIntArray113[l1] = object3d.anIntArray113[j1];
                anIntArray112[l1] = object3d.anIntArray112[j1];
                if (flag)
                    if (i > 1) {
                        anIntArrayArray152[l1] = new int[object3d.anIntArrayArray152[j1].length + 1];
                        anIntArrayArray152[l1][0] = i1;
                        System.arraycopy(object3d.anIntArrayArray152[j1], 0, anIntArrayArray152[l1], 1, object3d.anIntArrayArray152[j1].length);

                    } else {
                        anIntArrayArray152[l1] = new int[object3d.anIntArrayArray152[j1].length];
                        System.arraycopy(object3d.anIntArrayArray152[j1], 0, anIntArrayArray152[l1], 0, object3d.anIntArrayArray152[j1].length);

                    }
            }

        }

        anInt119 = 1;
    }

    public int method178(int i, int j, int k) {
        for (int l = 0; l < anInt99; l++)
            if (anIntArray145[l] == i && anIntArray146[l] == j && anIntArray147[l] == k)
                return l;

        if (anInt99 >= anInt144) {
            return -1;
        } else {
            anIntArray145[anInt99] = i;
            anIntArray146[anInt99] = j;
            anIntArray147[anInt99] = k;
            return anInt99++;
        }
    }

    public int method179(int i, int j, int k) {
        if (anInt99 >= anInt144) {
            return -1;
        } else {
            anIntArray145[anInt99] = i;
            anIntArray146[anInt99] = j;
            anIntArray147[anInt99] = k;
            return anInt99++;
        }
    }

    public int method180(int i, int[] ai, int j, int k) {
        if (anInt107 >= anInt151) {
            return -1;
        } else {
            anIntArray108[anInt107] = i;
            anIntArrayArray109[anInt107] = ai;
            anIntArray110[anInt107] = j;
            anIntArray111[anInt107] = k;
            anInt119 = 1;
            return anInt107++;
        }
    }

    public object3d[] method181(int i, int j, int k, int l, int i1, int j1, int k1,
                                boolean flag) {
        method201();
        int[] ai = new int[j1];
        int[] ai1 = new int[j1];
        for (int l1 = 0; l1 < j1; l1++) {
            ai[l1] = 0;
            ai1[l1] = 0;
        }

        for (int i2 = 0; i2 < anInt107; i2++) {
            int j2 = 0;
            int k2 = 0;
            int i3 = anIntArray108[i2];
            int[] ai2 = anIntArrayArray109[i2];
            for (int i4 = 0; i4 < i3; i4++) {
                j2 += anIntArray145[ai2[i4]];
                k2 += anIntArray147[ai2[i4]];
            }

            int k4 = j2 / (i3 * k) + (k2 / (i3 * l)) * i1;
            ai[k4] += i3;
            ai1[k4]++;
        }

        object3d[] aclass2 = new object3d[j1];
        for (int l2 = 0; l2 < j1; l2++) {
            if (ai[l2] > k1)
                ai[l2] = k1;
            aclass2[l2] = new object3d(ai[l2], ai1[l2], true, true, true, flag, true);
            aclass2[l2].anInt180 = anInt180;
            aclass2[l2].anInt181 = anInt181;
        }

        for (int j3 = 0; j3 < anInt107; j3++) {
            int k3 = 0;
            int j4 = 0;
            int l4 = anIntArray108[j3];
            int[] ai3 = anIntArrayArray109[j3];
            for (int i5 = 0; i5 < l4; i5++) {
                k3 += anIntArray145[ai3[i5]];
                j4 += anIntArray147[ai3[i5]];
            }

            int j5 = k3 / (l4 * k) + (j4 / (l4 * l)) * i1;
            method182(aclass2[j5], ai3, l4, j3);
        }

        for (int l3 = 0; l3 < j1; l3++)
            aclass2[l3].method174();

        return aclass2;
    }

    public void method182(object3d object3d, int[] ai, int i, int j) {
        int[] ai1 = new int[i];
        for (int k = 0; k < i; k++) {
            int l = ai1[k] = object3d.method178(anIntArray145[ai[k]], anIntArray146[ai[k]], anIntArray147[ai[k]]);
            object3d.anIntArray105[l] = anIntArray105[ai[k]];
            object3d.aByteArray106[l] = aByteArray106[ai[k]];
        }

        int i1 = object3d.method180(i, ai1, anIntArray110[j], anIntArray111[j]);
        if (!object3d.aBoolean136 && !aBoolean136)
            object3d.anIntArray131[i1] = anIntArray131[j];
        object3d.anIntArray114[i1] = anIntArray114[j];
        object3d.anIntArray113[i1] = anIntArray113[j];
        object3d.anIntArray112[i1] = anIntArray112[j];
    }

    public void method183(boolean flag, int i, int j, int k, int l, int i1) {
        anInt181 = 256 - i * 4;
        anInt180 = (64 - j) * 16 + 128;
        if (aBoolean135)
            return;
        for (int j1 = 0; j1 < anInt107; j1++)
            if (flag)
                anIntArray114[j1] = anInt143;
            else
                anIntArray114[j1] = 0;

        anInt176 = k;
        anInt177 = l;
        anInt178 = i1;
        anInt179 = (int) Math.sqrt(k * k + l * l + i1 * i1);
        method197();
    }

    public void method184(int i, int j, int k, int l, int i1) {
        anInt181 = 256 - i * 4;
        anInt180 = (64 - j) * 16 + 128;
        if (aBoolean135) {
        } else {
            anInt176 = k;
            anInt177 = l;
            anInt178 = i1;
            anInt179 = (int) Math.sqrt(k * k + l * l + i1 * i1);
            method197();
        }
    }

    public void method185(int i, int j, int k) {
        if (aBoolean135) {
        } else {
            anInt176 = i;
            anInt177 = j;
            anInt178 = k;
            anInt179 = (int) Math.sqrt(i * i + j * j + k * k);
            method197();
        }
    }

    public void method186(int i, int j) {
        aByteArray106[i] = (byte) j;
    }

    public void method187(int i, int j, int k) {
        anInt162 = anInt162 + i & 0xff;
        anInt163 = anInt163 + j & 0xff;
        anInt164 = anInt164 + k & 0xff;
        method191();
        anInt119 = 1;
    }

    public void method188(int i, int j, int k) {
        anInt162 = i & 0xff;
        anInt163 = j & 0xff;
        anInt164 = k & 0xff;
        method191();
        anInt119 = 1;
    }

    public void method189(int i, int j, int k) {
        anInt159 += i;
        anInt160 += j;
        anInt161 += k;
        method191();
        anInt119 = 1;
    }

    public void method190(int i, int j, int k) {
        anInt159 = i;
        anInt160 = j;
        anInt161 = k;
        method191();
        anInt119 = 1;
    }

    public void method191() {
        if (anInt168 != 256 || anInt169 != 256 || anInt170 != 256 || anInt171 != 256 || anInt172 != 256 || anInt173 != 256) {
            anInt174 = 4;
            return;
        }
        if (anInt165 != 256 || anInt166 != 256 || anInt167 != 256) {
            anInt174 = 3;
            return;
        }
        if (anInt162 != 0 || anInt163 != 0 || anInt164 != 0) {
            anInt174 = 2;
            return;
        }
        if (anInt159 != 0 || anInt160 != 0 || anInt161 != 0) {
            anInt174 = 1;
        } else {
            anInt174 = 0;
        }
    }

    public void method192(int i, int j, int k) {
        for (int l = 0; l < anInt99; l++) {
            anIntArray148[l] += i;
            anIntArray149[l] += j;
            anIntArray150[l] += k;
        }

    }

    public void method193(int i, int j, int k) {
        for (int i3 = 0; i3 < anInt99; i3++) {
            if (k != 0) {
                int l = anIntArray138[k];
                int k1 = anIntArray138[k + 256];
                int j2 = anIntArray149[i3] * l + anIntArray148[i3] * k1 >> 15;
                anIntArray149[i3] = anIntArray149[i3] * k1 - anIntArray148[i3] * l >> 15;
                anIntArray148[i3] = j2;
            }
            if (i != 0) {
                int i1 = anIntArray138[i];
                int l1 = anIntArray138[i + 256];
                int k2 = anIntArray149[i3] * l1 - anIntArray150[i3] * i1 >> 15;
                anIntArray150[i3] = anIntArray149[i3] * i1 + anIntArray150[i3] * l1 >> 15;
                anIntArray149[i3] = k2;
            }
            if (j != 0) {
                int j1 = anIntArray138[j];
                int i2 = anIntArray138[j + 256];
                int l2 = anIntArray150[i3] * j1 + anIntArray148[i3] * i2 >> 15;
                anIntArray150[i3] = anIntArray150[i3] * i2 - anIntArray148[i3] * j1 >> 15;
                anIntArray148[i3] = l2;
            }
        }

    }

    public void method194(int i, int j, int k, int l, int i1, int j1) {
        for (int k1 = 0; k1 < anInt99; k1++) {
            if (i != 0)
                anIntArray148[k1] += anIntArray149[k1] * i >> 8;
            if (j != 0)
                anIntArray150[k1] += anIntArray149[k1] * j >> 8;
            if (k != 0)
                anIntArray148[k1] += anIntArray150[k1] * k >> 8;
            if (l != 0)
                anIntArray149[k1] += anIntArray150[k1] * l >> 8;
            if (i1 != 0)
                anIntArray150[k1] += anIntArray148[k1] * i1 >> 8;
            if (j1 != 0)
                anIntArray149[k1] += anIntArray148[k1] * j1 >> 8;
        }

    }

    public void method195(int i, int j, int k) {
        for (int l = 0; l < anInt99; l++) {
            anIntArray148[l] = anIntArray148[l] * i >> 8;
            anIntArray149[l] = anIntArray149[l] * j >> 8;
            anIntArray150[l] = anIntArray150[l] * k >> 8;
        }

    }

    public void method196() {
        anInt121 = anInt123 = anInt125 = 0xf423f;
        anInt175 = anInt122 = anInt124 = anInt126 = 0xfff0bdc1;
        for (int i = 0; i < anInt107; i++) {
            int[] ai = anIntArrayArray109[i];
            int k = ai[0];
            int i1 = anIntArray108[i];
            int j1;
            int k1 = j1 = anIntArray148[k];
            int l1;
            int i2 = l1 = anIntArray149[k];
            int j2;
            int k2 = j2 = anIntArray150[k];
            for (int j = 0; j < i1; j++) {
                int l = ai[j];
                if (anIntArray148[l] < j1)
                    j1 = anIntArray148[l];
                else if (anIntArray148[l] > k1)
                    k1 = anIntArray148[l];
                if (anIntArray149[l] < l1)
                    l1 = anIntArray149[l];
                else if (anIntArray149[l] > i2)
                    i2 = anIntArray149[l];
                if (anIntArray150[l] < j2)
                    j2 = anIntArray150[l];
                else if (anIntArray150[l] > k2)
                    k2 = anIntArray150[l];
            }

            if (!aBoolean134) {
                anIntArray153[i] = j1;
                anIntArray154[i] = k1;
                anIntArray155[i] = l1;
                anIntArray156[i] = i2;
                anIntArray157[i] = j2;
                anIntArray158[i] = k2;
            }
            if (k1 - j1 > anInt175)
                anInt175 = k1 - j1;
            if (i2 - l1 > anInt175)
                anInt175 = i2 - l1;
            if (k2 - j2 > anInt175)
                anInt175 = k2 - j2;
            if (j1 < anInt121)
                anInt121 = j1;
            if (k1 > anInt122)
                anInt122 = k1;
            if (l1 < anInt123)
                anInt123 = l1;
            if (i2 > anInt124)
                anInt124 = i2;
            if (j2 < anInt125)
                anInt125 = j2;
            if (k2 > anInt126)
                anInt126 = k2;
        }

    }

    public void method197() {
        if (aBoolean135)
            return;
        int i = anInt180 * anInt179 >> 8;
        for (int j = 0; j < anInt107; j++)
            if (anIntArray114[j] != anInt143)
                anIntArray114[j] = (anIntArray115[j] * anInt176 + anIntArray116[j] * anInt177 + anIntArray117[j] * anInt178) / i;

        int[] ai = new int[anInt99];
        int[] ai1 = new int[anInt99];
        int[] ai2 = new int[anInt99];
        int[] ai3 = new int[anInt99];
        for (int k = 0; k < anInt99; k++) {
            ai[k] = 0;
            ai1[k] = 0;
            ai2[k] = 0;
            ai3[k] = 0;
        }

        for (int l = 0; l < anInt107; l++)
            if (anIntArray114[l] == anInt143) {
                for (int i1 = 0; i1 < anIntArray108[l]; i1++) {
                    int k1 = anIntArrayArray109[l][i1];
                    ai[k1] += anIntArray115[l];
                    ai1[k1] += anIntArray116[l];
                    ai2[k1] += anIntArray117[l];
                    ai3[k1]++;
                }

            }

        for (int j1 = 0; j1 < anInt99; j1++)
            if (ai3[j1] > 0)
                anIntArray105[j1] = (ai[j1] * anInt176 + ai1[j1] * anInt177 + ai2[j1] * anInt178) / (i * ai3[j1]);

    }

    public void method198() {
        if (aBoolean135 && aBoolean134)
            return;
        for (int i = 0; i < anInt107; i++) {
            int[] ai = anIntArrayArray109[i];
            int j = anIntArray148[ai[0]];
            int k = anIntArray149[ai[0]];
            int l = anIntArray150[ai[0]];
            int i1 = anIntArray148[ai[1]] - j;
            int j1 = anIntArray149[ai[1]] - k;
            int k1 = anIntArray150[ai[1]] - l;
            int l1 = anIntArray148[ai[2]] - j;
            int i2 = anIntArray149[ai[2]] - k;
            int j2 = anIntArray150[ai[2]] - l;
            int k2 = j1 * j2 - i2 * k1;
            int l2 = k1 * l1 - j2 * i1;
            int i3;
            for (i3 = i1 * i2 - l1 * j1; k2 > 8192 || l2 > 8192 || i3 > 8192 || k2 < -8192 || l2 < -8192 || i3 < -8192; i3 >>= 1) {
                k2 >>= 1;
                l2 >>= 1;
            }

            int j3 = (int) (256D * Math.sqrt(k2 * k2 + l2 * l2 + i3 * i3));
            if (j3 <= 0)
                j3 = 1;
            anIntArray115[i] = (k2 * 0x10000) / j3;
            anIntArray116[i] = (l2 * 0x10000) / j3;
            anIntArray117[i] = (i3 * 65535) / j3;
            anIntArray113[i] = -1;
        }

        method197();
    }

    public void method199() {
        if (anInt119 == 2) {
            anInt119 = 0;
            for (int i = 0; i < anInt99; i++) {
                anIntArray148[i] = anIntArray145[i];
                anIntArray149[i] = anIntArray146[i];
                anIntArray150[i] = anIntArray147[i];
            }

            anInt121 = anInt123 = anInt125 = 0xff676981;
            anInt175 = anInt122 = anInt124 = anInt126 = 0x98967f;
            return;
        }
        if (anInt119 == 1) {
            anInt119 = 0;
            for (int j = 0; j < anInt99; j++) {
                anIntArray148[j] = anIntArray145[j];
                anIntArray149[j] = anIntArray146[j];
                anIntArray150[j] = anIntArray147[j];
            }

            if (anInt174 >= 2)
                method193(anInt162, anInt163, anInt164);
            if (anInt174 >= 3)
                method195(anInt165, anInt166, anInt167);
            if (anInt174 >= 4)
                method194(anInt168, anInt169, anInt170, anInt171, anInt172, anInt173);
            if (anInt174 >= 1)
                method192(anInt159, anInt160, anInt161);
            method196();
            method198();
        }
    }

    public void method200(int i, int j, int k, int l, int i1, int j1, int k1,
                          int l1) {
        method199();
        if (anInt125 > world3d.anInt321 || anInt126 < world3d.anInt320 || anInt121 > world3d.anInt317 || anInt122 < world3d.anInt316 || anInt123 > world3d.anInt319 || anInt124 < world3d.anInt318) {
            aBoolean120 = false;
            return;
        }
        aBoolean120 = true;
        int l2 = 0;
        int i3 = 0;
        int j3 = 0;
        int k3 = 0;
        int l3 = 0;
        int i4 = 0;
        if (j1 != 0) {
            l2 = anIntArray139[j1];
            i3 = anIntArray139[j1 + 1024];
        }
        if (i1 != 0) {
            l3 = anIntArray139[i1];
            i4 = anIntArray139[i1 + 1024];
        }
        if (l != 0) {
            j3 = anIntArray139[l];
            k3 = anIntArray139[l + 1024];
        }
        for (int j4 = 0; j4 < anInt99; j4++) {
            int k4 = anIntArray148[j4] - i;
            int l4 = anIntArray149[j4] - j;
            int i5 = anIntArray150[j4] - k;
            if (j1 != 0) {
                int i2 = l4 * l2 + k4 * i3 >> 15;
                l4 = l4 * i3 - k4 * l2 >> 15;
                k4 = i2;
            }
            if (i1 != 0) {
                int j2 = i5 * l3 + k4 * i4 >> 15;
                i5 = i5 * i4 - k4 * l3 >> 15;
                k4 = j2;
            }
            if (l != 0) {
                int k2 = l4 * k3 - i5 * j3 >> 15;
                i5 = l4 * j3 + i5 * k3 >> 15;
                l4 = k2;
            }
            if (i5 >= l1)
                anIntArray103[j4] = (k4 << k1) / i5;
            else
                anIntArray103[j4] = k4 << k1;
            if (i5 >= l1)
                anIntArray104[j4] = (l4 << k1) / i5;
            else
                anIntArray104[j4] = l4 << k1;
            anIntArray100[j4] = k4;
            anIntArray101[j4] = l4;
            anIntArray102[j4] = i5;
        }

    }

    public void method201() {
        method199();
        for (int i = 0; i < anInt99; i++) {
            anIntArray145[i] = anIntArray148[i];
            anIntArray146[i] = anIntArray149[i];
            anIntArray147[i] = anIntArray150[i];
        }

        anInt159 = anInt160 = anInt161 = 0;
        anInt162 = anInt163 = anInt164 = 0;
        anInt165 = anInt166 = anInt167 = 256;
        anInt168 = anInt169 = anInt170 = anInt171 = anInt172 = anInt173 = 256;
        anInt174 = 0;
    }

    public object3d method202() {
        object3d[] aclass2 = new object3d[1];
        aclass2[0] = this;
        object3d object3d = new object3d(aclass2, 1);
        object3d.anInt118 = anInt118;
        object3d.aBoolean129 = aBoolean129;
        return object3d;
    }

    public object3d method203(boolean flag, boolean flag1, boolean flag2, boolean flag3) {
        object3d[] aclass2 = new object3d[1];
        aclass2[0] = this;
        object3d object3d = new object3d(aclass2, 1, flag, flag1, flag2, flag3);
        object3d.anInt118 = anInt118;
        return object3d;
    }

    public void method204(object3d object3d) {
        anInt162 = object3d.anInt162;
        anInt163 = object3d.anInt163;
        anInt164 = object3d.anInt164;
        anInt159 = object3d.anInt159;
        anInt160 = object3d.anInt160;
        anInt161 = object3d.anInt161;
        method191();
        anInt119 = 1;
    }

    public int method205(byte[] abyte0) {
        for (; abyte0[anInt182] == 10 || abyte0[anInt182] == 13; anInt182++) ;
        int i = anIntArray141[abyte0[anInt182++] & 0xff];
        int j = anIntArray141[abyte0[anInt182++] & 0xff];
        int k = anIntArray141[abyte0[anInt182++] & 0xff];
        int l = (i * 4096 + j * 64 + k) - 0x20000;
        if (l == 0x1e240)
            l = anInt143;
        return l;
    }

    public int anInt99;
    public int[] anIntArray100;
    public int[] anIntArray101;
    public int[] anIntArray102;
    public int[] anIntArray103;
    public int[] anIntArray104;
    public int[] anIntArray105;
    public byte[] aByteArray106;
    public int anInt107;
    public int[] anIntArray108;
    public int[][] anIntArrayArray109;
    public int[] anIntArray110;
    public int[] anIntArray111;
    public int[] anIntArray112;
    public int[] anIntArray113;
    public int[] anIntArray114;
    public int[] anIntArray115;
    public int[] anIntArray116;
    public int[] anIntArray117;
    public int anInt118;
    public int anInt119;
    public boolean aBoolean120;
    public int anInt121;
    public int anInt122;
    public int anInt123;
    public int anInt124;
    public int anInt125;
    public int anInt126;
    public boolean aBoolean127;
    public boolean aBoolean128;
    public boolean aBoolean129;
    public int anInt130;
    public int[] anIntArray131;
    public byte[] aByteArray132;
    public boolean aBoolean133;
    public boolean aBoolean134;
    public boolean aBoolean135;
    public boolean aBoolean136;
    public boolean aBoolean137;
    public static int[] anIntArray138;
    public static int[] anIntArray139;
    public static byte[] aByteArray140;
    public static int[] anIntArray141;
    public int anInt142;
    public int anInt143;
    public int anInt144;
    public int[] anIntArray145;
    public int[] anIntArray146;
    public int[] anIntArray147;
    public int[] anIntArray148;
    public int[] anIntArray149;
    public int[] anIntArray150;
    public int anInt151;
    public int[][] anIntArrayArray152;
    public int[] anIntArray153;
    public int[] anIntArray154;
    public int[] anIntArray155;
    public int[] anIntArray156;
    public int[] anIntArray157;
    public int[] anIntArray158;
    public int anInt159;
    public int anInt160;
    public int anInt161;
    public int anInt162;
    public int anInt163;
    public int anInt164;
    public int anInt165;
    public int anInt166;
    public int anInt167;
    public int anInt168;
    public int anInt169;
    public int anInt170;
    public int anInt171;
    public int anInt172;
    public int anInt173;
    public int anInt174;
    public int anInt175;
    public int anInt176;
    public int anInt177;
    public int anInt178;
    public int anInt179;
    protected int anInt180;
    protected int anInt181;
    public int anInt182;
    public int anInt183;

    static {
        anIntArray138 = new int[512];
        anIntArray139 = new int[2048];
        aByteArray140 = new byte[64];
        anIntArray141 = new int[256];
        for (int i = 0; i < 256; i++) {
            anIntArray138[i] = (int) (Math.sin((double) i * 0.02454369D) * 32768D);
            anIntArray138[i + 256] = (int) (Math.cos((double) i * 0.02454369D) * 32768D);
        }

        for (int j = 0; j < 1024; j++) {
            anIntArray139[j] = (int) (Math.sin((double) j * 0.00613592315D) * 32768D);
            anIntArray139[j + 1024] = (int) (Math.cos((double) j * 0.00613592315D) * 32768D);
        }

        for (int k = 0; k < 10; k++)
            aByteArray140[k] = (byte) (48 + k);

        for (int l = 0; l < 26; l++)
            aByteArray140[l + 10] = (byte) (65 + l);

        for (int i1 = 0; i1 < 26; i1++)
            aByteArray140[i1 + 36] = (byte) (97 + i1);

        aByteArray140[62] = -93;
        aByteArray140[63] = 36;
        for (int j1 = 0; j1 < 10; j1++)
            anIntArray141[48 + j1] = j1;

        for (int k1 = 0; k1 < 26; k1++)
            anIntArray141[65 + k1] = k1 + 10;

        for (int l1 = 0; l1 < 26; l1++)
            anIntArray141[97 + l1] = l1 + 36;

        anIntArray141[163] = 62;
        anIntArray141[36] = 63;
    }
}
