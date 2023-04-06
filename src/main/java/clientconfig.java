import jagex.tools;

// was: b
public class clientconfig {

    public static int method392(String s) {
        if (s.equalsIgnoreCase("na"))
            return 0;
        for (int i = 0; i < anInt513; i++)
            if (aStringArray514[i].equalsIgnoreCase(s))
                return i;

        aStringArray514[anInt513++] = s;
        return anInt513 - 1;
    }

    public static int method393() {
        int i = aByteArray516[anInt518] & 0xff;
        anInt518++;
        return i;
    }

    public static int method394() {
        int i = tools.method344(aByteArray516, anInt518);
        anInt518 += 2;
        return i;
    }

    public static int method395() {
        int i = tools.method345(aByteArray516, anInt518);
        anInt518 += 4;
        if (i > 0x5f5e0ff)
            i = 0x5f5e0ff - i;
        return i;
    }

    public static String method396() {
        String s;
        for (s = ""; aByteArray515[anInt517] != 0; s = s + (char) aByteArray515[anInt517++]) ;
        anInt517++;
        return s;
    }

    public static void method397(byte[] abyte0, boolean flag) {
        aByteArray515 = tools.method357("string.dat", 0, abyte0);
        anInt517 = 0;
        aByteArray516 = tools.method357("integer.dat", 0, abyte0);
        anInt518 = 0;
        anInt428 = method394();
        aStringArray430 = new String[anInt428];
        aStringArray431 = new String[anInt428];
        aStringArray432 = new String[anInt428];
        anIntArray433 = new int[anInt428];
        anIntArray434 = new int[anInt428];
        anIntArray435 = new int[anInt428];
        anIntArray436 = new int[anInt428];
        anIntArray437 = new int[anInt428];
        anIntArray438 = new int[anInt428];
        anIntArray439 = new int[anInt428];
        anIntArray440 = new int[anInt428];
        for (int i = 0; i < anInt428; i++)
            aStringArray430[i] = method396();

        for (int j = 0; j < anInt428; j++)
            aStringArray431[j] = method396();

        for (int k = 0; k < anInt428; k++)
            aStringArray432[k] = method396();

        for (int l = 0; l < anInt428; l++) {
            anIntArray433[l] = method394();
            if (anIntArray433[l] + 1 > anInt429)
                anInt429 = anIntArray433[l] + 1;
        }

        for (int i1 = 0; i1 < anInt428; i1++)
            anIntArray434[i1] = method395();

        for (int j1 = 0; j1 < anInt428; j1++)
            anIntArray435[j1] = method393();

        for (int k1 = 0; k1 < anInt428; k1++)
            anIntArray436[k1] = method393();

        for (int l1 = 0; l1 < anInt428; l1++)
            anIntArray437[l1] = method394();

        for (int i2 = 0; i2 < anInt428; i2++)
            anIntArray438[i2] = method395();

        for (int j2 = 0; j2 < anInt428; j2++)
            anIntArray439[j2] = method393();

        for (int k2 = 0; k2 < anInt428; k2++)
            anIntArray440[k2] = method393();

        for (int l2 = 0; l2 < anInt428; l2++)
            if (!flag && anIntArray440[l2] == 1) {
                aStringArray430[l2] = "Members object";
                aStringArray431[l2] = "You need to be a member to use this object";
                anIntArray434[l2] = 0;
                aStringArray432[l2] = "";
                anIntArray436[0] = 0;
                anIntArray437[l2] = 0;
                anIntArray439[l2] = 1;
            }

        anInt441 = method394();
        aStringArray442 = new String[anInt441];
        aStringArray443 = new String[anInt441];
        aStringArray444 = new String[anInt441];
        anIntArray445 = new int[anInt441];
        anIntArray446 = new int[anInt441];
        anIntArray447 = new int[anInt441];
        anIntArray448 = new int[anInt441];
        anIntArray449 = new int[anInt441];
        anIntArrayArray450 = new int[anInt441][12];
        anIntArray451 = new int[anInt441];
        anIntArray452 = new int[anInt441];
        anIntArray453 = new int[anInt441];
        anIntArray454 = new int[anInt441];
        anIntArray455 = new int[anInt441];
        anIntArray456 = new int[anInt441];
        anIntArray457 = new int[anInt441];
        anIntArray458 = new int[anInt441];
        anIntArray459 = new int[anInt441];
        for (int i3 = 0; i3 < anInt441; i3++)
            aStringArray442[i3] = method396();

        for (int j3 = 0; j3 < anInt441; j3++)
            aStringArray443[j3] = method396();

        for (int k3 = 0; k3 < anInt441; k3++)
            anIntArray445[k3] = method393();

        for (int l3 = 0; l3 < anInt441; l3++)
            anIntArray446[l3] = method393();

        for (int i4 = 0; i4 < anInt441; i4++)
            anIntArray447[i4] = method393();

        for (int j4 = 0; j4 < anInt441; j4++)
            anIntArray448[j4] = method393();

        for (int k4 = 0; k4 < anInt441; k4++)
            anIntArray449[k4] = method393();

        for (int l4 = 0; l4 < anInt441; l4++) {
            for (int i5 = 0; i5 < 12; i5++) {
                anIntArrayArray450[l4][i5] = method393();
                if (anIntArrayArray450[l4][i5] == 255)
                    anIntArrayArray450[l4][i5] = -1;
            }

        }

        for (int j5 = 0; j5 < anInt441; j5++)
            anIntArray451[j5] = method395();

        for (int k5 = 0; k5 < anInt441; k5++)
            anIntArray452[k5] = method395();

        for (int l5 = 0; l5 < anInt441; l5++)
            anIntArray453[l5] = method395();

        for (int i6 = 0; i6 < anInt441; i6++)
            anIntArray454[i6] = method395();

        for (int j6 = 0; j6 < anInt441; j6++)
            anIntArray455[j6] = method394();

        for (int k6 = 0; k6 < anInt441; k6++)
            anIntArray456[k6] = method394();

        for (int l6 = 0; l6 < anInt441; l6++)
            anIntArray457[l6] = method393();

        for (int i7 = 0; i7 < anInt441; i7++)
            anIntArray458[i7] = method393();

        for (int j7 = 0; j7 < anInt441; j7++)
            anIntArray459[j7] = method393();

        for (int k7 = 0; k7 < anInt441; k7++)
            aStringArray444[k7] = method396();

        anInt460 = method394();
        aStringArray461 = new String[anInt460];
        aStringArray462 = new String[anInt460];
        for (int l7 = 0; l7 < anInt460; l7++)
            aStringArray461[l7] = method396();

        for (int i8 = 0; i8 < anInt460; i8++)
            aStringArray462[i8] = method396();

        anInt463 = method394();
        aStringArray464 = new String[anInt463];
        anIntArray465 = new int[anInt463];
        anIntArray466 = new int[anInt463];
        anIntArray467 = new int[anInt463];
        anIntArray468 = new int[anInt463];
        anIntArray469 = new int[anInt463];
        for (int j8 = 0; j8 < anInt463; j8++)
            aStringArray464[j8] = method396();

        for (int k8 = 0; k8 < anInt463; k8++)
            anIntArray465[k8] = method395();

        for (int l8 = 0; l8 < anInt463; l8++)
            anIntArray466[l8] = method393();

        for (int i9 = 0; i9 < anInt463; i9++)
            anIntArray467[i9] = method393();

        for (int j9 = 0; j9 < anInt463; j9++)
            anIntArray468[j9] = method393();

        for (int k9 = 0; k9 < anInt463; k9++)
            anIntArray469[k9] = method393();

        anInt470 = method394();
        aStringArray471 = new String[anInt470];
        aStringArray472 = new String[anInt470];
        aStringArray473 = new String[anInt470];
        aStringArray474 = new String[anInt470];
        anIntArray475 = new int[anInt470];
        anIntArray476 = new int[anInt470];
        anIntArray477 = new int[anInt470];
        anIntArray478 = new int[anInt470];
        anIntArray479 = new int[anInt470];
        for (int l9 = 0; l9 < anInt470; l9++)
            aStringArray471[l9] = method396();

        for (int i10 = 0; i10 < anInt470; i10++)
            aStringArray472[i10] = method396();

        for (int j10 = 0; j10 < anInt470; j10++)
            aStringArray473[j10] = method396();

        for (int k10 = 0; k10 < anInt470; k10++)
            aStringArray474[k10] = method396();

        for (int l10 = 0; l10 < anInt470; l10++)
            anIntArray475[l10] = method392(method396());

        for (int i11 = 0; i11 < anInt470; i11++)
            anIntArray476[i11] = method393();

        for (int j11 = 0; j11 < anInt470; j11++)
            anIntArray477[j11] = method393();

        for (int k11 = 0; k11 < anInt470; k11++)
            anIntArray478[k11] = method393();

        for (int l11 = 0; l11 < anInt470; l11++)
            anIntArray479[l11] = method393();

        anInt480 = method394();
        aStringArray481 = new String[anInt480];
        aStringArray482 = new String[anInt480];
        aStringArray483 = new String[anInt480];
        aStringArray484 = new String[anInt480];
        anIntArray485 = new int[anInt480];
        anIntArray486 = new int[anInt480];
        anIntArray487 = new int[anInt480];
        anIntArray488 = new int[anInt480];
        anIntArray489 = new int[anInt480];
        for (int i12 = 0; i12 < anInt480; i12++)
            aStringArray481[i12] = method396();

        for (int j12 = 0; j12 < anInt480; j12++)
            aStringArray482[j12] = method396();

        for (int k12 = 0; k12 < anInt480; k12++)
            aStringArray483[k12] = method396();

        for (int l12 = 0; l12 < anInt480; l12++)
            aStringArray484[l12] = method396();

        for (int i13 = 0; i13 < anInt480; i13++)
            anIntArray485[i13] = method394();

        for (int j13 = 0; j13 < anInt480; j13++)
            anIntArray486[j13] = method395();

        for (int k13 = 0; k13 < anInt480; k13++)
            anIntArray487[k13] = method395();

        for (int l13 = 0; l13 < anInt480; l13++)
            anIntArray488[l13] = method393();

        for (int i14 = 0; i14 < anInt480; i14++)
            anIntArray489[i14] = method393();

        anInt490 = method394();
        anIntArray491 = new int[anInt490];
        anIntArray492 = new int[anInt490];
        for (int j14 = 0; j14 < anInt490; j14++)
            anIntArray491[j14] = method393();

        for (int k14 = 0; k14 < anInt490; k14++)
            anIntArray492[k14] = method393();

        anInt493 = method394();
        anIntArray494 = new int[anInt493];
        anIntArray495 = new int[anInt493];
        anIntArray496 = new int[anInt493];
        for (int l14 = 0; l14 < anInt493; l14++)
            anIntArray494[l14] = method395();

        for (int i15 = 0; i15 < anInt493; i15++)
            anIntArray495[i15] = method393();

        for (int j15 = 0; j15 < anInt493; j15++)
            anIntArray496[j15] = method393();

        anInt497 = method394();
        anInt498 = method394();
        aStringArray499 = new String[anInt498];
        aStringArray500 = new String[anInt498];
        anIntArray501 = new int[anInt498];
        anIntArray502 = new int[anInt498];
        anIntArray503 = new int[anInt498];
        anIntArrayArray504 = new int[anInt498][];
        anIntArrayArray505 = new int[anInt498][];
        for (int k15 = 0; k15 < anInt498; k15++)
            aStringArray499[k15] = method396();

        for (int l15 = 0; l15 < anInt498; l15++)
            aStringArray500[l15] = method396();

        for (int i16 = 0; i16 < anInt498; i16++)
            anIntArray501[i16] = method393();

        for (int j16 = 0; j16 < anInt498; j16++)
            anIntArray502[j16] = method393();

        for (int k16 = 0; k16 < anInt498; k16++)
            anIntArray503[k16] = method393();

        for (int l16 = 0; l16 < anInt498; l16++) {
            int i17 = method393();
            anIntArrayArray504[l16] = new int[i17];
            for (int k17 = 0; k17 < i17; k17++)
                anIntArrayArray504[l16][k17] = method394();

        }

        for (int j17 = 0; j17 < anInt498; j17++) {
            int l17 = method393();
            anIntArrayArray505[j17] = new int[l17];
            for (int j18 = 0; j18 < l17; j18++)
                anIntArrayArray505[j17][j18] = method393();

        }

        anInt506 = method394();
        aStringArray507 = new String[anInt506];
        aStringArray508 = new String[anInt506];
        anIntArray509 = new int[anInt506];
        anIntArray510 = new int[anInt506];
        for (int i18 = 0; i18 < anInt506; i18++)
            aStringArray507[i18] = method396();

        for (int k18 = 0; k18 < anInt506; k18++)
            aStringArray508[k18] = method396();

        for (int l18 = 0; l18 < anInt506; l18++)
            anIntArray509[l18] = method393();

        for (int i19 = 0; i19 < anInt506; i19++)
            anIntArray510[i19] = method393();

        aByteArray515 = null;
        aByteArray516 = null;
    }

