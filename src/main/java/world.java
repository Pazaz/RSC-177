import jagex.client.object3d;
import jagex.client.pixmap;
import jagex.client.world3d;
import jagex.tools;

import java.io.IOException;

// was: f
public class world {

    public world(world3d world3d, pixmap pixmap) {
        aBoolean565 = false;
        aBoolean566 = true;
        anInt569 = 750;
        anIntArray572 = new int[256];
        aByteArrayArray577 = new byte[4][48 * 48];
        aByteArrayArray578 = new byte[4][48 * 48];
        aByteArrayArray579 = new byte[4][48 * 48];
        aByteArrayArray580 = new byte[4][48 * 48];
        aByteArrayArray581 = new byte[4][48 * 48];
        aByteArrayArray582 = new byte[4][48 * 48];
        aByteArrayArray583 = new byte[4][48 * 48];
        anIntArrayArray584 = new int[4][48 * 48];
        anInt585 = 96;
        anInt586 = 96;
        anIntArray587 = new int[anInt585 * anInt586 * 2];
        anIntArray588 = new int[anInt585 * anInt586 * 2];
        anIntArrayArray589 = new int[anInt585][anInt586];
        anIntArrayArray590 = new int[anInt585][anInt586];
        anIntArrayArray591 = new int[anInt585][anInt586];
        aBoolean592 = false;
        aObject3dArray593 = new object3d[64];
        aObject3dArrayArray594 = new object3d[4][64];
        aObject3dArrayArray595 = new object3d[4][64];
        aWorld3d_568 = world3d;
        aPixmap_567 = pixmap;
        for (int i = 0; i < 64; i++)
            anIntArray572[i] = jagex.client.world3d.method301(255 - i * 4, 255 - (int) ((double) i * 1.75D), 255 - i * 4);

        for (int j = 0; j < 64; j++)
            anIntArray572[j + 64] = jagex.client.world3d.method301(j * 3, 144, 0);

        for (int k = 0; k < 64; k++)
            anIntArray572[k + 128] = jagex.client.world3d.method301(192 - (int) ((double) k * 1.5D), 144 - (int) ((double) k * 1.5D), 0);

        for (int l = 0; l < 64; l++)
            anIntArray572[l + 192] = jagex.client.world3d.method301(96 - (int) ((double) l * 1.5D), 48 + (int) ((double) l * 1.5D), 0);

    }

    public int method398(int i, int j, int k, int l, int i1, int j1, int[] ai,
                         int[] ai1, boolean flag) {
        for (int k1 = 0; k1 < anInt585; k1++) {
            for (int l1 = 0; l1 < anInt586; l1++)
                anIntArrayArray589[k1][l1] = 0;

        }

        int i2 = 0;
        int j2 = 0;
        int k2 = i;
        int l2 = j;
        anIntArrayArray589[i][j] = 99;
        ai[i2] = i;
        ai1[i2++] = j;
        int i3 = ai.length;
        boolean flag1 = false;
        while (j2 != i2) {
            k2 = ai[j2];
            l2 = ai1[j2];
            j2 = (j2 + 1) % i3;
            if (k2 >= k && k2 <= i1 && l2 >= l && l2 <= j1) {
                flag1 = true;
                break;
            }
            if (flag) {
                if (k2 > 0 && k2 - 1 >= k && k2 - 1 <= i1 && l2 >= l && l2 <= j1 && (anIntArrayArray590[k2 - 1][l2] & 8) == 0) {
                    flag1 = true;
                    break;
                }
                if (k2 < anInt585 - 1 && k2 + 1 >= k && k2 + 1 <= i1 && l2 >= l && l2 <= j1 && (anIntArrayArray590[k2 + 1][l2] & 2) == 0) {
                    flag1 = true;
                    break;
                }
                if (l2 > 0 && k2 >= k && k2 <= i1 && l2 - 1 >= l && l2 - 1 <= j1 && (anIntArrayArray590[k2][l2 - 1] & 4) == 0) {
                    flag1 = true;
                    break;
                }
                if (l2 < anInt586 - 1 && k2 >= k && k2 <= i1 && l2 + 1 >= l && l2 + 1 <= j1 && (anIntArrayArray590[k2][l2 + 1] & 1) == 0) {
                    flag1 = true;
                    break;
                }
            }
            if (k2 > 0 && anIntArrayArray589[k2 - 1][l2] == 0 && (anIntArrayArray590[k2 - 1][l2] & 0x78) == 0) {
                ai[i2] = k2 - 1;
                ai1[i2] = l2;
                i2 = (i2 + 1) % i3;
                anIntArrayArray589[k2 - 1][l2] = 2;
            }
            if (k2 < anInt585 - 1 && anIntArrayArray589[k2 + 1][l2] == 0 && (anIntArrayArray590[k2 + 1][l2] & 0x72) == 0) {
                ai[i2] = k2 + 1;
                ai1[i2] = l2;
                i2 = (i2 + 1) % i3;
                anIntArrayArray589[k2 + 1][l2] = 8;
            }
            if (l2 > 0 && anIntArrayArray589[k2][l2 - 1] == 0 && (anIntArrayArray590[k2][l2 - 1] & 0x74) == 0) {
                ai[i2] = k2;
                ai1[i2] = l2 - 1;
                i2 = (i2 + 1) % i3;
                anIntArrayArray589[k2][l2 - 1] = 1;
            }
            if (l2 < anInt586 - 1 && anIntArrayArray589[k2][l2 + 1] == 0 && (anIntArrayArray590[k2][l2 + 1] & 0x71) == 0) {
                ai[i2] = k2;
                ai1[i2] = l2 + 1;
                i2 = (i2 + 1) % i3;
                anIntArrayArray589[k2][l2 + 1] = 4;
            }
            if (k2 > 0 && l2 > 0 && (anIntArrayArray590[k2][l2 - 1] & 0x74) == 0 && (anIntArrayArray590[k2 - 1][l2] & 0x78) == 0 && (anIntArrayArray590[k2 - 1][l2 - 1] & 0x7c) == 0 && anIntArrayArray589[k2 - 1][l2 - 1] == 0) {
                ai[i2] = k2 - 1;
                ai1[i2] = l2 - 1;
                i2 = (i2 + 1) % i3;
                anIntArrayArray589[k2 - 1][l2 - 1] = 3;
            }
            if (k2 < anInt585 - 1 && l2 > 0 && (anIntArrayArray590[k2][l2 - 1] & 0x74) == 0 && (anIntArrayArray590[k2 + 1][l2] & 0x72) == 0 && (anIntArrayArray590[k2 + 1][l2 - 1] & 0x76) == 0 && anIntArrayArray589[k2 + 1][l2 - 1] == 0) {
                ai[i2] = k2 + 1;
                ai1[i2] = l2 - 1;
                i2 = (i2 + 1) % i3;
                anIntArrayArray589[k2 + 1][l2 - 1] = 9;
            }
            if (k2 > 0 && l2 < anInt586 - 1 && (anIntArrayArray590[k2][l2 + 1] & 0x71) == 0 && (anIntArrayArray590[k2 - 1][l2] & 0x78) == 0 && (anIntArrayArray590[k2 - 1][l2 + 1] & 0x79) == 0 && anIntArrayArray589[k2 - 1][l2 + 1] == 0) {
                ai[i2] = k2 - 1;
                ai1[i2] = l2 + 1;
                i2 = (i2 + 1) % i3;
                anIntArrayArray589[k2 - 1][l2 + 1] = 6;
            }
            if (k2 < anInt585 - 1 && l2 < anInt586 - 1 && (anIntArrayArray590[k2][l2 + 1] & 0x71) == 0 && (anIntArrayArray590[k2 + 1][l2] & 0x72) == 0 && (anIntArrayArray590[k2 + 1][l2 + 1] & 0x73) == 0 && anIntArrayArray589[k2 + 1][l2 + 1] == 0) {
                ai[i2] = k2 + 1;
                ai1[i2] = l2 + 1;
                i2 = (i2 + 1) % i3;
                anIntArrayArray589[k2 + 1][l2 + 1] = 12;
            }
        }
        if (!flag1)
            return -1;
        j2 = 0;
        ai[j2] = k2;
        ai1[j2++] = l2;
        int k3;
        for (int j3 = k3 = anIntArrayArray589[k2][l2]; k2 != i || l2 != j; j3 = anIntArrayArray589[k2][l2]) {
            if (j3 != k3) {
                k3 = j3;
                ai[j2] = k2;
                ai1[j2++] = l2;
            }
            if ((j3 & 2) != 0)
                k2++;
            else if ((j3 & 8) != 0)
                k2--;
            if ((j3 & 1) != 0)
                l2++;
            else if ((j3 & 4) != 0)
                l2--;
        }

        return j2;
    }

