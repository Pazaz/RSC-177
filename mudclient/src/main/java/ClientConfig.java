import jagex.Tools;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("mudclient!b")
public final class ClientConfig {

	@OriginalMember(owner = "mudclient!b", name = "a", descriptor = "I")
	private static int objCount;

	@OriginalMember(owner = "mudclient!b", name = "b", descriptor = "I")
	public static int objSpriteCount;

	@OriginalMember(owner = "mudclient!b", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] objName;

	@OriginalMember(owner = "mudclient!b", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] objDesc;

	@OriginalMember(owner = "mudclient!b", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] objOption;

	@OriginalMember(owner = "mudclient!b", name = "f", descriptor = "[I")
	public static int[] objSprite;

	@OriginalMember(owner = "mudclient!b", name = "g", descriptor = "[I")
	public static int[] objCost;

	@OriginalMember(owner = "mudclient!b", name = "h", descriptor = "[I")
	public static int[] objStackable;

	// used in beads of the dead (852)? not referenced in client
	@OriginalMember(owner = "mudclient!b", name = "i", descriptor = "[I")
	private static int[] objUnknown;

	@OriginalMember(owner = "mudclient!b", name = "j", descriptor = "[I")
	public static int[] objWearType;

	@OriginalMember(owner = "mudclient!b", name = "k", descriptor = "[I")
	public static int[] objSpriteMask;

	@OriginalMember(owner = "mudclient!b", name = "l", descriptor = "[I")
	public static int[] objUntradeable;

	@OriginalMember(owner = "mudclient!b", name = "m", descriptor = "[I")
	private static int[] objMembers;

	@OriginalMember(owner = "mudclient!b", name = "n", descriptor = "I")
	public static int npcCount;

	@OriginalMember(owner = "mudclient!b", name = "o", descriptor = "[Ljava/lang/String;")
	public static String[] npcName;

	@OriginalMember(owner = "mudclient!b", name = "p", descriptor = "[Ljava/lang/String;")
	public static String[] npcDesc;

	@OriginalMember(owner = "mudclient!b", name = "q", descriptor = "[Ljava/lang/String;")
	public static String[] npcOption;

	@OriginalMember(owner = "mudclient!b", name = "r", descriptor = "[I")
	public static int[] npcAttack;

	@OriginalMember(owner = "mudclient!b", name = "s", descriptor = "[I")
	public static int[] npcStrength;

	@OriginalMember(owner = "mudclient!b", name = "t", descriptor = "[I")
	public static int[] npcHits;

	@OriginalMember(owner = "mudclient!b", name = "u", descriptor = "[I")
	public static int[] npcDefense;

	@OriginalMember(owner = "mudclient!b", name = "v", descriptor = "[I")
	public static int[] npcAttackable;

	@OriginalMember(owner = "mudclient!b", name = "w", descriptor = "[[I")
	public static int[][] npcSprites;

	@OriginalMember(owner = "mudclient!b", name = "x", descriptor = "[I")
	public static int[] npcHairColor;

	@OriginalMember(owner = "mudclient!b", name = "y", descriptor = "[I")
	public static int[] npcTopColor;

	@OriginalMember(owner = "mudclient!b", name = "z", descriptor = "[I")
	public static int[] npcBottomColor;

	@OriginalMember(owner = "mudclient!b", name = "A", descriptor = "[I")
	public static int[] npcSkinColor;

	@OriginalMember(owner = "mudclient!b", name = "B", descriptor = "[I")
	public static int[] npcWidth;

	@OriginalMember(owner = "mudclient!b", name = "C", descriptor = "[I")
	public static int[] npcLength;

	@OriginalMember(owner = "mudclient!b", name = "D", descriptor = "[I")
	public static int[] npcWalkSpeed;

	@OriginalMember(owner = "mudclient!b", name = "E", descriptor = "[I")
	public static int[] npcCombatSpeed;

	@OriginalMember(owner = "mudclient!b", name = "F", descriptor = "[I")
	public static int[] npcCombatWidth;

	@OriginalMember(owner = "mudclient!b", name = "G", descriptor = "I")
	public static int textureCount;

