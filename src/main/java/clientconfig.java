import jagex.tools;

// was: b
public class clientconfig {

    public static int getModelId(String s) {
        if (s.equalsIgnoreCase("na")) {
            return 0;
        }

        for (int i = 0; i < modelCount; i++) {
            if (modelNames[i].equalsIgnoreCase(s)) {
                return i;
            }
        }

        modelNames[modelCount++] = s;
        return modelCount - 1;
    }

    public static int g1() {
        int value = integer[integerOffset] & 0xff;
        integerOffset++;
        return value;
    }

    public static int g2() {
        int value = tools.g2(integer, integerOffset);
        integerOffset += 2;
        return value;
    }

    public static int g4max() {
        int value = tools.g4(integer, integerOffset);
        integerOffset += 4;
        if (value > 99999999)
            value = 99999999 - value;
        return value;
    }

    public static String gjstr() {
        String str;
        for (str = ""; string[stringOffset] != 0; str = str + (char) string[stringOffset++]) ;
        stringOffset++;
        return str;
    }

    public static void unpack(byte[] configSrc, boolean members) {
        string = tools.loadData("string.dat", 0, configSrc);
        stringOffset = 0;
        integer = tools.loadData("integer.dat", 0, configSrc);
        integerOffset = 0;

        objCount = g2();
        objName = new String[objCount];
        objDesc = new String[objCount];
        objOp = new String[objCount];
        objSprite = new int[objCount];
        objCost = new int[objCount];
        objStackable = new int[objCount];
        objUnused = new int[objCount];
        objWearable = new int[objCount];
        objMask = new int[objCount];
        objSpecial = new int[objCount];
        objMembers = new int[objCount];

        for (int i = 0; i < objCount; i++) {
            objName[i] = gjstr();
        }

        for (int i = 0; i < objCount; i++) {
            objDesc[i] = gjstr();
        }

        for (int i = 0; i < objCount; i++) {
            objOp[i] = gjstr();
        }

        for (int i = 0; i < objCount; i++) {
            objSprite[i] = g2();
            if (objSprite[i] + 1 > totalObjSprite) {
                totalObjSprite = objSprite[i] + 1;
            }
        }

        for (int i = 0; i < objCount; i++) {
            objCost[i] = g4max();
        }

        for (int i = 0; i < objCount; i++) {
            objStackable[i] = g1();
        }

        for (int i = 0; i < objCount; i++) {
            objUnused[i] = g1();
        }

        for (int i = 0; i < objCount; i++) {
            objWearable[i] = g2();
        }

        for (int i = 0; i < objCount; i++) {
            objMask[i] = g4max();
        }

        for (int i = 0; i < objCount; i++) {
            objSpecial[i] = g1();
        }

        for (int i = 0; i < objCount; i++) {
            objMembers[i] = g1();
        }

        for (int i = 0; i < objCount; i++) {
            if (!members && objMembers[i] == 1) {
                objName[i] = "Members object";
                objDesc[i] = "You need to be a member to use this object";
                objCost[i] = 0;
                objOp[i] = "";
                objUnused[0] = 0;
                objWearable[i] = 0;
                objSpecial[i] = 1;
            }
        }

        npcCount = g2();
        npcName = new String[npcCount];
        npcDesc = new String[npcCount];
        npcOp = new String[npcCount];
        npcAttack = new int[npcCount];
        npcStrength = new int[npcCount];
        npcHits = new int[npcCount];
        npcDefense = new int[npcCount];
        npcAttackable = new int[npcCount];
        npcSprite = new int[npcCount][12];
        npcHairColor = new int[npcCount];
        npcTopColor = new int[npcCount];
        npcBottomColor = new int[npcCount];
        npcSkinColor = new int[npcCount];
        npcWidth = new int[npcCount];
        npcHeight = new int[npcCount];
        npcWalkModel = new int[npcCount];
        npcCombatModel = new int[npcCount];
        npcCombatAnim = new int[npcCount];

        for (int i = 0; i < npcCount; i++) {
            npcName[i] = gjstr();
        }

        for (int i = 0; i < npcCount; i++) {
            npcDesc[i] = gjstr();
        }

        for (int i = 0; i < npcCount; i++) {
            npcAttack[i] = g1();
        }

        for (int i = 0; i < npcCount; i++) {
            npcStrength[i] = g1();
        }

        for (int i = 0; i < npcCount; i++) {
            npcHits[i] = g1();
        }

        for (int i = 0; i < npcCount; i++) {
            npcDefense[i] = g1();
        }

        for (int i = 0; i < npcCount; i++) {
            npcAttackable[i] = g1();
        }

        for (int i = 0; i < npcCount; i++) {
            for (int j = 0; j < 12; j++) {
                npcSprite[i][j] = g1();
                if (npcSprite[i][j] == 255) {
                    npcSprite[i][j] = -1;
                }
            }
        }

        for (int i = 0; i < npcCount; i++) {
            npcHairColor[i] = g4max();
        }

        for (int i = 0; i < npcCount; i++) {
            npcTopColor[i] = g4max();
        }

        for (int i = 0; i < npcCount; i++) {
            npcBottomColor[i] = g4max();
        }

        for (int i = 0; i < npcCount; i++) {
            npcSkinColor[i] = g4max();
        }

        for (int i = 0; i < npcCount; i++) {
            npcWidth[i] = g2();
        }

        for (int i = 0; i < npcCount; i++) {
            npcHeight[i] = g2();
        }

        for (int i = 0; i < npcCount; i++) {
            npcWalkModel[i] = g1();
        }

        for (int i = 0; i < npcCount; i++) {
            npcCombatModel[i] = g1();
        }

        for (int i = 0; i < npcCount; i++) {
            npcCombatAnim[i] = g1();
        }

        for (int i = 0; i < npcCount; i++) {
            npcOp[i] = gjstr();
        }

        texture = g2();
        textureName = new String[texture];
        textureSubType = new String[texture];

        for (int i = 0; i < texture; i++) {
            textureName[i] = gjstr();
        }

        for (int i = 0; i < texture; i++) {
            textureSubType[i] = gjstr();
        }

        animCount = g2();
        animName = new String[animCount];
        animCharColor = new int[animCount];
        animGender = new int[animCount];
        animHasA = new int[animCount];
        animHasF = new int[animCount];
        animNumber = new int[animCount];

        for (int i = 0; i < animCount; i++) {
            animName[i] = gjstr();
        }

        for (int i = 0; i < animCount; i++) {
            animCharColor[i] = g4max();
        }

        for (int i = 0; i < animCount; i++) {
            animGender[i] = g1();
        }

        for (int i = 0; i < animCount; i++) {
            animHasA[i] = g1();
        }

        for (int i = 0; i < animCount; i++) {
            animHasF[i] = g1();
        }

        for (int i = 0; i < animCount; i++) {
            animNumber[i] = g1();
        }

        locCount = g2();
        locName = new String[locCount];
        locDesc = new String[locCount];
        locOp1 = new String[locCount];
        locOp2 = new String[locCount];
        locModel = new int[locCount];
        locWidth = new int[locCount];
        locHeight = new int[locCount];
        locType = new int[locCount];
        locElevation = new int[locCount];

        for (int i = 0; i < locCount; i++) {
            locName[i] = gjstr();
        }

        for (int i = 0; i < locCount; i++) {
            locDesc[i] = gjstr();
        }

        for (int i = 0; i < locCount; i++) {
            locOp1[i] = gjstr();
        }

        for (int I = 0; I < locCount; I++) {
            locOp2[I] = gjstr();
        }

        for (int i = 0; i < locCount; i++) {
            locModel[i] = getModelId(gjstr());
        }

        for (int i = 0; i < locCount; i++) {
            locWidth[i] = g1();
        }

        for (int i = 0; i < locCount; i++) {
            locHeight[i] = g1();
        }

        for (int i = 0; i < locCount; i++) {
            locType[i] = g1();
        }

        for (int i = 0; i < locCount; i++) {
            locElevation[i] = g1();
        }

        boundary = g2();
        boundaryName = new String[boundary];
        boundaryDesc = new String[boundary];
        boundaryOp1 = new String[boundary];
        boundaryOp2 = new String[boundary];
        boundaryHeight = new int[boundary];
        boundaryTextureFront = new int[boundary];
        boundaryTextureBack = new int[boundary];
        boundaryAdjacent = new int[boundary];
        boundaryInvisible = new int[boundary];

        for (int i = 0; i < boundary; i++) {
            boundaryName[i] = gjstr();
        }

        for (int i = 0; i < boundary; i++) {
            boundaryDesc[i] = gjstr();
        }

        for (int i = 0; i < boundary; i++) {
            boundaryOp1[i] = gjstr();
        }

        for (int i = 0; i < boundary; i++) {
            boundaryOp2[i] = gjstr();
        }

        for (int i = 0; i < boundary; i++) {
            boundaryHeight[i] = g2();
        }

        for (int i = 0; i < boundary; i++) {
            boundaryTextureFront[i] = g4max();
        }

        for (int i = 0; i < boundary; i++) {
            boundaryTextureBack[i] = g4max();
        }

        for (int i = 0; i < boundary; i++) {
            boundaryAdjacent[i] = g1();
        }

        for (int i = 0; i < boundary; i++) {
            boundaryInvisible[i] = g1();
        }

        roofCount = g2();
        roofHeight = new int[roofCount];
        roofFills = new int[roofCount];

        for (int i = 0; i < roofCount; i++) {
            roofHeight[i] = g1();
        }

        for (int k14 = 0; k14 < roofCount; k14++) {
            roofFills[k14] = g1();
        }

        tileCount = g2();
        tileDecoration = new int[tileCount];
        tileType = new int[tileCount];
        tileAdjacent = new int[tileCount];

        for (int i = 0; i < tileCount; i++) {
            tileDecoration[i] = g4max();
        }

        for (int i = 0; i < tileCount; i++) {
            tileType[i] = g1();
        }

        for (int i = 0; i < tileCount; i++) {
            tileAdjacent[i] = g1();
        }

        projectileSprite = g2();

        spellCount = g2();
        spellName = new String[spellCount];
        spellDesc = new String[spellCount];
        spellLevel = new int[spellCount];
        spellRunesRequired = new int[spellCount];
        spellType = new int[spellCount];
        spellRunesId = new int[spellCount][];
        spellRunesCount = new int[spellCount][];

        for (int i = 0; i < spellCount; i++) {
            spellName[i] = gjstr();
        }

        for (int i = 0; i < spellCount; i++) {
            spellDesc[i] = gjstr();
        }

        for (int i = 0; i < spellCount; i++) {
            spellLevel[i] = g1();
        }

        for (int i = 0; i < spellCount; i++) {
            spellRunesRequired[i] = g1();
        }

        for (int i = 0; i < spellCount; i++) {
            spellType[i] = g1();
        }

        for (int i = 0; i < spellCount; i++) {
            int runeCount = g1();
            spellRunesId[i] = new int[runeCount];
            for (int j = 0; j < runeCount; j++) {
                spellRunesId[i][j] = g2();
            }
        }

        for (int i = 0; i < spellCount; i++) {
            int runeCount = g1();
            spellRunesCount[i] = new int[runeCount];
            for (int j = 0; j < runeCount; j++) {
                spellRunesCount[i][j] = g1();
            }
        }

        prayerCount = g2();
        prayerName = new String[prayerCount];
        prayerDesc = new String[prayerCount];
        prayerLevel = new int[prayerCount];
        prayerDrain = new int[prayerCount];

        for (int i = 0; i < prayerCount; i++) {
            prayerName[i] = gjstr();
        }

        for (int i = 0; i < prayerCount; i++) {
            prayerDesc[i] = gjstr();
        }

        for (int i = 0; i < prayerCount; i++) {
            prayerLevel[i] = g1();
        }

        for (int i = 0; i < prayerCount; i++) {
            prayerDrain[i] = g1();
        }

        string = null;
        integer = null;
    }