    public void method399(int i, int j, int k) {
        anIntArrayArray590[i][j] |= k;
    }

    public void method400(int i, int j, int k) {
        anIntArrayArray590[i][j] &= 65535 - k;
    }

    public void method401(int i, int j, int k, int l) {
        if (i < 0 || j < 0 || i >= anInt585 - 1 || j >= anInt586 - 1)
            return;
        if (clientconfig.anIntArray488[l] == 1) {
            if (k == 0) {
                anIntArrayArray590[i][j] |= 1;
                if (j > 0)
                    method399(i, j - 1, 4);
            } else if (k == 1) {
                anIntArrayArray590[i][j] |= 2;
                if (i > 0)
                    method399(i - 1, j, 8);
            } else if (k == 2)
                anIntArrayArray590[i][j] |= 0x10;
            else if (k == 3)
                anIntArrayArray590[i][j] |= 0x20;
            method405(i, j, 1, 1);
        }
    }

    public void method402(int i, int j, int k, int l) {
        if (i < 0 || j < 0 || i >= anInt585 - 1 || j >= anInt586 - 1)
            return;
        if (clientconfig.anIntArray488[l] == 1) {
            if (k == 0) {
                anIntArrayArray590[i][j] &= 0xfffe;
                if (j > 0)
                    method400(i, j - 1, 4);
            } else if (k == 1) {
                anIntArrayArray590[i][j] &= 0xfffd;
                if (i > 0)
                    method400(i - 1, j, 8);
            } else if (k == 2)
                anIntArrayArray590[i][j] &= 0xffef;
            else if (k == 3)
                anIntArrayArray590[i][j] &= 0xffdf;
            method405(i, j, 1, 1);
        }
    }

    public void method403(int i, int j, int k) {
        if (i < 0 || j < 0 || i >= anInt585 - 1 || j >= anInt586 - 1)
            return;
        if (clientconfig.anIntArray478[k] == 1 || clientconfig.anIntArray478[k] == 2) {
            int l = method418(i, j);
            int i1;
            int j1;
            if (l == 0 || l == 4) {
                i1 = clientconfig.anIntArray476[k];
                j1 = clientconfig.anIntArray477[k];
            } else {
                j1 = clientconfig.anIntArray476[k];
                i1 = clientconfig.anIntArray477[k];
            }
            for (int k1 = i; k1 < i + i1; k1++) {
                for (int l1 = j; l1 < j + j1; l1++)
                    if (clientconfig.anIntArray478[k] == 1)
                        anIntArrayArray590[k1][l1] |= 0x40;
                    else if (l == 0) {
                        anIntArrayArray590[k1][l1] |= 2;
                        if (k1 > 0)
                            method399(k1 - 1, l1, 8);
                    } else if (l == 2) {
                        anIntArrayArray590[k1][l1] |= 4;
                        if (l1 < anInt586 - 1)
                            method399(k1, l1 + 1, 1);
                    } else if (l == 4) {
                        anIntArrayArray590[k1][l1] |= 8;
                        if (k1 < anInt585 - 1)
                            method399(k1 + 1, l1, 2);
                    } else if (l == 6) {
                        anIntArrayArray590[k1][l1] |= 1;
                        if (l1 > 0)
                            method399(k1, l1 - 1, 4);
                    }

            }

            method405(i, j, i1, j1);
        }
    }

    public void method404(int i, int j, int k) {
        if (i < 0 || j < 0 || i >= anInt585 - 1 || j >= anInt586 - 1)
            return;
        if (clientconfig.anIntArray478[k] == 1 || clientconfig.anIntArray478[k] == 2) {
            int l = method418(i, j);
            int i1;
            int j1;
            if (l == 0 || l == 4) {
                i1 = clientconfig.anIntArray476[k];
                j1 = clientconfig.anIntArray477[k];
            } else {
                j1 = clientconfig.anIntArray476[k];
                i1 = clientconfig.anIntArray477[k];
            }
            for (int k1 = i; k1 < i + i1; k1++) {
                for (int l1 = j; l1 < j + j1; l1++)
                    if (clientconfig.anIntArray478[k] == 1)
                        anIntArrayArray590[k1][l1] &= 0xffbf;
                    else if (l == 0) {
                        anIntArrayArray590[k1][l1] &= 0xfffd;
                        if (k1 > 0)
                            method400(k1 - 1, l1, 8);
                    } else if (l == 2) {
                        anIntArrayArray590[k1][l1] &= 0xfffb;
                        if (l1 < anInt586 - 1)
                            method400(k1, l1 + 1, 1);
                    } else if (l == 4) {
                        anIntArrayArray590[k1][l1] &= 0xfff7;
                        if (k1 < anInt585 - 1)
                            method400(k1 + 1, l1, 2);
                    } else if (l == 6) {
                        anIntArrayArray590[k1][l1] &= 0xfffe;
                        if (l1 > 0)
                            method400(k1, l1 - 1, 4);
                    }

            }

            method405(i, j, i1, j1);
        }
    }

    public void method405(int i, int j, int k, int l) {
        if (i < 1 || j < 1 || i + k >= anInt585 || j + l >= anInt586)
            return;
        for (int i1 = i; i1 <= i + k; i1++) {
            for (int j1 = j; j1 <= j + l; j1++)
                if ((method408(i1, j1) & 0x63) != 0 || (method408(i1 - 1, j1) & 0x59) != 0 || (method408(i1, j1 - 1) & 0x56) != 0 || (method408(i1 - 1, j1 - 1) & 0x6c) != 0)
                    method406(i1, j1, 35);
                else
                    method406(i1, j1, 0);

        }

    }

    public void method406(int i, int j, int k) {
        int l = i / 12;
        int i1 = j / 12;
        int j1 = (i - 1) / 12;
        int k1 = (j - 1) / 12;
        method407(l, i1, i, j, k);
        if (l != j1)
            method407(j1, i1, i, j, k);
        if (i1 != k1)
            method407(l, k1, i, j, k);
        if (l != j1 && i1 != k1)
            method407(j1, k1, i, j, k);
    }

    public void method407(int i, int j, int k, int l, int i1) {
        object3d object3d = aObject3dArray593[i + j * 8];
        for (int j1 = 0; j1 < object3d.anInt99; j1++)
            if (object3d.anIntArray145[j1] == k * 128 && object3d.anIntArray147[j1] == l * 128) {
                object3d.method186(j1, i1);
                return;
            }

    }

    public int method408(int i, int j) {
        if (i < 0 || j < 0 || i >= anInt585 || j >= anInt586)
            return 0;
        else
            return anIntArrayArray590[i][j];
    }

    public int method409(int i, int j) {
        int k = i >> 7;
        int l = j >> 7;
        int i1 = i & 0x7f;
        int j1 = j & 0x7f;
        if (k < 0 || l < 0 || k >= anInt585 - 1 || l >= anInt586 - 1)
            return 0;
        int k1;
        int l1;
        int i2;
        if (i1 <= 128 - j1) {
            k1 = method410(k, l);
            l1 = method410(k + 1, l) - k1;
            i2 = method410(k, l + 1) - k1;
        } else {
            k1 = method410(k + 1, l + 1);
            l1 = method410(k, l + 1) - k1;
            i2 = method410(k + 1, l) - k1;
            i1 = 128 - i1;
            j1 = 128 - j1;
        }
        int j2 = k1 + (l1 * i1) / 128 + (i2 * j1) / 128;
        return j2;
    }

