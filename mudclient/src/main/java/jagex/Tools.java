package jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.*;
import java.net.URL;

@OriginalClass("mudclient!a/f")
public final class Tools {

	@OriginalMember(owner = "mudclient!a/f", name = "a", descriptor = "Ljava/net/URL;")
	public static URL remoteAddress = null;

	@OriginalMember(owner = "mudclient!a/f", name = "b", descriptor = "[I")
	private static int[] BITMASK = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "mudclient!a/f", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/InputStream;")
	public static InputStream read(@OriginalArg(0) String name) throws IOException {
		@Pc(9) InputStream stream;
		if (remoteAddress == null) {
			stream = new BufferedInputStream(new FileInputStream(name));
		} else {
			@Pc(17) URL url = new URL(remoteAddress, name);
			stream = url.openStream();
		}
		return stream;
	}

	@OriginalMember(owner = "mudclient!a/f", name = "a", descriptor = "(Ljava/lang/String;[BI)V")
	public static void read(@OriginalArg(0) String name, @OriginalArg(1) byte[] dest, @OriginalArg(2) int bytes) throws IOException {
		@Pc(2) InputStream stream = read(name);
		@Pc(7) DataInputStream dis = new DataInputStream(stream);
		try {
			dis.readFully(dest, 0, bytes);
		} catch (@Pc(14) EOFException ignored) {
		}
		dis.close();
	}

	@OriginalMember(owner = "mudclient!a/f", name = "a", descriptor = "([BII)V")
	public static void p4(@OriginalArg(0) byte[] dest, @OriginalArg(1) int pos, @OriginalArg(2) int value) {
		dest[pos] = (byte) (value >> 24);
		dest[pos + 1] = (byte) (value >> 16);
		dest[pos + 2] = (byte) (value >> 8);
		dest[pos + 3] = (byte) value;
	}

	@OriginalMember(owner = "mudclient!a/f", name = "a", descriptor = "(B)I")
	public static int g1(@OriginalArg(0) byte pos) {
		return pos & 0xFF;
	}

	@OriginalMember(owner = "mudclient!a/f", name = "a", descriptor = "([BI)I")
	public static int g2(@OriginalArg(0) byte[] src, @OriginalArg(1) int pos) {
		return ((src[pos] & 0xFF) << 8) + (src[pos + 1] & 0xFF);
	}

	@OriginalMember(owner = "mudclient!a/f", name = "b", descriptor = "([BI)I")
	public static int g4(@OriginalArg(0) byte[] src, @OriginalArg(1) int pos) {
		return ((src[pos] & 0xFF) << 24) + ((src[pos + 1] & 0xFF) << 16) + ((src[pos + 2] & 0xFF) << 8) + (src[pos + 3] & 0xFF);
	}

	@OriginalMember(owner = "mudclient!a/f", name = "c", descriptor = "([BI)J")
	public static long g8(@OriginalArg(0) byte[] src, @OriginalArg(1) int pos) {
		return (((long) g4(src, pos) & 0xFFFFFFFFL) << 32) + ((long) g4(src, pos + 4) & 0xFFFFFFFFL);
	}

