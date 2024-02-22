package jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;
import java.math.BigInteger;

@OriginalClass("mudclient!a/e")
public class Stream {

	public static final String THREAT = "All RuneScape code and data, including this message, are copyright 2003 Jagex Ltd. Unauthorised reproduction in any form is strictly prohibited.  The RuneScape network protocol is copyright 2003 Jagex Ltd and is protected by international copyright laws. The RuneScape network protocol also incorporates a copy protection mechanism to prevent unauthorised access or use of our servers. Attempting to break, bypass or duplicate this mechanism is an infringement of the Digital Millienium Copyright Act and may lead to prosecution. Decompiling, or reverse-engineering the RuneScape code in any way is strictly prohibited. RuneScape and Jagex are registered trademarks of Jagex Ltd. You should not be reading this message, you have been warned...";

	@OriginalMember(owner = "mudclient!a/e", name = "a", descriptor = "I")
	private static final int THREAT_LEN = THREAT.length();

	@OriginalMember(owner = "mudclient!a/e", name = "g", descriptor = "[I")
	private static int[] OVERALL_PACKET_COUNTER = new int[256];

	@OriginalMember(owner = "mudclient!a/e", name = "h", descriptor = "[I")
	private static int[] overallPacketSizes = new int[256];

	@OriginalMember(owner = "mudclient!a/e", name = "y", descriptor = "[C")
	private static char[] CHARSET = new char[256];

	@OriginalMember(owner = "mudclient!a/e", name = "G", descriptor = "[I")
	private static int[] BITMASK;

	@OriginalMember(owner = "mudclient!a/e", name = "b", descriptor = "I")
	private int writeThreatIndex;

	@OriginalMember(owner = "mudclient!a/e", name = "d", descriptor = "I")
	private int readThreatIndex;

	@OriginalMember(owner = "mudclient!a/e", name = "f", descriptor = "I")
	private int writeThreatFriend;

	@OriginalMember(owner = "mudclient!a/e", name = "l", descriptor = "I")
	private int writeTries;

	@OriginalMember(owner = "mudclient!a/e", name = "z", descriptor = "I")
	private int length;

	@OriginalMember(owner = "mudclient!a/e", name = "A", descriptor = "I")
	private int retry;

	@OriginalMember(owner = "mudclient!a/e", name = "B", descriptor = "I")
	public int maxRetries;

	@OriginalMember(owner = "mudclient!a/e", name = "C", descriptor = "I")
	private int start;

	@OriginalMember(owner = "mudclient!a/e", name = "F", descriptor = "[B")
	private byte[] data;

	@OriginalMember(owner = "mudclient!a/e", name = "c", descriptor = "I")
	private int encodeKey = 3141592;

	@OriginalMember(owner = "mudclient!a/e", name = "e", descriptor = "I")
	private int decodeKey = 3141592;

	@OriginalMember(owner = "mudclient!a/e", name = "i", descriptor = "I")
	private int maxPacketLength = 5000;

	@OriginalMember(owner = "mudclient!a/e", name = "j", descriptor = "Z")
	protected boolean ioError = false;

	@OriginalMember(owner = "mudclient!a/e", name = "k", descriptor = "Ljava/lang/String;")
	protected String ioException = "";

	@OriginalMember(owner = "mudclient!a/e", name = "m", descriptor = "I")
	private final int anInt222 = 61;

	@OriginalMember(owner = "mudclient!a/e", name = "n", descriptor = "I")
	private final int anInt223 = 59;

	@OriginalMember(owner = "mudclient!a/e", name = "o", descriptor = "I")
	private final int anInt224 = 42;

	@OriginalMember(owner = "mudclient!a/e", name = "p", descriptor = "I")
	private final int anInt225 = 43;

	@OriginalMember(owner = "mudclient!a/e", name = "q", descriptor = "I")
	private final int anInt226 = 44;

	@OriginalMember(owner = "mudclient!a/e", name = "r", descriptor = "I")
	private final int anInt227 = 45;

	@OriginalMember(owner = "mudclient!a/e", name = "s", descriptor = "I")
	private final int anInt228 = 46;

	@OriginalMember(owner = "mudclient!a/e", name = "t", descriptor = "I")
	private final int anInt229 = 47;

	@OriginalMember(owner = "mudclient!a/e", name = "u", descriptor = "I")
	private final int anInt230 = 92;

	@OriginalMember(owner = "mudclient!a/e", name = "v", descriptor = "I")
	private final int anInt231 = 32;

	@OriginalMember(owner = "mudclient!a/e", name = "w", descriptor = "I")
	private final int anInt232 = 124;

	@OriginalMember(owner = "mudclient!a/e", name = "x", descriptor = "I")
	private final int anInt233 = 34;

	@OriginalMember(owner = "mudclient!a/e", name = "D", descriptor = "I")
	private int pos = 3;

	@OriginalMember(owner = "mudclient!a/e", name = "E", descriptor = "I")
	private int packetAlignment = 8;