    public int method410(int i, int j) {
        if (i < 0 || i >= 96 || j < 0 || j >= 96)
            return 0;
        byte byte0 = 0;
        if (i >= 48 && j < 48) {
            byte0 = 1;
            i -= 48;
        } else if (i < 48 && j >= 48) {
            byte0 = 2;
            j -= 48;
        } else if (i >= 48 && j >= 48) {
            byte0 = 3;
            i -= 48;
            j -= 48;
        }
        return (aByteArrayArray577[byte0][i * 48 + j] & 0xff) * 3;
    }

    public int method411(int i, int j) {
        if (i < 0 || i >= 96 || j < 0 || j >= 96)
            return 0;
        byte byte0 = 0;
        if (i >= 48 && j < 48) {
            byte0 = 1;
            i -= 48;
        } else if (i < 48 && j >= 48) {
            byte0 = 2;
            j -= 48;
        } else if (i >= 48 && j >= 48) {
            byte0 = 3;
            i -= 48;
            j -= 48;
        }
        return aByteArrayArray578[byte0][i * 48 + j] & 0xff;
    }

    public int method412(int i, int j, int k) {
        if (i < 0 || i >= 96 || j < 0 || j >= 96)
            return 0;
        byte byte0 = 0;
        if (i >= 48 && j < 48) {
            byte0 = 1;
            i -= 48;
        } else if (i < 48 && j >= 48) {
            byte0 = 2;
            j -= 48;
        } else if (i >= 48 && j >= 48) {
            byte0 = 3;
            i -= 48;
            j -= 48;
        }
        return aByteArrayArray582[byte0][i * 48 + j] & 0xff;
    }

    public void method413(int i, int j, int k) {
        if (i < 0 || i >= 96 || j < 0 || j >= 96)
            return;
        byte byte0 = 0;
        if (i >= 48 && j < 48) {
            byte0 = 1;
            i -= 48;
        } else if (i < 48 && j >= 48) {
            byte0 = 2;
            j -= 48;
        } else if (i >= 48 && j >= 48) {
            byte0 = 3;
            i -= 48;
            j -= 48;
        }
        aByteArrayArray582[byte0][i * 48 + j] = (byte) k;
    }

    public int method414(int i, int j, int k) {
        int l = method412(i, j, k);
        if (l == 0)
            return -1;
        int i1 = clientconfig.anIntArray495[l - 1];
        return i1 != 2 ? 0 : 1;
    }

    public int method415(int i, int j, int k, int l) {
        int i1 = method412(i, j, k);
        if (i1 == 0)
            return l;
        else
            return clientconfig.anIntArray494[i1 - 1];
    }

    public int method416(int i, int j) {
        if (i < 0 || i >= 96 || j < 0 || j >= 96)
            return 0;
        byte byte0 = 0;
        if (i >= 48 && j < 48) {
            byte0 = 1;
            i -= 48;
        } else if (i < 48 && j >= 48) {
            byte0 = 2;
            j -= 48;
        } else if (i >= 48 && j >= 48) {
            byte0 = 3;
            i -= 48;
            j -= 48;
        }
        return anIntArrayArray584[byte0][i * 48 + j];
    }

    public int method417(int i, int j) {
        if (i < 0 || i >= 96 || j < 0 || j >= 96)
            return 0;
        byte byte0 = 0;
        if (i >= 48 && j < 48) {
            byte0 = 1;
            i -= 48;
        } else if (i < 48 && j >= 48) {
            byte0 = 2;
            j -= 48;
        } else if (i >= 48 && j >= 48) {
            byte0 = 3;
            i -= 48;
            j -= 48;
        }
        return aByteArrayArray581[byte0][i * 48 + j];
    }

    public int method418(int i, int j) {
        if (i < 0 || i >= 96 || j < 0 || j >= 96)
            return 0;
        byte byte0 = 0;
        if (i >= 48 && j < 48) {
            byte0 = 1;
            i -= 48;
        } else if (i < 48 && j >= 48) {
            byte0 = 2;
            j -= 48;
        } else if (i >= 48 && j >= 48) {
            byte0 = 3;
            i -= 48;
            j -= 48;
        }
        return aByteArrayArray583[byte0][i * 48 + j];
    }

    public boolean method419(int i, int j) {
        return method417(i, j) > 0 || method417(i - 1, j) > 0 || method417(i - 1, j - 1) > 0 || method417(i, j - 1) > 0;
    }

    public boolean method420(int i, int j) {
        return method417(i, j) > 0 && method417(i - 1, j) > 0 && method417(i - 1, j - 1) > 0 && method417(i, j - 1) > 0;
    }

    public int method421(int i, int j) {
        if (i < 0 || i >= 96 || j < 0 || j >= 96)
            return 0;
        byte byte0 = 0;
        if (i >= 48 && j < 48) {
            byte0 = 1;
            i -= 48;
        } else if (i < 48 && j >= 48) {
            byte0 = 2;
            j -= 48;
        } else if (i >= 48 && j >= 48) {
            byte0 = 3;
            i -= 48;
            j -= 48;
        }
        return aByteArrayArray580[byte0][i * 48 + j] & 0xff;
    }

    public int method422(int i, int j) {
        if (i < 0 || i >= 96 || j < 0 || j >= 96)
            return 0;
        byte byte0 = 0;
        if (i >= 48 && j < 48) {
            byte0 = 1;
            i -= 48;
        } else if (i < 48 && j >= 48) {
            byte0 = 2;
            j -= 48;
        } else if (i >= 48 && j >= 48) {
            byte0 = 3;
            i -= 48;
            j -= 48;
        }
        return aByteArrayArray579[byte0][i * 48 + j] & 0xff;
    }

