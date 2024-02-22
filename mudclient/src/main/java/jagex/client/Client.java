package jagex.client;

import jagex.Tools;
import jagex.WordFilter;
import jagex.WordPack;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;
import java.io.IOException;
import java.math.BigInteger;

@OriginalClass("mudclient!a/a/b")
public class Client extends GameShell {

	@OriginalMember(owner = "mudclient!a/a/b", name = "T", descriptor = "I")
	protected static int anInt361;

	@OriginalMember(owner = "mudclient!a/a/b", name = "R", descriptor = "[Ljava/lang/String;")
	protected static String[] loginResponses = new String[] {
		//
		"You must enter both a username",
		"and a password - Please try again",
		//
		"Connection lost! Please wait...",
		"Attempting to re-establish",
		//
		"That username is already in use.",
		"Wait 60 seconds then retry",
		//
		"Please wait...",
		"Connecting to server",
		//
		"Sorry! The server is currently full.",
		"Please try again later",
		//
		"Invalid username or password.",
		"Try again, or create a new account",
		//
		"Sorry! Unable to connect to server.",
		"Check your internet settings",
		//
		"Username already taken.",
		"Please choose another username",
		//
		"The client has been updated.",
		"Please reload this page",
		//
		"You may only use 1 character at once.",
		"Your ip-address is already in use",
		//
		"Login attempts exceeded!",
		"Please try again in 5 minutes",
		//
		"Account has been temporarily disabled",
		"check your message inbox for details",
		//
		"Account has been permanently disabled",
		"check your message inbox for details",
		//
		"You need a members account",
		"to login to this server",
		//
		"Please login to a members server",
		"to access member-only features"
    };

    @OriginalMember(owner = "mudclient!a/a/b", name = "S", descriptor = "I")
	protected static int anInt360 = 1;

	@OriginalMember(owner = "mudclient!a/a/b", name = "bp", descriptor = "[I")
	protected static final int[] SERVERPROT_ENCRYPTION = new int[] { 124, 345, 953, 124, 634, 636, 661, 127, 177, 295, 559, 384, 321, 679, 871, 592, 679, 347, 926, 585, 681, 195, 785, 679, 818, 115, 226, 799, 925, 852, 194, 966, 32, 3, 4, 5, 6, 7, 8, 9, 40, 1, 2, 3, 4, 5, 6, 7, 8, 9, 50, 444, 52, 3, 4, 5, 6, 7, 8, 9, 60, 1, 2, 3, 4, 5, 6, 7, 8, 9, 70, 1, 2, 3, 4, 5, 6, 7, 8, 9, 80, 1, 2, 3, 4, 5, 6, 7, 8, 9, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 100, 1, 2, 3, 4, 5, 6, 7, 8, 9, 110, 1, 2, 3, 4, 5, 6, 7, 8, 9, 120, 1, 2, 3, 4, 5, 6, 7, 8, 9, 130, 1, 2, 3, 4, 5, 6, 7, 8, 9, 140, 1, 2, 3, 4, 5, 6, 7, 8, 9, 150, 1, 2, 3, 4, 5, 6, 7, 8, 9, 160, 1, 2, 3, 4, 5, 6, 7, 8, 9, 170, 1, 2, 3, 4, 5, 6, 7, 8, 9, 180, 1, 2, 3, 4, 5, 6, 7, 8, 9, 694, 235, 846, 834, 300, 200, 298, 278, 247, 286, 346, 144, 23, 913, 812, 765, 432, 176, 935, 452, 542, 45, 346, 65, 637, 62, 354, 123, 34, 912, 812, 834, 698, 324, 872, 912, 438, 765, 344, 731, 625, 783, 176, 658, 128, 854, 489, 85, 6, 865, 43, 573, 132, 527, 235, 434, 658, 912, 825, 298, 753, 282, 652, 439, 629, 945 };

	@OriginalMember(owner = "mudclient!a/a/b", name = "Y", descriptor = "Lmudclient!a/a/k;")
	protected ClientStream stream;