	@OriginalMember(owner = "mudclient!a/f", name = "d", descriptor = "([BI)I")
	public static int g2s(@OriginalArg(0) byte[] src, @OriginalArg(1) int pos) {
		@Pc(13) int value = g1(src[pos]) * 256 + g1(src[pos + 1]);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	// todo: better name?
	@OriginalMember(owner = "mudclient!a/f", name = "e", descriptor = "([BI)I")
	public static int gsmart(@OriginalArg(0) byte[] src, @OriginalArg(1) int pos) {
		return (src[pos] & 0xFF) < 128 ? src[pos] : ((src[pos] & 0xFF) - 128 << 24) + ((src[pos + 1] & 0xFF) << 16) + ((src[pos + 2] & 0xFF) << 8) + (src[pos + 3] & 0xFF);
	}

	@OriginalMember(owner = "mudclient!a/f", name = "b", descriptor = "([BII)I")
	public static int gBit(@OriginalArg(0) byte[] src, @OriginalArg(1) int bitPos, @OriginalArg(2) int n) {
		@Pc(5) int pos = bitPos >> 3;
		@Pc(11) int remainder = 8 - (bitPos & 0x7);
		@Pc(13) int value = 0;

		while (n > remainder) {
			value += (src[pos++] & BITMASK[remainder]) << n - remainder;
			n -= remainder;
			remainder = 8;
		}

		if (n == remainder) {
			value += src[pos] & BITMASK[remainder];
		} else {
			value += src[pos] >> remainder - n & BITMASK[n];
		}

		return value;
	}

	// todo: better name?
	@OriginalMember(owner = "mudclient!a/f", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String formatAuthString(@OriginalArg(0) String input, @OriginalArg(1) int maxLength) {
		@Pc(3) String str = "";

		for (@Pc(5) int i = 0; i < maxLength; i++) {
			if (i >= input.length()) {
				str = str + " ";
			} else {
				@Pc(26) char c = input.charAt(i);
				if (c >= 'a' && c <= 'z') {
					str = str + c;
				} else if (c >= 'A' && c <= 'Z') {
					str = str + c;
				} else if (c >= '0' && c <= '9') {
					str = str + c;
				} else {
					str = str + '_';
				}
			}
		}

		return str;
	}

	// todo: better name?
	@OriginalMember(owner = "mudclient!a/f", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String formatAlphaOnly(@OriginalArg(0) String input, @OriginalArg(1) int maxLength) {
		@Pc(2) String lower = input.toLowerCase();
		@Pc(4) String str = "";

		for (@Pc(6) int i = 0; i < lower.length() && i < maxLength; i++) {
			@Pc(12) char c = lower.charAt(i);
			if (c >= 'a' && c <= 'z') {
				str = str + c;
			}
			if (c >= '0' && c <= '9') {
				str = str + c;
			}
		}

		return str;
	}

	@OriginalMember(owner = "mudclient!a/f", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String formatIPv4(@OriginalArg(0) int address) {
		return (address >> 24 & 0xFF) + "." + (address >> 16 & 0xFF) + "." + (address >> 8 & 0xFF) + "." + (address & 0xFF);
	}

	@OriginalMember(owner = "mudclient!a/f", name = "b", descriptor = "(Ljava/lang/String;)J")
	public static long toBase37(@OriginalArg(0) String input) {
		@Pc(3) String str = "";

		for (@Pc(5) int i = 0; i < input.length(); i++) {
			@Pc(11) char c = input.charAt(i);
			if (c >= 'a' && c <= 'z') {
				str = str + c;
			} else if (c >= 'A' && c <= 'Z') {
				str = str + (char) (c + 'a' - 65);
			} else if (c >= '0' && c <= '9') {
				str = str + c;
			} else {
				str = str + ' ';
			}
		}

		str = str.trim();
		if (str.length() > 12) {
			str = str.substring(0, 12);
		}

		@Pc(95) long hash = 0L;
		for (@Pc(97) int i = 0; i < str.length(); i++) {
			@Pc(103) char c = str.charAt(i);
			hash *= 37L;

			if (c >= 'a' && c <= 'z') {
				hash += c + 1 - 97;
			} else if (c >= '0' && c <= '9') {
				hash += c + 27 - 48;
			}
		}

		return hash;
	}

	@OriginalMember(owner = "mudclient!a/f", name = "a", descriptor = "(J)Ljava/lang/String;")
	public static String fromBase37(@OriginalArg(0) long input) {
		if (input < 0L) {
			return "invalid_name";
		}

		@Pc(9) String str = "";
		while (input != 0L) {
			@Pc(16) int value = (int) (input % 37L);
			input /= 37L;

			if (value == 0) {
				str = " " + str;
			} else if (value >= 27) {
				str = (char) (value + 48 - 27) + str;
			} else if (input % 37L == 0L) {
				str = (char) (value + 65 - 1) + str;
			} else {
				str = (char) (value + 97 - 1) + str;
			}
		}

		return str;
	}

	@OriginalMember(owner = "mudclient!a/f", name = "a", descriptor = "(Ljava/lang/String;[B)I")
	public static int getJagOffset(@OriginalArg(0) String name, @OriginalArg(1) byte[] src) {
		@Pc(5) int count = g2(src, 0);

		@Pc(7) int hash = 0;
		@Pc(10) String upper = name.toUpperCase();
		for (@Pc(12) int i = 0; i < upper.length(); i++) {
			hash = hash * 61 + upper.charAt(i) - 32;
		}

		@Pc(35) int offset = count * 10 + 2;
		for (@Pc(37) int i = 0; i < count; i++) {
			@Pc(85) int fileHash = (src[i * 10 + 2] & 0xFF) * 16777216 + ((src[i * 10 + 3] & 0xFF) << 16) + ((src[i * 10 + 4] & 0xFF) << 8) + (src[i * 10 + 5] & 0xFF);
			@Pc(119) int filePackedSize = (src[i * 10 + 9] & 0xFF) * 65536 + ((src[i * 10 + 10] & 0xFF) << 8) + (src[i * 10 + 11] & 0xFF);

			if (fileHash == hash) {
				return offset;
			}

			offset += filePackedSize;
		}

		return 0;
	}

	@OriginalMember(owner = "mudclient!a/f", name = "b", descriptor = "(Ljava/lang/String;[B)I")
	public static int getJagSize(@OriginalArg(0) String name, @OriginalArg(1) byte[] src) {
		@Pc(5) int count = g2(src, 0);

		@Pc(7) int hash = 0;
		@Pc(10) String upper = name.toUpperCase();
		for (@Pc(12) int i = 0; i < upper.length(); i++) {
			hash = hash * 61 + upper.charAt(i) - 32;
		}

		@Pc(35) int offset = count * 10 + 2;
		for (@Pc(37) int i = 0; i < count; i++) {
			@Pc(85) int fileHash = ((src[i * 10 + 2] & 0xFF) << 24) + ((src[i * 10 + 3] & 0xFF) << 16) + ((src[i * 10 + 4] & 0xFF) << 8) + (src[i * 10 + 5] & 0xFF);
			@Pc(119) int fileUnpackedSize = ((src[i * 10 + 6] & 0xFF) << 16) + ((src[i * 10 + 7] & 0xFF) << 8) + (src[i * 10 + 8] & 0xFF);
			@Pc(153) int filePackedSize = ((src[i * 10 + 9] & 0xFF) << 16) + ((src[i * 10 + 10] & 0xFF) << 8) + (src[i * 10 + 11] & 0xFF);

			if (fileHash == hash) {
				return fileUnpackedSize;
			}

			offset += filePackedSize;
		}

		return 0;
	}

	@OriginalMember(owner = "mudclient!a/f", name = "a", descriptor = "(Ljava/lang/String;I[B)[B")
	public static byte[] readJag(@OriginalArg(0) String name, @OriginalArg(1) int extraSpace, @OriginalArg(2) byte[] src) {
		return readJag(name, extraSpace, src, null);
	}

	@OriginalMember(owner = "mudclient!a/f", name = "a", descriptor = "(Ljava/lang/String;I[B[B)[B")
	private static byte[] readJag(@OriginalArg(0) String name, @OriginalArg(1) int extraSpace, @OriginalArg(2) byte[] src, @OriginalArg(3) byte[] dest) {
		@Pc(15) int count = ((src[0] & 0xFF) << 8) + (src[1] & 0xFF);

		@Pc(17) int hash = 0;
		@Pc(20) String upper = name.toUpperCase();
		for (@Pc(22) int i = 0; i < upper.length(); i++) {
			hash = hash * 61 + upper.charAt(i) - 32;
		}

		@Pc(45) int offset = count * 10 + 2;
		for (@Pc(47) int i = 0; i < count; i++) {
			@Pc(95) int fileHash = ((src[i * 10 + 2] & 0xFF) << 24) + ((src[i * 10 + 3] & 0xFF) << 16) + ((src[i * 10 + 4] & 0xFF) << 8) + (src[i * 10 + 5] & 0xFF);
			@Pc(129) int fileUnpackedSize = ((src[i * 10 + 6] & 0xFF) << 16) + ((src[i * 10 + 7] & 0xFF) << 8) + (src[i * 10 + 8] & 0xFF);
			@Pc(163) int filePackedSize = ((src[i * 10 + 9] & 0xFF) << 16) + ((src[i * 10 + 10] & 0xFF) << 8) + (src[i * 10 + 11] & 0xFF);

			if (fileHash == hash) {
				if (dest == null) {
					dest = new byte[fileUnpackedSize + extraSpace];
				}

				if (fileUnpackedSize == filePackedSize) {
					for (@Pc(187) int j = 0; j < fileUnpackedSize; j++) {
						dest[j] = src[offset + j];
					}
				} else {
					BZip2.decompress(dest, fileUnpackedSize, src, filePackedSize, offset);
				}

				return dest;
			}

			offset += filePackedSize;
		}

		return null;
	}
}