    public void method423(int i, int j, int k, int l) {
        String s = "m" + k + i / 10 + i % 10 + j / 10 + j % 10;
        int i1;
        try {
            if (aByteArray573 != null) {
                byte[] abyte0 = tools.loadData(s + ".hei", 0, aByteArray573);
                if (abyte0 == null && aByteArray575 != null)
                    abyte0 = tools.loadData(s + ".hei", 0, aByteArray575);
                if (abyte0 != null && abyte0.length > 0) {
                    int j1 = 0;
                    int k2 = 0;
                    for (int j3 = 0; j3 < 2304; ) {
                        int i4 = abyte0[j1++] & 0xff;
                        if (i4 < 128) {
                            aByteArrayArray577[l][j3++] = (byte) i4;
                            k2 = i4;
                        }
                        if (i4 >= 128) {
                            for (int i5 = 0; i5 < i4 - 128; i5++)
                                aByteArrayArray577[l][j3++] = (byte) k2;

                        }
                    }

                    k2 = 64;
                    for (int j4 = 0; j4 < 48; j4++) {
                        for (int j5 = 0; j5 < 48; j5++) {
                            k2 = aByteArrayArray577[l][j5 * 48 + j4] + k2 & 0x7f;
                            aByteArrayArray577[l][j5 * 48 + j4] = (byte) (k2 * 2);
                        }

                    }

                    k2 = 0;
                    for (int k5 = 0; k5 < 2304; ) {
                        int j6 = abyte0[j1++] & 0xff;
                        if (j6 < 128) {
                            aByteArrayArray578[l][k5++] = (byte) j6;
                            k2 = j6;
                        }
                        if (j6 >= 128) {
                            for (int k7 = 0; k7 < j6 - 128; k7++)
                                aByteArrayArray578[l][k5++] = (byte) k2;

                        }
                    }

                    k2 = 35;
                    for (int k6 = 0; k6 < 48; k6++) {
                        for (int l7 = 0; l7 < 48; l7++) {
                            k2 = aByteArrayArray578[l][l7 * 48 + k6] + k2 & 0x7f;
                            aByteArrayArray578[l][l7 * 48 + k6] = (byte) (k2 * 2);
                        }

                    }

                } else {
                    for (int k1 = 0; k1 < 2304; k1++) {
                        aByteArrayArray577[l][k1] = 0;
                        aByteArrayArray578[l][k1] = 0;
                    }

                }
                abyte0 = tools.loadData(s + ".dat", 0, aByteArray574);
                if (abyte0 == null && aByteArray576 != null)
                    abyte0 = tools.loadData(s + ".dat", 0, aByteArray576);
                if (abyte0 == null || abyte0.length == 0)
                    throw new IOException();
                int l1 = 0;
                for (int l2 = 0; l2 < 2304; l2++)
                    aByteArrayArray579[l][l2] = abyte0[l1++];

                for (int k3 = 0; k3 < 2304; k3++)
                    aByteArrayArray580[l][k3] = abyte0[l1++];

                for (int k4 = 0; k4 < 2304; k4++)
                    anIntArrayArray584[l][k4] = abyte0[l1++] & 0xff;

                for (int l5 = 0; l5 < 2304; l5++) {
                    int l6 = abyte0[l1++] & 0xff;
                    if (l6 > 0)
                        anIntArrayArray584[l][l5] = l6 + 12000;
                }

                for (int i7 = 0; i7 < 2304; ) {
                    int i8 = abyte0[l1++] & 0xff;
                    if (i8 < 128) {
                        aByteArrayArray581[l][i7++] = (byte) i8;
                    } else {
                        for (int l8 = 0; l8 < i8 - 128; l8++)
                            aByteArrayArray581[l][i7++] = 0;

                    }
                }

                int j8 = 0;
                for (int i9 = 0; i9 < 2304; ) {
                    int k9 = abyte0[l1++] & 0xff;
                    if (k9 < 128) {
                        aByteArrayArray582[l][i9++] = (byte) k9;
                        j8 = k9;
                    } else {
                        for (int j10 = 0; j10 < k9 - 128; j10++)
                            aByteArrayArray582[l][i9++] = (byte) j8;

                    }
                }

                for (int l9 = 0; l9 < 2304; ) {
                    int k10 = abyte0[l1++] & 0xff;
                    if (k10 < 128) {
                        aByteArrayArray583[l][l9++] = (byte) k10;
                    } else {
                        for (int j11 = 0; j11 < k10 - 128; j11++)
                            aByteArrayArray583[l][l9++] = 0;

                    }
                }

                abyte0 = tools.loadData(s + ".loc", 0, aByteArray574);
                if (abyte0 != null && abyte0.length > 0) {
                    int i2 = 0;
                    for (int l10 = 0; l10 < 2304; ) {
                        int k11 = abyte0[i2++] & 0xff;
                        if (k11 < 128)
                            anIntArrayArray584[l][l10++] = k11 + 48000;
                        else
                            l10 += k11 - 128;
                    }

                    return;
                }
            } else {
                byte[] abyte1 = new byte[20736];
                tools.downloadFile("../gamedata/maps/" + s + ".jm", abyte1, 20736);
                int j2 = 0;
                int i3 = 0;
                for (int l3 = 0; l3 < 2304; l3++) {
                    j2 = j2 + abyte1[i3++] & 0xff;
                    aByteArrayArray577[l][l3] = (byte) j2;
                }

                j2 = 0;
                for (int l4 = 0; l4 < 2304; l4++) {
                    j2 = j2 + abyte1[i3++] & 0xff;
                    aByteArrayArray578[l][l4] = (byte) j2;
                }

                for (int i6 = 0; i6 < 2304; i6++)
                    aByteArrayArray579[l][i6] = abyte1[i3++];

                for (int j7 = 0; j7 < 2304; j7++)
                    aByteArrayArray580[l][j7] = abyte1[i3++];

                for (int k8 = 0; k8 < 2304; k8++) {
                    anIntArrayArray584[l][k8] = (abyte1[i3] & 0xff) * 256 + (abyte1[i3 + 1] & 0xff);
                    i3 += 2;
                }

                for (int j9 = 0; j9 < 2304; j9++)
                    aByteArrayArray581[l][j9] = abyte1[i3++];

                for (int i10 = 0; i10 < 2304; i10++)
                    aByteArrayArray582[l][i10] = abyte1[i3++];

                for (int i11 = 0; i11 < 2304; i11++)
                    aByteArrayArray583[l][i11] = abyte1[i3++];

            }
            return;
        } catch (IOException _ex) {
            i1 = 0;
        }
        for (; i1 < 2304; i1++) {
            aByteArrayArray577[l][i1] = 0;
            aByteArrayArray578[l][i1] = 0;
            aByteArrayArray579[l][i1] = 0;
            aByteArrayArray580[l][i1] = 0;
            anIntArrayArray584[l][i1] = 0;
            aByteArrayArray581[l][i1] = 0;
            aByteArrayArray582[l][i1] = 0;
            if (k == 0)
                aByteArrayArray582[l][i1] = -6;
            if (k == 3)
                aByteArrayArray582[l][i1] = 8;
            aByteArrayArray583[l][i1] = 0;
        }

    }

    public void method424() {
        if (aBoolean566)
            aWorld3d_568.method261();
        for (int i = 0; i < 64; i++) {
            aObject3dArray593[i] = null;
            for (int j = 0; j < 4; j++)
                aObject3dArrayArray594[j][i] = null;

            for (int k = 0; k < 4; k++)
                aObject3dArrayArray595[k][i] = null;

        }

        System.gc();
    }

    public void method425(int i, int j, int k) {
        method424();
        int l = (i + 24) / 48;
        int i1 = (j + 24) / 48;
        method428(i, j, k, true);
        if (k == 0) {
            method428(i, j, 1, false);
            method428(i, j, 2, false);
            method423(l - 1, i1 - 1, k, 0);
            method423(l, i1 - 1, k, 1);
            method423(l - 1, i1, k, 2);
            method423(l, i1, k, 3);
            method426();
        }
    }

    public void method426() {
        for (int i = 0; i < 96; i++) {
            for (int j = 0; j < 96; j++)
                if (method412(i, j, 0) == 250)
                    if (i == 47 && method412(i + 1, j, 0) != 250 && method412(i + 1, j, 0) != 2)
                        method413(i, j, 9);
                    else if (j == 47 && method412(i, j + 1, 0) != 250 && method412(i, j + 1, 0) != 2)
                        method413(i, j, 9);
                    else
                        method413(i, j, 2);

        }

    }

    public void method427(int i, int j, int k, int l, int i1) {
        int j1 = i * 3;
        int k1 = j * 3;
        int l1 = aWorld3d_568.method298(l);
        int i2 = aWorld3d_568.method298(i1);
        l1 = l1 >> 1 & 0x7f7f7f;
        i2 = i2 >> 1 & 0x7f7f7f;
        if (k == 0) {
            aPixmap_567.method216(j1, k1, 3, l1);
            aPixmap_567.method216(j1, k1 + 1, 2, l1);
            aPixmap_567.method216(j1, k1 + 2, 1, l1);
            aPixmap_567.method216(j1 + 2, k1 + 1, 1, i2);
            aPixmap_567.method216(j1 + 1, k1 + 2, 2, i2);
            return;
        }
        if (k == 1) {
            aPixmap_567.method216(j1, k1, 3, i2);
            aPixmap_567.method216(j1 + 1, k1 + 1, 2, i2);
            aPixmap_567.method216(j1 + 2, k1 + 2, 1, i2);
            aPixmap_567.method216(j1, k1 + 1, 1, l1);
            aPixmap_567.method216(j1, k1 + 2, 2, l1);
        }
    }

