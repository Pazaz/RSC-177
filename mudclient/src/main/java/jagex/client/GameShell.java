package jagex.client;

import jagex.BZip2;
import jagex.Tools;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.applet.Applet;
import java.awt.*;
import java.awt.image.IndexColorModel;
import java.awt.image.MemoryImageSource;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@OriginalClass("mudclient!a/a/a")
public class GameShell extends Applet implements Runnable {

	@OriginalMember(owner = "mudclient!a/a/a", name = "g", descriptor = "Lmudclient!a/a/c;")
	protected static ViewBox viewbox = null;

	@OriginalMember(owner = "mudclient!a/a/a", name = "w", descriptor = "Ljava/lang/String;")
	private static String CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "mudclient!a/a/a", name = "c", descriptor = "Ljava/lang/Thread;")
	private Thread thread;

	@OriginalMember(owner = "mudclient!a/a/a", name = "h", descriptor = "Z")
	private boolean appletMode;

	@OriginalMember(owner = "mudclient!a/a/a", name = "i", descriptor = "I")
	private int state;

	@OriginalMember(owner = "mudclient!a/a/a", name = "j", descriptor = "I")
	private int drawCount;

	@OriginalMember(owner = "mudclient!a/a/a", name = "k", descriptor = "I")
	protected int insetY;

	@OriginalMember(owner = "mudclient!a/a/a", name = "l", descriptor = "I")
	protected int idleCycles;

	@OriginalMember(owner = "mudclient!a/a/a", name = "n", descriptor = "Ljava/lang/String;")
	private String noLogoTitle;

	@OriginalMember(owner = "mudclient!a/a/a", name = "p", descriptor = "I")
	private int progress;

	@OriginalMember(owner = "mudclient!a/a/a", name = "u", descriptor = "Ljava/awt/Image;")
	private Image logo;

	@OriginalMember(owner = "mudclient!a/a/a", name = "v", descriptor = "Ljava/awt/Graphics;")
	private Graphics graphics;

	@OriginalMember(owner = "mudclient!a/a/a", name = "G", descriptor = "I")
	protected int mouseX;

	@OriginalMember(owner = "mudclient!a/a/a", name = "H", descriptor = "I")
	protected int mouseY;

	@OriginalMember(owner = "mudclient!a/a/a", name = "I", descriptor = "I")
	protected int mouseButton;

	@OriginalMember(owner = "mudclient!a/a/a", name = "J", descriptor = "I")
	protected int mouseClickButton;

	@OriginalMember(owner = "mudclient!a/a/a", name = "K", descriptor = "I")
	private int activeKeyHeld;

	@OriginalMember(owner = "mudclient!a/a/a", name = "L", descriptor = "I")
	protected int keyHeld;

	@OriginalMember(owner = "mudclient!a/a/a", name = "a", descriptor = "I")
	private int shellWidth = 512;

	@OriginalMember(owner = "mudclient!a/a/a", name = "b", descriptor = "I")
	private int shellHeight = 384;

	@OriginalMember(owner = "mudclient!a/a/a", name = "d", descriptor = "I")
	private int deltime = 20;

	@OriginalMember(owner = "mudclient!a/a/a", name = "e", descriptor = "I")
	private int anInt346 = 1000;

	@OriginalMember(owner = "mudclient!a/a/a", name = "f", descriptor = "[J")
	private long[] otim = new long[10];

	@OriginalMember(owner = "mudclient!a/a/a", name = "m", descriptor = "I")
	private int loadState = 1;

	@OriginalMember(owner = "mudclient!a/a/a", name = "o", descriptor = "Z")
	private boolean noLogo = false;

	@OriginalMember(owner = "mudclient!a/a/a", name = "q", descriptor = "Ljava/lang/String;")
	private String progressStr = "Loading";

	@OriginalMember(owner = "mudclient!a/a/a", name = "r", descriptor = "Ljava/awt/Font;")
	private Font timesRoman15 = new Font("TimesRoman", Font.PLAIN, 15);

	@OriginalMember(owner = "mudclient!a/a/a", name = "s", descriptor = "Ljava/awt/Font;")
	private Font helvetica13 = new Font("Helvetica", Font.BOLD, 13);

	@OriginalMember(owner = "mudclient!a/a/a", name = "t", descriptor = "Ljava/awt/Font;")
	private Font helvetica12 = new Font("Helvetica", Font.PLAIN, 12);

	@OriginalMember(owner = "mudclient!a/a/a", name = "x", descriptor = "Z")
	private boolean keyCurlyBraceLeft = false;

	@OriginalMember(owner = "mudclient!a/a/a", name = "y", descriptor = "Z")
	private boolean keyCurlyBraceRight = false;

	@OriginalMember(owner = "mudclient!a/a/a", name = "z", descriptor = "Z")
	protected boolean keyArrowLeft = false;

	@OriginalMember(owner = "mudclient!a/a/a", name = "A", descriptor = "Z")
	protected boolean keyArrowRight = false;

	@OriginalMember(owner = "mudclient!a/a/a", name = "B", descriptor = "Z")
	private boolean keyArrowUp = false;

	@OriginalMember(owner = "mudclient!a/a/a", name = "C", descriptor = "Z")
	private boolean keyArrowDown = false;

	@OriginalMember(owner = "mudclient!a/a/a", name = "D", descriptor = "Z")
	private boolean keySpace = false;

	@OriginalMember(owner = "mudclient!a/a/a", name = "E", descriptor = "Z")
	private boolean keyN = false;

	@OriginalMember(owner = "mudclient!a/a/a", name = "F", descriptor = "I")
	protected int mindel = 1;

	@OriginalMember(owner = "mudclient!a/a/a", name = "M", descriptor = "Z")
	protected boolean lowDetailMode = false;

	@OriginalMember(owner = "mudclient!a/a/a", name = "N", descriptor = "Ljava/lang/String;")
	protected String aString25 = "";

	@OriginalMember(owner = "mudclient!a/a/a", name = "O", descriptor = "Ljava/lang/String;")
	protected String aString26 = "";

	@OriginalMember(owner = "mudclient!a/a/a", name = "P", descriptor = "Ljava/lang/String;")
	protected String aString27 = "";

	@OriginalMember(owner = "mudclient!a/a/a", name = "Q", descriptor = "Ljava/lang/String;")
	protected String aString28 = "";

	@OriginalMember(owner = "mudclient!a/a/a", name = "a", descriptor = "()V")
	protected void load() {
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "b", descriptor = "()V")
	protected synchronized void update() {
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "c", descriptor = "()V")
	protected void unload() {
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "d", descriptor = "()V")
	protected synchronized void draw() {
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "e", descriptor = "()V")
	protected final void method451() {
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "a", descriptor = "(IILjava/lang/String;Z)V")
	protected final void initApplication(@OriginalArg(0) int width, @OriginalArg(1) int height, @OriginalArg(2) String title, @OriginalArg(3) boolean resizable) {
		this.appletMode = false;
		System.out.println("Started application");
		this.shellWidth = width;
		this.shellHeight = height;
		viewbox = new ViewBox(this, width, height, title, resizable, false);
		this.loadState = 1;
		this.thread = new Thread(this);
		this.thread.start();
		this.thread.setPriority(1);
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "f", descriptor = "()Z")
	protected final boolean isApplet() {
		return this.appletMode;
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "a", descriptor = "(I)V")
	protected final void setFramerate(@OriginalArg(0) int fps) {
		this.deltime = 1000 / fps;
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "g", descriptor = "()V")
	protected final void reset() {
		for (@Pc(1) int i = 0; i < 10; i++) {
			this.otim[i] = 0L;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "keyDown", descriptor = "(Ljava/awt/Event;I)Z")
	@Override
	public final synchronized boolean keyDown(@OriginalArg(0) Event e, @OriginalArg(1) int code) {
		this.onKeyPress(code);
		this.activeKeyHeld = code;
		this.keyHeld = code;
		this.idleCycles = 0;

		if (code == 1006) {
			this.keyArrowLeft = true;
		} else if (code == 1007) {
			this.keyArrowRight = true;
		} else if (code == 1004) {
			this.keyArrowUp = true;
		} else if (code == 1005) {
			this.keyArrowDown = true;
		} else if ((char) code == ' ') {
			this.keySpace = true;
		} else if ((char) code == 'n' || (char) code == 'm') {
			this.keyN = true;
		} else if ((char) code == 'N' || (char) code == 'M') {
			this.keyN = true;
		} else if ((char) code == '{') {
			this.keyCurlyBraceLeft = true;
		} else if ((char) code == '}') {
			this.keyCurlyBraceRight = true;
		} else if (code == 1008) {
			this.lowDetailMode = !this.lowDetailMode;
		}

		@Pc(94) boolean valid = false;
		for (@Pc(96) int i = 0; i < CHARSET.length(); i++) {
			if (code == CHARSET.charAt(i)) {
				valid = true;
				break;
			}
		}

		if (valid && this.aString25.length() < 20) {
			this.aString25 = this.aString25 + (char) code;
		}

		if (valid && this.aString27.length() < 80) {
			this.aString27 = this.aString27 + (char) code;
		}

		if (code == 8 && this.aString25.length() > 0) {
			this.aString25 = this.aString25.substring(0, this.aString25.length() - 1);
		}

		if (code == 8 && this.aString27.length() > 0) {
			this.aString27 = this.aString27.substring(0, this.aString27.length() - 1);
		}

		if (code == 10 || code == 13) {
			this.aString26 = this.aString25;
			this.aString28 = this.aString27;
		}

		return true;
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "b", descriptor = "(I)V")
	protected void onKeyPress(@OriginalArg(0) int code) {
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "keyUp", descriptor = "(Ljava/awt/Event;I)Z")
	@Override
	public final synchronized boolean keyUp(@OriginalArg(0) Event e, @OriginalArg(1) int code) {
		this.activeKeyHeld = 0;

		if (code == 1006) {
			this.keyArrowLeft = false;
		} else if (code == 1007) {
			this.keyArrowRight = false;
		} else if (code == 1004) {
			this.keyArrowUp = false;
		} else if (code == 1005) {
			this.keyArrowDown = false;
		} else if ((char) code == ' ') {
			this.keySpace = false;
		} else if ((char) code == 'n' || (char) code == 'm') {
			this.keyN = false;
		} else if ((char) code == 'N' || (char) code == 'M') {
			this.keyN = false;
		} else if ((char) code == '{') {
			this.keyCurlyBraceLeft = false;
		} else if ((char) code == '}') {
			this.keyCurlyBraceRight = false;
		}

		return true;
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "mouseMove", descriptor = "(Ljava/awt/Event;II)Z")
	@Override
	public final synchronized boolean mouseMove(@OriginalArg(0) Event e, @OriginalArg(1) int x, @OriginalArg(2) int y) {
		this.mouseX = x;
		this.mouseY = y + this.insetY;
		this.mouseButton = 0;
		this.idleCycles = 0;
		return true;
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "mouseUp", descriptor = "(Ljava/awt/Event;II)Z")
	@Override
	public final synchronized boolean mouseUp(@OriginalArg(0) Event arg0, @OriginalArg(1) int x, @OriginalArg(2) int y) {
		this.mouseX = x;
		this.mouseY = y + this.insetY;
		this.mouseButton = 0;
		return true;
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "mouseDown", descriptor = "(Ljava/awt/Event;II)Z")
	@Override
	public final synchronized boolean mouseDown(@OriginalArg(0) Event e, @OriginalArg(1) int x, @OriginalArg(2) int y) {
		this.mouseX = x;
		this.mouseY = y + this.insetY;
		if (e.metaDown()) {
			this.mouseButton = 2;
		} else {
			this.mouseButton = 1;
		}
		this.mouseClickButton = this.mouseButton;
		this.idleCycles = 0;
		this.onMouseClick(this.mouseButton, x, y);
		return true;
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "a", descriptor = "(III)V")
	protected void onMouseClick(@OriginalArg(0) int button, @OriginalArg(1) int x, @OriginalArg(2) int y) {
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "mouseDrag", descriptor = "(Ljava/awt/Event;II)Z")
	@Override
	public final synchronized boolean mouseDrag(@OriginalArg(0) Event e, @OriginalArg(1) int x, @OriginalArg(2) int y) {
		this.mouseX = x;
		this.mouseY = y + this.insetY;
		if (e.metaDown()) {
			this.mouseButton = 2;
		} else {
			this.mouseButton = 1;
		}
		return true;
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "init", descriptor = "()V")
	@Override
	public final void init() {
		this.appletMode = true;
		System.out.println("Started applet");
		this.shellWidth = 512;
		this.shellHeight = 344;
		this.loadState = 1;
		Tools.remoteAddress = this.getCodeBase();
		this.startThread(this);
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (this.state >= 0) {
			this.state = 0;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (this.state >= 0) {
			this.state = 4000 / this.deltime;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		this.state = -1;

		try {
			Thread.sleep(5000L);
		} catch (@Pc(6) Exception ignored) {
		}

		if (this.state != -1) {
			return;
		}

		System.out.println("5 seconds expired, forcing kill");
		this.shutdown();

		if (this.thread != null) {
			this.thread.stop();
			this.thread = null;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "h", descriptor = "()V")
	private void shutdown() {
		this.state = -2;
		System.out.println("Closing program");
		this.unload();

		try {
			Thread.sleep(1000L);
		} catch (@Pc(11) Exception ignored) {
		}

		if (viewbox != null) {
			viewbox.dispose();
		}

		if (!this.appletMode) {
			System.exit(0);
		}
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		if (this.loadState == 1) {
			this.loadState = 2;
			this.graphics = this.getGraphics();
			this.loadJagex();
			this.drawInitialProgress(0, "Loading...");
			this.load();
			this.loadState = 0;
		}

		@Pc(25) int opos = 0;
		@Pc(27) int ratio = 256;
		@Pc(29) int delta = 1;
		@Pc(31) int count = 0;

		for (@Pc(33) int i = 0; i < 10; i++) {
			this.otim[i] = System.currentTimeMillis();
		}

		@Pc(46) long last = System.currentTimeMillis();
		while (this.state >= 0) {
			if (this.state > 0) {
				this.state--;

				if (this.state == 0) {
					this.shutdown();
					this.thread = null;
					return;
				}
			}

			@Pc(68) int lastRatio = ratio;
			@Pc(70) int lastDelta = delta;
			ratio = 300;
			delta = 1;
			last = System.currentTimeMillis();

			if (this.otim[opos] == 0L) {
				ratio = lastRatio;
				delta = lastDelta;
			} else if (last > this.otim[opos]) {
				ratio = (int) ((this.deltime * 2560L) / (last - this.otim[opos]));
			}

			if (ratio < 25) {
				ratio = 25;
			}

			if (ratio > 256) {
				ratio = 256;
				delta = (int) ((long) this.deltime - (last - this.otim[opos]) / 10L);

				if (delta < this.mindel) {
					delta = this.mindel;
				}
			}

			try {
				Thread.sleep(delta);
			} catch (@Pc(146) InterruptedException ignored) {
			}

			this.otim[opos] = last;
			opos = (opos + 1) % 10;

			if (delta > 1) {
				for (int i = 0; i < 10; i++) {
					if (this.otim[i] != 0L) {
						this.otim[i] += delta;
					}
				}
			}

			int i = 0;
			while (count < 256) {
				this.update();
				count += ratio;

				i++;
				if (i > this.anInt346) {
					count = 0;

					this.drawCount += 6;
					if (this.drawCount > 25) {
						this.drawCount = 0;
						this.lowDetailMode = true;
					}

					break;
				}
			}

			this.drawCount--;
			count &= 0xFF;

			this.draw();
		}

		if (this.state == -1) {
			this.shutdown();
		}

		this.thread = null;
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics g) {
		this.paint(g);
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics g) {
		if (this.loadState == 2 && this.logo != null) {
			this.drawInitialProgress(this.progress, this.progressStr);
		} else if (this.loadState == 0) {
			this.method451();
		}
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "i", descriptor = "()V")
	private void loadJagex() {
		this.graphics.setColor(Color.black);
		this.graphics.fillRect(0, 0, this.shellWidth, this.shellHeight);
		@Pc(18) byte[] local18 = this.loadJag("jagex.jag", "Jagex library", 0);
		if (local18 == null) {
			return;
		}
		@Pc(26) byte[] local26 = Tools.readJag("logo.tga", 0, local18);
		this.logo = this.createImage(local26);
		PixMap.method404(Tools.readJag("h11p.jf", 0, local18));
		PixMap.method404(Tools.readJag("h12b.jf", 0, local18));
		PixMap.method404(Tools.readJag("h12p.jf", 0, local18));
		PixMap.method404(Tools.readJag("h13b.jf", 0, local18));
		PixMap.method404(Tools.readJag("h14b.jf", 0, local18));
		PixMap.method404(Tools.readJag("h16b.jf", 0, local18));
		PixMap.method404(Tools.readJag("h20b.jf", 0, local18));
		PixMap.method404(Tools.readJag("h24b.jf", 0, local18));
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void drawInitialProgress(@OriginalArg(0) int progress, @OriginalArg(1) String str) {
		try {
			@Pc(6) int x = (this.shellWidth - 281) / 2;
			@Pc(13) int y = (this.shellHeight - 148) / 2;
			this.graphics.setColor(Color.black);
			this.graphics.fillRect(0, 0, this.shellWidth, this.shellHeight);
			if (!this.noLogo) {
				this.graphics.drawImage(this.logo, x, y, this);
			}

			x += 2;
			y += 90;
			this.progress = progress;
			this.progressStr = str;

			this.graphics.setColor(new Color(132, 132, 132));
			if (this.noLogo) {
				this.graphics.setColor(new Color(220, 0, 0));
			}
			this.graphics.drawRect(x - 2, y - 2, 280, 23);
			this.graphics.fillRect(x, y, progress * 277 / 100, 20);
			this.graphics.setColor(new Color(198, 198, 198));
			if (this.noLogo) {
				this.graphics.setColor(new Color(255, 255, 255));
			}

			this.drawString(this.graphics, str, this.timesRoman15, x + 138, y + 10);

			if (this.noLogo) {
				this.graphics.setColor(new Color(132, 132, 152));
				this.drawString(this.graphics, "©2001-2002 Andrew Gower and Jagex Ltd", this.helvetica12, x + 138, this.shellHeight - 20);
			} else {
				this.drawString(this.graphics, "Created by JAGeX - visit www.jagex.com", this.helvetica13, x + 138, y + 30);
				this.drawString(this.graphics, "©2001-2002 Andrew Gower and Jagex Ltd", this.helvetica13, x + 138, y + 44);
			}

			if (this.noLogoTitle != null) {
				this.graphics.setColor(Color.white);
				this.drawString(this.graphics, this.noLogoTitle, this.helvetica13, x + 138, y - 120);
			}
		} catch (@Pc(200) Exception ignored) {
		}
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "b", descriptor = "(ILjava/lang/String;)V")
	protected final void drawProgress(@OriginalArg(0) int progress, @OriginalArg(1) String str) {
		try {
			@Pc(6) int centerX = (this.shellWidth - 281) / 2;
			@Pc(13) int centerY = (this.shellHeight - 148) / 2;

			@Pc(14) int x = centerX + 2;
			@Pc(15) int y = centerY + 90;
			this.progress = progress;
			this.progressStr = str;
			@Pc(27) int progressX = progress * 277 / 100;

			this.graphics.setColor(new Color(132, 132, 132));
			if (this.noLogo) {
				this.graphics.setColor(new Color(220, 0, 0));
			}

			this.graphics.fillRect(x, y, progressX, 20);
			this.graphics.setColor(Color.black);
			this.graphics.fillRect(x + progressX, y, 277 - progressX, 20);
			this.graphics.setColor(new Color(198, 198, 198));

			if (this.noLogo) {
				this.graphics.setColor(new Color(255, 255, 255));
			}

			this.drawString(this.graphics, str, this.timesRoman15, x + 138, y + 10);
		} catch (@Pc(106) Exception ignored) {
		}
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "a", descriptor = "(Ljava/awt/Graphics;Ljava/lang/String;Ljava/awt/Font;II)V")
	protected final void drawString(@OriginalArg(0) Graphics g, @OriginalArg(1) String str, @OriginalArg(2) Font font, @OriginalArg(3) int x, @OriginalArg(4) int y) {
		@Pc(3) Container local3;
		if (viewbox == null) {
			local3 = this;
		} else {
			local3 = viewbox;
		}
		@Pc(11) FontMetrics local11 = local3.getFontMetrics(font);
		local11.stringWidth(str);
		g.setFont(font);
		g.drawString(str, x - local11.stringWidth(str) / 2, y + local11.getHeight() / 4);
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "a", descriptor = "([B)Ljava/awt/Image;")
	private Image createImage(@OriginalArg(0) byte[] arg0) {
		@Pc(11) int local11 = arg0[13] * 256 + arg0[12];
		@Pc(21) int local21 = arg0[15] * 256 + arg0[14];
		@Pc(24) byte[] local24 = new byte[256];
		@Pc(27) byte[] local27 = new byte[256];
		@Pc(30) byte[] local30 = new byte[256];
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			local24[local32] = arg0[local32 * 3 + 20];
			local27[local32] = arg0[local32 * 3 + 19];
			local30[local32] = arg0[local32 * 3 + 18];
		}
		@Pc(77) IndexColorModel local77 = new IndexColorModel(8, 256, local24, local27, local30);
		@Pc(82) byte[] local82 = new byte[local11 * local21];
		@Pc(84) int local84 = 0;
		for (@Pc(88) int local88 = local21 - 1; local88 >= 0; local88--) {
			for (@Pc(92) int local92 = 0; local92 < local11; local92++) {
				local82[local84++] = arg0[local92 + local88 * local11 + 786];
			}
		}
		@Pc(124) MemoryImageSource local124 = new MemoryImageSource(local11, local21, local77, local82, 0, local11);
		return this.createImage(local124);
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	protected byte[] loadJag(@OriginalArg(0) String file, @OriginalArg(1) String displayStr, @OriginalArg(2) int progress) {
		System.out.println("Using default load");

		@Pc(4) int unpackedSize = 0;
		@Pc(6) int packedSize = 0;
		@Pc(8) byte[] data = null;

		try {
			this.drawProgress(progress, "Loading " + displayStr + " - 0%");

			@Pc(23) InputStream in = Tools.read(file);
			@Pc(28) DataInputStream stream = new DataInputStream(in);
			@Pc(31) byte[] src = new byte[6];
			stream.readFully(src, 0, 6);
			unpackedSize = ((src[0] & 0xFF) << 16) + ((src[1] & 0xFF) << 8) + (src[2] & 0xFF);
			packedSize = ((src[3] & 0xFF) << 16) + ((src[4] & 0xFF) << 8) + (src[5] & 0xFF);

			this.drawProgress(progress, "Loading " + displayStr + " - 5%");

			@Pc(94) int offset = 0;
			data = new byte[packedSize];
			while (offset < packedSize) {
				@Pc(103) int remaining = packedSize - offset;
				if (remaining > 1000) {
					remaining = 1000;
				}

				stream.readFully(data, offset, remaining);
				offset += remaining;
				this.drawProgress(progress, "Loading " + displayStr + " - " + (offset * 95 / packedSize + 5) + "%");
			}

			stream.close();
		} catch (@Pc(146) IOException ignored) {
		}

		this.drawProgress(progress, "Unpacking " + displayStr);

		if (packedSize == unpackedSize) {
			return data;
		} else {
			@Pc(162) byte[] uncompressed = new byte[unpackedSize];
			BZip2.decompress(uncompressed, unpackedSize, data, packedSize, 0);
			return uncompressed;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "getGraphics", descriptor = "()Ljava/awt/Graphics;")
	@Override
	public Graphics getGraphics() {
		return viewbox == null ? super.getGraphics() : viewbox.getGraphics();
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "createImage", descriptor = "(II)Ljava/awt/Image;")
	@Override
	public Image createImage(@OriginalArg(0) int width, @OriginalArg(1) int height) {
		return viewbox == null ? super.createImage(width, height) : viewbox.createImage(width, height);
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public URL getCodeBase() {
		return super.getCodeBase();
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public URL getDocumentBase() {
		return super.getDocumentBase();
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String name) {
		return super.getParameter(name);
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/net/Socket;")
	protected Socket openSocket(@OriginalArg(0) String host, @OriginalArg(1) int port) throws IOException {
		@Pc(11) Socket socket;
		if (this.isApplet()) {
			socket = new Socket(InetAddress.getByName(this.getCodeBase().getHost()), port);
		} else {
			socket = new Socket(InetAddress.getByName(host), port);
		}

		socket.setSoTimeout(30000);
		socket.setTcpNoDelay(true);
		return socket;
	}

	@OriginalMember(owner = "mudclient!a/a/a", name = "a", descriptor = "(Ljava/lang/Runnable;)V")
	public void startThread(@OriginalArg(0) Runnable runnable) {
		@Pc(4) Thread thread = new Thread(runnable);
		thread.setDaemon(true);
		thread.start();
	}
}