	@OriginalMember(owner = "mudclient!b", name = "H", descriptor = "[Ljava/lang/String;")
	public static String[] textureName;

	@OriginalMember(owner = "mudclient!b", name = "I", descriptor = "[Ljava/lang/String;")
	public static String[] textureSubName;

	@OriginalMember(owner = "mudclient!b", name = "J", descriptor = "I")
	public static int animationCount;

	@OriginalMember(owner = "mudclient!b", name = "K", descriptor = "[Ljava/lang/String;")
	public static String[] animationName;

	@OriginalMember(owner = "mudclient!b", name = "L", descriptor = "[I")
	public static int[] animationColor;

	@OriginalMember(owner = "mudclient!b", name = "M", descriptor = "[I")
	public static int[] animationGender;

	@OriginalMember(owner = "mudclient!b", name = "N", descriptor = "[I")
	public static int[] animatonHasA;

	@OriginalMember(owner = "mudclient!b", name = "O", descriptor = "[I")
	public static int[] animationHasF;

	@OriginalMember(owner = "mudclient!b", name = "P", descriptor = "[I")
	public static int[] animationFileId;

	@OriginalMember(owner = "mudclient!b", name = "Q", descriptor = "I")
	private static int locCount;

	@OriginalMember(owner = "mudclient!b", name = "R", descriptor = "[Ljava/lang/String;")
	public static String[] locName;

	@OriginalMember(owner = "mudclient!b", name = "S", descriptor = "[Ljava/lang/String;")
	public static String[] locDesc;

	@OriginalMember(owner = "mudclient!b", name = "T", descriptor = "[Ljava/lang/String;")
	public static String[] locOption1;

	@OriginalMember(owner = "mudclient!b", name = "U", descriptor = "[Ljava/lang/String;")
	public static String[] locOption2;

	@OriginalMember(owner = "mudclient!b", name = "V", descriptor = "[I")
	public static int[] locModel;

	@OriginalMember(owner = "mudclient!b", name = "W", descriptor = "[I")
	public static int[] locWidth;

	@OriginalMember(owner = "mudclient!b", name = "X", descriptor = "[I")
	public static int[] locLength;

	@OriginalMember(owner = "mudclient!b", name = "Y", descriptor = "[I")
	public static int[] locType;

	@OriginalMember(owner = "mudclient!b", name = "Z", descriptor = "[I")
	public static int[] locElevation;

	@OriginalMember(owner = "mudclient!b", name = "ba", descriptor = "I")
	private static int boundCount;

	@OriginalMember(owner = "mudclient!b", name = "bb", descriptor = "[Ljava/lang/String;")
	public static String[] boundName;

	@OriginalMember(owner = "mudclient!b", name = "bc", descriptor = "[Ljava/lang/String;")
	public static String[] boundDesc;

	@OriginalMember(owner = "mudclient!b", name = "bd", descriptor = "[Ljava/lang/String;")
	public static String[] boundOption1;

	@OriginalMember(owner = "mudclient!b", name = "be", descriptor = "[Ljava/lang/String;")
	public static String[] boundOption2;

	@OriginalMember(owner = "mudclient!b", name = "bf", descriptor = "[I")
	public static int[] boundHeight;

	@OriginalMember(owner = "mudclient!b", name = "bg", descriptor = "[I")
	public static int[] boundFrontMask;

	@OriginalMember(owner = "mudclient!b", name = "bh", descriptor = "[I")
	public static int[] boundBackMask;

	@OriginalMember(owner = "mudclient!b", name = "bi", descriptor = "[I")
	public static int[] boundBlockWalk;

	@OriginalMember(owner = "mudclient!b", name = "bj", descriptor = "[I")
	public static int[] boundActive;

	@OriginalMember(owner = "mudclient!b", name = "bk", descriptor = "I")
	private static int roofCount;

	@OriginalMember(owner = "mudclient!b", name = "bl", descriptor = "[I")
	public static int[] roofHeight;

	@OriginalMember(owner = "mudclient!b", name = "bm", descriptor = "[I")
	public static int[] roofFill;

	@OriginalMember(owner = "mudclient!b", name = "bn", descriptor = "I")
	private static int decorCount;