    public void method428(int i, int j, int k, boolean flag) {
        int l = (i + 24) / 48;
        int i1 = (j + 24) / 48;
        method423(l - 1, i1 - 1, k, 0);
        method423(l, i1 - 1, k, 1);
        method423(l - 1, i1, k, 2);
        method423(l, i1, k, 3);
        method426();
        if (aObject3d_596 == null)
            aObject3d_596 = new object3d(anInt585 * anInt586 * 2 + 256, anInt585 * anInt586 * 2 + 256, true, true, false, false, true);
        if (flag) {
            aPixmap_567.method210();
            for (int j1 = 0; j1 < 96; j1++) {
                for (int l1 = 0; l1 < 96; l1++)
                    anIntArrayArray590[j1][l1] = 0;

            }

            object3d object3d = aObject3d_596;
            object3d.method175();
            for (int j2 = 0; j2 < 96; j2++) {
                for (int i3 = 0; i3 < 96; i3++) {
                    int i4 = -method410(j2, i3);
                    if (method412(j2, i3, k) > 0 && clientconfig.anIntArray495[method412(j2, i3, k) - 1] == 4)
                        i4 = 0;
                    if (method412(j2 - 1, i3, k) > 0 && clientconfig.anIntArray495[method412(j2 - 1, i3, k) - 1] == 4)
                        i4 = 0;
                    if (method412(j2, i3 - 1, k) > 0 && clientconfig.anIntArray495[method412(j2, i3 - 1, k) - 1] == 4)
                        i4 = 0;
                    if (method412(j2 - 1, i3 - 1, k) > 0 && clientconfig.anIntArray495[method412(j2 - 1, i3 - 1, k) - 1] == 4)
                        i4 = 0;
                    int j5 = object3d.method178(j2 * 128, i4, i3 * 128);
                    int j7 = (int) (Math.random() * 10D) - 5;
                    object3d.method186(j5, j7);
                }

            }

            for (int j3 = 0; j3 < 95; j3++) {
                for (int j4 = 0; j4 < 95; j4++) {
                    int k5 = method411(j3, j4);
                    int k7 = anIntArray572[k5];
                    int i10 = k7;
                    int k12 = k7;
                    int l14 = 0;
                    if (k == 1 || k == 2) {
                        k7 = 0xbc614e;
                        i10 = 0xbc614e;
                        k12 = 0xbc614e;
                    }
                    if (method412(j3, j4, k) > 0) {
                        int l16 = method412(j3, j4, k);
                        int l5 = clientconfig.anIntArray495[l16 - 1];
                        int i19 = method414(j3, j4, k);
                        k7 = i10 = clientconfig.anIntArray494[l16 - 1];
                        if (l5 == 4) {
                            k7 = 1;
                            i10 = 1;
                            if (l16 == 12) {
                                k7 = 31;
                                i10 = 31;
                            }
                        }
                        if (l5 == 5) {
                            if (method416(j3, j4) > 0 && method416(j3, j4) < 24000)
                                if (method415(j3 - 1, j4, k, k12) != 0xbc614e && method415(j3, j4 - 1, k, k12) != 0xbc614e) {
                                    k7 = method415(j3 - 1, j4, k, k12);
                                    l14 = 0;
                                } else if (method415(j3 + 1, j4, k, k12) != 0xbc614e && method415(j3, j4 + 1, k, k12) != 0xbc614e) {
                                    i10 = method415(j3 + 1, j4, k, k12);
                                    l14 = 0;
                                } else if (method415(j3 + 1, j4, k, k12) != 0xbc614e && method415(j3, j4 - 1, k, k12) != 0xbc614e) {
                                    i10 = method415(j3 + 1, j4, k, k12);
                                    l14 = 1;
                                } else if (method415(j3 - 1, j4, k, k12) != 0xbc614e && method415(j3, j4 + 1, k, k12) != 0xbc614e) {
                                    k7 = method415(j3 - 1, j4, k, k12);
                                    l14 = 1;
                                }
                        } else if (l5 != 2 || method416(j3, j4) > 0 && method416(j3, j4) < 24000)
                            if (method414(j3 - 1, j4, k) != i19 && method414(j3, j4 - 1, k) != i19) {
                                k7 = k12;
                                l14 = 0;
                            } else if (method414(j3 + 1, j4, k) != i19 && method414(j3, j4 + 1, k) != i19) {
                                i10 = k12;
                                l14 = 0;
                            } else if (method414(j3 + 1, j4, k) != i19 && method414(j3, j4 - 1, k) != i19) {
                                i10 = k12;
                                l14 = 1;
                            } else if (method414(j3 - 1, j4, k) != i19 && method414(j3, j4 + 1, k) != i19) {
                                k7 = k12;
                                l14 = 1;
                            }
                        if (clientconfig.anIntArray496[l16 - 1] != 0)
                            anIntArrayArray590[j3][j4] |= 0x40;
                        if (clientconfig.anIntArray495[l16 - 1] == 2)
                            anIntArrayArray590[j3][j4] |= 0x80;
                    }
                    method427(j3, j4, l14, k7, i10);
                    int i17 = ((method410(j3 + 1, j4 + 1) - method410(j3 + 1, j4)) + method410(j3, j4 + 1)) - method410(j3, j4);
                    if (k7 != i10 || i17 != 0) {
                        int[] ai = new int[3];
                        int[] ai7 = new int[3];
                        if (l14 == 0) {
                            if (k7 != 0xbc614e) {
                                ai[0] = j4 + j3 * anInt585 + anInt585;
                                ai[1] = j4 + j3 * anInt585;
                                ai[2] = j4 + j3 * anInt585 + 1;
                                int l21 = object3d.method180(3, ai, 0xbc614e, k7);
                                anIntArray587[l21] = j3;
                                anIntArray588[l21] = j4;
                                object3d.anIntArray131[l21] = 0x30d40 + l21;
                            }
                            if (i10 != 0xbc614e) {
                                ai7[0] = j4 + j3 * anInt585 + 1;
                                ai7[1] = j4 + j3 * anInt585 + anInt585 + 1;
                                ai7[2] = j4 + j3 * anInt585 + anInt585;
                                int i22 = object3d.method180(3, ai7, 0xbc614e, i10);
                                anIntArray587[i22] = j3;
                                anIntArray588[i22] = j4;
                                object3d.anIntArray131[i22] = 0x30d40 + i22;
                            }
                        } else {
                            if (k7 != 0xbc614e) {
                                ai[0] = j4 + j3 * anInt585 + 1;
                                ai[1] = j4 + j3 * anInt585 + anInt585 + 1;
                                ai[2] = j4 + j3 * anInt585;
                                int j22 = object3d.method180(3, ai, 0xbc614e, k7);
                                anIntArray587[j22] = j3;
                                anIntArray588[j22] = j4;
                                object3d.anIntArray131[j22] = 0x30d40 + j22;
                            }
                            if (i10 != 0xbc614e) {
                                ai7[0] = j4 + j3 * anInt585 + anInt585;
                                ai7[1] = j4 + j3 * anInt585;
                                ai7[2] = j4 + j3 * anInt585 + anInt585 + 1;
                                int k22 = object3d.method180(3, ai7, 0xbc614e, i10);
                                anIntArray587[k22] = j3;
                                anIntArray588[k22] = j4;
                                object3d.anIntArray131[k22] = 0x30d40 + k22;
                            }
                        }
                    } else if (k7 != 0xbc614e) {
                        int[] ai1 = new int[4];
                        ai1[0] = j4 + j3 * anInt585 + anInt585;
                        ai1[1] = j4 + j3 * anInt585;
                        ai1[2] = j4 + j3 * anInt585 + 1;
                        ai1[3] = j4 + j3 * anInt585 + anInt585 + 1;
                        int l19 = object3d.method180(4, ai1, 0xbc614e, k7);
                        anIntArray587[l19] = j3;
                        anIntArray588[l19] = j4;
                        object3d.anIntArray131[l19] = 0x30d40 + l19;
                    }
                }

            }

            for (int k4 = 1; k4 < 95; k4++) {
                for (int i6 = 1; i6 < 95; i6++)
                    if (method412(k4, i6, k) > 0 && clientconfig.anIntArray495[method412(k4, i6, k) - 1] == 4) {
                        int l7 = clientconfig.anIntArray494[method412(k4, i6, k) - 1];
                        int j10 = object3d.method178(k4 * 128, -method410(k4, i6), i6 * 128);
                        int l12 = object3d.method178((k4 + 1) * 128, -method410(k4 + 1, i6), i6 * 128);
                        int i15 = object3d.method178((k4 + 1) * 128, -method410(k4 + 1, i6 + 1), (i6 + 1) * 128);
                        int j17 = object3d.method178(k4 * 128, -method410(k4, i6 + 1), (i6 + 1) * 128);
                        int[] ai2 = {
                                j10, l12, i15, j17
                        };
                        int i20 = object3d.method180(4, ai2, l7, 0xbc614e);
                        anIntArray587[i20] = k4;
                        anIntArray588[i20] = i6;
                        object3d.anIntArray131[i20] = 0x30d40 + i20;
                        method427(k4, i6, 0, l7, l7);
                    } else if (method412(k4, i6, k) == 0 || clientconfig.anIntArray495[method412(k4, i6, k) - 1] != 3) {
                        if (method412(k4, i6 + 1, k) > 0 && clientconfig.anIntArray495[method412(k4, i6 + 1, k) - 1] == 4) {
                            int i8 = clientconfig.anIntArray494[method412(k4, i6 + 1, k) - 1];
                            int k10 = object3d.method178(k4 * 128, -method410(k4, i6), i6 * 128);
                            int i13 = object3d.method178((k4 + 1) * 128, -method410(k4 + 1, i6), i6 * 128);
                            int j15 = object3d.method178((k4 + 1) * 128, -method410(k4 + 1, i6 + 1), (i6 + 1) * 128);
                            int k17 = object3d.method178(k4 * 128, -method410(k4, i6 + 1), (i6 + 1) * 128);
                            int[] ai3 = {
                                    k10, i13, j15, k17
                            };
                            int j20 = object3d.method180(4, ai3, i8, 0xbc614e);
                            anIntArray587[j20] = k4;
                            anIntArray588[j20] = i6;
                            object3d.anIntArray131[j20] = 0x30d40 + j20;
                            method427(k4, i6, 0, i8, i8);
                        }
                        if (method412(k4, i6 - 1, k) > 0 && clientconfig.anIntArray495[method412(k4, i6 - 1, k) - 1] == 4) {
                            int j8 = clientconfig.anIntArray494[method412(k4, i6 - 1, k) - 1];
                            int l10 = object3d.method178(k4 * 128, -method410(k4, i6), i6 * 128);
                            int j13 = object3d.method178((k4 + 1) * 128, -method410(k4 + 1, i6), i6 * 128);
                            int k15 = object3d.method178((k4 + 1) * 128, -method410(k4 + 1, i6 + 1), (i6 + 1) * 128);
                            int l17 = object3d.method178(k4 * 128, -method410(k4, i6 + 1), (i6 + 1) * 128);
                            int[] ai4 = {
                                    l10, j13, k15, l17
                            };
                            int k20 = object3d.method180(4, ai4, j8, 0xbc614e);
                            anIntArray587[k20] = k4;
                            anIntArray588[k20] = i6;
                            object3d.anIntArray131[k20] = 0x30d40 + k20;
                            method427(k4, i6, 0, j8, j8);
                        }
                        if (method412(k4 + 1, i6, k) > 0 && clientconfig.anIntArray495[method412(k4 + 1, i6, k) - 1] == 4) {
                            int k8 = clientconfig.anIntArray494[method412(k4 + 1, i6, k) - 1];
                            int i11 = object3d.method178(k4 * 128, -method410(k4, i6), i6 * 128);
                            int k13 = object3d.method178((k4 + 1) * 128, -method410(k4 + 1, i6), i6 * 128);
                            int l15 = object3d.method178((k4 + 1) * 128, -method410(k4 + 1, i6 + 1), (i6 + 1) * 128);
                            int i18 = object3d.method178(k4 * 128, -method410(k4, i6 + 1), (i6 + 1) * 128);
                            int[] ai5 = {
                                    i11, k13, l15, i18
                            };
                            int l20 = object3d.method180(4, ai5, k8, 0xbc614e);
                            anIntArray587[l20] = k4;
                            anIntArray588[l20] = i6;
                            object3d.anIntArray131[l20] = 0x30d40 + l20;
                            method427(k4, i6, 0, k8, k8);
                        }
                        if (method412(k4 - 1, i6, k) > 0 && clientconfig.anIntArray495[method412(k4 - 1, i6, k) - 1] == 4) {
                            int l8 = clientconfig.anIntArray494[method412(k4 - 1, i6, k) - 1];
                            int j11 = object3d.method178(k4 * 128, -method410(k4, i6), i6 * 128);
                            int l13 = object3d.method178((k4 + 1) * 128, -method410(k4 + 1, i6), i6 * 128);
                            int i16 = object3d.method178((k4 + 1) * 128, -method410(k4 + 1, i6 + 1), (i6 + 1) * 128);
                            int j18 = object3d.method178(k4 * 128, -method410(k4, i6 + 1), (i6 + 1) * 128);
                            int[] ai6 = {
                                    j11, l13, i16, j18
                            };
                            int i21 = object3d.method180(4, ai6, l8, 0xbc614e);
                            anIntArray587[i21] = k4;
                            anIntArray588[i21] = i6;
                            object3d.anIntArray131[i21] = 0x30d40 + i21;
                            method427(k4, i6, 0, l8, l8);
                        }
                    }

            }

            object3d.method183(true, 40, 48, -50, -10, -50);
            aObject3dArray593 = aObject3d_596.method181(0, 0, 1536, 1536, 8, 64, 233, false);
            for (int j6 = 0; j6 < 64; j6++)
                aWorld3d_568.method259(aObject3dArray593[j6]);

            for (int i9 = 0; i9 < 96; i9++) {
                for (int k11 = 0; k11 < 96; k11++)
                    anIntArrayArray591[i9][k11] = method410(i9, k11);

            }

        }
        aObject3d_596.method175();
        int k1 = 0x606060;
        for (int i2 = 0; i2 < 95; i2++) {
            for (int k2 = 0; k2 < 95; k2++) {
                int k3 = method421(i2, k2);
                if (k3 > 0 && (clientconfig.anIntArray489[k3 - 1] == 0 || aBoolean565)) {
                    method430(aObject3d_596, k3 - 1, i2, k2, i2 + 1, k2);
                    if (flag && clientconfig.anIntArray488[k3 - 1] != 0) {
                        anIntArrayArray590[i2][k2] |= 1;
                        if (k2 > 0)
                            method399(i2, k2 - 1, 4);
                    }
                    if (flag)
                        aPixmap_567.method216(i2 * 3, k2 * 3, 3, k1);
                }
                k3 = method422(i2, k2);
                if (k3 > 0 && (clientconfig.anIntArray489[k3 - 1] == 0 || aBoolean565)) {
                    method430(aObject3d_596, k3 - 1, i2, k2, i2, k2 + 1);
                    if (flag && clientconfig.anIntArray488[k3 - 1] != 0) {
                        anIntArrayArray590[i2][k2] |= 2;
                        if (i2 > 0)
                            method399(i2 - 1, k2, 8);
                    }
                    if (flag)
                        aPixmap_567.method217(i2 * 3, k2 * 3, 3, k1);
                }
                k3 = method416(i2, k2);
                if (k3 > 0 && k3 < 12000 && (clientconfig.anIntArray489[k3 - 1] == 0 || aBoolean565)) {
                    method430(aObject3d_596, k3 - 1, i2, k2, i2 + 1, k2 + 1);
                    if (flag && clientconfig.anIntArray488[k3 - 1] != 0)
                        anIntArrayArray590[i2][k2] |= 0x20;
                    if (flag) {
                        aPixmap_567.method218(i2 * 3, k2 * 3, k1);
                        aPixmap_567.method218(i2 * 3 + 1, k2 * 3 + 1, k1);
                        aPixmap_567.method218(i2 * 3 + 2, k2 * 3 + 2, k1);
                    }
                }
                if (k3 > 12000 && k3 < 24000 && (clientconfig.anIntArray489[k3 - 12001] == 0 || aBoolean565)) {
                    method430(aObject3d_596, k3 - 12001, i2 + 1, k2, i2, k2 + 1);
                    if (flag && clientconfig.anIntArray488[k3 - 12001] != 0)
                        anIntArrayArray590[i2][k2] |= 0x10;
                    if (flag) {
                        aPixmap_567.method218(i2 * 3 + 2, k2 * 3, k1);
                        aPixmap_567.method218(i2 * 3 + 1, k2 * 3 + 1, k1);
                        aPixmap_567.method218(i2 * 3, k2 * 3 + 2, k1);
                    }
                }
            }

        }

        if (flag)
            aPixmap_567.method227(anInt569 - 1, 0, 0, 285, 285);
        aObject3d_596.method183(false, 60, 24, -50, -10, -50);
        aObject3dArrayArray594[k] = aObject3d_596.method181(0, 0, 1536, 1536, 8, 64, 338, true);
        for (int l2 = 0; l2 < 64; l2++)
            aWorld3d_568.method259(aObject3dArrayArray594[k][l2]);

        for (int l3 = 0; l3 < 95; l3++) {
            for (int l4 = 0; l4 < 95; l4++) {
                int k6 = method421(l3, l4);
                if (k6 > 0)
                    method431(k6 - 1, l3, l4, l3 + 1, l4);
                k6 = method422(l3, l4);
                if (k6 > 0)
                    method431(k6 - 1, l3, l4, l3, l4 + 1);
                k6 = method416(l3, l4);
                if (k6 > 0 && k6 < 12000)
                    method431(k6 - 1, l3, l4, l3 + 1, l4 + 1);
                if (k6 > 12000 && k6 < 24000)
                    method431(k6 - 12001, l3 + 1, l4, l3, l4 + 1);
            }

        }

        for (int i5 = 1; i5 < 95; i5++) {
            for (int l6 = 1; l6 < 95; l6++) {
                int j9 = method417(i5, l6);
                if (j9 > 0) {
                    int l11 = i5;
                    int i14 = l6;
                    int j16 = i5 + 1;
                    int k18 = l6;
                    int j19 = i5 + 1;
                    int j21 = l6 + 1;
                    int l22 = i5;
                    int j23 = l6 + 1;
                    int l23 = 0;
                    int j24 = anIntArrayArray591[l11][i14];
                    int l24 = anIntArrayArray591[j16][k18];
                    int j25 = anIntArrayArray591[j19][j21];
                    int l25 = anIntArrayArray591[l22][j23];
                    if (j24 > 0x13880)
                        j24 -= 0x13880;
                    if (l24 > 0x13880)
                        l24 -= 0x13880;
                    if (j25 > 0x13880)
                        j25 -= 0x13880;
                    if (l25 > 0x13880)
                        l25 -= 0x13880;
                    if (j24 > l23)
                        l23 = j24;
                    if (l24 > l23)
                        l23 = l24;
                    if (j25 > l23)
                        l23 = j25;
                    if (l25 > l23)
                        l23 = l25;
                    if (l23 >= 0x13880)
                        l23 -= 0x13880;
                    if (j24 < 0x13880)
                        anIntArrayArray591[l11][i14] = l23;
                    else
                        anIntArrayArray591[l11][i14] -= 0x13880;
                    if (l24 < 0x13880)
                        anIntArrayArray591[j16][k18] = l23;
                    else
                        anIntArrayArray591[j16][k18] -= 0x13880;
                    if (j25 < 0x13880)
                        anIntArrayArray591[j19][j21] = l23;
                    else
                        anIntArrayArray591[j19][j21] -= 0x13880;
                    if (l25 < 0x13880)
                        anIntArrayArray591[l22][j23] = l23;
                    else
                        anIntArrayArray591[l22][j23] -= 0x13880;
                }
            }

        }

        aObject3d_596.method175();
        for (int i7 = 1; i7 < 95; i7++) {
            for (int k9 = 1; k9 < 95; k9++) {
                int i12 = method417(i7, k9);
                if (i12 > 0) {
                    int j14 = i7;
                    int k16 = k9;
                    int l18 = i7 + 1;
                    int k19 = k9;
                    int k21 = i7 + 1;
                    int i23 = k9 + 1;
                    int k23 = i7;
                    int i24 = k9 + 1;
                    int k24 = i7 * 128;
                    int i25 = k9 * 128;
                    int k25 = k24 + 128;
                    int i26 = i25 + 128;
                    int j26 = k24;
                    int k26 = i25;
                    int l26 = k25;
                    int i27 = i26;
                    int j27 = anIntArrayArray591[j14][k16];
                    int k27 = anIntArrayArray591[l18][k19];
                    int l27 = anIntArrayArray591[k21][i23];
                    int i28 = anIntArrayArray591[k23][i24];
                    int j28 = clientconfig.anIntArray491[i12 - 1];
                    if (method420(j14, k16) && j27 < 0x13880) {
                        j27 += j28 + 0x13880;
                        anIntArrayArray591[j14][k16] = j27;
                    }
                    if (method420(l18, k19) && k27 < 0x13880) {
                        k27 += j28 + 0x13880;
                        anIntArrayArray591[l18][k19] = k27;
                    }
                    if (method420(k21, i23) && l27 < 0x13880) {
                        l27 += j28 + 0x13880;
                        anIntArrayArray591[k21][i23] = l27;
                    }
                    if (method420(k23, i24) && i28 < 0x13880) {
                        i28 += j28 + 0x13880;
                        anIntArrayArray591[k23][i24] = i28;
                    }
                    if (j27 >= 0x13880)
                        j27 -= 0x13880;
                    if (k27 >= 0x13880)
                        k27 -= 0x13880;
                    if (l27 >= 0x13880)
                        l27 -= 0x13880;
                    if (i28 >= 0x13880)
                        i28 -= 0x13880;
                    byte byte0 = 16;
                    if (!method419(j14 - 1, k16))
                        k24 -= byte0;
                    if (!method419(j14 + 1, k16))
                        k24 += byte0;
                    if (!method419(j14, k16 - 1))
                        i25 -= byte0;
                    if (!method419(j14, k16 + 1))
                        i25 += byte0;
                    if (!method419(l18 - 1, k19))
                        k25 -= byte0;
                    if (!method419(l18 + 1, k19))
                        k25 += byte0;
                    if (!method419(l18, k19 - 1))
                        k26 -= byte0;
                    if (!method419(l18, k19 + 1))
                        k26 += byte0;
                    if (!method419(k21 - 1, i23))
                        l26 -= byte0;
                    if (!method419(k21 + 1, i23))
                        l26 += byte0;
                    if (!method419(k21, i23 - 1))
                        i26 -= byte0;
                    if (!method419(k21, i23 + 1))
                        i26 += byte0;
                    if (!method419(k23 - 1, i24))
                        j26 -= byte0;
                    if (!method419(k23 + 1, i24))
                        j26 += byte0;
                    if (!method419(k23, i24 - 1))
                        i27 -= byte0;
                    if (!method419(k23, i24 + 1))
                        i27 += byte0;
                    i12 = clientconfig.anIntArray492[i12 - 1];
                    j27 = -j27;
                    k27 = -k27;
                    l27 = -l27;
                    i28 = -i28;
                    if (method416(i7, k9) > 12000 && method416(i7, k9) < 24000 && method417(i7 - 1, k9 - 1) == 0) {
                        int[] ai8 = new int[3];
                        ai8[0] = aObject3d_596.method178(l26, l27, i26);
                        ai8[1] = aObject3d_596.method178(j26, i28, i27);
                        ai8[2] = aObject3d_596.method178(k25, k27, k26);
                        aObject3d_596.method180(3, ai8, i12, 0xbc614e);
                    } else if (method416(i7, k9) > 12000 && method416(i7, k9) < 24000 && method417(i7 + 1, k9 + 1) == 0) {
                        int[] ai9 = new int[3];
                        ai9[0] = aObject3d_596.method178(k24, j27, i25);
                        ai9[1] = aObject3d_596.method178(k25, k27, k26);
                        ai9[2] = aObject3d_596.method178(j26, i28, i27);
                        aObject3d_596.method180(3, ai9, i12, 0xbc614e);
                    } else if (method416(i7, k9) > 0 && method416(i7, k9) < 12000 && method417(i7 + 1, k9 - 1) == 0) {
                        int[] ai10 = new int[3];
                        ai10[0] = aObject3d_596.method178(j26, i28, i27);
                        ai10[1] = aObject3d_596.method178(k24, j27, i25);
                        ai10[2] = aObject3d_596.method178(l26, l27, i26);
                        aObject3d_596.method180(3, ai10, i12, 0xbc614e);
                    } else if (method416(i7, k9) > 0 && method416(i7, k9) < 12000 && method417(i7 - 1, k9 + 1) == 0) {
                        int[] ai11 = new int[3];
                        ai11[0] = aObject3d_596.method178(k25, k27, k26);
                        ai11[1] = aObject3d_596.method178(l26, l27, i26);
                        ai11[2] = aObject3d_596.method178(k24, j27, i25);
                        aObject3d_596.method180(3, ai11, i12, 0xbc614e);
                    } else if (j27 == k27 && l27 == i28) {
                        int[] ai12 = new int[4];
                        ai12[0] = aObject3d_596.method178(k24, j27, i25);
                        ai12[1] = aObject3d_596.method178(k25, k27, k26);
                        ai12[2] = aObject3d_596.method178(l26, l27, i26);
                        ai12[3] = aObject3d_596.method178(j26, i28, i27);
                        aObject3d_596.method180(4, ai12, i12, 0xbc614e);
                    } else if (j27 == i28 && k27 == l27) {
                        int[] ai13 = new int[4];
                        ai13[0] = aObject3d_596.method178(j26, i28, i27);
                        ai13[1] = aObject3d_596.method178(k24, j27, i25);
                        ai13[2] = aObject3d_596.method178(k25, k27, k26);
                        ai13[3] = aObject3d_596.method178(l26, l27, i26);
                        aObject3d_596.method180(4, ai13, i12, 0xbc614e);
                    } else {
                        boolean flag1 = method417(i7 - 1, k9 - 1) <= 0;
                        if (method417(i7 + 1, k9 + 1) > 0)
                            flag1 = false;
                        if (!flag1) {
                            int[] ai14 = new int[3];
                            ai14[0] = aObject3d_596.method178(k25, k27, k26);
                            ai14[1] = aObject3d_596.method178(l26, l27, i26);
                            ai14[2] = aObject3d_596.method178(k24, j27, i25);
                            aObject3d_596.method180(3, ai14, i12, 0xbc614e);
                            int[] ai16 = new int[3];
                            ai16[0] = aObject3d_596.method178(j26, i28, i27);
                            ai16[1] = aObject3d_596.method178(k24, j27, i25);
                            ai16[2] = aObject3d_596.method178(l26, l27, i26);
                            aObject3d_596.method180(3, ai16, i12, 0xbc614e);
                        } else {
                            int[] ai15 = new int[3];
                            ai15[0] = aObject3d_596.method178(k24, j27, i25);
                            ai15[1] = aObject3d_596.method178(k25, k27, k26);
                            ai15[2] = aObject3d_596.method178(j26, i28, i27);
                            aObject3d_596.method180(3, ai15, i12, 0xbc614e);
                            int[] ai17 = new int[3];
                            ai17[0] = aObject3d_596.method178(l26, l27, i26);
                            ai17[1] = aObject3d_596.method178(j26, i28, i27);
                            ai17[2] = aObject3d_596.method178(k25, k27, k26);
                            aObject3d_596.method180(3, ai17, i12, 0xbc614e);
                        }
                    }
                }
            }

        }

        aObject3d_596.method183(true, 50, 50, -50, -10, -50);
        aObject3dArrayArray595[k] = aObject3d_596.method181(0, 0, 1536, 1536, 8, 64, 169, true);
        for (int l9 = 0; l9 < 64; l9++)
            aWorld3d_568.method259(aObject3dArrayArray595[k][l9]);

        if (aObject3dArrayArray595[k][0] == null)
            throw new RuntimeException("null roof!");
        for (int j12 = 0; j12 < 96; j12++) {
            for (int k14 = 0; k14 < 96; k14++)
                if (anIntArrayArray591[j12][k14] >= 0x13880)
                    anIntArrayArray591[j12][k14] -= 0x13880;

        }

    }

