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
	public static int anInt276;

	@OriginalMember(owner = "mudclient!b", name = "o", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray7;

	@OriginalMember(owner = "mudclient!b", name = "p", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray8;

	@OriginalMember(owner = "mudclient!b", name = "q", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray9;

	@OriginalMember(owner = "mudclient!b", name = "r", descriptor = "[I")
	public static int[] anIntArray106;

	@OriginalMember(owner = "mudclient!b", name = "s", descriptor = "[I")
	public static int[] anIntArray107;

	@OriginalMember(owner = "mudclient!b", name = "t", descriptor = "[I")
	public static int[] anIntArray108;

	@OriginalMember(owner = "mudclient!b", name = "u", descriptor = "[I")
	public static int[] anIntArray109;

	@OriginalMember(owner = "mudclient!b", name = "v", descriptor = "[I")
	public static int[] anIntArray110;

	@OriginalMember(owner = "mudclient!b", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray13;

	@OriginalMember(owner = "mudclient!b", name = "x", descriptor = "[I")
	public static int[] anIntArray111;

	@OriginalMember(owner = "mudclient!b", name = "y", descriptor = "[I")
	public static int[] anIntArray112;

	@OriginalMember(owner = "mudclient!b", name = "z", descriptor = "[I")
	public static int[] anIntArray113;

	@OriginalMember(owner = "mudclient!b", name = "A", descriptor = "[I")
	public static int[] anIntArray114;

	@OriginalMember(owner = "mudclient!b", name = "B", descriptor = "[I")
	public static int[] anIntArray115;

	@OriginalMember(owner = "mudclient!b", name = "C", descriptor = "[I")
	public static int[] anIntArray116;

	@OriginalMember(owner = "mudclient!b", name = "D", descriptor = "[I")
	public static int[] anIntArray117;

	@OriginalMember(owner = "mudclient!b", name = "E", descriptor = "[I")
	public static int[] anIntArray118;

	@OriginalMember(owner = "mudclient!b", name = "F", descriptor = "[I")
	public static int[] anIntArray119;

	@OriginalMember(owner = "mudclient!b", name = "G", descriptor = "I")
	public static int anInt277;

	@OriginalMember(owner = "mudclient!b", name = "H", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray10;

	@OriginalMember(owner = "mudclient!b", name = "I", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray11;

	@OriginalMember(owner = "mudclient!b", name = "J", descriptor = "I")
	public static int anInt278;

	@OriginalMember(owner = "mudclient!b", name = "K", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray12;

	@OriginalMember(owner = "mudclient!b", name = "L", descriptor = "[I")
	public static int[] anIntArray120;

	@OriginalMember(owner = "mudclient!b", name = "M", descriptor = "[I")
	public static int[] anIntArray121;

	@OriginalMember(owner = "mudclient!b", name = "N", descriptor = "[I")
	public static int[] anIntArray122;

	@OriginalMember(owner = "mudclient!b", name = "O", descriptor = "[I")
	public static int[] anIntArray123;

	@OriginalMember(owner = "mudclient!b", name = "P", descriptor = "[I")
	public static int[] anIntArray124;

	@OriginalMember(owner = "mudclient!b", name = "Q", descriptor = "I")
	private static int anInt279;

	@OriginalMember(owner = "mudclient!b", name = "R", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray13;

	@OriginalMember(owner = "mudclient!b", name = "S", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray14;

	@OriginalMember(owner = "mudclient!b", name = "T", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray15;

	@OriginalMember(owner = "mudclient!b", name = "U", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray16;

	@OriginalMember(owner = "mudclient!b", name = "V", descriptor = "[I")
	public static int[] anIntArray125;

	@OriginalMember(owner = "mudclient!b", name = "W", descriptor = "[I")
	public static int[] anIntArray126;

	@OriginalMember(owner = "mudclient!b", name = "X", descriptor = "[I")
	public static int[] anIntArray127;

	@OriginalMember(owner = "mudclient!b", name = "Y", descriptor = "[I")
	public static int[] anIntArray128;

	@OriginalMember(owner = "mudclient!b", name = "Z", descriptor = "[I")
	public static int[] anIntArray129;

	@OriginalMember(owner = "mudclient!b", name = "ba", descriptor = "I")
	private static int anInt280;

	@OriginalMember(owner = "mudclient!b", name = "bb", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray17;

	@OriginalMember(owner = "mudclient!b", name = "bc", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray18;

	@OriginalMember(owner = "mudclient!b", name = "bd", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray19;

	@OriginalMember(owner = "mudclient!b", name = "be", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray20;

	@OriginalMember(owner = "mudclient!b", name = "bf", descriptor = "[I")
	public static int[] anIntArray130;

	@OriginalMember(owner = "mudclient!b", name = "bg", descriptor = "[I")
	public static int[] anIntArray131;

	@OriginalMember(owner = "mudclient!b", name = "bh", descriptor = "[I")
	public static int[] anIntArray132;

	@OriginalMember(owner = "mudclient!b", name = "bi", descriptor = "[I")
	public static int[] anIntArray133;

	@OriginalMember(owner = "mudclient!b", name = "bj", descriptor = "[I")
	public static int[] anIntArray134;

	@OriginalMember(owner = "mudclient!b", name = "bk", descriptor = "I")
	private static int anInt281;

	@OriginalMember(owner = "mudclient!b", name = "bl", descriptor = "[I")
	public static int[] anIntArray135;

	@OriginalMember(owner = "mudclient!b", name = "bm", descriptor = "[I")
	public static int[] anIntArray136;

	@OriginalMember(owner = "mudclient!b", name = "bn", descriptor = "I")
	private static int anInt282;

	@OriginalMember(owner = "mudclient!b", name = "bo", descriptor = "[I")
	public static int[] anIntArray137;

	@OriginalMember(owner = "mudclient!b", name = "bp", descriptor = "[I")
	public static int[] anIntArray138;

	@OriginalMember(owner = "mudclient!b", name = "bq", descriptor = "[I")
	public static int[] anIntArray139;

	@OriginalMember(owner = "mudclient!b", name = "br", descriptor = "I")
	public static int anInt283;

	@OriginalMember(owner = "mudclient!b", name = "bs", descriptor = "I")
	public static int anInt284;

	@OriginalMember(owner = "mudclient!b", name = "bt", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray21;

	@OriginalMember(owner = "mudclient!b", name = "bu", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray22;

	@OriginalMember(owner = "mudclient!b", name = "bv", descriptor = "[I")
	public static int[] anIntArray140;

	@OriginalMember(owner = "mudclient!b", name = "bw", descriptor = "[I")
	public static int[] anIntArray141;

	@OriginalMember(owner = "mudclient!b", name = "bx", descriptor = "[I")
	public static int[] anIntArray142;

	@OriginalMember(owner = "mudclient!b", name = "by", descriptor = "[[I")
	public static int[][] anIntArrayArray14;

	@OriginalMember(owner = "mudclient!b", name = "bz", descriptor = "[[I")
	public static int[][] anIntArrayArray15;

	@OriginalMember(owner = "mudclient!b", name = "bA", descriptor = "I")
	public static int anInt285;

	@OriginalMember(owner = "mudclient!b", name = "bB", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray23;

	@OriginalMember(owner = "mudclient!b", name = "bC", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray24;

	@OriginalMember(owner = "mudclient!b", name = "bD", descriptor = "[I")
	public static int[] anIntArray143;

	@OriginalMember(owner = "mudclient!b", name = "bE", descriptor = "[I")
	public static int[] anIntArray144;

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

		anInt276 = g2();
		aStringArray7 = new String[anInt276];
		aStringArray8 = new String[anInt276];
		aStringArray9 = new String[anInt276];
		anIntArray106 = new int[anInt276];
		anIntArray107 = new int[anInt276];
		anIntArray108 = new int[anInt276];
		anIntArray109 = new int[anInt276];
		anIntArray110 = new int[anInt276];
		anIntArrayArray13 = new int[anInt276][12];
		anIntArray111 = new int[anInt276];
		anIntArray112 = new int[anInt276];
		anIntArray113 = new int[anInt276];
		anIntArray114 = new int[anInt276];
		anIntArray115 = new int[anInt276];
		anIntArray116 = new int[anInt276];
		anIntArray117 = new int[anInt276];
		anIntArray118 = new int[anInt276];
		anIntArray119 = new int[anInt276];

		for (@Pc(298) int local298 = 0; local298 < anInt276; local298++) {
			aStringArray7[local298] = gjstr();
		}

		for (@Pc(310) int local310 = 0; local310 < anInt276; local310++) {
			aStringArray8[local310] = gjstr();
		}

		for (@Pc(322) int local322 = 0; local322 < anInt276; local322++) {
			anIntArray106[local322] = g1();
		}

		for (@Pc(334) int local334 = 0; local334 < anInt276; local334++) {
			anIntArray107[local334] = g1();
		}

		for (@Pc(346) int local346 = 0; local346 < anInt276; local346++) {
			anIntArray108[local346] = g1();
		}

		for (@Pc(358) int local358 = 0; local358 < anInt276; local358++) {
			anIntArray109[local358] = g1();
		}

		for (@Pc(370) int local370 = 0; local370 < anInt276; local370++) {
			anIntArray110[local370] = g1();
		}

		@Pc(386) int local386;
		for (@Pc(382) int local382 = 0; local382 < anInt276; local382++) {
			for (local386 = 0; local386 < 12; local386++) {
				anIntArrayArray13[local382][local386] = g1();
				if (anIntArrayArray13[local382][local386] == 255) {
					anIntArrayArray13[local382][local386] = -1;
				}
			}
		}

		for (local386 = 0; local386 < anInt276; local386++) {
			anIntArray111[local386] = g4();
		}

		for (@Pc(429) int local429 = 0; local429 < anInt276; local429++) {
			anIntArray112[local429] = g4();
		}

		for (@Pc(441) int local441 = 0; local441 < anInt276; local441++) {
			anIntArray113[local441] = g4();
		}

		for (@Pc(453) int local453 = 0; local453 < anInt276; local453++) {
			anIntArray114[local453] = g4();
		}

		for (@Pc(465) int local465 = 0; local465 < anInt276; local465++) {
			anIntArray115[local465] = g2();
		}

		for (@Pc(477) int local477 = 0; local477 < anInt276; local477++) {
			anIntArray116[local477] = g2();
		}

		for (@Pc(489) int local489 = 0; local489 < anInt276; local489++) {
			anIntArray117[local489] = g1();
		}

		for (@Pc(501) int local501 = 0; local501 < anInt276; local501++) {
			anIntArray118[local501] = g1();
		}

		for (@Pc(513) int local513 = 0; local513 < anInt276; local513++) {
			anIntArray119[local513] = g1();
		}

		for (@Pc(525) int local525 = 0; local525 < anInt276; local525++) {
			aStringArray9[local525] = gjstr();
		}

		anInt277 = g2();
		aStringArray10 = new String[anInt277];
		aStringArray11 = new String[anInt277];

		for (@Pc(545) int local545 = 0; local545 < anInt277; local545++) {
			aStringArray10[local545] = gjstr();
		}

		for (@Pc(557) int local557 = 0; local557 < anInt277; local557++) {
			aStringArray11[local557] = gjstr();
		}

		anInt278 = g2();
		aStringArray12 = new String[anInt278];
		anIntArray120 = new int[anInt278];
		anIntArray121 = new int[anInt278];
		anIntArray122 = new int[anInt278];
		anIntArray123 = new int[anInt278];
		anIntArray124 = new int[anInt278];

		for (@Pc(589) int local589 = 0; local589 < anInt278; local589++) {
			aStringArray12[local589] = gjstr();
		}

		for (@Pc(601) int local601 = 0; local601 < anInt278; local601++) {
			anIntArray120[local601] = g4();
		}

		for (@Pc(613) int local613 = 0; local613 < anInt278; local613++) {
			anIntArray121[local613] = g1();
		}

		for (@Pc(625) int local625 = 0; local625 < anInt278; local625++) {
			anIntArray122[local625] = g1();
		}

		for (@Pc(637) int local637 = 0; local637 < anInt278; local637++) {
			anIntArray123[local637] = g1();
		}

		for (@Pc(649) int local649 = 0; local649 < anInt278; local649++) {
			anIntArray124[local649] = g1();
		}

		anInt279 = g2();
		aStringArray13 = new String[anInt279];
		aStringArray14 = new String[anInt279];
		aStringArray15 = new String[anInt279];
		aStringArray16 = new String[anInt279];
		anIntArray125 = new int[anInt279];
		anIntArray126 = new int[anInt279];
		anIntArray127 = new int[anInt279];
		anIntArray128 = new int[anInt279];
		anIntArray129 = new int[anInt279];

		for (@Pc(690) int local690 = 0; local690 < anInt279; local690++) {
			aStringArray13[local690] = gjstr();
		}

		for (@Pc(702) int local702 = 0; local702 < anInt279; local702++) {
			aStringArray14[local702] = gjstr();
		}

		for (@Pc(714) int local714 = 0; local714 < anInt279; local714++) {
			aStringArray15[local714] = gjstr();
		}

		for (@Pc(726) int local726 = 0; local726 < anInt279; local726++) {
			aStringArray16[local726] = gjstr();
		}

		for (@Pc(738) int local738 = 0; local738 < anInt279; local738++) {
			anIntArray125[local738] = getModelId(gjstr());
		}

		for (@Pc(751) int local751 = 0; local751 < anInt279; local751++) {
			anIntArray126[local751] = g1();
		}

		for (@Pc(763) int local763 = 0; local763 < anInt279; local763++) {
			anIntArray127[local763] = g1();
		}

		for (@Pc(775) int local775 = 0; local775 < anInt279; local775++) {
			anIntArray128[local775] = g1();
		}

		for (@Pc(787) int local787 = 0; local787 < anInt279; local787++) {
			anIntArray129[local787] = g1();
		}

		anInt280 = g2();
		aStringArray17 = new String[anInt280];
		aStringArray18 = new String[anInt280];
		aStringArray19 = new String[anInt280];
		aStringArray20 = new String[anInt280];
		anIntArray130 = new int[anInt280];
		anIntArray131 = new int[anInt280];
		anIntArray132 = new int[anInt280];
		anIntArray133 = new int[anInt280];
		anIntArray134 = new int[anInt280];

		for (@Pc(828) int local828 = 0; local828 < anInt280; local828++) {
			aStringArray17[local828] = gjstr();
		}

		for (@Pc(840) int local840 = 0; local840 < anInt280; local840++) {
			aStringArray18[local840] = gjstr();
		}

		for (@Pc(852) int local852 = 0; local852 < anInt280; local852++) {
			aStringArray19[local852] = gjstr();
		}

		for (@Pc(864) int local864 = 0; local864 < anInt280; local864++) {
			aStringArray20[local864] = gjstr();
		}

		for (@Pc(876) int local876 = 0; local876 < anInt280; local876++) {
			anIntArray130[local876] = g2();
		}

		for (@Pc(888) int local888 = 0; local888 < anInt280; local888++) {
			anIntArray131[local888] = g4();
		}

		for (@Pc(900) int local900 = 0; local900 < anInt280; local900++) {
			anIntArray132[local900] = g4();
		}

		for (@Pc(912) int local912 = 0; local912 < anInt280; local912++) {
			anIntArray133[local912] = g1();
		}

		for (@Pc(924) int local924 = 0; local924 < anInt280; local924++) {
			anIntArray134[local924] = g1();
		}

		anInt281 = g2();
		anIntArray135 = new int[anInt281];
		anIntArray136 = new int[anInt281];

		for (@Pc(944) int local944 = 0; local944 < anInt281; local944++) {
			anIntArray135[local944] = g1();
		}

		for (@Pc(956) int local956 = 0; local956 < anInt281; local956++) {
			anIntArray136[local956] = g1();
		}

		anInt282 = g2();
		anIntArray137 = new int[anInt282];
		anIntArray138 = new int[anInt282];
		anIntArray139 = new int[anInt282];

		for (@Pc(979) int local979 = 0; local979 < anInt282; local979++) {
			anIntArray137[local979] = g4();
		}

		for (@Pc(991) int local991 = 0; local991 < anInt282; local991++) {
			anIntArray138[local991] = g1();
		}

		for (@Pc(1003) int local1003 = 0; local1003 < anInt282; local1003++) {
			anIntArray139[local1003] = g1();
		}

		anInt283 = g2();
		anInt284 = g2();
		aStringArray21 = new String[anInt284];
		aStringArray22 = new String[anInt284];
		anIntArray140 = new int[anInt284];
		anIntArray141 = new int[anInt284];
		anIntArray142 = new int[anInt284];
		anIntArrayArray14 = new int[anInt284][];
		anIntArrayArray15 = new int[anInt284][];

		for (@Pc(1040) int local1040 = 0; local1040 < anInt284; local1040++) {
			aStringArray21[local1040] = gjstr();
		}

		for (@Pc(1052) int local1052 = 0; local1052 < anInt284; local1052++) {
			aStringArray22[local1052] = gjstr();
		}

		for (@Pc(1064) int local1064 = 0; local1064 < anInt284; local1064++) {
			anIntArray140[local1064] = g1();
		}

		for (@Pc(1076) int local1076 = 0; local1076 < anInt284; local1076++) {
			anIntArray141[local1076] = g1();
		}

		for (@Pc(1088) int local1088 = 0; local1088 < anInt284; local1088++) {
			anIntArray142[local1088] = g1();
		}

		@Pc(1104) int local1104;
		@Pc(1111) int local1111;
		for (@Pc(1100) int local1100 = 0; local1100 < anInt284; local1100++) {
			local1104 = g1();
			anIntArrayArray14[local1100] = new int[local1104];
			for (local1111 = 0; local1111 < local1104; local1111++) {
				anIntArrayArray14[local1100][local1111] = g2();
			}
		}

		@Pc(1140) int local1140;
		for (local1104 = 0; local1104 < anInt284; local1104++) {
			local1111 = g1();
			anIntArrayArray15[local1104] = new int[local1111];
			for (local1140 = 0; local1140 < local1111; local1140++) {
				anIntArrayArray15[local1104][local1140] = g1();
			}
		}

		anInt285 = g2();
		aStringArray23 = new String[anInt285];
		aStringArray24 = new String[anInt285];
		anIntArray143 = new int[anInt285];
		anIntArray144 = new int[anInt285];

		for (local1111 = 0; local1111 < anInt285; local1111++) {
			aStringArray23[local1111] = gjstr();
		}

		for (local1140 = 0; local1140 < anInt285; local1140++) {
			aStringArray24[local1140] = gjstr();
		}

		for (@Pc(1196) int local1196 = 0; local1196 < anInt285; local1196++) {
			anIntArray143[local1196] = g1();
		}

		for (@Pc(1208) int local1208 = 0; local1208 < anInt285; local1208++) {
			anIntArray144[local1208] = g1();
		}

		stringData = null;
		integerData = null;
	}
}