    public static int anInt428;
    public static int anInt429;
    public static String[] aStringArray430;
    public static String[] aStringArray431;
    public static String[] aStringArray432;
    public static int[] anIntArray433;
    public static int[] anIntArray434;
    public static int[] anIntArray435;
    public static int[] anIntArray436;
    public static int[] anIntArray437;
    public static int[] anIntArray438;
    public static int[] anIntArray439;
    public static int[] anIntArray440;
    public static int anInt441;
    public static String[] aStringArray442;
    public static String[] aStringArray443;
    public static String[] aStringArray444;
    public static int[] anIntArray445;
    public static int[] anIntArray446;
    public static int[] anIntArray447;
    public static int[] anIntArray448;
    public static int[] anIntArray449;
    public static int[][] anIntArrayArray450;
    public static int[] anIntArray451;
    public static int[] anIntArray452;
    public static int[] anIntArray453;
    public static int[] anIntArray454;
    public static int[] anIntArray455;
    public static int[] anIntArray456;
    public static int[] anIntArray457;
    public static int[] anIntArray458;
    public static int[] anIntArray459;
    public static int anInt460;
    public static String[] aStringArray461;
    public static String[] aStringArray462;
    public static int anInt463;
    public static String[] aStringArray464;
    public static int[] anIntArray465;
    public static int[] anIntArray466;
    public static int[] anIntArray467;
    public static int[] anIntArray468;
    public static int[] anIntArray469;
    public static int anInt470;
    public static String[] aStringArray471;
    public static String[] aStringArray472;
    public static String[] aStringArray473;
    public static String[] aStringArray474;
    public static int[] anIntArray475;
    public static int[] anIntArray476;
    public static int[] anIntArray477;
    public static int[] anIntArray478;
    public static int[] anIntArray479;
    public static int anInt480;
    public static String[] aStringArray481;
    public static String[] aStringArray482;
    public static String[] aStringArray483;
    public static String[] aStringArray484;
    public static int[] anIntArray485;
    public static int[] anIntArray486;
    public static int[] anIntArray487;
    public static int[] anIntArray488;
    public static int[] anIntArray489;
    public static int anInt490;
    public static int[] anIntArray491;
    public static int[] anIntArray492;
    public static int anInt493;
    public static int[] anIntArray494;
    public static int[] anIntArray495;
    public static int[] anIntArray496;
    public static int anInt497;
    public static int anInt498;
    public static String[] aStringArray499;
    public static String[] aStringArray500;
    public static int[] anIntArray501;
    public static int[] anIntArray502;
    public static int[] anIntArray503;
    public static int[][] anIntArrayArray504;
    public static int[][] anIntArrayArray505;
    public static int anInt506;
    public static String[] aStringArray507;
    public static String[] aStringArray508;
    public static int[] anIntArray509;
    public static int[] anIntArray510;
    public static String[] aStringArray511 = new String[5000];
    public static String[] aStringArray512 = new String[5000];
    public static int anInt513;
    public static String[] aStringArray514 = new String[5000];
    public static byte[] aByteArray515;
    public static byte[] aByteArray516;
    public static int anInt517;
    public static int anInt518;
    public static int anInt519;

}