    public void method429(object3d[] aclass2) {
        for (int i = 0; i < anInt585 - 2; i++) {
            for (int j = 0; j < anInt586 - 2; j++)
                if (method416(i, j) > 48000 && method416(i, j) < 60000) {
                    int k = method416(i, j) - 48001;
                    int l = method418(i, j);
                    int i1;
                    int j1;
                    if (l == 0 || l == 4) {
                        i1 = clientconfig.anIntArray476[k];
                        j1 = clientconfig.anIntArray477[k];
                    } else {
                        j1 = clientconfig.anIntArray476[k];
                        i1 = clientconfig.anIntArray477[k];
                    }
                    method403(i, j, k);
                    object3d object3d = aclass2[clientconfig.anIntArray475[k]].method203(false, true, false, false);
                    int k1 = ((i + i + i1) * 128) / 2;
                    int i2 = ((j + j + j1) * 128) / 2;
                    object3d.method189(k1, -method409(k1, i2), i2);
                    object3d.method188(0, method418(i, j) * 32, 0);
                    aWorld3d_568.method259(object3d);
                    object3d.method184(48, 48, -50, -10, -50);
                    if (i1 > 1 || j1 > 1) {
                        for (int k2 = i; k2 < i + i1; k2++) {
                            for (int l2 = j; l2 < j + j1; l2++)
                                if ((k2 > i || l2 > j) && method416(k2, l2) - 48001 == k) {
                                    int l1 = k2;
                                    int j2 = l2;
                                    byte byte0 = 0;
                                    if (l1 >= 48 && j2 < 48) {
                                        byte0 = 1;
                                        l1 -= 48;
                                    } else if (l1 < 48 && j2 >= 48) {
                                        byte0 = 2;
                                        j2 -= 48;
                                    } else if (l1 >= 48 && j2 >= 48) {
                                        byte0 = 3;
                                        l1 -= 48;
                                        j2 -= 48;
                                    }
                                    anIntArrayArray584[byte0][l1 * 48 + j2] = 0;
                                }

                        }

                    }
                }

        }

    }

