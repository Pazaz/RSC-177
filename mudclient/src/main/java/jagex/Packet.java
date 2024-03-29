package jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

import java.util.zip.CRC32;

@OriginalClass("mudclient!a/d")
public final class Packet {

	@OriginalMember(owner = "mudclient!a/d", name = "c", descriptor = "Ljava/util/zip/CRC32;")
	private static CRC32 crc32 = new CRC32();

	@OriginalMember(owner = "mudclient!a/d", name = "d", descriptor = "[I")
	private static final int[] BITMASK = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "mudclient!a/d", name = "a", descriptor = "[B")
	private byte[] data;

	@OriginalMember(owner = "mudclient!a/d", name = "b", descriptor = "I")
	private int pos;

	@OriginalMember(owner = "mudclient!a/d", name = "<init>", descriptor = "()V")
	private Packet() {
	}

	@OriginalMember(owner = "mudclient!a/d", name = "<init>", descriptor = "([B)V")
	public Packet(@OriginalArg(0) byte[] src) {
		this.data = src;
		this.pos = 0;
	}

	@OriginalMember(owner = "mudclient!a/d", name = "a", descriptor = "()I")
	public int g1() {
		return this.data[this.pos++] & 0xFF;
	}

	@OriginalMember(owner = "mudclient!a/d", name = "b", descriptor = "()I")
	public int g2() {
		this.pos += 2;
		return ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
	}

	@OriginalMember(owner = "mudclient!a/d", name = "c", descriptor = "()I")
	public int g4() {
		this.pos += 4;
		return ((this.data[this.pos - 4] & 0xFF) << 24) + ((this.data[this.pos - 3] & 0xFF) << 16) + ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
	}
}
