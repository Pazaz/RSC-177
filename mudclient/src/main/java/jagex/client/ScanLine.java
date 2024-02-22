package jagex.client;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mudclient!a/a/i")
public final class ScanLine {

	@OriginalMember(owner = "mudclient!a/a/i", name = "a", descriptor = "I")
	public int startCol;

	@OriginalMember(owner = "mudclient!a/a/i", name = "b", descriptor = "I")
	public int endCol;

	@OriginalMember(owner = "mudclient!a/a/i", name = "c", descriptor = "I")
	public int startRow;

	@OriginalMember(owner = "mudclient!a/a/i", name = "d", descriptor = "I")
	public int endRow;
}
