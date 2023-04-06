package jagex.client;

import java.awt.*;

// was: a.a.c
public class viewbox extends Frame {

    public viewbox(gameshell gameshell, int i, int j, String s, boolean flag, boolean flag1) {
        anInt47 = 28;
        anInt44 = i;
        anInt45 = j;
        anGameshell_48 = gameshell;
        if (flag1)
            anInt47 = 48;
        else
            anInt47 = 28;
        setTitle(s);
        setResizable(flag);
        show();
        toFront();
        resize(anInt44, anInt45);
        aGraphics49 = getGraphics();
    }

    public Graphics getGraphics() {
        Graphics g = super.getGraphics();
        if (anInt46 == 0)
            g.translate(0, 24);
        else
            g.translate(-5, 0);
        return g;
    }

    public void resize(int i, int j) {
        super.resize(i, j + anInt47);
    }

    public boolean handleEvent(Event event) {
        if (event.id == 401)
            anGameshell_48.keyDown(event, event.key);
        else if (event.id == 402)
            anGameshell_48.keyUp(event, event.key);
        else if (event.id == 501)
            anGameshell_48.mouseDown(event, event.x, event.y - 24);
        else if (event.id == 506)
            anGameshell_48.mouseDrag(event, event.x, event.y - 24);
        else if (event.id == 502)
            anGameshell_48.mouseUp(event, event.x, event.y - 24);
        else if (event.id == 503)
            anGameshell_48.mouseMove(event, event.x, event.y - 24);
        else if (event.id == 201)
            anGameshell_48.destroy();
        else if (event.id == 1001)
            anGameshell_48.action(event, event.target);
        else if (event.id == 403)
            anGameshell_48.keyDown(event, event.key);
        else if (event.id == 404)
            anGameshell_48.keyUp(event, event.key);
        return true;
    }

    public void paint(Graphics g) {
        anGameshell_48.paint(g);
    }

    public int anInt44;
    public int anInt45;
    public int anInt46;
    public int anInt47;
    public gameshell anGameshell_48;
    public Graphics aGraphics49;
}