    public void method430(object3d object3d, int i, int j, int k, int l, int i1) {
        method406(j, k, 40);
        method406(l, i1, 40);
        int j1 = clientconfig.anIntArray485[i];
        int k1 = clientconfig.anIntArray486[i];
        int l1 = clientconfig.anIntArray487[i];
        int i2 = j * 128;
        int j2 = k * 128;
        int k2 = l * 128;
        int l2 = i1 * 128;
        int i3 = object3d.method178(i2, -anIntArrayArray591[j][k], j2);
        int j3 = object3d.method178(i2, -anIntArrayArray591[j][k] - j1, j2);
        int k3 = object3d.method178(k2, -anIntArrayArray591[l][i1] - j1, l2);
        int l3 = object3d.method178(k2, -anIntArrayArray591[l][i1], l2);
        int[] ai = {
                i3, j3, k3, l3
        };
        int i4 = object3d.method180(4, ai, k1, l1);
        if (clientconfig.anIntArray489[i] == 5) {
            object3d.anIntArray131[i4] = 30000 + i;
        } else {
            object3d.anIntArray131[i4] = 0;
        }
    }

    public void method431(int i, int j, int k, int l, int i1) {
        int j1 = clientconfig.anIntArray485[i];
        if (anIntArrayArray591[j][k] < 0x13880)
            anIntArrayArray591[j][k] += 0x13880 + j1;
        if (anIntArrayArray591[l][i1] < 0x13880)
            anIntArrayArray591[l][i1] += 0x13880 + j1;
    }

    public boolean aBoolean565;
    public boolean aBoolean566;
    public pixmap aPixmap_567;
    public world3d aWorld3d_568;
    public int anInt569;
    public final int anInt570 = 0xbc614e;
    public final int anInt571 = 128;
    public int[] anIntArray572;
    public byte[] aByteArray573;
    public byte[] aByteArray574;
    public byte[] aByteArray575;
    public byte[] aByteArray576;
    public byte[][] aByteArrayArray577;
    public byte[][] aByteArrayArray578;
    public byte[][] aByteArrayArray579;
    public byte[][] aByteArrayArray580;
    public byte[][] aByteArrayArray581;
    public byte[][] aByteArrayArray582;
    public byte[][] aByteArrayArray583;
    public int[][] anIntArrayArray584;
    public int anInt585;
    public int anInt586;
    public int[] anIntArray587;
    public int[] anIntArray588;
    public int[][] anIntArrayArray589;
    public int[][] anIntArrayArray590;
    public int[][] anIntArrayArray591;
    public boolean aBoolean592;
    public object3d[] aObject3dArray593;
    public object3d[][] aObject3dArrayArray594;
    public object3d[][] aObject3dArrayArray595;
    public object3d aObject3d_596;
}
