package jagex.client;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

@OriginalClass("mudclient!a/a/c")
public final class ViewBox extends Frame {

	@OriginalMember(owner = "mudclient!a/a/c", name = "c", descriptor = "I")
	private int OS_INSETS;

	@OriginalMember(owner = "mudclient!a/a/c", name = "d", descriptor = "I")
	private int insetY = 28;

	@OriginalMember(owner = "mudclient!a/a/c", name = "a", descriptor = "I")
	private int frameWidth;

	@OriginalMember(owner = "mudclient!a/a/c", name = "b", descriptor = "I")
	private int frameHeight;

	@OriginalMember(owner = "mudclient!a/a/c", name = "e", descriptor = "Lmudclient!a/a/a;")
	private GameShell shell;

	@OriginalMember(owner = "mudclient!a/a/c", name = "f", descriptor = "Ljava/awt/Graphics;")
	private Graphics graphics;

	@OriginalMember(owner = "mudclient!a/a/c", name = "<init>", descriptor = "(Lmudclient!a/a/a;IILjava/lang/String;ZZ)V")
	public ViewBox(@OriginalArg(0) GameShell shell, @OriginalArg(1) int width, @OriginalArg(2) int height, @OriginalArg(3) String title, @OriginalArg(4) boolean resizable, @OriginalArg(5) boolean doubleInset) {
		this.frameWidth = width;
		this.frameHeight = height;
		this.shell = shell;
		if (doubleInset) {
			this.insetY = 48;
		} else {
			this.insetY = 28;
		}
		this.setTitle(title);
		this.setResizable(resizable);
		this.show();
		this.toFront();
		this.resize(this.frameWidth, this.frameHeight);
		this.graphics = this.getGraphics();
	}

	@OriginalMember(owner = "mudclient!a/a/c", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
	@Override
	public Graphics getGraphics() {
		@Pc(2) Graphics g = super.getGraphics();
		if (this.OS_INSETS == 0) {
			g.translate(0, 24);
		} else {
			g.translate(-5, 0);
		}
		return g;
	}

	@OriginalMember(owner = "mudclient!a/a/c", name = "resize", descriptor = "(II)V")
	@Override
	public void resize(@OriginalArg(0) int width, @OriginalArg(1) int height) {
		super.resize(width, height + this.insetY);
	}

	@OriginalMember(owner = "mudclient!a/a/c", name = "handleEvent", descriptor = "(Ljava/awt/Event;)Z")
	@Override
	public boolean handleEvent(@OriginalArg(0) Event e) {
		if (e.id == 401) {
			this.shell.keyDown(e, e.key);
		} else if (e.id == 402) {
			this.shell.keyUp(e, e.key);
		} else if (e.id == 501) {
			this.shell.mouseDown(e, e.x, e.y - 24);
		} else if (e.id == 506) {
			this.shell.mouseDrag(e, e.x, e.y - 24);
		} else if (e.id == 502) {
			this.shell.mouseUp(e, e.x, e.y - 24);
		} else if (e.id == 503) {
			this.shell.mouseMove(e, e.x, e.y - 24);
		} else if (e.id == 201) {
			this.shell.destroy();
		} else if (e.id == 1001) {
			this.shell.action(e, e.target);
		} else if (e.id == 403) {
			this.shell.keyDown(e, e.key);
		} else if (e.id == 404) {
			this.shell.keyUp(e, e.key);
		}

		return true;
	}

	@OriginalMember(owner = "mudclient!a/a/c", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics g) {
		this.shell.paint(g);
	}
}