    public static int objCount;
    public static int totalObjSprite;
    public static String[] objName;
    public static String[] objDesc;
    public static String[] objOp;
    public static int[] objSprite;
    public static int[] objCost;
    public static int[] objStackable;
    public static int[] objUnused;
    public static int[] objWearable;
    public static int[] objMask;
    public static int[] objSpecial;
    public static int[] objMembers;
    public static int npcCount;
    public static String[] npcName;
    public static String[] npcDesc;
    public static String[] npcOp;
    public static int[] npcAttack;
    public static int[] npcStrength;
    public static int[] npcHits;
    public static int[] npcDefense;
    public static int[] npcAttackable;
    public static int[][] npcSprite;
    public static int[] npcHairColor;
    public static int[] npcTopColor;
    public static int[] npcBottomColor;
    public static int[] npcSkinColor;
    public static int[] npcWidth;
    public static int[] npcHeight;
    public static int[] npcWalkModel;
    public static int[] npcCombatModel;
    public static int[] npcCombatAnim;
    public static int texture;
    public static String[] textureName;
    public static String[] textureSubType;
    public static int animCount;
    public static String[] animName;
    public static int[] animCharColor;
    public static int[] animGender;
    public static int[] animHasA;
    public static int[] animHasF;
    public static int[] animNumber;
    public static int locCount;
    public static String[] locName;
    public static String[] locDesc;
    public static String[] locOp1;
    public static String[] locOp2;
    public static int[] locModel;
    public static int[] locWidth;
    public static int[] locHeight;
    public static int[] locType;
    public static int[] locElevation;
    public static int boundary;
    public static String[] boundaryName;
    public static String[] boundaryDesc;
    public static String[] boundaryOp1;
    public static String[] boundaryOp2;
    public static int[] boundaryHeight;
    public static int[] boundaryTextureFront;
    public static int[] boundaryTextureBack;
    public static int[] boundaryAdjacent;
    public static int[] boundaryInvisible;
    public static int roofCount;
    public static int[] roofHeight;
    public static int[] roofFills;
    public static int tileCount;
    public static int[] tileDecoration;
    public static int[] tileType;
    public static int[] tileAdjacent;
    public static int projectileSprite;
    public static int spellCount;
    public static String[] spellName;
    public static String[] spellDesc;
    public static int[] spellLevel;
    public static int[] spellRunesRequired;
    public static int[] spellType;
    public static int[][] spellRunesId;
    public static int[][] spellRunesCount;
    public static int prayerCount;
    public static String[] prayerName;
    public static String[] prayerDesc;
    public static int[] prayerLevel;
    public static int[] prayerDrain;
    public static String[] aStringArray511 = new String[5000];
    public static String[] aStringArray512 = new String[5000];
    public static int modelCount;
    public static String[] modelNames = new String[5000];
    public static byte[] string;
    public static byte[] integer;
    public static int stringOffset;
    public static int integerOffset;
    public static int anInt519;

}