	@OriginalMember(owner = "mudclient!a/a/b", name = "ba", descriptor = "I")
	private int anInt363;

	@OriginalMember(owner = "mudclient!a/a/b", name = "bb", descriptor = "J")
	private long aLong4;

	@OriginalMember(owner = "mudclient!a/a/b", name = "bc", descriptor = "I")
	protected int friendCount;

	@OriginalMember(owner = "mudclient!a/a/b", name = "bf", descriptor = "I")
	protected int anInt365;

	@OriginalMember(owner = "mudclient!a/a/b", name = "bh", descriptor = "I")
	protected int chatMessagesMode;

	@OriginalMember(owner = "mudclient!a/a/b", name = "bi", descriptor = "I")
	protected int privateMessagesMode;

	@OriginalMember(owner = "mudclient!a/a/b", name = "bj", descriptor = "I")
	protected int tradeRequestsMode;

	@OriginalMember(owner = "mudclient!a/a/b", name = "bk", descriptor = "I")
	protected int duelRequestsMode;

	@OriginalMember(owner = "mudclient!a/a/b", name = "bl", descriptor = "Ljava/math/BigInteger;")
	private BigInteger RSA_EXPONENT;

	@OriginalMember(owner = "mudclient!a/a/b", name = "bm", descriptor = "Ljava/math/BigInteger;")
	private BigInteger RSA_MODULUS;

	@OriginalMember(owner = "mudclient!a/a/b", name = "bn", descriptor = "I")
	protected int sessionId;

	@OriginalMember(owner = "mudclient!a/a/b", name = "bo", descriptor = "I")
	protected int anInt371;

	@OriginalMember(owner = "mudclient!a/a/b", name = "U", descriptor = "Ljava/lang/String;")
	protected String worldHost = "127.0.0.1";

	@OriginalMember(owner = "mudclient!a/a/b", name = "V", descriptor = "I")
	protected int worldPort = 43594;

	@OriginalMember(owner = "mudclient!a/a/b", name = "W", descriptor = "Ljava/lang/String;")
	private String username = "";

	@OriginalMember(owner = "mudclient!a/a/b", name = "X", descriptor = "Ljava/lang/String;")
	private String password = "";

	@OriginalMember(owner = "mudclient!a/a/b", name = "Z", descriptor = "[B")
	private byte[] in = new byte[5000];

	@OriginalMember(owner = "mudclient!a/a/b", name = "bd", descriptor = "[J")
	protected long[] friendName37 = new long[100];

	@OriginalMember(owner = "mudclient!a/a/b", name = "be", descriptor = "[I")
	protected int[] friendWorld = new int[100];

	@OriginalMember(owner = "mudclient!a/a/b", name = "bg", descriptor = "[J")
	protected long[] ignoreName37 = new long[50];