	static {
		for (@Pc(13) int i = 0; i < 256; i++) {
			CHARSET[i] = (char) i;
		}

		CHARSET[61] = '=';
		CHARSET[59] = ';';
		CHARSET[42] = '*';
		CHARSET[43] = '+';
		CHARSET[44] = ',';
		CHARSET[45] = '-';
		CHARSET[46] = '.';
		CHARSET[47] = '/';
		CHARSET[92] = '\\';
		CHARSET[124] = '|';
		CHARSET[33] = '!';
		CHARSET[34] = '"';

		BITMASK = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
	}

	@OriginalMember(owner = "mudclient!a/e", name = "<init>", descriptor = "()V")
	protected Stream() {
	}

	@OriginalMember(owner = "mudclient!a/e", name = "a", descriptor = "()V")
	public void close() {
	}

	@OriginalMember(owner = "mudclient!a/e", name = "b", descriptor = "()I")
	public int read() throws IOException {
		return 0;
	}

	@OriginalMember(owner = "mudclient!a/e", name = "c", descriptor = "()I")
	protected int available() throws IOException {
		return 0;
	}

	@OriginalMember(owner = "mudclient!a/e", name = "a", descriptor = "(II[B)V")
	protected void read(@OriginalArg(0) int length, @OriginalArg(1) int offset, @OriginalArg(2) byte[] dest) throws IOException {
	}

	@OriginalMember(owner = "mudclient!a/e", name = "a", descriptor = "([BII)V")
	protected void write(@OriginalArg(0) byte[] src, @OriginalArg(1) int offset, @OriginalArg(2) int length) throws IOException {
	}

	@OriginalMember(owner = "mudclient!a/e", name = "d", descriptor = "()I")
	private int g1() throws IOException {
		return this.read();
	}

	@OriginalMember(owner = "mudclient!a/e", name = "e", descriptor = "()I")
	private int g2() throws IOException {
		@Pc(2) int high = this.g1();
		@Pc(5) int low = this.g1();
		return (high << 8) + low;
	}

	@OriginalMember(owner = "mudclient!a/e", name = "f", descriptor = "()I")
	public final int g4() throws IOException {
		@Pc(2) int high = this.g2();
		@Pc(5) int low = this.g2();
		return (high << 16) + low;
	}

	@OriginalMember(owner = "mudclient!a/e", name = "a", descriptor = "(I[B)V")
	public final void gdata(@OriginalArg(0) int src, @OriginalArg(1) byte[] dest) throws IOException {
		this.read(src, 0, dest);
	}

	@OriginalMember(owner = "mudclient!a/e", name = "a", descriptor = "([B)I")
	public final int readPacket(@OriginalArg(0) byte[] src) {
		try {
			this.retry++;

			if (this.maxRetries > 0 && this.retry > this.maxRetries) {
				this.ioError = true;
				this.ioException = "time-out";
				this.maxRetries += this.maxRetries;
				return 0;
			}

			if (this.length == 0 && this.available() >= 2) {
				this.length = this.read();

				if (this.length >= 160) {
					this.length = ((this.length - 160) << 8) + this.read();
				}
			}

			if (this.length > 0 && this.available() >= this.length) {
				if (this.length >= 160) {
					this.gdata(this.length, src);
				} else {
					src[this.length - 1] = (byte) this.read();

					if (this.length > 1) {
						this.gdata(this.length - 1, src);
					}
				}

				@Pc(96) int length = this.length;
				this.length = 0;
				this.retry = 0;
				return length;
			}
		} catch (@Pc(105) IOException ex) {
			this.ioError = true;
			this.ioException = ex.getMessage();
		}

		return 0;
	}

