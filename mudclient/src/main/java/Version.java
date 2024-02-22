import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mudclient!e")
public final class Version {

	@OriginalMember(owner = "mudclient!e", name = "a", descriptor = "I")
	private static int SERVER = 177;

	@OriginalMember(owner = "mudclient!e", name = "b", descriptor = "I")
	public static int CLIENT = 177;

	@OriginalMember(owner = "mudclient!e", name = "c", descriptor = "I")
	public static int CONFIG = 85;

	@OriginalMember(owner = "mudclient!e", name = "d", descriptor = "I")
	public static int MAPS = 63;

	@OriginalMember(owner = "mudclient!e", name = "e", descriptor = "I")
	public static int MEDIA = 58;

	@OriginalMember(owner = "mudclient!e", name = "f", descriptor = "I")
	public static int MODELS = 36;

	@OriginalMember(owner = "mudclient!e", name = "g", descriptor = "I")
	public static int TEXTURES = 17;

	@OriginalMember(owner = "mudclient!e", name = "h", descriptor = "I")
	public static int ENTITY = 24;

	@OriginalMember(owner = "mudclient!e", name = "i", descriptor = "I")
	public static int SOUNDS = 1;

	@OriginalMember(owner = "mudclient!e", name = "j", descriptor = "I")
	public static int FILTER = 2;
}
