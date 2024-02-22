package jagex.client;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

@OriginalClass("mudclient!a/a/c")
public final class ViewBox extends Frame {

	@OriginalMember(owner = "mudclient!a/a/c", name = "c", descriptor = "I")
	private int anInt49;

	@OriginalMember(owner = "mudclient!a/a/c", name = "d", descriptor = "I")
	private int anInt50 = 28;

	@OriginalMember(owner = "mudclient!a/a/c", name = "a", descriptor = "I")
	private int anInt47;

	@OriginalMember(owner = "mudclient!a/a/c", name = "b", descriptor = "I")
	private int anInt48;

	@OriginalMember(owner = "mudclient!a/a/c", name = "e", descriptor = "Lmudclient!a/a/a;")
	private GameShell aGameShell;

	@OriginalMember(owner = "mudclient!a/a/c", name = "f", descriptor = "Ljava/awt/Graphics;")
	private Graphics aGraphics3;

	@OriginalMember(owner = "mudclient!a/a/c", name = "<init>", descriptor = "(Lmudclient!a/a/a;IILjava/lang/String;ZZ)V")
	public ViewBox(@OriginalArg(0) GameShell arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		this.anInt47 = arg1;
		this.anInt48 = arg2;
		this.aGameShell = arg0;
		if (arg5) {
			this.anInt50 = 48;
		} else {
			this.anInt50 = 28;
		}
		this.setTitle(arg3);
		this.setResizable(arg4);
		this.show();
		this.toFront();
		this.resize(this.anInt47, this.anInt48);
		this.aGraphics3 = this.getGraphics();
	}

	@OriginalMember(owner = "mudclient!a/a/c", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
	@Override
	public Graphics getGraphics() {
		@Pc(2) Graphics local2 = super.getGraphics();
		if (this.anInt49 == 0) {
			local2.translate(0, 24);
		} else {
			local2.translate(-5, 0);
		}
		return local2;
	}

	@OriginalMember(owner = "mudclient!a/a/c", name = "resize", descriptor = "(II)V")
	@Override
	public void resize(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.resize(arg0, arg1 + this.anInt50);
	}

	@OriginalMember(owner = "mudclient!a/a/c", name = "handleEvent", descriptor = "(Ljava/awt/Event;)Z")
	@Override
	public boolean handleEvent(@OriginalArg(0) Event arg0) {
		if (arg0.id == 401) {
			this.aGameShell.keyDown(arg0, arg0.key);
		} else if (arg0.id == 402) {
			this.aGameShell.keyUp(arg0, arg0.key);
		} else if (arg0.id == 501) {
			this.aGameShell.mouseDown(arg0, arg0.x, arg0.y - 24);
		} else if (arg0.id == 506) {
			this.aGameShell.mouseDrag(arg0, arg0.x, arg0.y - 24);
		} else if (arg0.id == 502) {
			this.aGameShell.mouseUp(arg0, arg0.x, arg0.y - 24);
		} else if (arg0.id == 503) {
			this.aGameShell.mouseMove(arg0, arg0.x, arg0.y - 24);
		} else if (arg0.id == 201) {
			this.aGameShell.destroy();
		} else if (arg0.id == 1001) {
			this.aGameShell.action(arg0, arg0.target);
		} else if (arg0.id == 403) {
			this.aGameShell.keyDown(arg0, arg0.key);
		} else if (arg0.id == 404) {
			this.aGameShell.keyUp(arg0, arg0.key);
		}
		return true;
	}

	@OriginalMember(owner = "mudclient!a/a/c", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		this.aGameShell.paint(arg0);
	}
}