	@OriginalMember(owner = "mudclient!a/e", name = "a", descriptor = "(I)V")
	public final void p1(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) value;
	}

	@OriginalMember(owner = "mudclient!a/e", name = "b", descriptor = "(I)V")
	public final void p2(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) value;
	}

	@OriginalMember(owner = "mudclient!a/e", name = "c", descriptor = "(I)V")
	public final void p4(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) (value >> 24);
		this.data[this.pos++] = (byte) (value >> 16);
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) value;
	}

	@OriginalMember(owner = "mudclient!a/e", name = "a", descriptor = "(J)V")
	public final void p8(@OriginalArg(0) long value) {
		this.p4((int) (value >> 32));
		this.p4((int) value);
	}

	@OriginalMember(owner = "mudclient!a/e", name = "a", descriptor = "(Ljava/lang/String;)V")
	public final void pjstr(@OriginalArg(0) String str) {
		str.getBytes(0, str.length(), this.data, this.pos);
		this.pos += str.length();
	}

	@OriginalMember(owner = "mudclient!a/e", name = "b", descriptor = "([BII)V")
	public final void pdata(@OriginalArg(0) byte[] src, @OriginalArg(1) int offset, @OriginalArg(2) int length) {
		for (@Pc(1) int i = 0; i < length; i++) {
			this.data[this.pos++] = src[offset + i];
		}
	}

	@OriginalMember(owner = "mudclient!a/e", name = "a", descriptor = "(Ljava/lang/String;ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void rsaenc(@OriginalArg(0) String password, @OriginalArg(1) int sessionId, @OriginalArg(2) BigInteger exponent, @OriginalArg(3) BigInteger modulus) {
		@Pc(4) byte[] bytes = password.getBytes();
		@Pc(7) int length = bytes.length;

		@Pc(10) byte[] block = new byte[15];
		for (@Pc(12) int i = 0; i < length; i += 7) {
			block[0] = (byte) (Math.random() * 127.0D + 1.0D);
			block[1] = (byte) (Math.random() * 256.0D);
			block[2] = (byte) (Math.random() * 256.0D);
			block[3] = (byte) (Math.random() * 256.0D);

			Tools.p4(block, 4, sessionId);

			for (@Pc(54) int j = 0; j < 7; j++) {
				if (i + j < length) {
					block[j + 8] = bytes[i + j];
				} else {
					block[j + 8] = 32;
				}
			}

			@Pc(89) BigInteger bigRaw = new BigInteger(1, block);
			@Pc(94) BigInteger bigEnc = bigRaw.modPow(exponent, modulus);
			@Pc(97) byte[] endRaw = bigEnc.toByteArray();

			this.data[this.pos++] = (byte) endRaw.length;
			for (@Pc(112) int j = 0; j < endRaw.length; j++) {
				this.data[this.pos++] = endRaw[j];
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/e", name = "a", descriptor = "(II)V")
	public final void p1spooky(@OriginalArg(0) int opcode, @OriginalArg(1) int friend) {
		this.writeThreatFriend = friend;

		if (this.start > this.maxPacketLength * 4 / 5) {
			try {
				this.writePacket(0);
			} catch (@Pc(16) IOException ex) {
				this.ioError = true;
				this.ioException = ex.getMessage();
			}
		}

		if (this.data == null) {
			this.data = new byte[this.maxPacketLength];
		}

		this.data[this.start + 2] = (byte) opcode;
		this.data[this.start + 3] = 0;
		this.pos = this.start + 3;
		this.packetAlignment = 8;
	}

	@OriginalMember(owner = "mudclient!a/e", name = "a", descriptor = "(I[I)I")
	public final int g1spooky(@OriginalArg(0) int encrypted, @OriginalArg(1) int[] friendLookup) {
		@Pc(6) int opcode = encrypted - this.decodeKey & 0xFF;

		@Pc(10) int friend = friendLookup[opcode];
		this.readThreatIndex = (this.readThreatIndex + friend) % THREAT_LEN;

		@Pc(23) char threatChar = THREAT.charAt(this.readThreatIndex);
		this.decodeKey = this.decodeKey * 3 + threatChar + friend & 0xFFFF;
		return opcode;
	}

	@OriginalMember(owner = "mudclient!a/e", name = "g", descriptor = "()V")
	public final void encryptPacket() {
		@Pc(11) int opcode = this.data[this.start + 2] & 0xFF;
		this.data[this.start + 2] = (byte) (opcode + this.encodeKey);

		@Pc(26) int friend = this.writeThreatFriend;
		this.writeThreatIndex = (this.writeThreatIndex + friend) % THREAT_LEN;

		@Pc(39) char threatChar = THREAT.charAt(this.writeThreatIndex);
		this.encodeKey = this.encodeKey * 3 + threatChar + friend & 0xFFFF;

		if (this.packetAlignment != 8) {
			this.pos++;
		}

		@Pc(69) int length = this.pos - this.start - 2;
		if (length >= 160) {
			this.data[this.start] = (byte) ((length >> 8) + 160);
			this.data[this.start + 1] = (byte) (length & 0xFF);
		} else {
			this.data[this.start] = (byte) length;
			this.pos--;
			this.data[this.start + 1] = this.data[this.pos];
		}

		if (this.maxPacketLength <= 10000) {
			@Pc(135) int i = this.data[this.start + 2] & 0xFF;
			OVERALL_PACKET_COUNTER[i]++;
			overallPacketSizes[i] += this.pos - this.start;
		}

		this.start = this.pos;
	}

	@OriginalMember(owner = "mudclient!a/e", name = "h", descriptor = "()V")
	public final void flush() throws IOException {
		this.encryptPacket();
		this.writePacket(0);
	}

	@OriginalMember(owner = "mudclient!a/e", name = "d", descriptor = "(I)V")
	public final void writePacket(@OriginalArg(0) int retries) throws IOException {
		if (this.ioError) {
			this.start = 0;
			this.pos = 3;
			this.ioError = false;
			throw new IOException(this.ioException);
		}

		this.writeTries++;

		if (this.writeTries < retries) {
			return;
		}

		if (this.start > 0) {
			this.writeTries = 0;
			this.write(this.data, 0, this.start);
		}

		this.start = 0;
		this.pos = 3;
	}

	@OriginalMember(owner = "mudclient!a/e", name = "i", descriptor = "()Z")
	public final boolean hasPacket() {
		return this.start > 0;
	}
}