	@OriginalMember(owner = "mudclient!a/a/b", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	protected final void setRsaKey(@OriginalArg(0) BigInteger exponent, @OriginalArg(1) BigInteger modulus) {
		this.RSA_EXPONENT = exponent;
		this.RSA_MODULUS = modulus;
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "j", descriptor = "()I")
	protected int getUid() {
		return 0;
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	protected final void method469(@OriginalArg(0) String username, @OriginalArg(1) String password, @OriginalArg(2) boolean arg2) {
		if (this.anInt371 > 0) {
			this.method486(loginResponses[6], loginResponses[7]);
			try {
				Thread.sleep(2000L);
			} catch (@Pc(16) Exception ignored) {
			}
			this.method486(loginResponses[8], loginResponses[9]);
			return;
		}
		try {
			this.username = username;
			@Pc(32) String cleanUsername = Tools.formatAuthString(username, 20);
			this.password = password;
			@Pc(39) String cleanPassword = Tools.formatAuthString(password, 20);
			if (cleanUsername.trim().length() == 0) {
				this.method486(loginResponses[0], loginResponses[1]);
			} else {
				if (arg2) {
					this.method472(loginResponses[2], loginResponses[3]);
				} else {
					this.method486(loginResponses[6], loginResponses[7]);
				}
				this.stream = new ClientStream(this.openSocket(this.worldHost, this.worldPort), this);
				this.stream.maxRetries = anInt361;
				@Pc(92) int local92 = this.stream.g4();
				this.sessionId = local92;
				System.out.println("Session id: " + local92);
				@Pc(106) int local106 = 0;
				try {
					if (this.isApplet()) {
						@Pc(113) String local113 = this.getParameter("referid");
						local106 = Integer.parseInt(local113);
						@Pc(120) String local120 = this.getParameter("limit30");
						if (local120.equals("1")) {
							local106 += 50;
						}
					}
				} catch (@Pc(127) Exception ignored) {
				}
				if (arg2) {
					this.stream.p1spooky(19, 712);
				} else {
					this.stream.p1spooky(0, 625);
				}
				this.stream.p2(anInt360);
				this.stream.p2(local106);
				this.stream.p8(Tools.toBase37(cleanUsername));
				this.stream.rsaenc(cleanPassword, local92, this.RSA_EXPONENT, this.RSA_MODULUS);
				this.stream.p4(this.getUid());
				this.stream.flush();
				this.stream.read();
				@Pc(179) int local179 = this.stream.read();
				@Pc(185) int local185 = this.stream.g1spooky(local179, SERVERPROT_ENCRYPTION);
				System.out.println("Login response: " + local185);
				if (local185 == 0) {
					this.anInt363 = 0;
					this.method488();
				} else if (local185 == 1) {
					this.anInt363 = 0;
					this.method487();
				} else if (arg2) {
					this.method489();
				} else if (local185 == 3) {
					this.method486(loginResponses[10], loginResponses[11]);
				} else if (local185 == 4) {
					this.method486(loginResponses[4], loginResponses[5]);
				} else if (local185 == 5) {
					this.method486(loginResponses[16], loginResponses[17]);
				} else if (local185 == 6) {
					this.method486(loginResponses[18], loginResponses[19]);
				} else if (local185 == 7) {
					this.method486(loginResponses[20], loginResponses[21]);
				} else if (local185 == 11) {
					this.method486(loginResponses[22], loginResponses[23]);
				} else if (local185 == 12) {
					this.method486(loginResponses[24], loginResponses[25]);
				} else if (local185 == 13) {
					this.method486(loginResponses[14], loginResponses[15]);
				} else if (local185 == 14) {
					this.method486(loginResponses[8], loginResponses[9]);
					this.anInt371 = 1500;
				} else if (local185 == 15) {
					this.method486(loginResponses[26], loginResponses[27]);
				} else if (local185 == 16) {
					this.method486(loginResponses[28], loginResponses[29]);
				} else {
					this.method486(loginResponses[12], loginResponses[13]);
				}
			}
		} catch (@Pc(365) Exception ex) {
			System.out.println(ex.getMessage());
			if (this.anInt363 > 0) {
				try {
					Thread.sleep(5000L);
				} catch (@Pc(376) Exception local376) {
				}
				this.anInt363--;
				this.method469(this.username, this.password, arg2);
			}
			if (arg2) {
				this.username = "";
				this.password = "";
				this.method489();
			} else {
				this.method486(loginResponses[12], loginResponses[13]);
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "k", descriptor = "()V")
	protected final void method470() {
		if (this.stream != null) {
			try {
				this.stream.p1spooky(1, 325);
				this.stream.flush();
			} catch (@Pc(12) IOException ignored) {
			}
		}
		this.username = "";
		this.password = "";
		this.method489();
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "l", descriptor = "()V")
	protected void method471() {
		System.out.println("Lost connection");
		this.anInt363 = 10;
		this.method469(this.username, this.password, true);
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;)V")
	private void method472(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		@Pc(2) Graphics local2 = this.getGraphics();
		@Pc(9) Font local9 = new Font("Helvetica", Font.BOLD, 15);
		@Pc(11) short local11 = 512;
		@Pc(13) short local13 = 344;
		local2.setColor(Color.black);
		local2.fillRect(local11 / 2 - 140, local13 / 2 - 25, 280, 50);
		local2.setColor(Color.white);
		local2.drawRect(local11 / 2 - 140, local13 / 2 - 25, 280, 50);
		this.drawString(local2, arg0, local9, local11 / 2, local13 / 2 - 10);
		this.drawString(local2, arg1, local9, local11 / 2, local13 / 2 + 10);
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;)V")
	protected final void method473(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (this.anInt371 > 0) {
			this.method486(loginResponses[6], loginResponses[7]);
			try {
				Thread.sleep(2000L);
			} catch (@Pc(14) Exception local14) {
			}
			this.method486(loginResponses[8], loginResponses[9]);
			return;
		}
		try {
			@Pc(27) String local27 = Tools.formatAuthString(arg0, 20);
			@Pc(31) String local31 = Tools.formatAuthString(arg1, 20);
			this.method486(loginResponses[6], loginResponses[7]);
			this.stream = new ClientStream(this.openSocket(this.worldHost, this.worldPort), this);
			@Pc(55) int local55 = this.stream.g4();
			this.sessionId = local55;
			System.out.println("Session id: " + local55);
			@Pc(69) int local69 = 0;
			try {
				if (this.isApplet()) {
					@Pc(76) String local76 = this.getParameter("referid");
					local69 = Integer.parseInt(local76);
					@Pc(83) String local83 = this.getParameter("limit30");
					if (local83.equals("1")) {
						local69 += 50;
					}
				}
			} catch (@Pc(90) Exception local90) {
			}
			this.stream.p1spooky(2, 129);
			this.stream.p2(anInt360);
			this.stream.p8(Tools.toBase37(local27));
			this.stream.p2(local69);
			this.stream.rsaenc(local31, local55, this.RSA_EXPONENT, this.RSA_MODULUS);
			this.stream.p4(this.getUid());
			this.stream.flush();
			this.stream.read();
			@Pc(133) int local133 = this.stream.read();
			this.stream.close();
			@Pc(142) int local142 = this.stream.g1spooky(local133, SERVERPROT_ENCRYPTION);
			System.out.println("Newplayer response: " + local142);
			if (local142 == 2) {
				this.method491();
			} else if (local142 == 3) {
				this.method486(loginResponses[14], loginResponses[15]);
			} else if (local142 == 4) {
				this.method486(loginResponses[4], loginResponses[5]);
			} else if (local142 == 5) {
				this.method486(loginResponses[16], loginResponses[17]);
			} else if (local142 == 6) {
				this.method486(loginResponses[18], loginResponses[19]);
			} else if (local142 == 7) {
				this.method486(loginResponses[20], loginResponses[21]);
			} else if (local142 == 11) {
				this.method486(loginResponses[22], loginResponses[23]);
			} else if (local142 == 12) {
				this.method486(loginResponses[24], loginResponses[25]);
			} else if (local142 == 13) {
				this.method486(loginResponses[14], loginResponses[15]);
			} else if (local142 == 14) {
				this.method486(loginResponses[8], loginResponses[9]);
				this.anInt371 = 1500;
			} else if (local142 == 15) {
				this.method486(loginResponses[26], loginResponses[27]);
			} else if (local142 == 16) {
				this.method486(loginResponses[28], loginResponses[29]);
			} else {
				this.method486(loginResponses[12], loginResponses[13]);
			}
		} catch (@Pc(302) Exception local302) {
			System.out.println(String.valueOf(local302));
			this.method486(loginResponses[12], loginResponses[13]);
		}
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "m", descriptor = "()V")
	protected final void method474() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (this.stream.hasPacket()) {
			this.aLong4 = local1;
		}
		if (local1 - this.aLong4 > 5000L) {
			this.aLong4 = local1;
			this.stream.p1spooky(5, 348);
			this.stream.encryptPacket();
		}
		try {
			this.stream.writePacket(20);
		} catch (@Pc(32) IOException local32) {
			this.method471();
			return;
		}
		if (this.method494()) {
			@Pc(45) int local45 = this.stream.readPacket(this.in);
			if (local45 > 0) {
				this.method475(this.in[0] & 0xFF, local45);
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "a", descriptor = "(II)V")
	private void method475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = this.stream.g1spooky(arg0, SERVERPROT_ENCRYPTION);
		if (local7 == 8) {
			@Pc(20) String local20 = new String(this.in, 1, arg1 - 1);
			this.method493(local20);
		}
		if (local7 == 9) {
			this.method470();
		}
		if (local7 == 10) {
			this.method490();
			return;
		}
		@Pc(46) int local46;
		if (local7 == 23) {
			this.friendCount = Tools.g1(this.in[1]);
			for (local46 = 0; local46 < this.friendCount; local46++) {
				this.friendName37[local46] = Tools.g8(this.in, local46 * 9 + 2);
				this.friendWorld[local46] = Tools.g1(this.in[local46 * 9 + 10]);
			}
			this.method476();
			return;
		}
		@Pc(89) long local89;
		if (local7 == 24) {
			local89 = Tools.g8(this.in, 1);
			@Pc(96) int local96 = this.in[9] & 0xFF;
			for (@Pc(98) int local98 = 0; local98 < this.friendCount; local98++) {
				if (this.friendName37[local98] == local89) {
					if (this.friendWorld[local98] == 0 && local96 != 0) {
						this.method493("@pri@" + Tools.fromBase37(local89) + " has logged in");
					}
					if (this.friendWorld[local98] != 0 && local96 == 0) {
						this.method493("@pri@" + Tools.fromBase37(local89) + " has logged out");
					}
					this.friendWorld[local98] = local96;
					this.method476();
					return;
				}
			}
			this.friendName37[this.friendCount] = local89;
			this.friendWorld[this.friendCount] = local96;
			this.friendCount++;
			this.method493("@pri@" + Tools.fromBase37(local89) + " has been added to your friends list");
			this.method476();
		} else if (local7 == 26) {
			this.anInt365 = Tools.g1(this.in[1]);
			for (local46 = 0; local46 < this.anInt365; local46++) {
				this.ignoreName37[local46] = Tools.g8(this.in, local46 * 8 + 2);
			}
		} else if (local7 == 27) {
			this.chatMessagesMode = this.in[1];
			this.privateMessagesMode = this.in[2];
			this.tradeRequestsMode = this.in[3];
			this.duelRequestsMode = this.in[4];
		} else if (local7 == 28) {
			local89 = Tools.g8(this.in, 1);
			@Pc(270) String local270 = WordFilter.method327(WordPack.method352(this.in, 9, arg1 - 9));
			this.method493("@pri@" + Tools.fromBase37(local89) + ": tells you " + local270);
		} else {
			this.method492(local7, arg1, this.in);
		}
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "n", descriptor = "()V")
	private void method476() {
		@Pc(3) boolean local3 = true;
		while (local3) {
			local3 = false;
			for (@Pc(9) int local9 = 0; local9 < this.friendCount - 1; local9++) {
				if (this.friendWorld[local9] < this.friendWorld[local9 + 1]) {
					@Pc(27) int local27 = this.friendWorld[local9];
					this.friendWorld[local9] = this.friendWorld[local9 + 1];
					this.friendWorld[local9 + 1] = local27;
					@Pc(49) long local49 = this.friendName37[local9];
					this.friendName37[local9] = this.friendName37[local9 + 1];
					this.friendName37[local9 + 1] = local49;
					local3 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "c", descriptor = "(Ljava/lang/String;Ljava/lang/String;)V")
	protected final void method477(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		@Pc(3) String local3 = Tools.formatAuthString(arg0, 20);
		@Pc(7) String local7 = Tools.formatAuthString(arg1, 20);
		this.stream.p1spooky(25, 551);
		this.stream.rsaenc(local3 + local7, this.sessionId, this.RSA_EXPONENT, this.RSA_MODULUS);
		this.stream.encryptPacket();
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "a", descriptor = "(IIII)V")
	protected final void method478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.stream.p1spooky(31, 777);
		this.stream.p1(arg0);
		this.stream.p1(arg1);
		this.stream.p1(arg2);
		this.stream.p1(arg3);
		this.stream.encryptPacket();
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "a", descriptor = "(Ljava/lang/String;)V")
	protected final void method479(@OriginalArg(0) String arg0) {
		@Pc(2) long local2 = Tools.toBase37(arg0);
		this.stream.p1spooky(29, 101);
		this.stream.p8(local2);
		this.stream.encryptPacket();
		for (@Pc(16) int local16 = 0; local16 < this.anInt365; local16++) {
			if (this.ignoreName37[local16] == local2) {
				return;
			}
		}
		if (this.anInt365 < 50) {
			this.ignoreName37[this.anInt365++] = local2;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "a", descriptor = "(J)V")
	protected final void method480(@OriginalArg(0) long arg0) {
		this.stream.p1spooky(30, 511);
		this.stream.p8(arg0);
		this.stream.encryptPacket();
		for (@Pc(15) int local15 = 0; local15 < this.anInt365; local15++) {
			if (this.ignoreName37[local15] == arg0) {
				this.anInt365--;
				for (@Pc(32) int local32 = local15; local32 < this.anInt365; local32++) {
					this.ignoreName37[local32] = this.ignoreName37[local32 + 1];
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "b", descriptor = "(Ljava/lang/String;)V")
	protected final void method481(@OriginalArg(0) String arg0) {
		this.stream.p1spooky(26, 622);
		this.stream.p8(Tools.toBase37(arg0));
		this.stream.encryptPacket();
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "b", descriptor = "(J)V")
	protected final void method482(@OriginalArg(0) long arg0) {
		this.stream.p1spooky(27, 707);
		this.stream.p8(arg0);
		this.stream.encryptPacket();
		label23: for (@Pc(15) int local15 = 0; local15 < this.friendCount; local15++) {
			if (this.friendName37[local15] == arg0) {
				this.friendCount--;
				@Pc(32) int local32 = local15;
				while (true) {
					if (local32 >= this.friendCount) {
						break label23;
					}
					this.friendName37[local32] = this.friendName37[local32 + 1];
					this.friendWorld[local32] = this.friendWorld[local32 + 1];
					local32++;
				}
			}
		}
		this.method493("@pri@" + Tools.fromBase37(arg0) + " has been removed from your friends list");
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "a", descriptor = "(J[BI)V")
	protected final void method483(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.stream.p1spooky(28, 185);
		this.stream.p8(arg0);
		this.stream.pdata(arg1, 0, arg2);
		this.stream.encryptPacket();
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "a", descriptor = "([BI)V")
	protected final void method484(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.stream.p1spooky(3, 643);
		this.stream.pdata(arg0, 0, arg1);
		this.stream.encryptPacket();
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "c", descriptor = "(Ljava/lang/String;)V")
	protected final void method485(@OriginalArg(0) String arg0) {
		this.stream.p1spooky(7, 293);
		this.stream.pjstr(arg0);
		this.stream.encryptPacket();
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "d", descriptor = "(Ljava/lang/String;Ljava/lang/String;)V")
	protected void method486(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "o", descriptor = "()V")
	private void method487() {
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "p", descriptor = "()V")
	protected void method488() {
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "q", descriptor = "()V")
	protected void method489() {
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "r", descriptor = "()V")
	protected void method490() {
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "s", descriptor = "()V")
	protected void method491() {
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "a", descriptor = "(II[B)V")
	protected void method492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "d", descriptor = "(Ljava/lang/String;)V")
	protected void method493(@OriginalArg(0) String arg0) {
	}

	@OriginalMember(owner = "mudclient!a/a/b", name = "t", descriptor = "()Z")
	private boolean method494() {
		return true;
	}
}