	@OriginalMember(owner = "mudclient!b", name = "bo", descriptor = "[I")
	public static int[] decorFill;

	@OriginalMember(owner = "mudclient!b", name = "bp", descriptor = "[I")
	public static int[] decorType;

	@OriginalMember(owner = "mudclient!b", name = "bq", descriptor = "[I")
	public static int[] decorBlockWalk;

	@OriginalMember(owner = "mudclient!b", name = "br", descriptor = "I")
	public static int projectileSpriteCount;

	@OriginalMember(owner = "mudclient!b", name = "bs", descriptor = "I")
	public static int spellCount;

	@OriginalMember(owner = "mudclient!b", name = "bt", descriptor = "[Ljava/lang/String;")
	public static String[] spellName;

	@OriginalMember(owner = "mudclient!b", name = "bu", descriptor = "[Ljava/lang/String;")
	public static String[] spellDesc;

	@OriginalMember(owner = "mudclient!b", name = "bv", descriptor = "[I")
	public static int[] spellLevel;

	@OriginalMember(owner = "mudclient!b", name = "bw", descriptor = "[I")
	public static int[] spellRunesRequired;

	@OriginalMember(owner = "mudclient!b", name = "bx", descriptor = "[I")
	public static int[] spellType;

	@OriginalMember(owner = "mudclient!b", name = "by", descriptor = "[[I")
	public static int[][] spellRunes;

	@OriginalMember(owner = "mudclient!b", name = "bz", descriptor = "[[I")
	public static int[][] spellRunesCount;

	@OriginalMember(owner = "mudclient!b", name = "bA", descriptor = "I")
	public static int prayerCount;

	@OriginalMember(owner = "mudclient!b", name = "bB", descriptor = "[Ljava/lang/String;")
	public static String[] prayerName;

	@OriginalMember(owner = "mudclient!b", name = "bC", descriptor = "[Ljava/lang/String;")
	public static String[] prayerDesc;

	@OriginalMember(owner = "mudclient!b", name = "bD", descriptor = "[I")
	public static int[] prayerLevel;

	@OriginalMember(owner = "mudclient!b", name = "bE", descriptor = "[I")
	public static int[] prayerDrain;

	@OriginalMember(owner = "mudclient!b", name = "bH", descriptor = "I")
	public static int modelCount;

	@OriginalMember(owner = "mudclient!b", name = "bJ", descriptor = "[B")
	private static byte[] stringData;

	@OriginalMember(owner = "mudclient!b", name = "bK", descriptor = "[B")
	private static byte[] integerData;

	@OriginalMember(owner = "mudclient!b", name = "bL", descriptor = "I")
	private static int stringPos;

	@OriginalMember(owner = "mudclient!b", name = "bM", descriptor = "I")
	private static int integerPos;

