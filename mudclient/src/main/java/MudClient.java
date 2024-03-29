import jagex.*;
import jagex.client.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@OriginalClass("mudclient!mudclient")
public final class MudClient extends Client {

	@OriginalMember(owner = "mudclient!mudclient", name = "bx", descriptor = "I")
	private int anInt372;

	@OriginalMember(owner = "mudclient!mudclient", name = "bz", descriptor = "I")
	private int anInt374;

	@OriginalMember(owner = "mudclient!mudclient", name = "bD", descriptor = "I")
	private int anInt376;

	@OriginalMember(owner = "mudclient!mudclient", name = "bG", descriptor = "I")
	private int anInt377;

	@OriginalMember(owner = "mudclient!mudclient", name = "bI", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "mudclient!mudclient", name = "bK", descriptor = "I")
	private int anInt381;

	@OriginalMember(owner = "mudclient!mudclient", name = "bL", descriptor = "I")
	private int anInt382;

	@OriginalMember(owner = "mudclient!mudclient", name = "bM", descriptor = "Ljava/awt/Graphics;")
	private Graphics aGraphics5;

	@OriginalMember(owner = "mudclient!mudclient", name = "bN", descriptor = "Lmudclient!a/a/j;")
	private World3D world3D;

	@OriginalMember(owner = "mudclient!mudclient", name = "bO", descriptor = "Lmudclient!d;")
	private MudPix drawArea;

	@OriginalMember(owner = "mudclient!mudclient", name = "bQ", descriptor = "I")
	private int anInt384;

	@OriginalMember(owner = "mudclient!mudclient", name = "bU", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "mudclient!mudclient", name = "bV", descriptor = "I")
	private int anInt389;

	@OriginalMember(owner = "mudclient!mudclient", name = "bW", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "mudclient!mudclient", name = "bX", descriptor = "I")
	private int anInt391;

	@OriginalMember(owner = "mudclient!mudclient", name = "bY", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "mudclient!mudclient", name = "bZ", descriptor = "I")
	private int anInt393;

	@OriginalMember(owner = "mudclient!mudclient", name = "ca", descriptor = "I")
	private int anInt394;

	@OriginalMember(owner = "mudclient!mudclient", name = "cc", descriptor = "I")
	private int anInt396;

	@OriginalMember(owner = "mudclient!mudclient", name = "cd", descriptor = "I")
	private int anInt397;

	@OriginalMember(owner = "mudclient!mudclient", name = "ce", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "mudclient!mudclient", name = "cf", descriptor = "I")
	private int anInt399;

	@OriginalMember(owner = "mudclient!mudclient", name = "cj", descriptor = "I")
	private int anInt403;

	@OriginalMember(owner = "mudclient!mudclient", name = "ck", descriptor = "I")
	private int anInt404;

	@OriginalMember(owner = "mudclient!mudclient", name = "cl", descriptor = "I")
	private int anInt405;

	@OriginalMember(owner = "mudclient!mudclient", name = "cm", descriptor = "Lmudclient!f;")
	private World world;

	@OriginalMember(owner = "mudclient!mudclient", name = "cn", descriptor = "I")
	private int anInt406;

	@OriginalMember(owner = "mudclient!mudclient", name = "co", descriptor = "I")
	private int anInt407;

	@OriginalMember(owner = "mudclient!mudclient", name = "cp", descriptor = "I")
	private int anInt408;

	@OriginalMember(owner = "mudclient!mudclient", name = "cr", descriptor = "I")
	private int anInt410;

	@OriginalMember(owner = "mudclient!mudclient", name = "cs", descriptor = "I")
	private int anInt411;

	@OriginalMember(owner = "mudclient!mudclient", name = "cu", descriptor = "I")
	private int anInt413;

	@OriginalMember(owner = "mudclient!mudclient", name = "cv", descriptor = "I")
	private int anInt414;

	@OriginalMember(owner = "mudclient!mudclient", name = "cw", descriptor = "I")
	private int anInt415;

	@OriginalMember(owner = "mudclient!mudclient", name = "cx", descriptor = "I")
	private int anInt416;

	@OriginalMember(owner = "mudclient!mudclient", name = "cA", descriptor = "I")
	private int anInt418;

	@OriginalMember(owner = "mudclient!mudclient", name = "cB", descriptor = "I")
	private int anInt419;

	@OriginalMember(owner = "mudclient!mudclient", name = "cD", descriptor = "I")
	private int anInt421;

	@OriginalMember(owner = "mudclient!mudclient", name = "cH", descriptor = "I")
	private int anInt425;

	@OriginalMember(owner = "mudclient!mudclient", name = "cI", descriptor = "I")
	private int anInt426;

	@OriginalMember(owner = "mudclient!mudclient", name = "cJ", descriptor = "I")
	private int anInt427;

	@OriginalMember(owner = "mudclient!mudclient", name = "cO", descriptor = "I")
	private int anInt428;

	@OriginalMember(owner = "mudclient!mudclient", name = "cP", descriptor = "I")
	private int anInt429;

	@OriginalMember(owner = "mudclient!mudclient", name = "cT", descriptor = "I")
	private int anInt433;

	@OriginalMember(owner = "mudclient!mudclient", name = "cU", descriptor = "I")
	private int anInt434;

	@OriginalMember(owner = "mudclient!mudclient", name = "da", descriptor = "I")
	private int anInt436;

	@OriginalMember(owner = "mudclient!mudclient", name = "dg", descriptor = "I")
	private int anInt438;

	@OriginalMember(owner = "mudclient!mudclient", name = "dq", descriptor = "I")
	private int anInt440;

	@OriginalMember(owner = "mudclient!mudclient", name = "dx", descriptor = "I")
	private int anInt441;

	@OriginalMember(owner = "mudclient!mudclient", name = "dz", descriptor = "I")
	private int anInt443;

	@OriginalMember(owner = "mudclient!mudclient", name = "dL", descriptor = "I")
	private int anInt446;

	@OriginalMember(owner = "mudclient!mudclient", name = "dM", descriptor = "I")
	private int anInt447;

	@OriginalMember(owner = "mudclient!mudclient", name = "dN", descriptor = "I")
	private int anInt448;

	@OriginalMember(owner = "mudclient!mudclient", name = "dR", descriptor = "I")
	private int anInt449;

	@OriginalMember(owner = "mudclient!mudclient", name = "dS", descriptor = "I")
	private int anInt450;

	@OriginalMember(owner = "mudclient!mudclient", name = "dT", descriptor = "Lmudclient!a/a/e;")
	private Gui aGui1;

	@OriginalMember(owner = "mudclient!mudclient", name = "dU", descriptor = "I")
	private int anInt451;

	@OriginalMember(owner = "mudclient!mudclient", name = "dV", descriptor = "I")
	private int anInt452;

	@OriginalMember(owner = "mudclient!mudclient", name = "dX", descriptor = "Lmudclient!a/a/e;")
	private Gui aGui2;

	@OriginalMember(owner = "mudclient!mudclient", name = "dY", descriptor = "I")
	private int anInt454;

	@OriginalMember(owner = "mudclient!mudclient", name = "dZ", descriptor = "I")
	private int anInt455;

	@OriginalMember(owner = "mudclient!mudclient", name = "ea", descriptor = "J")
	private long aLong5;

	@OriginalMember(owner = "mudclient!mudclient", name = "eb", descriptor = "Lmudclient!a/a/e;")
	private Gui aGui3;

	@OriginalMember(owner = "mudclient!mudclient", name = "ec", descriptor = "I")
	private int anInt456;

	@OriginalMember(owner = "mudclient!mudclient", name = "ed", descriptor = "I")
	private int anInt457;

	@OriginalMember(owner = "mudclient!mudclient", name = "en", descriptor = "I")
	private int anInt459;

	@OriginalMember(owner = "mudclient!mudclient", name = "eo", descriptor = "I")
	private int anInt460;

	@OriginalMember(owner = "mudclient!mudclient", name = "ep", descriptor = "I")
	private int anInt461;

	@OriginalMember(owner = "mudclient!mudclient", name = "eq", descriptor = "I")
	private int anInt462;

	@OriginalMember(owner = "mudclient!mudclient", name = "er", descriptor = "I")
	private int menuSize;

	@OriginalMember(owner = "mudclient!mudclient", name = "eC", descriptor = "I")
	private int anInt465;

	@OriginalMember(owner = "mudclient!mudclient", name = "eD", descriptor = "I")
	private int anInt466;

	@OriginalMember(owner = "mudclient!mudclient", name = "eE", descriptor = "I")
	private int anInt467;

	@OriginalMember(owner = "mudclient!mudclient", name = "eF", descriptor = "I")
	private int anInt468;

	@OriginalMember(owner = "mudclient!mudclient", name = "eG", descriptor = "Lmudclient!a/a/e;")
	private Gui aGui4;

	@OriginalMember(owner = "mudclient!mudclient", name = "eH", descriptor = "I")
	private int anInt469;

	@OriginalMember(owner = "mudclient!mudclient", name = "eI", descriptor = "I")
	private int anInt470;

	@OriginalMember(owner = "mudclient!mudclient", name = "eJ", descriptor = "I")
	private int anInt471;

	@OriginalMember(owner = "mudclient!mudclient", name = "eK", descriptor = "I")
	private int anInt472;

	@OriginalMember(owner = "mudclient!mudclient", name = "eL", descriptor = "I")
	private int anInt473;

	@OriginalMember(owner = "mudclient!mudclient", name = "eR", descriptor = "I")
	private int anInt475;

	@OriginalMember(owner = "mudclient!mudclient", name = "eU", descriptor = "I")
	private int anInt476;

	@OriginalMember(owner = "mudclient!mudclient", name = "ff", descriptor = "J")
	private long aLong6;

	@OriginalMember(owner = "mudclient!mudclient", name = "fg", descriptor = "I")
	private int anInt477;

	@OriginalMember(owner = "mudclient!mudclient", name = "fj", descriptor = "I")
	private int anInt478;

	@OriginalMember(owner = "mudclient!mudclient", name = "fm", descriptor = "I")
	private int anInt479;

	@OriginalMember(owner = "mudclient!mudclient", name = "fn", descriptor = "I")
	private int anInt480;

	@OriginalMember(owner = "mudclient!mudclient", name = "fo", descriptor = "I")
	private int anInt481;

	@OriginalMember(owner = "mudclient!mudclient", name = "fp", descriptor = "I")
	private int anInt482;

	@OriginalMember(owner = "mudclient!mudclient", name = "fs", descriptor = "I")
	private int anInt483;

	@OriginalMember(owner = "mudclient!mudclient", name = "fv", descriptor = "I")
	private int anInt484;

	@OriginalMember(owner = "mudclient!mudclient", name = "fA", descriptor = "I")
	private int anInt485;

	@OriginalMember(owner = "mudclient!mudclient", name = "fB", descriptor = "I")
	private int anInt486;

	@OriginalMember(owner = "mudclient!mudclient", name = "fC", descriptor = "J")
	private long aLong7;

	@OriginalMember(owner = "mudclient!mudclient", name = "fF", descriptor = "I")
	private int anInt487;

	@OriginalMember(owner = "mudclient!mudclient", name = "fI", descriptor = "I")
	private int anInt488;

	@OriginalMember(owner = "mudclient!mudclient", name = "fM", descriptor = "I")
	private int anInt489;

	@OriginalMember(owner = "mudclient!mudclient", name = "fN", descriptor = "I")
	private int anInt490;

	@OriginalMember(owner = "mudclient!mudclient", name = "fU", descriptor = "I")
	private int anInt493;

	@OriginalMember(owner = "mudclient!mudclient", name = "fX", descriptor = "I")
	private int anInt494;

	@OriginalMember(owner = "mudclient!mudclient", name = "gd", descriptor = "I")
	private int anInt498;

	@OriginalMember(owner = "mudclient!mudclient", name = "gf", descriptor = "I")
	private int anInt499;

	@OriginalMember(owner = "mudclient!mudclient", name = "gh", descriptor = "I")
	private int anInt500;

	@OriginalMember(owner = "mudclient!mudclient", name = "gi", descriptor = "I")
	private int anInt501;

	@OriginalMember(owner = "mudclient!mudclient", name = "gj", descriptor = "I")
	private int anInt502;

	@OriginalMember(owner = "mudclient!mudclient", name = "gk", descriptor = "I")
	private int anInt503;

	@OriginalMember(owner = "mudclient!mudclient", name = "gl", descriptor = "I")
	private int anInt504;

	@OriginalMember(owner = "mudclient!mudclient", name = "gq", descriptor = "I")
	private int anInt505;

	@OriginalMember(owner = "mudclient!mudclient", name = "gr", descriptor = "Ljava/lang/String;")
	private String aString37;

	@OriginalMember(owner = "mudclient!mudclient", name = "gs", descriptor = "I")
	private int anInt506;

	@OriginalMember(owner = "mudclient!mudclient", name = "gt", descriptor = "I")
	private int anInt507;

	@OriginalMember(owner = "mudclient!mudclient", name = "gu", descriptor = "I")
	private int anInt508;

	@OriginalMember(owner = "mudclient!mudclient", name = "gy", descriptor = "I")
	private int anInt509;

	@OriginalMember(owner = "mudclient!mudclient", name = "gz", descriptor = "I")
	private int anInt510;

	@OriginalMember(owner = "mudclient!mudclient", name = "gA", descriptor = "I")
	private int anInt511;

	@OriginalMember(owner = "mudclient!mudclient", name = "gB", descriptor = "I")
	private int anInt512;

	@OriginalMember(owner = "mudclient!mudclient", name = "gD", descriptor = "I")
	private int anInt513;

	@OriginalMember(owner = "mudclient!mudclient", name = "gE", descriptor = "Lmudclient!a/a/e;")
	private Gui aGui5;

	@OriginalMember(owner = "mudclient!mudclient", name = "gF", descriptor = "I")
	private int anInt514;

	@OriginalMember(owner = "mudclient!mudclient", name = "gG", descriptor = "I")
	private int anInt515;

	@OriginalMember(owner = "mudclient!mudclient", name = "gH", descriptor = "Lmudclient!a/a/e;")
	private Gui aGui6;

	@OriginalMember(owner = "mudclient!mudclient", name = "gI", descriptor = "I")
	private int anInt516;

	@OriginalMember(owner = "mudclient!mudclient", name = "gJ", descriptor = "I")
	private int anInt517;

	@OriginalMember(owner = "mudclient!mudclient", name = "gK", descriptor = "I")
	private int anInt518;

	@OriginalMember(owner = "mudclient!mudclient", name = "gL", descriptor = "I")
	private int anInt519;

	@OriginalMember(owner = "mudclient!mudclient", name = "gM", descriptor = "I")
	private int anInt520;

	@OriginalMember(owner = "mudclient!mudclient", name = "gN", descriptor = "I")
	private int anInt521;

	@OriginalMember(owner = "mudclient!mudclient", name = "gO", descriptor = "I")
	private int anInt522;

	@OriginalMember(owner = "mudclient!mudclient", name = "gP", descriptor = "Lmudclient!a/a/e;")
	private Gui aGui7;

	@OriginalMember(owner = "mudclient!mudclient", name = "gQ", descriptor = "I")
	private int anInt523;

	@OriginalMember(owner = "mudclient!mudclient", name = "gR", descriptor = "I")
	private int anInt524;

	@OriginalMember(owner = "mudclient!mudclient", name = "gS", descriptor = "I")
	private int anInt525;

	@OriginalMember(owner = "mudclient!mudclient", name = "gT", descriptor = "I")
	private int anInt526;

	@OriginalMember(owner = "mudclient!mudclient", name = "gU", descriptor = "I")
	private int anInt527;

	@OriginalMember(owner = "mudclient!mudclient", name = "gV", descriptor = "I")
	private int anInt528;

	@OriginalMember(owner = "mudclient!mudclient", name = "ha", descriptor = "Lmudclient!a/a/e;")
	private Gui aGui8;

	@OriginalMember(owner = "mudclient!mudclient", name = "hb", descriptor = "I")
	private int anInt529;

	@OriginalMember(owner = "mudclient!mudclient", name = "hc", descriptor = "I")
	private int anInt530;

	@OriginalMember(owner = "mudclient!mudclient", name = "hd", descriptor = "I")
	private int anInt531;

	@OriginalMember(owner = "mudclient!mudclient", name = "he", descriptor = "I")
	private int anInt532;

	@OriginalMember(owner = "mudclient!mudclient", name = "hf", descriptor = "I")
	private int anInt533;

	@OriginalMember(owner = "mudclient!mudclient", name = "hg", descriptor = "I")
	private int anInt534;

	@OriginalMember(owner = "mudclient!mudclient", name = "hh", descriptor = "I")
	private int anInt535;

	@OriginalMember(owner = "mudclient!mudclient", name = "hi", descriptor = "I")
	private int anInt536;

	@OriginalMember(owner = "mudclient!mudclient", name = "hj", descriptor = "I")
	private int anInt537;

	@OriginalMember(owner = "mudclient!mudclient", name = "hk", descriptor = "I")
	private int anInt538;

	@OriginalMember(owner = "mudclient!mudclient", name = "hl", descriptor = "I")
	private int anInt539;

	@OriginalMember(owner = "mudclient!mudclient", name = "hm", descriptor = "I")
	private int anInt540;

	@OriginalMember(owner = "mudclient!mudclient", name = "hn", descriptor = "I")
	private int anInt541;

	@OriginalMember(owner = "mudclient!mudclient", name = "hp", descriptor = "Lmudclient!a/a/e;")
	private Gui aGui9;

	@OriginalMember(owner = "mudclient!mudclient", name = "hq", descriptor = "I")
	private int anInt542;

	@OriginalMember(owner = "mudclient!mudclient", name = "hr", descriptor = "I")
	private int anInt543;

	@OriginalMember(owner = "mudclient!mudclient", name = "hA", descriptor = "Lmudclient!a/a/e;")
	private Gui aGui10;

	@OriginalMember(owner = "mudclient!mudclient", name = "hB", descriptor = "I")
	private int anInt545;

	@OriginalMember(owner = "mudclient!mudclient", name = "hC", descriptor = "I")
	private int anInt546;

	@OriginalMember(owner = "mudclient!mudclient", name = "hD", descriptor = "I")
	private int anInt547;

	@OriginalMember(owner = "mudclient!mudclient", name = "hE", descriptor = "I")
	private int anInt548;

	@OriginalMember(owner = "mudclient!mudclient", name = "hF", descriptor = "I")
	private int anInt549;

	@OriginalMember(owner = "mudclient!mudclient", name = "hG", descriptor = "I")
	private int anInt550;

	@OriginalMember(owner = "mudclient!mudclient", name = "hH", descriptor = "I")
	private int anInt551;

	@OriginalMember(owner = "mudclient!mudclient", name = "hL", descriptor = "Lmudclient!a/a/e;")
	private Gui aGui11;

	@OriginalMember(owner = "mudclient!mudclient", name = "hM", descriptor = "I")
	private int anInt552;

	@OriginalMember(owner = "mudclient!mudclient", name = "hN", descriptor = "I")
	private int anInt553;

	@OriginalMember(owner = "mudclient!mudclient", name = "hO", descriptor = "I")
	private int anInt554;

	@OriginalMember(owner = "mudclient!mudclient", name = "hP", descriptor = "I")
	private int anInt555;

	@OriginalMember(owner = "mudclient!mudclient", name = "hQ", descriptor = "I")
	private int anInt556;

	@OriginalMember(owner = "mudclient!mudclient", name = "hR", descriptor = "I")
	private int anInt557;

	@OriginalMember(owner = "mudclient!mudclient", name = "hS", descriptor = "I")
	private int anInt558;

	@OriginalMember(owner = "mudclient!mudclient", name = "hY", descriptor = "I")
	private int anInt559;

	@OriginalMember(owner = "mudclient!mudclient", name = "id", descriptor = "I")
	private int anInt560;

	@OriginalMember(owner = "mudclient!mudclient", name = "ii", descriptor = "I")
	private int anInt561;

	@OriginalMember(owner = "mudclient!mudclient", name = "ij", descriptor = "I")
	private int anInt562;

	@OriginalMember(owner = "mudclient!mudclient", name = "im", descriptor = "I")
	private int anInt563;

	@OriginalMember(owner = "mudclient!mudclient", name = "is", descriptor = "I")
	private int anInt569;

	@OriginalMember(owner = "mudclient!mudclient", name = "iA", descriptor = "[B")
	private byte[] aByteArray25;

	@OriginalMember(owner = "mudclient!mudclient", name = "iB", descriptor = "Lmudclient!a/a/d;")
	private PcmPlayer aPcmPlayer;

	@OriginalMember(owner = "mudclient!mudclient", name = "iC", descriptor = "I")
	private int anInt571;

	@OriginalMember(owner = "mudclient!mudclient", name = "iI", descriptor = "Ljava/lang/String;")
	private String aString43;

	@OriginalMember(owner = "mudclient!mudclient", name = "bq", descriptor = "Z")
	private boolean worldMembers = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "br", descriptor = "Ljava/math/BigInteger;")
	private BigInteger CLASSIC_RSA_EXPONENT = new BigInteger("18439792161837834709");

	@OriginalMember(owner = "mudclient!mudclient", name = "bs", descriptor = "Ljava/math/BigInteger;")
	private BigInteger CLASSIC_RSA_MODULUS = new BigInteger("192956484481579778191558061814292671521");

	@OriginalMember(owner = "mudclient!mudclient", name = "bt", descriptor = "Z")
	private boolean errorHost = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "bu", descriptor = "Z")
	private boolean errorOutOfMemory = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "bv", descriptor = "Z")
	private boolean errorLoading = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "bw", descriptor = "Z")
	private boolean appletMode = true;

	@OriginalMember(owner = "mudclient!mudclient", name = "by", descriptor = "I")
	private int anInt373 = 12345678;

	@OriginalMember(owner = "mudclient!mudclient", name = "bA", descriptor = "I")
	private int anInt375 = 8000;

	@OriginalMember(owner = "mudclient!mudclient", name = "bB", descriptor = "[I")
	private int[] anIntArray168 = new int[this.anInt375];

	@OriginalMember(owner = "mudclient!mudclient", name = "bC", descriptor = "[I")
	private int[] anIntArray169 = new int[this.anInt375];

	@OriginalMember(owner = "mudclient!mudclient", name = "bE", descriptor = "[I")
	private int[] anIntArray170 = new int[8192];

	@OriginalMember(owner = "mudclient!mudclient", name = "bF", descriptor = "[I")
	private int[] anIntArray171 = new int[8192];

	@OriginalMember(owner = "mudclient!mudclient", name = "bH", descriptor = "I")
	private int anInt378 = 2;

	@OriginalMember(owner = "mudclient!mudclient", name = "bJ", descriptor = "I")
	private int anInt380 = 2;

	@OriginalMember(owner = "mudclient!mudclient", name = "bP", descriptor = "I")
	private int anInt383 = 128;

	@OriginalMember(owner = "mudclient!mudclient", name = "bR", descriptor = "I")
	private int anInt385 = 512;

	@OriginalMember(owner = "mudclient!mudclient", name = "bS", descriptor = "I")
	private int anInt386 = 334;

	@OriginalMember(owner = "mudclient!mudclient", name = "bT", descriptor = "I")
	private int anInt387 = 9;

	@OriginalMember(owner = "mudclient!mudclient", name = "cb", descriptor = "I")
	private int anInt395 = 40;

	@OriginalMember(owner = "mudclient!mudclient", name = "cg", descriptor = "I")
	private int anInt400 = -1;

	@OriginalMember(owner = "mudclient!mudclient", name = "ch", descriptor = "I")
	private int anInt401 = -1;

	@OriginalMember(owner = "mudclient!mudclient", name = "ci", descriptor = "I")
	private int anInt402 = -1;

	@OriginalMember(owner = "mudclient!mudclient", name = "cq", descriptor = "I")
	private int anInt409 = -1;

	@OriginalMember(owner = "mudclient!mudclient", name = "ct", descriptor = "I")
	private int anInt412 = -1;

	@OriginalMember(owner = "mudclient!mudclient", name = "cy", descriptor = "I")
	private int anInt417 = 550;

	@OriginalMember(owner = "mudclient!mudclient", name = "cz", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "cC", descriptor = "I")
	private int anInt420 = 1;

	@OriginalMember(owner = "mudclient!mudclient", name = "cE", descriptor = "I")
	private int anInt422 = 128;

	@OriginalMember(owner = "mudclient!mudclient", name = "cF", descriptor = "I")
	private int anInt423 = 4000;

	@OriginalMember(owner = "mudclient!mudclient", name = "cG", descriptor = "I")
	private int anInt424 = 500;

	@OriginalMember(owner = "mudclient!mudclient", name = "cK", descriptor = "[Lmudclient!c;")
	private Entity[] anEntityArray1 = new Entity[this.anInt423];

	@OriginalMember(owner = "mudclient!mudclient", name = "cL", descriptor = "[Lmudclient!c;")
	private Entity[] anEntityArray2 = new Entity[this.anInt424];

	@OriginalMember(owner = "mudclient!mudclient", name = "cM", descriptor = "[Lmudclient!c;")
	private Entity[] anEntityArray3 = new Entity[this.anInt424];

	@OriginalMember(owner = "mudclient!mudclient", name = "cN", descriptor = "Lmudclient!c;")
	private Entity localPlayer = new Entity();

	@OriginalMember(owner = "mudclient!mudclient", name = "cQ", descriptor = "I")
	private int anInt430 = -1;

	@OriginalMember(owner = "mudclient!mudclient", name = "cR", descriptor = "I")
	private int anInt431 = 5000;

	@OriginalMember(owner = "mudclient!mudclient", name = "cS", descriptor = "I")
	private int anInt432 = 500;

	@OriginalMember(owner = "mudclient!mudclient", name = "cV", descriptor = "[Lmudclient!c;")
	private Entity[] anEntityArray4 = new Entity[this.anInt431];

	@OriginalMember(owner = "mudclient!mudclient", name = "cW", descriptor = "[Lmudclient!c;")
	private Entity[] anEntityArray5 = new Entity[this.anInt432];

	@OriginalMember(owner = "mudclient!mudclient", name = "cX", descriptor = "[Lmudclient!c;")
	private Entity[] anEntityArray6 = new Entity[this.anInt432];

	@OriginalMember(owner = "mudclient!mudclient", name = "cY", descriptor = "[I")
	private int[] anIntArray172 = new int[500];

	@OriginalMember(owner = "mudclient!mudclient", name = "cZ", descriptor = "I")
	private int anInt435 = 5000;

	@OriginalMember(owner = "mudclient!mudclient", name = "db", descriptor = "[I")
	private int[] anIntArray173 = new int[this.anInt435];

	@OriginalMember(owner = "mudclient!mudclient", name = "dc", descriptor = "[I")
	private int[] anIntArray174 = new int[this.anInt435];

	@OriginalMember(owner = "mudclient!mudclient", name = "dd", descriptor = "[I")
	private int[] anIntArray175 = new int[this.anInt435];

	@OriginalMember(owner = "mudclient!mudclient", name = "de", descriptor = "[I")
	private int[] anIntArray176 = new int[this.anInt435];

	@OriginalMember(owner = "mudclient!mudclient", name = "df", descriptor = "I")
	private int anInt437 = 1500;

	@OriginalMember(owner = "mudclient!mudclient", name = "dh", descriptor = "[Lmudclient!a/a/f;")
	private Object3D[] anObject3DArray4 = new Object3D[this.anInt437];

	@OriginalMember(owner = "mudclient!mudclient", name = "di", descriptor = "[I")
	private int[] anIntArray177 = new int[this.anInt437];

	@OriginalMember(owner = "mudclient!mudclient", name = "dj", descriptor = "[I")
	private int[] anIntArray178 = new int[this.anInt437];

	@OriginalMember(owner = "mudclient!mudclient", name = "dk", descriptor = "[I")
	private int[] anIntArray179 = new int[this.anInt437];

	@OriginalMember(owner = "mudclient!mudclient", name = "dl", descriptor = "[I")
	private int[] anIntArray180 = new int[this.anInt437];

	@OriginalMember(owner = "mudclient!mudclient", name = "dm", descriptor = "[Lmudclient!a/a/f;")
	private Object3D[] anObject3DArray5 = new Object3D[1000];

	@OriginalMember(owner = "mudclient!mudclient", name = "dn", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[this.anInt437];

	@OriginalMember(owner = "mudclient!mudclient", name = "dp", descriptor = "I")
	private int anInt439 = 500;

	@OriginalMember(owner = "mudclient!mudclient", name = "dr", descriptor = "[Lmudclient!a/a/f;")
	private Object3D[] anObject3DArray6 = new Object3D[this.anInt439];

	@OriginalMember(owner = "mudclient!mudclient", name = "ds", descriptor = "[I")
	private int[] anIntArray181 = new int[this.anInt439];

	@OriginalMember(owner = "mudclient!mudclient", name = "dt", descriptor = "[I")
	private int[] anIntArray182 = new int[this.anInt439];

	@OriginalMember(owner = "mudclient!mudclient", name = "du", descriptor = "[I")
	private int[] anIntArray183 = new int[this.anInt439];

	@OriginalMember(owner = "mudclient!mudclient", name = "dv", descriptor = "[I")
	private int[] anIntArray184 = new int[this.anInt439];

	@OriginalMember(owner = "mudclient!mudclient", name = "dw", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[this.anInt439];

	@OriginalMember(owner = "mudclient!mudclient", name = "dy", descriptor = "I")
	private int anInt442 = 30;

	@OriginalMember(owner = "mudclient!mudclient", name = "dA", descriptor = "[I")
	private int[] anIntArray185 = new int[35];

	@OriginalMember(owner = "mudclient!mudclient", name = "dB", descriptor = "[I")
	private int[] anIntArray186 = new int[35];

	@OriginalMember(owner = "mudclient!mudclient", name = "dC", descriptor = "[I")
	private int[] anIntArray187 = new int[35];

	@OriginalMember(owner = "mudclient!mudclient", name = "dD", descriptor = "I")
	private int anInt444 = -1;

	@OriginalMember(owner = "mudclient!mudclient", name = "dE", descriptor = "Ljava/lang/String;")
	private String aString32 = "";

	@OriginalMember(owner = "mudclient!mudclient", name = "dF", descriptor = "[I")
	private int[] skillBaseLevel = new int[99];

	@OriginalMember(owner = "mudclient!mudclient", name = "dG", descriptor = "I")
	private final int anInt445 = 18;

	@OriginalMember(owner = "mudclient!mudclient", name = "dH", descriptor = "[I")
	private int[] anIntArray189 = new int[18];

	@OriginalMember(owner = "mudclient!mudclient", name = "dI", descriptor = "[I")
	private int[] anIntArray190 = new int[18];

	@OriginalMember(owner = "mudclient!mudclient", name = "dJ", descriptor = "[I")
	private int[] skillExperience = new int[18];

	@OriginalMember(owner = "mudclient!mudclient", name = "dK", descriptor = "[I")
	private int[] anIntArray192 = new int[5];

	@OriginalMember(owner = "mudclient!mudclient", name = "dO", descriptor = "[Ljava/lang/String;")
	private String[] OVERVIEW_STATS = new String[] { "Attack", "Defense", "Strength", "Hits", "Ranged", "Prayer", "Magic", "Cooking", "Woodcut", "Fletching", "Fishing", "Firemaking", "Crafting", "Smithing", "Mining", "Herblaw", "Agility", "Thieving" };

	@OriginalMember(owner = "mudclient!mudclient", name = "dP", descriptor = "[Ljava/lang/String;")
	private String[] STATS_NAMES = new String[] { "Attack", "Defense", "Strength", "Hits", "Ranged", "Prayer", "Magic", "Cooking", "Woodcutting", "Fletching", "Fishing", "Firemaking", "Crafting", "Smithing", "Mining", "Herblaw", "Agility", "Thieving" };

	@OriginalMember(owner = "mudclient!mudclient", name = "dQ", descriptor = "[Ljava/lang/String;")
	private String[] BONUSES = new String[] { "Armour", "WeaponAim", "WeaponPower", "Magic", "Prayer" };

	@OriginalMember(owner = "mudclient!mudclient", name = "dW", descriptor = "I")
	private int anInt453 = -1;

	@OriginalMember(owner = "mudclient!mudclient", name = "ee", descriptor = "I")
	private int anInt458 = 50;

	@OriginalMember(owner = "mudclient!mudclient", name = "ef", descriptor = "[Ljava/lang/String;")
	private String[] QUEST_LIST = new String[] { "Black knight's fortress", "Cook's assistant", "Demon slayer", "Doric's quest", "The restless ghost", "Goblin diplomacy", "Ernest the chicken", "Imp catcher", "Pirate's treasure", "Prince Ali rescue", "Romeo & Juliet", "Sheep shearer", "Shield of Arrav", "The knight's sword", "Vampire slayer", "Witch's potion", "Dragon slayer", "Witch's house (members)", "Lost city (members)", "Hero's quest (members)", "Druidic ritual (members)", "Merlin's crystal (members)", "Scorpion catcher (members)", "Family crest (members)", "Tribal totem (members)", "Fishing contest (members)", "Monk's friend (members)", "Temple of Ikov (members)", "Clock tower (members)", "The Holy Grail (members)", "Fight Arena (members)", "Tree Gnome Village (members)", "The Hazeel Cult (members)", "Sheep Herder (members)", "Plague City (members)", "Sea Slug (members)", "Waterfall quest (members)", "Biohazard (members)", "Jungle potion (members)", "Grand tree (members)", "Shilo village (members)", "Underground pass (members)", "Observatory quest (members)", "Tourist trap (members)", "Watchtower (members)", "Dwarf Cannon (members)", "Murder Mystery (members)", "Digsite (members)", "Gertrude's Cat (members)", "Legend's Quest (members)" };

	@OriginalMember(owner = "mudclient!mudclient", name = "eg", descriptor = "[Z")
	private boolean[] aBooleanArray13 = new boolean[this.anInt458];

	@OriginalMember(owner = "mudclient!mudclient", name = "eh", descriptor = "[Z")
	private boolean[] aBooleanArray14 = new boolean[50];

	@OriginalMember(owner = "mudclient!mudclient", name = "ei", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "ej", descriptor = "Z")
	private boolean cameraAngleMode = true;

	@OriginalMember(owner = "mudclient!mudclient", name = "ek", descriptor = "Z")
	private boolean mouseButtonsMode = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "el", descriptor = "Z")
	private boolean soundEffectsMode = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "em", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "es", descriptor = "I")
	private int MAX_MENU_SIZE = 250;

	@OriginalMember(owner = "mudclient!mudclient", name = "et", descriptor = "[Ljava/lang/String;")
	private String[] menuOptionTarget = new String[this.MAX_MENU_SIZE];

	@OriginalMember(owner = "mudclient!mudclient", name = "eu", descriptor = "[Ljava/lang/String;")
	private String[] menuOptionType = new String[this.MAX_MENU_SIZE];

	@OriginalMember(owner = "mudclient!mudclient", name = "ev", descriptor = "[I")
	private int[] menuAction = new int[this.MAX_MENU_SIZE];

	@OriginalMember(owner = "mudclient!mudclient", name = "ew", descriptor = "[I")
	private int[] menuParamEntityA = new int[this.MAX_MENU_SIZE];

	@OriginalMember(owner = "mudclient!mudclient", name = "ex", descriptor = "[I")
	private int[] menuParamEntityB = new int[this.MAX_MENU_SIZE];

	@OriginalMember(owner = "mudclient!mudclient", name = "ey", descriptor = "[I")
	private int[] menuParamA = new int[this.MAX_MENU_SIZE];

	@OriginalMember(owner = "mudclient!mudclient", name = "ez", descriptor = "[I")
	private int[] menuParamB = new int[this.MAX_MENU_SIZE];

	@OriginalMember(owner = "mudclient!mudclient", name = "eA", descriptor = "[I")
	private int[] menuParamC = new int[this.MAX_MENU_SIZE];

	@OriginalMember(owner = "mudclient!mudclient", name = "eB", descriptor = "[I")
	private int[] menuParamD = new int[this.MAX_MENU_SIZE];

	@OriginalMember(owner = "mudclient!mudclient", name = "eM", descriptor = "I")
	private int anInt474 = 5;

	@OriginalMember(owner = "mudclient!mudclient", name = "eN", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray35 = new String[this.anInt474];

	@OriginalMember(owner = "mudclient!mudclient", name = "eO", descriptor = "[I")
	private int[] anIntArray200 = new int[this.anInt474];

	@OriginalMember(owner = "mudclient!mudclient", name = "eP", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "eQ", descriptor = "Ljava/lang/String;")
	private String aString33 = "";

	@OriginalMember(owner = "mudclient!mudclient", name = "eS", descriptor = "[I")
	private int[] anIntArray201 = new int[8];

	@OriginalMember(owner = "mudclient!mudclient", name = "eT", descriptor = "[I")
	private int[] anIntArray202 = new int[8];

	@OriginalMember(owner = "mudclient!mudclient", name = "eV", descriptor = "[I")
	private int[] anIntArray203 = new int[8];

	@OriginalMember(owner = "mudclient!mudclient", name = "eW", descriptor = "[I")
	private int[] anIntArray204 = new int[8];

	@OriginalMember(owner = "mudclient!mudclient", name = "eX", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "eY", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "eZ", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "fa", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "fb", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "fc", descriptor = "Z")
	private boolean aBoolean84 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "fd", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "fe", descriptor = "Z")
	private boolean aBoolean86 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "fh", descriptor = "[I")
	private int[] anIntArray205 = new int[8];

	@OriginalMember(owner = "mudclient!mudclient", name = "fi", descriptor = "[I")
	private int[] anIntArray206 = new int[8];

	@OriginalMember(owner = "mudclient!mudclient", name = "fk", descriptor = "[I")
	private int[] anIntArray207 = new int[8];

	@OriginalMember(owner = "mudclient!mudclient", name = "fl", descriptor = "[I")
	private int[] anIntArray208 = new int[8];

	@OriginalMember(owner = "mudclient!mudclient", name = "fq", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "fr", descriptor = "Ljava/lang/String;")
	private String aString34 = "";

	@OriginalMember(owner = "mudclient!mudclient", name = "ft", descriptor = "[I")
	private int[] anIntArray209 = new int[14];

	@OriginalMember(owner = "mudclient!mudclient", name = "fu", descriptor = "[I")
	private int[] anIntArray210 = new int[14];

	@OriginalMember(owner = "mudclient!mudclient", name = "fw", descriptor = "[I")
	private int[] anIntArray211 = new int[14];

	@OriginalMember(owner = "mudclient!mudclient", name = "fx", descriptor = "[I")
	private int[] anIntArray212 = new int[14];

	@OriginalMember(owner = "mudclient!mudclient", name = "fy", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "fz", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "fD", descriptor = "Z")
	private boolean aBoolean90 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "fE", descriptor = "Z")
	private boolean aBoolean91 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "fG", descriptor = "[I")
	private int[] anIntArray213 = new int[14];

	@OriginalMember(owner = "mudclient!mudclient", name = "fH", descriptor = "[I")
	private int[] anIntArray214 = new int[14];

	@OriginalMember(owner = "mudclient!mudclient", name = "fJ", descriptor = "[I")
	private int[] anIntArray215 = new int[14];

	@OriginalMember(owner = "mudclient!mudclient", name = "fK", descriptor = "[I")
	private int[] anIntArray216 = new int[14];

	@OriginalMember(owner = "mudclient!mudclient", name = "fL", descriptor = "Z")
	private boolean aBoolean92 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "fO", descriptor = "[I")
	private int[] anIntArray217 = new int[256];

	@OriginalMember(owner = "mudclient!mudclient", name = "fP", descriptor = "[I")
	private int[] anIntArray218 = new int[256];

	@OriginalMember(owner = "mudclient!mudclient", name = "fQ", descriptor = "[I")
	private int[] anIntArray219 = new int[256];

	@OriginalMember(owner = "mudclient!mudclient", name = "fR", descriptor = "I")
	private int anInt491 = -1;

	@OriginalMember(owner = "mudclient!mudclient", name = "fS", descriptor = "I")
	private int anInt492 = -2;

	@OriginalMember(owner = "mudclient!mudclient", name = "fT", descriptor = "Z")
	private boolean aBoolean93 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "fV", descriptor = "[I")
	private int[] anIntArray220 = new int[256];

	@OriginalMember(owner = "mudclient!mudclient", name = "fW", descriptor = "[I")
	private int[] anIntArray221 = new int[256];

	@OriginalMember(owner = "mudclient!mudclient", name = "fY", descriptor = "[I")
	private int[] anIntArray222 = new int[256];

	@OriginalMember(owner = "mudclient!mudclient", name = "fZ", descriptor = "[I")
	private int[] anIntArray223 = new int[256];

	@OriginalMember(owner = "mudclient!mudclient", name = "ga", descriptor = "I")
	private int anInt495 = -1;

	@OriginalMember(owner = "mudclient!mudclient", name = "gb", descriptor = "I")
	private int anInt496 = -2;

	@OriginalMember(owner = "mudclient!mudclient", name = "gc", descriptor = "I")
	private int anInt497 = 48;

	@OriginalMember(owner = "mudclient!mudclient", name = "ge", descriptor = "Z")
	private boolean aBoolean94 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "gg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray36 = new String[5];

	@OriginalMember(owner = "mudclient!mudclient", name = "gm", descriptor = "Ljava/lang/String;")
	private String aString35 = "";

	@OriginalMember(owner = "mudclient!mudclient", name = "gn", descriptor = "Ljava/lang/String;")
	private String aString36 = "";

	@OriginalMember(owner = "mudclient!mudclient", name = "go", descriptor = "Z")
	private boolean aBoolean95 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "gp", descriptor = "Z")
	private boolean aBoolean96 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "gv", descriptor = "Z")
	private boolean aBoolean97 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "gw", descriptor = "Z")
	private boolean aBoolean98 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "gx", descriptor = "Ljava/lang/String;")
	private String aString38 = "";

	@OriginalMember(owner = "mudclient!mudclient", name = "gC", descriptor = "Z")
	private boolean aBoolean99 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "gW", descriptor = "Ljava/lang/String;")
	private String aString39 = "";

	@OriginalMember(owner = "mudclient!mudclient", name = "gX", descriptor = "Ljava/lang/String;")
	private String aString40 = "";

	@OriginalMember(owner = "mudclient!mudclient", name = "gY", descriptor = "Ljava/lang/String;")
	private String aString41 = "";

	@OriginalMember(owner = "mudclient!mudclient", name = "gZ", descriptor = "Ljava/lang/String;")
	private String aString42 = "";

	@OriginalMember(owner = "mudclient!mudclient", name = "ho", descriptor = "Z")
	private boolean aBoolean100 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "hs", descriptor = "I")
	private int anInt544 = -1;

	@OriginalMember(owner = "mudclient!mudclient", name = "ht", descriptor = "[I")
	private int[] anIntArray224 = new int[5];

	@OriginalMember(owner = "mudclient!mudclient", name = "hu", descriptor = "[I")
	private int[] anIntArray225 = new int[5];

	@OriginalMember(owner = "mudclient!mudclient", name = "hv", descriptor = "[I")
	private int[] anIntArray226 = new int[5];

	@OriginalMember(owner = "mudclient!mudclient", name = "hw", descriptor = "[I")
	private int[] anIntArray227 = new int[5];

	@OriginalMember(owner = "mudclient!mudclient", name = "hx", descriptor = "[I")
	private int[] anIntArray228 = new int[] { 0, 1, 2, 3, 4 };

	@OriginalMember(owner = "mudclient!mudclient", name = "hy", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray37 = new String[5];

	@OriginalMember(owner = "mudclient!mudclient", name = "hz", descriptor = "Z")
	private boolean aBoolean101 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "hI", descriptor = "[I")
	private int[] anIntArray229 = new int[5];

	@OriginalMember(owner = "mudclient!mudclient", name = "hJ", descriptor = "[I")
	private int[] anIntArray230 = new int[5];

	@OriginalMember(owner = "mudclient!mudclient", name = "hK", descriptor = "Z")
	private boolean aBoolean102 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "hT", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray38 = new String[50];

	@OriginalMember(owner = "mudclient!mudclient", name = "hU", descriptor = "[I")
	private int[] anIntArray231 = new int[50];

	@OriginalMember(owner = "mudclient!mudclient", name = "hV", descriptor = "[I")
	private int[] anIntArray232 = new int[50];

	@OriginalMember(owner = "mudclient!mudclient", name = "hW", descriptor = "[I")
	private int[] anIntArray233 = new int[50];

	@OriginalMember(owner = "mudclient!mudclient", name = "hX", descriptor = "[I")
	private int[] anIntArray234 = new int[50];

	@OriginalMember(owner = "mudclient!mudclient", name = "hZ", descriptor = "[I")
	private int[] anIntArray235 = new int[50];

	@OriginalMember(owner = "mudclient!mudclient", name = "ia", descriptor = "[I")
	private int[] anIntArray236 = new int[50];

	@OriginalMember(owner = "mudclient!mudclient", name = "ib", descriptor = "[I")
	private int[] anIntArray237 = new int[50];

	@OriginalMember(owner = "mudclient!mudclient", name = "ic", descriptor = "[I")
	private int[] anIntArray238 = new int[50];

	@OriginalMember(owner = "mudclient!mudclient", name = "ie", descriptor = "[I")
	private int[] anIntArray239 = new int[50];

	@OriginalMember(owner = "mudclient!mudclient", name = "ig", descriptor = "[I")
	private int[] anIntArray240 = new int[50];

	@OriginalMember(owner = "mudclient!mudclient", name = "ih", descriptor = "[I")
	private int[] anIntArray241 = new int[50];

	@OriginalMember(owner = "mudclient!mudclient", name = "ik", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[][] { { 11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3, 4 }, { 11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3, 4 }, { 11, 3, 2, 9, 7, 1, 6, 10, 0, 5, 8, 4 }, { 3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5 }, { 3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5 }, { 4, 3, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5 }, { 11, 4, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3 }, { 11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 4, 3 } };

	@OriginalMember(owner = "mudclient!mudclient", name = "il", descriptor = "Z")
	private boolean aBoolean103 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "in", descriptor = "I")
	private int anInt564 = 1;

	@OriginalMember(owner = "mudclient!mudclient", name = "io", descriptor = "I")
	private int anInt565 = 2;

	@OriginalMember(owner = "mudclient!mudclient", name = "ip", descriptor = "I")
	private int anInt566 = 2;

	@OriginalMember(owner = "mudclient!mudclient", name = "iq", descriptor = "I")
	private int anInt567 = 8;

	@OriginalMember(owner = "mudclient!mudclient", name = "ir", descriptor = "I")
	private int anInt568 = 14;

	@OriginalMember(owner = "mudclient!mudclient", name = "it", descriptor = "I")
	private int anInt570 = 1;

	@OriginalMember(owner = "mudclient!mudclient", name = "iu", descriptor = "[I")
	private int[] anIntArray242 = new int[] { 16711680, 16744448, 16769024, 10543104, 57344, 32768, 41088, 45311, 33023, 12528, 14680288, 3158064, 6307840, 8409088, 16777215 };

	@OriginalMember(owner = "mudclient!mudclient", name = "iv", descriptor = "[I")
	private int[] anIntArray243 = new int[] { 16760880, 16752704, 8409136, 6307872, 3158064, 16736288, 16728064, 16777215, 65280, 65535 };

	@OriginalMember(owner = "mudclient!mudclient", name = "iw", descriptor = "[I")
	private int[] anIntArray244 = new int[] { 15523536, 13415270, 11766848, 10056486, 9461792 };

	@OriginalMember(owner = "mudclient!mudclient", name = "ix", descriptor = "[I")
	private int[] anIntArray245 = new int[] { 0, 1, 2, 1 };

	@OriginalMember(owner = "mudclient!mudclient", name = "iy", descriptor = "[I")
	private int[] anIntArray246 = new int[] { 0, 1, 2, 1, 0, 0, 0, 0 };

	@OriginalMember(owner = "mudclient!mudclient", name = "iz", descriptor = "[I")
	private int[] anIntArray247 = new int[] { 0, 0, 0, 0, 0, 1, 2, 1 };

	@OriginalMember(owner = "mudclient!mudclient", name = "iD", descriptor = "[I")
	private int[] anIntArray248 = new int[50];

	@OriginalMember(owner = "mudclient!mudclient", name = "iE", descriptor = "[I")
	private int[] anIntArray249 = new int[50];

	@OriginalMember(owner = "mudclient!mudclient", name = "iF", descriptor = "[I")
	private int[] anIntArray250 = new int[50];

	@OriginalMember(owner = "mudclient!mudclient", name = "iG", descriptor = "[I")
	private int[] anIntArray251 = new int[50];

	@OriginalMember(owner = "mudclient!mudclient", name = "iH", descriptor = "Z")
	private boolean aBoolean104 = false;

	@OriginalMember(owner = "mudclient!mudclient", name = "iJ", descriptor = "[Ljava/lang/String;")
	private String[] RECOVERY_QUESTIONS = new String[] { "Where were you born?", "What was your first teachers name?", "What is your fathers middle name?", "Who was your first best friend?", "What is your favourite vacation spot?", "What is your mothers middle name?", "What was your first pets name?", "What was the name of your first school?", "What is your mothers maiden name?", "Who was your first boyfriend/girlfriend?", "What was the first computer game you purchased?", "Who is your favourite actor/actress?", "Who is your favourite author?", "Who is your favourite musician?", "Who is your favourite cartoon character?", "What is your favourite book?", "What is your favourite food?", "What is your favourite movie?" };

	@OriginalMember(owner = "mudclient!mudclient", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] args) {
		@Pc(3) MudClient client = new MudClient();
		client.appletMode = false;

		if (args.length > 0 && args[0].equals("members")) {
			client.worldMembers = true;
		}

		if (args.length > 1) {
			client.worldHost = args[1];
		}

		if (args.length > 2) {
			client.worldPort = Integer.parseInt(args[2]);
		}

		client.initApplication(client.anInt385, client.anInt386 + 11, "Runescape by Andrew Gower", false);
		client.mindel = 10;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "a", descriptor = "()V")
	@Override
	protected void load() {
		if (this.appletMode) {
			@Pc(7) String local7 = this.getDocumentBase().getHost().toLowerCase();
			if (!local7.endsWith("jagex.com") && !local7.endsWith("jagex.co.uk") && !local7.endsWith("runescape.com") && !local7.endsWith("runescape.co.uk") && !local7.endsWith("runescape.net") && !local7.endsWith("runescape.org") && !local7.endsWith("penguin") && !local7.endsWith("puffin")) {
				this.errorHost = true;
				return;
			}
		}
		this.setRsaKey(this.CLASSIC_RSA_EXPONENT, this.CLASSIC_RSA_MODULUS);
		@Pc(51) int local51 = 0;
		@Pc(59) int local59;
		@Pc(72) int local72;
		for (@Pc(53) int local53 = 0; local53 < 99; local53++) {
			local59 = local53 + 1;
			local72 = (int) ((double) local59 + Math.pow(2.0D, (double) local59 / 7.0D) * 300.0D);
			local51 += local72;
			this.skillBaseLevel[local53] = local51 & 0xFFFFFFC;
		}
		@Pc(91) String local91;
		try {
			local91 = this.getParameter("member");
			local72 = Integer.parseInt(local91);
			if (local72 == 1) {
				this.worldMembers = true;
			}
		} catch (@Pc(102) Exception local102) {
		}
		if (this.appletMode) {
			super.worldPort = 43594;
		}
		super.insetY = 0;
		Client.anInt361 = 1000;
		Client.anInt360 = Version.CLIENT;
		try {
			local91 = this.getParameter("poff");
			local72 = Integer.parseInt(local91);
			super.worldPort += local72;
			System.out.println("Offset: " + local72);
		} catch (@Pc(139) Exception local139) {
		}
		this.method496();
		if (this.errorLoading) {
			return;
		}
		this.anInt388 = 2000;
		this.anInt389 = this.anInt388 + 100;
		this.anInt390 = this.anInt389 + 50;
		this.anInt394 = this.anInt390 + 1000;
		this.anInt391 = this.anInt394 + 10;
		this.anInt392 = this.anInt391 + 50;
		this.anInt393 = this.anInt392 + 10;
		this.aGraphics5 = this.getGraphics();
		this.setFramerate(50);
		this.drawArea = new MudPix(this.anInt385, this.anInt386 + 12, 4000, this);
		this.drawArea.aMudClient1 = this;
		this.drawArea.method361(0, 0, this.anInt385, this.anInt386 + 12);
		Gui.aBoolean24 = false;
		Gui.anInt73 = this.anInt389;
		this.aGui1 = new Gui(this.drawArea, 5);
		local59 = this.drawArea.anInt318 - 199;
		@Pc(240) byte local240 = 36;
		this.anInt451 = this.aGui1.method97(local59, local240 + 24, 196, 90, 1, 500, true);
		this.aGui2 = new Gui(this.drawArea, 5);
		this.anInt454 = this.aGui2.method97(local59, local240 + 40, 196, 126, 1, 500, true);
		this.aGui3 = new Gui(this.drawArea, 5);
		this.anInt456 = this.aGui3.method97(local59, local240 + 24, 196, 251, 1, 500, true);
		this.method497();
		if (this.errorLoading) {
			return;
		}
		this.method498();
		if (this.errorLoading) {
			return;
		}
		this.world3D = new World3D(this.drawArea, 15000, 15000, 1000);
		this.world3D.method210(this.anInt385 / 2, this.anInt386 / 2, this.anInt385 / 2, this.anInt386 / 2, this.anInt385, this.anInt387);
		this.world3D.anInt150 = 2400;
		this.world3D.anInt151 = 2400;
		this.world3D.anInt152 = 1;
		this.world3D.anInt153 = 2300;
		this.world3D.method238(-50, -10, -50);
		this.world = new World(this.world3D, this.drawArea);
		this.world.anInt338 = this.anInt388;
		this.method499();
		if (this.errorLoading) {
			return;
		}
		this.method500();
		if (this.errorLoading) {
			return;
		}
		this.method501();
		if (this.errorLoading) {
			return;
		}
		if (this.worldMembers) {
			this.method502();
		}
		if (this.errorLoading) {
			return;
		}
		this.drawProgress(100, "Starting game...");
		this.method503();
		this.method519();
		this.method509();
		this.method516();
		this.method512();
		this.method513();
		this.method505();
		this.method451();
		this.method521();
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "u", descriptor = "()V")
	private void method496() {
		@Pc(13) byte[] local13 = this.loadJag("config" + Version.CONFIG + ".jag", "Configuration", 10);
		if (local13 == null) {
			this.errorLoading = true;
			return;
		}
		ClientConfig.method359(local13, this.worldMembers);
		@Pc(37) byte[] local37 = this.loadJag("filter" + Version.FILTER + ".jag", "Chat system", 15);
		if (local37 == null) {
			this.errorLoading = true;
			return;
		}
		@Pc(48) byte[] fragments = Tools.readJag("fragmentsenc.txt", 0, local37);
		@Pc(53) byte[] bad = Tools.readJag("badenc.txt", 0, local37);
		@Pc(58) byte[] host = Tools.readJag("hostenc.txt", 0, local37);
		@Pc(63) byte[] tld = Tools.readJag("tldlist.txt", 0, local37);
		WordFilter.read(new Packet(fragments), new Packet(bad), new Packet(host), new Packet(tld));
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "v", descriptor = "()V")
	private void method497() {
		@Pc(15) byte[] local15 = this.loadJag("media" + Version.MEDIA + ".jag", "2d graphics", 20);
		if (local15 == null) {
			this.errorLoading = true;
			return;
		}
		@Pc(26) byte[] local26 = Tools.readJag("index.dat", 0, local15);
		this.drawArea.method377(this.anInt388, Tools.readJag("inv1.dat", 0, local15), local26, 1);
		this.drawArea.method377(this.anInt388 + 1, Tools.readJag("inv2.dat", 0, local15), local26, 6);
		this.drawArea.method377(this.anInt388 + 9, Tools.readJag("bubble.dat", 0, local15), local26, 1);
		this.drawArea.method377(this.anInt388 + 10, Tools.readJag("runescape.dat", 0, local15), local26, 1);
		this.drawArea.method377(this.anInt388 + 11, Tools.readJag("splat.dat", 0, local15), local26, 3);
		this.drawArea.method377(this.anInt388 + 14, Tools.readJag("icon.dat", 0, local15), local26, 8);
		this.drawArea.method377(this.anInt388 + 22, Tools.readJag("hbar.dat", 0, local15), local26, 1);
		this.drawArea.method377(this.anInt388 + 23, Tools.readJag("hbar2.dat", 0, local15), local26, 1);
		this.drawArea.method377(this.anInt388 + 24, Tools.readJag("compass.dat", 0, local15), local26, 1);
		this.drawArea.method377(this.anInt388 + 25, Tools.readJag("buttons.dat", 0, local15), local26, 2);
		this.drawArea.method377(this.anInt389, Tools.readJag("scrollbar.dat", 0, local15), local26, 2);
		this.drawArea.method377(this.anInt389 + 2, Tools.readJag("corners.dat", 0, local15), local26, 4);
		this.drawArea.method377(this.anInt389 + 6, Tools.readJag("arrows.dat", 0, local15), local26, 2);
		this.drawArea.method377(this.anInt391, Tools.readJag("projectile.dat", 0, local15), local26, ClientConfig.projectileSpriteCount);
		@Pc(204) int local204 = ClientConfig.objSpriteCount;
		@Pc(206) int local206 = 1;
		@Pc(210) int local210;
		while (local204 > 0) {
			local210 = local204;
			local204 -= 30;
			if (local210 > 30) {
				local210 = 30;
			}
			this.drawArea.method377(this.anInt390 + (local206 - 1) * 30, Tools.readJag("objects" + local206 + ".dat", 0, local15), local26, local210);
			local206++;
		}
		this.drawArea.method380(this.anInt388);
		this.drawArea.method380(this.anInt388 + 9);
		for (local210 = 11; local210 <= 26; local210++) {
			this.drawArea.method380(this.anInt388 + local210);
		}
		for (@Pc(273) int local273 = 0; local273 < ClientConfig.projectileSpriteCount; local273++) {
			this.drawArea.method380(this.anInt391 + local273);
		}
		for (@Pc(288) int local288 = 0; local288 < ClientConfig.objSpriteCount; local288++) {
			this.drawArea.method380(this.anInt390 + local288);
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "w", descriptor = "()V")
	private void method498() {
		@Pc(19) byte[] local19 = this.loadJag("entity" + Version.ENTITY + ".jag", "people and monsters", 30);
		if (local19 == null) {
			this.errorLoading = true;
			return;
		}
		@Pc(30) byte[] local30 = Tools.readJag("index.dat", 0, local19);
		@Pc(32) byte[] local32 = null;
		@Pc(34) byte[] local34 = null;
		if (this.worldMembers) {
			local32 = this.loadJag("entity" + Version.ENTITY + ".mem", "member graphics", 45);
			if (local32 == null) {
				this.errorLoading = true;
				return;
			}
			local34 = Tools.readJag("index.dat", 0, local32);
		}
		@Pc(64) int local64 = 0;
		this.anInt561 = 0;
		this.anInt562 = this.anInt561;
		label77: for (@Pc(73) int local73 = 0; local73 < ClientConfig.animationCount; local73++) {
			@Pc(79) String local79 = ClientConfig.animationName[local73];
			for (@Pc(81) int local81 = 0; local81 < local73; local81++) {
				if (ClientConfig.animationName[local81].equalsIgnoreCase(local79)) {
					ClientConfig.animationFileId[local73] = ClientConfig.animationFileId[local81];
					continue label77;
				}
			}
			@Pc(113) byte[] local113 = Tools.readJag(local79 + ".dat", 0, local19);
			@Pc(115) byte[] local115 = local30;
			if (local113 == null && this.worldMembers) {
				local113 = Tools.readJag(local79 + ".dat", 0, local32);
				local115 = local34;
			}
			if (local113 != null) {
				this.drawArea.method377(this.anInt562, local113, local115, 15);
				local64 += 15;
				@Pc(162) byte[] local162;
				if (ClientConfig.animatonHasA[local73] == 1) {
					local162 = Tools.readJag(local79 + "a.dat", 0, local19);
					local115 = local30;
					if (local162 == null && this.worldMembers) {
						local162 = Tools.readJag(local79 + "a.dat", 0, local32);
						local115 = local34;
					}
					this.drawArea.method377(this.anInt562 + 15, local162, local115, 3);
					local64 += 3;
				}
				if (ClientConfig.animationHasF[local73] == 1) {
					local162 = Tools.readJag(local79 + "f.dat", 0, local19);
					local115 = local30;
					if (local162 == null && this.worldMembers) {
						local162 = Tools.readJag(local79 + "f.dat", 0, local32);
						local115 = local34;
					}
					this.drawArea.method377(this.anInt562 + 18, local162, local115, 9);
					local64 += 9;
				}
				if (ClientConfig.animationGender[local73] != 0) {
					for (@Pc(250) int local250 = this.anInt562; local250 < this.anInt562 + 27; local250++) {
						this.drawArea.method380(local250);
					}
				}
			}
			ClientConfig.animationFileId[local73] = this.anInt562;
			this.anInt562 += 27;
		}
		System.out.println("Loaded: " + local64 + " frames of animation");
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "x", descriptor = "()V")
	private void method499() {
		@Pc(15) byte[] local15 = this.loadJag("textures" + Version.TEXTURES + ".jag", "Textures", 50);
		if (local15 == null) {
			this.errorLoading = true;
			return;
		}
		@Pc(26) byte[] local26 = Tools.readJag("index.dat", 0, local15);
		this.world3D.method232(ClientConfig.textureCount, 7, 11);
		for (@Pc(34) int local34 = 0; local34 < ClientConfig.textureCount; local34++) {
			@Pc(40) String local40 = ClientConfig.textureName[local34];
			@Pc(52) byte[] local52 = Tools.readJag(local40 + ".dat", 0, local15);
			this.drawArea.method377(this.anInt392, local52, local26, 1);
			this.drawArea.method368(0, 0, 128, 128, 16711935);
			this.drawArea.method383(0, 0, this.anInt392);
			@Pc(82) int local82 = this.drawArea.anIntArray153[this.anInt392];
			@Pc(86) String local86 = ClientConfig.textureSubName[local34];
			if (local86 != null && local86.length() > 0) {
				local52 = Tools.readJag(local86 + ".dat", 0, local15);
				this.drawArea.method377(this.anInt392, local52, local26, 1);
				this.drawArea.method383(0, 0, this.anInt392);
			}
			this.drawArea.method382(this.anInt393 + local34, 0, 0, local82, local82);
			@Pc(133) int local133 = local82 * local82;
			for (@Pc(135) int local135 = 0; local135 < local133; local135++) {
				if (this.drawArea.anIntArrayArray16[this.anInt393 + local34][local135] == 65280) {
					this.drawArea.anIntArrayArray16[this.anInt393 + local34][local135] = 16711935;
				}
			}
			this.drawArea.method379(this.anInt393 + local34);
			this.world3D.method233(local34, this.drawArea.aByteArrayArray5[this.anInt393 + local34], this.drawArea.anIntArrayArray17[this.anInt393 + local34], local82 / 64 - 1);
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "y", descriptor = "()V")
	private void method500() {
		ClientConfig.getModelId("torcha2");
		ClientConfig.getModelId("torcha3");
		ClientConfig.getModelId("torcha4");
		ClientConfig.getModelId("skulltorcha2");
		ClientConfig.getModelId("skulltorcha3");
		ClientConfig.getModelId("skulltorcha4");
		ClientConfig.getModelId("firea2");
		ClientConfig.getModelId("firea3");
		ClientConfig.getModelId("fireplacea2");
		ClientConfig.getModelId("fireplacea3");
		ClientConfig.getModelId("firespell2");
		ClientConfig.getModelId("firespell3");
		ClientConfig.getModelId("lightning2");
		ClientConfig.getModelId("lightning3");
		ClientConfig.getModelId("clawspell2");
		ClientConfig.getModelId("clawspell3");
		ClientConfig.getModelId("clawspell4");
		ClientConfig.getModelId("clawspell5");
		ClientConfig.getModelId("spellcharge2");
		ClientConfig.getModelId("spellcharge3");

        if (true) { // this.isApplet()) {
            @Pc(78) byte[] local78 = this.loadJag("models" + Version.MODELS + ".jag", "3d models", 60);
            if (local78 == null) {
                this.errorLoading = true;
                return;
            }

            for (@Pc(86) int local86 = 0; local86 < ClientConfig.modelCount; local86++) {
                @Pc(101) int local101 = Tools.getJagOffset(ClientConfig.models[local86] + ".ob3", local78);
                if (local101 == 0) {
                    this.anObject3DArray5[local86] = new Object3D(1, 1);
                } else {
                    this.anObject3DArray5[local86] = new Object3D(local78, local101, true);
                }

                if (ClientConfig.models[local86].equals("giantcrystal")) {
                    this.anObject3DArray5[local86].aBoolean28 = true;
                }
            }
        } else {
            this.drawProgress(70, "Loading 3d models");

            for (@Pc(147) int local147 = 0; local147 < ClientConfig.modelCount; local147++) {
                this.anObject3DArray5[local147] = new Object3D("../gamedata/models/" + ClientConfig.models[local147] + ".ob2");
                if (ClientConfig.models[local147].equals("giantcrystal")) {
                    this.anObject3DArray5[local147].aBoolean28 = true;
                }
            }
        }
    }

	@OriginalMember(owner = "mudclient!mudclient", name = "z", descriptor = "()V")
	private void method501() {
		this.world.aByteArray21 = this.loadJag("maps" + Version.MAPS + ".jag", "map", 70);
		if (this.worldMembers) {
			this.world.aByteArray23 = this.loadJag("maps" + Version.MAPS + ".mem", "members map", 75);
		}
		this.world.aByteArray20 = this.loadJag("land" + Version.MAPS + ".jag", "landscape", 80);
		if (this.worldMembers) {
			this.world.aByteArray22 = this.loadJag("land" + Version.MAPS + ".mem", "members landscape", 85);
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "A", descriptor = "()V")
	private void method502() {
		try {
			this.aByteArray25 = this.loadJag("sounds" + Version.SOUNDS + ".mem", "Sound effects", 90);
			this.aPcmPlayer = new PcmPlayer();
		} catch (@Pc(21) Throwable local21) {
			System.out.println("Unable to init sounds:" + local21);
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "B", descriptor = "()V")
	private void method503() {
		this.aGui4 = new Gui(this.drawArea, 10);
		this.anInt469 = this.aGui4.method94(5, 269, 502, 56, 1, 20, true);
		this.anInt470 = this.aGui4.method95(7, 324, 498, 14, 1, 80, false, true);
		this.anInt471 = this.aGui4.method94(5, 269, 502, 56, 1, 20, true);
		this.anInt472 = this.aGui4.method94(5, 269, 502, 56, 1, 20, true);
		this.aGui4.method108(this.anInt470);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "b", descriptor = "()V")
	@Override
	protected void update() {
		if (this.errorHost || (this.errorOutOfMemory || this.errorLoading)) {
			return;
		}
		try {
			this.anInt372++;
			if (this.anInt384 == 0) {
				super.idleCycles = 0;
				this.method522();
			}
			if (this.anInt384 == 1) {
				super.idleCycles++;
				this.method523();
			}
			super.mouseClickButton = 0;
			super.keyHeld = 0;
			this.anInt381++;
			if (this.anInt381 > 500) {
				this.anInt381 = 0;
				@Pc(61) int local61 = (int) (Math.random() * 4.0D);
				if ((local61 & 0x1) == 1) {
					this.anInt377 += this.anInt378;
				}
				if ((local61 & 0x2) == 2) {
					this.anInt379 += this.anInt380;
				}
			}
			if (this.anInt377 < -50) {
				this.anInt378 = 2;
			}
			if (this.anInt377 > 50) {
				this.anInt378 = -2;
			}
			if (this.anInt379 < -50) {
				this.anInt380 = 2;
			}
			if (this.anInt379 > 50) {
				this.anInt380 = -2;
			}
			if (this.anInt465 > 0) {
				this.anInt465--;
			}
			if (this.anInt466 > 0) {
				this.anInt466--;
			}
			if (this.anInt467 > 0) {
				this.anInt467--;
			}
			if (this.anInt468 > 0) {
				this.anInt468--;
				return;
			}
		} catch (@Pc(151) OutOfMemoryError local151) {
			this.method504();
			this.errorOutOfMemory = true;
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "d", descriptor = "()V")
	@Override
	protected void draw() {
		@Pc(5) Graphics local5;
		if (this.errorLoading) {
			local5 = this.getGraphics();
			local5.setColor(Color.black);
			local5.fillRect(0, 0, 512, 356);
			local5.setFont(new Font("Helvetica", 1, 16));
			local5.setColor(Color.yellow);
			@Pc(27) byte local27 = 35;
			local5.drawString("Sorry, an error has occured whilst loading RuneScape", 30, local27);
			@Pc(33) int local33 = local27 + 50;
			local5.setColor(Color.white);
			local5.drawString("To fix this try the following (in order):", 30, local33);
			@Pc(42) int local42 = local33 + 50;
			local5.setColor(Color.white);
			local5.setFont(new Font("Helvetica", 1, 12));
			local5.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, local42);
			@Pc(59) int local59 = local42 + 30;
			local5.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, local59);
			@Pc(65) int local65 = local59 + 30;
			local5.drawString("3: Try using a different game-world", 30, local65);
			@Pc(71) int local71 = local65 + 30;
			local5.drawString("4: Try rebooting your computer", 30, local71);
			@Pc(77) int local77 = local71 + 30;
			local5.drawString("5: Try selecting a different version of Java from the play-game menu", 30, local77);
			this.setFramerate(1);
		} else if (this.errorHost) {
			local5 = this.getGraphics();
			local5.setColor(Color.black);
			local5.fillRect(0, 0, 512, 356);
			local5.setFont(new Font("Helvetica", 1, 20));
			local5.setColor(Color.white);
			local5.drawString("Error - unable to load game!", 50, 50);
			local5.drawString("To play RuneScape make sure you play from", 50, 100);
			local5.drawString("http://www.runescape.com", 50, 150);
			this.setFramerate(1);
		} else if (this.errorOutOfMemory) {
			local5 = this.getGraphics();
			local5.setColor(Color.black);
			local5.fillRect(0, 0, 512, 356);
			local5.setFont(new Font("Helvetica", 1, 20));
			local5.setColor(Color.white);
			local5.drawString("Error - out of memory!", 50, 50);
			local5.drawString("Close ALL unnecessary programs", 50, 100);
			local5.drawString("and windows before loading the game", 50, 150);
			local5.drawString("RuneScape needs about 48meg of spare RAM", 50, 200);
			this.setFramerate(1);
		} else {
			try {
				if (this.anInt384 == 0) {
					this.drawArea.aBoolean51 = false;
					this.method520();
				}
				if (this.anInt384 == 1) {
					this.drawArea.aBoolean51 = true;
					this.method530();
					return;
				}
			} catch (@Pc(202) OutOfMemoryError local202) {
				this.method504();
				this.errorOutOfMemory = true;
			}
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "c", descriptor = "()V")
	@Override
	protected void unload() {
		this.method470();
		this.method504();
		if (this.aPcmPlayer != null) {
			this.aPcmPlayer.method69();
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "C", descriptor = "()V")
	private void method504() {
		try {
			if (this.drawArea != null) {
				this.drawArea.method376();
				this.drawArea.anIntArray148 = null;
				this.drawArea = null;
			}
			if (this.world3D != null) {
				this.world3D.method200();
				this.world3D = null;
			}
			this.anObject3DArray5 = null;
			this.anObject3DArray4 = null;
			this.anObject3DArray6 = null;
			this.anEntityArray1 = null;
			this.anEntityArray2 = null;
			this.anEntityArray4 = null;
			this.anEntityArray5 = null;
			this.localPlayer = null;
			if (this.world != null) {
				this.world.anObject3DArray3 = null;
				this.world.anObject3DArrayArray1 = null;
				this.world.anObject3DArrayArray2 = null;
				this.world.anObject3D_3 = null;
				this.world = null;
			}
			System.gc();
		} catch (@Pc(70) Exception local70) {
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "b", descriptor = "(I)V")
	@Override
	protected void onKeyPress(@OriginalArg(0) int code) {
		if (this.anInt384 == 0) {
			if (this.anInt513 == 0) {
				this.aGui5.method74(code);
			}
			if (this.anInt513 == 1) {
				this.aGui6.method74(code);
			}
			if (this.anInt513 == 2) {
				this.aGui7.method74(code);
			}
			if (this.anInt513 == 3) {
				this.aGui10.method74(code);
			}
		}
		if (this.anInt384 != 1) {
			return;
		}
		if (this.aBoolean103) {
			this.aGui8.method74(code);
			return;
		}
		if (this.aBoolean100) {
			if (this.anInt544 == -1) {
				this.aGui9.method74(code);
			}
			return;
		}
		if (this.aBoolean102) {
			this.aGui11.method74(code);
			return;
		}
		if (this.anInt504 == 0 && this.anInt501 == 0 && this.anInt502 == 0 && !this.aBoolean104) {
			this.aGui4.method74(code);
		}
		if (this.anInt504 == 3 || this.anInt504 == 4 || this.anInt504 == 5 || this.anInt504 == 7) {
			this.anInt504 = 0;
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "a", descriptor = "(III)V")
	@Override
	protected void onMouseClick(@OriginalArg(0) int button, @OriginalArg(1) int x, @OriginalArg(2) int y) {
		this.anIntArray170[this.anInt376] = x;
		this.anIntArray171[this.anInt376] = y;
		this.anInt376 = this.anInt376 + 1 & 0x1FFF;
		for (@Pc(23) int local23 = 10; local23 < 4000; local23++) {
			@Pc(32) int local32 = this.anInt376 - local23 & 0x1FFF;
			if (this.anIntArray170[local32] == x && this.anIntArray171[local32] == y) {
				@Pc(46) boolean local46 = false;
				for (@Pc(48) int local48 = 1; local48 < local23; local48++) {
					@Pc(57) int local57 = this.anInt376 - local48 & 0x1FFF;
					@Pc(63) int local63 = local32 - local48 & 0x1FFF;
					if (this.anIntArray170[local63] != x || this.anIntArray171[local63] != y) {
						local46 = true;
					}
					if (this.anIntArray170[local57] != this.anIntArray170[local63] || this.anIntArray171[local57] != this.anIntArray171[local63]) {
						break;
					}
					if (local48 == local23 - 1 && local46 && this.anInt510 == 0 && this.anInt509 == 0) {
						this.method507();
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "D", descriptor = "()V")
	private void method505() {
		this.anInt384 = 0;
		this.anInt513 = 0;
		this.aString41 = "";
		this.aString42 = "";
		this.aString39 = "Please enter a username:";
		this.aString40 = "*" + this.aString41 + "*";
		this.anInt425 = 0;
		this.anInt433 = 0;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "E", descriptor = "()V")
	private void method506() {
		super.aString27 = "";
		super.aString28 = "";
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "F", descriptor = "()V")
	private void method507() {
		if (this.anInt384 == 0) {
			return;
		}
		if (this.anInt510 > 450) {
			this.message("@cya@You can't logout during combat!", 3);
		} else if (this.anInt510 > 0) {
			this.message("@cya@You can't logout for 10 seconds after combat", 3);
		} else {
			super.stream.p1spooky(6, 156);
			super.stream.encryptPacket();
			this.anInt509 = 1000;
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "e", descriptor = "(Ljava/lang/String;)V")
	private void method508(@OriginalArg(0) String arg0) {
		if (this.aPcmPlayer != null && !this.soundEffectsMode) {
			this.aPcmPlayer.method70(this.aByteArray25, Tools.getJagOffset(arg0 + ".pcm", this.aByteArray25), Tools.getJagSize(arg0 + ".pcm", this.aByteArray25));
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "G", descriptor = "()V")
	private void method509() {
		this.aGui9 = new Gui(this.drawArea, 100);
		@Pc(9) byte local9 = 8;
		this.anInt542 = this.aGui9.method90(256, local9, "@yel@Please provide 5 security questions in case you lose your password", 1, true);
		@Pc(20) int local20 = local9 + 22;
		this.aGui9.method90(256, local20, "If you ever lose your password, you will need these to prove you own your account.", 1, true);
		@Pc(30) int local30 = local20 + 13;
		this.aGui9.method90(256, local30, "Your answers are encrypted and are ONLY used for password recovery purposes.", 1, true);
		@Pc(40) int local40 = local30 + 22;
		this.aGui9.method90(256, local40, "@ora@IMPORTANT:@whi@ To recover your password you must give the EXACT same answers you", 1, true);
		@Pc(50) int local50 = local40 + 13;
		this.aGui9.method90(256, local50, "give here. If you think you might forget an answer, or someone else could guess the", 1, true);
		@Pc(60) int local60 = local50 + 13;
		this.aGui9.method90(256, local60, "answer, then press the 'different question' button to get a better question.", 1, true);
		local20 = local60 + 35;
		for (@Pc(72) int local72 = 0; local72 < 5; local72++) {
			this.aGui9.method91(170, local20, 310, 30);
			this.aStringArray37[local72] = this.RECOVERY_QUESTIONS[this.anIntArray228[local72]];
			this.anIntArray224[local72] = this.aGui9.method90(170, local20 - 7, local72 + 1 + ": " + this.RECOVERY_QUESTIONS[this.anIntArray228[local72]], 1, true);
			this.anIntArray225[local72] = this.aGui9.method96(170, local20 + 7, 310, 30, 1, 80, false, true);
			this.aGui9.method91(370, local20, 80, 30);
			this.aGui9.method90(370, local20 - 7, "Different", 1, true);
			this.aGui9.method90(370, local20 + 7, "Question", 1, true);
			this.anIntArray226[local72] = this.aGui9.method98(370, local20, 80, 30);
			this.aGui9.method91(455, local20, 80, 30);
			this.aGui9.method90(455, local20 - 7, "Enter own", 1, true);
			this.aGui9.method90(455, local20 + 7, "Question", 1, true);
			this.anIntArray227[local72] = this.aGui9.method98(455, local20, 80, 30);
			local20 += 35;
		}
		this.aGui9.method108(this.anIntArray225[0]);
		local20 += 10;
		this.aGui9.method91(256, local20, 250, 30);
		this.aGui9.method90(256, local20, "Click here when finished", 4, true);
		this.anInt543 = this.aGui9.method98(256, local20, 250, 30);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "H", descriptor = "()V")
	private void method510() {
		if (this.anInt544 == -1) {
			this.aGui9.method72(super.mouseX, super.mouseY, super.mouseClickButton, super.mouseButton);
			@Pc(99) int local99;
			for (@Pc(67) int local67 = 0; local67 < 5; local67++) {
				if (this.aGui9.method73(this.anIntArray226[local67])) {
					@Pc(79) boolean local79 = false;
					while (!local79) {
						this.anIntArray228[local67] = (this.anIntArray228[local67] + 1) % this.RECOVERY_QUESTIONS.length;
						local79 = true;
						for (local99 = 0; local99 < 5; local99++) {
							if (local99 != local67 && this.anIntArray228[local99] == this.anIntArray228[local67]) {
								local79 = false;
							}
						}
					}
					this.aStringArray37[local67] = this.RECOVERY_QUESTIONS[this.anIntArray228[local67]];
					this.aGui9.method104(this.anIntArray224[local67], local67 + 1 + ": " + this.RECOVERY_QUESTIONS[this.anIntArray228[local67]]);
					this.aGui9.method104(this.anIntArray225[local67], "");
				}
			}
			for (@Pc(171) int local171 = 0; local171 < 5; local171++) {
				if (this.aGui9.method73(this.anIntArray227[local171])) {
					this.anInt544 = local171;
					super.aString27 = "";
					super.aString28 = "";
				}
			}
			if (this.aGui9.method73(this.anInt543)) {
				local99 = 0;
				while (true) {
					if (local99 >= 5) {
						@Pc(251) int local251;
						@Pc(261) String local261;
						for (@Pc(239) int local239 = 0; local239 < 5; local239++) {
							@Pc(249) String local249 = this.aGui9.method105(this.anIntArray225[local239]);
							for (local251 = 0; local251 < local239; local251++) {
								local261 = this.aGui9.method105(this.anIntArray225[local251]);
								if (local249.equalsIgnoreCase(local261)) {
									this.aGui9.method104(this.anInt542, "@yel@Each question must have a different answer");
									return;
								}
							}
						}
						super.stream.p1spooky(208, 457);
						for (@Pc(287) int local287 = 0; local287 < 5; local287++) {
							@Pc(294) String local294 = this.aStringArray37[local287];
							if (local294 == null || local294.length() == 0) {
								local294 = String.valueOf(local287 + 1);
							}
							if (local294.length() > 50) {
								local294 = local294.substring(0, 50);
							}
							local261 = this.aGui9.method105(this.anIntArray225[local287]);
							local261 = Tools.formatAlphaOnly(local261, 50);
							super.stream.p1(local294.length());
							super.stream.pjstr(local294);
							super.stream.p1(local261.length());
							super.stream.rsaenc(local261, super.sessionId, this.CLASSIC_RSA_EXPONENT, this.CLASSIC_RSA_MODULUS);
						}
						super.stream.encryptPacket();
						for (local251 = 0; local251 < 5; local251++) {
							this.anIntArray228[local251] = local251;
							this.aStringArray37[local251] = this.RECOVERY_QUESTIONS[this.anIntArray228[local251]];
							this.aGui9.method104(this.anIntArray225[local251], "");
							this.aGui9.method104(this.anIntArray224[local251], local251 + 1 + ": " + this.aStringArray37[local251]);
						}
						this.drawArea.method364();
						this.aBoolean100 = false;
						break;
					}
					@Pc(212) String local212 = this.aGui9.method105(this.anIntArray225[local99]);
					if (local212 == null || local212.length() < 3) {
						this.aGui9.method104(this.anInt542, "@yel@Please provide a longer answer to question: " + (local99 + 1));
						return;
					}
					local99++;
				}
			}
		} else if (super.aString28.length() > 0) {
			this.aStringArray37[this.anInt544] = super.aString28;
			this.aGui9.method104(this.anIntArray224[this.anInt544], this.anInt544 + 1 + ": " + this.aStringArray37[this.anInt544]);
			this.aGui9.method104(this.anIntArray225[this.anInt544], "");
			this.anInt544 = -1;
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "I", descriptor = "()V")
	private void method511() {
		this.drawArea.aBoolean50 = false;
		this.drawArea.method364();
		this.aGui9.method75();
		if (this.anInt544 != -1) {
			@Pc(15) short local15 = 150;
			this.drawArea.method368(26, local15, 460, 60, 0);
			this.drawArea.method369(26, local15, 460, 60, 16777215);
			@Pc(32) int local32 = local15 + 22;
			this.drawArea.drawStringCenter("Please enter your question", 256, local32, 4, 16777215);
			@Pc(41) int local41 = local32 + 25;
			this.drawArea.drawStringCenter(super.aString27 + "*", 256, local41, 4, 16777215);
		}
		this.drawArea.method383(0, this.anInt386, this.anInt388 + 22);
		this.drawArea.method363(this.aGraphics5, 0, 0);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "J", descriptor = "()V")
	private void method512() {
		this.aGui10 = new Gui(this.drawArea, 100);
		@Pc(9) byte local9 = 10;
		this.anInt545 = this.aGui10.method90(256, local9, "@yel@To prove this is your account please provide the answers to", 1, true);
		@Pc(20) int local20 = local9 + 15;
		this.anInt546 = this.aGui10.method90(256, local20, "@yel@your security questions. You will then be able to reset your password", 1, true);
		local20 += 35;
		for (@Pc(33) int local33 = 0; local33 < 5; local33++) {
			this.aGui10.method91(256, local20, 410, 30);
			this.anIntArray229[local33] = this.aGui10.method90(256, local20 - 7, local33 + 1 + ": question?", 1, true);
			this.anIntArray230[local33] = this.aGui10.method96(256, local20 + 7, 310, 30, 1, 80, true, true);
			local20 += 35;
		}
		this.aGui10.method108(this.anIntArray230[0]);
		this.aGui10.method91(256, local20, 410, 30);
		this.aGui10.method90(256, local20 - 7, "If you know it, enter a previous password used on this account", 1, true);
		this.anInt547 = this.aGui10.method96(256, local20 + 7, 310, 30, 1, 80, true, true);
		local20 += 35;
		this.aGui10.method91(151, local20, 200, 30);
		this.aGui10.method90(151, local20 - 7, "Choose a NEW password", 1, true);
		this.anInt548 = this.aGui10.method96(146, local20 + 7, 200, 30, 1, 80, true, true);
		this.aGui10.method91(361, local20, 200, 30);
		this.aGui10.method90(361, local20 - 7, "Confirm new password", 1, true);
		this.anInt549 = this.aGui10.method96(366, local20 + 7, 200, 30, 1, 80, true, true);
		local20 += 35;
		this.aGui10.method91(201, local20, 100, 30);
		this.aGui10.method90(201, local20, "Submit", 4, true);
		this.anInt550 = this.aGui10.method98(201, local20, 100, 30);
		this.aGui10.method91(311, local20, 100, 30);
		this.aGui10.method90(311, local20, "Cancel", 4, true);
		this.anInt551 = this.aGui10.method98(311, local20, 100, 30);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "K", descriptor = "()V")
	private void method513() {
		this.aGui11 = new Gui(this.drawArea, 100);
		@Pc(9) short local9 = 256;
		@Pc(11) short local11 = 400;
		@Pc(13) byte local13 = 25;
		this.anInt552 = this.aGui11.method90(256, local13, "@yel@Please supply your contact details", 5, true);
		@Pc(24) int local24 = local13 + 30;
		this.aGui11.method90(256, local24, "We need this information to provide an efficient customer support service ", 1, true);
		@Pc(34) int local34 = local24 + 15;
		this.aGui11.method90(256, local34, "and also to work out where to locate future RuneScape servers.", 1, true);
		@Pc(44) int local44 = local34 + 25;
		this.aGui11.method90(256, local44, "We know some people are concerned about entering their email address on", 1, true);
		@Pc(54) int local54 = local44 + 15;
		this.aGui11.method90(255, local54, "websites, and for this reason we take our users privacy very seriously.", 1, true);
		@Pc(64) int local64 = local54 + 15;
		this.aGui11.method90(256, local64, "For our full policy please click the relevant link below this game window", 1, true);
		@Pc(74) int local74 = local64 + 40;
		this.aGui11.method91(local9, local74, local11, 30);
		this.aGui11.method90(local9, local74 - 7, "Full name", 1, true);
		this.anInt553 = this.aGui11.method96(local9, local74 + 7, local11, 30, 1, 80, false, true);
		@Pc(109) int local109 = local74 + 35;
		this.aGui11.method91(local9, local109, local11, 30);
		this.aGui11.method90(local9, local109 - 7, "Postcode/Zipcode", 1, true);
		this.anInt554 = this.aGui11.method96(local9, local109 + 7, local11, 30, 1, 80, false, true);
		@Pc(144) int local144 = local109 + 35;
		this.aGui11.method91(local9, local144, local11, 30);
		this.aGui11.method90(local9, local144 - 7, "Country", 1, true);
		this.anInt555 = this.aGui11.method96(local9, local144 + 7, local11, 30, 1, 80, false, true);
		@Pc(179) int local179 = local144 + 35;
		this.aGui11.method91(local9, local179, local11, 30);
		this.aGui11.method90(local9, local179 - 7, "Email address", 1, true);
		this.anInt556 = this.aGui11.method96(local9, local179 + 7, local11, 30, 1, 80, false, true);
		@Pc(214) int local214 = local179 + 35;
		this.aGui11.method91(local9, local214, 100, 30);
		this.aGui11.method90(local9, local214, "Submit", 4, true);
		this.anInt557 = this.aGui11.method98(local9, local214, 100, 30);
		this.aGui11.method108(this.anInt553);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "L", descriptor = "()V")
	private void method514() {
		this.drawArea.aBoolean50 = false;
		this.drawArea.method364();
		this.aGui11.method75();
		this.drawArea.method383(0, this.anInt386, this.anInt388 + 22);
		this.drawArea.method363(this.aGraphics5, 0, 0);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "M", descriptor = "()V")
	private void method515() {
		this.aGui11.method72(super.mouseX, super.mouseY, super.mouseClickButton, super.mouseButton);
		if (this.aGui11.method73(this.anInt553)) {
			this.aGui11.method108(this.anInt554);
		}
		if (this.aGui11.method73(this.anInt554)) {
			this.aGui11.method108(this.anInt555);
		}
		if (this.aGui11.method73(this.anInt555)) {
			this.aGui11.method108(this.anInt556);
		}
		if (this.aGui11.method73(this.anInt556)) {
			this.aGui11.method108(this.anInt553);
		}
		if (!this.aGui11.method73(this.anInt557)) {
			return;
		}
		@Pc(66) String local66 = this.aGui11.method105(this.anInt553);
		@Pc(72) String local72 = this.aGui11.method105(this.anInt554);
		@Pc(78) String local78 = this.aGui11.method105(this.anInt555);
		@Pc(84) String local84 = this.aGui11.method105(this.anInt556);
		if (local66 == null || local66.length() == 0 || local72 == null || local72.length() == 0 || local78 == null || local78.length() == 0 || local84 == null || local84.length() == 0) {
			this.aGui11.method104(this.anInt552, "@yel@Please fill in all the requested details");
			return;
		}
		super.stream.p1spooky(253, 155);
		super.stream.p1(local66.length());
		super.stream.pjstr(local66);
		super.stream.p1(local72.length());
		super.stream.pjstr(local72);
		super.stream.p1(local78.length());
		super.stream.pjstr(local78);
		super.stream.p1(local84.length());
		super.stream.pjstr(local84);
		super.stream.encryptPacket();
		this.drawArea.method364();
		this.aBoolean102 = false;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "N", descriptor = "()V")
	private void method516() {
		this.aGui8 = new Gui(this.drawArea, 100);
		this.aGui8.method90(256, 10, "Please design Your Character", 4, true);
		@Pc(18) short local18 = 140;
		@Pc(20) byte local20 = 34;
		@Pc(21) int local21 = local18 + 116;
		@Pc(22) int local22 = local20 - 10;
		this.aGui8.method90(local21 - 55, local22 + 110, "Front", 3, true);
		this.aGui8.method90(local21, local22 + 110, "Side", 3, true);
		this.aGui8.method90(local21 + 55, local22 + 110, "Back", 3, true);
		@Pc(61) byte local61 = 54;
		@Pc(62) int local62 = local22 + 145;
		this.aGui8.method92(local21 - local61, local62, 53, 41);
		this.aGui8.method90(local21 - local61, local62 - 8, "Head", 1, true);
		this.aGui8.method90(local21 - local61, local62 + 8, "Type", 1, true);
		this.aGui8.method93(local21 - local61 - 40, local62, Gui.anInt73 + 7);
		this.anInt529 = this.aGui8.method98(local21 - local61 - 40, local62, 20, 20);
		this.aGui8.method93(local21 + 40 - local61, local62, Gui.anInt73 + 6);
		this.anInt530 = this.aGui8.method98(local21 + 40 - local61, local62, 20, 20);
		this.aGui8.method92(local21 + local61, local62, 53, 41);
		this.aGui8.method90(local21 + local61, local62 - 8, "Hair", 1, true);
		this.aGui8.method90(local21 + local61, local62 + 8, "Color", 1, true);
		this.aGui8.method93(local21 + local61 - 40, local62, Gui.anInt73 + 7);
		this.anInt531 = this.aGui8.method98(local21 + local61 - 40, local62, 20, 20);
		this.aGui8.method93(local21 + local61 + 40, local62, Gui.anInt73 + 6);
		this.anInt532 = this.aGui8.method98(local21 + local61 + 40, local62, 20, 20);
		@Pc(239) int local239 = local62 + 50;
		this.aGui8.method92(local21 - local61, local239, 53, 41);
		this.aGui8.method90(local21 - local61, local239, "Gender", 1, true);
		this.aGui8.method93(local21 - local61 - 40, local239, Gui.anInt73 + 7);
		this.anInt533 = this.aGui8.method98(local21 - local61 - 40, local239, 20, 20);
		this.aGui8.method93(local21 + 40 - local61, local239, Gui.anInt73 + 6);
		this.anInt534 = this.aGui8.method98(local21 + 40 - local61, local239, 20, 20);
		this.aGui8.method92(local21 + local61, local239, 53, 41);
		this.aGui8.method90(local21 + local61, local239 - 8, "Top", 1, true);
		this.aGui8.method90(local21 + local61, local239 + 8, "Color", 1, true);
		this.aGui8.method93(local21 + local61 - 40, local239, Gui.anInt73 + 7);
		this.anInt535 = this.aGui8.method98(local21 + local61 - 40, local239, 20, 20);
		this.aGui8.method93(local21 + local61 + 40, local239, Gui.anInt73 + 6);
		this.anInt536 = this.aGui8.method98(local21 + local61 + 40, local239, 20, 20);
		@Pc(401) int local401 = local239 + 50;
		this.aGui8.method92(local21 - local61, local401, 53, 41);
		this.aGui8.method90(local21 - local61, local401 - 8, "Skin", 1, true);
		this.aGui8.method90(local21 - local61, local401 + 8, "Color", 1, true);
		this.aGui8.method93(local21 - local61 - 40, local401, Gui.anInt73 + 7);
		this.anInt537 = this.aGui8.method98(local21 - local61 - 40, local401, 20, 20);
		this.aGui8.method93(local21 + 40 - local61, local401, Gui.anInt73 + 6);
		this.anInt538 = this.aGui8.method98(local21 + 40 - local61, local401, 20, 20);
		this.aGui8.method92(local21 + local61, local401, 53, 41);
		this.aGui8.method90(local21 + local61, local401 - 8, "Bottom", 1, true);
		this.aGui8.method90(local21 + local61, local401 + 8, "Color", 1, true);
		this.aGui8.method93(local21 + local61 - 40, local401, Gui.anInt73 + 7);
		this.anInt539 = this.aGui8.method98(local21 + local61 - 40, local401, 20, 20);
		this.aGui8.method93(local21 + local61 + 40, local401, Gui.anInt73 + 6);
		this.anInt540 = this.aGui8.method98(local21 + local61 + 40, local401, 20, 20);
		@Pc(578) int local578 = local401 + 82;
		@Pc(579) int local579 = local578 - 35;
		this.aGui8.method91(local21, local579, 200, 30);
		this.aGui8.method90(local21, local579, "Accept", 4, false);
		this.anInt541 = this.aGui8.method98(local21, local579, 200, 30);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "O", descriptor = "()V")
	private void method517() {
		this.drawArea.aBoolean50 = false;
		this.drawArea.method364();
		this.aGui8.method75();
		@Pc(11) short local11 = 140;
		@Pc(13) byte local13 = 50;
		@Pc(14) int local14 = local11 + 116;
		@Pc(15) int local15 = local13 - 25;
		this.drawArea.method387(local14 - 32 - 55, local15, 64, 102, ClientConfig.animationFileId[this.anInt565], this.anIntArray242[this.anInt568]);
		this.drawArea.method399(local14 - 32 - 55, local15, 64, 102, ClientConfig.animationFileId[this.anInt564], this.anIntArray242[this.anInt567], this.anIntArray244[this.anInt569], 0, false);
		this.drawArea.method399(local14 - 32 - 55, local15, 64, 102, ClientConfig.animationFileId[this.anInt563], this.anIntArray243[this.anInt566], this.anIntArray244[this.anInt569], 0, false);
		this.drawArea.method387(local14 - 32, local15, 64, 102, ClientConfig.animationFileId[this.anInt565] + 6, this.anIntArray242[this.anInt568]);
		this.drawArea.method399(local14 - 32, local15, 64, 102, ClientConfig.animationFileId[this.anInt564] + 6, this.anIntArray242[this.anInt567], this.anIntArray244[this.anInt569], 0, false);
		this.drawArea.method399(local14 - 32, local15, 64, 102, ClientConfig.animationFileId[this.anInt563] + 6, this.anIntArray243[this.anInt566], this.anIntArray244[this.anInt569], 0, false);
		this.drawArea.method387(local14 + 55 - 32, local15, 64, 102, ClientConfig.animationFileId[this.anInt565] + 12, this.anIntArray242[this.anInt568]);
		this.drawArea.method399(local14 + 55 - 32, local15, 64, 102, ClientConfig.animationFileId[this.anInt564] + 12, this.anIntArray242[this.anInt567], this.anIntArray244[this.anInt569], 0, false);
		this.drawArea.method399(local14 + 55 - 32, local15, 64, 102, ClientConfig.animationFileId[this.anInt563] + 12, this.anIntArray243[this.anInt566], this.anIntArray244[this.anInt569], 0, false);
		this.drawArea.method383(0, this.anInt386, this.anInt388 + 22);
		this.drawArea.method363(this.aGraphics5, 0, 0);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "P", descriptor = "()V")
	private void method518() {
		this.aGui8.method72(super.mouseX, super.mouseY, super.mouseClickButton, super.mouseButton);
		if (this.aGui8.method73(this.anInt529)) {
			do {
				do {
					this.anInt563 = (this.anInt563 + ClientConfig.animationCount - 1) % ClientConfig.animationCount;
				} while ((ClientConfig.animationGender[this.anInt563] & 0x3) != 1);
			} while ((ClientConfig.animationGender[this.anInt563] & this.anInt570 * 4) == 0);
		}
		if (this.aGui8.method73(this.anInt530)) {
			do {
				do {
					this.anInt563 = (this.anInt563 + 1) % ClientConfig.animationCount;
				} while ((ClientConfig.animationGender[this.anInt563] & 0x3) != 1);
			} while ((ClientConfig.animationGender[this.anInt563] & this.anInt570 * 4) == 0);
		}
		if (this.aGui8.method73(this.anInt531)) {
			this.anInt566 = (this.anInt566 + this.anIntArray243.length - 1) % this.anIntArray243.length;
		}
		if (this.aGui8.method73(this.anInt532)) {
			this.anInt566 = (this.anInt566 + 1) % this.anIntArray243.length;
		}
		if (this.aGui8.method73(this.anInt533) || this.aGui8.method73(this.anInt534)) {
			this.anInt570 = 3 - this.anInt570;
			while ((ClientConfig.animationGender[this.anInt563] & 0x3) != 1 || (ClientConfig.animationGender[this.anInt563] & this.anInt570 * 4) == 0) {
				this.anInt563 = (this.anInt563 + 1) % ClientConfig.animationCount;
			}
			while ((ClientConfig.animationGender[this.anInt564] & 0x3) != 2 || (ClientConfig.animationGender[this.anInt564] & this.anInt570 * 4) == 0) {
				this.anInt564 = (this.anInt564 + 1) % ClientConfig.animationCount;
			}
		}
		if (this.aGui8.method73(this.anInt535)) {
			this.anInt567 = (this.anInt567 + this.anIntArray242.length - 1) % this.anIntArray242.length;
		}
		if (this.aGui8.method73(this.anInt536)) {
			this.anInt567 = (this.anInt567 + 1) % this.anIntArray242.length;
		}
		if (this.aGui8.method73(this.anInt537)) {
			this.anInt569 = (this.anInt569 + this.anIntArray244.length - 1) % this.anIntArray244.length;
		}
		if (this.aGui8.method73(this.anInt538)) {
			this.anInt569 = (this.anInt569 + 1) % this.anIntArray244.length;
		}
		if (this.aGui8.method73(this.anInt539)) {
			this.anInt568 = (this.anInt568 + this.anIntArray242.length - 1) % this.anIntArray242.length;
		}
		if (this.aGui8.method73(this.anInt540)) {
			this.anInt568 = (this.anInt568 + 1) % this.anIntArray242.length;
		}
		if (!this.aGui8.method73(this.anInt541)) {
			return;
		}
		super.stream.p1spooky(236, 65);
		super.stream.p1(this.anInt570);
		super.stream.p1(this.anInt563);
		super.stream.p1(this.anInt564);
		super.stream.p1(this.anInt565);
		super.stream.p1(this.anInt566);
		super.stream.p1(this.anInt567);
		super.stream.p1(this.anInt568);
		super.stream.p1(this.anInt569);
		super.stream.encryptPacket();
		this.drawArea.method364();
		this.aBoolean103 = false;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "Q", descriptor = "()V")
	private void method519() {
		this.aGui5 = new Gui(this.drawArea, 50);
		@Pc(9) byte local9 = 40;
		if (this.worldMembers) {
			this.aGui5.method90(256, local9 + 200, "Welcome to RuneScape", 4, true);
			this.aGui5.method90(256, local9 + 215, "You need a member account to use this server", 4, true);
			this.aGui5.method91(256, local9 + 250, 200, 35);
			this.aGui5.method90(256, local9 + 250, "Click here to login", 5, false);
			this.anInt515 = this.aGui5.method98(256, local9 + 250, 200, 35);
		} else {
			this.aGui5.method90(256, local9 + 200, "Click on an option", 5, true);
			this.aGui5.method91(156, local9 + 240, 120, 35);
			this.aGui5.method91(356, local9 + 240, 120, 35);
			this.aGui5.method90(156, local9 + 240, "New User", 5, false);
			this.aGui5.method90(356, local9 + 240, "Existing User", 5, false);
			this.anInt514 = this.aGui5.method98(156, local9 + 240, 120, 35);
			this.anInt515 = this.aGui5.method98(356, local9 + 240, 120, 35);
		}
		this.aGui6 = new Gui(this.drawArea, 50);
		local9 = 70;
		this.anInt516 = this.aGui6.method90(256, local9 + 8, "To create an account please enter all the requested details", 4, true);
		@Pc(166) int local166 = local9 + 25;
		this.aGui6.method91(256, local166 + 17, 250, 34);
		this.aGui6.method90(256, local166 + 8, "Choose a Username", 4, false);
		this.anInt519 = this.aGui6.method96(256, local166 + 25, 200, 40, 4, 12, false, false);
		this.aGui6.method108(this.anInt519);
		@Pc(208) int local208 = local166 + 40;
		this.aGui6.method91(141, local208 + 17, 220, 34);
		this.aGui6.method90(141, local208 + 8, "Choose a Password", 4, false);
		this.anInt520 = this.aGui6.method96(141, local208 + 25, 220, 40, 4, 20, true, false);
		this.aGui6.method91(371, local208 + 17, 220, 34);
		this.aGui6.method90(371, local208 + 8, "Confirm Password", 4, false);
		this.anInt521 = this.aGui6.method96(371, local208 + 25, 220, 40, 4, 20, true, false);
		@Pc(281) int local281 = local208 + 40;
		@Pc(282) int local282 = local281 + 20;
		this.anInt522 = this.aGui6.method99(60, local282, 14);
		this.aGui6.method89(75, local282, "I have read and agree to your terms and conditions", 4, true);
		@Pc(300) int local300 = local282 + 15;
		this.aGui6.method90(256, local300, "(to view these click the relevant link below this game window)", 4, true);
		@Pc(310) int local310 = local300 + 20;
		this.aGui6.method91(156, local310 + 17, 150, 34);
		this.aGui6.method90(156, local310 + 17, "Submit", 5, false);
		this.anInt518 = this.aGui6.method98(156, local310 + 17, 150, 34);
		this.aGui6.method91(356, local310 + 17, 150, 34);
		this.aGui6.method90(356, local310 + 17, "Cancel", 5, false);
		this.anInt517 = this.aGui6.method98(356, local310 + 17, 150, 34);
		this.aGui7 = new Gui(this.drawArea, 50);
		@Pc(384) short local384 = 230;
		this.anInt523 = this.aGui7.method90(256, local384 - 10, "Please enter your username and password", 4, true);
		@Pc(397) int local397 = local384 + 28;
		this.aGui7.method91(140, local397, 200, 40);
		this.aGui7.method90(140, local397 - 10, "Username:", 4, false);
		this.anInt524 = this.aGui7.method96(140, local397 + 10, 200, 40, 4, 12, false, false);
		@Pc(432) int local432 = local397 + 47;
		this.aGui7.method91(190, local432, 200, 40);
		this.aGui7.method90(190, local432 - 10, "Password:", 4, false);
		this.anInt525 = this.aGui7.method96(190, local432 + 10, 200, 40, 4, 20, true, false);
		@Pc(467) int local467 = local432 - 55;
		this.aGui7.method91(410, local467, 120, 25);
		this.aGui7.method90(410, local467, "Ok", 4, false);
		this.anInt526 = this.aGui7.method98(410, local467, 120, 25);
		@Pc(494) int local494 = local467 + 30;
		this.aGui7.method91(410, local494, 120, 25);
		this.aGui7.method90(410, local494, "Cancel", 4, false);
		this.anInt527 = this.aGui7.method98(410, local494, 120, 25);
		@Pc(521) int local521 = local494 + 30;
		this.aGui7.method91(410, local521, 160, 25);
		this.aGui7.method90(410, local521, "I've lost my password", 4, false);
		this.anInt528 = this.aGui7.method98(410, local521, 160, 25);
		this.aGui7.method108(this.anInt524);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "R", descriptor = "()V")
	private void method520() {
		this.aBoolean95 = false;
		this.drawArea.aBoolean50 = false;
		this.drawArea.method364();
		if (this.anInt513 == 0 || this.anInt513 == 2) {
			@Pc(25) int local25 = this.anInt372 * 2 % 3072;
			if (local25 < 1024) {
				this.drawArea.method383(0, 10, this.anInt394);
				if (local25 > 768) {
					this.drawArea.method385(0, 10, this.anInt394 + 1, local25 - 768);
				}
			} else if (local25 < 2048) {
				this.drawArea.method383(0, 10, this.anInt394 + 1);
				if (local25 > 1792) {
					this.drawArea.method385(0, 10, this.anInt388 + 10, local25 - 1792);
				}
			} else {
				this.drawArea.method383(0, 10, this.anInt388 + 10);
				if (local25 > 2816) {
					this.drawArea.method385(0, 10, this.anInt394, local25 - 2816);
				}
			}
		}
		if (this.anInt513 == 0) {
			this.aGui5.method75();
		}
		if (this.anInt513 == 1) {
			this.aGui6.method75();
		}
		if (this.anInt513 == 2) {
			this.aGui7.method75();
		}
		if (this.anInt513 == 3) {
			this.aGui10.method75();
		}
		this.drawArea.method383(0, this.anInt386, this.anInt388 + 22);
		this.drawArea.method363(this.aGraphics5, 0, 0);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "S", descriptor = "()V")
	private void method521() {
		@Pc(3) byte local3 = 0;
		@Pc(5) byte local5 = 50;
		@Pc(7) byte local7 = 50;
		this.world.method440(local5 * 48 + 23, local7 * 48 + 23, local3);
		this.world.method444(this.anObject3DArray5);
		@Pc(28) short local28 = 9728;
		@Pc(30) short local30 = 6400;
		@Pc(32) short local32 = 1100;
		@Pc(34) short local34 = 888;
		this.world3D.anInt150 = 4100;
		this.world3D.anInt151 = 4100;
		this.world3D.anInt152 = 1;
		this.world3D.anInt153 = 4000;
		this.world3D.method227(local28, -this.world.method424(local28, local30), local30, 912, local34, 0, local32 * 2);
		this.world3D.method215();
		this.drawArea.method373();
		this.drawArea.method373();
		this.drawArea.method368(0, 0, 512, 6, 0);
		for (@Pc(86) int local86 = 6; local86 >= 1; local86--) {
			this.drawArea.method374(0, local86, 0, local86, 512, 8);
		}
		this.drawArea.method368(0, 194, 512, 20, 0);
		for (@Pc(111) int local111 = 6; local111 >= 1; local111--) {
			this.drawArea.method374(0, local111, 0, 194 - local111, 512, 8);
		}
		this.drawArea.method383(15, 15, this.anInt388 + 10);
		this.drawArea.method382(this.anInt394, 0, 0, 512, 200);
		this.drawArea.method379(this.anInt394);
		local28 = 9216;
		local30 = 9216;
		local32 = 1100;
		local34 = 888;
		this.world3D.anInt150 = 4100;
		this.world3D.anInt151 = 4100;
		this.world3D.anInt152 = 1;
		this.world3D.anInt153 = 4000;
		this.world3D.method227(local28, -this.world.method424(local28, local30), local30, 912, local34, 0, local32 * 2);
		this.world3D.method215();
		this.drawArea.method373();
		this.drawArea.method373();
		this.drawArea.method368(0, 0, 512, 6, 0);
		for (@Pc(211) int local211 = 6; local211 >= 1; local211--) {
			this.drawArea.method374(0, local211, 0, local211, 512, 8);
		}
		this.drawArea.method368(0, 194, 512, 20, 0);
		for (@Pc(236) int local236 = 6; local236 >= 1; local236--) {
			this.drawArea.method374(0, local236, 0, 194 - local236, 512, 8);
		}
		this.drawArea.method383(15, 15, this.anInt388 + 10);
		this.drawArea.method382(this.anInt394 + 1, 0, 0, 512, 200);
		this.drawArea.method379(this.anInt394 + 1);
		for (@Pc(282) int local282 = 0; local282 < 64; local282++) {
			this.world3D.method199(this.world.anObject3DArrayArray2[0][local282]);
			this.world3D.method199(this.world.anObject3DArrayArray1[1][local282]);
			this.world3D.method199(this.world.anObject3DArrayArray2[1][local282]);
			this.world3D.method199(this.world.anObject3DArrayArray1[2][local282]);
			this.world3D.method199(this.world.anObject3DArrayArray2[2][local282]);
		}
		local28 = 11136;
		local30 = 10368;
		local32 = 500;
		local34 = 376;
		this.world3D.anInt150 = 4100;
		this.world3D.anInt151 = 4100;
		this.world3D.anInt152 = 1;
		this.world3D.anInt153 = 4000;
		this.world3D.method227(local28, -this.world.method424(local28, local30), local30, 912, local34, 0, local32 * 2);
		this.world3D.method215();
		this.drawArea.method373();
		this.drawArea.method373();
		this.drawArea.method368(0, 0, 512, 6, 0);
		for (@Pc(398) int local398 = 6; local398 >= 1; local398--) {
			this.drawArea.method374(0, local398, 0, local398, 512, 8);
		}
		this.drawArea.method368(0, 194, 512, 20, 0);
		for (@Pc(423) int local423 = 6; local423 >= 1; local423--) {
			this.drawArea.method374(0, local423, 0, 194, 512, 8);
		}
		this.drawArea.method383(15, 15, this.anInt388 + 10);
		this.drawArea.method382(this.anInt388 + 10, 0, 0, 512, 200);
		this.drawArea.method379(this.anInt388 + 10);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "T", descriptor = "()V")
	private void method522() {
		if (super.anInt371 > 0) {
			super.anInt371--;
		}
		if (this.anInt513 == 0) {
			this.aGui5.method72(super.mouseX, super.mouseY, super.mouseClickButton, super.mouseButton);
			if (this.aGui5.method73(this.anInt514)) {
				this.anInt513 = 1;
				this.aGui6.method104(this.anInt519, "");
				this.aGui6.method104(this.anInt520, "");
				this.aGui6.method104(this.anInt521, "");
				this.aGui6.method108(this.anInt519);
				this.aGui6.method111(this.anInt522, 0);
				this.aGui6.method104(this.anInt516, "To create an account please enter all the requested details");
			}
			if (this.aGui5.method73(this.anInt515)) {
				this.anInt513 = 2;
				this.aGui7.method104(this.anInt523, "Please enter your username and password");
				this.aGui7.method104(this.anInt524, "");
				this.aGui7.method104(this.anInt525, "");
				this.aGui7.method108(this.anInt524);
				return;
			}
			return;
		}
		@Pc(281) String local281;
		@Pc(287) String local287;
		if (this.anInt513 == 1) {
			this.aGui6.method72(super.mouseX, super.mouseY, super.mouseClickButton, super.mouseButton);
			if (this.aGui6.method73(this.anInt519)) {
				this.aGui6.method108(this.anInt520);
			}
			if (this.aGui6.method73(this.anInt520)) {
				this.aGui6.method108(this.anInt521);
			}
			if (this.aGui6.method73(this.anInt521)) {
				this.aGui6.method108(this.anInt519);
			}
			if (this.aGui6.method73(this.anInt517)) {
				this.anInt513 = 0;
			}
			if (this.aGui6.method73(this.anInt518)) {
				if (this.aGui6.method105(this.anInt519) != null && this.aGui6.method105(this.anInt519).length() != 0 && this.aGui6.method105(this.anInt520) != null && this.aGui6.method105(this.anInt520).length() != 0) {
					if (!this.aGui6.method105(this.anInt520).equalsIgnoreCase(this.aGui6.method105(this.anInt521))) {
						this.aGui6.method104(this.anInt516, "@yel@The two passwords entered are not the same as each other!");
						return;
					}
					if (this.aGui6.method105(this.anInt520).length() < 5) {
						this.aGui6.method104(this.anInt516, "@yel@Your password must be at least 5 letters long");
						return;
					}
					if (this.aGui6.method105(this.anInt520).trim().equalsIgnoreCase(this.aGui6.method105(this.anInt519).trim())) {
						this.aGui6.method104(this.anInt516, "@yel@Your password must not be the same as your username!");
						return;
					}
					if (this.aGui6.method109(this.anInt522) == 0) {
						this.aGui6.method104(this.anInt516, "@yel@You must agree to the terms+conditions to continue");
						return;
					}
					this.aGui6.method104(this.anInt516, "Please wait... Creating new account");
					this.method520();
					this.reset();
					local281 = this.aGui6.method105(this.anInt519);
					local287 = this.aGui6.method105(this.anInt520);
					this.method473(local281, local287);
					return;
				}
				this.aGui6.method104(this.anInt516, "@yel@Please fill in ALL requested information to continue!");
				return;
			}
			return;
		}
		@Pc(473) int local473;
		@Pc(488) String local488;
		if (this.anInt513 == 2) {
			this.aGui7.method72(super.mouseX, super.mouseY, super.mouseClickButton, super.mouseButton);
			if (this.aGui7.method73(this.anInt527)) {
				this.anInt513 = 0;
			}
			if (this.aGui7.method73(this.anInt524)) {
				this.aGui7.method108(this.anInt525);
			}
			if (this.aGui7.method73(this.anInt525) || this.aGui7.method73(this.anInt526)) {
				this.aString41 = this.aGui7.method105(this.anInt524);
				this.aString42 = this.aGui7.method105(this.anInt525);
				this.method469(this.aString41, this.aString42, false);
			}
			if (this.aGui7.method73(this.anInt528)) {
				this.aString41 = this.aGui7.method105(this.anInt524);
				this.aString41 = Tools.formatAuthString(this.aString41, 20);
				if (this.aString41.trim().length() == 0) {
					this.method486("You must enter your username to recover your password", "");
					return;
				}
				this.method486(Client.loginResponses[6], Client.loginResponses[7]);
				try {
					super.stream = new ClientStream(this.openSocket(super.worldHost, super.worldPort), this);
					super.stream.maxRetries = Client.anInt361;
					super.stream.g4();
					super.stream.p1spooky(4, 848);
					super.stream.p8(Tools.toBase37(this.aString41));
					super.stream.flush();
					super.stream.read();
					super.stream.read();
					@Pc(443) int local443 = super.stream.read();
					@Pc(449) int local449 = super.stream.g1spooky(local443, Client.SERVERPROT_ENCRYPTION);
					System.out.println("Getpq response: " + local449);
					if (local449 == 0) {
						this.method486("Sorry, the recovery questions for this user have not been set", "");
						return;
					}
					for (@Pc(467) int local467 = 0; local467 < 5; local467++) {
						local473 = super.stream.read();
						@Pc(476) byte[] local476 = new byte[5000];
						super.stream.gdata(local473, local476);
						local488 = new String(local476, 0, local473);
						this.aGui10.method104(this.anIntArray229[local467], local488);
					}
					if (this.aBoolean101) {
						this.method486("Sorry, you have already attempted 1 recovery, try again later", "");
						return;
					}
					this.anInt513 = 3;
					this.aGui10.method104(this.anInt545, "@yel@To prove this is your account please provide the answers to");
					this.aGui10.method104(this.anInt546, "@yel@your security questions. You will then be able to reset your password");
					for (local473 = 0; local473 < 5; local473++) {
						this.aGui10.method104(this.anIntArray230[local473], "");
					}
					this.aGui10.method104(this.anInt547, "");
					this.aGui10.method104(this.anInt548, "");
					this.aGui10.method104(this.anInt549, "");
					return;
				} catch (@Pc(559) Exception local559) {
					this.method486(Client.loginResponses[12], Client.loginResponses[13]);
					return;
				}
			}
		} else if (this.anInt513 == 3) {
			this.aGui10.method72(super.mouseX, super.mouseY, super.mouseClickButton, super.mouseButton);
			if (this.aGui10.method73(this.anInt550)) {
				local281 = this.aGui10.method105(this.anInt548);
				local287 = this.aGui10.method105(this.anInt549);
				if (!local281.equalsIgnoreCase(local287)) {
					this.method486("@yel@The two new passwords entered are not the same as each other!", "");
					return;
				}
				if (local281.length() < 5) {
					this.method486("@yel@Your new password must be at least 5 letters long", "");
					return;
				}
				this.method486(Client.loginResponses[6], Client.loginResponses[7]);
				try {
					super.stream = new ClientStream(this.openSocket(super.worldHost, super.worldPort), this);
					super.stream.maxRetries = Client.anInt361;
					local473 = super.stream.g4();
					@Pc(655) String local655 = Tools.formatAuthString(this.aGui10.method105(this.anInt547), 20);
					local488 = Tools.formatAuthString(this.aGui10.method105(this.anInt548), 20);
					super.stream.p1spooky(8, 121);
					super.stream.p8(Tools.toBase37(this.aString41));
					super.stream.p4(this.getUid());
					super.stream.rsaenc(local655 + local488, local473, this.CLASSIC_RSA_EXPONENT, this.CLASSIC_RSA_MODULUS);
					for (@Pc(697) int local697 = 0; local697 < 5; local697++) {
						@Pc(707) String local707 = this.aGui10.method105(this.anIntArray230[local697]);
						@Pc(711) String local711 = Tools.formatAlphaOnly(local707, 50);
						super.stream.p1(local711.length());
						super.stream.rsaenc(local711, local473, this.CLASSIC_RSA_EXPONENT, this.CLASSIC_RSA_MODULUS);
					}
					super.stream.flush();
					super.stream.read();
					@Pc(740) int local740 = super.stream.read();
					@Pc(746) int local746 = super.stream.g1spooky(local740, Client.SERVERPROT_ENCRYPTION);
					System.out.println("Recover response: " + local746);
					if (local746 == 0) {
						this.anInt513 = 2;
						this.method486("Sorry, recovery failed. You may try again in 1 hour", "");
						this.aBoolean101 = true;
						return;
					}
					if (local746 == 1) {
						this.anInt513 = 2;
						this.method486("Your pass has been reset. You may now use the new pass to login", "");
						return;
					}
					this.anInt513 = 2;
					this.method486("Recovery failed! Attempts exceeded?", "");
					return;
				} catch (@Pc(788) Exception local788) {
					this.method486(Client.loginResponses[12], Client.loginResponses[13]);
				}
			}
			if (this.aGui10.method73(this.anInt551)) {
				this.anInt513 = 0;
			}
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "d", descriptor = "(Ljava/lang/String;Ljava/lang/String;)V")
	@Override
	protected void method486(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (this.anInt513 == 1) {
			this.aGui6.method104(this.anInt516, arg0 + " " + arg1);
		}
		if (this.anInt513 == 2) {
			this.aGui7.method104(this.anInt523, arg0 + " " + arg1);
		}
		if (this.anInt513 == 3) {
			this.aGui10.method104(this.anInt545, arg0);
			this.aGui10.method104(this.anInt546, arg1);
		}
		this.aString40 = arg1;
		this.method520();
		this.reset();
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "r", descriptor = "()V")
	@Override
	protected void tryLogout() {
		this.anInt509 = 0;
		this.message("@cya@Sorry, you can't logout at the moment", 3);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "l", descriptor = "()V")
	@Override
	protected void method471() {
		if (this.anInt509 == 0) {
			super.method471();
		} else {
			this.method489();
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "q", descriptor = "()V")
	@Override
	protected void method489() {
		this.anInt513 = 0;
		this.anInt384 = 0;
		this.anInt509 = 0;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "p", descriptor = "()V")
	@Override
	protected void method488() {
		this.anInt500 = 0;
		this.anInt509 = 0;
		this.anInt513 = 0;
		this.anInt384 = 1;
		this.method506();
		this.drawArea.method364();
		this.drawArea.method363(this.aGraphics5, 0, 0);
		for (@Pc(27) int local27 = 0; local27 < this.anInt438; local27++) {
			this.world3D.method199(this.anObject3DArray4[local27]);
			this.world.method419(this.anIntArray177[local27], this.anIntArray178[local27], this.anIntArray179[local27]);
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt440; local58++) {
			this.world3D.method199(this.anObject3DArray6[local58]);
			this.world.method417(this.anIntArray181[local58], this.anIntArray182[local58], this.anIntArray183[local58], this.anIntArray184[local58]);
		}
		this.anInt438 = 0;
		this.anInt440 = 0;
		this.anInt436 = 0;
		this.anInt425 = 0;
		for (@Pc(105) int local105 = 0; local105 < this.anInt423; local105++) {
			this.anEntityArray1[local105] = null;
		}
		for (@Pc(119) int local119 = 0; local119 < this.anInt424; local119++) {
			this.anEntityArray2[local119] = null;
		}
		this.anInt433 = 0;
		for (@Pc(136) int local136 = 0; local136 < this.anInt431; local136++) {
			this.anEntityArray4[local136] = null;
		}
		for (@Pc(150) int local150 = 0; local150 < this.anInt432; local150++) {
			this.anEntityArray5[local150] = null;
		}
		for (@Pc(164) int local164 = 0; local164 < 50; local164++) {
			this.aBooleanArray14[local164] = false;
		}
		this.anInt374 = 0;
		super.mouseClickButton = 0;
		super.mouseButton = 0;
		this.aBoolean92 = false;
		this.aBoolean93 = false;
		this.aBoolean104 = false;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "s", descriptor = "()V")
	@Override
	protected void method491() {
		@Pc(5) String local5 = this.aGui6.method105(this.anInt519);
		@Pc(11) String local11 = this.aGui6.method105(this.anInt520);
		this.anInt513 = 2;
		this.aGui7.method104(this.anInt523, "Please enter your username and password");
		this.aGui7.method104(this.anInt524, local5);
		this.aGui7.method104(this.anInt525, local11);
		this.method520();
		this.reset();
		this.method469(local5, local11, false);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "U", descriptor = "()V")
	private void method523() {
		this.method474();
		if (this.anInt509 > 0) {
			this.anInt509--;
		}
		if (super.idleCycles > 4500 && this.anInt510 == 0 && this.anInt509 == 0) {
			super.idleCycles -= 500;
			this.method507();
			return;
		}
		if (this.localPlayer.anInt296 == 8 || this.localPlayer.anInt296 == 9) {
			this.anInt510 = 500;
		}
		if (this.anInt510 > 0) {
			this.anInt510--;
		}
		if (this.aBoolean103) {
			this.method518();
		} else if (this.aBoolean100) {
			this.method510();
		} else if (this.aBoolean102) {
			this.method515();
		} else {
			@Pc(87) int local87;
			@Pc(96) int local96;
			@Pc(103) int local103;
			@Pc(113) int local113;
			for (@Pc(73) int local73 = 0; local73 < this.anInt425; local73++) {
				@Pc(80) Entity local80 = this.anEntityArray2[local73];
				local87 = (local80.anInt299 + 1) % 10;
				if (local80.anInt298 == local87) {
					local80.anInt296 = local80.anInt297;
				} else {
					@Pc(93) byte local93 = -1;
					local96 = local80.anInt298;
					if (local96 < local87) {
						local103 = local87 - local96;
					} else {
						local103 = local87 + 10 - local96;
					}
					local113 = 4;
					if (local103 > 2) {
						local113 = (local103 - 1) * 4;
					}
					if (local80.anIntArray145[local96] - local80.anInt292 <= this.anInt383 * 3 && local80.anIntArray146[local96] - local80.anInt293 <= this.anInt383 * 3 && local80.anIntArray145[local96] - local80.anInt292 >= -this.anInt383 * 3 && local80.anIntArray146[local96] - local80.anInt293 >= -this.anInt383 * 3 && local103 <= 8) {
						if (local80.anInt292 < local80.anIntArray145[local96]) {
							local80.anInt292 += local113;
							local80.anInt295++;
							local93 = 2;
						} else if (local80.anInt292 > local80.anIntArray145[local96]) {
							local80.anInt292 -= local113;
							local80.anInt295++;
							local93 = 6;
						}
						if (local80.anInt292 - local80.anIntArray145[local96] < local113 && local80.anInt292 - local80.anIntArray145[local96] > -local113) {
							local80.anInt292 = local80.anIntArray145[local96];
						}
						if (local80.anInt293 < local80.anIntArray146[local96]) {
							local80.anInt293 += local113;
							local80.anInt295++;
							if (local93 == -1) {
								local93 = 4;
							} else if (local93 == 2) {
								local93 = 3;
							} else {
								local93 = 5;
							}
						} else if (local80.anInt293 > local80.anIntArray146[local96]) {
							local80.anInt293 -= local113;
							local80.anInt295++;
							if (local93 == -1) {
								local93 = 0;
							} else if (local93 == 2) {
								local93 = 1;
							} else {
								local93 = 7;
							}
						}
						if (local80.anInt293 - local80.anIntArray146[local96] < local113 && local80.anInt293 - local80.anIntArray146[local96] > -local113) {
							local80.anInt293 = local80.anIntArray146[local96];
						}
					} else {
						local80.anInt292 = local80.anIntArray145[local96];
						local80.anInt293 = local80.anIntArray146[local96];
					}
					if (local93 != -1) {
						local80.anInt296 = local93;
					}
					if (local80.anInt292 == local80.anIntArray145[local96] && local80.anInt293 == local80.anIntArray146[local96]) {
						local80.anInt298 = (local96 + 1) % 10;
					}
				}
				if (local80.anInt300 > 0) {
					local80.anInt300--;
				}
				if (local80.anInt302 > 0) {
					local80.anInt302--;
				}
				if (local80.anInt306 > 0) {
					local80.anInt306--;
				}
				if (this.anInt511 > 0) {
					this.anInt511--;
					if (this.anInt511 == 0) {
						this.message("You have been granted another life. Be more careful this time!", 3);
					}
					if (this.anInt511 == 0) {
						this.message("You retain your skills. Your objects land where you died", 3);
					}
				}
			}
			@Pc(459) int local459;
			for (@Pc(445) int local445 = 0; local445 < this.anInt433; local445++) {
				@Pc(452) Entity local452 = this.anEntityArray5[local445];
				local459 = (local452.anInt299 + 1) % 10;
				if (local452.anInt298 == local459) {
					local452.anInt296 = local452.anInt297;
					if (local452.anInt294 == 43) {
						local452.anInt295++;
					}
				} else {
					@Pc(465) byte local465 = -1;
					local103 = local452.anInt298;
					if (local103 < local459) {
						local113 = local459 - local103;
					} else {
						local113 = local459 + 10 - local103;
					}
					@Pc(485) int local485 = 4;
					if (local113 > 2) {
						local485 = (local113 - 1) * 4;
					}
					if (local452.anIntArray145[local103] - local452.anInt292 <= this.anInt383 * 3 && local452.anIntArray146[local103] - local452.anInt293 <= this.anInt383 * 3 && local452.anIntArray145[local103] - local452.anInt292 >= -this.anInt383 * 3 && local452.anIntArray146[local103] - local452.anInt293 >= -this.anInt383 * 3 && local113 <= 8) {
						if (local452.anInt292 < local452.anIntArray145[local103]) {
							local452.anInt292 += local485;
							local452.anInt295++;
							local465 = 2;
						} else if (local452.anInt292 > local452.anIntArray145[local103]) {
							local452.anInt292 -= local485;
							local452.anInt295++;
							local465 = 6;
						}
						if (local452.anInt292 - local452.anIntArray145[local103] < local485 && local452.anInt292 - local452.anIntArray145[local103] > -local485) {
							local452.anInt292 = local452.anIntArray145[local103];
						}
						if (local452.anInt293 < local452.anIntArray146[local103]) {
							local452.anInt293 += local485;
							local452.anInt295++;
							if (local465 == -1) {
								local465 = 4;
							} else if (local465 == 2) {
								local465 = 3;
							} else {
								local465 = 5;
							}
						} else if (local452.anInt293 > local452.anIntArray146[local103]) {
							local452.anInt293 -= local485;
							local452.anInt295++;
							if (local465 == -1) {
								local465 = 0;
							} else if (local465 == 2) {
								local465 = 1;
							} else {
								local465 = 7;
							}
						}
						if (local452.anInt293 - local452.anIntArray146[local103] < local485 && local452.anInt293 - local452.anIntArray146[local103] > -local485) {
							local452.anInt293 = local452.anIntArray146[local103];
						}
					} else {
						local452.anInt292 = local452.anIntArray145[local103];
						local452.anInt293 = local452.anIntArray146[local103];
					}
					if (local465 != -1) {
						local452.anInt296 = local465;
					}
					if (local452.anInt292 == local452.anIntArray145[local103] && local452.anInt293 == local452.anIntArray146[local103]) {
						local452.anInt298 = (local103 + 1) % 10;
					}
				}
				if (local452.anInt300 > 0) {
					local452.anInt300--;
				}
				if (local452.anInt302 > 0) {
					local452.anInt302--;
				}
				if (local452.anInt306 > 0) {
					local452.anInt306--;
				}
			}
			for (local87 = 0; local87 < this.anInt425; local87++) {
				@Pc(811) Entity local811 = this.anEntityArray2[local87];
				if (local811.anInt315 > 0) {
					local811.anInt315--;
				}
			}
			if (!this.aBoolean73) {
				if (this.anInt418 - this.localPlayer.anInt292 < -500 || this.anInt418 - this.localPlayer.anInt292 > 500 || this.anInt419 - this.localPlayer.anInt293 < -500 || this.anInt419 - this.localPlayer.anInt293 > 500) {
					this.anInt418 = this.localPlayer.anInt292;
					this.anInt419 = this.localPlayer.anInt293;
				}
				if (this.anInt418 != this.localPlayer.anInt292) {
					this.anInt418 += (this.localPlayer.anInt292 - this.anInt418) / ((this.anInt417 - 500) / 15 + 16);
				}
				if (this.anInt419 != this.localPlayer.anInt293) {
					this.anInt419 += (this.localPlayer.anInt293 - this.anInt419) / ((this.anInt417 - 500) / 15 + 16);
				}
				if (this.cameraAngleMode) {
					local459 = this.anInt420 * 32;
					local96 = local459 - this.anInt422;
					@Pc(981) byte local981 = 1;
					if (local96 == 0) {
						this.anInt421 = 0;
					} else {
						this.anInt421++;
						if (local96 > 128) {
							local981 = -1;
							local96 = 256 - local96;
						} else if (local96 > 0) {
							local981 = 1;
						} else if (local96 < -128) {
							local981 = 1;
							local96 += 256;
						} else if (local96 < 0) {
							local981 = -1;
							local96 = -local96;
						}
						this.anInt422 += (this.anInt421 * local96 + 255) / 256 * local981;
						this.anInt422 &= 0xFF;
					}
				}
			} else if (this.anInt418 - this.localPlayer.anInt292 < -500 || this.anInt418 - this.localPlayer.anInt292 > 500 || this.anInt419 - this.localPlayer.anInt293 < -500 || this.anInt419 - this.localPlayer.anInt293 > 500) {
				this.anInt418 = this.localPlayer.anInt292;
				this.anInt419 = this.localPlayer.anInt293;
			}
			if (this.aBoolean104) {
				if (super.aString26.length() > 0) {
					if (super.aString26.equalsIgnoreCase("::lostcon") && !this.appletMode) {
						super.stream.close();
					} else if (super.aString26.equalsIgnoreCase("::closecon") && !this.appletMode) {
						this.method470();
					} else {
						super.stream.p1spooky(193, 127);
						super.stream.pjstr(super.aString26);
						super.stream.encryptPacket();
						super.aString25 = "";
						super.aString26 = "";
						this.aString43 = "Please wait...";
					}
				}
				if (super.mouseClickButton == 1 && super.mouseY > 275 && super.mouseY < 310 && super.mouseX > 56 && super.mouseX < 456) {
					super.stream.p1spooky(193, 127);
					super.stream.pjstr("-null-");
					super.stream.encryptPacket();
					super.aString25 = "";
					super.aString26 = "";
					this.aString43 = "Please wait...";
				}
				super.mouseClickButton = 0;
			} else {
				if (super.mouseY > this.anInt386 - 4) {
					if (super.mouseX > 15 && super.mouseX < 96 && super.mouseClickButton == 1) {
						this.anInt473 = 0;
					}
					if (super.mouseX > 110 && super.mouseX < 194 && super.mouseClickButton == 1) {
						this.anInt473 = 1;
						this.aGui4.anIntArray3[this.anInt469] = 999999;
					}
					if (super.mouseX > 215 && super.mouseX < 295 && super.mouseClickButton == 1) {
						this.anInt473 = 2;
						this.aGui4.anIntArray3[this.anInt471] = 999999;
					}
					if (super.mouseX > 315 && super.mouseX < 395 && super.mouseClickButton == 1) {
						this.anInt473 = 3;
						this.aGui4.anIntArray3[this.anInt472] = 999999;
					}
					if (super.mouseX > 417 && super.mouseX < 497 && super.mouseClickButton == 1) {
						this.anInt502 = 1;
						this.anInt503 = 0;
						super.aString25 = "";
						super.aString26 = "";
					}
					super.mouseClickButton = 0;
					super.mouseButton = 0;
				}
				this.aGui4.method72(super.mouseX, super.mouseY, super.mouseClickButton, super.mouseButton);
				if (this.anInt473 > 0 && super.mouseX >= 494 && super.mouseY >= this.anInt386 - 66) {
					super.mouseClickButton = 0;
				}
				if (this.aGui4.method73(this.anInt470)) {
					@Pc(1307) String local1307 = this.aGui4.method105(this.anInt470);
					this.aGui4.method104(this.anInt470, "");
					if (!local1307.startsWith("::")) {
						local96 = WordPack.method353(local1307);
						this.method484(WordPack.aByteArray17, local96);
						local1307 = WordPack.method352(WordPack.aByteArray17, 0, local96);
						local1307 = WordFilter.filter(local1307);
						this.localPlayer.anInt300 = 150;
						this.localPlayer.aString21 = local1307;
						this.message(this.localPlayer.aString20 + ": " + local1307, 2);
					} else if (local1307.equalsIgnoreCase("::lostcon") && !this.appletMode) {
						super.stream.close();
					} else if (local1307.equalsIgnoreCase("::closecon") && !this.appletMode) {
						this.method470();
					} else {
						this.method485(local1307.substring(2));
					}
				}
				@Pc(1402) int local1402;
				if (this.anInt473 == 0) {
					for (local459 = 0; local459 < this.anInt474; local459++) {
						if (this.anIntArray200[local459] > 0) {
							local1402 = this.anIntArray200[local459]--;
						}
					}
				}
				if (this.anInt511 != 0) {
					super.mouseClickButton = 0;
				}
				if (this.aBoolean87 || this.aBoolean78) {
					if (super.mouseButton == 0) {
						this.anInt485 = 0;
					} else {
						this.anInt485++;
					}
					if (this.anInt485 > 600) {
						this.anInt486 += 5000;
					} else if (this.anInt485 > 450) {
						this.anInt486 += 500;
					} else if (this.anInt485 > 300) {
						this.anInt486 += 50;
					} else if (this.anInt485 > 150) {
						this.anInt486 += 5;
					} else if (this.anInt485 > 50) {
						this.anInt486++;
					} else if (this.anInt485 > 20 && (this.anInt485 & 0x5) == 0) {
						this.anInt486++;
					}
				} else {
					this.anInt485 = 0;
					this.anInt486 = 0;
				}
				if (super.mouseClickButton == 1) {
					this.anInt374 = 1;
				} else if (super.mouseClickButton == 2) {
					this.anInt374 = 2;
				}
				this.world3D.method206(super.mouseX, super.mouseY);
				super.mouseClickButton = 0;
				if (this.cameraAngleMode) {
					if (this.anInt421 == 0 || this.aBoolean73) {
						if (super.keyArrowLeft) {
							this.anInt420 = this.anInt420 + 1 & 0x7;
							super.keyArrowLeft = false;
							if (!this.aBoolean72) {
								if ((this.anInt420 & 0x1) == 0) {
									this.anInt420 = this.anInt420 + 1 & 0x7;
								}
								for (local459 = 0; local459 < 8 && !this.method528(this.anInt420); local459++) {
									this.anInt420 = this.anInt420 + 1 & 0x7;
								}
							}
						}
						if (super.keyArrowRight) {
							this.anInt420 = this.anInt420 + 7 & 0x7;
							super.keyArrowRight = false;
							if (!this.aBoolean72) {
								if ((this.anInt420 & 0x1) == 0) {
									this.anInt420 = this.anInt420 + 7 & 0x7;
								}
								for (local459 = 0; local459 < 8 && !this.method528(this.anInt420); local459++) {
									this.anInt420 = this.anInt420 + 7 & 0x7;
								}
							}
						}
					}
				} else if (super.keyArrowLeft) {
					this.anInt422 = this.anInt422 + 2 & 0xFF;
				} else if (super.keyArrowRight) {
					this.anInt422 = this.anInt422 - 2 & 0xFF;
				}
				if (this.aBoolean72 && this.anInt417 > 550) {
					this.anInt417 -= 4;
				} else if (!this.aBoolean72 && this.anInt417 < 750) {
					this.anInt417 += 4;
				}
				if (this.anInt403 > 0) {
					this.anInt403--;
				} else if (this.anInt403 < 0) {
					this.anInt403++;
				}
				this.world3D.method236(17);
				this.anInt396++;
				if (this.anInt396 > 5) {
					this.anInt396 = 0;
					this.anInt397 = (this.anInt397 + 1) % 3;
					this.anInt398 = (this.anInt398 + 1) % 4;
					this.anInt399 = (this.anInt399 + 1) % 5;
				}
				for (local459 = 0; local459 < this.anInt438; local459++) {
					local96 = this.anIntArray177[local459];
					local103 = this.anIntArray178[local459];
					if (local96 >= 0 && local103 >= 0 && local96 < 96 && local103 < 96 && this.anIntArray179[local459] == 74) {
						this.anObject3DArray4[local459].method126(1, 0, 0);
					}
				}
				for (local96 = 0; local96 < this.anInt571; local96++) {
					local1402 = this.anIntArray250[local96]++;
					if (this.anIntArray250[local96] > 50) {
						this.anInt571--;
						for (local103 = local96; local103 < this.anInt571; local103++) {
							this.anIntArray248[local103] = this.anIntArray248[local103 + 1];
							this.anIntArray249[local103] = this.anIntArray249[local103 + 1];
							this.anIntArray250[local103] = this.anIntArray250[local103 + 1];
							this.anIntArray251[local103] = this.anIntArray251[local103 + 1];
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "b", descriptor = "(Ljava/lang/String;I)V")
	private void message(@OriginalArg(0) String str, @OriginalArg(1) int type) {
		@Pc(34) int local34;
		if (type == 2 || type == 4 || type == 6) {
			while (true) {
				if (str.length() <= 5 || str.charAt(0) != '@' || str.charAt(4) != '@') {
					local34 = str.indexOf(":");
					if (local34 != -1) {
						@Pc(42) String local42 = str.substring(0, local34);
						@Pc(45) long local45 = Tools.toBase37(local42);
						for (@Pc(47) int local47 = 0; local47 < super.anInt365; local47++) {
							if (super.ignoreName37[local47] == local45) {
								return;
							}
						}
					}
					break;
				}
				str = str.substring(5);
			}
		}
		if (type == 2) {
			str = "@yel@" + str;
		}
		if (type == 3 || type == 4) {
			str = "@whi@" + str;
		}
		if (type == 6) {
			str = "@cya@" + str;
		}
		if (this.anInt473 != 0) {
			if (type == 4 || type == 3) {
				this.anInt465 = 200;
			}
			if (type == 2 && this.anInt473 != 1) {
				this.anInt466 = 200;
			}
			if (type == 5 && this.anInt473 != 2) {
				this.anInt467 = 200;
			}
			if (type == 6 && this.anInt473 != 3) {
				this.anInt468 = 200;
			}
			if (type == 3 && this.anInt473 != 0) {
				this.anInt473 = 0;
			}
			if (type == 6 && this.anInt473 != 3 && this.anInt473 != 0) {
				this.anInt473 = 0;
			}
		}
		for (local34 = this.anInt474 - 1; local34 > 0; local34--) {
			this.aStringArray35[local34] = this.aStringArray35[local34 - 1];
			this.anIntArray200[local34] = this.anIntArray200[local34 - 1];
		}
		this.aStringArray35[0] = str;
		this.anIntArray200[0] = 300;
		if (type == 2) {
			if (this.aGui4.anIntArray3[this.anInt469] == this.aGui4.anIntArray4[this.anInt469] - 4) {
				this.aGui4.method103(this.anInt469, str, true);
			} else {
				this.aGui4.method103(this.anInt469, str, false);
			}
		}
		if (type == 5) {
			if (this.aGui4.anIntArray3[this.anInt471] == this.aGui4.anIntArray4[this.anInt471] - 4) {
				this.aGui4.method103(this.anInt471, str, true);
			} else {
				this.aGui4.method103(this.anInt471, str, false);
			}
		}
		if (type != 6) {
			return;
		}
		if (this.aGui4.anIntArray3[this.anInt472] == this.aGui4.anIntArray4[this.anInt472] - 4) {
			this.aGui4.method103(this.anInt472, str, true);
			return;
		}
		this.aGui4.method103(this.anInt472, str, false);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "d", descriptor = "(Ljava/lang/String;)V")
	@Override
	protected void method493(@OriginalArg(0) String arg0) {
		if (arg0.startsWith("@bor@")) {
			this.message(arg0, 4);
		} else if (arg0.startsWith("@que@")) {
			this.message("@whi@" + arg0, 5);
		} else if (arg0.startsWith("@pri@")) {
			this.message(arg0, 6);
		} else {
			this.message(arg0, 3);
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "b", descriptor = "(IIII)Lmudclient!c;")
	private Entity method525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anEntityArray1[arg0] == null) {
			this.anEntityArray1[arg0] = new Entity();
			this.anEntityArray1[arg0].anInt290 = arg0;
			this.anEntityArray1[arg0].anInt291 = 0;
		}
		@Pc(30) Entity local30 = this.anEntityArray1[arg0];
		@Pc(32) boolean local32 = false;
		for (@Pc(34) int local34 = 0; local34 < this.anInt426; local34++) {
			if (this.anEntityArray3[local34].anInt290 == arg0) {
				local32 = true;
				break;
			}
		}
		if (local32) {
			local30.anInt297 = arg3;
			@Pc(60) int local60 = local30.anInt299;
			if (arg1 != local30.anIntArray145[local60] || arg2 != local30.anIntArray146[local60]) {
				@Pc(80) int local80;
				local30.anInt299 = local80 = (local60 + 1) % 10;
				local30.anIntArray145[local80] = arg1;
				local30.anIntArray146[local80] = arg2;
			}
		} else {
			local30.anInt290 = arg0;
			local30.anInt298 = 0;
			local30.anInt299 = 0;
			local30.anIntArray145[0] = local30.anInt292 = arg1;
			local30.anIntArray146[0] = local30.anInt293 = arg2;
			local30.anInt297 = local30.anInt296 = arg3;
			local30.anInt295 = 0;
		}
		this.anEntityArray2[this.anInt425++] = local30;
		return local30;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "a", descriptor = "(IIIII)Lmudclient!c;")
	private Entity method526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anEntityArray4[arg0] == null) {
			this.anEntityArray4[arg0] = new Entity();
			this.anEntityArray4[arg0].anInt290 = arg0;
		}
		@Pc(24) Entity local24 = this.anEntityArray4[arg0];
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < this.anInt434; local28++) {
			if (this.anEntityArray6[local28].anInt290 == arg0) {
				local26 = true;
				break;
			}
		}
		if (local26) {
			local24.anInt294 = arg4;
			local24.anInt297 = arg3;
			@Pc(57) int local57 = local24.anInt299;
			if (arg1 != local24.anIntArray145[local57] || arg2 != local24.anIntArray146[local57]) {
				@Pc(77) int local77;
				local24.anInt299 = local77 = (local57 + 1) % 10;
				local24.anIntArray145[local77] = arg1;
				local24.anIntArray146[local77] = arg2;
			}
		} else {
			local24.anInt290 = arg0;
			local24.anInt298 = 0;
			local24.anInt299 = 0;
			local24.anIntArray145[0] = local24.anInt292 = arg1;
			local24.anIntArray146[0] = local24.anInt293 = arg2;
			local24.anInt294 = arg4;
			local24.anInt297 = local24.anInt296 = arg3;
			local24.anInt295 = 0;
		}
		this.anEntityArray5[this.anInt433++] = local24;
		return local24;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "a", descriptor = "(II[B)V")
	@Override
	protected void method492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(46) int local46;
		try {
			@Pc(76) int local76;
			@Pc(84) int local84;
			@Pc(131) int local131;
			@Pc(294) int local294;
			@Pc(148) int local148;
			@Pc(156) int local156;
			@Pc(164) int local164;
			@Pc(10) int local10;
			@Pc(34) int local34;
			@Pc(134) int local134;
			@Pc(27) byte local27;
			if (arg0 == 255) {
				this.anInt426 = this.anInt425;
				for (local10 = 0; local10 < this.anInt426; local10++) {
					this.anEntityArray3[local10] = this.anEntityArray2[local10];
				}
				local27 = 8;
				this.anInt428 = Tools.gBit(arg2, local27, 11);
				local34 = local27 + 11;
				this.anInt429 = Tools.gBit(arg2, local34, 13);
				local34 += 13;
				local46 = Tools.gBit(arg2, local34, 4);
				local34 += 4;
				@Pc(54) boolean local54 = this.method547(this.anInt428, this.anInt429);
				this.anInt428 -= this.anInt410;
				this.anInt429 -= this.anInt411;
				local76 = this.anInt428 * this.anInt383 + 64;
				local84 = this.anInt429 * this.anInt383 + 64;
				if (local54) {
					this.localPlayer.anInt299 = 0;
					this.localPlayer.anInt298 = 0;
					this.localPlayer.anInt292 = this.localPlayer.anIntArray145[0] = local76;
					this.localPlayer.anInt293 = this.localPlayer.anIntArray146[0] = local84;
				}
				this.anInt425 = 0;
				this.localPlayer = this.method525(this.anInt430, local76, local84, local46);
				local131 = Tools.gBit(arg2, local34, 8);
				local34 += 8;
				local134 = 0;
				while (true) {
					@Pc(168) int local168;
					if (local134 >= local131) {
						local294 = 0;
						while (local34 + 24 < arg1 * 8) {
							local148 = Tools.gBit(arg2, local34, 11);
							local34 += 11;
							local156 = Tools.gBit(arg2, local34, 5);
							local34 += 5;
							if (local156 > 15) {
								local156 -= 32;
							}
							local164 = Tools.gBit(arg2, local34, 5);
							local34 += 5;
							if (local164 > 15) {
								local164 -= 32;
							}
							local46 = Tools.gBit(arg2, local34, 4);
							local34 += 4;
							local168 = Tools.gBit(arg2, local34, 1);
							local34++;
							local76 = (this.anInt428 + local156) * this.anInt383 + 64;
							local84 = (this.anInt429 + local164) * this.anInt383 + 64;
							this.method525(local148, local76, local84, local46);
							if (local168 == 0) {
								this.anIntArray172[local294++] = local148;
							}
						}
						if (local294 > 0) {
							super.stream.p1spooky(254, 120);
							super.stream.p2(local294);
							for (local148 = 0; local148 < local294; local148++) {
								@Pc(399) Entity local399 = this.anEntityArray1[this.anIntArray172[local148]];
								super.stream.p2(local399.anInt290);
								super.stream.p2(local399.anInt291);
							}
							super.stream.encryptPacket();
							return;
						}
						break;
					}
					label1129: {
						@Pc(143) Entity local143 = this.anEntityArray3[local134 + 1];
						local148 = Tools.gBit(arg2, local34, 1);
						local34++;
						if (local148 != 0) {
							local156 = Tools.gBit(arg2, local34, 1);
							local34++;
							if (local156 == 0) {
								local164 = Tools.gBit(arg2, local34, 3);
								local34 += 3;
								local168 = local143.anInt299;
								@Pc(173) int local173 = local143.anIntArray145[local168];
								@Pc(178) int local178 = local143.anIntArray146[local168];
								if (local164 == 2 || local164 == 1 || local164 == 3) {
									local173 += this.anInt383;
								}
								if (local164 == 6 || local164 == 5 || local164 == 7) {
									local173 -= this.anInt383;
								}
								if (local164 == 4 || local164 == 3 || local164 == 5) {
									local178 += this.anInt383;
								}
								if (local164 == 0 || local164 == 1 || local164 == 7) {
									local178 -= this.anInt383;
								}
								local143.anInt297 = local164;
								@Pc(244) int local244;
								local143.anInt299 = local244 = (local168 + 1) % 10;
								local143.anIntArray145[local244] = local173;
								local143.anIntArray146[local244] = local178;
							} else {
								local164 = Tools.gBit(arg2, local34, 4);
								if ((local164 & 0xC) == 12) {
									local34 += 2;
									break label1129;
								}
								local143.anInt297 = Tools.gBit(arg2, local34, 4);
								local34 += 4;
							}
						}
						this.anEntityArray2[this.anInt425++] = local143;
					}
					local134++;
				}
			} else {
				@Pc(456) int local456;
				if (arg0 == 254) {
					local10 = 1;
					while (true) {
						while (local10 < arg1) {
							if (Tools.g1(arg2[local10]) == 255) {
								local34 = 0;
								local46 = this.anInt428 + arg2[local10 + 1] >> 3;
								local456 = this.anInt429 + arg2[local10 + 2] >> 3;
								local10 += 3;
								for (local76 = 0; local76 < this.anInt436; local76++) {
									local84 = (this.anIntArray173[local76] >> 3) - local46;
									local131 = (this.anIntArray174[local76] >> 3) - local456;
									if (local84 != 0 || local131 != 0) {
										if (local76 != local34) {
											this.anIntArray173[local34] = this.anIntArray173[local76];
											this.anIntArray174[local34] = this.anIntArray174[local76];
											this.anIntArray175[local34] = this.anIntArray175[local76];
											this.anIntArray176[local34] = this.anIntArray176[local76];
										}
										local34++;
									}
								}
								this.anInt436 = local34;
							} else {
								local34 = Tools.g2(arg2, local10);
								local10 += 2;
								local46 = this.anInt428 + arg2[local10++];
								local456 = this.anInt429 + arg2[local10++];
								if ((local34 & 0x8000) == 0) {
									this.anIntArray173[this.anInt436] = local46;
									this.anIntArray174[this.anInt436] = local456;
									this.anIntArray175[this.anInt436] = local34;
									this.anIntArray176[this.anInt436] = 0;
									for (local76 = 0; local76 < this.anInt438; local76++) {
										if (this.anIntArray177[local76] == local46 && this.anIntArray178[local76] == local456) {
											this.anIntArray176[this.anInt436] = ClientConfig.locElevation[this.anIntArray179[local76]];
											break;
										}
									}
									this.anInt436++;
								} else {
									local34 &= 0x7FFF;
									local76 = 0;
									for (local84 = 0; local84 < this.anInt436; local84++) {
										if (this.anIntArray173[local84] == local46 && this.anIntArray174[local84] == local456 && this.anIntArray175[local84] == local34) {
											local34 = -123;
										} else {
											if (local84 != local76) {
												this.anIntArray173[local76] = this.anIntArray173[local84];
												this.anIntArray174[local76] = this.anIntArray174[local84];
												this.anIntArray175[local76] = this.anIntArray175[local84];
												this.anIntArray176[local76] = this.anIntArray176[local84];
											}
											local76++;
										}
									}
									this.anInt436 = local76;
								}
							}
						}
						return;
					}
				}
				if (arg0 == 253) {
					local10 = 1;
					while (true) {
						while (local10 < arg1) {
							if (Tools.g1(arg2[local10]) == 255) {
								local34 = 0;
								local46 = this.anInt428 + arg2[local10 + 1] >> 3;
								local456 = this.anInt429 + arg2[local10 + 2] >> 3;
								local10 += 3;
								for (local76 = 0; local76 < this.anInt438; local76++) {
									local84 = (this.anIntArray177[local76] >> 3) - local46;
									local131 = (this.anIntArray178[local76] >> 3) - local456;
									if (local84 == 0 && local131 == 0) {
										this.world3D.method199(this.anObject3DArray4[local76]);
										this.world.method419(this.anIntArray177[local76], this.anIntArray178[local76], this.anIntArray179[local76]);
									} else {
										if (local76 != local34) {
											this.anObject3DArray4[local34] = this.anObject3DArray4[local76];
											this.anObject3DArray4[local34].anInt88 = local34;
											this.anIntArray177[local34] = this.anIntArray177[local76];
											this.anIntArray178[local34] = this.anIntArray178[local76];
											this.anIntArray179[local34] = this.anIntArray179[local76];
											this.anIntArray180[local34] = this.anIntArray180[local76];
										}
										local34++;
									}
								}
								this.anInt438 = local34;
							} else {
								local34 = Tools.g2(arg2, local10);
								local10 += 2;
								local46 = this.anInt428 + arg2[local10++];
								local456 = this.anInt429 + arg2[local10++];
								local76 = 0;
								for (local84 = 0; local84 < this.anInt438; local84++) {
									if (this.anIntArray177[local84] == local46 && this.anIntArray178[local84] == local456) {
										this.world3D.method199(this.anObject3DArray4[local84]);
										this.world.method419(this.anIntArray177[local84], this.anIntArray178[local84], this.anIntArray179[local84]);
									} else {
										if (local84 != local76) {
											this.anObject3DArray4[local76] = this.anObject3DArray4[local84];
											this.anObject3DArray4[local76].anInt88 = local76;
											this.anIntArray177[local76] = this.anIntArray177[local84];
											this.anIntArray178[local76] = this.anIntArray178[local84];
											this.anIntArray179[local76] = this.anIntArray179[local84];
											this.anIntArray180[local76] = this.anIntArray180[local84];
										}
										local76++;
									}
								}
								this.anInt438 = local76;
								if (local34 != 60000) {
									local131 = this.world.method433(local46, local456);
									if (local131 == 0 || local131 == 4) {
										local134 = ClientConfig.locWidth[local34];
										local294 = ClientConfig.locLength[local34];
									} else {
										local294 = ClientConfig.locWidth[local34];
										local134 = ClientConfig.locLength[local34];
									}
									local148 = (local46 + local46 + local134) * this.anInt383 / 2;
									local156 = (local456 + local456 + local294) * this.anInt383 / 2;
									local164 = ClientConfig.locModel[local34];
									@Pc(1033) Object3D local1033 = this.anObject3DArray5[local164].method141();
									this.world3D.method198(local1033);
									local1033.anInt88 = this.anInt438;
									local1033.method126(0, local131 * 32, 0);
									local1033.method128(local148, -this.world.method424(local148, local156), local156);
									local1033.method122(true, 48, 48, -50, -10, -50);
									this.world.method418(local46, local456, local34);
									if (local34 == 74) {
										local1033.method128(0, -480, 0);
									}
									this.anIntArray177[this.anInt438] = local46;
									this.anIntArray178[this.anInt438] = local456;
									this.anIntArray179[this.anInt438] = local34;
									this.anIntArray180[this.anInt438] = local131;
									this.anObject3DArray4[this.anInt438++] = local1033;
								}
							}
						}
						return;
					}
				}
				@Pc(1124) byte local1124;
				if (arg0 == 252) {
					local1124 = 1;
					local10 = local1124 + 1;
					this.anInt443 = arg2[local1124] & 0xFF;
					for (local34 = 0; local34 < this.anInt443; local34++) {
						local46 = Tools.g2(arg2, local10);
						local10 += 2;
						this.anIntArray185[local34] = local46 & 0x7FFF;
						this.anIntArray187[local34] = local46 / 32768;
						if (ClientConfig.objStackable[local46 & 0x7FFF] == 0) {
							this.anIntArray186[local34] = Tools.gsmart(arg2, local10);
							if (this.anIntArray186[local34] >= 128) {
								local10 += 4;
							} else {
								local10++;
							}
						} else {
							this.anIntArray186[local34] = 1;
						}
					}
					return;
				}
				@Pc(1214) Entity local1214;
				if (arg0 == 250) {
					local10 = Tools.g2(arg2, 1);
					local34 = 3;
					for (local46 = 0; local46 < local10; local46++) {
						local456 = Tools.g2(arg2, local34);
						local34 += 2;
						local1214 = this.anEntityArray1[local456];
						@Pc(1218) byte local1218 = arg2[local34];
						local34++;
						if (local1218 == 0) {
							local131 = Tools.g2(arg2, local34);
							local34 += 2;
							if (local1214 != null) {
								local1214.anInt302 = 150;
								local1214.anInt301 = local131;
							}
						} else {
							@Pc(1243) byte local1243;
							@Pc(1252) String local1252;
							if (local1218 == 1) {
								local1243 = arg2[local34];
								local34++;
								if (local1214 != null) {
									local1252 = WordFilter.filter(WordPack.method352(arg2, local34, local1243));
									@Pc(1254) boolean local1254 = false;
									for (local148 = 0; local148 < super.anInt365; local148++) {
										if (super.ignoreName37[local148] == local1214.aLong3) {
											local1254 = true;
										}
									}
									if (!local1254) {
										local1214.anInt300 = 150;
										local1214.aString21 = local1252;
										this.message(local1214.aString20 + ": " + local1214.aString21, 2);
									}
								}
								local34 += local1243;
							} else if (local1218 == 2) {
								local131 = Tools.g1(arg2[local34]);
								local34++;
								local134 = Tools.g1(arg2[local34]);
								local34++;
								local294 = Tools.g1(arg2[local34]);
								local34++;
								if (local1214 != null) {
									local1214.anInt303 = local131;
									local1214.anInt304 = local134;
									local1214.anInt305 = local294;
									local1214.anInt306 = 200;
									if (local1214 == this.localPlayer) {
										this.anIntArray189[3] = local134;
										this.anIntArray190[3] = local294;
										this.aBoolean96 = false;
										this.aBoolean98 = false;
									}
								}
							} else if (local1218 == 3) {
								local131 = Tools.g2(arg2, local34);
								local34 += 2;
								local134 = Tools.g2(arg2, local34);
								local34 += 2;
								if (local1214 != null) {
									local1214.anInt312 = local131;
									local1214.anInt314 = local134;
									local1214.anInt313 = -1;
									local1214.anInt315 = this.anInt395;
								}
							} else if (local1218 == 4) {
								local131 = Tools.g2(arg2, local34);
								local34 += 2;
								local134 = Tools.g2(arg2, local34);
								local34 += 2;
								if (local1214 != null) {
									local1214.anInt312 = local131;
									local1214.anInt313 = local134;
									local1214.anInt314 = -1;
									local1214.anInt315 = this.anInt395;
								}
							} else if (local1218 == 5) {
								if (local1214 == null) {
									local34 += 14;
									local131 = Tools.g1(arg2[local34]);
									local34 += local131 + 1;
								} else {
									local1214.anInt291 = Tools.g2(arg2, local34);
									local34 += 2;
									local1214.aLong3 = Tools.g8(arg2, local34);
									local34 += 8;
									local1214.aString20 = Tools.fromBase37(local1214.aLong3);
									local131 = Tools.g1(arg2[local34]);
									local34++;
									for (local134 = 0; local134 < local131; local134++) {
										local1214.anIntArray147[local134] = Tools.g1(arg2[local34]);
										local34++;
									}
									for (local294 = local131; local294 < 12; local294++) {
										local1214.anIntArray147[local294] = 0;
									}
									local1214.anInt308 = arg2[local34++] & 0xFF;
									local1214.anInt309 = arg2[local34++] & 0xFF;
									local1214.anInt310 = arg2[local34++] & 0xFF;
									local1214.anInt311 = arg2[local34++] & 0xFF;
									local1214.combatLevel = arg2[local34++] & 0xFF;
									local1214.anInt317 = arg2[local34++] & 0xFF;
								}
							} else if (local1218 == 6) {
								local1243 = arg2[local34];
								local34++;
								if (local1214 != null) {
									local1252 = WordPack.method352(arg2, local34, local1243);
									local1214.anInt300 = 150;
									local1214.aString21 = local1252;
									if (local1214 == this.localPlayer) {
										this.message(local1214.aString20 + ": " + local1214.aString21, 5);
									}
								}
								local34 += local1243;
							}
						}
					}
					return;
				}
				if (arg0 == 249) {
					local10 = 1;
					while (true) {
						while (local10 < arg1) {
							if (Tools.g1(arg2[local10]) == 255) {
								local34 = 0;
								local46 = this.anInt428 + arg2[local10 + 1] >> 3;
								local456 = this.anInt429 + arg2[local10 + 2] >> 3;
								local10 += 3;
								for (local76 = 0; local76 < this.anInt440; local76++) {
									local84 = (this.anIntArray181[local76] >> 3) - local46;
									local131 = (this.anIntArray182[local76] >> 3) - local456;
									if (local84 == 0 && local131 == 0) {
										this.world3D.method199(this.anObject3DArray6[local76]);
										this.world.method417(this.anIntArray181[local76], this.anIntArray182[local76], this.anIntArray183[local76], this.anIntArray184[local76]);
									} else {
										if (local76 != local34) {
											this.anObject3DArray6[local34] = this.anObject3DArray6[local76];
											this.anObject3DArray6[local34].anInt88 = local34 + 10000;
											this.anIntArray181[local34] = this.anIntArray181[local76];
											this.anIntArray182[local34] = this.anIntArray182[local76];
											this.anIntArray183[local34] = this.anIntArray183[local76];
											this.anIntArray184[local34] = this.anIntArray184[local76];
										}
										local34++;
									}
								}
								this.anInt440 = local34;
							} else {
								local34 = Tools.g2(arg2, local10);
								local10 += 2;
								local46 = this.anInt428 + arg2[local10++];
								local456 = this.anInt429 + arg2[local10++];
								@Pc(1770) byte local1770 = arg2[local10++];
								local84 = 0;
								for (local131 = 0; local131 < this.anInt440; local131++) {
									if (this.anIntArray181[local131] == local46 && this.anIntArray182[local131] == local456 && this.anIntArray183[local131] == local1770) {
										this.world3D.method199(this.anObject3DArray6[local131]);
										this.world.method417(this.anIntArray181[local131], this.anIntArray182[local131], this.anIntArray183[local131], this.anIntArray184[local131]);
									} else {
										if (local131 != local84) {
											this.anObject3DArray6[local84] = this.anObject3DArray6[local131];
											this.anObject3DArray6[local84].anInt88 = local84 + 10000;
											this.anIntArray181[local84] = this.anIntArray181[local131];
											this.anIntArray182[local84] = this.anIntArray182[local131];
											this.anIntArray183[local84] = this.anIntArray183[local131];
											this.anIntArray184[local84] = this.anIntArray184[local131];
										}
										local84++;
									}
								}
								this.anInt440 = local84;
								if (local34 != 65535) {
									this.world.method416(local46, local456, local1770, local34);
									@Pc(1901) Object3D local1901 = this.method548(local46, local456, local1770, local34, this.anInt440);
									this.anObject3DArray6[this.anInt440] = local1901;
									this.anIntArray181[this.anInt440] = local46;
									this.anIntArray182[this.anInt440] = local456;
									this.anIntArray184[this.anInt440] = local34;
									this.anIntArray183[this.anInt440++] = local1770;
								}
							}
						}
						return;
					}
				}
				if (arg0 == 248) {
					this.anInt434 = this.anInt433;
					this.anInt433 = 0;
					for (local10 = 0; local10 < this.anInt434; local10++) {
						this.anEntityArray6[local10] = this.anEntityArray5[local10];
					}
					local27 = 8;
					local46 = Tools.gBit(arg2, local27, 8);
					local34 = local27 + 8;
					for (local456 = 0; local456 < local46; local456++) {
						local1214 = this.anEntityArray6[local456];
						local84 = Tools.gBit(arg2, local34, 1);
						local34++;
						if (local84 != 0) {
							local131 = Tools.gBit(arg2, local34, 1);
							local34++;
							if (local131 == 0) {
								local134 = Tools.gBit(arg2, local34, 3);
								local34 += 3;
								local294 = local1214.anInt299;
								local148 = local1214.anIntArray145[local294];
								local156 = local1214.anIntArray146[local294];
								if (local134 == 2 || local134 == 1 || local134 == 3) {
									local148 += this.anInt383;
								}
								if (local134 == 6 || local134 == 5 || local134 == 7) {
									local148 -= this.anInt383;
								}
								if (local134 == 4 || local134 == 3 || local134 == 5) {
									local156 += this.anInt383;
								}
								if (local134 == 0 || local134 == 1 || local134 == 7) {
									local156 -= this.anInt383;
								}
								local1214.anInt297 = local134;
								@Pc(2085) int local2085;
								local1214.anInt299 = local2085 = (local294 + 1) % 10;
								local1214.anIntArray145[local2085] = local148;
								local1214.anIntArray146[local2085] = local156;
							} else {
								local134 = Tools.gBit(arg2, local34, 4);
								if ((local134 & 0xC) == 12) {
									local34 += 2;
									continue;
								}
								local1214.anInt297 = Tools.gBit(arg2, local34, 4);
								local34 += 4;
							}
						}
						this.anEntityArray5[this.anInt433++] = local1214;
					}
					while (local34 + 34 < arg1 * 8) {
						local76 = Tools.gBit(arg2, local34, 12);
						local34 += 12;
						local84 = Tools.gBit(arg2, local34, 5);
						local34 += 5;
						if (local84 > 15) {
							local84 -= 32;
						}
						local131 = Tools.gBit(arg2, local34, 5);
						local34 += 5;
						if (local131 > 15) {
							local131 -= 32;
						}
						local134 = Tools.gBit(arg2, local34, 4);
						local34 += 4;
						local294 = (this.anInt428 + local84) * this.anInt383 + 64;
						local148 = (this.anInt429 + local131) * this.anInt383 + 64;
						local156 = Tools.gBit(arg2, local34, 10);
						local34 += 10;
						if (local156 >= ClientConfig.npcCount) {
							local156 = 24;
						}
						this.method526(local76, local294, local148, local134, local156);
					}
					return;
				}
				if (arg0 == 247) {
					local10 = Tools.g2(arg2, 1);
					local34 = 3;
					for (local46 = 0; local46 < local10; local46++) {
						local456 = Tools.g2(arg2, local34);
						local34 += 2;
						local1214 = this.anEntityArray4[local456];
						local84 = Tools.g1(arg2[local34]);
						local34++;
						if (local84 == 1) {
							local131 = Tools.g2(arg2, local34);
							local34 += 2;
							@Pc(2255) byte local2255 = arg2[local34];
							local34++;
							if (local1214 != null) {
								@Pc(2263) String local2263 = WordPack.method352(arg2, local34, local2255);
								local1214.anInt300 = 150;
								local1214.aString21 = local2263;
								if (local131 == this.localPlayer.anInt290) {
									this.message("@yel@" + ClientConfig.npcName[local1214.anInt294] + ": " + local1214.aString21, 5);
								}
							}
							local34 += local2255;
						} else if (local84 == 2) {
							local131 = Tools.g1(arg2[local34]);
							local34++;
							local134 = Tools.g1(arg2[local34]);
							local34++;
							local294 = Tools.g1(arg2[local34]);
							local34++;
							if (local1214 != null) {
								local1214.anInt303 = local131;
								local1214.anInt304 = local134;
								local1214.anInt305 = local294;
								local1214.anInt306 = 200;
							}
						}
					}
					return;
				}
				if (arg0 == 246) {
					this.aBoolean94 = true;
					local10 = Tools.g1(arg2[1]);
					this.anInt499 = local10;
					local34 = 2;
					for (local46 = 0; local46 < local10; local46++) {
						local456 = Tools.g1(arg2[local34]);
						local34++;
						this.aStringArray36[local46] = new String(arg2, local34, local456);
						local34 += local456;
					}
					return;
				}
				if (arg0 == 245) {
					this.aBoolean94 = false;
					return;
				}
				if (arg0 == 244) {
					this.aBoolean99 = true;
					this.anInt430 = Tools.g2(arg2, 1);
					this.anInt406 = Tools.g2(arg2, 3);
					this.anInt407 = Tools.g2(arg2, 5);
					this.anInt412 = Tools.g2(arg2, 7);
					this.anInt408 = Tools.g2(arg2, 9);
					this.anInt407 -= this.anInt412 * this.anInt408;
					return;
				}
				if (arg0 == 243) {
					local10 = 1;
					for (local34 = 0; local34 < 18; local34++) {
						this.anIntArray189[local34] = Tools.g1(arg2[local10++]);
					}
					for (local46 = 0; local46 < 18; local46++) {
						this.anIntArray190[local46] = Tools.g1(arg2[local10++]);
					}
					for (local456 = 0; local456 < 18; local456++) {
						this.skillExperience[local456] = Tools.g4(arg2, local10);
						local10 += 4;
					}
					this.anInt446 = Tools.g1(arg2[local10++]);
					return;
				}
				if (arg0 == 242) {
					for (local10 = 0; local10 < 5; local10++) {
						this.anIntArray192[local10] = Tools.g1(arg2[local10 + 1]);
					}
					return;
				}
				if (arg0 == 241) {
					this.anInt511 = 250;
					return;
				}
				if (arg0 == 240) {
					local10 = (arg1 - 1) / 4;
					for (local34 = 0; local34 < local10; local34++) {
						local46 = this.anInt428 + Tools.g2s(arg2, local34 * 4 + 1) >> 3;
						local456 = this.anInt429 + Tools.g2s(arg2, local34 * 4 + 3) >> 3;
						local76 = 0;
						for (local84 = 0; local84 < this.anInt436; local84++) {
							local131 = (this.anIntArray173[local84] >> 3) - local46;
							local134 = (this.anIntArray174[local84] >> 3) - local456;
							if (local131 != 0 || local134 != 0) {
								if (local84 != local76) {
									this.anIntArray173[local76] = this.anIntArray173[local84];
									this.anIntArray174[local76] = this.anIntArray174[local84];
									this.anIntArray175[local76] = this.anIntArray175[local84];
									this.anIntArray176[local76] = this.anIntArray176[local84];
								}
								local76++;
							}
						}
						this.anInt436 = local76;
						local76 = 0;
						for (local131 = 0; local131 < this.anInt438; local131++) {
							local134 = (this.anIntArray177[local131] >> 3) - local46;
							local294 = (this.anIntArray178[local131] >> 3) - local456;
							if (local134 == 0 && local294 == 0) {
								this.world3D.method199(this.anObject3DArray4[local131]);
								this.world.method419(this.anIntArray177[local131], this.anIntArray178[local131], this.anIntArray179[local131]);
							} else {
								if (local131 != local76) {
									this.anObject3DArray4[local76] = this.anObject3DArray4[local131];
									this.anObject3DArray4[local76].anInt88 = local76;
									this.anIntArray177[local76] = this.anIntArray177[local131];
									this.anIntArray178[local76] = this.anIntArray178[local131];
									this.anIntArray179[local76] = this.anIntArray179[local131];
									this.anIntArray180[local76] = this.anIntArray180[local131];
								}
								local76++;
							}
						}
						this.anInt438 = local76;
						local76 = 0;
						for (local134 = 0; local134 < this.anInt440; local134++) {
							local294 = (this.anIntArray181[local134] >> 3) - local46;
							local148 = (this.anIntArray182[local134] >> 3) - local456;
							if (local294 == 0 && local148 == 0) {
								this.world3D.method199(this.anObject3DArray6[local134]);
								this.world.method417(this.anIntArray181[local134], this.anIntArray182[local134], this.anIntArray183[local134], this.anIntArray184[local134]);
							} else {
								if (local134 != local76) {
									this.anObject3DArray6[local76] = this.anObject3DArray6[local134];
									this.anObject3DArray6[local76].anInt88 = local76 + 10000;
									this.anIntArray181[local76] = this.anIntArray181[local134];
									this.anIntArray182[local76] = this.anIntArray182[local134];
									this.anIntArray183[local76] = this.anIntArray183[local134];
									this.anIntArray184[local76] = this.anIntArray184[local134];
								}
								local76++;
							}
						}
						this.anInt440 = local76;
					}
					return;
				}
				if (arg0 == 239) {
					this.aBoolean103 = true;
					return;
				}
				if (arg0 == 238) {
					local10 = Tools.g2(arg2, 1);
					if (this.anEntityArray1[local10] != null) {
						this.aString34 = this.anEntityArray1[local10].aString20;
					}
					this.aBoolean87 = true;
					this.aBoolean88 = false;
					this.aBoolean89 = false;
					this.anInt483 = 0;
					this.anInt484 = 0;
					return;
				}
				if (arg0 == 237) {
					this.aBoolean87 = false;
					this.aBoolean90 = false;
					return;
				}
				if (arg0 == 236) {
					this.anInt484 = arg2[1] & 0xFF;
					local10 = 2;
					for (local34 = 0; local34 < this.anInt484; local34++) {
						this.anIntArray211[local34] = Tools.g2(arg2, local10);
						local10 += 2;
						this.anIntArray212[local34] = Tools.g4(arg2, local10);
						local10 += 4;
					}
					this.aBoolean88 = false;
					this.aBoolean89 = false;
					return;
				}
				@Pc(2969) byte local2969;
				if (arg0 == 235) {
					local2969 = arg2[1];
					if (local2969 == 1) {
						this.aBoolean88 = true;
						return;
					}
					this.aBoolean88 = false;
					return;
				}
				if (arg0 == 234) {
					this.aBoolean92 = true;
					local1124 = 1;
					local10 = local1124 + 1;
					local34 = arg2[local1124] & 0xFF;
					@Pc(2998) int local2998 = local10 + 1;
					@Pc(3000) byte local3000 = arg2[local10];
					@Pc(3004) int local3004 = local2998 + 1;
					this.anInt489 = arg2[local2998] & 0xFF;
					local10 = local3004 + 1;
					this.anInt490 = arg2[local3004] & 0xFF;
					for (local456 = 0; local456 < 40; local456++) {
						this.anIntArray217[local456] = -1;
					}
					for (local76 = 0; local76 < local34; local76++) {
						this.anIntArray217[local76] = Tools.g2(arg2, local10);
						local10 += 2;
						this.anIntArray218[local76] = Tools.g2(arg2, local10);
						local10 += 2;
						this.anIntArray219[local76] = arg2[local10++];
					}
					if (local3000 == 1) {
						local84 = 39;
						for (local131 = 0; local131 < this.anInt443 && local84 >= local34; local131++) {
							@Pc(3075) boolean local3075 = false;
							for (local294 = 0; local294 < 40; local294++) {
								if (this.anIntArray217[local294] == this.anIntArray185[local131]) {
									local3075 = true;
									break;
								}
							}
							if (this.anIntArray185[local131] == 10) {
								local3075 = true;
							}
							if (!local3075) {
								this.anIntArray217[local84] = this.anIntArray185[local131] & 0x7FFF;
								this.anIntArray218[local84] = 0;
								this.anIntArray219[local84] = 0;
								local84--;
							}
						}
					}
					if (this.anInt491 >= 0 && this.anInt491 < 40 && this.anIntArray217[this.anInt491] != this.anInt492) {
						this.anInt491 = -1;
						this.anInt492 = -2;
						return;
					}
				} else if (arg0 == 233) {
					this.aBoolean92 = false;
					return;
				} else if (arg0 == 232) {
					this.aBoolean102 = true;
					this.aGui11.method104(this.anInt553, "");
					this.aGui11.method104(this.anInt554, "");
					this.aGui11.method104(this.anInt555, "");
					this.aGui11.method104(this.anInt556, "");
					return;
				} else if (arg0 == 229) {
					local2969 = arg2[1];
					if (local2969 == 1) {
						this.aBoolean89 = true;
						return;
					}
					this.aBoolean89 = false;
					return;
				} else if (arg0 == 228) {
					this.cameraAngleMode = Tools.g1(arg2[1]) == 1;
					this.mouseButtonsMode = Tools.g1(arg2[2]) == 1;
					this.soundEffectsMode = Tools.g1(arg2[3]) == 1;
					return;
				} else if (arg0 == 227) {
					for (local10 = 0; local10 < arg1 - 1; local10++) {
						@Pc(3265) boolean local3265 = arg2[local10 + 1] == 1;
						if (!this.aBooleanArray14[local10] && local3265) {
							this.method508("prayeron");
						}
						if (this.aBooleanArray14[local10] && !local3265) {
							this.method508("prayeroff");
						}
						this.aBooleanArray14[local10] = local3265;
					}
					return;
				} else if (arg0 == 226) {
					for (local10 = 0; local10 < this.anInt458; local10++) {
						this.aBooleanArray13[local10] = arg2[local10 + 1] == 1;
					}
					return;
				} else if (arg0 == 224) {
					this.aBoolean100 = true;
					for (local10 = 0; local10 < 5; local10++) {
						this.anIntArray228[local10] = local10;
						this.aStringArray37[local10] = this.RECOVERY_QUESTIONS[this.anIntArray228[local10]];
						this.aGui9.method104(this.anIntArray225[local10], "");
						this.aGui9.method104(this.anIntArray224[local10], local10 + 1 + ": " + this.aStringArray37[local10]);
					}
					return;
				} else if (arg0 == 222) {
					this.aBoolean93 = true;
					local1124 = 1;
					local10 = local1124 + 1;
					this.anInt493 = arg2[local1124] & 0xFF;
					this.anInt497 = arg2[local10++] & 0xFF;
					for (local34 = 0; local34 < this.anInt493; local34++) {
						this.anIntArray220[local34] = Tools.g2(arg2, local10);
						local10 += 2;
						this.anIntArray221[local34] = Tools.gsmart(arg2, local10);
						if (this.anIntArray221[local34] >= 128) {
							local10 += 4;
						} else {
							local10++;
						}
					}
					this.method527();
					return;
				} else if (arg0 == 221) {
					this.aBoolean93 = false;
					return;
				} else if (arg0 == 220) {
					local10 = arg2[1] & 0xFF;
					this.skillExperience[local10] = Tools.g4(arg2, 2);
					return;
				} else if (arg0 == 219) {
					local10 = Tools.g2(arg2, 1);
					if (this.anEntityArray1[local10] != null) {
						this.aString33 = this.anEntityArray1[local10].aString20;
					}
					this.aBoolean78 = true;
					this.anInt475 = 0;
					this.anInt476 = 0;
					this.aBoolean79 = false;
					this.aBoolean80 = false;
					this.aBoolean81 = false;
					this.aBoolean82 = false;
					this.aBoolean83 = false;
					this.aBoolean84 = false;
					return;
				} else if (arg0 == 218) {
					this.aBoolean78 = false;
					this.aBoolean85 = false;
					return;
				} else if (arg0 == 217) {
					this.aBoolean90 = true;
					this.aBoolean91 = false;
					this.aBoolean87 = false;
					local1124 = 1;
					this.aLong7 = Tools.g8(arg2, local1124);
					local10 = local1124 + 8;
					this.anInt488 = arg2[local10++] & 0xFF;
					for (local34 = 0; local34 < this.anInt488; local34++) {
						this.anIntArray215[local34] = Tools.g2(arg2, local10);
						local10 += 2;
						this.anIntArray216[local34] = Tools.g4(arg2, local10);
						local10 += 4;
					}
					this.anInt487 = arg2[local10++] & 0xFF;
					for (local46 = 0; local46 < this.anInt487; local46++) {
						this.anIntArray213[local46] = Tools.g2(arg2, local10);
						local10 += 2;
						this.anIntArray214[local46] = Tools.g4(arg2, local10);
						local10 += 4;
					}
					return;
				} else if (arg0 == 216) {
					this.anInt476 = arg2[1] & 0xFF;
					local10 = 2;
					for (local34 = 0; local34 < this.anInt476; local34++) {
						this.anIntArray203[local34] = Tools.g2(arg2, local10);
						local10 += 2;
						this.anIntArray204[local34] = Tools.g4(arg2, local10);
						local10 += 4;
					}
					this.aBoolean79 = false;
					this.aBoolean80 = false;
					return;
				} else if (arg0 == 215) {
					if (arg2[1] == 1) {
						this.aBoolean81 = true;
					} else {
						this.aBoolean81 = false;
					}
					if (arg2[2] == 1) {
						this.aBoolean82 = true;
					} else {
						this.aBoolean82 = false;
					}
					if (arg2[3] == 1) {
						this.aBoolean83 = true;
					} else {
						this.aBoolean83 = false;
					}
					if (arg2[4] == 1) {
						this.aBoolean84 = true;
					} else {
						this.aBoolean84 = false;
					}
					this.aBoolean79 = false;
					this.aBoolean80 = false;
					return;
				} else if (arg0 == 214) {
					local1124 = 1;
					local10 = local1124 + 1;
					local34 = arg2[local1124] & 0xFF;
					local46 = Tools.g2(arg2, local10);
					local10 += 2;
					local456 = Tools.gsmart(arg2, local10);
					if (local456 >= 128) {
						local10 += 4;
					} else {
						local10++;
					}
					if (local456 == 0) {
						this.anInt493--;
						for (local76 = local34; local76 < this.anInt493; local76++) {
							this.anIntArray220[local76] = this.anIntArray220[local76 + 1];
							this.anIntArray221[local76] = this.anIntArray221[local76 + 1];
						}
					} else {
						this.anIntArray220[local34] = local46;
						this.anIntArray221[local34] = local456;
						if (local34 >= this.anInt493) {
							this.anInt493 = local34 + 1;
						}
					}
					this.method527();
					return;
				} else if (arg0 == 213) {
					local1124 = 1;
					local34 = 1;
					local10 = local1124 + 1;
					local46 = arg2[local1124] & 0xFF;
					local456 = Tools.g2(arg2, local10);
					local10 += 2;
					if (ClientConfig.objStackable[local456 & 0x7FFF] == 0) {
						local34 = Tools.gsmart(arg2, local10);
						if (local34 >= 128) {
							local10 += 4;
						} else {
							local10++;
						}
					}
					this.anIntArray185[local46] = local456 & 0x7FFF;
					this.anIntArray187[local46] = local456 / 32768;
					this.anIntArray186[local46] = local34;
					if (local46 >= this.anInt443) {
						this.anInt443 = local46 + 1;
						return;
					}
				} else if (arg0 == 212) {
					local10 = arg2[1] & 0xFF;
					this.anInt443--;
					for (local34 = local10; local34 < this.anInt443; local34++) {
						this.anIntArray185[local34] = this.anIntArray185[local34 + 1];
						this.anIntArray186[local34] = this.anIntArray186[local34 + 1];
						this.anIntArray187[local34] = this.anIntArray187[local34 + 1];
					}
					return;
				} else if (arg0 == 211) {
					local1124 = 1;
					local10 = local1124 + 1;
					local34 = arg2[local1124] & 0xFF;
					this.anIntArray189[local34] = Tools.g1(arg2[local10++]);
					this.anIntArray190[local34] = Tools.g1(arg2[local10++]);
					this.skillExperience[local34] = Tools.g4(arg2, local10);
					local10 += 4;
					return;
				} else if (arg0 == 210) {
					local2969 = arg2[1];
					if (local2969 == 1) {
						this.aBoolean79 = true;
						return;
					}
					this.aBoolean79 = false;
					return;
				} else if (arg0 == 209) {
					local2969 = arg2[1];
					if (local2969 == 1) {
						this.aBoolean80 = true;
						return;
					}
					this.aBoolean80 = false;
					return;
				} else if (arg0 == 208) {
					this.aBoolean85 = true;
					this.aBoolean86 = false;
					this.aBoolean78 = false;
					local1124 = 1;
					this.aLong6 = Tools.g8(arg2, local1124);
					local10 = local1124 + 8;
					this.anInt478 = arg2[local10++] & 0xFF;
					for (local34 = 0; local34 < this.anInt478; local34++) {
						this.anIntArray207[local34] = Tools.g2(arg2, local10);
						local10 += 2;
						this.anIntArray208[local34] = Tools.g4(arg2, local10);
						local10 += 4;
					}
					this.anInt477 = arg2[local10++] & 0xFF;
					for (local46 = 0; local46 < this.anInt477; local46++) {
						this.anIntArray205[local46] = Tools.g2(arg2, local10);
						local10 += 2;
						this.anIntArray206[local46] = Tools.g4(arg2, local10);
						local10 += 4;
					}
					this.anInt479 = arg2[local10++] & 0xFF;
					this.anInt480 = arg2[local10++] & 0xFF;
					this.anInt481 = arg2[local10++] & 0xFF;
					this.anInt482 = arg2[local10++] & 0xFF;
					return;
				} else if (arg0 == 207) {
					@Pc(4135) String local4135 = new String(arg2, 1, arg1 - 1);
					this.method508(local4135);
					return;
				} else if (arg0 == 206) {
					if (this.anInt571 < 50) {
						local10 = arg2[1] & 0xFF;
						local34 = arg2[2] + this.anInt428;
						local46 = arg2[3] + this.anInt429;
						this.anIntArray251[this.anInt571] = local10;
						this.anIntArray250[this.anInt571] = 0;
						this.anIntArray248[this.anInt571] = local34;
						this.anIntArray249[this.anInt571] = local46;
						this.anInt571++;
						return;
					}
				} else if (arg0 != 205) {
					if (arg0 == 204) {
						this.aString38 = new String(arg2, 1, arg1 - 1);
						this.aBoolean98 = true;
						this.aBoolean97 = false;
						return;
					}
					if (arg0 == 203) {
						this.aString38 = new String(arg2, 1, arg1 - 1);
						this.aBoolean98 = true;
						this.aBoolean97 = true;
						return;
					}
					if (arg0 == 202) {
						this.anInt447 = Tools.g2(arg2, 1);
						return;
					}
					if (arg0 == 201) {
						if (!this.aBoolean104) {
							this.anInt448 = this.anInt447;
						}
						this.aBoolean104 = true;
						super.aString25 = "";
						super.aString26 = "";
						this.drawArea.method378(this.anInt392 + 1, arg2);
						this.aString43 = null;
						return;
					}
					if (arg0 == 200) {
						this.anInt448 = Tools.g2(arg2, 1);
						return;
					}
					if (arg0 == 199) {
						this.aBoolean104 = false;
						return;
					}
					if (arg0 != 198) {
						return;
					}
					this.aString43 = "Incorrect - Please wait...";
				} else if (!this.aBoolean95) {
					this.anInt506 = Tools.g4(arg2, 1);
					this.anInt507 = Tools.g4(arg2, 5);
					this.anInt505 = Tools.g4(arg2, 9);
					this.anInt508 = (int) (Math.random() * 6.0D);
					this.aBoolean96 = true;
					this.aBoolean95 = true;
					this.aString37 = null;
					return;
				}
			}
			return;
		} catch (@Pc(4338) RuntimeException local4338) {
			if (this.anInt382 < 3) {
				super.stream.p1spooky(17, 743);
				super.stream.pjstr(local4338.toString());
				super.stream.encryptPacket();
				super.stream.p1spooky(17, 743);
				super.stream.pjstr("p-type:" + arg0 + " p-size:" + arg1);
				super.stream.encryptPacket();
				super.stream.p1spooky(17, 743);
				super.stream.pjstr("rx:" + this.anInt428 + " ry:" + this.anInt429 + " num3l:" + this.anInt438);
				super.stream.encryptPacket();
				@Pc(4408) String local4408 = "";
				for (local46 = 0; local46 < 80 && local46 < arg1; local46++) {
					local4408 = local4408 + arg2[local46] + " ";
				}
				super.stream.p1spooky(17, 743);
				super.stream.pjstr(local4408);
				super.stream.encryptPacket();
				this.anInt382++;
			}
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "V", descriptor = "()V")
	private void method527() {
		this.anInt494 = this.anInt493;
		for (@Pc(7) int local7 = 0; local7 < this.anInt493; local7++) {
			this.anIntArray222[local7] = this.anIntArray220[local7];
			this.anIntArray223[local7] = this.anIntArray221[local7];
		}
		for (@Pc(32) int local32 = 0; local32 < this.anInt443 && this.anInt494 < this.anInt497; local32++) {
			@Pc(44) int local44 = this.anIntArray185[local32];
			@Pc(46) boolean local46 = false;
			for (@Pc(48) int local48 = 0; local48 < this.anInt494; local48++) {
				if (this.anIntArray222[local48] == local44) {
					local46 = true;
					break;
				}
			}
			if (!local46) {
				this.anIntArray222[this.anInt494] = local44;
				this.anIntArray223[this.anInt494] = 0;
				this.anInt494++;
			}
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "c", descriptor = "(I)Z")
	private boolean method528(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = this.localPlayer.anInt292 / 128;
		@Pc(11) int local11 = this.localPlayer.anInt293 / 128;
		for (@Pc(13) int local13 = 2; local13 >= 1; local13--) {
			if (arg0 == 1 && ((this.world.anIntArrayArray20[local5][local11 - local13] & 0x80) == 128 || (this.world.anIntArrayArray20[local5 - local13][local11] & 0x80) == 128 || (this.world.anIntArrayArray20[local5 - local13][local11 - local13] & 0x80) == 128)) {
				return false;
			}
			if (arg0 == 3 && ((this.world.anIntArrayArray20[local5][local11 + local13] & 0x80) == 128 || (this.world.anIntArrayArray20[local5 - local13][local11] & 0x80) == 128 || (this.world.anIntArrayArray20[local5 - local13][local11 + local13] & 0x80) == 128)) {
				return false;
			}
			if (arg0 == 5 && ((this.world.anIntArrayArray20[local5][local11 + local13] & 0x80) == 128 || (this.world.anIntArrayArray20[local5 + local13][local11] & 0x80) == 128 || (this.world.anIntArrayArray20[local5 + local13][local11 + local13] & 0x80) == 128)) {
				return false;
			}
			if (arg0 == 7 && ((this.world.anIntArrayArray20[local5][local11 - local13] & 0x80) == 128 || (this.world.anIntArrayArray20[local5 + local13][local11] & 0x80) == 128 || (this.world.anIntArrayArray20[local5 + local13][local11 - local13] & 0x80) == 128)) {
				return false;
			}
			if (arg0 == 0 && (this.world.anIntArrayArray20[local5][local11 - local13] & 0x80) == 128) {
				return false;
			}
			if (arg0 == 2 && (this.world.anIntArrayArray20[local5 - local13][local11] & 0x80) == 128) {
				return false;
			}
			if (arg0 == 4 && (this.world.anIntArrayArray20[local5][local11 + local13] & 0x80) == 128) {
				return false;
			}
			if (arg0 == 6 && (this.world.anIntArrayArray20[local5 + local13][local11] & 0x80) == 128) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "W", descriptor = "()V")
	private void method529() {
		if ((this.anInt420 & 0x1) == 1 && this.method528(this.anInt420)) {
			return;
		}
		if ((this.anInt420 & 0x1) != 0 || !this.method528(this.anInt420)) {
			@Pc(90) int[] local90 = new int[] { 1, -1, 2, -2, 3, -3, 4 };
			for (@Pc(92) int local92 = 0; local92 < 7; local92++) {
				if (this.method528(this.anInt420 + local90[local92] + 8 & 0x7)) {
					this.anInt420 = this.anInt420 + local90[local92] + 8 & 0x7;
					break;
				}
			}
			if ((this.anInt420 & 0x1) == 0 && this.method528(this.anInt420)) {
				if (this.method528(this.anInt420 + 1 & 0x7)) {
					this.anInt420 = this.anInt420 + 1 & 0x7;
				} else if (this.method528(this.anInt420 + 7 & 0x7)) {
					this.anInt420 = this.anInt420 + 7 & 0x7;
				}
			}
		} else if (this.method528(this.anInt420 + 1 & 0x7)) {
			this.anInt420 = this.anInt420 + 1 & 0x7;
		} else if (this.method528(this.anInt420 + 7 & 0x7)) {
			this.anInt420 = this.anInt420 + 7 & 0x7;
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "X", descriptor = "()V")
	private void method530() {
		if (this.anInt511 != 0) {
			this.drawArea.method373();
			this.drawArea.drawStringCenter("Oh dear! You are dead...", this.anInt385 / 2, this.anInt386 / 2, 7, 16711680);
			this.method532();
			this.drawArea.method363(this.aGraphics5, 0, 0);
		} else if (this.aBoolean103) {
			this.method517();
		} else if (this.aBoolean100) {
			this.method511();
		} else if (this.aBoolean102) {
			this.method514();
		} else if (this.aBoolean104) {
			this.drawArea.method373();
			if (Math.random() < 0.15D) {
				this.drawArea.drawStringCenter("ZZZ", (int) (Math.random() * 80.0D), (int) (Math.random() * 334.0D), 5, (int) (Math.random() * 1.6777215E7D));
			}
			if (Math.random() < 0.15D) {
				this.drawArea.drawStringCenter("ZZZ", 512 - (int) (Math.random() * 80.0D), (int) (Math.random() * 334.0D), 5, (int) (Math.random() * 1.6777215E7D));
			}
			this.drawArea.method368(this.anInt385 / 2 - 100, 160, 200, 40, 0);
			this.drawArea.drawStringCenter("You are sleeping", this.anInt385 / 2, 50, 7, 16776960);
			this.drawArea.drawStringCenter("Fatigue: " + this.anInt448 * 100 / 750 + "%", this.anInt385 / 2, 90, 7, 16776960);
			this.drawArea.drawStringCenter("When you want to wake up just use your", this.anInt385 / 2, 140, 5, 16777215);
			this.drawArea.drawStringCenter("keyboard to type the word in the box below", this.anInt385 / 2, 160, 5, 16777215);
			this.drawArea.drawStringCenter(super.aString25 + "*", this.anInt385 / 2, 180, 5, 65535);
			if (this.aString43 == null) {
				this.drawArea.method383(this.anInt385 / 2 - 127, 230, this.anInt392 + 1);
			} else {
				this.drawArea.drawStringCenter(this.aString43, this.anInt385 / 2, 260, 5, 16711680);
			}
			this.drawArea.method369(this.anInt385 / 2 - 128, 229, 257, 42, 16777215);
			this.method532();
			this.drawArea.drawStringCenter("If you can't read the word", this.anInt385 / 2, 290, 1, 16777215);
			this.drawArea.drawStringCenter("@yel@click here@whi@ to get a different one", this.anInt385 / 2, 305, 1, 16777215);
			this.drawArea.method363(this.aGraphics5, 0, 0);
		} else if (this.world.aBoolean55) {
			for (@Pc(271) int local271 = 0; local271 < 64; local271++) {
				this.world3D.method199(this.world.anObject3DArrayArray2[this.anInt409][local271]);
				if (this.anInt409 == 0) {
					this.world3D.method199(this.world.anObject3DArrayArray1[1][local271]);
					this.world3D.method199(this.world.anObject3DArrayArray2[1][local271]);
					this.world3D.method199(this.world.anObject3DArrayArray1[2][local271]);
					this.world3D.method199(this.world.anObject3DArrayArray2[2][local271]);
				}
				this.aBoolean72 = true;
				if (this.anInt409 == 0 && (this.world.anIntArrayArray20[this.localPlayer.anInt292 / 128][this.localPlayer.anInt293 / 128] & 0x80) == 0) {
					this.world3D.method198(this.world.anObject3DArrayArray2[this.anInt409][local271]);
					if (this.anInt409 == 0) {
						this.world3D.method198(this.world.anObject3DArrayArray1[1][local271]);
						this.world3D.method198(this.world.anObject3DArrayArray2[1][local271]);
						this.world3D.method198(this.world.anObject3DArrayArray1[2][local271]);
						this.world3D.method198(this.world.anObject3DArrayArray2[2][local271]);
					}
					this.aBoolean72 = false;
				}
			}
			@Pc(423) int local423;
			if (this.anInt397 != this.anInt400) {
				this.anInt400 = this.anInt397;
				for (local423 = 0; local423 < this.anInt438; local423++) {
					if (this.anIntArray179[local423] == 97) {
						this.method531(local423, "firea" + (this.anInt397 + 1));
					}
					if (this.anIntArray179[local423] == 274) {
						this.method531(local423, "fireplacea" + (this.anInt397 + 1));
					}
					if (this.anIntArray179[local423] == 1031) {
						this.method531(local423, "lightning" + (this.anInt397 + 1));
					}
					if (this.anIntArray179[local423] == 1036) {
						this.method531(local423, "firespell" + (this.anInt397 + 1));
					}
					if (this.anIntArray179[local423] == 1147) {
						this.method531(local423, "spellcharge" + (this.anInt397 + 1));
					}
				}
			}
			if (this.anInt398 != this.anInt401) {
				this.anInt401 = this.anInt398;
				for (local423 = 0; local423 < this.anInt438; local423++) {
					if (this.anIntArray179[local423] == 51) {
						this.method531(local423, "torcha" + (this.anInt398 + 1));
					}
					if (this.anIntArray179[local423] == 143) {
						this.method531(local423, "skulltorcha" + (this.anInt398 + 1));
					}
				}
			}
			if (this.anInt399 != this.anInt402) {
				this.anInt402 = this.anInt399;
				for (local423 = 0; local423 < this.anInt438; local423++) {
					if (this.anIntArray179[local423] == 1142) {
						this.method531(local423, "clawspell" + (this.anInt399 + 1));
					}
				}
			}
			this.world3D.method202(this.anInt427);
			this.anInt427 = 0;
			@Pc(642) int local642;
			@Pc(645) int local645;
			@Pc(652) int local652;
			@Pc(667) int local667;
			for (local423 = 0; local423 < this.anInt425; local423++) {
				@Pc(635) Entity local635 = this.anEntityArray2[local423];
				if (local635.anInt310 != 255) {
					local642 = local635.anInt292;
					local645 = local635.anInt293;
					local652 = -this.world.method424(local642, local645);
					local667 = this.world3D.method203(local423 + 5000, local642, local652, local645, 145, 220, local423 + 10000);
					this.anInt427++;
					if (local635 == this.localPlayer) {
						this.world3D.method204(local667);
					}
					if (local635.anInt296 == 8) {
						this.world3D.method205(local667, -30);
					}
					if (local635.anInt296 == 9) {
						this.world3D.method205(local667, 30);
					}
				}
			}
			@Pc(756) int local756;
			@Pc(759) int local759;
			@Pc(718) Entity local718;
			for (@Pc(706) int local706 = 0; local706 < this.anInt425; local706++) {
				@Pc(713) Entity local713 = this.anEntityArray2[local706];
				if (local713.anInt315 > 0) {
					local718 = null;
					if (local713.anInt314 != -1) {
						local718 = this.anEntityArray4[local713.anInt314];
					} else if (local713.anInt313 != -1) {
						local718 = this.anEntityArray1[local713.anInt313];
					}
					if (local718 != null) {
						local652 = local713.anInt292;
						local667 = local713.anInt293;
						local756 = -this.world.method424(local652, local667) - 110;
						local759 = local718.anInt292;
						@Pc(762) int local762 = local718.anInt293;
						@Pc(776) int local776 = -this.world.method424(local759, local762) - ClientConfig.npcLength[local718.anInt294] / 2;
						@Pc(792) int local792 = (local652 * local713.anInt315 + local759 * (this.anInt395 - local713.anInt315)) / this.anInt395;
						@Pc(808) int local808 = (local756 * local713.anInt315 + local776 * (this.anInt395 - local713.anInt315)) / this.anInt395;
						@Pc(824) int local824 = (local667 * local713.anInt315 + local762 * (this.anInt395 - local713.anInt315)) / this.anInt395;
						this.world3D.method203(this.anInt391 + local713.anInt312, local792, local808, local824, 32, 32, 0);
						this.anInt427++;
					}
				}
			}
			for (local642 = 0; local642 < this.anInt433; local642++) {
				local718 = this.anEntityArray5[local642];
				local652 = local718.anInt292;
				local667 = local718.anInt293;
				local756 = -this.world.method424(local652, local667);
				local759 = this.world3D.method203(local642 + 20000, local652, local756, local667, ClientConfig.npcWidth[local718.anInt294], ClientConfig.npcLength[local718.anInt294], local642 + 30000);
				this.anInt427++;
				if (local718.anInt296 == 8) {
					this.world3D.method205(local759, -30);
				}
				if (local718.anInt296 == 9) {
					this.world3D.method205(local759, 30);
				}
			}
			for (local645 = 0; local645 < this.anInt436; local645++) {
				local652 = this.anIntArray173[local645] * this.anInt383 + 64;
				local667 = this.anIntArray174[local645] * this.anInt383 + 64;
				this.world3D.method203(this.anIntArray175[local645] + 40000, local652, -this.world.method424(local652, local667) - this.anIntArray176[local645], local667, 96, 64, local645 + 20000);
				this.anInt427++;
			}
			for (local652 = 0; local652 < this.anInt571; local652++) {
				local667 = this.anIntArray248[local652] * this.anInt383 + 64;
				local756 = this.anIntArray249[local652] * this.anInt383 + 64;
				local759 = this.anIntArray251[local652];
				if (local759 == 0) {
					this.world3D.method203(local652 + 50000, local667, -this.world.method424(local667, local756), local756, 128, 256, local652 + 50000);
					this.anInt427++;
				}
				if (local759 == 1) {
					this.world3D.method203(local652 + 50000, local667, -this.world.method424(local667, local756), local756, 128, 64, local652 + 50000);
					this.anInt427++;
				}
			}
			this.drawArea.aBoolean50 = false;
			this.drawArea.method364();
			this.drawArea.aBoolean50 = super.lowDetailMode;
			if (this.anInt409 == 3) {
				local667 = (int) (Math.random() * 3.0D) + 40;
				local756 = (int) (Math.random() * 7.0D) + 40;
				this.world3D.method239(local667, local756, -50, -10, -50);
			}
			this.anInt559 = 0;
			this.anInt558 = 0;
			this.anInt560 = 0;
			if (this.aBoolean73) {
				if (this.cameraAngleMode && !this.aBoolean72) {
					local667 = this.anInt420;
					this.method529();
					if (this.anInt420 != local667) {
						this.anInt418 = this.localPlayer.anInt292;
						this.anInt419 = this.localPlayer.anInt293;
					}
				}
				this.world3D.anInt150 = 3000;
				this.world3D.anInt151 = 3000;
				this.world3D.anInt152 = 1;
				this.world3D.anInt153 = 2800;
				this.anInt422 = this.anInt420 * 32;
				local667 = this.anInt418 + this.anInt377;
				local756 = this.anInt419 + this.anInt379;
				this.world3D.method227(local667, -this.world.method424(local667, local756), local756, 912, this.anInt422 * 4, 0, 2000);
			} else {
				if (this.cameraAngleMode && !this.aBoolean72) {
					this.method529();
				}
				if (super.lowDetailMode) {
					this.world3D.anInt150 = 2200;
					this.world3D.anInt151 = 2200;
					this.world3D.anInt152 = 1;
					this.world3D.anInt153 = 2100;
				} else {
					this.world3D.anInt150 = 2400;
					this.world3D.anInt151 = 2400;
					this.world3D.anInt152 = 1;
					this.world3D.anInt153 = 2300;
				}
				local667 = this.anInt418 + this.anInt377;
				local756 = this.anInt419 + this.anInt379;
				this.world3D.method227(local667, -this.world.method424(local667, local756), local756, 912, this.anInt422 * 4, 0, this.anInt417 * 2);
			}
			this.world3D.method215();
			this.method537();
			if (this.anInt403 > 0) {
				this.drawArea.method383(this.anInt404 - 8, this.anInt405 - 8, this.anInt388 + (24 - this.anInt403) / 6 + 14);
			}
			if (this.anInt403 < 0) {
				this.drawArea.method383(this.anInt404 - 8, this.anInt405 - 8, this.anInt388 + (this.anInt403 + 24) / 6 + 18);
			}
			if (!this.aBoolean99) {
				local667 = 2203 - this.anInt429 - this.anInt407 - this.anInt411;
				if (this.anInt428 + this.anInt406 + this.anInt410 >= 2640) {
					local667 = -50;
				}
				if (local667 > 0) {
					local756 = local667 / 6 + 1;
					this.drawArea.method383(453, this.anInt386 - 56, this.anInt388 + 13);
					this.drawArea.drawStringCenter("Wilderness", 465, this.anInt386 - 20, 1, 16776960);
					this.drawArea.drawStringCenter("Level: " + local756, 465, this.anInt386 - 7, 1, 16776960);
					if (this.anInt512 == 0) {
						this.anInt512 = 2;
					}
				}
				if (this.anInt512 == 0 && local667 > -10 && local667 <= 0) {
					this.anInt512 = 1;
				}
			}
			if (this.anInt473 == 0) {
				for (local667 = 0; local667 < this.anInt474; local667++) {
					if (this.anIntArray200[local667] > 0) {
						@Pc(1447) String local1447 = this.aStringArray35[local667];
						this.drawArea.drawString(local1447, 7, this.anInt386 - local667 * 12 - 18, 1, 16776960);
					}
				}
			}
			this.aGui4.method107(this.anInt469);
			this.aGui4.method107(this.anInt471);
			this.aGui4.method107(this.anInt472);
			if (this.anInt473 == 1) {
				this.aGui4.method106(this.anInt469);
			} else if (this.anInt473 == 2) {
				this.aGui4.method106(this.anInt471);
			} else if (this.anInt473 == 3) {
				this.aGui4.method106(this.anInt472);
			}
			Gui.anInt77 = 2;
			this.aGui4.method75();
			Gui.anInt77 = 0;
			this.drawArea.method385(this.drawArea.anInt318 - 3 - 197, 3, this.anInt388, 128);
			this.method549();
			this.drawArea.aBoolean51 = false;
			this.method532();
			this.drawArea.method363(this.aGraphics5, 0, 0);
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "c", descriptor = "(ILjava/lang/String;)V")
	private void method531(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(4) int local4 = this.anIntArray177[arg0];
		@Pc(9) int local9 = this.anIntArray178[arg0];
		@Pc(17) int local17 = local4 - this.localPlayer.anInt292 / 128;
		@Pc(25) int local25 = local9 - this.localPlayer.anInt293 / 128;
		@Pc(27) byte local27 = 7;
		if (local4 < 0 || local9 < 0 || local4 >= 96 || local9 >= 96 || local17 <= -local27 || local17 >= local27 || local25 <= -local27 || local25 >= local27) {
			return;
		}
		this.world3D.method199(this.anObject3DArray4[arg0]);
		@Pc(61) int local61 = ClientConfig.getModelId(arg1);
		@Pc(67) Object3D local67 = this.anObject3DArray5[local61].method141();
		this.world3D.method198(local67);
		local67.method122(true, 48, 48, -50, -10, -50);
		local67.method143(this.anObject3DArray4[arg0]);
		local67.anInt88 = arg0;
		this.anObject3DArray4[arg0] = local67;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "Y", descriptor = "()V")
	private void method532() {
		this.drawArea.method383(0, this.anInt386 - 4, this.anInt388 + 23);
		@Pc(16) int local16 = PixMap.method375(200, 200, 255);
		if (this.anInt473 == 0) {
			local16 = PixMap.method375(255, 200, 50);
		}
		if (this.anInt465 % 30 > 15) {
			local16 = PixMap.method375(255, 50, 50);
		}
		this.drawArea.drawStringCenter("All messages", 54, this.anInt386 + 6, 0, local16);
		local16 = PixMap.method375(200, 200, 255);
		if (this.anInt473 == 1) {
			local16 = PixMap.method375(255, 200, 50);
		}
		if (this.anInt466 % 30 > 15) {
			local16 = PixMap.method375(255, 50, 50);
		}
		this.drawArea.drawStringCenter("Chat history", 155, this.anInt386 + 6, 0, local16);
		local16 = PixMap.method375(200, 200, 255);
		if (this.anInt473 == 2) {
			local16 = PixMap.method375(255, 200, 50);
		}
		if (this.anInt467 % 30 > 15) {
			local16 = PixMap.method375(255, 50, 50);
		}
		this.drawArea.drawStringCenter("Quest history", 255, this.anInt386 + 6, 0, local16);
		local16 = PixMap.method375(200, 200, 255);
		if (this.anInt473 == 3) {
			local16 = PixMap.method375(255, 200, 50);
		}
		if (this.anInt468 % 30 > 15) {
			local16 = PixMap.method375(255, 50, 50);
		}
		this.drawArea.drawStringCenter("Private history", 355, this.anInt386 + 6, 0, local16);
		this.drawArea.drawStringCenter("Report abuse", 457, this.anInt386 + 6, 0, 16777215);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "a", descriptor = "(IIIIIII)V")
	public void method533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(4) int local4 = this.anIntArray251[arg4];
		@Pc(9) int local9 = this.anIntArray250[arg4];
		@Pc(19) int local19;
		if (local4 == 0) {
			local19 = local9 * 5 * 256 + 255;
			this.drawArea.method365(arg0 + arg2 / 2, arg1 + arg3 / 2, local9 * 2 + 20, local19, 255 - local9 * 5);
		}
		if (local4 == 1) {
			local19 = local9 * 5 * 256 + 16711680;
			this.drawArea.method365(arg0 + arg2 / 2, arg1 + arg3 / 2, local9 + 10, local19, 255 - local9 * 5);
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "b", descriptor = "(IIIIIII)V")
	public void method534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(6) int local6 = ClientConfig.objSprite[arg4] + this.anInt390;
		@Pc(10) int local10 = ClientConfig.objSpriteMask[arg4];
		this.drawArea.method399(arg0, arg1, arg2, arg3, local6, local10, 0, 0, false);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "c", descriptor = "(IIIIIII)V")
	public void method535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(6) Entity local6 = this.anEntityArray5[arg4];
		@Pc(18) int local18 = local6.anInt296 + (this.anInt422 + 16) / 32 & 0x7;
		@Pc(20) boolean local20 = false;
		@Pc(22) int local22 = local18;
		if (local18 == 5) {
			local22 = 3;
			local20 = true;
		} else if (local18 == 6) {
			local22 = 2;
			local20 = true;
		} else if (local18 == 7) {
			local22 = 1;
			local20 = true;
		}
		@Pc(64) int local64 = local22 * 3 + this.anIntArray245[local6.anInt295 / ClientConfig.npcWalkSpeed[local6.anInt294] % 4];
		if (local6.anInt296 == 8) {
			local22 = 5;
			local18 = 2;
			local20 = false;
			arg0 -= ClientConfig.npcCombatWidth[local6.anInt294] * arg6 / 100;
			local64 = local22 * 3 + this.anIntArray246[this.anInt372 / (ClientConfig.npcCombatSpeed[local6.anInt294] - 1) % 8];
		} else if (local6.anInt296 == 9) {
			local22 = 5;
			local18 = 2;
			local20 = true;
			arg0 += ClientConfig.npcCombatWidth[local6.anInt294] * arg6 / 100;
			local64 = local22 * 3 + this.anIntArray247[this.anInt372 / ClientConfig.npcCombatSpeed[local6.anInt294] % 8];
		}
		@Pc(155) int local155;
		@Pc(162) int local162;
		for (@Pc(146) int local146 = 0; local146 < 12; local146++) {
			local155 = this.anIntArrayArray22[local18][local146];
			local162 = ClientConfig.npcSprites[local6.anInt294][local155];
			if (local162 >= 0) {
				@Pc(166) byte local166 = 0;
				@Pc(168) byte local168 = 0;
				@Pc(170) int local170 = local64;
				if (local20 && local22 >= 1 && local22 <= 3 && ClientConfig.animationHasF[local162] == 1) {
					local170 = local64 + 15;
				}
				if (local22 != 5 || ClientConfig.animatonHasA[local162] == 1) {
					@Pc(198) int local198 = local170 + ClientConfig.animationFileId[local162];
					@Pc(208) int local208 = local166 * arg2 / this.drawArea.anIntArray153[local198];
					@Pc(218) int local218 = local168 * arg3 / this.drawArea.anIntArray154[local198];
					@Pc(234) int local234 = arg2 * this.drawArea.anIntArray153[local198] / this.drawArea.anIntArray153[ClientConfig.animationFileId[local162]];
					@Pc(242) int local242 = local208 - (local234 - arg2) / 2;
					@Pc(246) int local246 = ClientConfig.animationColor[local162];
					@Pc(248) int local248 = 0;
					if (local246 == 1) {
						local246 = ClientConfig.npcHairColor[local6.anInt294];
						local248 = ClientConfig.npcSkinColor[local6.anInt294];
					} else if (local246 == 2) {
						local246 = ClientConfig.npcTopColor[local6.anInt294];
						local248 = ClientConfig.npcSkinColor[local6.anInt294];
					} else if (local246 == 3) {
						local246 = ClientConfig.npcBottomColor[local6.anInt294];
						local248 = ClientConfig.npcSkinColor[local6.anInt294];
					}
					this.drawArea.method399(arg0 + local242, arg1 + local218, local234, arg3, local198, local246, local248, arg5, local20);
				}
			}
		}
		if (local6.anInt300 > 0) {
			this.anIntArray233[this.anInt558] = this.drawArea.stringWidth(local6.aString21, 1) / 2;
			if (this.anIntArray233[this.anInt558] > 150) {
				this.anIntArray233[this.anInt558] = 150;
			}
			this.anIntArray234[this.anInt558] = this.drawArea.stringWidth(local6.aString21, 1) / 300 * this.drawArea.method411(1);
			this.anIntArray231[this.anInt558] = arg0 + arg2 / 2;
			this.anIntArray232[this.anInt558] = arg1;
			this.aStringArray38[this.anInt558++] = local6.aString21;
		}
		if (local6.anInt296 != 8 && local6.anInt296 != 9 && local6.anInt306 == 0) {
			return;
		}
		if (local6.anInt306 > 0) {
			local155 = arg0;
			if (local6.anInt296 == 8) {
				local155 = arg0 - arg6 * 20 / 100;
			} else if (local6.anInt296 == 9) {
				local155 = arg0 + arg6 * 20 / 100;
			}
			local162 = local6.anInt304 * 30 / local6.anInt305;
			this.anIntArray239[this.anInt560] = local155 + arg2 / 2;
			this.anIntArray240[this.anInt560] = arg1;
			this.anIntArray241[this.anInt560++] = local162;
		}
		if (local6.anInt306 <= 150) {
			return;
		}
		local155 = arg0;
		if (local6.anInt296 == 8) {
			local155 = arg0 - arg6 * 10 / 100;
		} else if (local6.anInt296 == 9) {
			local155 = arg0 + arg6 * 10 / 100;
		}
		this.drawArea.method383(local155 + arg2 / 2 - 12, arg1 + arg3 / 2 - 12, this.anInt388 + 12);
		this.drawArea.drawStringCenter(String.valueOf(local6.anInt303), local155 + arg2 / 2 - 1, arg1 + arg3 / 2 + 5, 3, 16777215);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "d", descriptor = "(IIIIIII)V")
	public void method536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(6) Entity local6 = this.anEntityArray2[arg4];
		if (local6.anInt310 == 255) {
			return;
		}
		@Pc(23) int local23 = local6.anInt296 + (this.anInt422 + 16) / 32 & 0x7;
		@Pc(25) boolean local25 = false;
		@Pc(27) int local27 = local23;
		if (local23 == 5) {
			local27 = 3;
			local25 = true;
		} else if (local23 == 6) {
			local27 = 2;
			local25 = true;
		} else if (local23 == 7) {
			local27 = 1;
			local25 = true;
		}
		@Pc(66) int local66 = local27 * 3 + this.anIntArray245[local6.anInt295 / 6 % 4];
		if (local6.anInt296 == 8) {
			local27 = 5;
			local23 = 2;
			local25 = false;
			arg0 -= arg6 * 5 / 100;
			local66 = local27 * 3 + this.anIntArray246[this.anInt372 / 5 % 8];
		} else if (local6.anInt296 == 9) {
			local27 = 5;
			local23 = 2;
			local25 = true;
			arg0 += arg6 * 5 / 100;
			local66 = local27 * 3 + this.anIntArray247[this.anInt372 / 6 % 8];
		}
		@Pc(143) int local143;
		@Pc(150) int local150;
		@Pc(364) int local364;
		for (@Pc(134) int local134 = 0; local134 < 12; local134++) {
			local143 = this.anIntArrayArray22[local23][local134];
			local150 = local6.anIntArray147[local143] - 1;
			if (local150 >= 0) {
				@Pc(154) byte local154 = 0;
				@Pc(156) byte local156 = 0;
				@Pc(158) int local158 = local66;
				if (local25 && local27 >= 1 && local27 <= 3) {
					if (ClientConfig.animationHasF[local150] == 1) {
						local158 = local66 + 15;
					} else if (local143 == 4 && local27 == 1) {
						local154 = -22;
						local156 = -3;
						local158 = local27 * 3 + this.anIntArray245[(local6.anInt295 / 6 + 2) % 4];
					} else if (local143 == 4 && local27 == 2) {
						local154 = 0;
						local156 = -8;
						local158 = local27 * 3 + this.anIntArray245[(local6.anInt295 / 6 + 2) % 4];
					} else if (local143 == 4 && local27 == 3) {
						local154 = 26;
						local156 = -5;
						local158 = local27 * 3 + this.anIntArray245[(local6.anInt295 / 6 + 2) % 4];
					} else if (local143 == 3 && local27 == 1) {
						local154 = 22;
						local156 = 3;
						local158 = local27 * 3 + this.anIntArray245[(local6.anInt295 / 6 + 2) % 4];
					} else if (local143 == 3 && local27 == 2) {
						local154 = 0;
						local156 = 8;
						local158 = local27 * 3 + this.anIntArray245[(local6.anInt295 / 6 + 2) % 4];
					} else if (local143 == 3 && local27 == 3) {
						local154 = -26;
						local156 = 5;
						local158 = local27 * 3 + this.anIntArray245[(local6.anInt295 / 6 + 2) % 4];
					}
				}
				if (local27 != 5 || ClientConfig.animatonHasA[local150] == 1) {
					@Pc(354) int local354 = local158 + ClientConfig.animationFileId[local150];
					local364 = local154 * arg2 / this.drawArea.anIntArray153[local354];
					@Pc(374) int local374 = local156 * arg3 / this.drawArea.anIntArray154[local354];
					@Pc(390) int local390 = arg2 * this.drawArea.anIntArray153[local354] / this.drawArea.anIntArray153[ClientConfig.animationFileId[local150]];
					@Pc(398) int local398 = local364 - (local390 - arg2) / 2;
					@Pc(402) int local402 = ClientConfig.animationColor[local150];
					@Pc(408) int local408 = this.anIntArray244[local6.anInt311];
					if (local402 == 1) {
						local402 = this.anIntArray243[local6.anInt308];
					} else if (local402 == 2) {
						local402 = this.anIntArray242[local6.anInt309];
					} else if (local402 == 3) {
						local402 = this.anIntArray242[local6.anInt310];
					}
					this.drawArea.method399(arg0 + local398, arg1 + local374, local390, arg3, local354, local402, local408, arg5, local25);
				}
			}
		}
		if (local6.anInt300 > 0) {
			this.anIntArray233[this.anInt558] = this.drawArea.stringWidth(local6.aString21, 1) / 2;
			if (this.anIntArray233[this.anInt558] > 150) {
				this.anIntArray233[this.anInt558] = 150;
			}
			this.anIntArray234[this.anInt558] = this.drawArea.stringWidth(local6.aString21, 1) / 300 * this.drawArea.method411(1);
			this.anIntArray231[this.anInt558] = arg0 + arg2 / 2;
			this.anIntArray232[this.anInt558] = arg1;
			this.aStringArray38[this.anInt558++] = local6.aString21;
		}
		if (local6.anInt302 > 0) {
			this.anIntArray235[this.anInt559] = arg0 + arg2 / 2;
			this.anIntArray236[this.anInt559] = arg1;
			this.anIntArray237[this.anInt559] = arg6;
			this.anIntArray238[this.anInt559++] = local6.anInt301;
		}
		if (local6.anInt296 == 8 || local6.anInt296 == 9 || local6.anInt306 != 0) {
			if (local6.anInt306 > 0) {
				local143 = arg0;
				if (local6.anInt296 == 8) {
					local143 = arg0 - arg6 * 20 / 100;
				} else if (local6.anInt296 == 9) {
					local143 = arg0 + arg6 * 20 / 100;
				}
				local150 = local6.anInt304 * 30 / local6.anInt305;
				this.anIntArray239[this.anInt560] = local143 + arg2 / 2;
				this.anIntArray240[this.anInt560] = arg1;
				this.anIntArray241[this.anInt560++] = local150;
			}
			if (local6.anInt306 > 150) {
				local143 = arg0;
				if (local6.anInt296 == 8) {
					local143 = arg0 - arg6 * 10 / 100;
				} else if (local6.anInt296 == 9) {
					local143 = arg0 + arg6 * 10 / 100;
				}
				this.drawArea.method383(local143 + arg2 / 2 - 12, arg1 + arg3 / 2 - 12, this.anInt388 + 11);
				this.drawArea.drawStringCenter(String.valueOf(local6.anInt303), local143 + arg2 / 2 - 1, arg1 + arg3 / 2 + 5, 3, 16777215);
			}
		}
		if (local6.anInt317 != 1 || local6.anInt302 != 0) {
			return;
		}
		local143 = arg5 + arg0 + arg2 / 2;
		if (local6.anInt296 == 8) {
			local143 -= arg6 * 20 / 100;
		} else if (local6.anInt296 == 9) {
			local143 += arg6 * 20 / 100;
		}
		local150 = arg6 * 16 / 100;
		local364 = arg6 * 16 / 100;
		this.drawArea.method384(local143 - local150 / 2, arg1 - local364 / 2 - arg6 * 10 / 100, local150, local364, this.anInt388 + 13);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "Z", descriptor = "()V")
	private void method537() {
		@Pc(10) int local10;
		@Pc(15) int local15;
		@Pc(20) int local20;
		@Pc(25) int local25;
		@Pc(30) int local30;
		@Pc(38) int local38;
		for (@Pc(3) int local3 = 0; local3 < this.anInt558; local3++) {
			local10 = this.drawArea.method411(1);
			local15 = this.anIntArray231[local3];
			local20 = this.anIntArray232[local3];
			local25 = this.anIntArray233[local3];
			local30 = this.anIntArray234[local3];
			@Pc(32) boolean local32 = true;
			while (local32) {
				local32 = false;
				for (local38 = 0; local38 < local3; local38++) {
					if (local20 + local30 > this.anIntArray232[local38] - local10 && local20 - local10 < this.anIntArray232[local38] + this.anIntArray234[local38] && local15 - local25 < this.anIntArray231[local38] + this.anIntArray233[local38] && local15 + local25 > this.anIntArray231[local38] - this.anIntArray233[local38] && this.anIntArray232[local38] - local10 - local30 < local20) {
						local20 = this.anIntArray232[local38] - local10 - local30;
						local32 = true;
					}
				}
			}
			this.anIntArray232[local3] = local20;
			this.drawArea.centerParagraph(this.aStringArray38[local3], local15, local20, 1, 16776960, 300);
		}
		for (local10 = 0; local10 < this.anInt559; local10++) {
			local15 = this.anIntArray235[local10];
			local20 = this.anIntArray236[local10];
			local25 = this.anIntArray237[local10];
			local30 = this.anIntArray238[local10];
			@Pc(168) int local168 = local25 * 39 / 100;
			local38 = local25 * 27 / 100;
			@Pc(178) int local178 = local20 - local38;
			this.drawArea.method386(local15 - local168 / 2, local178, local168, local38, this.anInt388 + 9, 85);
			@Pc(200) int local200 = local25 * 36 / 100;
			@Pc(206) int local206 = local25 * 24 / 100;
			this.drawArea.method399(local15 - local200 / 2, local178 + local38 / 2 - local206 / 2, local200, local206, ClientConfig.objSprite[local30] + this.anInt390, ClientConfig.objSpriteMask[local30], 0, 0, false);
		}
		for (local15 = 0; local15 < this.anInt560; local15++) {
			local20 = this.anIntArray239[local15];
			local25 = this.anIntArray240[local15];
			local30 = this.anIntArray241[local15];
			this.drawArea.method366(local20 - 15, local25 - 3, local30, 5, 65280, 192);
			this.drawArea.method366(local20 + local30 - 15, local25 - 3, 30 - local30, 5, 16711680, 192);
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "d", descriptor = "(I)I")
	private int method538(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < this.anInt443; local5++) {
			if (this.anIntArray185[local5] == arg0) {
				if (ClientConfig.objStackable[arg0] == 1) {
					local3++;
				} else {
					local3 += this.anIntArray186[local5];
				}
			}
		}
		return local3;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "b", descriptor = "(II)Z")
	private boolean method539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 31 && (this.method540(197) || this.method540(615) || this.method540(682))) {
			return true;
		} else if (arg0 == 32 && (this.method540(102) || this.method540(616) || this.method540(683))) {
			return true;
		} else if (arg0 == 33 && (this.method540(101) || this.method540(617) || this.method540(684))) {
			return true;
		} else if (arg0 == 34 && (this.method540(103) || this.method540(618) || this.method540(685))) {
			return true;
		} else {
			return this.method538(arg0) >= arg1;
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "e", descriptor = "(I)Z")
	private boolean method540(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt443; local1++) {
			if (this.anIntArray185[local1] == arg0 && this.anIntArray187[local1] == 1) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "b", descriptor = "(III)V")
	private void method541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.drawArea.method372(arg0, arg1, arg2);
		this.drawArea.method372(arg0 - 1, arg1, arg2);
		this.drawArea.method372(arg0 + 1, arg1, arg2);
		this.drawArea.method372(arg0, arg1 - 1, arg2);
		this.drawArea.method372(arg0, arg1 + 1, arg2);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "a", descriptor = "(IIIIZ)V")
	private void method542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.method546(arg0, arg1, arg2, arg3, arg2, arg3, false, arg4);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "b", descriptor = "(IIIIZ)V")
	private void method543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (!this.method546(arg0, arg1, arg2, arg3, arg2, arg3, false, arg4)) {
			this.method546(arg0, arg1, arg2, arg3, arg2, arg3, true, arg4);
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "c", descriptor = "(IIII)V")
	private void method544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8;
		@Pc(12) int local12;
		if (arg2 == 0 || arg2 == 4) {
			local8 = ClientConfig.locWidth[arg3];
			local12 = ClientConfig.locLength[arg3];
		} else {
			local12 = ClientConfig.locWidth[arg3];
			local8 = ClientConfig.locLength[arg3];
		}
		if (ClientConfig.locType[arg3] != 2 && ClientConfig.locType[arg3] != 3) {
			this.method546(this.anInt428, this.anInt429, arg0, arg1, arg0 + local8 - 1, arg1 + local12 - 1, true, true);
			return;
		}
		if (arg2 == 0) {
			arg0--;
			local8++;
		}
		if (arg2 == 2) {
			local12++;
		}
		if (arg2 == 4) {
			local8++;
		}
		if (arg2 == 6) {
			arg1--;
			local12++;
		}
		this.method546(this.anInt428, this.anInt429, arg0, arg1, arg0 + local8 - 1, arg1 + local12 - 1, false, true);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "c", descriptor = "(III)V")
	private void method545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			this.method546(this.anInt428, this.anInt429, arg0, arg1 - 1, arg0, arg1, false, true);
		} else if (arg2 == 1) {
			this.method546(this.anInt428, this.anInt429, arg0 - 1, arg1, arg0, arg1, false, true);
		} else {
			this.method546(this.anInt428, this.anInt429, arg0, arg1, arg0, arg1, true, true);
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "a", descriptor = "(IIIIIIZZ)Z")
	private boolean method546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		@Pc(16) int local16 = this.world.method413(arg0, arg1, arg2, arg3, arg4, arg5, this.anIntArray168, this.anIntArray169, arg6);
		if (local16 == -1) {
			return false;
		}
		local16--;
		@Pc(27) int local27 = this.anIntArray168[local16];
		@Pc(32) int local32 = this.anIntArray169[local16];
		local16--;
		if (arg7) {
			super.stream.p1spooky(215, 592);
		} else {
			super.stream.p1spooky(194, 770);
		}
		super.stream.p2(local27 + this.anInt410);
		super.stream.p2(local32 + this.anInt411);
		for (@Pc(63) int local63 = local16; local63 >= 0 && local63 > local16 - 25; local63--) {
			super.stream.p1(this.anIntArray168[local63] - local27);
			super.stream.p1(this.anIntArray169[local63] - local32);
		}
		super.stream.encryptPacket();
		this.anInt403 = -24;
		this.anInt404 = super.mouseX;
		this.anInt405 = super.mouseY;
		return true;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "c", descriptor = "(II)Z")
	private boolean method547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt511 != 0) {
			this.world.aBoolean55 = false;
			return false;
		}
		this.aBoolean99 = false;
		@Pc(18) int local18 = arg0 + this.anInt406;
		@Pc(23) int local23 = arg1 + this.anInt407;
		if (this.anInt409 == this.anInt412 && local18 > this.anInt413 && local18 < this.anInt415 && local23 > this.anInt414 && local23 < this.anInt416) {
			this.world.aBoolean55 = true;
			return false;
		}
		this.drawArea.drawStringCenter("Loading... Please wait", 256, 192, 1, 16777215);
		this.method532();
		this.drawArea.method363(this.aGraphics5, 0, 0);
		@Pc(70) int local70 = this.anInt410;
		@Pc(73) int local73 = this.anInt411;
		@Pc(79) int local79 = (local18 + 24) / 48;
		@Pc(85) int local85 = (local23 + 24) / 48;
		this.anInt409 = this.anInt412;
		this.anInt410 = local79 * 48 - 48;
		this.anInt411 = local85 * 48 - 48;
		this.anInt413 = local79 * 48 - 32;
		this.anInt414 = local85 * 48 - 32;
		this.anInt415 = local79 * 48 + 32;
		this.anInt416 = local85 * 48 + 32;
		this.world.method440(local18, local23, this.anInt409);
		this.anInt410 -= this.anInt406;
		this.anInt411 -= this.anInt407;
		@Pc(157) int local157 = this.anInt410 - local70;
		@Pc(162) int local162 = this.anInt411 - local73;
		@Pc(187) int local187;
		@Pc(192) int local192;
		@Pc(197) int local197;
		@Pc(207) int local207;
		@Pc(216) int local216;
		for (@Pc(164) int local164 = 0; local164 < this.anInt438; local164++) {
			this.anIntArray177[local164] -= local157;
			this.anIntArray178[local164] -= local162;
			local187 = this.anIntArray177[local164];
			local192 = this.anIntArray178[local164];
			local197 = this.anIntArray179[local164];
			@Pc(202) Object3D local202 = this.anObject3DArray4[local164];
			try {
				local207 = this.anIntArray180[local164];
				@Pc(220) int local220;
				if (local207 == 0 || local207 == 4) {
					local216 = ClientConfig.locWidth[local197];
					local220 = ClientConfig.locLength[local197];
				} else {
					local220 = ClientConfig.locWidth[local197];
					local216 = ClientConfig.locLength[local197];
				}
				@Pc(241) int local241 = (local187 + local187 + local216) * this.anInt383 / 2;
				@Pc(252) int local252 = (local192 + local192 + local220) * this.anInt383 / 2;
				if (local187 >= 0 && local192 >= 0 && local187 < 96 && local192 < 96) {
					this.world3D.method198(local202);
					local202.method129(local241, -this.world.method424(local241, local252), local252);
					this.world.method418(local187, local192, local197);
					if (local197 == 74) {
						local202.method128(0, -480, 0);
					}
				}
			} catch (@Pc(292) RuntimeException local292) {
				System.out.println("Loc Error: " + local292.getMessage());
				System.out.println("i:" + local164 + " obj:" + local202);
				local292.printStackTrace();
			}
		}
		@Pc(358) int local358;
		for (local187 = 0; local187 < this.anInt440; local187++) {
			this.anIntArray181[local187] -= local157;
			this.anIntArray182[local187] -= local162;
			local192 = this.anIntArray181[local187];
			local197 = this.anIntArray182[local187];
			local358 = this.anIntArray184[local187];
			local207 = this.anIntArray183[local187];
			try {
				this.world.method416(local192, local197, local207, local358);
				@Pc(378) Object3D local378 = this.method548(local192, local197, local207, local358, local187);
				this.anObject3DArray6[local187] = local378;
			} catch (@Pc(385) RuntimeException local385) {
				System.out.println("Bound Error: " + local385.getMessage());
				local385.printStackTrace();
			}
		}
		for (local192 = 0; local192 < this.anInt436; local192++) {
			this.anIntArray173[local192] -= local157;
			this.anIntArray174[local192] -= local162;
		}
		for (local197 = 0; local197 < this.anInt425; local197++) {
			@Pc(437) Entity local437 = this.anEntityArray2[local197];
			local437.anInt292 -= local157 * this.anInt383;
			local437.anInt293 -= local162 * this.anInt383;
			for (local207 = 0; local207 <= local437.anInt299; local207++) {
				local437.anIntArray145[local207] -= local157 * this.anInt383;
				local437.anIntArray146[local207] -= local162 * this.anInt383;
			}
		}
		for (local358 = 0; local358 < this.anInt433; local358++) {
			@Pc(500) Entity local500 = this.anEntityArray5[local358];
			local500.anInt292 -= local157 * this.anInt383;
			local500.anInt293 -= local162 * this.anInt383;
			for (local216 = 0; local216 <= local500.anInt299; local216++) {
				local500.anIntArray145[local216] -= local157 * this.anInt383;
				local500.anIntArray146[local216] -= local162 * this.anInt383;
			}
		}
		this.world.aBoolean55 = true;
		return true;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "b", descriptor = "(IIIII)Lmudclient!a/a/f;")
	private Object3D method548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(1) int local1 = arg0;
		@Pc(5) int local5 = arg0;
		@Pc(7) int local7 = arg1;
		@Pc(11) int local11 = ClientConfig.boundFrontMask[arg3];
		@Pc(15) int local15 = ClientConfig.boundBackMask[arg3];
		@Pc(19) int local19 = ClientConfig.boundHeight[arg3];
		@Pc(25) Object3D local25 = new Object3D(4, 1);
		if (arg2 == 0) {
			local5 = arg0 + 1;
		}
		if (arg2 == 1) {
			local7 = arg1 + 1;
		}
		if (arg2 == 2) {
			local1 = arg0 + 1;
			local7 = arg1 + 1;
		}
		if (arg2 == 3) {
			local5 = arg0 + 1;
			local7 = arg1 + 1;
		}
		local1 *= this.anInt383;
		@Pc(70) int local70 = arg1 * this.anInt383;
		local5 *= this.anInt383;
		local7 *= this.anInt383;
		@Pc(91) int local91 = local25.method117(local1, -this.world.method424(local1, local70), local70);
		@Pc(104) int local104 = local25.method117(local1, -this.world.method424(local1, local70) - local19, local70);
		@Pc(117) int local117 = local25.method117(local5, -this.world.method424(local5, local7) - local19, local7);
		@Pc(128) int local128 = local25.method117(local5, -this.world.method424(local5, local7), local7);
		@Pc(147) int[] local147 = new int[] { local91, local104, local117, local128 };
		local25.method119(4, local147, local11, local15);
		local25.method122(false, 60, 24, -50, -10, -50);
		if (arg0 >= 0 && arg1 >= 0 && arg0 < 96 && arg1 < 96) {
			this.world3D.method198(local25);
		}
		local25.anInt88 = arg4 + 10000;
		return local25;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "ba", descriptor = "()V")
	private void method549() {
		if (this.anInt509 != 0) {
			this.method554();
		} else if (this.aBoolean96) {
			this.method552();
		} else if (this.aBoolean98) {
			this.method553();
		} else if (this.anInt512 == 1) {
			this.method555();
		} else if (this.aBoolean93 && this.anInt510 == 0) {
			this.method559();
		} else if (this.aBoolean92 && this.anInt510 == 0) {
			this.method560();
		} else if (this.aBoolean90) {
			this.method561();
		} else if (this.aBoolean87) {
			this.method562();
		} else if (this.aBoolean85) {
			this.method563();
		} else if (this.aBoolean78) {
			this.method564();
		} else if (this.anInt504 != 0) {
			this.method557();
		} else if (this.anInt502 != 0) {
			this.method556();
		} else if (this.anInt501 == 0) {
			if (this.aBoolean94) {
				this.method550();
			}
			if (this.localPlayer.anInt296 == 8 || this.localPlayer.anInt296 == 9) {
				this.method551();
			}
			this.method565();
			@Pc(128) boolean local128 = !this.aBoolean94 && !this.aBoolean77;
			if (local128) {
				this.menuSize = 0;
			}
			if (this.anInt441 == 0 && local128) {
				this.method572();
			}
			if (this.anInt441 == 1) {
				this.method566(local128);
			}
			if (this.anInt441 == 2) {
				this.method567(local128);
			}
			if (this.anInt441 == 3) {
				this.method568(local128);
			}
			if (this.anInt441 == 4) {
				this.method569(local128);
			}
			if (this.anInt441 == 5) {
				this.method570(local128);
			}
			if (this.anInt441 == 6) {
				this.method571(local128);
			}
			if (!this.aBoolean77 && !this.aBoolean94) {
				this.method574();
			}
			if (this.aBoolean77 && !this.aBoolean94) {
				this.method573();
			}
		} else {
			this.method558();
		}
		this.anInt374 = 0;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "bb", descriptor = "()V")
	private void method550() {
		@Pc(6) int local6;
		if (this.anInt374 == 0) {
			for (local6 = 0; local6 < this.anInt499; local6++) {
				@Pc(65) int local65 = 65535;
				if (super.mouseX < this.drawArea.stringWidth(this.aStringArray36[local6], 1) && super.mouseY > local6 * 12 && super.mouseY < local6 * 12 + 12) {
					local65 = 16711680;
				}
				this.drawArea.drawString(this.aStringArray36[local6], 6, local6 * 12 + 12, 1, local65);
			}
			return;
		}
		for (local6 = 0; local6 < this.anInt499; local6++) {
			if (super.mouseX < this.drawArea.stringWidth(this.aStringArray36[local6], 1) && super.mouseY > local6 * 12 && super.mouseY < local6 * 12 + 12) {
				super.stream.p1spooky(237, 3);
				super.stream.p1(local6);
				super.stream.encryptPacket();
				break;
			}
		}
		this.anInt374 = 0;
		this.aBoolean94 = false;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "bc", descriptor = "()V")
	private void method551() {
		@Pc(3) byte local3 = 7;
		@Pc(5) byte local5 = 15;
		@Pc(7) short local7 = 175;
		@Pc(12) int local12;
		if (this.anInt374 != 0) {
			for (local12 = 0; local12 < 5; local12++) {
				if (local12 > 0 && super.mouseX > local3 && super.mouseX < local3 + local7 && super.mouseY > local5 + local12 * 20 && super.mouseY < local5 + local12 * 20 + 20) {
					this.anInt500 = local12 - 1;
					this.anInt374 = 0;
					super.stream.p1spooky(231, 700);
					super.stream.p1(this.anInt500);
					super.stream.encryptPacket();
					break;
				}
			}
		}
		for (local12 = 0; local12 < 5; local12++) {
			if (local12 == this.anInt500 + 1) {
				this.drawArea.method366(local3, local5 + local12 * 20, local7, 20, PixMap.method375(255, 0, 0), 128);
			} else {
				this.drawArea.method366(local3, local5 + local12 * 20, local7, 20, PixMap.method375(190, 190, 190), 128);
			}
			this.drawArea.method370(local3, local5 + local12 * 20, local7, 0);
			this.drawArea.method370(local3, local5 + local12 * 20 + 20, local7, 0);
		}
		this.drawArea.drawStringCenter("Select combat style", local3 + local7 / 2, local5 + 16, 3, 16777215);
		this.drawArea.drawStringCenter("Controlled (+1 of each)", local3 + local7 / 2, local5 + 36, 3, 0);
		this.drawArea.drawStringCenter("Aggressive (+3 strength)", local3 + local7 / 2, local5 + 56, 3, 0);
		this.drawArea.drawStringCenter("Accurate   (+3 attack)", local3 + local7 / 2, local5 + 76, 3, 0);
		this.drawArea.drawStringCenter("Defensive  (+3 defense)", local3 + local7 / 2, local5 + 96, 3, 0);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "bd", descriptor = "()V")
	private void method552() {
		@Pc(6) short local6;
		if (this.anInt507 > 0) {
			local6 = 180;
		} else {
			local6 = 100;
		}
		@Pc(16) int local16 = 167 - local6 / 2;
		this.drawArea.method368(56, 167 - local6 / 2, 400, local6, 0);
		this.drawArea.method369(56, 167 - local6 / 2, 400, local6, 16777215);
		@Pc(41) int local41 = local16 + 20;
		this.drawArea.drawStringCenter("Welcome to RuneScape " + this.aString41, 256, local41, 4, 16776960);
		@Pc(57) int local57 = local41 + 30;
		@Pc(62) String local62;
		if (this.anInt506 <= 0) {
			local62 = "earlier today";
		} else if (this.anInt506 == 1) {
			local62 = "yesterday";
		} else {
			local62 = this.anInt506 + " days ago";
		}
		this.drawArea.drawStringCenter("You last logged in " + local62, 256, local57, 1, 16777215);
		local16 = local57 + 15;
		if (this.aString37 == null) {
			this.aString37 = this.getHostName(this.anInt505);
		}
		this.drawArea.drawStringCenter("from: " + this.aString37, 256, local16, 1, 16777215);
		local16 += 15;
		local16 += 15;
		@Pc(191) int local191;
		if (this.anInt507 > 0) {
			if (this.anInt507 == 14) {
				local62 = "Earlier today";
			} else if (this.anInt507 == 13) {
				local62 = "Yesterday";
			} else {
				local62 = 14 - this.anInt507 + " days ago";
			}
			this.drawArea.drawStringCenter(local62 + " you changed your recovery questions", 256, local16, 1, 16744448);
			local16 += 15;
			this.drawArea.drawStringCenter("If you do not remember making this change then", 256, local16, 1, 16744448);
			local16 += 15;
			this.drawArea.drawStringCenter("cancel it and change your password immediately!", 256, local16, 1, 16744448);
			local16 += 15;
			local16 += 15;
			local191 = 16777215;
			if (super.mouseY > local16 - 12 && super.mouseY <= local16 && super.mouseX > 106 && super.mouseX < 406) {
				local191 = 16711680;
			}
			this.drawArea.drawStringCenter("No that wasn't me - Cancel the request!", 256, local16, 1, local191);
			if (local191 == 16711680 && this.anInt374 == 1) {
				super.stream.p1spooky(196, 651);
				super.stream.encryptPacket();
				this.aBoolean96 = false;
			}
			local16 += 15;
			local191 = 16777215;
			if (super.mouseY > local16 - 12 && super.mouseY <= local16 && super.mouseX > 106 && super.mouseX < 406) {
				local191 = 16711680;
			}
			this.drawArea.drawStringCenter("That's ok, activate the new questions in " + this.anInt507 + " days time.", 256, local16, 1, local191);
			if (local191 == 16711680 && this.anInt374 == 1) {
				this.aBoolean96 = false;
			}
		} else {
			local191 = 16777215;
			if (super.mouseY > local16 - 12 && super.mouseY <= local16 && super.mouseX > 106 && super.mouseX < 406) {
				local191 = 16711680;
			}
			this.drawArea.drawStringCenter("Click here to close window", 256, local16, 1, local191);
			if (this.anInt374 == 1) {
				if (local191 == 16711680) {
					this.aBoolean96 = false;
				}
				if ((super.mouseX < 86 || super.mouseX > 426) && (super.mouseY < 167 - local6 / 2 || super.mouseY > local6 / 2 + 167)) {
					this.aBoolean96 = false;
				}
			}
		}
		this.anInt374 = 0;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "be", descriptor = "()V")
	private void method553() {
		@Pc(1) short local1 = 400;
		@Pc(3) short local3 = 100;
		if (this.aBoolean97) {
			local3 = 300;
		}
		this.drawArea.method368(256 - local1 / 2, 167 - local3 / 2, local1, local3, 0);
		this.drawArea.method369(256 - local1 / 2, 167 - local3 / 2, local1, local3, 16777215);
		this.drawArea.centerParagraph(this.aString38, 256, 167 + 20 - local3 / 2, 1, 16777215, local1 - 40);
		@Pc(66) int local66 = local3 / 2 + 157;
		@Pc(68) int local68 = 16777215;
		if (super.mouseY > local66 - 12 && super.mouseY <= local66 && super.mouseX > 106 && super.mouseX < 406) {
			local68 = 16711680;
		}
		this.drawArea.drawStringCenter("Click here to close window", 256, local66, 1, local68);
		if (this.anInt374 == 1) {
			if (local68 == 16711680) {
				this.aBoolean98 = false;
			}
			if ((super.mouseX < 256 - local1 / 2 || super.mouseX > local1 / 2 + 256) && (super.mouseY < 167 - local3 / 2 || super.mouseY > local3 / 2 + 167)) {
				this.aBoolean98 = false;
			}
		}
		this.anInt374 = 0;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "bf", descriptor = "()V")
	private void method554() {
		this.drawArea.method368(126, 137, 260, 60, 0);
		this.drawArea.method369(126, 137, 260, 60, 16777215);
		this.drawArea.drawStringCenter("Logging out...", 256, 173, 5, 16777215);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "bg", descriptor = "()V")
	private void method555() {
		@Pc(1) byte local1 = 97;
		this.drawArea.method368(86, 77, 340, 180, 0);
		this.drawArea.method369(86, 77, 340, 180, 16777215);
		this.drawArea.drawStringCenter("Warning! Proceed with caution", 256, local1, 4, 16711680);
		@Pc(26) int local26 = local1 + 26;
		this.drawArea.drawStringCenter("If you go much further north you will enter the", 256, local26, 1, 16777215);
		@Pc(35) int local35 = local26 + 13;
		this.drawArea.drawStringCenter("wilderness. This a very dangerous area where", 256, local35, 1, 16777215);
		@Pc(44) int local44 = local35 + 13;
		this.drawArea.drawStringCenter("other players can attack you!", 256, local44, 1, 16777215);
		@Pc(53) int local53 = local44 + 22;
		this.drawArea.drawStringCenter("The further north you go the more dangerous it", 256, local53, 1, 16777215);
		@Pc(62) int local62 = local53 + 13;
		this.drawArea.drawStringCenter("becomes, but the more treasure you will find.", 256, local62, 1, 16777215);
		@Pc(71) int local71 = local62 + 22;
		this.drawArea.drawStringCenter("In the wilderness an indicator at the bottom-right", 256, local71, 1, 16777215);
		@Pc(80) int local80 = local71 + 13;
		this.drawArea.drawStringCenter("of the screen will show the current level of danger", 256, local80, 1, 16777215);
		@Pc(89) int local89 = local80 + 22;
		@Pc(91) int local91 = 16777215;
		if (super.mouseY > local89 - 12 && super.mouseY <= local89 && super.mouseX > 181 && super.mouseX < 331) {
			local91 = 16711680;
		}
		this.drawArea.drawStringCenter("Click here to close window", 256, local89, 1, local91);
		if (this.anInt374 == 0) {
			return;
		}
		if (super.mouseY > local89 - 12 && super.mouseY <= local89 && super.mouseX > 181 && super.mouseX < 331) {
			this.anInt512 = 2;
		}
		if (super.mouseX < 86 || super.mouseX > 426 || super.mouseY < 77 || super.mouseY > 257) {
			this.anInt512 = 2;
		}
		this.anInt374 = 0;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "bh", descriptor = "()V")
	private void method556() {
		@Pc(29) int local29;
		@Pc(31) int local31;
		if (this.anInt374 != 0) {
			this.anInt374 = 0;
			if (super.mouseX < 56 || super.mouseY < 35 || super.mouseX > 456 || super.mouseY > 325) {
				this.anInt502 = 0;
				return;
			}
			local29 = 140;
			for (local31 = 0; local31 < 9; local31++) {
				if (super.mouseX > 66 && super.mouseX < 446 && super.mouseY >= local29 - 12 && super.mouseY < local29 + 3) {
					this.anInt503 = local31;
				}
				local29 += 15;
			}
			local29 += 45;
			if (super.mouseX > 196 && super.mouseX < 316 && super.mouseY > local29 - 15 && super.mouseY < local29 + 5) {
				this.anInt502 = 0;
				return;
			}
		}
		if (super.aString26.length() > 0) {
			@Pc(94) String local94 = super.aString26.trim();
			super.aString25 = "";
			super.aString26 = "";
			if (local94.length() > 0) {
				@Pc(106) long local106 = Tools.toBase37(local94);
				super.stream.p1spooky(51, 277);
				super.stream.p8(local106);
				super.stream.p1(this.anInt503);
				super.stream.encryptPacket();
			}
			this.anInt502 = 0;
			return;
		}
		this.drawArea.method368(56, 35, 400, 290, 0);
		this.drawArea.method369(56, 35, 400, 290, 16777215);
		@Pc(145) byte local145 = 50;
		this.drawArea.drawStringCenter("This form sends a snapshot of the last 60 secs of trade/chat", 256, local145, 1, 16777215);
		local29 = local145 + 15;
		this.drawArea.drawStringCenter("to customer support. Please only use this for serious abuse", 256, local29, 1, 16777215);
		local29 += 15;
		this.drawArea.drawStringCenter("If you misuse this form, you will be banned.", 256, local29, 1, 16744448);
		local29 += 15;
		this.drawArea.drawStringCenter("Do not report abuse unless you were genuinely offended", 256, local29, 1, 16744448);
		local29 += 15;
		local29 += 15;
		this.drawArea.drawStringCenter("First indicate the type of abuse", 256, local29, 1, 16776960);
		local29 += 15;
		if (this.anInt503 == 0) {
			this.drawArea.method369(66, local29 - 12, 380, 15, 16777215);
			local31 = 16744448;
		} else {
			local31 = 16777215;
		}
		this.drawArea.drawStringCenter("Non-vulgar insult such as 'idiot', 'noob', 'loser', etc...", 256, local29, 1, local31);
		local29 += 15;
		if (this.anInt503 == 1) {
			this.drawArea.method369(66, local29 - 12, 380, 15, 16777215);
			local31 = 16744448;
		} else {
			local31 = 16777215;
		}
		this.drawArea.drawStringCenter("Swearing, profanity, or racial abuse directed at me personally", 256, local29, 1, local31);
		local29 += 15;
		if (this.anInt503 == 2) {
			this.drawArea.method369(66, local29 - 12, 380, 15, 16777215);
			local31 = 16744448;
		} else {
			local31 = 16777215;
		}
		this.drawArea.drawStringCenter("I overheard the player being abusive to someone else", 256, local29, 1, local31);
		local29 += 15;
		if (this.anInt503 == 3) {
			this.drawArea.method369(66, local29 - 12, 380, 15, 16777215);
			local31 = 16744448;
		} else {
			local31 = 16777215;
		}
		this.drawArea.drawStringCenter("Trade scam - lied about trade to steal items from me", 256, local29, 1, local31);
		local29 += 15;
		if (this.anInt503 == 4) {
			this.drawArea.method369(66, local29 - 12, 380, 15, 16777215);
			local31 = 16744448;
		} else {
			local31 = 16777215;
		}
		this.drawArea.drawStringCenter("Asking players for their password / trying to steal accounts", 256, local29, 1, local31);
		local29 += 15;
		if (this.anInt503 == 5) {
			this.drawArea.method369(66, local29 - 12, 380, 15, 16777215);
			local31 = 16744448;
		} else {
			local31 = 16777215;
		}
		this.drawArea.drawStringCenter("Attempting to buy/sell a RuneScape account", 256, local29, 1, local31);
		local29 += 15;
		if (this.anInt503 == 6) {
			this.drawArea.method369(66, local29 - 12, 380, 15, 16777215);
			local31 = 16744448;
		} else {
			local31 = 16777215;
		}
		this.drawArea.drawStringCenter("Impersonating Jagex staff", 256, local29, 1, local31);
		local29 += 15;
		if (this.anInt503 == 7) {
			this.drawArea.method369(66, local29 - 12, 380, 15, 16777215);
			local31 = 16744448;
		} else {
			local31 = 16777215;
		}
		this.drawArea.drawStringCenter("Advertising scam website", 256, local29, 1, local31);
		local29 += 15;
		if (this.anInt503 == 8) {
			this.drawArea.method369(66, local29 - 12, 380, 15, 16777215);
			local31 = 16744448;
		} else {
			local31 = 16777215;
		}
		this.drawArea.drawStringCenter("Other", 256, local29, 1, local31);
		local29 += 15;
		local29 += 11;
		this.drawArea.drawStringCenter("Then type the name of the offending player, and press enter", 256, local29, 1, 16776960);
		local29 += 15;
		this.drawArea.drawStringCenter("Name: " + super.aString25 + "*", 256, local29, 4, 16777215);
		local29 += 19;
		local31 = 16777215;
		if (super.mouseX > 196 && super.mouseX < 316 && super.mouseY > local29 - 15 && super.mouseY < local29 + 5) {
			local31 = 16776960;
		}
		this.drawArea.drawStringCenter("Click here to cancel", 256, local29, 1, local31);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "bi", descriptor = "()V")
	private void method557() {
		if (this.anInt374 != 0) {
			this.anInt374 = 0;
			if (super.mouseX < 106 || super.mouseY < 150 || super.mouseX > 406 || super.mouseY > 210) {
				this.anInt504 = 0;
				return;
			}
		}
		@Pc(29) short local29 = 150;
		this.drawArea.method368(106, local29, 300, 60, 0);
		this.drawArea.method369(106, local29, 300, 60, 16777215);
		@Pc(46) int local46 = local29 + 22;
		@Pc(61) String local61;
		@Pc(63) int local63;
		if (this.anInt504 == 6) {
			this.drawArea.drawStringCenter("Please enter your current password", 256, local46, 4, 16777215);
			local46 += 25;
			local61 = "*";
			for (local63 = 0; local63 < super.aString25.length(); local63++) {
				local61 = "X" + local61;
			}
			this.drawArea.drawStringCenter(local61, 256, local46, 4, 16777215);
			if (super.aString26.length() > 0) {
				this.aString35 = super.aString26;
				super.aString25 = "";
				super.aString26 = "";
				this.anInt504 = 1;
				return;
			}
		} else if (this.anInt504 == 1) {
			this.drawArea.drawStringCenter("Please enter your new password", 256, local46, 4, 16777215);
			local46 += 25;
			local61 = "*";
			for (local63 = 0; local63 < super.aString25.length(); local63++) {
				local61 = "X" + local61;
			}
			this.drawArea.drawStringCenter(local61, 256, local46, 4, 16777215);
			if (super.aString26.length() > 0) {
				this.aString36 = super.aString26;
				super.aString25 = "";
				super.aString26 = "";
				this.anInt504 = 2;
				if (this.aString36.length() < 5) {
					this.anInt504 = 5;
				}
				if (this.aString36.trim().equalsIgnoreCase(this.aString41.trim())) {
					this.anInt504 = 7;
					return;
				}
			}
		} else if (this.anInt504 == 2) {
			this.drawArea.drawStringCenter("Enter password again to confirm", 256, local46, 4, 16777215);
			local46 += 25;
			local61 = "*";
			for (local63 = 0; local63 < super.aString25.length(); local63++) {
				local61 = "X" + local61;
			}
			this.drawArea.drawStringCenter(local61, 256, local46, 4, 16777215);
			if (super.aString26.length() > 0) {
				if (super.aString26.equalsIgnoreCase(this.aString36)) {
					this.anInt504 = 4;
					this.method477(this.aString35, this.aString36);
					return;
				}
				this.anInt504 = 3;
				return;
			}
		} else if (this.anInt504 == 3) {
			this.drawArea.drawStringCenter("Passwords do not match!", 256, local46, 4, 16777215);
			local46 += 25;
			this.drawArea.drawStringCenter("Press any key to close", 256, local46, 4, 16777215);
			return;
		} else if (this.anInt504 == 4) {
			this.drawArea.drawStringCenter("Ok, your request has been sent", 256, local46, 4, 16777215);
			local46 += 25;
			this.drawArea.drawStringCenter("Press any key to close", 256, local46, 4, 16777215);
			return;
		} else if (this.anInt504 == 5) {
			this.drawArea.drawStringCenter("Password must be at", 256, local46, 4, 16777215);
			local46 += 25;
			this.drawArea.drawStringCenter("least 5 letters long", 256, local46, 4, 16777215);
			return;
		} else if (this.anInt504 == 7) {
			this.drawArea.drawStringCenter("Your password must not be", 256, local46, 4, 16777215);
			local46 += 25;
			this.drawArea.drawStringCenter("the same as your username", 256, local46, 4, 16777215);
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "bj", descriptor = "()V")
	private void method558() {
		if (this.anInt374 != 0) {
			label118: {
				this.anInt374 = 0;
				if (this.anInt501 != 1 || super.mouseX >= 106 && super.mouseY >= 145 && super.mouseX <= 406 && super.mouseY <= 215) {
					if (this.anInt501 == 2 && (super.mouseX < 6 || super.mouseY < 145 || super.mouseX > 506 || super.mouseY > 215)) {
						this.anInt501 = 0;
						return;
					}
					if (this.anInt501 != 3 || super.mouseX >= 106 && super.mouseY >= 145 && super.mouseX <= 406 && super.mouseY <= 215) {
						if (super.mouseX > 236 && super.mouseX < 276 && super.mouseY > 193 && super.mouseY < 213) {
							this.anInt501 = 0;
							return;
						}
						break label118;
					}
					this.anInt501 = 0;
					return;
				}
				this.anInt501 = 0;
				return;
			}
		}
		@Pc(99) int local99 = 145;
		@Pc(153) String local153;
		if (this.anInt501 == 1) {
			this.drawArea.method368(106, local99, 300, 70, 0);
			this.drawArea.method369(106, local99, 300, 70, 16777215);
			local99 += 20;
			this.drawArea.drawStringCenter("Enter name to add to friends list", 256, local99, 4, 16777215);
			local99 += 20;
			this.drawArea.drawStringCenter(super.aString25 + "*", 256, local99, 4, 16777215);
			if (super.aString26.length() > 0) {
				local153 = super.aString26.trim();
				super.aString25 = "";
				super.aString26 = "";
				this.anInt501 = 0;
				if (local153.length() > 0 && Tools.toBase37(local153) != this.localPlayer.aLong3) {
					this.method481(local153);
				}
			}
		}
		if (this.anInt501 == 2) {
			this.drawArea.method368(6, local99, 500, 70, 0);
			this.drawArea.method369(6, local99, 500, 70, 16777215);
			local99 += 20;
			this.drawArea.drawStringCenter("Enter message to send to " + Tools.fromBase37(this.aLong5), 256, local99, 4, 16777215);
			local99 += 20;
			this.drawArea.drawStringCenter(super.aString27 + "*", 256, local99, 4, 16777215);
			if (super.aString28.length() > 0) {
				local153 = super.aString28;
				super.aString27 = "";
				super.aString28 = "";
				this.anInt501 = 0;
				@Pc(248) int local248 = WordPack.method353(local153);
				this.method483(this.aLong5, WordPack.aByteArray17, local248);
				local153 = WordPack.method352(WordPack.aByteArray17, 0, local248);
				local153 = WordFilter.filter(local153);
				this.method493("@pri@You tell " + Tools.fromBase37(this.aLong5) + ": " + local153);
			}
		}
		if (this.anInt501 == 3) {
			this.drawArea.method368(106, local99, 300, 70, 0);
			this.drawArea.method369(106, local99, 300, 70, 16777215);
			local99 += 20;
			this.drawArea.drawStringCenter("Enter name to add to ignore list", 256, local99, 4, 16777215);
			local99 += 20;
			this.drawArea.drawStringCenter(super.aString25 + "*", 256, local99, 4, 16777215);
			if (super.aString26.length() > 0) {
				local153 = super.aString26.trim();
				super.aString25 = "";
				super.aString26 = "";
				this.anInt501 = 0;
				if (local153.length() > 0 && Tools.toBase37(local153) != this.localPlayer.aLong3) {
					this.method479(local153);
				}
			}
		}
		@Pc(355) int local355 = 16777215;
		if (super.mouseX > 236 && super.mouseX < 276 && super.mouseY > 193 && super.mouseY < 213) {
			local355 = 16776960;
		}
		this.drawArea.drawStringCenter("Cancel", 256, 208, 1, local355);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "bk", descriptor = "()V")
	private void method559() {
		@Pc(3) short local3 = 408;
		@Pc(5) short local5 = 334;
		if (this.anInt498 > 0 && this.anInt494 <= 48) {
			this.anInt498 = 0;
		}
		if (this.anInt498 > 1 && this.anInt494 <= 96) {
			this.anInt498 = 1;
		}
		if (this.anInt498 > 2 && this.anInt494 <= 144) {
			this.anInt498 = 2;
		}
		if (this.anInt495 >= this.anInt494 || this.anInt495 < 0) {
			this.anInt495 = -1;
		}
		if (this.anInt495 != -1 && this.anIntArray222[this.anInt495] != this.anInt496) {
			this.anInt495 = -1;
			this.anInt496 = -2;
		}
		@Pc(81) int local81;
		@Pc(90) int local90;
		@Pc(106) int local106;
		@Pc(108) int local108;
		@Pc(112) int local112;
		@Pc(120) int local120;
		@Pc(126) int local126;
		if (this.anInt374 != 0) {
			this.anInt374 = 0;
			local81 = super.mouseX + local3 / 2 - 256;
			local90 = super.mouseY + local5 / 2 - 170;
			if (local81 >= 0 && local90 >= 12 && local81 < 408 && local90 < 280) {
				local106 = this.anInt498 * 48;
				for (local108 = 0; local108 < 6; local108++) {
					for (local112 = 0; local112 < 8; local112++) {
						local120 = local112 * 49 + 7;
						local126 = local108 * 34 + 28;
						if (local81 > local120 && local81 < local120 + 49 && local90 > local126 && local90 < local126 + 34 && local106 < this.anInt494 && this.anIntArray222[local106] != -1) {
							this.anInt496 = this.anIntArray222[local106];
							this.anInt495 = local106;
						}
						local106++;
					}
				}
				local81 = 256 - local3 / 2;
				local90 = 170 - local5 / 2;
				if (this.anInt495 < 0) {
					local112 = -1;
				} else {
					local112 = this.anIntArray222[this.anInt495];
				}
				if (local112 != -1) {
					local106 = this.anIntArray223[this.anInt495];
					if (ClientConfig.objStackable[local112] == 1 && local106 > 1) {
						local106 = 1;
					}
					if (local106 >= 1 && super.mouseX >= local81 + 220 && super.mouseY >= local90 + 238 && super.mouseX < local81 + 250 && super.mouseY <= local90 + 249) {
						super.stream.p1spooky(206, 655);
						super.stream.p2(local112);
						super.stream.p2(1);
						super.stream.encryptPacket();
					}
					if (local106 >= 5 && super.mouseX >= local81 + 250 && super.mouseY >= local90 + 238 && super.mouseX < local81 + 280 && super.mouseY <= local90 + 249) {
						super.stream.p1spooky(206, 655);
						super.stream.p2(local112);
						super.stream.p2(5);
						super.stream.encryptPacket();
					}
					if (local106 >= 25 && super.mouseX >= local81 + 280 && super.mouseY >= local90 + 238 && super.mouseX < local81 + 305 && super.mouseY <= local90 + 249) {
						super.stream.p1spooky(206, 655);
						super.stream.p2(local112);
						super.stream.p2(25);
						super.stream.encryptPacket();
					}
					if (local106 >= 100 && super.mouseX >= local81 + 305 && super.mouseY >= local90 + 238 && super.mouseX < local81 + 335 && super.mouseY <= local90 + 249) {
						super.stream.p1spooky(206, 655);
						super.stream.p2(local112);
						super.stream.p2(100);
						super.stream.encryptPacket();
					}
					if (local106 >= 500 && super.mouseX >= local81 + 335 && super.mouseY >= local90 + 238 && super.mouseX < local81 + 368 && super.mouseY <= local90 + 249) {
						super.stream.p1spooky(206, 655);
						super.stream.p2(local112);
						super.stream.p2(500);
						super.stream.encryptPacket();
					}
					if (local106 >= 2500 && super.mouseX >= local81 + 370 && super.mouseY >= local90 + 238 && super.mouseX < local81 + 400 && super.mouseY <= local90 + 249) {
						super.stream.p1spooky(206, 655);
						super.stream.p2(local112);
						super.stream.p2(2500);
						super.stream.encryptPacket();
					}
					if (this.method538(local112) >= 1 && super.mouseX >= local81 + 220 && super.mouseY >= local90 + 263 && super.mouseX < local81 + 250 && super.mouseY <= local90 + 274) {
						super.stream.p1spooky(205, 523);
						super.stream.p2(local112);
						super.stream.p2(1);
						super.stream.encryptPacket();
					}
					if (this.method538(local112) >= 5 && super.mouseX >= local81 + 250 && super.mouseY >= local90 + 263 && super.mouseX < local81 + 280 && super.mouseY <= local90 + 274) {
						super.stream.p1spooky(205, 523);
						super.stream.p2(local112);
						super.stream.p2(5);
						super.stream.encryptPacket();
					}
					if (this.method538(local112) >= 25 && super.mouseX >= local81 + 280 && super.mouseY >= local90 + 263 && super.mouseX < local81 + 305 && super.mouseY <= local90 + 274) {
						super.stream.p1spooky(205, 523);
						super.stream.p2(local112);
						super.stream.p2(25);
						super.stream.encryptPacket();
					}
					if (this.method538(local112) >= 100 && super.mouseX >= local81 + 305 && super.mouseY >= local90 + 263 && super.mouseX < local81 + 335 && super.mouseY <= local90 + 274) {
						super.stream.p1spooky(205, 523);
						super.stream.p2(local112);
						super.stream.p2(100);
						super.stream.encryptPacket();
					}
					if (this.method538(local112) >= 500 && super.mouseX >= local81 + 335 && super.mouseY >= local90 + 263 && super.mouseX < local81 + 368 && super.mouseY <= local90 + 274) {
						super.stream.p1spooky(205, 523);
						super.stream.p2(local112);
						super.stream.p2(500);
						super.stream.encryptPacket();
					}
					if (this.method538(local112) >= 2500 && super.mouseX >= local81 + 370 && super.mouseY >= local90 + 263 && super.mouseX < local81 + 400 && super.mouseY <= local90 + 274) {
						super.stream.p1spooky(205, 523);
						super.stream.p2(local112);
						super.stream.p2(2500);
						super.stream.encryptPacket();
					}
				}
			} else if (this.anInt494 > 48 && local81 >= 50 && local81 <= 115 && local90 <= 12) {
				this.anInt498 = 0;
			} else if (this.anInt494 > 48 && local81 >= 115 && local81 <= 180 && local90 <= 12) {
				this.anInt498 = 1;
			} else if (this.anInt494 > 96 && local81 >= 180 && local81 <= 245 && local90 <= 12) {
				this.anInt498 = 2;
			} else if (this.anInt494 > 144 && local81 >= 245 && local81 <= 310 && local90 <= 12) {
				this.anInt498 = 3;
			} else {
				super.stream.p1spooky(207, 886);
				super.stream.encryptPacket();
				this.aBoolean93 = false;
				return;
			}
		}
		local81 = 256 - local3 / 2;
		local90 = 170 - local5 / 2;
		this.drawArea.method368(local81, local90, 408, 12, 192);
		local106 = 10000536;
		this.drawArea.method366(local81, local90 + 12, 408, 17, local106, 160);
		this.drawArea.method366(local81, local90 + 29, 8, 204, local106, 160);
		this.drawArea.method366(local81 + 399, local90 + 29, 9, 204, local106, 160);
		this.drawArea.method366(local81, local90 + 233, 408, 47, local106, 160);
		this.drawArea.drawString("Bank", local81 + 1, local90 + 10, 1, 16777215);
		local108 = 50;
		if (this.anInt494 > 48) {
			local112 = 16777215;
			if (this.anInt498 == 0) {
				local112 = 16711680;
			} else if (super.mouseX > local81 + local108 && super.mouseY >= local90 && super.mouseX < local81 + local108 + 65 && super.mouseY < local90 + 12) {
				local112 = 16776960;
			}
			this.drawArea.drawString("<page 1>", local81 + local108, local90 + 10, 1, local112);
			local108 += 65;
			local112 = 16777215;
			if (this.anInt498 == 1) {
				local112 = 16711680;
			} else if (super.mouseX > local81 + local108 && super.mouseY >= local90 && super.mouseX < local81 + local108 + 65 && super.mouseY < local90 + 12) {
				local112 = 16776960;
			}
			this.drawArea.drawString("<page 2>", local81 + local108, local90 + 10, 1, local112);
			local108 += 65;
		}
		if (this.anInt494 > 96) {
			local112 = 16777215;
			if (this.anInt498 == 2) {
				local112 = 16711680;
			} else if (super.mouseX > local81 + local108 && super.mouseY >= local90 && super.mouseX < local81 + local108 + 65 && super.mouseY < local90 + 12) {
				local112 = 16776960;
			}
			this.drawArea.drawString("<page 3>", local81 + local108, local90 + 10, 1, local112);
			local108 += 65;
		}
		if (this.anInt494 > 144) {
			local112 = 16777215;
			if (this.anInt498 == 3) {
				local112 = 16711680;
			} else if (super.mouseX > local81 + local108 && super.mouseY >= local90 && super.mouseX < local81 + local108 + 65 && super.mouseY < local90 + 12) {
				local112 = 16776960;
			}
			this.drawArea.drawString("<page 4>", local81 + local108, local90 + 10, 1, local112);
			local108 += 65;
		}
		local112 = 16777215;
		if (super.mouseX > local81 + 320 && super.mouseY >= local90 && super.mouseX < local81 + 408 && super.mouseY < local90 + 12) {
			local112 = 16711680;
		}
		this.drawArea.drawStringRight("Close window", local81 + 406, local90 + 10, 1, local112);
		this.drawArea.drawString("Number in bank in green", local81 + 7, local90 + 24, 1, 65280);
		this.drawArea.drawString("Number held in blue", local81 + 289, local90 + 24, 1, 65535);
		local120 = 13684944;
		local126 = this.anInt498 * 48;
		@Pc(1192) int local1192;
		for (@Pc(1188) int local1188 = 0; local1188 < 6; local1188++) {
			for (local1192 = 0; local1192 < 8; local1192++) {
				@Pc(1202) int local1202 = local81 + local1192 * 49 + 7;
				@Pc(1210) int local1210 = local90 + local1188 * 34 + 28;
				if (this.anInt495 == local126) {
					this.drawArea.method366(local1202, local1210, 49, 34, 16711680, 160);
				} else {
					this.drawArea.method366(local1202, local1210, 49, 34, local120, 160);
				}
				this.drawArea.method369(local1202, local1210, 50, 35, 0);
				if (local126 < this.anInt494 && this.anIntArray222[local126] != -1) {
					this.drawArea.method399(local1202, local1210, 48, 32, this.anInt390 + ClientConfig.objSprite[this.anIntArray222[local126]], ClientConfig.objSpriteMask[this.anIntArray222[local126]], 0, 0, false);
					this.drawArea.drawString(String.valueOf(this.anIntArray223[local126]), local1202 + 1, local1210 + 10, 1, 65280);
					this.drawArea.drawStringRight(String.valueOf(this.method538(this.anIntArray222[local126])), local1202 + 47, local1210 + 29, 1, 65535);
				}
				local126++;
			}
		}
		this.drawArea.method370(local81 + 5, local90 + 256, 398, 0);
		if (this.anInt495 == -1) {
			this.drawArea.drawStringCenter("Select an object to withdraw or deposit", local81 + 204, local90 + 248, 3, 16776960);
			return;
		}
		if (this.anInt495 < 0) {
			local1192 = -1;
		} else {
			local1192 = this.anIntArray222[this.anInt495];
		}
		if (local1192 == -1) {
			return;
		}
		local126 = this.anIntArray223[this.anInt495];
		if (ClientConfig.objStackable[local1192] == 1 && local126 > 1) {
			local126 = 1;
		}
		if (local126 > 0) {
			this.drawArea.drawString("Withdraw " + ClientConfig.objName[local1192], local81 + 2, local90 + 248, 1, 16777215);
			local112 = 16777215;
			if (super.mouseX >= local81 + 220 && super.mouseY >= local90 + 238 && super.mouseX < local81 + 250 && super.mouseY <= local90 + 249) {
				local112 = 16711680;
			}
			this.drawArea.drawString("One", local81 + 222, local90 + 248, 1, local112);
			if (local126 >= 5) {
				local112 = 16777215;
				if (super.mouseX >= local81 + 250 && super.mouseY >= local90 + 238 && super.mouseX < local81 + 280 && super.mouseY <= local90 + 249) {
					local112 = 16711680;
				}
				this.drawArea.drawString("Five", local81 + 252, local90 + 248, 1, local112);
			}
			if (local126 >= 25) {
				local112 = 16777215;
				if (super.mouseX >= local81 + 280 && super.mouseY >= local90 + 238 && super.mouseX < local81 + 305 && super.mouseY <= local90 + 249) {
					local112 = 16711680;
				}
				this.drawArea.drawString("25", local81 + 282, local90 + 248, 1, local112);
			}
			if (local126 >= 100) {
				local112 = 16777215;
				if (super.mouseX >= local81 + 305 && super.mouseY >= local90 + 238 && super.mouseX < local81 + 335 && super.mouseY <= local90 + 249) {
					local112 = 16711680;
				}
				this.drawArea.drawString("100", local81 + 307, local90 + 248, 1, local112);
			}
			if (local126 >= 500) {
				local112 = 16777215;
				if (super.mouseX >= local81 + 335 && super.mouseY >= local90 + 238 && super.mouseX < local81 + 368 && super.mouseY <= local90 + 249) {
					local112 = 16711680;
				}
				this.drawArea.drawString("500", local81 + 337, local90 + 248, 1, local112);
			}
			if (local126 >= 2500) {
				local112 = 16777215;
				if (super.mouseX >= local81 + 370 && super.mouseY >= local90 + 238 && super.mouseX < local81 + 400 && super.mouseY <= local90 + 249) {
					local112 = 16711680;
				}
				this.drawArea.drawString("2500", local81 + 370, local90 + 248, 1, local112);
			}
		}
		if (this.method538(local1192) <= 0) {
			return;
		}
		this.drawArea.drawString("Deposit " + ClientConfig.objName[local1192], local81 + 2, local90 + 273, 1, 16777215);
		local112 = 16777215;
		if (super.mouseX >= local81 + 220 && super.mouseY >= local90 + 263 && super.mouseX < local81 + 250 && super.mouseY <= local90 + 274) {
			local112 = 16711680;
		}
		this.drawArea.drawString("One", local81 + 222, local90 + 273, 1, local112);
		if (this.method538(local1192) >= 5) {
			local112 = 16777215;
			if (super.mouseX >= local81 + 250 && super.mouseY >= local90 + 263 && super.mouseX < local81 + 280 && super.mouseY <= local90 + 274) {
				local112 = 16711680;
			}
			this.drawArea.drawString("Five", local81 + 252, local90 + 273, 1, local112);
		}
		if (this.method538(local1192) >= 25) {
			local112 = 16777215;
			if (super.mouseX >= local81 + 280 && super.mouseY >= local90 + 263 && super.mouseX < local81 + 305 && super.mouseY <= local90 + 274) {
				local112 = 16711680;
			}
			this.drawArea.drawString("25", local81 + 282, local90 + 273, 1, local112);
		}
		if (this.method538(local1192) >= 100) {
			local112 = 16777215;
			if (super.mouseX >= local81 + 305 && super.mouseY >= local90 + 263 && super.mouseX < local81 + 335 && super.mouseY <= local90 + 274) {
				local112 = 16711680;
			}
			this.drawArea.drawString("100", local81 + 307, local90 + 273, 1, local112);
		}
		if (this.method538(local1192) >= 500) {
			local112 = 16777215;
			if (super.mouseX >= local81 + 335 && super.mouseY >= local90 + 263 && super.mouseX < local81 + 368 && super.mouseY <= local90 + 274) {
				local112 = 16711680;
			}
			this.drawArea.drawString("500", local81 + 337, local90 + 273, 1, local112);
		}
		if (this.method538(local1192) < 2500) {
			return;
		}
		local112 = 16777215;
		if (super.mouseX >= local81 + 370 && super.mouseY >= local90 + 263 && super.mouseX < local81 + 400 && super.mouseY <= local90 + 274) {
			local112 = 16711680;
		}
		this.drawArea.drawString("2500", local81 + 370, local90 + 273, 1, local112);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "bl", descriptor = "()V")
	private void method560() {
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(44) int local44;
		@Pc(50) int local50;
		if (this.anInt374 != 0) {
			this.anInt374 = 0;
			@Pc(12) int local12 = super.mouseX - 52;
			@Pc(17) int local17 = super.mouseY - 44;
			if (local12 < 0 || local17 < 12 || local12 >= 408 || local17 >= 246) {
				super.stream.p1spooky(218, 312);
				super.stream.encryptPacket();
				this.aBoolean92 = false;
				return;
			}
			local30 = 0;
			for (local32 = 0; local32 < 5; local32++) {
				for (local36 = 0; local36 < 8; local36++) {
					local44 = local36 * 49 + 7;
					local50 = local32 * 34 + 28;
					if (local12 > local44 && local12 < local44 + 49 && local17 > local50 && local17 < local50 + 34 && this.anIntArray217[local30] != -1) {
						this.anInt491 = local30;
						this.anInt492 = this.anIntArray217[local30];
					}
					local30++;
				}
			}
			if (this.anInt491 >= 0) {
				local36 = this.anIntArray217[this.anInt491];
				if (local36 != -1) {
					if (this.anIntArray218[this.anInt491] > 0 && local12 > 298 && local17 >= 204 && local12 < 408 && local17 <= 215) {
						local44 = this.anInt490 + this.anIntArray219[this.anInt491];
						if (local44 < 10) {
							local44 = 10;
						}
						local50 = local44 * ClientConfig.objCost[local36] / 100;
						super.stream.p1spooky(217, 666);
						super.stream.p2(this.anIntArray217[this.anInt491]);
						super.stream.p4(local50);
						super.stream.encryptPacket();
					}
					if (this.method538(local36) > 0 && local12 > 2 && local17 >= 229 && local12 < 112 && local17 <= 240) {
						local44 = this.anInt489 + this.anIntArray219[this.anInt491];
						if (local44 < 10) {
							local44 = 10;
						}
						local50 = local44 * ClientConfig.objCost[local36] / 100;
						super.stream.p1spooky(216, 665);
						super.stream.p2(this.anIntArray217[this.anInt491]);
						super.stream.p4(local50);
						super.stream.encryptPacket();
					}
				}
			}
		}
		@Pc(236) byte local236 = 52;
		@Pc(238) byte local238 = 44;
		this.drawArea.method368(local236, local238, 408, 12, 192);
		local30 = 10000536;
		this.drawArea.method366(local236, local238 + 12, 408, 17, local30, 160);
		this.drawArea.method366(local236, local238 + 29, 8, 170, local30, 160);
		this.drawArea.method366(local236 + 399, local238 + 29, 9, 170, local30, 160);
		this.drawArea.method366(local236, local238 + 199, 408, 47, local30, 160);
		this.drawArea.drawString("Buying and selling items", local236 + 1, local238 + 10, 1, 16777215);
		local32 = 16777215;
		if (super.mouseX > local236 + 320 && super.mouseY >= local238 && super.mouseX < local236 + 408 && super.mouseY < local238 + 12) {
			local32 = 16711680;
		}
		this.drawArea.drawStringRight("Close window", local236 + 406, local238 + 10, 1, local32);
		this.drawArea.drawString("Shops stock in green", local236 + 2, local238 + 24, 1, 65280);
		this.drawArea.drawString("Number you own in blue", local236 + 135, local238 + 24, 1, 65535);
		this.drawArea.drawString("Your money: " + this.method538(10) + "gp", local236 + 280, local238 + 24, 1, 16776960);
		local36 = 13684944;
		local44 = 0;
		@Pc(400) int local400;
		@Pc(410) int local410;
		@Pc(418) int local418;
		for (local50 = 0; local50 < 5; local50++) {
			for (local400 = 0; local400 < 8; local400++) {
				local410 = local236 + local400 * 49 + 7;
				local418 = local238 + local50 * 34 + 28;
				if (this.anInt491 == local44) {
					this.drawArea.method366(local410, local418, 49, 34, 16711680, 160);
				} else {
					this.drawArea.method366(local410, local418, 49, 34, local36, 160);
				}
				this.drawArea.method369(local410, local418, 50, 35, 0);
				if (this.anIntArray217[local44] != -1) {
					this.drawArea.method399(local410, local418, 48, 32, this.anInt390 + ClientConfig.objSprite[this.anIntArray217[local44]], ClientConfig.objSpriteMask[this.anIntArray217[local44]], 0, 0, false);
					this.drawArea.drawString(String.valueOf(this.anIntArray218[local44]), local410 + 1, local418 + 10, 1, 65280);
					this.drawArea.drawStringRight(String.valueOf(this.method538(this.anIntArray217[local44])), local410 + 47, local418 + 10, 1, 65535);
				}
				local44++;
			}
		}
		this.drawArea.method370(local236 + 5, local238 + 222, 398, 0);
		if (this.anInt491 == -1) {
			this.drawArea.drawStringCenter("Select an object to buy or sell", local236 + 204, local238 + 214, 3, 16776960);
			return;
		}
		local400 = this.anIntArray217[this.anInt491];
		if (local400 == -1) {
			return;
		}
		if (this.anIntArray218[this.anInt491] > 0) {
			local410 = this.anInt490 + this.anIntArray219[this.anInt491];
			if (local410 < 10) {
				local410 = 10;
			}
			local418 = local410 * ClientConfig.objCost[local400] / 100;
			this.drawArea.drawString("Buy a new " + ClientConfig.objName[local400] + " for " + local418 + "gp", local236 + 2, local238 + 214, 1, 16776960);
			local32 = 16777215;
			if (super.mouseX > local236 + 298 && super.mouseY >= local238 + 204 && super.mouseX < local236 + 408 && super.mouseY <= local238 + 215) {
				local32 = 16711680;
			}
			this.drawArea.drawStringRight("Click here to buy", local236 + 405, local238 + 214, 3, local32);
		} else {
			this.drawArea.drawStringCenter("This item is not currently available to buy", local236 + 204, local238 + 214, 3, 16776960);
		}
		if (this.method538(local400) > 0) {
			local410 = this.anInt489 + this.anIntArray219[this.anInt491];
			if (local410 < 10) {
				local410 = 10;
			}
			local418 = local410 * ClientConfig.objCost[local400] / 100;
			this.drawArea.drawStringRight("Sell your " + ClientConfig.objName[local400] + " for " + local418 + "gp", local236 + 405, local238 + 239, 1, 16776960);
			local32 = 16777215;
			if (super.mouseX > local236 + 2 && super.mouseY >= local238 + 229 && super.mouseX < local236 + 112 && super.mouseY <= local238 + 240) {
				local32 = 16711680;
			}
			this.drawArea.drawString("Click here to sell", local236 + 2, local238 + 239, 3, local32);
			return;
		}
		this.drawArea.drawStringCenter("You do not have any of this item to sell", local236 + 204, local238 + 239, 3, 16776960);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "bm", descriptor = "()V")
	private void method561() {
		@Pc(3) byte local3 = 22;
		@Pc(5) byte local5 = 36;
		this.drawArea.method368(local3, local5, 468, 16, 192);
		@Pc(15) int local15 = 10000536;
		this.drawArea.method366(local3, local5 + 16, 468, 246, local15, 160);
		this.drawArea.drawStringCenter("Please confirm your trade with @yel@" + Tools.fromBase37(this.aLong7), local3 + 234, local5 + 12, 1, 16777215);
		this.drawArea.drawStringCenter("You are about to give:", local3 + 117, local5 + 30, 1, 16776960);
		for (@Pc(60) int local60 = 0; local60 < this.anInt487; local60++) {
			@Pc(69) String local69 = ClientConfig.objName[this.anIntArray213[local60]];
			if (ClientConfig.objStackable[this.anIntArray213[local60]] == 0) {
				local69 = local69 + " (" + this.anIntArray214[local60] + ")";
			}
			this.drawArea.drawStringCenter(local69, local3 + 117, local5 + 42 + local60 * 12, 1, 16777215);
		}
		if (this.anInt487 == 0) {
			this.drawArea.drawStringCenter("Nothing!", local3 + 117, local5 + 42, 1, 16777215);
		}
		this.drawArea.drawStringCenter("In return you will receive:", local3 + 351, local5 + 30, 1, 16776960);
		for (@Pc(142) int local142 = 0; local142 < this.anInt488; local142++) {
			@Pc(151) String local151 = ClientConfig.objName[this.anIntArray215[local142]];
			if (ClientConfig.objStackable[this.anIntArray215[local142]] == 0) {
				local151 = local151 + " (" + this.anIntArray216[local142] + ")";
			}
			this.drawArea.drawStringCenter(local151, local3 + 351, local5 + 42 + local142 * 12, 1, 16777215);
		}
		if (this.anInt488 == 0) {
			this.drawArea.drawStringCenter("Nothing!", local3 + 351, local5 + 42, 1, 16777215);
		}
		this.drawArea.drawStringCenter("Are you sure you want to do this?", local3 + 234, local5 + 200, 4, 65535);
		this.drawArea.drawStringCenter("There is NO WAY to reverse a trade if you change your mind.", local3 + 234, local5 + 215, 1, 16777215);
		this.drawArea.drawStringCenter("Remember that not all players are trustworthy", local3 + 234, local5 + 230, 1, 16777215);
		if (this.aBoolean91) {
			this.drawArea.drawStringCenter("Waiting for other player...", local3 + 234, local5 + 250, 1, 16776960);
		} else {
			this.drawArea.method383(local3 + 118 - 35, local5 + 238, this.anInt388 + 25);
			this.drawArea.method383(local3 + 352 - 35, local5 + 238, this.anInt388 + 26);
		}
		if (this.anInt374 != 1) {
			return;
		}
		if (super.mouseX < local3 || super.mouseY < local5 || super.mouseX > local3 + 468 || super.mouseY > local5 + 262) {
			this.aBoolean90 = false;
			super.stream.p1spooky(233, 235);
			super.stream.encryptPacket();
		}
		if (super.mouseX >= local3 + 118 - 35 && super.mouseX <= local3 + 118 + 70 && super.mouseY >= local5 + 238 && super.mouseY <= local5 + 238 + 21) {
			this.aBoolean91 = true;
			super.stream.p1spooky(202, 96);
			super.stream.encryptPacket();
		}
		if (super.mouseX >= local3 + 352 - 35 && super.mouseX <= local3 + 353 + 70 && super.mouseY >= local5 + 238 && super.mouseY <= local5 + 238 + 21) {
			this.aBoolean90 = false;
			super.stream.p1spooky(233, 235);
			super.stream.encryptPacket();
		}
		this.anInt374 = 0;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "bn", descriptor = "()V")
	private void method562() {
		if (this.anInt374 != 0 && this.anInt486 == 0) {
			this.anInt486 = 1;
		}
		@Pc(59) int local59;
		@Pc(69) int local69;
		@Pc(74) int local74;
		@Pc(76) int local76;
		@Pc(90) int local90;
		@Pc(249) int local249;
		if (this.anInt486 > 0) {
			@Pc(18) int local18 = super.mouseX - 22;
			@Pc(23) int local23 = super.mouseY - 36;
			if (local18 >= 0 && local23 >= 0 && local18 < 468 && local23 < 262) {
				@Pc(106) int local106;
				if (local18 > 216 && local23 > 30 && local18 < 462 && local23 < 235) {
					local59 = (local18 - 217) / 49 + (local23 - 31) / 34 * 5;
					if (local59 >= 0 && local59 < this.anInt443) {
						@Pc(67) boolean local67 = false;
						local69 = 0;
						local74 = this.anIntArray185[local59];
						for (local76 = 0; local76 < this.anInt483; local76++) {
							if (this.anIntArray209[local76] == local74) {
								if (ClientConfig.objStackable[local74] == 0) {
									for (local90 = 0; local90 < this.anInt486; local90++) {
										if (this.anIntArray210[local76] < this.anIntArray186[local59]) {
											local106 = this.anIntArray210[local76]++;
										}
										local67 = true;
									}
								} else {
									local69++;
								}
							}
						}
						if (this.method538(local74) <= local69) {
							local67 = true;
						}
						if (ClientConfig.objUntradeable[local74] == 1) {
							this.message("This object cannot be traded with other players", 3);
							local67 = true;
						}
						if (!local67 && this.anInt483 < 12) {
							this.anIntArray209[this.anInt483] = local74;
							this.anIntArray210[this.anInt483] = 1;
							this.anInt483++;
							local67 = true;
						}
						if (local67) {
							super.stream.p1spooky(234, 500);
							super.stream.p1(this.anInt483);
							for (local90 = 0; local90 < this.anInt483; local90++) {
								super.stream.p2(this.anIntArray209[local90]);
								super.stream.p4(this.anIntArray210[local90]);
							}
							super.stream.encryptPacket();
							this.aBoolean88 = false;
							this.aBoolean89 = false;
						}
					}
				}
				if (local18 > 8 && local23 > 30 && local18 < 205 && local23 < 133) {
					local59 = (local18 - 9) / 49 + (local23 - 31) / 34 * 4;
					if (local59 >= 0 && local59 < this.anInt483) {
						local249 = this.anIntArray209[local59];
						for (local69 = 0; local69 < this.anInt486; local69++) {
							if (ClientConfig.objStackable[local249] != 0 || this.anIntArray210[local59] <= 1) {
								this.anInt483--;
								this.anInt485 = 0;
								for (local74 = local59; local74 < this.anInt483; local74++) {
									this.anIntArray209[local74] = this.anIntArray209[local74 + 1];
									this.anIntArray210[local74] = this.anIntArray210[local74 + 1];
								}
								break;
							}
							local106 = this.anIntArray210[local59]--;
						}
						super.stream.p1spooky(234, 500);
						super.stream.p1(this.anInt483);
						for (local74 = 0; local74 < this.anInt483; local74++) {
							super.stream.p2(this.anIntArray209[local74]);
							super.stream.p4(this.anIntArray210[local74]);
						}
						super.stream.encryptPacket();
						this.aBoolean88 = false;
						this.aBoolean89 = false;
					}
				}
				if (local18 >= 217 && local23 >= 238 && local18 <= 286 && local23 <= 259) {
					this.aBoolean89 = true;
					super.stream.p1spooky(232, 277);
					super.stream.encryptPacket();
				}
				if (local18 >= 394 && local23 >= 238 && local18 < 463 && local23 < 259) {
					this.aBoolean87 = false;
					super.stream.p1spooky(233, 235);
					super.stream.encryptPacket();
				}
			} else if (this.anInt374 != 0) {
				this.aBoolean87 = false;
				super.stream.p1spooky(233, 235);
				super.stream.encryptPacket();
			}
			this.anInt374 = 0;
			this.anInt486 = 0;
		}
		if (!this.aBoolean87) {
			return;
		}
		@Pc(434) byte local434 = 22;
		@Pc(436) byte local436 = 36;
		this.drawArea.method368(local434, local436, 468, 12, 192);
		local59 = 10000536;
		this.drawArea.method366(local434, local436 + 12, 468, 18, local59, 160);
		this.drawArea.method366(local434, local436 + 30, 8, 248, local59, 160);
		this.drawArea.method366(local434 + 205, local436 + 30, 11, 248, local59, 160);
		this.drawArea.method366(local434 + 462, local436 + 30, 6, 248, local59, 160);
		this.drawArea.method366(local434 + 8, local436 + 133, 197, 22, local59, 160);
		this.drawArea.method366(local434 + 8, local436 + 258, 197, 20, local59, 160);
		this.drawArea.method366(local434 + 216, local436 + 235, 246, 43, local59, 160);
		local249 = 13684944;
		this.drawArea.method366(local434 + 8, local436 + 30, 197, 103, local249, 160);
		this.drawArea.method366(local434 + 8, local436 + 155, 197, 103, local249, 160);
		this.drawArea.method366(local434 + 216, local436 + 30, 246, 205, local249, 160);
		for (local69 = 0; local69 < 4; local69++) {
			this.drawArea.method370(local434 + 8, local436 + 30 + local69 * 34, 197, 0);
		}
		for (local74 = 0; local74 < 4; local74++) {
			this.drawArea.method370(local434 + 8, local436 + 155 + local74 * 34, 197, 0);
		}
		for (local76 = 0; local76 < 7; local76++) {
			this.drawArea.method370(local434 + 216, local436 + 30 + local76 * 34, 246, 0);
		}
		for (local90 = 0; local90 < 6; local90++) {
			if (local90 < 5) {
				this.drawArea.method371(local434 + local90 * 49 + 8, local436 + 30, 103, 0);
			}
			if (local90 < 5) {
				this.drawArea.method371(local434 + local90 * 49 + 8, local436 + 155, 103, 0);
			}
			this.drawArea.method371(local434 + local90 * 49 + 216, local436 + 30, 205, 0);
		}
		this.drawArea.drawString("Trading with: " + this.aString34, local434 + 1, local436 + 10, 1, 16777215);
		this.drawArea.drawString("Your Offer", local434 + 9, local436 + 27, 4, 16777215);
		this.drawArea.drawString("Opponent's Offer", local434 + 9, local436 + 152, 4, 16777215);
		this.drawArea.drawString("Your Inventory", local434 + 216, local436 + 27, 4, 16777215);
		if (!this.aBoolean89) {
			this.drawArea.method383(local434 + 217, local436 + 238, this.anInt388 + 25);
		}
		this.drawArea.method383(local434 + 394, local436 + 238, this.anInt388 + 26);
		if (this.aBoolean88) {
			this.drawArea.drawStringCenter("Other player", local434 + 341, local436 + 246, 1, 16777215);
			this.drawArea.drawStringCenter("has accepted", local434 + 341, local436 + 256, 1, 16777215);
		}
		if (this.aBoolean89) {
			this.drawArea.drawStringCenter("Waiting for", local434 + 217 + 35, local436 + 246, 1, 16777215);
			this.drawArea.drawStringCenter("other player", local434 + 217 + 35, local436 + 256, 1, 16777215);
		}
		@Pc(858) int local858;
		@Pc(868) int local868;
		for (@Pc(846) int local846 = 0; local846 < this.anInt443; local846++) {
			local858 = local434 + local846 % 5 * 49 + 217;
			local868 = local436 + local846 / 5 * 34 + 31;
			this.drawArea.method399(local858, local868, 48, 32, this.anInt390 + ClientConfig.objSprite[this.anIntArray185[local846]], ClientConfig.objSpriteMask[this.anIntArray185[local846]], 0, 0, false);
			if (ClientConfig.objStackable[this.anIntArray185[local846]] == 0) {
				this.drawArea.drawString(String.valueOf(this.anIntArray186[local846]), local858 + 1, local868 + 10, 1, 16776960);
			}
		}
		@Pc(945) int local945;
		for (local858 = 0; local858 < this.anInt483; local858++) {
			local868 = local434 + local858 % 4 * 49 + 9;
			local945 = local436 + local858 / 4 * 34 + 31;
			this.drawArea.method399(local868, local945, 48, 32, this.anInt390 + ClientConfig.objSprite[this.anIntArray209[local858]], ClientConfig.objSpriteMask[this.anIntArray209[local858]], 0, 0, false);
			if (ClientConfig.objStackable[this.anIntArray209[local858]] == 0) {
				this.drawArea.drawString(String.valueOf(this.anIntArray210[local858]), local868 + 1, local945 + 10, 1, 16776960);
			}
			if (super.mouseX > local868 && super.mouseX < local868 + 48 && super.mouseY > local945 && super.mouseY < local945 + 32) {
				this.drawArea.drawString(ClientConfig.objName[this.anIntArray209[local858]] + ": @whi@" + ClientConfig.objDesc[this.anIntArray209[local858]], local434 + 8, local436 + 273, 1, 16776960);
			}
		}
		for (local868 = 0; local868 < this.anInt484; local868++) {
			local945 = local434 + local868 % 4 * 49 + 9;
			@Pc(1073) int local1073 = local436 + local868 / 4 * 34 + 156;
			this.drawArea.method399(local945, local1073, 48, 32, this.anInt390 + ClientConfig.objSprite[this.anIntArray211[local868]], ClientConfig.objSpriteMask[this.anIntArray211[local868]], 0, 0, false);
			if (ClientConfig.objStackable[this.anIntArray211[local868]] == 0) {
				this.drawArea.drawString(String.valueOf(this.anIntArray212[local868]), local945 + 1, local1073 + 10, 1, 16776960);
			}
			if (super.mouseX > local945 && super.mouseX < local945 + 48 && super.mouseY > local1073 && super.mouseY < local1073 + 32) {
				this.drawArea.drawString(ClientConfig.objName[this.anIntArray211[local868]] + ": @whi@" + ClientConfig.objDesc[this.anIntArray211[local868]], local434 + 8, local436 + 273, 1, 16776960);
			}
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "bo", descriptor = "()V")
	private void method563() {
		@Pc(3) byte local3 = 22;
		@Pc(5) byte local5 = 36;
		this.drawArea.method368(local3, local5, 468, 16, 192);
		@Pc(15) int local15 = 10000536;
		this.drawArea.method366(local3, local5 + 16, 468, 246, local15, 160);
		this.drawArea.drawStringCenter("Please confirm your duel with @yel@" + Tools.fromBase37(this.aLong6), local3 + 234, local5 + 12, 1, 16777215);
		this.drawArea.drawStringCenter("Your stake:", local3 + 117, local5 + 30, 1, 16776960);
		for (@Pc(60) int local60 = 0; local60 < this.anInt477; local60++) {
			@Pc(69) String local69 = ClientConfig.objName[this.anIntArray205[local60]];
			if (ClientConfig.objStackable[this.anIntArray205[local60]] == 0) {
				local69 = local69 + " (" + this.anIntArray206[local60] + ")";
			}
			this.drawArea.drawStringCenter(local69, local3 + 117, local5 + 42 + local60 * 12, 1, 16777215);
		}
		if (this.anInt477 == 0) {
			this.drawArea.drawStringCenter("Nothing!", local3 + 117, local5 + 42, 1, 16777215);
		}
		this.drawArea.drawStringCenter("Your opponent's stake:", local3 + 351, local5 + 30, 1, 16776960);
		for (@Pc(142) int local142 = 0; local142 < this.anInt478; local142++) {
			@Pc(151) String local151 = ClientConfig.objName[this.anIntArray207[local142]];
			if (ClientConfig.objStackable[this.anIntArray207[local142]] == 0) {
				local151 = local151 + " (" + this.anIntArray208[local142] + ")";
			}
			this.drawArea.drawStringCenter(local151, local3 + 351, local5 + 42 + local142 * 12, 1, 16777215);
		}
		if (this.anInt478 == 0) {
			this.drawArea.drawStringCenter("Nothing!", local3 + 351, local5 + 42, 1, 16777215);
		}
		if (this.anInt479 == 0) {
			this.drawArea.drawStringCenter("You can retreat from this duel", local3 + 234, local5 + 180, 1, 65280);
		} else {
			this.drawArea.drawStringCenter("No retreat is possible!", local3 + 234, local5 + 180, 1, 16711680);
		}
		if (this.anInt480 == 0) {
			this.drawArea.drawStringCenter("Magic may be used", local3 + 234, local5 + 192, 1, 65280);
		} else {
			this.drawArea.drawStringCenter("Magic cannot be used", local3 + 234, local5 + 192, 1, 16711680);
		}
		if (this.anInt481 == 0) {
			this.drawArea.drawStringCenter("Prayer may be used", local3 + 234, local5 + 204, 1, 65280);
		} else {
			this.drawArea.drawStringCenter("Prayer cannot be used", local3 + 234, local5 + 204, 1, 16711680);
		}
		if (this.anInt482 == 0) {
			this.drawArea.drawStringCenter("Weapons may be used", local3 + 234, local5 + 216, 1, 65280);
		} else {
			this.drawArea.drawStringCenter("Weapons cannot be used", local3 + 234, local5 + 216, 1, 16711680);
		}
		this.drawArea.drawStringCenter("If you are sure click 'Accept' to begin the duel", local3 + 234, local5 + 230, 1, 16777215);
		if (this.aBoolean86) {
			this.drawArea.drawStringCenter("Waiting for other player...", local3 + 234, local5 + 250, 1, 16776960);
		} else {
			this.drawArea.method383(local3 + 118 - 35, local5 + 238, this.anInt388 + 25);
			this.drawArea.method383(local3 + 352 - 35, local5 + 238, this.anInt388 + 26);
		}
		if (this.anInt374 != 1) {
			return;
		}
		if (super.mouseX < local3 || super.mouseY < local5 || super.mouseX > local3 + 468 || super.mouseY > local5 + 262) {
			this.aBoolean85 = false;
			super.stream.p1spooky(233, 235);
			super.stream.encryptPacket();
		}
		if (super.mouseX >= local3 + 118 - 35 && super.mouseX <= local3 + 118 + 70 && super.mouseY >= local5 + 238 && super.mouseY <= local5 + 238 + 21) {
			this.aBoolean86 = true;
			super.stream.p1spooky(198, 412);
			super.stream.encryptPacket();
		}
		if (super.mouseX >= local3 + 352 - 35 && super.mouseX <= local3 + 353 + 70 && super.mouseY >= local5 + 238 && super.mouseY <= local5 + 238 + 21) {
			this.aBoolean85 = false;
			super.stream.p1spooky(203, 266);
			super.stream.encryptPacket();
		}
		this.anInt374 = 0;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "bp", descriptor = "()V")
	private void method564() {
		if (this.anInt374 != 0 && this.anInt486 == 0) {
			this.anInt486 = 1;
		}
		@Pc(59) int local59;
		@Pc(69) int local69;
		@Pc(74) int local74;
		@Pc(76) int local76;
		@Pc(90) int local90;
		@Pc(249) int local249;
		if (this.anInt486 > 0) {
			@Pc(18) int local18 = super.mouseX - 22;
			@Pc(23) int local23 = super.mouseY - 36;
			if (local18 >= 0 && local23 >= 0 && local18 < 468 && local23 < 262) {
				@Pc(106) int local106;
				if (local18 > 216 && local23 > 30 && local18 < 462 && local23 < 235) {
					local59 = (local18 - 217) / 49 + (local23 - 31) / 34 * 5;
					if (local59 >= 0 && local59 < this.anInt443) {
						@Pc(67) boolean local67 = false;
						local69 = 0;
						local74 = this.anIntArray185[local59];
						for (local76 = 0; local76 < this.anInt475; local76++) {
							if (this.anIntArray201[local76] == local74) {
								if (ClientConfig.objStackable[local74] == 0) {
									for (local90 = 0; local90 < this.anInt486; local90++) {
										if (this.anIntArray202[local76] < this.anIntArray186[local59]) {
											local106 = this.anIntArray202[local76]++;
										}
										local67 = true;
									}
								} else {
									local69++;
								}
							}
						}
						if (this.method538(local74) <= local69) {
							local67 = true;
						}
						if (ClientConfig.objUntradeable[local74] == 1) {
							this.message("This object cannot be added to a duel offer", 3);
							local67 = true;
						}
						if (!local67 && this.anInt475 < 8) {
							this.anIntArray201[this.anInt475] = local74;
							this.anIntArray202[this.anInt475] = 1;
							this.anInt475++;
							local67 = true;
						}
						if (local67) {
							super.stream.p1spooky(201, 53);
							super.stream.p1(this.anInt475);
							for (local90 = 0; local90 < this.anInt475; local90++) {
								super.stream.p2(this.anIntArray201[local90]);
								super.stream.p4(this.anIntArray202[local90]);
							}
							super.stream.encryptPacket();
							this.aBoolean79 = false;
							this.aBoolean80 = false;
						}
					}
				}
				if (local18 > 8 && local23 > 30 && local18 < 205 && local23 < 129) {
					local59 = (local18 - 9) / 49 + (local23 - 31) / 34 * 4;
					if (local59 >= 0 && local59 < this.anInt475) {
						local249 = this.anIntArray201[local59];
						for (local69 = 0; local69 < this.anInt486; local69++) {
							if (ClientConfig.objStackable[local249] != 0 || this.anIntArray202[local59] <= 1) {
								this.anInt475--;
								this.anInt485 = 0;
								for (local74 = local59; local74 < this.anInt475; local74++) {
									this.anIntArray201[local74] = this.anIntArray201[local74 + 1];
									this.anIntArray202[local74] = this.anIntArray202[local74 + 1];
								}
								break;
							}
							local106 = this.anIntArray202[local59]--;
						}
						super.stream.p1spooky(201, 53);
						super.stream.p1(this.anInt475);
						for (local74 = 0; local74 < this.anInt475; local74++) {
							super.stream.p2(this.anIntArray201[local74]);
							super.stream.p4(this.anIntArray202[local74]);
						}
						super.stream.encryptPacket();
						this.aBoolean79 = false;
						this.aBoolean80 = false;
					}
				}
				@Pc(362) boolean local362 = false;
				if (local18 >= 93 && local23 >= 221 && local18 <= 104 && local23 <= 232) {
					this.aBoolean81 = !this.aBoolean81;
					local362 = true;
				}
				if (local18 >= 93 && local23 >= 240 && local18 <= 104 && local23 <= 251) {
					this.aBoolean82 = !this.aBoolean82;
					local362 = true;
				}
				if (local18 >= 191 && local23 >= 221 && local18 <= 202 && local23 <= 232) {
					this.aBoolean83 = !this.aBoolean83;
					local362 = true;
				}
				if (local18 >= 191 && local23 >= 240 && local18 <= 202 && local23 <= 251) {
					this.aBoolean84 = !this.aBoolean84;
					local362 = true;
				}
				if (local362) {
					super.stream.p1spooky(200, 285);
					super.stream.p1(this.aBoolean81 ? 1 : 0);
					super.stream.p1(this.aBoolean82 ? 1 : 0);
					super.stream.p1(this.aBoolean83 ? 1 : 0);
					super.stream.p1(this.aBoolean84 ? 1 : 0);
					super.stream.encryptPacket();
					this.aBoolean79 = false;
					this.aBoolean80 = false;
				}
				if (local18 >= 217 && local23 >= 238 && local18 <= 286 && local23 <= 259) {
					this.aBoolean80 = true;
					super.stream.p1spooky(199, 564);
					super.stream.encryptPacket();
				}
				if (local18 >= 394 && local23 >= 238 && local18 < 463 && local23 < 259) {
					this.aBoolean78 = false;
					super.stream.p1spooky(203, 266);
					super.stream.encryptPacket();
				}
			} else if (this.anInt374 != 0) {
				this.aBoolean78 = false;
				super.stream.p1spooky(203, 266);
				super.stream.encryptPacket();
			}
			this.anInt374 = 0;
			this.anInt486 = 0;
		}
		if (!this.aBoolean78) {
			return;
		}
		@Pc(576) byte local576 = 22;
		@Pc(578) byte local578 = 36;
		this.drawArea.method368(local576, local578, 468, 12, 13175581);
		local59 = 10000536;
		this.drawArea.method366(local576, local578 + 12, 468, 18, local59, 160);
		this.drawArea.method366(local576, local578 + 30, 8, 248, local59, 160);
		this.drawArea.method366(local576 + 205, local578 + 30, 11, 248, local59, 160);
		this.drawArea.method366(local576 + 462, local578 + 30, 6, 248, local59, 160);
		this.drawArea.method366(local576 + 8, local578 + 99, 197, 24, local59, 160);
		this.drawArea.method366(local576 + 8, local578 + 192, 197, 23, local59, 160);
		this.drawArea.method366(local576 + 8, local578 + 258, 197, 20, local59, 160);
		this.drawArea.method366(local576 + 216, local578 + 235, 246, 43, local59, 160);
		local249 = 13684944;
		this.drawArea.method366(local576 + 8, local578 + 30, 197, 69, local249, 160);
		this.drawArea.method366(local576 + 8, local578 + 123, 197, 69, local249, 160);
		this.drawArea.method366(local576 + 8, local578 + 215, 197, 43, local249, 160);
		this.drawArea.method366(local576 + 216, local578 + 30, 246, 205, local249, 160);
		for (local69 = 0; local69 < 3; local69++) {
			this.drawArea.method370(local576 + 8, local578 + 30 + local69 * 34, 197, 0);
		}
		for (local74 = 0; local74 < 3; local74++) {
			this.drawArea.method370(local576 + 8, local578 + 123 + local74 * 34, 197, 0);
		}
		for (local76 = 0; local76 < 7; local76++) {
			this.drawArea.method370(local576 + 216, local578 + 30 + local76 * 34, 246, 0);
		}
		for (local90 = 0; local90 < 6; local90++) {
			if (local90 < 5) {
				this.drawArea.method371(local576 + local90 * 49 + 8, local578 + 30, 69, 0);
			}
			if (local90 < 5) {
				this.drawArea.method371(local576 + local90 * 49 + 8, local578 + 123, 69, 0);
			}
			this.drawArea.method371(local576 + local90 * 49 + 216, local578 + 30, 205, 0);
		}
		this.drawArea.method370(local576 + 8, local578 + 215, 197, 0);
		this.drawArea.method370(local576 + 8, local578 + 257, 197, 0);
		this.drawArea.method371(local576 + 8, local578 + 215, 43, 0);
		this.drawArea.method371(local576 + 204, local578 + 215, 43, 0);
		this.drawArea.drawString("Preparing to duel with: " + this.aString33, local576 + 1, local578 + 10, 1, 16777215);
		this.drawArea.drawString("Your Stake", local576 + 9, local578 + 27, 4, 16777215);
		this.drawArea.drawString("Opponent's Stake", local576 + 9, local578 + 120, 4, 16777215);
		this.drawArea.drawString("Duel Options", local576 + 9, local578 + 212, 4, 16777215);
		this.drawArea.drawString("Your Inventory", local576 + 216, local578 + 27, 4, 16777215);
		this.drawArea.drawString("No retreating", local576 + 8 + 1, local578 + 215 + 16, 3, 16776960);
		this.drawArea.drawString("No magic", local576 + 8 + 1, local578 + 215 + 35, 3, 16776960);
		this.drawArea.drawString("No prayer", local576 + 8 + 102, local578 + 215 + 16, 3, 16776960);
		this.drawArea.drawString("No weapons", local576 + 8 + 102, local578 + 215 + 35, 3, 16776960);
		this.drawArea.method369(local576 + 93, local578 + 215 + 6, 11, 11, 16776960);
		if (this.aBoolean81) {
			this.drawArea.method368(local576 + 95, local578 + 215 + 8, 7, 7, 16776960);
		}
		this.drawArea.method369(local576 + 93, local578 + 215 + 25, 11, 11, 16776960);
		if (this.aBoolean82) {
			this.drawArea.method368(local576 + 95, local578 + 215 + 27, 7, 7, 16776960);
		}
		this.drawArea.method369(local576 + 191, local578 + 215 + 6, 11, 11, 16776960);
		if (this.aBoolean83) {
			this.drawArea.method368(local576 + 193, local578 + 215 + 8, 7, 7, 16776960);
		}
		this.drawArea.method369(local576 + 191, local578 + 215 + 25, 11, 11, 16776960);
		if (this.aBoolean84) {
			this.drawArea.method368(local576 + 193, local578 + 215 + 27, 7, 7, 16776960);
		}
		if (!this.aBoolean80) {
			this.drawArea.method383(local576 + 217, local578 + 238, this.anInt388 + 25);
		}
		this.drawArea.method383(local576 + 394, local578 + 238, this.anInt388 + 26);
		if (this.aBoolean79) {
			this.drawArea.drawStringCenter("Other player", local576 + 341, local578 + 246, 1, 16777215);
			this.drawArea.drawStringCenter("has accepted", local576 + 341, local578 + 256, 1, 16777215);
		}
		if (this.aBoolean80) {
			this.drawArea.drawStringCenter("Waiting for", local576 + 217 + 35, local578 + 246, 1, 16777215);
			this.drawArea.drawStringCenter("other player", local576 + 217 + 35, local578 + 256, 1, 16777215);
		}
		@Pc(1270) int local1270;
		@Pc(1280) int local1280;
		for (@Pc(1258) int local1258 = 0; local1258 < this.anInt443; local1258++) {
			local1270 = local576 + local1258 % 5 * 49 + 217;
			local1280 = local578 + local1258 / 5 * 34 + 31;
			this.drawArea.method399(local1270, local1280, 48, 32, this.anInt390 + ClientConfig.objSprite[this.anIntArray185[local1258]], ClientConfig.objSpriteMask[this.anIntArray185[local1258]], 0, 0, false);
			if (ClientConfig.objStackable[this.anIntArray185[local1258]] == 0) {
				this.drawArea.drawString(String.valueOf(this.anIntArray186[local1258]), local1270 + 1, local1280 + 10, 1, 16776960);
			}
		}
		@Pc(1357) int local1357;
		for (local1270 = 0; local1270 < this.anInt475; local1270++) {
			local1280 = local576 + local1270 % 4 * 49 + 9;
			local1357 = local578 + local1270 / 4 * 34 + 31;
			this.drawArea.method399(local1280, local1357, 48, 32, this.anInt390 + ClientConfig.objSprite[this.anIntArray201[local1270]], ClientConfig.objSpriteMask[this.anIntArray201[local1270]], 0, 0, false);
			if (ClientConfig.objStackable[this.anIntArray201[local1270]] == 0) {
				this.drawArea.drawString(String.valueOf(this.anIntArray202[local1270]), local1280 + 1, local1357 + 10, 1, 16776960);
			}
			if (super.mouseX > local1280 && super.mouseX < local1280 + 48 && super.mouseY > local1357 && super.mouseY < local1357 + 32) {
				this.drawArea.drawString(ClientConfig.objName[this.anIntArray201[local1270]] + ": @whi@" + ClientConfig.objDesc[this.anIntArray201[local1270]], local576 + 8, local578 + 273, 1, 16776960);
			}
		}
		for (local1280 = 0; local1280 < this.anInt476; local1280++) {
			local1357 = local576 + local1280 % 4 * 49 + 9;
			@Pc(1485) int local1485 = local578 + local1280 / 4 * 34 + 124;
			this.drawArea.method399(local1357, local1485, 48, 32, this.anInt390 + ClientConfig.objSprite[this.anIntArray203[local1280]], ClientConfig.objSpriteMask[this.anIntArray203[local1280]], 0, 0, false);
			if (ClientConfig.objStackable[this.anIntArray203[local1280]] == 0) {
				this.drawArea.drawString(String.valueOf(this.anIntArray204[local1280]), local1357 + 1, local1485 + 10, 1, 16776960);
			}
			if (super.mouseX > local1357 && super.mouseX < local1357 + 48 && super.mouseY > local1485 && super.mouseY < local1485 + 32) {
				this.drawArea.drawString(ClientConfig.objName[this.anIntArray203[local1280]] + ": @whi@" + ClientConfig.objDesc[this.anIntArray203[local1280]], local576 + 8, local578 + 273, 1, 16776960);
			}
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "bq", descriptor = "()V")
	private void method565() {
		if (this.anInt441 == 0 && super.mouseX >= this.drawArea.anInt318 - 35 && super.mouseY >= 3 && super.mouseX < this.drawArea.anInt318 - 3 && super.mouseY < 35) {
			this.anInt441 = 1;
		}
		if (this.anInt441 == 0 && super.mouseX >= this.drawArea.anInt318 - 35 - 33 && super.mouseY >= 3 && super.mouseX < this.drawArea.anInt318 - 3 - 33 && super.mouseY < 35) {
			this.anInt441 = 2;
			this.anInt449 = (int) (Math.random() * 13.0D) - 6;
			this.anInt450 = (int) (Math.random() * 23.0D) - 11;
		}
		if (this.anInt441 == 0 && super.mouseX >= this.drawArea.anInt318 - 35 - 66 && super.mouseY >= 3 && super.mouseX < this.drawArea.anInt318 - 3 - 66 && super.mouseY < 35) {
			this.anInt441 = 3;
		}
		if (this.anInt441 == 0 && super.mouseX >= this.drawArea.anInt318 - 35 - 99 && super.mouseY >= 3 && super.mouseX < this.drawArea.anInt318 - 3 - 99 && super.mouseY < 35) {
			this.anInt441 = 4;
		}
		if (this.anInt441 == 0 && super.mouseX >= this.drawArea.anInt318 - 35 - 132 && super.mouseY >= 3 && super.mouseX < this.drawArea.anInt318 - 3 - 132 && super.mouseY < 35) {
			this.anInt441 = 5;
		}
		if (this.anInt441 == 0 && super.mouseX >= this.drawArea.anInt318 - 35 - 165 && super.mouseY >= 3 && super.mouseX < this.drawArea.anInt318 - 3 - 165 && super.mouseY < 35) {
			this.anInt441 = 6;
		}
		if (this.anInt441 != 0 && super.mouseX >= this.drawArea.anInt318 - 35 && super.mouseY >= 3 && super.mouseX < this.drawArea.anInt318 - 3 && super.mouseY < 26) {
			this.anInt441 = 1;
		}
		if (this.anInt441 != 0 && this.anInt441 != 2 && super.mouseX >= this.drawArea.anInt318 - 35 - 33 && super.mouseY >= 3 && super.mouseX < this.drawArea.anInt318 - 3 - 33 && super.mouseY < 26) {
			this.anInt441 = 2;
			this.anInt449 = (int) (Math.random() * 13.0D) - 6;
			this.anInt450 = (int) (Math.random() * 23.0D) - 11;
		}
		if (this.anInt441 != 0 && super.mouseX >= this.drawArea.anInt318 - 35 - 66 && super.mouseY >= 3 && super.mouseX < this.drawArea.anInt318 - 3 - 66 && super.mouseY < 26) {
			this.anInt441 = 3;
		}
		if (this.anInt441 != 0 && super.mouseX >= this.drawArea.anInt318 - 35 - 99 && super.mouseY >= 3 && super.mouseX < this.drawArea.anInt318 - 3 - 99 && super.mouseY < 26) {
			this.anInt441 = 4;
		}
		if (this.anInt441 != 0 && super.mouseX >= this.drawArea.anInt318 - 35 - 132 && super.mouseY >= 3 && super.mouseX < this.drawArea.anInt318 - 3 - 132 && super.mouseY < 26) {
			this.anInt441 = 5;
		}
		if (this.anInt441 != 0 && super.mouseX >= this.drawArea.anInt318 - 35 - 165 && super.mouseY >= 3 && super.mouseX < this.drawArea.anInt318 - 3 - 165 && super.mouseY < 26) {
			this.anInt441 = 6;
		}
		if (this.anInt441 == 1 && (super.mouseX < this.drawArea.anInt318 - 248 || super.mouseY > this.anInt442 / 5 * 34 + 36)) {
			this.anInt441 = 0;
		}
		if (this.anInt441 == 3 && (super.mouseX < this.drawArea.anInt318 - 199 || super.mouseY > 316)) {
			this.anInt441 = 0;
		}
		if ((this.anInt441 == 2 || this.anInt441 == 4 || this.anInt441 == 5) && (super.mouseX < this.drawArea.anInt318 - 199 || super.mouseY > 240)) {
			this.anInt441 = 0;
		}
		if (this.anInt441 == 6 && (super.mouseX < this.drawArea.anInt318 - 199 || super.mouseY > 311)) {
			this.anInt441 = 0;
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "a", descriptor = "(Z)V")
	private void method566(@OriginalArg(0) boolean arg0) {
		@Pc(7) int local7 = this.drawArea.anInt318 - 248;
		this.drawArea.method383(local7, 3, this.anInt388 + 1);
		@Pc(28) int local28;
		@Pc(36) int local36;
		for (@Pc(18) int local18 = 0; local18 < this.anInt442; local18++) {
			local28 = local7 + local18 % 5 * 49;
			local36 = local18 / 5 * 34 + 36;
			if (local18 < this.anInt443 && this.anIntArray187[local18] == 1) {
				this.drawArea.method366(local28, local36, 49, 34, 16711680, 128);
			} else {
				this.drawArea.method366(local28, local36, 49, 34, PixMap.method375(181, 181, 181), 128);
			}
			if (local18 < this.anInt443) {
				this.drawArea.method399(local28, local36, 48, 32, this.anInt390 + ClientConfig.objSprite[this.anIntArray185[local18]], ClientConfig.objSpriteMask[this.anIntArray185[local18]], 0, 0, false);
				if (ClientConfig.objStackable[this.anIntArray185[local18]] == 0) {
					this.drawArea.drawString(String.valueOf(this.anIntArray186[local18]), local28 + 1, local36 + 10, 1, 16776960);
				}
			}
		}
		for (local28 = 1; local28 <= 4; local28++) {
			this.drawArea.method371(local7 + local28 * 49, 36, this.anInt442 / 5 * 34, 0);
		}
		for (local36 = 1; local36 <= this.anInt442 / 5 - 1; local36++) {
			this.drawArea.method370(local7, local36 * 34 + 36, 245, 0);
		}
		if (!arg0) {
			return;
		}
		local7 = super.mouseX + 248 - this.drawArea.anInt318;
		@Pc(191) int local191 = super.mouseY - 36;
		if (local7 < 0 || local191 < 0 || local7 >= 248 || local191 >= this.anInt442 / 5 * 34) {
			return;
		}
		@Pc(216) int local216 = local7 / 49 + local191 / 34 * 5;
		if (local216 >= this.anInt443) {
			return;
		}
		@Pc(225) int local225 = this.anIntArray185[local216];
		if (this.anInt453 < 0) {
			if (this.anInt444 >= 0) {
				this.menuOptionType[this.menuSize] = "Use " + this.aString32 + " with";
				this.menuOptionTarget[this.menuSize] = "@lre@" + ClientConfig.objName[local225];
				this.menuAction[this.menuSize] = 610;
				this.menuParamA[this.menuSize] = local216;
				this.menuParamB[this.menuSize] = this.anInt444;
				this.menuSize++;
				return;
			}

			if (this.anIntArray187[local216] == 1) {
				this.menuOptionType[this.menuSize] = "Remove";
				this.menuOptionTarget[this.menuSize] = "@lre@" + ClientConfig.objName[local225];
				this.menuAction[this.menuSize] = 620;
				this.menuParamA[this.menuSize] = local216;
				this.menuSize++;
			} else if (ClientConfig.objWearType[local225] != 0) {
				if ((ClientConfig.objWearType[local225] & 0x18) == 0) {
					this.menuOptionType[this.menuSize] = "Wear";
				} else {
					this.menuOptionType[this.menuSize] = "Wield";
				}
				this.menuOptionTarget[this.menuSize] = "@lre@" + ClientConfig.objName[local225];
				this.menuAction[this.menuSize] = 630;
				this.menuParamA[this.menuSize] = local216;
				this.menuSize++;
			}

			if (!ClientConfig.objOption[local225].equals("")) {
				this.menuOptionType[this.menuSize] = ClientConfig.objOption[local225];
				this.menuOptionTarget[this.menuSize] = "@lre@" + ClientConfig.objName[local225];
				this.menuAction[this.menuSize] = 640;
				this.menuParamA[this.menuSize] = local216;
				this.menuSize++;
			}

			this.menuOptionType[this.menuSize] = "Use";
			this.menuOptionTarget[this.menuSize] = "@lre@" + ClientConfig.objName[local225];
			this.menuAction[this.menuSize] = 650;
			this.menuParamA[this.menuSize] = local216;
			this.menuSize++;

			this.menuOptionType[this.menuSize] = "Drop";
			this.menuOptionTarget[this.menuSize] = "@lre@" + ClientConfig.objName[local225];
			this.menuAction[this.menuSize] = 660;
			this.menuParamA[this.menuSize] = local216;
			this.menuSize++;

			this.menuOptionType[this.menuSize] = "Examine";
			this.menuOptionTarget[this.menuSize] = "@lre@" + ClientConfig.objName[local225];
			this.menuAction[this.menuSize] = 3600;
			this.menuParamA[this.menuSize] = local225;
			this.menuSize++;
		} else if (ClientConfig.spellType[this.anInt453] == 3) {
			this.menuOptionType[this.menuSize] = "Cast " + ClientConfig.spellName[this.anInt453] + " on";
			this.menuOptionTarget[this.menuSize] = "@lre@" + ClientConfig.objName[local225];
			this.menuAction[this.menuSize] = 600;
			this.menuParamA[this.menuSize] = local216;
			this.menuParamB[this.menuSize] = this.anInt453;
			this.menuSize++;
			return;
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "b", descriptor = "(Z)V")
	private void method567(@OriginalArg(0) boolean arg0) {
		@Pc(7) int local7 = this.drawArea.anInt318 - 199;
		@Pc(9) short local9 = 156;
		@Pc(11) short local11 = 152;
		this.drawArea.method383(local7 - 49, 3, this.anInt388 + 2);
		@Pc(23) int local23 = local7 + 40;
		this.drawArea.method368(local23, 36, local9, local11, 0);
		this.drawArea.method361(local23, 36, local23 + local9, local11 + 36);
		@Pc(47) int local47 = this.anInt450 + 192;
		@Pc(55) int local55 = this.anInt422 + this.anInt449 & 0xFF;
		@Pc(67) int local67 = (this.localPlayer.anInt292 - 6040) * 3 * local47 / 2048;
		@Pc(79) int local79 = (this.localPlayer.anInt293 - 6040) * 3 * local47 / 2048;
		@Pc(89) int local89 = World3D.anIntArray62[1024 - local55 * 4 & 0x3FF];
		@Pc(101) int local101 = World3D.anIntArray62[(1024 - local55 * 4 & 0x3FF) + 1024];
		@Pc(111) int local111 = local79 * local89 + local67 * local101 >> 18;
		@Pc(121) int local121 = local79 * local101 - local67 * local89 >> 18;
		this.drawArea.method395(local23 + local9 / 2 - local111, local11 / 2 + 36 + local121, this.anInt388 - 1, local55 + 64 & 0xFF, local47);
		for (@Pc(152) int local152 = 0; local152 < this.anInt438; local152++) {
			local67 = (this.anIntArray177[local152] * this.anInt383 + 64 - this.localPlayer.anInt292) * 3 * local47 / 2048;
			local79 = (this.anIntArray178[local152] * this.anInt383 + 64 - this.localPlayer.anInt293) * 3 * local47 / 2048;
			local111 = local79 * local89 + local67 * local101 >> 18;
			local79 = local79 * local101 - local67 * local89 >> 18;
			this.method541(local23 + local9 / 2 + local111, local11 / 2 + 36 - local79, 65535);
		}
		for (@Pc(240) int local240 = 0; local240 < this.anInt436; local240++) {
			local67 = (this.anIntArray173[local240] * this.anInt383 + 64 - this.localPlayer.anInt292) * 3 * local47 / 2048;
			local79 = (this.anIntArray174[local240] * this.anInt383 + 64 - this.localPlayer.anInt293) * 3 * local47 / 2048;
			local111 = local79 * local89 + local67 * local101 >> 18;
			local79 = local79 * local101 - local67 * local89 >> 18;
			this.method541(local23 + local9 / 2 + local111, local11 / 2 + 36 - local79, 16711680);
		}
		for (@Pc(328) int local328 = 0; local328 < this.anInt433; local328++) {
			@Pc(335) Entity local335 = this.anEntityArray5[local328];
			local67 = (local335.anInt292 - this.localPlayer.anInt292) * 3 * local47 / 2048;
			local79 = (local335.anInt293 - this.localPlayer.anInt293) * 3 * local47 / 2048;
			local111 = local79 * local89 + local67 * local101 >> 18;
			local79 = local79 * local101 - local67 * local89 >> 18;
			this.method541(local23 + local9 / 2 + local111, local11 / 2 + 36 - local79, 16776960);
		}
		for (@Pc(407) int local407 = 0; local407 < this.anInt425; local407++) {
			@Pc(414) Entity local414 = this.anEntityArray2[local407];
			local67 = (local414.anInt292 - this.localPlayer.anInt292) * 3 * local47 / 2048;
			local79 = (local414.anInt293 - this.localPlayer.anInt293) * 3 * local47 / 2048;
			local111 = local79 * local89 + local67 * local101 >> 18;
			local79 = local79 * local101 - local67 * local89 >> 18;
			@Pc(464) int local464 = 16777215;
			for (@Pc(466) int local466 = 0; local466 < super.friendCount; local466++) {
				if (local414.aLong3 == super.friendName37[local466] && super.friendWorld[local466] == 99) {
					local464 = 65280;
					break;
				}
			}
			this.method541(local23 + local9 / 2 + local111, local11 / 2 + 36 - local79, local464);
		}
		this.drawArea.method365(local23 + local9 / 2, local11 / 2 + 36, 2, 16777215, 255);
		this.drawArea.method395(local23 + 19, 55, this.anInt388 + 24, this.anInt422 + 128 & 0xFF, 128);
		this.drawArea.method361(0, 0, this.anInt385, this.anInt386 + 12);
		if (!arg0) {
			return;
		}
		local7 = super.mouseX + 199 - this.drawArea.anInt318;
		@Pc(575) int local575 = super.mouseY - 36;
		if (local7 < 40 || local575 < 0 || local7 >= 196 || local575 >= 152) {
			return;
		}
		local9 = 156;
		local11 = 152;
		local47 = this.anInt450 + 192;
		local55 = this.anInt422 + this.anInt449 & 0xFF;
		local7 = this.drawArea.anInt318 - 199;
		local7 += 40;
		local67 = (super.mouseX - local7 - local9 / 2) * 16384 / (local47 * 3);
		local79 = (super.mouseY - local11 / 2 - 36) * 16384 / (local47 * 3);
		local89 = World3D.anIntArray62[1024 - local55 * 4 & 0x3FF];
		local101 = World3D.anIntArray62[(1024 - local55 * 4 & 0x3FF) + 1024];
		local111 = local79 * local89 + local67 * local101 >> 15;
		local79 = local79 * local101 - local67 * local89 >> 15;
		local67 = local111 + this.localPlayer.anInt292;
		local79 = this.localPlayer.anInt293 - local79;
		if (this.anInt374 == 1) {
			this.method542(this.anInt428, this.anInt429, local67 / 128, local79 / 128, false);
		}
		this.anInt374 = 0;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "c", descriptor = "(Z)V")
	private void method568(@OriginalArg(0) boolean arg0) {
		@Pc(7) int local7 = this.drawArea.anInt318 - 199;
		@Pc(9) byte local9 = 36;
		this.drawArea.method383(local7 - 49, 3, this.anInt388 + 3);
		@Pc(22) short local22 = 196;
		@Pc(24) short local24 = 275;
		@Pc(30) int local30;
		@Pc(31) int local31 = local30 = PixMap.method375(160, 160, 160);
		if (this.anInt457 == 0) {
			local31 = PixMap.method375(220, 220, 220);
		} else {
			local30 = PixMap.method375(220, 220, 220);
		}
		this.drawArea.method366(local7, local9, local22 / 2, 24, local31, 128);
		this.drawArea.method366(local7 + local22 / 2, local9, local22 / 2, 24, local30, 128);
		this.drawArea.method366(local7, local9 + 24, local22, local24 - 24, PixMap.method375(220, 220, 220), 128);
		this.drawArea.method370(local7, local9 + 24, local22, 0);
		this.drawArea.method371(local7 + local22 / 2, local9, 24, 0);
		this.drawArea.drawStringCenter("Stats", local7 + local22 / 4, local9 + 16, 4, 0);
		this.drawArea.drawStringCenter("Quests", local7 + local22 / 4 + local22 / 2, local9 + 16, 4, 0);
		@Pc(158) int local158;
		if (this.anInt457 == 0) {
			@Pc(145) byte local145 = 72;
			@Pc(147) int local147 = -1;
			this.drawArea.drawString("Skills", local7 + 5, local145, 3, 16776960);
			local158 = local145 + 13;
			@Pc(164) int local164;
			for (@Pc(160) int local160 = 0; local160 < 9; local160++) {
				local164 = 16777215;
				if (super.mouseX > local7 + 3 && super.mouseY >= local158 - 11 && super.mouseY < local158 + 2 && super.mouseX < local7 + 90) {
					local164 = 16711680;
					local147 = local160;
				}
				this.drawArea.drawString(this.OVERVIEW_STATS[local160] + ":@yel@" + this.anIntArray189[local160] + "/" + this.anIntArray190[local160], local7 + 5, local158, 1, local164);
				local164 = 16777215;
				if (super.mouseX >= local7 + 90 && super.mouseY >= local158 - 13 - 11 && super.mouseY < local158 + 2 - 13 && super.mouseX < local7 + 196) {
					local164 = 16711680;
					local147 = local160 + 9;
				}
				this.drawArea.drawString(this.OVERVIEW_STATS[local160 + 9] + ":@yel@" + this.anIntArray189[local160 + 9] + "/" + this.anIntArray190[local160 + 9], local7 + local22 / 2 - 5, local158 - 13, 1, local164);
				local158 += 13;
			}
			this.drawArea.drawString("Quest Points:@yel@" + this.anInt446, local7 + local22 / 2 - 5, local158 - 13, 1, 16777215);
			local158 += 12;
			this.drawArea.drawString("Fatigue: @yel@" + this.anInt447 * 100 / 750 + "%", local7 + 5, local158 - 13, 1, 16777215);
			local158 += 8;
			this.drawArea.drawString("Equipment Status", local7 + 5, local158, 3, 16776960);
			local158 += 12;
			for (local164 = 0; local164 < 3; local164++) {
				this.drawArea.drawString(this.BONUSES[local164] + ":@yel@" + this.anIntArray192[local164], local7 + 5, local158, 1, 16777215);
				if (local164 < 2) {
					this.drawArea.drawString(this.BONUSES[local164 + 3] + ":@yel@" + this.anIntArray192[local164 + 3], local7 + local22 / 2 + 25, local158, 1, 16777215);
				}
				local158 += 13;
			}
			local158 += 6;
			this.drawArea.method370(local7, local158 - 15, local22, 0);
			@Pc(479) int local479;
			@Pc(481) int local481;
			if (local147 == -1) {
				this.drawArea.drawString("Overall levels", local7 + 5, local158, 1, 16776960);
				local158 += 12;
				local479 = 0;
				for (local481 = 0; local481 < 18; local481++) {
					local479 += this.anIntArray190[local481];
				}
				this.drawArea.drawString("Skill total: " + local479, local7 + 5, local158, 1, 16777215);
				local158 += 12;
				this.drawArea.drawString("Combat level: " + this.localPlayer.combatLevel, local7 + 5, local158, 1, 16777215);
				local158 += 12;
			} else {
				this.drawArea.drawString(this.STATS_NAMES[local147] + " skill", local7 + 5, local158, 1, 16776960);
				local158 += 12;
				local479 = this.skillBaseLevel[0];
				for (local481 = 0; local481 < 98; local481++) {
					if (this.skillExperience[local147] >= this.skillBaseLevel[local481]) {
						local479 = this.skillBaseLevel[local481 + 1];
					}
				}
				this.drawArea.drawString("Total xp: " + this.skillExperience[local147] / 4, local7 + 5, local158, 1, 16777215);
				local158 += 12;
				this.drawArea.drawString("Next level at: " + local479 / 4, local7 + 5, local158, 1, 16777215);
			}
		}
		if (this.anInt457 == 1) {
			this.aGui3.method100(this.anInt456);
			this.aGui3.method102(this.anInt456, 0, "@whi@Quest-list (green=completed)");
			for (local158 = 0; local158 < this.anInt458; local158++) {
				this.aGui3.method102(this.anInt456, local158 + 1, (this.aBooleanArray13[local158] ? "@gre@" : "@red@") + this.QUEST_LIST[local158]);
			}
			this.aGui3.method75();
		}
		if (!arg0) {
			return;
		}
		local7 = super.mouseX + 199 - this.drawArea.anInt318;
		@Pc(680) int local680 = super.mouseY - 36;
		if (local7 < 0 || local680 < 0 || local7 >= local22 || local680 >= local24) {
			return;
		}
		if (this.anInt457 == 1) {
			this.aGui3.method72(local7 + this.drawArea.anInt318 - 199, local680 + 36, super.mouseClickButton, super.mouseButton);
		}
		if (local680 > 24 || this.anInt374 != 1) {
			return;
		}
		if (local7 < 98) {
			this.anInt457 = 0;
			return;
		}
		if (local7 > 98) {
			this.anInt457 = 1;
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "d", descriptor = "(Z)V")
	private void method569(@OriginalArg(0) boolean arg0) {
		@Pc(7) int local7 = this.drawArea.anInt318 - 199;
		@Pc(9) byte local9 = 36;
		this.drawArea.method383(local7 - 49, 3, this.anInt388 + 4);
		@Pc(22) short local22 = 196;
		@Pc(24) short local24 = 182;
		@Pc(30) int local30;
		@Pc(31) int local31 = local30 = PixMap.method375(160, 160, 160);
		if (this.anInt452 == 0) {
			local31 = PixMap.method375(220, 220, 220);
		} else {
			local30 = PixMap.method375(220, 220, 220);
		}
		this.drawArea.method366(local7, local9, local22 / 2, 24, local31, 128);
		this.drawArea.method366(local7 + local22 / 2, local9, local22 / 2, 24, local30, 128);
		this.drawArea.method366(local7, local9 + 24, local22, 90, PixMap.method375(220, 220, 220), 128);
		this.drawArea.method366(local7, local9 + 24 + 90, local22, local24 - 90 - 24, PixMap.method375(160, 160, 160), 128);
		this.drawArea.method370(local7, local9 + 24, local22, 0);
		this.drawArea.method371(local7 + local22 / 2, local9, 24, 0);
		this.drawArea.method370(local7, local9 + 113, local22, 0);
		this.drawArea.drawStringCenter("Magic", local7 + local22 / 4, local9 + 16, 4, 0);
		this.drawArea.drawStringCenter("Prayers", local7 + local22 / 4 + local22 / 2, local9 + 16, 4, 0);
		@Pc(177) int local177;
		@Pc(179) int local179;
		@Pc(183) String local183;
		@Pc(185) int local185;
		@Pc(262) int local262;
		if (this.anInt452 == 0) {
			this.aGui1.method100(this.anInt451);
			local177 = 0;
			@Pc(193) int local193;
			for (local179 = 0; local179 < ClientConfig.spellCount; local179++) {
				local183 = "@yel@";
				for (local185 = 0; local185 < ClientConfig.spellRunesRequired[local179]; local185++) {
					local193 = ClientConfig.spellRunes[local179][local185];
					if (!this.method539(local193, ClientConfig.spellRunesCount[local179][local185])) {
						local183 = "@whi@";
						break;
					}
				}
				local193 = this.anIntArray189[6];
				if (ClientConfig.spellLevel[local179] > local193) {
					local183 = "@bla@";
				}
				this.aGui1.method102(this.anInt451, local177++, local183 + "Level " + ClientConfig.spellLevel[local179] + ": " + ClientConfig.spellName[local179]);
			}
			this.aGui1.method75();
			local262 = this.aGui1.method110(this.anInt451);
			if (local262 == -1) {
				this.drawArea.drawString("Point at a spell for a description", local7 + 2, local9 + 124, 1, 0);
			} else {
				this.drawArea.drawString("Level " + ClientConfig.spellLevel[local262] + ": " + ClientConfig.spellName[local262], local7 + 2, local9 + 124, 1, 16776960);
				this.drawArea.drawString(ClientConfig.spellDesc[local262], local7 + 2, local9 + 136, 0, 16777215);
				for (local185 = 0; local185 < ClientConfig.spellRunesRequired[local262]; local185++) {
					local193 = ClientConfig.spellRunes[local262][local185];
					this.drawArea.method383(local7 + local185 * 44 + 2, local9 + 150, this.anInt390 + ClientConfig.objSprite[local193]);
					@Pc(338) int local338 = this.method538(local193);
					@Pc(344) int local344 = ClientConfig.spellRunesCount[local262][local185];
					@Pc(346) String local346 = "@red@";
					if (this.method539(local193, local344)) {
						local346 = "@gre@";
					}
					this.drawArea.drawString(local346 + local338 + "/" + local344, local7 + local185 * 44 + 2, local9 + 150, 1, 16777215);
				}
			}
		}
		if (this.anInt452 == 1) {
			this.aGui1.method100(this.anInt451);
			local177 = 0;
			for (local179 = 0; local179 < ClientConfig.prayerCount; local179++) {
				local183 = "@whi@";
				if (ClientConfig.prayerLevel[local179] > this.anIntArray190[5]) {
					local183 = "@bla@";
				}
				if (this.aBooleanArray14[local179]) {
					local183 = "@gre@";
				}
				this.aGui1.method102(this.anInt451, local177++, local183 + "Level " + ClientConfig.prayerLevel[local179] + ": " + ClientConfig.prayerName[local179]);
			}
			this.aGui1.method75();
			local262 = this.aGui1.method110(this.anInt451);
			if (local262 == -1) {
				this.drawArea.drawString("Point at a prayer for a description", local7 + 2, local9 + 124, 1, 0);
			} else {
				this.drawArea.drawStringCenter("Level " + ClientConfig.prayerLevel[local262] + ": " + ClientConfig.prayerName[local262], local7 + local22 / 2, local9 + 130, 1, 16776960);
				this.drawArea.drawStringCenter(ClientConfig.prayerDesc[local262], local7 + local22 / 2, local9 + 145, 0, 16777215);
				this.drawArea.drawStringCenter("Drain rate: " + ClientConfig.prayerDrain[local262], local7 + local22 / 2, local9 + 160, 1, 0);
			}
		}
		if (!arg0) {
			return;
		}
		local7 = super.mouseX + 199 - this.drawArea.anInt318;
		@Pc(572) int local572 = super.mouseY - 36;
		if (local7 < 0 || local572 < 0 || local7 >= 196 || local572 >= 182) {
			return;
		}
		this.aGui1.method72(local7 + this.drawArea.anInt318 - 199, local572 + 36, super.mouseClickButton, super.mouseButton);
		if (local572 <= 24 && this.anInt374 == 1) {
			if (local7 < 98 && this.anInt452 == 1) {
				this.anInt452 = 0;
				this.aGui1.method101(this.anInt451);
			} else if (local7 > 98 && this.anInt452 == 0) {
				this.anInt452 = 1;
				this.aGui1.method101(this.anInt451);
			}
		}
		if (this.anInt374 == 1 && this.anInt452 == 0) {
			local177 = this.aGui1.method110(this.anInt451);
			if (local177 != -1) {
				local179 = this.anIntArray189[6];
				if (ClientConfig.spellLevel[local177] > local179) {
					this.message("Your magic ability is not high enough for this spell", 3);
				} else {
					for (local262 = 0; local262 < ClientConfig.spellRunesRequired[local177]; local262++) {
						local185 = ClientConfig.spellRunes[local177][local262];
						if (!this.method539(local185, ClientConfig.spellRunesCount[local177][local262])) {
							this.message("You don't have all the reagents you need for this spell", 3);
							local262 = -1;
							break;
						}
					}
					if (local262 == ClientConfig.spellRunesRequired[local177]) {
						this.anInt453 = local177;
						this.anInt444 = -1;
					}
				}
			}
		}
		if (this.anInt374 == 1 && this.anInt452 == 1) {
			local177 = this.aGui1.method110(this.anInt451);
			if (local177 != -1) {
				local179 = this.anIntArray190[5];
				if (ClientConfig.prayerLevel[local177] > local179) {
					this.message("Your prayer ability is not high enough for this prayer", 3);
				} else if (this.anIntArray189[5] == 0) {
					this.message("You have run out of prayer points. Return to a church to recharge", 3);
				} else if (this.aBooleanArray14[local177]) {
					super.stream.p1spooky(211, 457);
					super.stream.p1(local177);
					super.stream.encryptPacket();
					this.aBooleanArray14[local177] = false;
					this.method508("prayeroff");
				} else {
					super.stream.p1spooky(212, 126);
					super.stream.p1(local177);
					super.stream.encryptPacket();
					this.aBooleanArray14[local177] = true;
					this.method508("prayeron");
				}
			}
		}
		this.anInt374 = 0;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "e", descriptor = "(Z)V")
	private void method570(@OriginalArg(0) boolean arg0) {
		@Pc(7) int local7 = this.drawArea.anInt318 - 199;
		@Pc(9) byte local9 = 36;
		this.drawArea.method383(local7 - 49, 3, this.anInt388 + 5);
		@Pc(22) short local22 = 196;
		@Pc(24) short local24 = 182;
		@Pc(30) int local30;
		@Pc(31) int local31 = local30 = PixMap.method375(160, 160, 160);
		if (this.anInt455 == 0) {
			local31 = PixMap.method375(220, 220, 220);
		} else {
			local30 = PixMap.method375(220, 220, 220);
		}
		this.drawArea.method366(local7, local9, local22 / 2, 24, local31, 128);
		this.drawArea.method366(local7 + local22 / 2, local9, local22 / 2, 24, local30, 128);
		this.drawArea.method366(local7, local9 + 24, local22, local24 - 24, PixMap.method375(220, 220, 220), 128);
		this.drawArea.method370(local7, local9 + 24, local22, 0);
		this.drawArea.method371(local7 + local22 / 2, local9, 24, 0);
		this.drawArea.method370(local7, local9 + local24 - 16, local22, 0);
		this.drawArea.drawStringCenter("Friends", local7 + local22 / 4, local9 + 16, 4, 0);
		this.drawArea.drawStringCenter("Ignore", local7 + local22 / 4 + local22 / 2, local9 + 16, 4, 0);
		this.aGui2.method100(this.anInt454);
		@Pc(161) int local161;
		if (this.anInt455 == 0) {
			for (local161 = 0; local161 < super.friendCount; local161++) {
				@Pc(171) String local171;
				if (super.friendWorld[local161] == 99) {
					local171 = "@gre@";
				} else if (super.friendWorld[local161] > 0) {
					local171 = "@yel@";
				} else {
					local171 = "@red@";
				}
				this.aGui2.method102(this.anInt454, local161, local171 + Tools.fromBase37(super.friendName37[local161]) + "~439~@whi@Remove         WWWWWWWWWW");
			}
		}
		if (this.anInt455 == 1) {
			for (local161 = 0; local161 < super.anInt365; local161++) {
				this.aGui2.method102(this.anInt454, local161, "@yel@" + Tools.fromBase37(super.ignoreName37[local161]) + "~439~@whi@Remove         WWWWWWWWWW");
			}
		}
		this.aGui2.method75();
		@Pc(425) int local425;
		if (this.anInt455 == 0) {
			local161 = this.aGui2.method110(this.anInt454);
			if (local161 < 0 || super.mouseX >= 489) {
				this.drawArea.drawStringCenter("Click a name to send a message", local7 + local22 / 2, local9 + 35, 1, 16777215);
			} else if (super.mouseX > 429) {
				this.drawArea.drawStringCenter("Click to remove " + Tools.fromBase37(super.friendName37[local161]), local7 + local22 / 2, local9 + 35, 1, 16777215);
			} else if (super.friendWorld[local161] == 99) {
				this.drawArea.drawStringCenter("Click to message " + Tools.fromBase37(super.friendName37[local161]), local7 + local22 / 2, local9 + 35, 1, 16777215);
			} else if (super.friendWorld[local161] > 0) {
				this.drawArea.drawStringCenter(Tools.fromBase37(super.friendName37[local161]) + " is on world " + super.friendWorld[local161], local7 + local22 / 2, local9 + 35, 1, 16777215);
			} else {
				this.drawArea.drawStringCenter(Tools.fromBase37(super.friendName37[local161]) + " is offline", local7 + local22 / 2, local9 + 35, 1, 16777215);
			}
			if (super.mouseX > local7 && super.mouseX < local7 + local22 && super.mouseY > local9 + local24 - 16 && super.mouseY < local9 + local24) {
				local425 = 16776960;
			} else {
				local425 = 16777215;
			}
			this.drawArea.drawStringCenter("Click here to add a friend", local7 + local22 / 2, local9 + local24 - 3, 1, local425);
		}
		if (this.anInt455 == 1) {
			local161 = this.aGui2.method110(this.anInt454);
			if (local161 < 0 || super.mouseX >= 489 || super.mouseX <= 429) {
				this.drawArea.drawStringCenter("Blocking messages from:", local7 + local22 / 2, local9 + 35, 1, 16777215);
			} else if (super.mouseX > 429) {
				this.drawArea.drawStringCenter("Click to remove " + Tools.fromBase37(super.ignoreName37[local161]), local7 + local22 / 2, local9 + 35, 1, 16777215);
			}
			if (super.mouseX > local7 && super.mouseX < local7 + local22 && super.mouseY > local9 + local24 - 16 && super.mouseY < local9 + local24) {
				local425 = 16776960;
			} else {
				local425 = 16777215;
			}
			this.drawArea.drawStringCenter("Click here to add a name", local7 + local22 / 2, local9 + local24 - 3, 1, local425);
		}
		if (!arg0) {
			return;
		}
		local7 = super.mouseX + 199 - this.drawArea.anInt318;
		@Pc(572) int local572 = super.mouseY - 36;
		if (local7 < 0 || local572 < 0 || local7 >= 196 || local572 >= 182) {
			return;
		}
		this.aGui2.method72(local7 + this.drawArea.anInt318 - 199, local572 + 36, super.mouseClickButton, super.mouseButton);
		if (local572 <= 24 && this.anInt374 == 1) {
			if (local7 < 98 && this.anInt455 == 1) {
				this.anInt455 = 0;
				this.aGui2.method101(this.anInt454);
			} else if (local7 > 98 && this.anInt455 == 0) {
				this.anInt455 = 1;
				this.aGui2.method101(this.anInt454);
			}
		}
		if (this.anInt374 == 1 && this.anInt455 == 0) {
			local161 = this.aGui2.method110(this.anInt454);
			if (local161 >= 0 && super.mouseX < 489) {
				if (super.mouseX > 429) {
					this.method482(super.friendName37[local161]);
				} else if (super.friendWorld[local161] != 0) {
					this.anInt501 = 2;
					this.aLong5 = super.friendName37[local161];
					super.aString27 = "";
					super.aString28 = "";
				}
			}
		}
		if (this.anInt374 == 1 && this.anInt455 == 1) {
			local161 = this.aGui2.method110(this.anInt454);
			if (local161 >= 0 && super.mouseX < 489 && super.mouseX > 429) {
				this.method480(super.ignoreName37[local161]);
			}
		}
		if (local572 > 166 && this.anInt374 == 1 && this.anInt455 == 0) {
			this.anInt501 = 1;
			super.aString25 = "";
			super.aString26 = "";
		}
		if (local572 > 166 && this.anInt374 == 1 && this.anInt455 == 1) {
			this.anInt501 = 3;
			super.aString25 = "";
			super.aString26 = "";
		}
		this.anInt374 = 0;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "f", descriptor = "(Z)V")
	private void method571(@OriginalArg(0) boolean arg0) {
		@Pc(7) int local7 = this.drawArea.anInt318 - 199;
		@Pc(9) byte local9 = 36;
		this.drawArea.method383(local7 - 49, 3, this.anInt388 + 6);
		@Pc(22) short local22 = 196;
		this.drawArea.method366(local7, 36, local22, 65, PixMap.method375(181, 181, 181), 160);
		this.drawArea.method366(local7, 101, local22, 65, PixMap.method375(201, 201, 201), 160);
		this.drawArea.method366(local7, 166, local22, 95, PixMap.method375(181, 181, 181), 160);
		this.drawArea.method366(local7, 261, local22, 40, PixMap.method375(201, 201, 201), 160);
		@Pc(74) int local74 = local7 + 3;
		@Pc(78) int local78 = local9 + 15;
		this.drawArea.drawString("Game options - click to toggle", local74, local78, 1, 0);
		@Pc(87) int local87 = local78 + 15;
		if (this.cameraAngleMode) {
			this.drawArea.drawString("Camera angle mode - @gre@Auto", local74, local87, 1, 16777215);
		} else {
			this.drawArea.drawString("Camera angle mode - @red@Manual", local74, local87, 1, 16777215);
		}
		local78 = local87 + 15;
		if (this.mouseButtonsMode) {
			this.drawArea.drawString("Mouse buttons - @red@One", local74, local78, 1, 16777215);
		} else {
			this.drawArea.drawString("Mouse buttons - @gre@Two", local74, local78, 1, 16777215);
		}
		local78 += 15;
		if (this.worldMembers) {
			if (this.soundEffectsMode) {
				this.drawArea.drawString("Sound effects - @red@off", local74, local78, 1, 16777215);
			} else {
				this.drawArea.drawString("Sound effects - @gre@on", local74, local78, 1, 16777215);
			}
		}
		local78 += 15;
		local78 += 5;
		this.drawArea.drawString("Security settings", local74, local78, 1, 0);
		local78 += 15;
		@Pc(168) int local168 = 16777215;
		if (super.mouseX > local74 && super.mouseX < local74 + local22 && super.mouseY > local78 - 12 && super.mouseY < local78 + 4) {
			local168 = 16776960;
		}
		this.drawArea.drawString("Change password", local74, local78, 1, local168);
		local78 += 15;
		local168 = 16777215;
		if (super.mouseX > local74 && super.mouseX < local74 + local22 && super.mouseY > local78 - 12 && super.mouseY < local78 + 4) {
			local168 = 16776960;
		}
		this.drawArea.drawString("Change recovery questions", local74, local78, 1, local168);
		local78 += 15;
		local168 = 16777215;
		if (super.mouseX > local74 && super.mouseX < local74 + local22 && super.mouseY > local78 - 12 && super.mouseY < local78 + 4) {
			local168 = 16776960;
		}
		this.drawArea.drawString("Change contact details", local74, local78, 1, local168);
		local78 += 15;
		local78 += 5;
		this.drawArea.drawString("Privacy settings. Will be applied to", local7 + 3, local78, 1, 0);
		local78 += 15;
		this.drawArea.drawString("all people not on your friends list", local7 + 3, local78, 1, 0);
		local78 += 15;
		if (super.chatMessagesMode == 0) {
			this.drawArea.drawString("Block chat messages: @red@<off>", local7 + 3, local78, 1, 16777215);
		} else {
			this.drawArea.drawString("Block chat messages: @gre@<on>", local7 + 3, local78, 1, 16777215);
		}
		local78 += 15;
		if (super.privateMessagesMode == 0) {
			this.drawArea.drawString("Block private messages: @red@<off>", local7 + 3, local78, 1, 16777215);
		} else {
			this.drawArea.drawString("Block private messages: @gre@<on>", local7 + 3, local78, 1, 16777215);
		}
		local78 += 15;
		if (super.tradeRequestsMode == 0) {
			this.drawArea.drawString("Block trade requests: @red@<off>", local7 + 3, local78, 1, 16777215);
		} else {
			this.drawArea.drawString("Block trade requests: @gre@<on>", local7 + 3, local78, 1, 16777215);
		}
		local78 += 15;
		if (this.worldMembers) {
			if (super.duelRequestsMode == 0) {
				this.drawArea.drawString("Block duel requests: @red@<off>", local7 + 3, local78, 1, 16777215);
			} else {
				this.drawArea.drawString("Block duel requests: @gre@<on>", local7 + 3, local78, 1, 16777215);
			}
		}
		local78 += 15;
		local78 += 5;
		this.drawArea.drawString("Always logout when you finish", local74, local78, 1, 0);
		local78 += 15;
		local168 = 16777215;
		if (super.mouseX > local74 && super.mouseX < local74 + local22 && super.mouseY > local78 - 12 && super.mouseY < local78 + 4) {
			local168 = 16776960;
		}
		this.drawArea.drawString("Click here to logout", local7 + 3, local78, 1, local168);
		if (!arg0) {
			return;
		}
		local7 = super.mouseX + 199 - this.drawArea.anInt318;
		@Pc(464) int local464 = super.mouseY - 36;
		if (local7 < 0 || local464 < 0 || local7 >= 196 || local464 >= 265) {
			return;
		}
		@Pc(480) int local480 = this.drawArea.anInt318 - 199;
		@Pc(482) byte local482 = 36;
		local22 = 196;
		local74 = local480 + 3;
		local78 = local482 + 30;
		if (super.mouseX > local74 && super.mouseX < local74 + local22 && super.mouseY > local78 - 12 && super.mouseY < local78 + 4 && this.anInt374 == 1) {
			this.cameraAngleMode = !this.cameraAngleMode;
			super.stream.p1spooky(213, 892);
			super.stream.p1(0);
			super.stream.p1(this.cameraAngleMode ? 1 : 0);
			super.stream.encryptPacket();
		}
		local78 += 15;
		if (super.mouseX > local74 && super.mouseX < local74 + local22 && super.mouseY > local78 - 12 && super.mouseY < local78 + 4 && this.anInt374 == 1) {
			this.mouseButtonsMode = !this.mouseButtonsMode;
			super.stream.p1spooky(213, 892);
			super.stream.p1(2);
			super.stream.p1(this.mouseButtonsMode ? 1 : 0);
			super.stream.encryptPacket();
		}
		local78 += 15;
		if (this.worldMembers && super.mouseX > local74 && super.mouseX < local74 + local22 && super.mouseY > local78 - 12 && super.mouseY < local78 + 4 && this.anInt374 == 1) {
			this.soundEffectsMode = !this.soundEffectsMode;
			super.stream.p1spooky(213, 892);
			super.stream.p1(3);
			super.stream.p1(this.soundEffectsMode ? 1 : 0);
			super.stream.encryptPacket();
		}
		local78 += 15;
		local78 += 20;
		if (super.mouseX > local74 && super.mouseX < local74 + local22 && super.mouseY > local78 - 12 && super.mouseY < local78 + 4 && this.anInt374 == 1) {
			this.anInt504 = 6;
			super.aString25 = "";
			super.aString26 = "";
		}
		local78 += 15;
		if (super.mouseX > local74 && super.mouseX < local74 + local22 && super.mouseY > local78 - 12 && super.mouseY < local78 + 4 && this.anInt374 == 1) {
			super.stream.p1spooky(197, 882);
			super.stream.encryptPacket();
		}
		local78 += 15;
		if (super.mouseX > local74 && super.mouseX < local74 + local22 && super.mouseY > local78 - 12 && super.mouseY < local78 + 4 && this.anInt374 == 1) {
			super.stream.p1spooky(247, 888);
			super.stream.encryptPacket();
		}
		local78 += 15;
		@Pc(772) boolean local772 = false;
		local78 += 35;
		if (super.mouseX > local74 && super.mouseX < local74 + local22 && super.mouseY > local78 - 12 && super.mouseY < local78 + 4 && this.anInt374 == 1) {
			super.chatMessagesMode = 1 - super.chatMessagesMode;
			local772 = true;
		}
		local78 += 15;
		if (super.mouseX > local74 && super.mouseX < local74 + local22 && super.mouseY > local78 - 12 && super.mouseY < local78 + 4 && this.anInt374 == 1) {
			super.privateMessagesMode = 1 - super.privateMessagesMode;
			local772 = true;
		}
		local78 += 15;
		if (super.mouseX > local74 && super.mouseX < local74 + local22 && super.mouseY > local78 - 12 && super.mouseY < local78 + 4 && this.anInt374 == 1) {
			super.tradeRequestsMode = 1 - super.tradeRequestsMode;
			local772 = true;
		}
		local78 += 15;
		if (this.worldMembers && super.mouseX > local74 && super.mouseX < local74 + local22 && super.mouseY > local78 - 12 && super.mouseY < local78 + 4 && this.anInt374 == 1) {
			super.duelRequestsMode = 1 - super.duelRequestsMode;
			local772 = true;
		}
		local78 += 15;
		if (local772) {
			this.method478(super.chatMessagesMode, super.privateMessagesMode, super.tradeRequestsMode, super.duelRequestsMode);
		}
		local78 += 20;
		if (super.mouseX > local74 && super.mouseX < local74 + local22 && super.mouseY > local78 - 12 && super.mouseY < local78 + 4 && this.anInt374 == 1) {
			this.method507();
		}
		this.anInt374 = 0;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "br", descriptor = "()V")
	private void method572() {
		@Pc(12) int local12 = 2203 - this.anInt429 - this.anInt407 - this.anInt411;
		if (this.anInt428 + this.anInt406 + this.anInt410 >= 2640) {
			local12 = -50;
		}
		@Pc(26) int local26 = -1;
		for (@Pc(28) int local28 = 0; local28 < this.anInt438; local28++) {
			this.aBooleanArray11[local28] = false;
		}
		for (@Pc(42) int local42 = 0; local42 < this.anInt440; local42++) {
			this.aBooleanArray12[local42] = false;
		}
		@Pc(58) int local58 = this.world3D.method207();
		@Pc(62) Object3D[] local62 = this.world3D.method209();
		@Pc(66) int[] local66 = this.world3D.method208();
		for (@Pc(68) int local68 = 0; local68 < local58 && this.menuSize <= 200; local68++) {
			@Pc(78) int local78 = local66[local68];
			@Pc(82) Object3D local82 = local62[local68];
			if (local82.anIntArray29[local78] <= 65535 || local82.anIntArray29[local78] >= 200000 && local82.anIntArray29[local78] <= 300000) {
				@Pc(112) int local112;
				@Pc(119) int local119;
				if (local82 == this.world3D.anObject3D_2) {
					local112 = local82.anIntArray29[local78] % 10000;
					local119 = local82.anIntArray29[local78] / 10000;
					@Pc(124) String local124;
					@Pc(126) int local126;
					if (local119 == 1) {
						local124 = "";
						local126 = 0;
						if (this.localPlayer.combatLevel > 0 && this.anEntityArray2[local112].combatLevel > 0) {
							local126 = this.localPlayer.combatLevel - this.anEntityArray2[local112].combatLevel;
						}
						if (local126 < 0) {
							local124 = "@or1@";
						}
						if (local126 < -3) {
							local124 = "@or2@";
						}
						if (local126 < -6) {
							local124 = "@or3@";
						}
						if (local126 < -9) {
							local124 = "@red@";
						}
						if (local126 > 0) {
							local124 = "@gr1@";
						}
						if (local126 > 3) {
							local124 = "@gr2@";
						}
						if (local126 > 6) {
							local124 = "@gr3@";
						}
						if (local126 > 9) {
							local124 = "@gre@";
						}
						local124 = " " + local124 + "(level-" + this.anEntityArray2[local112].combatLevel + ")";
						if (this.anInt453 >= 0) {
							if (ClientConfig.spellType[this.anInt453] == 1 || ClientConfig.spellType[this.anInt453] == 2) {
								this.menuOptionType[this.menuSize] = "Cast " + ClientConfig.spellName[this.anInt453] + " on";
								this.menuOptionTarget[this.menuSize] = "@whi@" + this.anEntityArray2[local112].aString20 + local124;
								this.menuAction[this.menuSize] = 800;
								this.menuParamEntityA[this.menuSize] = this.anEntityArray2[local112].anInt292;
								this.menuParamEntityB[this.menuSize] = this.anEntityArray2[local112].anInt293;
								this.menuParamA[this.menuSize] = this.anEntityArray2[local112].anInt290;
								this.menuParamB[this.menuSize] = this.anInt453;
								this.menuSize++;
							}
						} else if (this.anInt444 >= 0) {
							this.menuOptionType[this.menuSize] = "Use " + this.aString32 + " with";
							this.menuOptionTarget[this.menuSize] = "@whi@" + this.anEntityArray2[local112].aString20 + local124;
							this.menuAction[this.menuSize] = 810;
							this.menuParamEntityA[this.menuSize] = this.anEntityArray2[local112].anInt292;
							this.menuParamEntityB[this.menuSize] = this.anEntityArray2[local112].anInt293;
							this.menuParamA[this.menuSize] = this.anEntityArray2[local112].anInt290;
							this.menuParamB[this.menuSize] = this.anInt444;
							this.menuSize++;
						} else {
							if (local12 > 0 && (this.anEntityArray2[local112].anInt293 - 64) / this.anInt383 + this.anInt407 + this.anInt411 < 2203) {
								this.menuOptionType[this.menuSize] = "Attack";
								this.menuOptionTarget[this.menuSize] = "@whi@" + this.anEntityArray2[local112].aString20 + local124;
								if (local126 >= 0 && local126 < 5) {
									this.menuAction[this.menuSize] = 805;
								} else {
									this.menuAction[this.menuSize] = 2805;
								}
								this.menuParamEntityA[this.menuSize] = this.anEntityArray2[local112].anInt292;
								this.menuParamEntityB[this.menuSize] = this.anEntityArray2[local112].anInt293;
								this.menuParamA[this.menuSize] = this.anEntityArray2[local112].anInt290;
								this.menuSize++;
							} else if (this.worldMembers) {
								this.menuOptionType[this.menuSize] = "Duel with";
								this.menuOptionTarget[this.menuSize] = "@whi@" + this.anEntityArray2[local112].aString20 + local124;
								this.menuParamEntityA[this.menuSize] = this.anEntityArray2[local112].anInt292;
								this.menuParamEntityB[this.menuSize] = this.anEntityArray2[local112].anInt293;
								this.menuAction[this.menuSize] = 2806;
								this.menuParamA[this.menuSize] = this.anEntityArray2[local112].anInt290;
								this.menuSize++;
							}
							this.menuOptionType[this.menuSize] = "Trade with";
							this.menuOptionTarget[this.menuSize] = "@whi@" + this.anEntityArray2[local112].aString20 + local124;
							this.menuAction[this.menuSize] = 2810;
							this.menuParamA[this.menuSize] = this.anEntityArray2[local112].anInt290;
							this.menuSize++;
							this.menuOptionType[this.menuSize] = "Follow";
							this.menuOptionTarget[this.menuSize] = "@whi@" + this.anEntityArray2[local112].aString20 + local124;
							this.menuAction[this.menuSize] = 2820;
							this.menuParamA[this.menuSize] = this.anEntityArray2[local112].anInt290;
							this.menuSize++;
						}
					} else if (local119 == 2) {
						if (this.anInt453 >= 0) {
							if (ClientConfig.spellType[this.anInt453] == 3) {
								this.menuOptionType[this.menuSize] = "Cast " + ClientConfig.spellName[this.anInt453] + " on";
								this.menuOptionTarget[this.menuSize] = "@lre@" + ClientConfig.objName[this.anIntArray175[local112]];
								this.menuAction[this.menuSize] = 200;
								this.menuParamEntityA[this.menuSize] = this.anIntArray173[local112];
								this.menuParamEntityB[this.menuSize] = this.anIntArray174[local112];
								this.menuParamA[this.menuSize] = this.anIntArray175[local112];
								this.menuParamB[this.menuSize] = this.anInt453;
								this.menuSize++;
							}
						} else if (this.anInt444 >= 0) {
							this.menuOptionType[this.menuSize] = "Use " + this.aString32 + " with";
							this.menuOptionTarget[this.menuSize] = "@lre@" + ClientConfig.objName[this.anIntArray175[local112]];
							this.menuAction[this.menuSize] = 210;
							this.menuParamEntityA[this.menuSize] = this.anIntArray173[local112];
							this.menuParamEntityB[this.menuSize] = this.anIntArray174[local112];
							this.menuParamA[this.menuSize] = this.anIntArray175[local112];
							this.menuParamB[this.menuSize] = this.anInt444;
							this.menuSize++;
						} else {
							this.menuOptionType[this.menuSize] = "Take";
							this.menuOptionTarget[this.menuSize] = "@lre@" + ClientConfig.objName[this.anIntArray175[local112]];
							this.menuAction[this.menuSize] = 220;
							this.menuParamEntityA[this.menuSize] = this.anIntArray173[local112];
							this.menuParamEntityB[this.menuSize] = this.anIntArray174[local112];
							this.menuParamA[this.menuSize] = this.anIntArray175[local112];
							this.menuSize++;
							this.menuOptionType[this.menuSize] = "Examine";
							this.menuOptionTarget[this.menuSize] = "@lre@" + ClientConfig.objName[this.anIntArray175[local112]];
							this.menuAction[this.menuSize] = 3200;
							this.menuParamA[this.menuSize] = this.anIntArray175[local112];
							this.menuSize++;
						}
					} else if (local119 == 3) {
						local124 = "";
						local126 = -1;
						@Pc(952) int local952 = this.anEntityArray5[local112].anInt294;
						if (ClientConfig.npcAttackable[local952] > 0) {
							@Pc(974) int local974 = (ClientConfig.npcAttack[local952] + ClientConfig.npcDefense[local952] + ClientConfig.npcStrength[local952] + ClientConfig.npcHits[local952]) / 4;
							@Pc(998) int local998 = (this.anIntArray190[0] + this.anIntArray190[1] + this.anIntArray190[2] + this.anIntArray190[3] + 27) / 4;
							local126 = local998 - local974;
							local124 = "@yel@";
							if (local126 < 0) {
								local124 = "@or1@";
							}
							if (local126 < -3) {
								local124 = "@or2@";
							}
							if (local126 < -6) {
								local124 = "@or3@";
							}
							if (local126 < -9) {
								local124 = "@red@";
							}
							if (local126 > 0) {
								local124 = "@gr1@";
							}
							if (local126 > 3) {
								local124 = "@gr2@";
							}
							if (local126 > 6) {
								local124 = "@gr3@";
							}
							if (local126 > 9) {
								local124 = "@gre@";
							}
							local124 = " " + local124 + "(level-" + local974 + ")";
						}
						if (this.anInt453 >= 0) {
							if (ClientConfig.spellType[this.anInt453] == 2) {
								this.menuOptionType[this.menuSize] = "Cast " + ClientConfig.spellName[this.anInt453] + " on";
								this.menuOptionTarget[this.menuSize] = "@yel@" + ClientConfig.npcName[this.anEntityArray5[local112].anInt294];
								this.menuAction[this.menuSize] = 700;
								this.menuParamEntityA[this.menuSize] = this.anEntityArray5[local112].anInt292;
								this.menuParamEntityB[this.menuSize] = this.anEntityArray5[local112].anInt293;
								this.menuParamA[this.menuSize] = this.anEntityArray5[local112].anInt290;
								this.menuParamB[this.menuSize] = this.anInt453;
								this.menuSize++;
							}
						} else if (this.anInt444 >= 0) {
							this.menuOptionType[this.menuSize] = "Use " + this.aString32 + " with";
							this.menuOptionTarget[this.menuSize] = "@yel@" + ClientConfig.npcName[this.anEntityArray5[local112].anInt294];
							this.menuAction[this.menuSize] = 710;
							this.menuParamEntityA[this.menuSize] = this.anEntityArray5[local112].anInt292;
							this.menuParamEntityB[this.menuSize] = this.anEntityArray5[local112].anInt293;
							this.menuParamA[this.menuSize] = this.anEntityArray5[local112].anInt290;
							this.menuParamB[this.menuSize] = this.anInt444;
							this.menuSize++;
						} else {
							if (ClientConfig.npcAttackable[local952] > 0) {
								this.menuOptionType[this.menuSize] = "Attack";
								this.menuOptionTarget[this.menuSize] = "@yel@" + ClientConfig.npcName[this.anEntityArray5[local112].anInt294] + local124;
								if (local126 >= 0) {
									this.menuAction[this.menuSize] = 715;
								} else {
									this.menuAction[this.menuSize] = 2715;
								}
								this.menuParamEntityA[this.menuSize] = this.anEntityArray5[local112].anInt292;
								this.menuParamEntityB[this.menuSize] = this.anEntityArray5[local112].anInt293;
								this.menuParamA[this.menuSize] = this.anEntityArray5[local112].anInt290;
								this.menuSize++;
							}
							this.menuOptionType[this.menuSize] = "Talk-to";
							this.menuOptionTarget[this.menuSize] = "@yel@" + ClientConfig.npcName[this.anEntityArray5[local112].anInt294];
							this.menuAction[this.menuSize] = 720;
							this.menuParamEntityA[this.menuSize] = this.anEntityArray5[local112].anInt292;
							this.menuParamEntityB[this.menuSize] = this.anEntityArray5[local112].anInt293;
							this.menuParamA[this.menuSize] = this.anEntityArray5[local112].anInt290;
							this.menuSize++;
							if (!ClientConfig.npcOption[local952].equals("")) {
								this.menuOptionType[this.menuSize] = ClientConfig.npcOption[local952];
								this.menuOptionTarget[this.menuSize] = "@yel@" + ClientConfig.npcName[this.anEntityArray5[local112].anInt294];
								this.menuAction[this.menuSize] = 725;
								this.menuParamEntityA[this.menuSize] = this.anEntityArray5[local112].anInt292;
								this.menuParamEntityB[this.menuSize] = this.anEntityArray5[local112].anInt293;
								this.menuParamA[this.menuSize] = this.anEntityArray5[local112].anInt290;
								this.menuSize++;
							}
							this.menuOptionType[this.menuSize] = "Examine";
							this.menuOptionTarget[this.menuSize] = "@yel@" + ClientConfig.npcName[this.anEntityArray5[local112].anInt294];
							this.menuAction[this.menuSize] = 3700;
							this.menuParamA[this.menuSize] = this.anEntityArray5[local112].anInt294;
							this.menuSize++;
						}
					}
				} else if (local82 != null && local82.anInt88 >= 10000) {
					local112 = local82.anInt88 - 10000;
					local119 = this.anIntArray184[local112];
					if (!this.aBooleanArray12[local112]) {
						if (this.anInt453 >= 0) {
							if (ClientConfig.spellType[this.anInt453] == 4) {
								this.menuOptionType[this.menuSize] = "Cast " + ClientConfig.spellName[this.anInt453] + " on";
								this.menuOptionTarget[this.menuSize] = "@cya@" + ClientConfig.boundName[local119];
								this.menuAction[this.menuSize] = 300;
								this.menuParamEntityA[this.menuSize] = this.anIntArray181[local112];
								this.menuParamEntityB[this.menuSize] = this.anIntArray182[local112];
								this.menuParamA[this.menuSize] = this.anIntArray183[local112];
								this.menuParamB[this.menuSize] = this.anInt453;
								this.menuSize++;
							}
						} else if (this.anInt444 >= 0) {
							this.menuOptionType[this.menuSize] = "Use " + this.aString32 + " with";
							this.menuOptionTarget[this.menuSize] = "@cya@" + ClientConfig.boundName[local119];
							this.menuAction[this.menuSize] = 310;
							this.menuParamEntityA[this.menuSize] = this.anIntArray181[local112];
							this.menuParamEntityB[this.menuSize] = this.anIntArray182[local112];
							this.menuParamA[this.menuSize] = this.anIntArray183[local112];
							this.menuParamB[this.menuSize] = this.anInt444;
							this.menuSize++;
						} else {
							if (!ClientConfig.boundOption1[local119].equalsIgnoreCase("WalkTo")) {
								this.menuOptionType[this.menuSize] = ClientConfig.boundOption1[local119];
								this.menuOptionTarget[this.menuSize] = "@cya@" + ClientConfig.boundName[local119];
								this.menuAction[this.menuSize] = 320;
								this.menuParamEntityA[this.menuSize] = this.anIntArray181[local112];
								this.menuParamEntityB[this.menuSize] = this.anIntArray182[local112];
								this.menuParamA[this.menuSize] = this.anIntArray183[local112];
								this.menuSize++;
							}
							if (!ClientConfig.boundOption2[local119].equalsIgnoreCase("Examine")) {
								this.menuOptionType[this.menuSize] = ClientConfig.boundOption2[local119];
								this.menuOptionTarget[this.menuSize] = "@cya@" + ClientConfig.boundName[local119];
								this.menuAction[this.menuSize] = 2300;
								this.menuParamEntityA[this.menuSize] = this.anIntArray181[local112];
								this.menuParamEntityB[this.menuSize] = this.anIntArray182[local112];
								this.menuParamA[this.menuSize] = this.anIntArray183[local112];
								this.menuSize++;
							}
							this.menuOptionType[this.menuSize] = "Examine";
							this.menuOptionTarget[this.menuSize] = "@cya@" + ClientConfig.boundName[local119];
							this.menuAction[this.menuSize] = 3300;
							this.menuParamA[this.menuSize] = local119;
							this.menuSize++;
						}
						this.aBooleanArray12[local112] = true;
					}
				} else if (local82 == null || local82.anInt88 < 0) {
					if (local78 >= 0) {
						local78 = local82.anIntArray29[local78] - 200000;
					}
					if (local78 >= 0) {
						local26 = local78;
					}
				} else {
					local112 = local82.anInt88;
					local119 = this.anIntArray179[local112];
					if (!this.aBooleanArray11[local112]) {
						if (this.anInt453 >= 0) {
							if (ClientConfig.spellType[this.anInt453] == 5) {
								this.menuOptionType[this.menuSize] = "Cast " + ClientConfig.spellName[this.anInt453] + " on";
								this.menuOptionTarget[this.menuSize] = "@cya@" + ClientConfig.locName[local119];
								this.menuAction[this.menuSize] = 400;
								this.menuParamEntityA[this.menuSize] = this.anIntArray177[local112];
								this.menuParamEntityB[this.menuSize] = this.anIntArray178[local112];
								this.menuParamA[this.menuSize] = this.anIntArray180[local112];
								this.menuParamB[this.menuSize] = this.anIntArray179[local112];
								this.menuParamC[this.menuSize] = this.anInt453;
								this.menuSize++;
							}
						} else if (this.anInt444 >= 0) {
							this.menuOptionType[this.menuSize] = "Use " + this.aString32 + " with";
							this.menuOptionTarget[this.menuSize] = "@cya@" + ClientConfig.locName[local119];
							this.menuAction[this.menuSize] = 410;
							this.menuParamEntityA[this.menuSize] = this.anIntArray177[local112];
							this.menuParamEntityB[this.menuSize] = this.anIntArray178[local112];
							this.menuParamA[this.menuSize] = this.anIntArray180[local112];
							this.menuParamB[this.menuSize] = this.anIntArray179[local112];
							this.menuParamC[this.menuSize] = this.anInt444;
							this.menuSize++;
						} else {
							if (!ClientConfig.locOption1[local119].equalsIgnoreCase("WalkTo")) {
								this.menuOptionType[this.menuSize] = ClientConfig.locOption1[local119];
								this.menuOptionTarget[this.menuSize] = "@cya@" + ClientConfig.locName[local119];
								this.menuAction[this.menuSize] = 420;
								this.menuParamEntityA[this.menuSize] = this.anIntArray177[local112];
								this.menuParamEntityB[this.menuSize] = this.anIntArray178[local112];
								this.menuParamA[this.menuSize] = this.anIntArray180[local112];
								this.menuParamB[this.menuSize] = this.anIntArray179[local112];
								this.menuSize++;
							}
							if (!ClientConfig.locOption2[local119].equalsIgnoreCase("Examine")) {
								this.menuOptionType[this.menuSize] = ClientConfig.locOption2[local119];
								this.menuOptionTarget[this.menuSize] = "@cya@" + ClientConfig.locName[local119];
								this.menuAction[this.menuSize] = 2400;
								this.menuParamEntityA[this.menuSize] = this.anIntArray177[local112];
								this.menuParamEntityB[this.menuSize] = this.anIntArray178[local112];
								this.menuParamA[this.menuSize] = this.anIntArray180[local112];
								this.menuParamB[this.menuSize] = this.anIntArray179[local112];
								this.menuSize++;
							}
							this.menuOptionType[this.menuSize] = "Examine";
							this.menuOptionTarget[this.menuSize] = "@cya@" + ClientConfig.locName[local119];
							this.menuAction[this.menuSize] = 3400;
							this.menuParamA[this.menuSize] = local119;
							this.menuSize++;
						}
						this.aBooleanArray11[local112] = true;
					}
				}
			}
		}
		if (this.anInt453 >= 0 && ClientConfig.spellType[this.anInt453] <= 1) {
			this.menuOptionType[this.menuSize] = "Cast " + ClientConfig.spellName[this.anInt453] + " on self";
			this.menuOptionTarget[this.menuSize] = "";
			this.menuAction[this.menuSize] = 1000;
			this.menuParamA[this.menuSize] = this.anInt453;
			this.menuSize++;
		}
		if (local26 == -1) {
			return;
		}
		if (this.anInt453 >= 0) {
			if (ClientConfig.spellType[this.anInt453] == 6) {
				this.menuOptionType[this.menuSize] = "Cast " + ClientConfig.spellName[this.anInt453] + " on ground";
				this.menuOptionTarget[this.menuSize] = "";
				this.menuAction[this.menuSize] = 900;
				this.menuParamEntityA[this.menuSize] = this.world.anIntArray164[local26];
				this.menuParamEntityB[this.menuSize] = this.world.anIntArray165[local26];
				this.menuParamA[this.menuSize] = this.anInt453;
				this.menuSize++;
				return;
			}
		} else if (this.anInt444 < 0) {
			this.menuOptionType[this.menuSize] = "Walk here";
			this.menuOptionTarget[this.menuSize] = "";
			this.menuAction[this.menuSize] = 920;
			this.menuParamEntityA[this.menuSize] = this.world.anIntArray164[local26];
			this.menuParamEntityB[this.menuSize] = this.world.anIntArray165[local26];
			this.menuSize++;
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "bs", descriptor = "()V")
	private void method573() {
		@Pc(6) int local6;
		@Pc(13) int local13;
		@Pc(22) int local22;
		if (this.anInt374 != 0) {
			for (local6 = 0; local6 < this.menuSize; local6++) {
				local13 = this.anInt459 + 2;
				local22 = this.anInt460 + local6 * 15 + 27;
				if (super.mouseX > local13 - 2 && super.mouseY > local22 - 12 && super.mouseY < local22 + 4 && super.mouseX < local13 + this.anInt461 - 3) {
					this.method575(this.menuParamD[local6]);
					break;
				}
			}
			this.anInt374 = 0;
			this.aBoolean77 = false;
		} else if (super.mouseX >= this.anInt459 - 10 && super.mouseY >= this.anInt460 - 10 && super.mouseX <= this.anInt459 + this.anInt461 + 10 && super.mouseY <= this.anInt460 + this.anInt462 + 10) {
			this.drawArea.method366(this.anInt459, this.anInt460, this.anInt461, this.anInt462, 13684944, 160);
			this.drawArea.drawString("Choose option", this.anInt459 + 2, this.anInt460 + 12, 1, 65535);
			for (local6 = 0; local6 < this.menuSize; local6++) {
				local13 = this.anInt459 + 2;
				local22 = this.anInt460 + local6 * 15 + 27;
				@Pc(154) int local154 = 16777215;
				if (super.mouseX > local13 - 2 && super.mouseY > local22 - 12 && super.mouseY < local22 + 4 && super.mouseX < local13 + this.anInt461 - 3) {
					local154 = 16776960;
				}
				this.drawArea.drawString(this.menuOptionType[this.menuParamD[local6]] + " " + this.menuOptionTarget[this.menuParamD[local6]], local13, local22, 1, local154);
			}
		} else {
			this.aBoolean77 = false;
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "bt", descriptor = "()V")
	private void method574() {
		if (this.anInt453 >= 0 || this.anInt444 >= 0) {
			this.menuOptionType[this.menuSize] = "Cancel";
			this.menuOptionTarget[this.menuSize] = "";
			this.menuAction[this.menuSize] = 4000;
			this.menuSize++;
		}
		@Pc(33) int local33 = 0;
		while (local33 < this.menuSize) {
			this.menuParamD[local33] = local33++;
		}
		@Pc(47) boolean local47 = false;
		@Pc(53) int local53;
		@Pc(60) int local60;
		while (!local47) {
			local47 = true;
			for (local53 = 0; local53 < this.menuSize - 1; local53++) {
				local60 = this.menuParamD[local53];
				@Pc(67) int local67 = this.menuParamD[local53 + 1];
				if (this.menuAction[local60] > this.menuAction[local67]) {
					this.menuParamD[local53] = local67;
					this.menuParamD[local53 + 1] = local60;
					local47 = false;
				}
			}
		}
		if (this.menuSize > 20) {
			this.menuSize = 20;
		}
		if (this.menuSize <= 0) {
			return;
		}
		local53 = -1;
		for (local60 = 0; local60 < this.menuSize; local60++) {
			if (this.menuOptionTarget[this.menuParamD[local60]] != null && this.menuOptionTarget[this.menuParamD[local60]].length() > 0) {
				local53 = local60;
				break;
			}
		}
		@Pc(143) String local143 = null;
		if ((this.anInt444 >= 0 || this.anInt453 >= 0) && this.menuSize == 1) {
			local143 = "Choose a target";
		} else if ((this.anInt444 >= 0 || this.anInt453 >= 0) && this.menuSize > 1) {
			local143 = "@whi@" + this.menuOptionType[this.menuParamD[0]] + " " + this.menuOptionTarget[this.menuParamD[0]];
		} else if (local53 != -1) {
			local143 = this.menuOptionTarget[this.menuParamD[local53]] + ": @whi@" + this.menuOptionType[this.menuParamD[0]];
		}
		if (this.menuSize == 2 && local143 != null) {
			local143 = local143 + "@whi@ / 1 more option";
		}
		if (this.menuSize > 2 && local143 != null) {
			local143 = local143 + "@whi@ / " + (this.menuSize - 1) + " more options";
		}
		if (local143 != null) {
			this.drawArea.drawString(local143, 6, 14, 1, 16776960);
		}
		if (!this.mouseButtonsMode && this.anInt374 == 1 || this.mouseButtonsMode && this.anInt374 == 1 && this.menuSize == 1) {
			this.method575(this.menuParamD[0]);
			this.anInt374 = 0;
			return;
		}
		if ((this.mouseButtonsMode || this.anInt374 != 2) && (!this.mouseButtonsMode || this.anInt374 != 1)) {
			return;
		}
		this.anInt462 = (this.menuSize + 1) * 15;
		this.anInt461 = this.drawArea.stringWidth("Choose option", 1) + 5;
		for (@Pc(325) int local325 = 0; local325 < this.menuSize; local325++) {
			@Pc(350) int local350 = this.drawArea.stringWidth(this.menuOptionType[local325] + " " + this.menuOptionTarget[local325], 1) + 5;
			if (local350 > this.anInt461) {
				this.anInt461 = local350;
			}
		}
		this.anInt459 = super.mouseX - this.anInt461 / 2;
		this.anInt460 = super.mouseY - 7;
		this.aBoolean77 = true;
		if (this.anInt459 < 0) {
			this.anInt459 = 0;
		}
		if (this.anInt460 < 0) {
			this.anInt460 = 0;
		}
		if (this.anInt459 + this.anInt461 > 510) {
			this.anInt459 = 510 - this.anInt461;
		}
		if (this.anInt460 + this.anInt462 > 315) {
			this.anInt460 = 315 - this.anInt462;
		}
		this.anInt374 = 0;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "f", descriptor = "(I)V")
	private void method575(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.menuParamEntityA[arg0];
		@Pc(9) int local9 = this.menuParamEntityB[arg0];
		@Pc(14) int local14 = this.menuParamA[arg0];
		@Pc(19) int local19 = this.menuParamB[arg0];
		@Pc(24) int local24 = this.menuParamC[arg0];
		@Pc(29) int local29 = this.menuAction[arg0];
		if (local29 == 200) {
			this.method543(this.anInt428, this.anInt429, local4, local9, true);
			super.stream.p1spooky(224, 821);
			super.stream.p2(local4 + this.anInt410);
			super.stream.p2(local9 + this.anInt411);
			super.stream.p2(local14);
			super.stream.p2(local19);
			super.stream.encryptPacket();
			this.anInt453 = -1;
		}
		if (local29 == 210) {
			this.method543(this.anInt428, this.anInt429, local4, local9, true);
			super.stream.p1spooky(250, 346);
			super.stream.p2(local4 + this.anInt410);
			super.stream.p2(local9 + this.anInt411);
			super.stream.p2(local14);
			super.stream.p2(local19);
			super.stream.encryptPacket();
			this.anInt444 = -1;
		}
		if (local29 == 220) {
			this.method543(this.anInt428, this.anInt429, local4, local9, true);
			super.stream.p1spooky(252, 634);
			super.stream.p2(local4 + this.anInt410);
			super.stream.p2(local9 + this.anInt411);
			super.stream.p2(local14);
			super.stream.encryptPacket();
		}
		if (local29 == 3200) {
			this.message(ClientConfig.objDesc[local14], 3);
		}
		if (local29 == 300) {
			this.method545(local4, local9, local14);
			super.stream.p1spooky(223, 596);
			super.stream.p2(local4 + this.anInt410);
			super.stream.p2(local9 + this.anInt411);
			super.stream.p1(local14);
			super.stream.p2(local19);
			super.stream.encryptPacket();
			this.anInt453 = -1;
		}
		if (local29 == 310) {
			this.method545(local4, local9, local14);
			super.stream.p1spooky(239, 792);
			super.stream.p2(local4 + this.anInt410);
			super.stream.p2(local9 + this.anInt411);
			super.stream.p1(local14);
			super.stream.p2(local19);
			super.stream.encryptPacket();
			this.anInt444 = -1;
		}
		if (local29 == 320) {
			this.method545(local4, local9, local14);
			super.stream.p1spooky(238, 212);
			super.stream.p2(local4 + this.anInt410);
			super.stream.p2(local9 + this.anInt411);
			super.stream.p1(local14);
			super.stream.encryptPacket();
		}
		if (local29 == 2300) {
			this.method545(local4, local9, local14);
			super.stream.p1spooky(229, 726);
			super.stream.p2(local4 + this.anInt410);
			super.stream.p2(local9 + this.anInt411);
			super.stream.p1(local14);
			super.stream.encryptPacket();
		}
		if (local29 == 3300) {
			this.message(ClientConfig.boundDesc[local14], 3);
		}
		if (local29 == 400) {
			this.method544(local4, local9, local14, local19);
			super.stream.p1spooky(222, 555);
			super.stream.p2(local4 + this.anInt410);
			super.stream.p2(local9 + this.anInt411);
			super.stream.p2(local24);
			super.stream.encryptPacket();
			this.anInt453 = -1;
		}
		if (local29 == 410) {
			this.method544(local4, local9, local14, local19);
			super.stream.p1spooky(241, 772);
			super.stream.p2(local4 + this.anInt410);
			super.stream.p2(local9 + this.anInt411);
			super.stream.p2(local24);
			super.stream.encryptPacket();
			this.anInt444 = -1;
		}
		if (local29 == 420) {
			this.method544(local4, local9, local14, local19);
			super.stream.p1spooky(242, 863);
			super.stream.p2(local4 + this.anInt410);
			super.stream.p2(local9 + this.anInt411);
			super.stream.encryptPacket();
		}
		if (local29 == 2400) {
			this.method544(local4, local9, local14, local19);
			super.stream.p1spooky(230, 67);
			super.stream.p2(local4 + this.anInt410);
			super.stream.p2(local9 + this.anInt411);
			super.stream.encryptPacket();
		}
		if (local29 == 3400) {
			this.message(ClientConfig.locDesc[local14], 3);
		}
		if (local29 == 600) {
			super.stream.p1spooky(220, 567);
			super.stream.p2(local14);
			super.stream.p2(local19);
			super.stream.encryptPacket();
			this.anInt453 = -1;
		}
		if (local29 == 610) {
			super.stream.p1spooky(240, 377);
			super.stream.p2(local14);
			super.stream.p2(local19);
			super.stream.encryptPacket();
			this.anInt444 = -1;
		}
		if (local29 == 620) {
			super.stream.p1spooky(248, 466);
			super.stream.p2(local14);
			super.stream.encryptPacket();
		}
		if (local29 == 630) {
			super.stream.p1spooky(249, 267);
			super.stream.p2(local14);
			super.stream.encryptPacket();
		}
		if (local29 == 640) {
			super.stream.p1spooky(246, 237);
			super.stream.p2(local14);
			super.stream.encryptPacket();
		}
		if (local29 == 650) {
			this.anInt444 = local14;
			this.anInt441 = 0;
			this.aString32 = ClientConfig.objName[this.anIntArray185[this.anInt444]];
		}
		if (local29 == 660) {
			super.stream.p1spooky(251, 664);
			super.stream.p2(local14);
			super.stream.encryptPacket();
			this.anInt444 = -1;
			this.anInt441 = 0;
			this.message("Dropping " + ClientConfig.objName[this.anIntArray185[local14]], 4);
		}
		if (local29 == 3600) {
			this.message(ClientConfig.objDesc[local14], 3);
		}
		@Pc(634) int local634;
		@Pc(641) int local641;
		if (local29 == 700) {
			local634 = (local4 - 64) / this.anInt383;
			local641 = (local9 - 64) / this.anInt383;
			this.method542(this.anInt428, this.anInt429, local634, local641, true);
			super.stream.p1spooky(225, 824);
			super.stream.p2(local14);
			super.stream.p2(local19);
			super.stream.encryptPacket();
			this.anInt453 = -1;
		}
		if (local29 == 710) {
			local634 = (local4 - 64) / this.anInt383;
			local641 = (local9 - 64) / this.anInt383;
			this.method542(this.anInt428, this.anInt429, local634, local641, true);
			super.stream.p1spooky(243, 876);
			super.stream.p2(local14);
			super.stream.p2(local19);
			super.stream.encryptPacket();
			this.anInt444 = -1;
		}
		if (local29 == 720) {
			local634 = (local4 - 64) / this.anInt383;
			local641 = (local9 - 64) / this.anInt383;
			this.method542(this.anInt428, this.anInt429, local634, local641, true);
			super.stream.p1spooky(245, 586);
			super.stream.p2(local14);
			super.stream.encryptPacket();
		}
		if (local29 == 725) {
			local634 = (local4 - 64) / this.anInt383;
			local641 = (local9 - 64) / this.anInt383;
			this.method542(this.anInt428, this.anInt429, local634, local641, true);
			super.stream.p1spooky(195, 543);
			super.stream.p2(local14);
			super.stream.encryptPacket();
		}
		if (local29 == 715 || local29 == 2715) {
			local634 = (local4 - 64) / this.anInt383;
			local641 = (local9 - 64) / this.anInt383;
			this.method542(this.anInt428, this.anInt429, local634, local641, true);
			super.stream.p1spooky(244, 754);
			super.stream.p2(local14);
			super.stream.encryptPacket();
		}
		if (local29 == 3700) {
			this.message(ClientConfig.npcDesc[local14], 3);
		}
		if (local29 == 800) {
			local634 = (local4 - 64) / this.anInt383;
			local641 = (local9 - 64) / this.anInt383;
			this.method542(this.anInt428, this.anInt429, local634, local641, true);
			super.stream.p1spooky(226, 117);
			super.stream.p2(local14);
			super.stream.p2(local19);
			super.stream.encryptPacket();
			this.anInt453 = -1;
		}
		if (local29 == 810) {
			local634 = (local4 - 64) / this.anInt383;
			local641 = (local9 - 64) / this.anInt383;
			this.method542(this.anInt428, this.anInt429, local634, local641, true);
			super.stream.p1spooky(219, 145);
			super.stream.p2(local14);
			super.stream.p2(local19);
			super.stream.encryptPacket();
			this.anInt444 = -1;
		}
		if (local29 == 805 || local29 == 2805) {
			local634 = (local4 - 64) / this.anInt383;
			local641 = (local9 - 64) / this.anInt383;
			this.method542(this.anInt428, this.anInt429, local634, local641, true);
			super.stream.p1spooky(228, 414);
			super.stream.p2(local14);
			super.stream.encryptPacket();
		}
		if (local29 == 2806) {
			super.stream.p1spooky(204, 273);
			super.stream.p2(local14);
			super.stream.encryptPacket();
		}
		if (local29 == 2810) {
			super.stream.p1spooky(235, 636);
			super.stream.p2(local14);
			super.stream.encryptPacket();
		}
		if (local29 == 2820) {
			super.stream.p1spooky(214, 596);
			super.stream.p2(local14);
			super.stream.encryptPacket();
		}
		if (local29 == 900) {
			this.method542(this.anInt428, this.anInt429, local4, local9, true);
			super.stream.p1spooky(221, 545);
			super.stream.p2(local4 + this.anInt410);
			super.stream.p2(local9 + this.anInt411);
			super.stream.p2(local14);
			super.stream.encryptPacket();
			this.anInt453 = -1;
		}
		if (local29 == 920) {
			this.method542(this.anInt428, this.anInt429, local4, local9, false);
			if (this.anInt403 == -24) {
				this.anInt403 = 24;
			}
		}
		if (local29 == 1000) {
			super.stream.p1spooky(227, 411);
			super.stream.p2(local14);
			super.stream.encryptPacket();
			this.anInt453 = -1;
		}
		if (local29 == 4000) {
			this.anInt444 = -1;
			this.anInt453 = -1;
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	@Override
	protected byte[] loadJag(@OriginalArg(0) String file, @OriginalArg(1) String displayStr, @OriginalArg(2) int progress) {
		if (!this.appletMode) {
			file = "./release/" + file;
		}
		@Pc(14) byte[] local14 = Link.getjag(file);
		if (local14 == null) {
			return super.loadJag(file, displayStr, progress);
		}
		@Pc(38) int local38 = ((local14[0] & 0xFF) << 16) + ((local14[1] & 0xFF) << 8) + (local14[2] & 0xFF);
		@Pc(60) int local60 = ((local14[3] & 0xFF) << 16) + ((local14[4] & 0xFF) << 8) + (local14[5] & 0xFF);
		@Pc(66) byte[] local66 = new byte[local14.length - 6];
		for (@Pc(68) int local68 = 0; local68 < local14.length - 6; local68++) {
			local66[local68] = local14[local68 + 6];
		}
		this.drawProgress(progress, "Unpacking " + displayStr);
		if (local60 == local38) {
			return local66;
		} else {
			@Pc(101) byte[] local101 = new byte[local38];
			BZip2.decompress(local101, local38, local66, local60, 0);
			return local101;
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "j", descriptor = "()I")
	@Override
	protected int getUid() {
		return Link.uid;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
	@Override
	public Graphics getGraphics() {
		if (GameShell.viewbox == null) {
			return Link.mainapp == null ? super.getGraphics() : Link.mainapp.getGraphics();
		} else {
			return GameShell.viewbox.getGraphics();
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "createImage", descriptor = "(II)Ljava/awt/Image;")
	@Override
	public Image createImage(@OriginalArg(0) int width, @OriginalArg(1) int height) {
		if (GameShell.viewbox == null) {
			return Link.mainapp == null ? super.createImage(width, height) : Link.mainapp.createImage(width, height);
		} else {
			return GameShell.viewbox.createImage(width, height);
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public URL getCodeBase() {
		return Link.mainapp == null ? super.getCodeBase() : Link.mainapp.getCodeBase();
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public URL getDocumentBase() {
		return Link.mainapp == null ? super.getDocumentBase() : Link.mainapp.getDocumentBase();
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String name) {
		return Link.mainapp == null ? super.getParameter(name) : Link.mainapp.getParameter(name);
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/net/Socket;")
	@Override
	protected Socket openSocket(@OriginalArg(0) String host, @OriginalArg(1) int port) throws IOException {
		@Pc(4) Socket socket;
		if (Link.mainapp != null) {
			socket = Link.opensocket(port);
			if (socket == null) {
				throw new IOException();
			}
			return socket;
		}

		if (this.isApplet()) {
			socket = new Socket(InetAddress.getByName(this.getCodeBase().getHost()), port);
		} else {
			socket = new Socket(InetAddress.getByName(host), port);
		}

		socket.setSoTimeout(30000);
		socket.setTcpNoDelay(true);
		return socket;
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "a", descriptor = "(Ljava/lang/Runnable;)V")
	@Override
	public void startThread(@OriginalArg(0) Runnable runnable) {
		if (Link.mainapp == null) {
			@Pc(9) Thread local9 = new Thread(runnable);
			local9.setDaemon(true);
			local9.start();
		} else {
			Link.startthread(runnable);
		}
	}

	@OriginalMember(owner = "mudclient!mudclient", name = "g", descriptor = "(I)Ljava/lang/String;")
	private String getHostName(@OriginalArg(0) int ip) {
		return Link.mainapp == null ? Tools.formatIPv4(ip) : Link.gethostname(Tools.formatIPv4(ip));
	}
}