	@OriginalMember(owner = "mudclient!b", name = "bF", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray25 = new String[5000];

	@OriginalMember(owner = "mudclient!b", name = "bG", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray26 = new String[5000];

	@OriginalMember(owner = "mudclient!b", name = "bI", descriptor = "[Ljava/lang/String;")
	public static String[] models = new String[5000];

	@OriginalMember(owner = "mudclient!b", name = "a", descriptor = "(Ljava/lang/String;)I")
	public static int getModelId(@OriginalArg(0) String name) {
		if (name.equalsIgnoreCase("na")) {
			return 0;
		}

		for (@Pc(7) int i = 0; i < modelCount; i++) {
			if (models[i].equalsIgnoreCase(name)) {
				return i;
			}
		}

		models[modelCount++] = name;
		return modelCount - 1;
	}

	@OriginalMember(owner = "mudclient!b", name = "a", descriptor = "()I")
	private static int g1() {
		@Pc(5) int value = integerData[integerPos] & 0xFF;
		integerPos++;
		return value;
	}

	@OriginalMember(owner = "mudclient!b", name = "b", descriptor = "()I")
	private static int g2() {
		@Pc(3) int value = Tools.g2(integerData, integerPos);
		integerPos += 2;
		return value;
	}

	@OriginalMember(owner = "mudclient!b", name = "c", descriptor = "()I")
	private static int g4() {
		@Pc(3) int value = Tools.g4(integerData, integerPos);
		integerPos += 4;
		if (value > 99999999) {
			value = 99999999 - value;
		}
		return value;
	}

	@OriginalMember(owner = "mudclient!b", name = "d", descriptor = "()Ljava/lang/String;")
	private static String gjstr() {
		@Pc(1) String str = "";
		while (stringData[stringPos] != 0) {
			str = str + (char) stringData[stringPos++];
		}
		stringPos++;
		return str;
	}

	@OriginalMember(owner = "mudclient!b", name = "a", descriptor = "([BZ)V")
	public static void method359(@OriginalArg(0) byte[] src, @OriginalArg(1) boolean members) {
		stringData = Tools.readJag("string.dat", 0, src);
		stringPos = 0;

		integerData = Tools.readJag("integer.dat", 0, src);
		integerPos = 0;

		objCount = g2();
		objName = new String[objCount];
		objDesc = new String[objCount];
		objOption = new String[objCount];
		objSprite = new int[objCount];
		objCost = new int[objCount];
		objStackable = new int[objCount];
		objUnknown = new int[objCount];
		objWearType = new int[objCount];
		objSpriteMask = new int[objCount];
		objUntradeable = new int[objCount];
		objMembers = new int[objCount];

		for (@Pc(52) int i = 0; i < objCount; i++) {
			objName[i] = gjstr();
		}

		for (@Pc(64) int i = 0; i < objCount; i++) {
			objDesc[i] = gjstr();
		}

		for (@Pc(76) int i = 0; i < objCount; i++) {
			objOption[i] = gjstr();
		}

		for (@Pc(88) int i = 0; i < objCount; i++) {
			objSprite[i] = g2();

			if (objSprite[i] + 1 > objSpriteCount) {
				objSpriteCount = objSprite[i] + 1;
			}
		}

		for (@Pc(113) int i = 0; i < objCount; i++) {
			objCost[i] = g4();
		}

		for (@Pc(125) int i = 0; i < objCount; i++) {
			objStackable[i] = g1();
		}

		for (@Pc(137) int i = 0; i < objCount; i++) {
			objUnknown[i] = g1();
		}

		for (@Pc(149) int i = 0; i < objCount; i++) {
			objWearType[i] = g2();
		}

		for (@Pc(161) int i = 0; i < objCount; i++) {
			objSpriteMask[i] = g4();
		}

		for (@Pc(173) int i = 0; i < objCount; i++) {
			objUntradeable[i] = g1();
		}

		for (@Pc(185) int i = 0; i < objCount; i++) {
			objMembers[i] = g1();
		}

		for (@Pc(197) int i = 0; i < objCount; i++) {
			if (!members && objMembers[i] == 1) {
				objName[i] = "Members object";
				objDesc[i] = "You need to be a member to use this object";
				objCost[i] = 0;
				objOption[i] = "";
				objUnknown[0] = 0;
				objWearType[i] = 0;
				objUntradeable[i] = 1;
			}
		}

		npcCount = g2();
		npcName = new String[npcCount];
		npcDesc = new String[npcCount];
		npcOption = new String[npcCount];
		npcAttack = new int[npcCount];
		npcStrength = new int[npcCount];
		npcHits = new int[npcCount];
		npcDefense = new int[npcCount];
		npcAttackable = new int[npcCount];
		npcSprites = new int[npcCount][12];
		npcHairColor = new int[npcCount];
		npcTopColor = new int[npcCount];
		npcBottomColor = new int[npcCount];
		npcSkinColor = new int[npcCount];
		npcWidth = new int[npcCount];
		npcLength = new int[npcCount];
		npcWalkSpeed = new int[npcCount];
		npcCombatSpeed = new int[npcCount];
		npcCombatWidth = new int[npcCount];

		for (@Pc(298) int i = 0; i < npcCount; i++) {
			npcName[i] = gjstr();
		}

		for (@Pc(310) int i = 0; i < npcCount; i++) {
			npcDesc[i] = gjstr();
		}

		for (@Pc(322) int i = 0; i < npcCount; i++) {
			npcAttack[i] = g1();
		}

		for (@Pc(334) int i = 0; i < npcCount; i++) {
			npcStrength[i] = g1();
		}

		for (@Pc(346) int i = 0; i < npcCount; i++) {
			npcHits[i] = g1();
		}

		for (@Pc(358) int i = 0; i < npcCount; i++) {
			npcDefense[i] = g1();
		}

		for (@Pc(370) int i = 0; i < npcCount; i++) {
			npcAttackable[i] = g1();
		}

		for (@Pc(382) int i = 0; i < npcCount; i++) {
			for (int j = 0; j < 12; j++) {
				npcSprites[i][j] = g1();

				if (npcSprites[i][j] == 255) {
					npcSprites[i][j] = -1;
				}
			}
		}

		for (int i = 0; i < npcCount; i++) {
			npcHairColor[i] = g4();
		}

		for (@Pc(429) int i = 0; i < npcCount; i++) {
			npcTopColor[i] = g4();
		}

		for (@Pc(441) int i = 0; i < npcCount; i++) {
			npcBottomColor[i] = g4();
		}

		for (@Pc(453) int i = 0; i < npcCount; i++) {
			npcSkinColor[i] = g4();
		}

		for (@Pc(465) int i = 0; i < npcCount; i++) {
			npcWidth[i] = g2();
		}

		for (@Pc(477) int i = 0; i < npcCount; i++) {
			npcLength[i] = g2();
		}

		for (@Pc(489) int i = 0; i < npcCount; i++) {
			npcWalkSpeed[i] = g1();
		}

		for (@Pc(501) int i = 0; i < npcCount; i++) {
			npcCombatSpeed[i] = g1();
		}

		for (@Pc(513) int i = 0; i < npcCount; i++) {
			npcCombatWidth[i] = g1();
		}

		for (@Pc(525) int i = 0; i < npcCount; i++) {
			npcOption[i] = gjstr();
		}

		textureCount = g2();
		textureName = new String[textureCount];
		textureSubName = new String[textureCount];

		for (@Pc(545) int i = 0; i < textureCount; i++) {
			textureName[i] = gjstr();
		}

		for (@Pc(557) int i = 0; i < textureCount; i++) {
			textureSubName[i] = gjstr();
		}

		animationCount = g2();
		animationName = new String[animationCount];
		animationColor = new int[animationCount];
		animationGender = new int[animationCount];
		animatonHasA = new int[animationCount];
		animationHasF = new int[animationCount];
		animationFileId = new int[animationCount];

		for (@Pc(589) int i = 0; i < animationCount; i++) {
			animationName[i] = gjstr();
		}

		for (@Pc(601) int i = 0; i < animationCount; i++) {
			animationColor[i] = g4();
		}

		for (@Pc(613) int i = 0; i < animationCount; i++) {
			animationGender[i] = g1();
		}

		for (@Pc(625) int i = 0; i < animationCount; i++) {
			animatonHasA[i] = g1();
		}

		for (@Pc(637) int i = 0; i < animationCount; i++) {
			animationHasF[i] = g1();
		}

		for (@Pc(649) int i = 0; i < animationCount; i++) {
			animationFileId[i] = g1();
		}

		locCount = g2();
		locName = new String[locCount];
		locDesc = new String[locCount];
		locOption1 = new String[locCount];
		locOption2 = new String[locCount];
		locModel = new int[locCount];
		locWidth = new int[locCount];
		locLength = new int[locCount];
		locType = new int[locCount];
		locElevation = new int[locCount];

		for (@Pc(690) int i = 0; i < locCount; i++) {
			locName[i] = gjstr();
		}

		for (@Pc(702) int i = 0; i < locCount; i++) {
			locDesc[i] = gjstr();
		}

		for (@Pc(714) int i = 0; i < locCount; i++) {
			locOption1[i] = gjstr();
		}

		for (@Pc(726) int i = 0; i < locCount; i++) {
			locOption2[i] = gjstr();
		}

		for (@Pc(738) int i = 0; i < locCount; i++) {
			locModel[i] = getModelId(gjstr());
		}

		for (@Pc(751) int i = 0; i < locCount; i++) {
			locWidth[i] = g1();
		}

		for (@Pc(763) int i = 0; i < locCount; i++) {
			locLength[i] = g1();
		}

		for (@Pc(775) int i = 0; i < locCount; i++) {
			locType[i] = g1();
		}

		for (@Pc(787) int i = 0; i < locCount; i++) {
			locElevation[i] = g1();
		}

		boundCount = g2();
		boundName = new String[boundCount];
		boundDesc = new String[boundCount];
		boundOption1 = new String[boundCount];
		boundOption2 = new String[boundCount];
		boundHeight = new int[boundCount];
		boundFrontMask = new int[boundCount];
		boundBackMask = new int[boundCount];
		boundBlockWalk = new int[boundCount];
		boundActive = new int[boundCount];

		for (@Pc(828) int i = 0; i < boundCount; i++) {
			boundName[i] = gjstr();
		}

		for (@Pc(840) int i = 0; i < boundCount; i++) {
			boundDesc[i] = gjstr();
		}

		for (@Pc(852) int i = 0; i < boundCount; i++) {
			boundOption1[i] = gjstr();
		}

		for (@Pc(864) int i = 0; i < boundCount; i++) {
			boundOption2[i] = gjstr();
		}

		for (@Pc(876) int i = 0; i < boundCount; i++) {
			boundHeight[i] = g2();
		}

		for (@Pc(888) int i = 0; i < boundCount; i++) {
			boundFrontMask[i] = g4();
		}

		for (@Pc(900) int i = 0; i < boundCount; i++) {
			boundBackMask[i] = g4();
		}

		for (@Pc(912) int i = 0; i < boundCount; i++) {
			boundBlockWalk[i] = g1();
		}

		for (@Pc(924) int i = 0; i < boundCount; i++) {
			boundActive[i] = g1();
		}

		roofCount = g2();
		roofHeight = new int[roofCount];
		roofFill = new int[roofCount];

		for (@Pc(944) int i = 0; i < roofCount; i++) {
			roofHeight[i] = g1();
		}

		for (@Pc(956) int i = 0; i < roofCount; i++) {
			roofFill[i] = g1();
		}

		decorCount = g2();
		decorFill = new int[decorCount];
		decorType = new int[decorCount];
		decorBlockWalk = new int[decorCount];

		for (@Pc(979) int i = 0; i < decorCount; i++) {
			decorFill[i] = g4();
		}

		for (@Pc(991) int i = 0; i < decorCount; i++) {
			decorType[i] = g1();
		}

		for (@Pc(1003) int i = 0; i < decorCount; i++) {
			decorBlockWalk[i] = g1();
		}

		projectileSpriteCount = g2();

		spellCount = g2();
		spellName = new String[spellCount];
		spellDesc = new String[spellCount];
		spellLevel = new int[spellCount];
		spellRunesRequired = new int[spellCount];
		spellType = new int[spellCount];
		spellRunes = new int[spellCount][];
		spellRunesCount = new int[spellCount][];

		for (@Pc(1040) int i = 0; i < spellCount; i++) {
			spellName[i] = gjstr();
		}

		for (@Pc(1052) int i = 0; i < spellCount; i++) {
			spellDesc[i] = gjstr();
		}

		for (@Pc(1064) int i = 0; i < spellCount; i++) {
			spellLevel[i] = g1();
		}

		for (@Pc(1076) int i = 0; i < spellCount; i++) {
			spellRunesRequired[i] = g1();
		}

		for (@Pc(1088) int i = 0; i < spellCount; i++) {
			spellType[i] = g1();
		}

		for (@Pc(1100) int i = 0; i < spellCount; i++) {
			int count = g1();
			spellRunes[i] = new int[count];

			for (int j = 0; j < count; j++) {
				spellRunes[i][j] = g2();
			}
		}

		for (int i = 0; i < spellCount; i++) {
			int count = g1();
			spellRunesCount[i] = new int[count];

			for (int j = 0; j < count; j++) {
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

		for (@Pc(1196) int i = 0; i < prayerCount; i++) {
			prayerLevel[i] = g1();
		}

		for (@Pc(1208) int i = 0; i < prayerCount; i++) {
			prayerDrain[i] = g1();
		}

		stringData = null;
		integerData = null;
	}
}
