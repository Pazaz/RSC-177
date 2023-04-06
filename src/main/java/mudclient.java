// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.applet.Applet;
import java.awt.*;
import java.io.IOException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.net.*;
import pack1.*;
import pack1.pack2.*;

public class mudclient extends Applet_Sub1_Sub1
{

    public static void main(String args[])
    {
        mudclient mudclient1 = new mudclient();
        mudclient1.aBoolean647 = false;
        if(args.length > 0 && args[0].equals("members"))
            mudclient1.aBoolean641 = true;
        if(args.length > 1)
            mudclient1.aString610 = args[1];
        if(args.length > 2)
            mudclient1.anInt611 = Integer.parseInt(args[2]);
        mudclient1.method6(mudclient1.anInt668, mudclient1.anInt669 + 11, "Runescape by Andrew Gower", false);
        mudclient1.anInt32 = 10;
    }

    public void method1()
    {
        if(aBoolean647)
        {
            String s = getDocumentBase().getHost().toLowerCase();
            if(!s.endsWith("jagex.com") && !s.endsWith("jagex.co.uk") && !s.endsWith("runescape.com") && !s.endsWith("runescape.co.uk") && !s.endsWith("runescape.net") && !s.endsWith("runescape.org") && !s.endsWith("penguin") && !s.endsWith("puffin"))
            {
                aBoolean644 = true;
                return;
            }
        }
        method21(aBigInteger642, aBigInteger643);
        int i = 0;
        for(int j = 0; j < 99; j++)
        {
            int k = j + 1;
            int i1 = (int)((double)k + 300D * Math.pow(2D, (double)k / 7D));
            i += i1;
            anIntArray759[j] = i & 0xffffffc;
        }

        try
        {
            String s1 = getParameter("member");
            int j1 = Integer.parseInt(s1);
            if(j1 == 1)
                aBoolean641 = true;
        }
        catch(Exception _ex) { }
        if(aBoolean647)
            super.anInt611 = 43594;
        super.anInt11 = 0;
        Applet_Sub1_Sub1.anInt609 = 1000;
        Applet_Sub1_Sub1.anInt608 = Class16.anInt556;
        try
        {
            String s2 = getParameter("poff");
            int k1 = Integer.parseInt(s2);
            super.anInt611 += k1;
            System.out.println("Offset: " + k1);
        }
        catch(Exception _ex) { }
        method49();
        if(aBoolean646)
            return;
        anInt671 = 2000;
        anInt672 = anInt671 + 100;
        anInt673 = anInt672 + 50;
        anInt677 = anInt673 + 1000;
        anInt674 = anInt677 + 10;
        anInt675 = anInt674 + 50;
        anInt676 = anInt675 + 10;
        aGraphics663 = getGraphics();
        method8(50);
        aClass3_Sub1_665 = new Class3_Sub1(anInt668, anInt669 + 12, 4000, this);
        aClass3_Sub1_665.aMudclient632 = this;
        aClass3_Sub1_665.method207(0, 0, anInt668, anInt669 + 12);
        Class1.aBoolean93 = false;
        Class1.anInt94 = anInt672;
        aClass1_773 = new Class1(aClass3_Sub1_665, 5);
        int l = ((Class3) (aClass3_Sub1_665)).anInt184 - 199;
        byte byte0 = 36;
        anInt774 = aClass1_773.method158(l, byte0 + 24, 196, 90, 1, 500, true);
        aClass1_777 = new Class1(aClass3_Sub1_665, 5);
        anInt778 = aClass1_777.method158(l, byte0 + 40, 196, 126, 1, 500, true);
        aClass1_781 = new Class1(aClass3_Sub1_665, 5);
        anInt782 = aClass1_781.method158(l, byte0 + 24, 196, 251, 1, 500, true);
        method50();
        if(aBoolean646)
            return;
        method51();
        if(aBoolean646)
            return;
        aClass6_664 = new Class6(aClass3_Sub1_665, 15000, 15000, 1000);
        aClass6_664.method271(anInt668 / 2, anInt669 / 2, anInt668 / 2, anInt669 / 2, anInt668, anInt670);
        aClass6_664.anInt248 = 2400;
        aClass6_664.anInt249 = 2400;
        aClass6_664.anInt250 = 1;
        aClass6_664.anInt251 = 2300;
        aClass6_664.method299(-50, -10, -50);
        aClass17_689 = new Class17(aClass6_664, aClass3_Sub1_665);
        aClass17_689.anInt569 = anInt671;
        method52();
        if(aBoolean646)
            return;
        method53();
        if(aBoolean646)
            return;
        method54();
        if(aBoolean646)
            return;
        if(aBoolean641)
            method55();
        if(aBoolean646)
        {
            return;
        } else
        {
            method15(100, "Starting game...");
            method56();
            method72();
            method62();
            method69();
            method65();
            method66();
            method58();
            method5();
            method74();
            return;
        }
    }

    public void method49()
    {
        byte abyte0[] = method18("config" + Class16.anInt557 + ".jag", "Configuration", 10);
        if(abyte0 == null)
        {
            aBoolean646 = true;
            return;
        }
        Class14.method397(abyte0, aBoolean641);
        byte abyte1[] = method18("filter" + Class16.anInt564 + ".jag", "Chat system", 15);
        if(abyte1 == null)
        {
            aBoolean646 = true;
            return;
        } else
        {
            byte abyte2[] = Class11.method357("fragmentsenc.txt", 0, abyte1);
            byte abyte3[] = Class11.method357("badenc.txt", 0, abyte1);
            byte abyte4[] = Class11.method357("hostenc.txt", 0, abyte1);
            byte abyte5[] = Class11.method357("tldlist.txt", 0, abyte1);
            Class12.method359(new Class9(abyte2), new Class9(abyte3), new Class9(abyte4), new Class9(abyte5));
            return;
        }
    }

    public void method50()
    {
        byte abyte0[] = method18("media" + Class16.anInt559 + ".jag", "2d graphics", 20);
        if(abyte0 == null)
        {
            aBoolean646 = true;
            return;
        }
        byte abyte1[] = Class11.method357("index.dat", 0, abyte0);
        aClass3_Sub1_665.method223(anInt671, Class11.method357("inv1.dat", 0, abyte0), abyte1, 1);
        aClass3_Sub1_665.method223(anInt671 + 1, Class11.method357("inv2.dat", 0, abyte0), abyte1, 6);
        aClass3_Sub1_665.method223(anInt671 + 9, Class11.method357("bubble.dat", 0, abyte0), abyte1, 1);
        aClass3_Sub1_665.method223(anInt671 + 10, Class11.method357("runescape.dat", 0, abyte0), abyte1, 1);
        aClass3_Sub1_665.method223(anInt671 + 11, Class11.method357("splat.dat", 0, abyte0), abyte1, 3);
        aClass3_Sub1_665.method223(anInt671 + 14, Class11.method357("icon.dat", 0, abyte0), abyte1, 8);
        aClass3_Sub1_665.method223(anInt671 + 22, Class11.method357("hbar.dat", 0, abyte0), abyte1, 1);
        aClass3_Sub1_665.method223(anInt671 + 23, Class11.method357("hbar2.dat", 0, abyte0), abyte1, 1);
        aClass3_Sub1_665.method223(anInt671 + 24, Class11.method357("compass.dat", 0, abyte0), abyte1, 1);
        aClass3_Sub1_665.method223(anInt671 + 25, Class11.method357("buttons.dat", 0, abyte0), abyte1, 2);
        aClass3_Sub1_665.method223(anInt672, Class11.method357("scrollbar.dat", 0, abyte0), abyte1, 2);
        aClass3_Sub1_665.method223(anInt672 + 2, Class11.method357("corners.dat", 0, abyte0), abyte1, 4);
        aClass3_Sub1_665.method223(anInt672 + 6, Class11.method357("arrows.dat", 0, abyte0), abyte1, 2);
        aClass3_Sub1_665.method223(anInt674, Class11.method357("projectile.dat", 0, abyte0), abyte1, Class14.anInt497);
        int i = Class14.anInt429;
        for(int j = 1; i > 0; j++)
        {
            int k = i;
            i -= 30;
            if(k > 30)
                k = 30;
            aClass3_Sub1_665.method223(anInt673 + (j - 1) * 30, Class11.method357("objects" + j + ".dat", 0, abyte0), abyte1, k);
        }

        aClass3_Sub1_665.method226(anInt671);
        aClass3_Sub1_665.method226(anInt671 + 9);
        for(int l = 11; l <= 26; l++)
            aClass3_Sub1_665.method226(anInt671 + l);

        for(int i1 = 0; i1 < Class14.anInt497; i1++)
            aClass3_Sub1_665.method226(anInt674 + i1);

        for(int j1 = 0; j1 < Class14.anInt429; j1++)
            aClass3_Sub1_665.method226(anInt673 + j1);

    }

    public void method51()
    {
        byte abyte0[] = null;
        byte abyte1[] = null;
        abyte0 = method18("entity" + Class16.anInt562 + ".jag", "people and monsters", 30);
        if(abyte0 == null)
        {
            aBoolean646 = true;
            return;
        }
        abyte1 = Class11.method357("index.dat", 0, abyte0);
        byte abyte2[] = null;
        byte abyte3[] = null;
        if(aBoolean641)
        {
            abyte2 = method18("entity" + Class16.anInt562 + ".mem", "member graphics", 45);
            if(abyte2 == null)
            {
                aBoolean646 = true;
                return;
            }
            abyte3 = Class11.method357("index.dat", 0, abyte2);
        }
        int i = 0;
        anInt995 = 0;
        anInt996 = anInt995;
label0:
        for(int j = 0; j < Class14.anInt463; j++)
        {
            String s = Class14.aStringArray464[j];
            for(int k = 0; k < j; k++)
            {
                if(!Class14.aStringArray464[k].equalsIgnoreCase(s))
                    continue;
                Class14.anIntArray469[j] = Class14.anIntArray469[k];
                continue label0;
            }

            byte abyte7[] = Class11.method357(s + ".dat", 0, abyte0);
            byte abyte4[] = abyte1;
            if(abyte7 == null && aBoolean641)
            {
                abyte7 = Class11.method357(s + ".dat", 0, abyte2);
                abyte4 = abyte3;
            }
            if(abyte7 != null)
            {
                aClass3_Sub1_665.method223(anInt996, abyte7, abyte4, 15);
                i += 15;
                if(Class14.anIntArray467[j] == 1)
                {
                    byte abyte8[] = Class11.method357(s + "a.dat", 0, abyte0);
                    byte abyte5[] = abyte1;
                    if(abyte8 == null && aBoolean641)
                    {
                        abyte8 = Class11.method357(s + "a.dat", 0, abyte2);
                        abyte5 = abyte3;
                    }
                    aClass3_Sub1_665.method223(anInt996 + 15, abyte8, abyte5, 3);
                    i += 3;
                }
                if(Class14.anIntArray468[j] == 1)
                {
                    byte abyte9[] = Class11.method357(s + "f.dat", 0, abyte0);
                    byte abyte6[] = abyte1;
                    if(abyte9 == null && aBoolean641)
                    {
                        abyte9 = Class11.method357(s + "f.dat", 0, abyte2);
                        abyte6 = abyte3;
                    }
                    aClass3_Sub1_665.method223(anInt996 + 18, abyte9, abyte6, 9);
                    i += 9;
                }
                if(Class14.anIntArray466[j] != 0)
                {
                    for(int l = anInt996; l < anInt996 + 27; l++)
                        aClass3_Sub1_665.method226(l);

                }
            }
            Class14.anIntArray469[j] = anInt996;
            anInt996 += 27;
        }

        System.out.println("Loaded: " + i + " frames of animation");
    }

    public void method52()
    {
        byte abyte0[] = method18("textures" + Class16.anInt561 + ".jag", "Textures", 50);
        if(abyte0 == null)
        {
            aBoolean646 = true;
            return;
        }
        byte abyte1[] = Class11.method357("index.dat", 0, abyte0);
        aClass6_664.method293(Class14.anInt460, 7, 11);
        for(int i = 0; i < Class14.anInt460; i++)
        {
            String s = Class14.aStringArray461[i];
            byte abyte2[] = Class11.method357(s + ".dat", 0, abyte0);
            aClass3_Sub1_665.method223(anInt675, abyte2, abyte1, 1);
            aClass3_Sub1_665.method214(0, 0, 128, 128, 0xff00ff);
            aClass3_Sub1_665.method229(0, 0, anInt675);
            int j = ((Class3) (aClass3_Sub1_665)).anIntArray201[anInt675];
            String s1 = Class14.aStringArray462[i];
            if(s1 != null && s1.length() > 0)
            {
                byte abyte3[] = Class11.method357(s1 + ".dat", 0, abyte0);
                aClass3_Sub1_665.method223(anInt675, abyte3, abyte1, 1);
                aClass3_Sub1_665.method229(0, 0, anInt675);
            }
            aClass3_Sub1_665.method228(anInt676 + i, 0, 0, j, j);
            int k = j * j;
            for(int l = 0; l < k; l++)
                if(((Class3) (aClass3_Sub1_665)).anIntArrayArray194[anInt676 + i][l] == 65280)
                    ((Class3) (aClass3_Sub1_665)).anIntArrayArray194[anInt676 + i][l] = 0xff00ff;

            aClass3_Sub1_665.method225(anInt676 + i);
            aClass6_664.method294(i, ((Class3) (aClass3_Sub1_665)).aByteArrayArray195[anInt676 + i], ((Class3) (aClass3_Sub1_665)).anIntArrayArray196[anInt676 + i], j / 64 - 1);
        }

    }

    public void method53()
    {
        Class14.method392("torcha2");
        Class14.method392("torcha3");
        Class14.method392("torcha4");
        Class14.method392("skulltorcha2");
        Class14.method392("skulltorcha3");
        Class14.method392("skulltorcha4");
        Class14.method392("firea2");
        Class14.method392("firea3");
        Class14.method392("fireplacea2");
        Class14.method392("fireplacea3");
        Class14.method392("firespell2");
        Class14.method392("firespell3");
        Class14.method392("lightning2");
        Class14.method392("lightning3");
        Class14.method392("clawspell2");
        Class14.method392("clawspell3");
        Class14.method392("clawspell4");
        Class14.method392("clawspell5");
        Class14.method392("spellcharge2");
        Class14.method392("spellcharge3");
        if(method7())
        {
            byte abyte0[] = method18("models" + Class16.anInt560 + ".jag", "3d models", 60);
            if(abyte0 == null)
            {
                aBoolean646 = true;
                return;
            }
            for(int j = 0; j < Class14.anInt513; j++)
            {
                int k = Class11.method355(Class14.aStringArray514[j] + ".ob3", abyte0);
                if(k != 0)
                    aClass2Array741[j] = new Class2(abyte0, k, true);
                else
                    aClass2Array741[j] = new Class2(1, 1);
                if(Class14.aStringArray514[j].equals("giantcrystal"))
                    aClass2Array741[j].aBoolean129 = true;
            }

            return;
        }
        method15(70, "Loading 3d models");
        for(int i = 0; i < Class14.anInt513; i++)
        {
            aClass2Array741[i] = new Class2("../gamedata/models/" + Class14.aStringArray514[i] + ".ob2");
            if(Class14.aStringArray514[i].equals("giantcrystal"))
                aClass2Array741[i].aBoolean129 = true;
        }

    }

    public void method54()
    {
        aClass17_689.aByteArray574 = method18("maps" + Class16.anInt558 + ".jag", "map", 70);
        if(aBoolean641)
            aClass17_689.aByteArray576 = method18("maps" + Class16.anInt558 + ".mem", "members map", 75);
        aClass17_689.aByteArray573 = method18("land" + Class16.anInt558 + ".jag", "landscape", 80);
        if(aBoolean641)
            aClass17_689.aByteArray575 = method18("land" + Class16.anInt558 + ".mem", "members landscape", 85);
    }

    public void method55()
    {
        try
        {
            aByteArray1013 = method18("sounds" + Class16.anInt563 + ".mem", "Sound effects", 90);
            anInputStream_Sub1_1014 = new InputStream_Sub1();
            return;
        }
        catch(Throwable throwable)
        {
            System.out.println("Unable to init sounds:" + throwable);
        }
    }

    public void method56()
    {
        aClass1_812 = new Class1(aClass3_Sub1_665, 10);
        anInt813 = aClass1_812.method155(5, 269, 502, 56, 1, 20, true);
        anInt814 = aClass1_812.method156(7, 324, 498, 14, 1, 80, false, true);
        anInt815 = aClass1_812.method155(5, 269, 502, 56, 1, 20, true);
        anInt816 = aClass1_812.method155(5, 269, 502, 56, 1, 20, true);
        aClass1_812.method169(anInt814);
    }

    public void method2()
    {
        if(aBoolean644)
            return;
        if(aBoolean645)
            return;
        if(aBoolean646)
            return;
        try
        {
            anInt648++;
            if(anInt667 == 0)
            {
                super.anInt12 = 0;
                method75();
            }
            if(anInt667 == 1)
            {
                super.anInt12++;
                method76();
            }
            super.anInt36 = 0;
            super.anInt38 = 0;
            anInt661++;
            if(anInt661 > 500)
            {
                anInt661 = 0;
                int i = (int)(Math.random() * 4D);
                if((i & 1) == 1)
                    anInt657 += anInt658;
                if((i & 2) == 2)
                    anInt659 += anInt660;
            }
            if(anInt657 < -50)
                anInt658 = 2;
            if(anInt657 > 50)
                anInt658 = -2;
            if(anInt659 < -50)
                anInt660 = 2;
            if(anInt659 > 50)
                anInt660 = -2;
            if(anInt808 > 0)
                anInt808--;
            if(anInt809 > 0)
                anInt809--;
            if(anInt810 > 0)
                anInt810--;
            if(anInt811 > 0)
            {
                anInt811--;
                return;
            }
        }
        catch(OutOfMemoryError _ex)
        {
            method57();
            aBoolean645 = true;
        }
    }

    public void method4()
    {
        if(aBoolean646)
        {
            Graphics g = getGraphics();
            g.setColor(Color.black);
            g.fillRect(0, 0, 512, 356);
            g.setFont(new Font("Helvetica", 1, 16));
            g.setColor(Color.yellow);
            int i = 35;
            g.drawString("Sorry, an error has occured whilst loading RuneScape", 30, i);
            i += 50;
            g.setColor(Color.white);
            g.drawString("To fix this try the following (in order):", 30, i);
            i += 50;
            g.setColor(Color.white);
            g.setFont(new Font("Helvetica", 1, 12));
            g.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, i);
            i += 30;
            g.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, i);
            i += 30;
            g.drawString("3: Try using a different game-world", 30, i);
            i += 30;
            g.drawString("4: Try rebooting your computer", 30, i);
            i += 30;
            g.drawString("5: Try selecting a different version of Java from the play-game menu", 30, i);
            method8(1);
            return;
        }
        if(aBoolean644)
        {
            Graphics g1 = getGraphics();
            g1.setColor(Color.black);
            g1.fillRect(0, 0, 512, 356);
            g1.setFont(new Font("Helvetica", 1, 20));
            g1.setColor(Color.white);
            g1.drawString("Error - unable to load game!", 50, 50);
            g1.drawString("To play RuneScape make sure you play from", 50, 100);
            g1.drawString("http://www.runescape.com", 50, 150);
            method8(1);
            return;
        }
        if(aBoolean645)
        {
            Graphics g2 = getGraphics();
            g2.setColor(Color.black);
            g2.fillRect(0, 0, 512, 356);
            g2.setFont(new Font("Helvetica", 1, 20));
            g2.setColor(Color.white);
            g2.drawString("Error - out of memory!", 50, 50);
            g2.drawString("Close ALL unnecessary programs", 50, 100);
            g2.drawString("and windows before loading the game", 50, 150);
            g2.drawString("RuneScape needs about 48meg of spare RAM", 50, 200);
            method8(1);
            return;
        }
        try
        {
            if(anInt667 == 0)
            {
                aClass3_Sub1_665.aBoolean212 = false;
                method73();
            }
            if(anInt667 == 1)
            {
                aClass3_Sub1_665.aBoolean212 = true;
                method83();
                return;
            }
        }
        catch(OutOfMemoryError _ex)
        {
            method57();
            aBoolean645 = true;
        }
    }

    public void method3()
    {
        method24();
        method57();
        if(anInputStream_Sub1_1014 != null)
            anInputStream_Sub1_1014.method130();
    }

    public void method57()
    {
        try
        {
            if(aClass3_Sub1_665 != null)
            {
                aClass3_Sub1_665.method222();
                aClass3_Sub1_665.anIntArray190 = null;
                aClass3_Sub1_665 = null;
            }
            if(aClass6_664 != null)
            {
                aClass6_664.method261();
                aClass6_664 = null;
            }
            aClass2Array741 = null;
            aClass2Array736 = null;
            aClass2Array745 = null;
            aClass15Array713 = null;
            aClass15Array714 = null;
            aClass15Array724 = null;
            aClass15Array725 = null;
            aClass15_716 = null;
            if(aClass17_689 != null)
            {
                aClass17_689.aClass2Array593 = null;
                aClass17_689.aClass2ArrayArray594 = null;
                aClass17_689.aClass2ArrayArray595 = null;
                aClass17_689.aClass2_596 = null;
                aClass17_689 = null;
            }
            System.gc();
            return;
        }
        catch(Exception _ex)
        {
            return;
        }
    }

    public void method10(int i)
    {
        if(anInt667 == 0)
        {
            if(anInt913 == 0)
                aClass1_914.method135(i);
            if(anInt913 == 1)
                aClass1_917.method135(i);
            if(anInt913 == 2)
                aClass1_925.method135(i);
            if(anInt913 == 3)
                aClass1_962.method135(i);
        }
        if(anInt667 == 1)
        {
            if(aBoolean998)
            {
                aClass1_936.method135(i);
                return;
            }
            if(aBoolean950)
            {
                if(anInt954 == -1)
                    aClass1_951.method135(i);
                return;
            }
            if(aBoolean972)
            {
                aClass1_973.method135(i);
                return;
            }
            if(anInt895 == 0 && anInt892 == 0 && anInt893 == 0 && !aBoolean1020)
                aClass1_812.method135(i);
            if(anInt895 == 3 || anInt895 == 4 || anInt895 == 5 || anInt895 == 7)
                anInt895 = 0;
        }
    }

    public void method11(int i, int j, int k)
    {
        anIntArray655[anInt654] = j;
        anIntArray656[anInt654] = k;
        anInt654 = anInt654 + 1 & 0x1fff;
        for(int l = 10; l < 4000; l++)
        {
            int i1 = anInt654 - l & 0x1fff;
            if(anIntArray655[i1] == j && anIntArray656[i1] == k)
            {
                boolean flag = false;
                for(int j1 = 1; j1 < l; j1++)
                {
                    int k1 = anInt654 - j1 & 0x1fff;
                    int l1 = i1 - j1 & 0x1fff;
                    if(anIntArray655[l1] != j || anIntArray656[l1] != k)
                        flag = true;
                    if(anIntArray655[k1] != anIntArray655[l1] || anIntArray656[k1] != anIntArray656[l1])
                        break;
                    if(j1 == l - 1 && flag && anInt909 == 0 && anInt908 == 0)
                    {
                        method60();
                        return;
                    }
                }

            }
        }

    }

    public void method58()
    {
        anInt667 = 0;
        anInt913 = 0;
        aString934 = "";
        aString935 = "";
        aString932 = "Please enter a username:";
        aString933 = "*" + aString934 + "*";
        anInt710 = 0;
        anInt722 = 0;
    }

    public void method59()
    {
        super.aString42 = "";
        super.aString43 = "";
    }

    public void method60()
    {
        if(anInt667 == 0)
            return;
        if(anInt909 > 450)
        {
            method77("@cya@You can't logout during combat!", 3);
            return;
        }
        if(anInt909 > 0)
        {
            method77("@cya@You can't logout for 10 seconds after combat", 3);
            return;
        } else
        {
            super.aClass10_Sub1_614.method334(6, 156);
            super.aClass10_Sub1_614.method336();
            anInt908 = 1000;
            return;
        }
    }

    public void method61(String s)
    {
        if(anInputStream_Sub1_1014 == null)
            return;
        if(aBoolean791)
        {
            return;
        } else
        {
            anInputStream_Sub1_1014.method131(aByteArray1013, Class11.method355(s + ".pcm", aByteArray1013), Class11.method356(s + ".pcm", aByteArray1013));
            return;
        }
    }

    public void method62()
    {
        aClass1_951 = new Class1(aClass3_Sub1_665, 100);
        int i = 8;
        anInt952 = aClass1_951.method151(256, i, "@yel@Please provide 5 security questions in case you lose your password", 1, true);
        i += 22;
        aClass1_951.method151(256, i, "If you ever lose your password, you will need these to prove you own your account.", 1, true);
        i += 13;
        aClass1_951.method151(256, i, "Your answers are encrypted and are ONLY used for password recovery purposes.", 1, true);
        i += 22;
        aClass1_951.method151(256, i, "@ora@IMPORTANT:@whi@ To recover your password you must give the EXACT same answers you", 1, true);
        i += 13;
        aClass1_951.method151(256, i, "give here. If you think you might forget an answer, or someone else could guess the", 1, true);
        i += 13;
        aClass1_951.method151(256, i, "answer, then press the 'different question' button to get a better question.", 1, true);
        i += 35;
        for(int j = 0; j < 5; j++)
        {
            aClass1_951.method152(170, i, 310, 30);
            aStringArray960[j] = aStringArray1022[anIntArray959[j]];
            anIntArray955[j] = aClass1_951.method151(170, i - 7, (j + 1) + ": " + aStringArray1022[anIntArray959[j]], 1, true);
            anIntArray956[j] = aClass1_951.method157(170, i + 7, 310, 30, 1, 80, false, true);
            aClass1_951.method152(370, i, 80, 30);
            aClass1_951.method151(370, i - 7, "Different", 1, true);
            aClass1_951.method151(370, i + 7, "Question", 1, true);
            anIntArray957[j] = aClass1_951.method159(370, i, 80, 30);
            aClass1_951.method152(455, i, 80, 30);
            aClass1_951.method151(455, i - 7, "Enter own", 1, true);
            aClass1_951.method151(455, i + 7, "Question", 1, true);
            anIntArray958[j] = aClass1_951.method159(455, i, 80, 30);
            i += 35;
        }

        aClass1_951.method169(anIntArray956[0]);
        i += 10;
        aClass1_951.method152(256, i, 250, 30);
        aClass1_951.method151(256, i, "Click here when finished", 4, true);
        anInt953 = aClass1_951.method159(256, i, 250, 30);
    }

    public void method63()
    {
        if(anInt954 != -1)
        {
            if(super.aString43.length() > 0)
            {
                aStringArray960[anInt954] = super.aString43;
                aClass1_951.method165(anIntArray955[anInt954], (anInt954 + 1) + ": " + aStringArray960[anInt954]);
                aClass1_951.method165(anIntArray956[anInt954], "");
                anInt954 = -1;
            }
            return;
        }
        aClass1_951.method133(super.anInt33, super.anInt34, super.anInt36, super.anInt35);
        for(int i = 0; i < 5; i++)
            if(aClass1_951.method134(anIntArray957[i]))
            {
                for(boolean flag = false; !flag;)
                {
                    anIntArray959[i] = (anIntArray959[i] + 1) % aStringArray1022.length;
                    flag = true;
                    for(int k = 0; k < 5; k++)
                        if(k != i && anIntArray959[k] == anIntArray959[i])
                            flag = false;

                }

                aStringArray960[i] = aStringArray1022[anIntArray959[i]];
                aClass1_951.method165(anIntArray955[i], (i + 1) + ": " + aStringArray1022[anIntArray959[i]]);
                aClass1_951.method165(anIntArray956[i], "");
            }

        for(int j = 0; j < 5; j++)
            if(aClass1_951.method134(anIntArray958[j]))
            {
                anInt954 = j;
                super.aString42 = "";
                super.aString43 = "";
            }

        if(aClass1_951.method134(anInt953))
        {
            for(int l = 0; l < 5; l++)
            {
                String s = aClass1_951.method166(anIntArray956[l]);
                if(s == null || s.length() < 3)
                {
                    aClass1_951.method165(anInt952, "@yel@Please provide a longer answer to question: " + (l + 1));
                    return;
                }
            }

            for(int i1 = 0; i1 < 5; i1++)
            {
                String s1 = aClass1_951.method166(anIntArray956[i1]);
                for(int k1 = 0; k1 < i1; k1++)
                {
                    String s3 = aClass1_951.method166(anIntArray956[k1]);
                    if(s1.equalsIgnoreCase(s3))
                    {
                        aClass1_951.method165(anInt952, "@yel@Each question must have a different answer");
                        return;
                    }
                }

            }

            super.aClass10_Sub1_614.method334(208, 457);
            for(int j1 = 0; j1 < 5; j1++)
            {
                String s2 = aStringArray960[j1];
                if(s2 == null || s2.length() == 0)
                    s2 = String.valueOf(j1 + 1);
                if(s2.length() > 50)
                    s2 = s2.substring(0, 50);
                String s4 = aClass1_951.method166(anIntArray956[j1]);
                s4 = Class11.method351(s4, 50);
                super.aClass10_Sub1_614.method327(s2.length());
                super.aClass10_Sub1_614.method331(s2);
                super.aClass10_Sub1_614.method327(s4.length());
                super.aClass10_Sub1_614.method333(s4, super.anInt629, aBigInteger642, aBigInteger643);
            }

            super.aClass10_Sub1_614.method336();
            for(int l1 = 0; l1 < 5; l1++)
            {
                anIntArray959[l1] = l1;
                aStringArray960[l1] = aStringArray1022[anIntArray959[l1]];
                aClass1_951.method165(anIntArray956[l1], "");
                aClass1_951.method165(anIntArray955[l1], (l1 + 1) + ": " + aStringArray960[l1]);
            }

            aClass3_Sub1_665.method210();
            aBoolean950 = false;
        }
    }

    public void method64()
    {
        aClass3_Sub1_665.aBoolean208 = false;
        aClass3_Sub1_665.method210();
        aClass1_951.method136();
        if(anInt954 != -1)
        {
            int i = 150;
            aClass3_Sub1_665.method214(26, i, 460, 60, 0);
            aClass3_Sub1_665.method215(26, i, 460, 60, 0xffffff);
            i += 22;
            aClass3_Sub1_665.method252("Please enter your question", 256, i, 4, 0xffffff);
            i += 25;
            aClass3_Sub1_665.method252(super.aString42 + "*", 256, i, 4, 0xffffff);
        }
        aClass3_Sub1_665.method229(0, anInt669, anInt671 + 22);
        aClass3_Sub1_665.method209(aGraphics663, 0, 0);
    }

    public void method65()
    {
        aClass1_962 = new Class1(aClass3_Sub1_665, 100);
        int i = 10;
        anInt963 = aClass1_962.method151(256, i, "@yel@To prove this is your account please provide the answers to", 1, true);
        i += 15;
        anInt964 = aClass1_962.method151(256, i, "@yel@your security questions. You will then be able to reset your password", 1, true);
        i += 35;
        for(int j = 0; j < 5; j++)
        {
            aClass1_962.method152(256, i, 410, 30);
            anIntArray970[j] = aClass1_962.method151(256, i - 7, (j + 1) + ": question?", 1, true);
            anIntArray971[j] = aClass1_962.method157(256, i + 7, 310, 30, 1, 80, true, true);
            i += 35;
        }

        aClass1_962.method169(anIntArray971[0]);
        aClass1_962.method152(256, i, 410, 30);
        aClass1_962.method151(256, i - 7, "If you know it, enter a previous password used on this account", 1, true);
        anInt965 = aClass1_962.method157(256, i + 7, 310, 30, 1, 80, true, true);
        i += 35;
        aClass1_962.method152(151, i, 200, 30);
        aClass1_962.method151(151, i - 7, "Choose a NEW password", 1, true);
        anInt966 = aClass1_962.method157(146, i + 7, 200, 30, 1, 80, true, true);
        aClass1_962.method152(361, i, 200, 30);
        aClass1_962.method151(361, i - 7, "Confirm new password", 1, true);
        anInt967 = aClass1_962.method157(366, i + 7, 200, 30, 1, 80, true, true);
        i += 35;
        aClass1_962.method152(201, i, 100, 30);
        aClass1_962.method151(201, i, "Submit", 4, true);
        anInt968 = aClass1_962.method159(201, i, 100, 30);
        aClass1_962.method152(311, i, 100, 30);
        aClass1_962.method151(311, i, "Cancel", 4, true);
        anInt969 = aClass1_962.method159(311, i, 100, 30);
    }

    public void method66()
    {
        aClass1_973 = new Class1(aClass3_Sub1_665, 100);
        char c = '\u0100';
        char c1 = '\u0190';
        int i = 25;
        anInt974 = aClass1_973.method151(256, i, "@yel@Please supply your contact details", 5, true);
        i += 30;
        aClass1_973.method151(256, i, "We need this information to provide an efficient customer support service ", 1, true);
        i += 15;
        aClass1_973.method151(256, i, "and also to work out where to locate future RuneScape servers.", 1, true);
        i += 25;
        aClass1_973.method151(256, i, "We know some people are concerned about entering their email address on", 1, true);
        i += 15;
        aClass1_973.method151(255, i, "websites, and for this reason we take our users privacy very seriously.", 1, true);
        i += 15;
        aClass1_973.method151(256, i, "For our full policy please click the relevant link below this game window", 1, true);
        i += 40;
        aClass1_973.method152(c, i, c1, 30);
        aClass1_973.method151(c, i - 7, "Full name", 1, true);
        anInt975 = aClass1_973.method157(c, i + 7, c1, 30, 1, 80, false, true);
        i += 35;
        aClass1_973.method152(c, i, c1, 30);
        aClass1_973.method151(c, i - 7, "Postcode/Zipcode", 1, true);
        anInt976 = aClass1_973.method157(c, i + 7, c1, 30, 1, 80, false, true);
        i += 35;
        aClass1_973.method152(c, i, c1, 30);
        aClass1_973.method151(c, i - 7, "Country", 1, true);
        anInt977 = aClass1_973.method157(c, i + 7, c1, 30, 1, 80, false, true);
        i += 35;
        aClass1_973.method152(c, i, c1, 30);
        aClass1_973.method151(c, i - 7, "Email address", 1, true);
        anInt978 = aClass1_973.method157(c, i + 7, c1, 30, 1, 80, false, true);
        i += 35;
        aClass1_973.method152(c, i, 100, 30);
        aClass1_973.method151(c, i, "Submit", 4, true);
        anInt979 = aClass1_973.method159(c, i, 100, 30);
        aClass1_973.method169(anInt975);
    }

    public void method67()
    {
        aClass3_Sub1_665.aBoolean208 = false;
        aClass3_Sub1_665.method210();
        aClass1_973.method136();
        aClass3_Sub1_665.method229(0, anInt669, anInt671 + 22);
        aClass3_Sub1_665.method209(aGraphics663, 0, 0);
    }

    public void method68()
    {
        aClass1_973.method133(super.anInt33, super.anInt34, super.anInt36, super.anInt35);
        if(aClass1_973.method134(anInt975))
            aClass1_973.method169(anInt976);
        if(aClass1_973.method134(anInt976))
            aClass1_973.method169(anInt977);
        if(aClass1_973.method134(anInt977))
            aClass1_973.method169(anInt978);
        if(aClass1_973.method134(anInt978))
            aClass1_973.method169(anInt975);
        if(aClass1_973.method134(anInt979))
        {
            String s = aClass1_973.method166(anInt975);
            String s1 = aClass1_973.method166(anInt976);
            String s2 = aClass1_973.method166(anInt977);
            String s3 = aClass1_973.method166(anInt978);
            if(s == null || s.length() == 0 || s1 == null || s1.length() == 0 || s2 == null || s2.length() == 0 || s3 == null || s3.length() == 0)
            {
                aClass1_973.method165(anInt974, "@yel@Please fill in all the requested details");
                return;
            }
            super.aClass10_Sub1_614.method334(253, 155);
            super.aClass10_Sub1_614.method327(s.length());
            super.aClass10_Sub1_614.method331(s);
            super.aClass10_Sub1_614.method327(s1.length());
            super.aClass10_Sub1_614.method331(s1);
            super.aClass10_Sub1_614.method327(s2.length());
            super.aClass10_Sub1_614.method331(s2);
            super.aClass10_Sub1_614.method327(s3.length());
            super.aClass10_Sub1_614.method331(s3);
            super.aClass10_Sub1_614.method336();
            aClass3_Sub1_665.method210();
            aBoolean972 = false;
        }
    }

    public void method69()
    {
        aClass1_936 = new Class1(aClass3_Sub1_665, 100);
        aClass1_936.method151(256, 10, "Please design Your Character", 4, true);
        int i = 140;
        int j = 34;
        i += 116;
        j -= 10;
        aClass1_936.method151(i - 55, j + 110, "Front", 3, true);
        aClass1_936.method151(i, j + 110, "Side", 3, true);
        aClass1_936.method151(i + 55, j + 110, "Back", 3, true);
        byte byte0 = 54;
        j += 145;
        aClass1_936.method153(i - byte0, j, 53, 41);
        aClass1_936.method151(i - byte0, j - 8, "Head", 1, true);
        aClass1_936.method151(i - byte0, j + 8, "Type", 1, true);
        aClass1_936.method154(i - byte0 - 40, j, Class1.anInt94 + 7);
        anInt937 = aClass1_936.method159(i - byte0 - 40, j, 20, 20);
        aClass1_936.method154((i - byte0) + 40, j, Class1.anInt94 + 6);
        anInt938 = aClass1_936.method159((i - byte0) + 40, j, 20, 20);
        aClass1_936.method153(i + byte0, j, 53, 41);
        aClass1_936.method151(i + byte0, j - 8, "Hair", 1, true);
        aClass1_936.method151(i + byte0, j + 8, "Color", 1, true);
        aClass1_936.method154((i + byte0) - 40, j, Class1.anInt94 + 7);
        anInt939 = aClass1_936.method159((i + byte0) - 40, j, 20, 20);
        aClass1_936.method154(i + byte0 + 40, j, Class1.anInt94 + 6);
        anInt940 = aClass1_936.method159(i + byte0 + 40, j, 20, 20);
        j += 50;
        aClass1_936.method153(i - byte0, j, 53, 41);
        aClass1_936.method151(i - byte0, j, "Gender", 1, true);
        aClass1_936.method154(i - byte0 - 40, j, Class1.anInt94 + 7);
        anInt941 = aClass1_936.method159(i - byte0 - 40, j, 20, 20);
        aClass1_936.method154((i - byte0) + 40, j, Class1.anInt94 + 6);
        anInt942 = aClass1_936.method159((i - byte0) + 40, j, 20, 20);
        aClass1_936.method153(i + byte0, j, 53, 41);
        aClass1_936.method151(i + byte0, j - 8, "Top", 1, true);
        aClass1_936.method151(i + byte0, j + 8, "Color", 1, true);
        aClass1_936.method154((i + byte0) - 40, j, Class1.anInt94 + 7);
        anInt943 = aClass1_936.method159((i + byte0) - 40, j, 20, 20);
        aClass1_936.method154(i + byte0 + 40, j, Class1.anInt94 + 6);
        anInt944 = aClass1_936.method159(i + byte0 + 40, j, 20, 20);
        j += 50;
        aClass1_936.method153(i - byte0, j, 53, 41);
        aClass1_936.method151(i - byte0, j - 8, "Skin", 1, true);
        aClass1_936.method151(i - byte0, j + 8, "Color", 1, true);
        aClass1_936.method154(i - byte0 - 40, j, Class1.anInt94 + 7);
        anInt945 = aClass1_936.method159(i - byte0 - 40, j, 20, 20);
        aClass1_936.method154((i - byte0) + 40, j, Class1.anInt94 + 6);
        anInt946 = aClass1_936.method159((i - byte0) + 40, j, 20, 20);
        aClass1_936.method153(i + byte0, j, 53, 41);
        aClass1_936.method151(i + byte0, j - 8, "Bottom", 1, true);
        aClass1_936.method151(i + byte0, j + 8, "Color", 1, true);
        aClass1_936.method154((i + byte0) - 40, j, Class1.anInt94 + 7);
        anInt947 = aClass1_936.method159((i + byte0) - 40, j, 20, 20);
        aClass1_936.method154(i + byte0 + 40, j, Class1.anInt94 + 6);
        anInt948 = aClass1_936.method159(i + byte0 + 40, j, 20, 20);
        j += 82;
        j -= 35;
        aClass1_936.method152(i, j, 200, 30);
        aClass1_936.method151(i, j, "Accept", 4, false);
        anInt949 = aClass1_936.method159(i, j, 200, 30);
    }

    public void method70()
    {
        aClass3_Sub1_665.aBoolean208 = false;
        aClass3_Sub1_665.method210();
        aClass1_936.method136();
        int i = 140;
        int j = 50;
        i += 116;
        j -= 25;
        aClass3_Sub1_665.method233(i - 32 - 55, j, 64, 102, Class14.anIntArray469[anInt1001], anIntArray1007[anInt1004]);
        aClass3_Sub1_665.method245(i - 32 - 55, j, 64, 102, Class14.anIntArray469[anInt1000], anIntArray1007[anInt1003], anIntArray1009[anInt1005], 0, false);
        aClass3_Sub1_665.method245(i - 32 - 55, j, 64, 102, Class14.anIntArray469[anInt999], anIntArray1008[anInt1002], anIntArray1009[anInt1005], 0, false);
        aClass3_Sub1_665.method233(i - 32, j, 64, 102, Class14.anIntArray469[anInt1001] + 6, anIntArray1007[anInt1004]);
        aClass3_Sub1_665.method245(i - 32, j, 64, 102, Class14.anIntArray469[anInt1000] + 6, anIntArray1007[anInt1003], anIntArray1009[anInt1005], 0, false);
        aClass3_Sub1_665.method245(i - 32, j, 64, 102, Class14.anIntArray469[anInt999] + 6, anIntArray1008[anInt1002], anIntArray1009[anInt1005], 0, false);
        aClass3_Sub1_665.method233((i - 32) + 55, j, 64, 102, Class14.anIntArray469[anInt1001] + 12, anIntArray1007[anInt1004]);
        aClass3_Sub1_665.method245((i - 32) + 55, j, 64, 102, Class14.anIntArray469[anInt1000] + 12, anIntArray1007[anInt1003], anIntArray1009[anInt1005], 0, false);
        aClass3_Sub1_665.method245((i - 32) + 55, j, 64, 102, Class14.anIntArray469[anInt999] + 12, anIntArray1008[anInt1002], anIntArray1009[anInt1005], 0, false);
        aClass3_Sub1_665.method229(0, anInt669, anInt671 + 22);
        aClass3_Sub1_665.method209(aGraphics663, 0, 0);
    }

    public void method71()
    {
        aClass1_936.method133(super.anInt33, super.anInt34, super.anInt36, super.anInt35);
        if(aClass1_936.method134(anInt937))
            do
                anInt999 = ((anInt999 - 1) + Class14.anInt463) % Class14.anInt463;
            while((Class14.anIntArray466[anInt999] & 3) != 1 || (Class14.anIntArray466[anInt999] & 4 * anInt1006) == 0);
        if(aClass1_936.method134(anInt938))
            do
                anInt999 = (anInt999 + 1) % Class14.anInt463;
            while((Class14.anIntArray466[anInt999] & 3) != 1 || (Class14.anIntArray466[anInt999] & 4 * anInt1006) == 0);
        if(aClass1_936.method134(anInt939))
            anInt1002 = ((anInt1002 - 1) + anIntArray1008.length) % anIntArray1008.length;
        if(aClass1_936.method134(anInt940))
            anInt1002 = (anInt1002 + 1) % anIntArray1008.length;
        if(aClass1_936.method134(anInt941) || aClass1_936.method134(anInt942))
        {
            for(anInt1006 = 3 - anInt1006; (Class14.anIntArray466[anInt999] & 3) != 1 || (Class14.anIntArray466[anInt999] & 4 * anInt1006) == 0; anInt999 = (anInt999 + 1) % Class14.anInt463);
            for(; (Class14.anIntArray466[anInt1000] & 3) != 2 || (Class14.anIntArray466[anInt1000] & 4 * anInt1006) == 0; anInt1000 = (anInt1000 + 1) % Class14.anInt463);
        }
        if(aClass1_936.method134(anInt943))
            anInt1003 = ((anInt1003 - 1) + anIntArray1007.length) % anIntArray1007.length;
        if(aClass1_936.method134(anInt944))
            anInt1003 = (anInt1003 + 1) % anIntArray1007.length;
        if(aClass1_936.method134(anInt945))
            anInt1005 = ((anInt1005 - 1) + anIntArray1009.length) % anIntArray1009.length;
        if(aClass1_936.method134(anInt946))
            anInt1005 = (anInt1005 + 1) % anIntArray1009.length;
        if(aClass1_936.method134(anInt947))
            anInt1004 = ((anInt1004 - 1) + anIntArray1007.length) % anIntArray1007.length;
        if(aClass1_936.method134(anInt948))
            anInt1004 = (anInt1004 + 1) % anIntArray1007.length;
        if(aClass1_936.method134(anInt949))
        {
            super.aClass10_Sub1_614.method334(236, 65);
            super.aClass10_Sub1_614.method327(anInt1006);
            super.aClass10_Sub1_614.method327(anInt999);
            super.aClass10_Sub1_614.method327(anInt1000);
            super.aClass10_Sub1_614.method327(anInt1001);
            super.aClass10_Sub1_614.method327(anInt1002);
            super.aClass10_Sub1_614.method327(anInt1003);
            super.aClass10_Sub1_614.method327(anInt1004);
            super.aClass10_Sub1_614.method327(anInt1005);
            super.aClass10_Sub1_614.method336();
            aClass3_Sub1_665.method210();
            aBoolean998 = false;
        }
    }

    public void method72()
    {
        aClass1_914 = new Class1(aClass3_Sub1_665, 50);
        int i = 40;
        if(!aBoolean641)
        {
            aClass1_914.method151(256, 200 + i, "Click on an option", 5, true);
            aClass1_914.method152(156, 240 + i, 120, 35);
            aClass1_914.method152(356, 240 + i, 120, 35);
            aClass1_914.method151(156, 240 + i, "New User", 5, false);
            aClass1_914.method151(356, 240 + i, "Existing User", 5, false);
            anInt915 = aClass1_914.method159(156, 240 + i, 120, 35);
            anInt916 = aClass1_914.method159(356, 240 + i, 120, 35);
        } else
        {
            aClass1_914.method151(256, 200 + i, "Welcome to RuneScape", 4, true);
            aClass1_914.method151(256, 215 + i, "You need a member account to use this server", 4, true);
            aClass1_914.method152(256, 250 + i, 200, 35);
            aClass1_914.method151(256, 250 + i, "Click here to login", 5, false);
            anInt916 = aClass1_914.method159(256, 250 + i, 200, 35);
        }
        aClass1_917 = new Class1(aClass3_Sub1_665, 50);
        i = 70;
        anInt918 = aClass1_917.method151(256, i + 8, "To create an account please enter all the requested details", 4, true);
        i += 25;
        aClass1_917.method152(256, i + 17, 250, 34);
        aClass1_917.method151(256, i + 8, "Choose a Username", 4, false);
        anInt921 = aClass1_917.method157(256, i + 25, 200, 40, 4, 12, false, false);
        aClass1_917.method169(anInt921);
        i += 40;
        aClass1_917.method152(141, i + 17, 220, 34);
        aClass1_917.method151(141, i + 8, "Choose a Password", 4, false);
        anInt922 = aClass1_917.method157(141, i + 25, 220, 40, 4, 20, true, false);
        aClass1_917.method152(371, i + 17, 220, 34);
        aClass1_917.method151(371, i + 8, "Confirm Password", 4, false);
        anInt923 = aClass1_917.method157(371, i + 25, 220, 40, 4, 20, true, false);
        i += 40;
        i += 20;
        anInt924 = aClass1_917.method160(60, i, 14);
        aClass1_917.method150(75, i, "I have read and agree to your terms and conditions", 4, true);
        i += 15;
        aClass1_917.method151(256, i, "(to view these click the relevant link below this game window)", 4, true);
        i += 20;
        aClass1_917.method152(156, i + 17, 150, 34);
        aClass1_917.method151(156, i + 17, "Submit", 5, false);
        anInt920 = aClass1_917.method159(156, i + 17, 150, 34);
        aClass1_917.method152(356, i + 17, 150, 34);
        aClass1_917.method151(356, i + 17, "Cancel", 5, false);
        anInt919 = aClass1_917.method159(356, i + 17, 150, 34);
        aClass1_925 = new Class1(aClass3_Sub1_665, 50);
        i = 230;
        anInt926 = aClass1_925.method151(256, i - 10, "Please enter your username and password", 4, true);
        i += 28;
        aClass1_925.method152(140, i, 200, 40);
        aClass1_925.method151(140, i - 10, "Username:", 4, false);
        anInt927 = aClass1_925.method157(140, i + 10, 200, 40, 4, 12, false, false);
        i += 47;
        aClass1_925.method152(190, i, 200, 40);
        aClass1_925.method151(190, i - 10, "Password:", 4, false);
        anInt928 = aClass1_925.method157(190, i + 10, 200, 40, 4, 20, true, false);
        i -= 55;
        aClass1_925.method152(410, i, 120, 25);
        aClass1_925.method151(410, i, "Ok", 4, false);
        anInt929 = aClass1_925.method159(410, i, 120, 25);
        i += 30;
        aClass1_925.method152(410, i, 120, 25);
        aClass1_925.method151(410, i, "Cancel", 4, false);
        anInt930 = aClass1_925.method159(410, i, 120, 25);
        i += 30;
        aClass1_925.method152(410, i, 160, 25);
        aClass1_925.method151(410, i, "I've lost my password", 4, false);
        anInt931 = aClass1_925.method159(410, i, 160, 25);
        aClass1_925.method169(anInt927);
    }

    public void method73()
    {
        aBoolean898 = false;
        aClass3_Sub1_665.aBoolean208 = false;
        aClass3_Sub1_665.method210();
        if(anInt913 == 0 || anInt913 == 2)
        {
            int i = (anInt648 * 2) % 3072;
            if(i < 1024)
            {
                aClass3_Sub1_665.method229(0, 10, anInt677);
                if(i > 768)
                    aClass3_Sub1_665.method231(0, 10, anInt677 + 1, i - 768);
            } else
            if(i < 2048)
            {
                aClass3_Sub1_665.method229(0, 10, anInt677 + 1);
                if(i > 1792)
                    aClass3_Sub1_665.method231(0, 10, anInt671 + 10, i - 1792);
            } else
            {
                aClass3_Sub1_665.method229(0, 10, anInt671 + 10);
                if(i > 2816)
                    aClass3_Sub1_665.method231(0, 10, anInt677, i - 2816);
            }
        }
        if(anInt913 == 0)
            aClass1_914.method136();
        if(anInt913 == 1)
            aClass1_917.method136();
        if(anInt913 == 2)
            aClass1_925.method136();
        if(anInt913 == 3)
            aClass1_962.method136();
        aClass3_Sub1_665.method229(0, anInt669, anInt671 + 22);
        aClass3_Sub1_665.method209(aGraphics663, 0, 0);
    }

    public void method74()
    {
        int i = 0;
        byte byte0 = 50;
        byte byte1 = 50;
        aClass17_689.method425(byte0 * 48 + 23, byte1 * 48 + 23, i);
        aClass17_689.method429(aClass2Array741);
        char c = '\u2600';
        char c1 = '\u1900';
        char c2 = '\u044C';
        char c3 = '\u0378';
        aClass6_664.anInt248 = 4100;
        aClass6_664.anInt249 = 4100;
        aClass6_664.anInt250 = 1;
        aClass6_664.anInt251 = 4000;
        aClass6_664.method288(c, -aClass17_689.method409(c, c1), c1, 912, c3, 0, c2 * 2);
        aClass6_664.method276();
        aClass3_Sub1_665.method219();
        aClass3_Sub1_665.method219();
        aClass3_Sub1_665.method214(0, 0, 512, 6, 0);
        for(int j = 6; j >= 1; j--)
            aClass3_Sub1_665.method220(0, j, 0, j, 512, 8);

        aClass3_Sub1_665.method214(0, 194, 512, 20, 0);
        for(int k = 6; k >= 1; k--)
            aClass3_Sub1_665.method220(0, k, 0, 194 - k, 512, 8);

        aClass3_Sub1_665.method229(15, 15, anInt671 + 10);
        aClass3_Sub1_665.method228(anInt677, 0, 0, 512, 200);
        aClass3_Sub1_665.method225(anInt677);
        c = '\u2400';
        c1 = '\u2400';
        c2 = '\u044C';
        c3 = '\u0378';
        aClass6_664.anInt248 = 4100;
        aClass6_664.anInt249 = 4100;
        aClass6_664.anInt250 = 1;
        aClass6_664.anInt251 = 4000;
        aClass6_664.method288(c, -aClass17_689.method409(c, c1), c1, 912, c3, 0, c2 * 2);
        aClass6_664.method276();
        aClass3_Sub1_665.method219();
        aClass3_Sub1_665.method219();
        aClass3_Sub1_665.method214(0, 0, 512, 6, 0);
        for(int l = 6; l >= 1; l--)
            aClass3_Sub1_665.method220(0, l, 0, l, 512, 8);

        aClass3_Sub1_665.method214(0, 194, 512, 20, 0);
        for(int i1 = 6; i1 >= 1; i1--)
            aClass3_Sub1_665.method220(0, i1, 0, 194 - i1, 512, 8);

        aClass3_Sub1_665.method229(15, 15, anInt671 + 10);
        aClass3_Sub1_665.method228(anInt677 + 1, 0, 0, 512, 200);
        aClass3_Sub1_665.method225(anInt677 + 1);
        for(int j1 = 0; j1 < 64; j1++)
        {
            aClass6_664.method260(aClass17_689.aClass2ArrayArray595[0][j1]);
            aClass6_664.method260(aClass17_689.aClass2ArrayArray594[1][j1]);
            aClass6_664.method260(aClass17_689.aClass2ArrayArray595[1][j1]);
            aClass6_664.method260(aClass17_689.aClass2ArrayArray594[2][j1]);
            aClass6_664.method260(aClass17_689.aClass2ArrayArray595[2][j1]);
        }

        c = '\u2B80';
        c1 = '\u2880';
        c2 = '\u01F4';
        c3 = '\u0178';
        aClass6_664.anInt248 = 4100;
        aClass6_664.anInt249 = 4100;
        aClass6_664.anInt250 = 1;
        aClass6_664.anInt251 = 4000;
        aClass6_664.method288(c, -aClass17_689.method409(c, c1), c1, 912, c3, 0, c2 * 2);
        aClass6_664.method276();
        aClass3_Sub1_665.method219();
        aClass3_Sub1_665.method219();
        aClass3_Sub1_665.method214(0, 0, 512, 6, 0);
        for(int k1 = 6; k1 >= 1; k1--)
            aClass3_Sub1_665.method220(0, k1, 0, k1, 512, 8);

        aClass3_Sub1_665.method214(0, 194, 512, 20, 0);
        for(int l1 = 6; l1 >= 1; l1--)
            aClass3_Sub1_665.method220(0, l1, 0, 194, 512, 8);

        aClass3_Sub1_665.method229(15, 15, anInt671 + 10);
        aClass3_Sub1_665.method228(anInt671 + 10, 0, 0, 512, 200);
        aClass3_Sub1_665.method225(anInt671 + 10);
    }

    public void method75()
    {
        if(super.anInt630 > 0)
            super.anInt630--;
        if(anInt913 == 0)
        {
            aClass1_914.method133(super.anInt33, super.anInt34, super.anInt36, super.anInt35);
            if(aClass1_914.method134(anInt915))
            {
                anInt913 = 1;
                aClass1_917.method165(anInt921, "");
                aClass1_917.method165(anInt922, "");
                aClass1_917.method165(anInt923, "");
                aClass1_917.method169(anInt921);
                aClass1_917.method172(anInt924, 0);
                aClass1_917.method165(anInt918, "To create an account please enter all the requested details");
            }
            if(aClass1_914.method134(anInt916))
            {
                anInt913 = 2;
                aClass1_925.method165(anInt926, "Please enter your username and password");
                aClass1_925.method165(anInt927, "");
                aClass1_925.method165(anInt928, "");
                aClass1_925.method169(anInt927);
                return;
            }
        } else
        if(anInt913 == 1)
        {
            aClass1_917.method133(super.anInt33, super.anInt34, super.anInt36, super.anInt35);
            if(aClass1_917.method134(anInt921))
                aClass1_917.method169(anInt922);
            if(aClass1_917.method134(anInt922))
                aClass1_917.method169(anInt923);
            if(aClass1_917.method134(anInt923))
                aClass1_917.method169(anInt921);
            if(aClass1_917.method134(anInt919))
                anInt913 = 0;
            if(aClass1_917.method134(anInt920))
            {
                if(aClass1_917.method166(anInt921) == null || aClass1_917.method166(anInt921).length() == 0 || aClass1_917.method166(anInt922) == null || aClass1_917.method166(anInt922).length() == 0)
                {
                    aClass1_917.method165(anInt918, "@yel@Please fill in ALL requested information to continue!");
                    return;
                }
                if(!aClass1_917.method166(anInt922).equalsIgnoreCase(aClass1_917.method166(anInt923)))
                {
                    aClass1_917.method165(anInt918, "@yel@The two passwords entered are not the same as each other!");
                    return;
                }
                if(aClass1_917.method166(anInt922).length() < 5)
                {
                    aClass1_917.method165(anInt918, "@yel@Your password must be at least 5 letters long");
                    return;
                }
                if(aClass1_917.method166(anInt922).trim().equalsIgnoreCase(aClass1_917.method166(anInt921).trim()))
                {
                    aClass1_917.method165(anInt918, "@yel@Your password must not be the same as your username!");
                    return;
                }
                if(aClass1_917.method170(anInt924) == 0)
                {
                    aClass1_917.method165(anInt918, "@yel@You must agree to the terms+conditions to continue");
                    return;
                } else
                {
                    aClass1_917.method165(anInt918, "Please wait... Creating new account");
                    method73();
                    method9();
                    String s = aClass1_917.method166(anInt921);
                    String s2 = aClass1_917.method166(anInt922);
                    method27(s, s2);
                    return;
                }
            }
        } else
        if(anInt913 == 2)
        {
            aClass1_925.method133(super.anInt33, super.anInt34, super.anInt36, super.anInt35);
            if(aClass1_925.method134(anInt930))
                anInt913 = 0;
            if(aClass1_925.method134(anInt927))
                aClass1_925.method169(anInt928);
            if(aClass1_925.method134(anInt928) || aClass1_925.method134(anInt929))
            {
                aString934 = aClass1_925.method166(anInt927);
                aString935 = aClass1_925.method166(anInt928);
                method23(aString934, aString935, false);
            }
            if(aClass1_925.method134(anInt931))
            {
                aString934 = aClass1_925.method166(anInt927);
                aString934 = Class11.method350(aString934, 20);
                if(aString934.trim().length() == 0)
                {
                    method40("You must enter your username to recover your password", "");
                    return;
                }
                method40(Applet_Sub1_Sub1.aStringArray607[6], Applet_Sub1_Sub1.aStringArray607[7]);
                try
                {
                    super.aClass10_Sub1_614 = new Class10_Sub1(method19(super.aString610, super.anInt611), this);
                    super.aClass10_Sub1_614.anInt403 = Applet_Sub1_Sub1.anInt609;
                    super.aClass10_Sub1_614.method324();
                    super.aClass10_Sub1_614.method334(4, 848);
                    super.aClass10_Sub1_614.method330(Class11.method353(aString934));
                    super.aClass10_Sub1_614.method337();
                    super.aClass10_Sub1_614.method318();
                    super.aClass10_Sub1_614.method318();
                    int i = super.aClass10_Sub1_614.method318();
                    i = super.aClass10_Sub1_614.method335(i, Applet_Sub1_Sub1.anIntArray631);
                    System.out.println("Getpq response: " + i);
                    if(i == 0)
                    {
                        method40("Sorry, the recovery questions for this user have not been set", "");
                        return;
                    }
                    for(int j = 0; j < 5; j++)
                    {
                        int k = super.aClass10_Sub1_614.method318();
                        byte abyte0[] = new byte[5000];
                        super.aClass10_Sub1_614.method325(k, abyte0);
                        String s5 = new String(abyte0, 0, k);
                        aClass1_962.method165(anIntArray970[j], s5);
                    }

                    if(aBoolean961)
                    {
                        method40("Sorry, you have already attempted 1 recovery, try again later", "");
                        return;
                    }
                    anInt913 = 3;
                    aClass1_962.method165(anInt963, "@yel@To prove this is your account please provide the answers to");
                    aClass1_962.method165(anInt964, "@yel@your security questions. You will then be able to reset your password");
                    for(int l = 0; l < 5; l++)
                        aClass1_962.method165(anIntArray971[l], "");

                    aClass1_962.method165(anInt965, "");
                    aClass1_962.method165(anInt966, "");
                    aClass1_962.method165(anInt967, "");
                    return;
                }
                catch(Exception _ex)
                {
                    method40(Applet_Sub1_Sub1.aStringArray607[12], Applet_Sub1_Sub1.aStringArray607[13]);
                }
                return;
            }
        } else
        if(anInt913 == 3)
        {
            aClass1_962.method133(super.anInt33, super.anInt34, super.anInt36, super.anInt35);
            if(aClass1_962.method134(anInt968))
            {
                String s1 = aClass1_962.method166(anInt966);
                String s3 = aClass1_962.method166(anInt967);
                if(!s1.equalsIgnoreCase(s3))
                {
                    method40("@yel@The two new passwords entered are not the same as each other!", "");
                    return;
                }
                if(s1.length() < 5)
                {
                    method40("@yel@Your new password must be at least 5 letters long", "");
                    return;
                }
                method40(Applet_Sub1_Sub1.aStringArray607[6], Applet_Sub1_Sub1.aStringArray607[7]);
                try
                {
                    super.aClass10_Sub1_614 = new Class10_Sub1(method19(super.aString610, super.anInt611), this);
                    super.aClass10_Sub1_614.anInt403 = Applet_Sub1_Sub1.anInt609;
                    int i1 = super.aClass10_Sub1_614.method324();
                    String s4 = Class11.method350(aClass1_962.method166(anInt965), 20);
                    String s6 = Class11.method350(aClass1_962.method166(anInt966), 20);
                    super.aClass10_Sub1_614.method334(8, 121);
                    super.aClass10_Sub1_614.method330(Class11.method353(aString934));
                    super.aClass10_Sub1_614.method329(method22());
                    super.aClass10_Sub1_614.method333(s4 + s6, i1, aBigInteger642, aBigInteger643);
                    for(int j1 = 0; j1 < 5; j1++)
                    {
                        String s7 = aClass1_962.method166(anIntArray971[j1]);
                        s7 = Class11.method351(s7, 50);
                        super.aClass10_Sub1_614.method327(s7.length());
                        super.aClass10_Sub1_614.method333(s7, i1, aBigInteger642, aBigInteger643);
                    }

                    super.aClass10_Sub1_614.method337();
                    super.aClass10_Sub1_614.method318();
                    int k1 = super.aClass10_Sub1_614.method318();
                    k1 = super.aClass10_Sub1_614.method335(k1, Applet_Sub1_Sub1.anIntArray631);
                    System.out.println("Recover response: " + k1);
                    if(k1 == 0)
                    {
                        anInt913 = 2;
                        method40("Sorry, recovery failed. You may try again in 1 hour", "");
                        aBoolean961 = true;
                        return;
                    }
                    if(k1 == 1)
                    {
                        anInt913 = 2;
                        method40("Your pass has been reset. You may now use the new pass to login", "");
                        return;
                    } else
                    {
                        anInt913 = 2;
                        method40("Recovery failed! Attempts exceeded?", "");
                        return;
                    }
                }
                catch(Exception _ex)
                {
                    method40(Applet_Sub1_Sub1.aStringArray607[12], Applet_Sub1_Sub1.aStringArray607[13]);
                }
            }
            if(aClass1_962.method134(anInt969))
                anInt913 = 0;
        }
    }

    public void method40(String s, String s1)
    {
        if(anInt913 == 1)
            aClass1_917.method165(anInt918, s + " " + s1);
        if(anInt913 == 2)
            aClass1_925.method165(anInt926, s + " " + s1);
        if(anInt913 == 3)
        {
            aClass1_962.method165(anInt963, s);
            aClass1_962.method165(anInt964, s1);
        }
        aString933 = s1;
        method73();
        method9();
    }

    public void method44()
    {
        anInt908 = 0;
        method77("@cya@Sorry, you can't logout at the moment", 3);
    }

    public void method25()
    {
        if(anInt908 != 0)
        {
            method43();
            return;
        } else
        {
            super.method25();
            return;
        }
    }

    public void method43()
    {
        anInt913 = 0;
        anInt667 = 0;
        anInt908 = 0;
    }

    public void method42()
    {
        anInt891 = 0;
        anInt908 = 0;
        anInt913 = 0;
        anInt667 = 1;
        method59();
        aClass3_Sub1_665.method210();
        aClass3_Sub1_665.method209(aGraphics663, 0, 0);
        for(int i = 0; i < anInt735; i++)
        {
            aClass6_664.method260(aClass2Array736[i]);
            aClass17_689.method404(anIntArray737[i], anIntArray738[i], anIntArray739[i]);
        }

        for(int j = 0; j < anInt744; j++)
        {
            aClass6_664.method260(aClass2Array745[j]);
            aClass17_689.method402(anIntArray746[j], anIntArray747[j], anIntArray748[j], anIntArray749[j]);
        }

        anInt735 = 0;
        anInt744 = 0;
        anInt729 = 0;
        anInt710 = 0;
        for(int k = 0; k < anInt708; k++)
            aClass15Array713[k] = null;

        for(int l = 0; l < anInt709; l++)
            aClass15Array714[l] = null;

        anInt722 = 0;
        for(int i1 = 0; i1 < anInt720; i1++)
            aClass15Array724[i1] = null;

        for(int j1 = 0; j1 < anInt721; j1++)
            aClass15Array725[j1] = null;

        for(int k1 = 0; k1 < 50; k1++)
            aBooleanArray787[k1] = false;

        anInt650 = 0;
        super.anInt36 = 0;
        super.anInt35 = 0;
        aBoolean869 = false;
        aBoolean877 = false;
        aBoolean1020 = false;
    }

    public void method45()
    {
        String s = aClass1_917.method166(anInt921);
        String s1 = aClass1_917.method166(anInt922);
        anInt913 = 2;
        aClass1_925.method165(anInt926, "Please enter your username and password");
        aClass1_925.method165(anInt927, s);
        aClass1_925.method165(anInt928, s1);
        method73();
        method9();
        method23(s, s1, false);
    }

    public void method76()
    {
        method28();
        if(anInt908 > 0)
            anInt908--;
        if(super.anInt12 > 4500 && anInt909 == 0 && anInt908 == 0)
        {
            super.anInt12 -= 500;
            method60();
            return;
        }
        if(aClass15_716.anInt528 == 8 || aClass15_716.anInt528 == 9)
            anInt909 = 500;
        if(anInt909 > 0)
            anInt909--;
        if(aBoolean998)
        {
            method71();
            return;
        }
        if(aBoolean950)
        {
            method63();
            return;
        }
        if(aBoolean972)
        {
            method68();
            return;
        }
        for(int i = 0; i < anInt710; i++)
        {
            Class15 class15 = aClass15Array714[i];
            int k = (class15.anInt531 + 1) % 10;
            if(class15.anInt530 != k)
            {
                int i1 = -1;
                int l2 = class15.anInt530;
                int j4;
                if(l2 < k)
                    j4 = k - l2;
                else
                    j4 = (10 + k) - l2;
                int j5 = 4;
                if(j4 > 2)
                    j5 = (j4 - 1) * 4;
                if(class15.anIntArray532[l2] - class15.anInt524 > anInt666 * 3 || class15.anIntArray533[l2] - class15.anInt525 > anInt666 * 3 || class15.anIntArray532[l2] - class15.anInt524 < -anInt666 * 3 || class15.anIntArray533[l2] - class15.anInt525 < -anInt666 * 3 || j4 > 8)
                {
                    class15.anInt524 = class15.anIntArray532[l2];
                    class15.anInt525 = class15.anIntArray533[l2];
                } else
                {
                    if(class15.anInt524 < class15.anIntArray532[l2])
                    {
                        class15.anInt524 += j5;
                        class15.anInt527++;
                        i1 = 2;
                    } else
                    if(class15.anInt524 > class15.anIntArray532[l2])
                    {
                        class15.anInt524 -= j5;
                        class15.anInt527++;
                        i1 = 6;
                    }
                    if(class15.anInt524 - class15.anIntArray532[l2] < j5 && class15.anInt524 - class15.anIntArray532[l2] > -j5)
                        class15.anInt524 = class15.anIntArray532[l2];
                    if(class15.anInt525 < class15.anIntArray533[l2])
                    {
                        class15.anInt525 += j5;
                        class15.anInt527++;
                        if(i1 == -1)
                            i1 = 4;
                        else
                        if(i1 == 2)
                            i1 = 3;
                        else
                            i1 = 5;
                    } else
                    if(class15.anInt525 > class15.anIntArray533[l2])
                    {
                        class15.anInt525 -= j5;
                        class15.anInt527++;
                        if(i1 == -1)
                            i1 = 0;
                        else
                        if(i1 == 2)
                            i1 = 1;
                        else
                            i1 = 7;
                    }
                    if(class15.anInt525 - class15.anIntArray533[l2] < j5 && class15.anInt525 - class15.anIntArray533[l2] > -j5)
                        class15.anInt525 = class15.anIntArray533[l2];
                }
                if(i1 != -1)
                    class15.anInt528 = i1;
                if(class15.anInt524 == class15.anIntArray532[l2] && class15.anInt525 == class15.anIntArray533[l2])
                    class15.anInt530 = (l2 + 1) % 10;
            } else
            {
                class15.anInt528 = class15.anInt529;
            }
            if(class15.anInt536 > 0)
                class15.anInt536--;
            if(class15.anInt538 > 0)
                class15.anInt538--;
            if(class15.anInt542 > 0)
                class15.anInt542--;
            if(anInt910 > 0)
            {
                anInt910--;
                if(anInt910 == 0)
                    method77("You have been granted another life. Be more careful this time!", 3);
                if(anInt910 == 0)
                    method77("You retain your skills. Your objects land where you died", 3);
            }
        }

        for(int j = 0; j < anInt722; j++)
        {
            Class15 class15_1 = aClass15Array725[j];
            int j1 = (class15_1.anInt531 + 1) % 10;
            if(class15_1.anInt530 != j1)
            {
                int i3 = -1;
                int k4 = class15_1.anInt530;
                int k5;
                if(k4 < j1)
                    k5 = j1 - k4;
                else
                    k5 = (10 + j1) - k4;
                int l5 = 4;
                if(k5 > 2)
                    l5 = (k5 - 1) * 4;
                if(class15_1.anIntArray532[k4] - class15_1.anInt524 > anInt666 * 3 || class15_1.anIntArray533[k4] - class15_1.anInt525 > anInt666 * 3 || class15_1.anIntArray532[k4] - class15_1.anInt524 < -anInt666 * 3 || class15_1.anIntArray533[k4] - class15_1.anInt525 < -anInt666 * 3 || k5 > 8)
                {
                    class15_1.anInt524 = class15_1.anIntArray532[k4];
                    class15_1.anInt525 = class15_1.anIntArray533[k4];
                } else
                {
                    if(class15_1.anInt524 < class15_1.anIntArray532[k4])
                    {
                        class15_1.anInt524 += l5;
                        class15_1.anInt527++;
                        i3 = 2;
                    } else
                    if(class15_1.anInt524 > class15_1.anIntArray532[k4])
                    {
                        class15_1.anInt524 -= l5;
                        class15_1.anInt527++;
                        i3 = 6;
                    }
                    if(class15_1.anInt524 - class15_1.anIntArray532[k4] < l5 && class15_1.anInt524 - class15_1.anIntArray532[k4] > -l5)
                        class15_1.anInt524 = class15_1.anIntArray532[k4];
                    if(class15_1.anInt525 < class15_1.anIntArray533[k4])
                    {
                        class15_1.anInt525 += l5;
                        class15_1.anInt527++;
                        if(i3 == -1)
                            i3 = 4;
                        else
                        if(i3 == 2)
                            i3 = 3;
                        else
                            i3 = 5;
                    } else
                    if(class15_1.anInt525 > class15_1.anIntArray533[k4])
                    {
                        class15_1.anInt525 -= l5;
                        class15_1.anInt527++;
                        if(i3 == -1)
                            i3 = 0;
                        else
                        if(i3 == 2)
                            i3 = 1;
                        else
                            i3 = 7;
                    }
                    if(class15_1.anInt525 - class15_1.anIntArray533[k4] < l5 && class15_1.anInt525 - class15_1.anIntArray533[k4] > -l5)
                        class15_1.anInt525 = class15_1.anIntArray533[k4];
                }
                if(i3 != -1)
                    class15_1.anInt528 = i3;
                if(class15_1.anInt524 == class15_1.anIntArray532[k4] && class15_1.anInt525 == class15_1.anIntArray533[k4])
                    class15_1.anInt530 = (k4 + 1) % 10;
            } else
            {
                class15_1.anInt528 = class15_1.anInt529;
                if(class15_1.anInt526 == 43)
                    class15_1.anInt527++;
            }
            if(class15_1.anInt536 > 0)
                class15_1.anInt536--;
            if(class15_1.anInt538 > 0)
                class15_1.anInt538--;
            if(class15_1.anInt542 > 0)
                class15_1.anInt542--;
        }

        for(int l = 0; l < anInt710; l++)
        {
            Class15 class15_2 = aClass15Array714[l];
            if(class15_2.anInt551 > 0)
                class15_2.anInt551--;
        }

        if(aBoolean788)
        {
            if(anInt703 - aClass15_716.anInt524 < -500 || anInt703 - aClass15_716.anInt524 > 500 || anInt704 - aClass15_716.anInt525 < -500 || anInt704 - aClass15_716.anInt525 > 500)
            {
                anInt703 = aClass15_716.anInt524;
                anInt704 = aClass15_716.anInt525;
            }
        } else
        {
            if(anInt703 - aClass15_716.anInt524 < -500 || anInt703 - aClass15_716.anInt524 > 500 || anInt704 - aClass15_716.anInt525 < -500 || anInt704 - aClass15_716.anInt525 > 500)
            {
                anInt703 = aClass15_716.anInt524;
                anInt704 = aClass15_716.anInt525;
            }
            if(anInt703 != aClass15_716.anInt524)
                anInt703 += (aClass15_716.anInt524 - anInt703) / (16 + (anInt701 - 500) / 15);
            if(anInt704 != aClass15_716.anInt525)
                anInt704 += (aClass15_716.anInt525 - anInt704) / (16 + (anInt701 - 500) / 15);
            if(aBoolean789)
            {
                int k1 = anInt705 * 32;
                int j3 = k1 - anInt707;
                byte byte0 = 1;
                if(j3 != 0)
                {
                    anInt706++;
                    if(j3 > 128)
                    {
                        byte0 = -1;
                        j3 = 256 - j3;
                    } else
                    if(j3 > 0)
                        byte0 = 1;
                    else
                    if(j3 < -128)
                    {
                        byte0 = 1;
                        j3 = 256 + j3;
                    } else
                    if(j3 < 0)
                    {
                        byte0 = -1;
                        j3 = -j3;
                    }
                    anInt707 += ((anInt706 * j3 + 255) / 256) * byte0;
                    anInt707 &= 0xff;
                } else
                {
                    anInt706 = 0;
                }
            }
        }
        if(aBoolean1020)
        {
            if(super.aString41.length() > 0)
                if(super.aString41.equalsIgnoreCase("::lostcon") && !aBoolean647)
                    super.aClass10_Sub1_614.method317();
                else
                if(super.aString41.equalsIgnoreCase("::closecon") && !aBoolean647)
                {
                    method24();
                } else
                {
                    super.aClass10_Sub1_614.method334(193, 127);
                    super.aClass10_Sub1_614.method331(super.aString41);
                    super.aClass10_Sub1_614.method336();
                    super.aString40 = "";
                    super.aString41 = "";
                    aString1021 = "Please wait...";
                }
            if(super.anInt36 == 1 && super.anInt34 > 275 && super.anInt34 < 310 && super.anInt33 > 56 && super.anInt33 < 456)
            {
                super.aClass10_Sub1_614.method334(193, 127);
                super.aClass10_Sub1_614.method331("-null-");
                super.aClass10_Sub1_614.method336();
                super.aString40 = "";
                super.aString41 = "";
                aString1021 = "Please wait...";
            }
            super.anInt36 = 0;
            return;
        }
        if(super.anInt34 > anInt669 - 4)
        {
            if(super.anInt33 > 15 && super.anInt33 < 96 && super.anInt36 == 1)
                anInt817 = 0;
            if(super.anInt33 > 110 && super.anInt33 < 194 && super.anInt36 == 1)
            {
                anInt817 = 1;
                aClass1_812.anIntArray60[anInt813] = 0xf423f;
            }
            if(super.anInt33 > 215 && super.anInt33 < 295 && super.anInt36 == 1)
            {
                anInt817 = 2;
                aClass1_812.anIntArray60[anInt815] = 0xf423f;
            }
            if(super.anInt33 > 315 && super.anInt33 < 395 && super.anInt36 == 1)
            {
                anInt817 = 3;
                aClass1_812.anIntArray60[anInt816] = 0xf423f;
            }
            if(super.anInt33 > 417 && super.anInt33 < 497 && super.anInt36 == 1)
            {
                anInt893 = 1;
                anInt894 = 0;
                super.aString40 = "";
                super.aString41 = "";
            }
            super.anInt36 = 0;
            super.anInt35 = 0;
        }
        aClass1_812.method133(super.anInt33, super.anInt34, super.anInt36, super.anInt35);
        if(anInt817 > 0 && super.anInt33 >= 494 && super.anInt34 >= anInt669 - 66)
            super.anInt36 = 0;
        if(aClass1_812.method134(anInt814))
        {
            String s = aClass1_812.method166(anInt814);
            aClass1_812.method165(anInt814, "");
            if(s.startsWith("::"))
            {
                if(s.equalsIgnoreCase("::lostcon") && !aBoolean647)
                    super.aClass10_Sub1_614.method317();
                else
                if(s.equalsIgnoreCase("::closecon") && !aBoolean647)
                    method24();
                else
                    method39(s.substring(2));
            } else
            {
                int k3 = Class13.method391(s);
                method38(Class13.aByteArray425, k3);
                s = Class13.method390(Class13.aByteArray425, 0, k3);
                s = Class12.method365(s);
                aClass15_716.anInt536 = 150;
                aClass15_716.aString535 = s;
                method77(aClass15_716.aString521 + ": " + s, 2);
            }
        }
        if(anInt817 == 0)
        {
            for(int l1 = 0; l1 < anInt818; l1++)
                if(anIntArray820[l1] > 0)
                    anIntArray820[l1]--;

        }
        if(anInt910 != 0)
            super.anInt36 = 0;
        if(aBoolean848 || aBoolean821)
        {
            if(super.anInt35 != 0)
                anInt858++;
            else
                anInt858 = 0;
            if(anInt858 > 600)
                anInt859 += 5000;
            else
            if(anInt858 > 450)
                anInt859 += 500;
            else
            if(anInt858 > 300)
                anInt859 += 50;
            else
            if(anInt858 > 150)
                anInt859 += 5;
            else
            if(anInt858 > 50)
                anInt859++;
            else
            if(anInt858 > 20 && (anInt858 & 5) == 0)
                anInt859++;
        } else
        {
            anInt858 = 0;
            anInt859 = 0;
        }
        if(super.anInt36 == 1)
            anInt650 = 1;
        else
        if(super.anInt36 == 2)
            anInt650 = 2;
        aClass6_664.method267(super.anInt33, super.anInt34);
        super.anInt36 = 0;
        if(aBoolean789)
        {
            if(anInt706 == 0 || aBoolean788)
            {
                if(super.aBoolean26)
                {
                    anInt705 = anInt705 + 1 & 7;
                    super.aBoolean26 = false;
                    if(!aBoolean702)
                    {
                        if((anInt705 & 1) == 0)
                            anInt705 = anInt705 + 1 & 7;
                        for(int i2 = 0; i2 < 8; i2++)
                        {
                            if(method81(anInt705))
                                break;
                            anInt705 = anInt705 + 1 & 7;
                        }

                    }
                }
                if(super.aBoolean27)
                {
                    anInt705 = anInt705 + 7 & 7;
                    super.aBoolean27 = false;
                    if(!aBoolean702)
                    {
                        if((anInt705 & 1) == 0)
                            anInt705 = anInt705 + 7 & 7;
                        for(int j2 = 0; j2 < 8; j2++)
                        {
                            if(method81(anInt705))
                                break;
                            anInt705 = anInt705 + 7 & 7;
                        }

                    }
                }
            }
        } else
        if(super.aBoolean26)
            anInt707 = anInt707 + 2 & 0xff;
        else
        if(super.aBoolean27)
            anInt707 = anInt707 - 2 & 0xff;
        if(aBoolean702 && anInt701 > 550)
            anInt701 -= 4;
        else
        if(!aBoolean702 && anInt701 < 750)
            anInt701 += 4;
        if(anInt686 > 0)
            anInt686--;
        else
        if(anInt686 < 0)
            anInt686++;
        aClass6_664.method297(17);
        anInt679++;
        if(anInt679 > 5)
        {
            anInt679 = 0;
            anInt680 = (anInt680 + 1) % 3;
            anInt681 = (anInt681 + 1) % 4;
            anInt682 = (anInt682 + 1) % 5;
        }
        for(int k2 = 0; k2 < anInt735; k2++)
        {
            int l3 = anIntArray737[k2];
            int l4 = anIntArray738[k2];
            if(l3 >= 0 && l4 >= 0 && l3 < 96 && l4 < 96 && anIntArray739[k2] == 74)
                aClass2Array736[k2].method187(1, 0, 0);
        }

        for(int i4 = 0; i4 < anInt1015; i4++)
        {
            anIntArray1018[i4]++;
            if(anIntArray1018[i4] > 50)
            {
                anInt1015--;
                for(int i5 = i4; i5 < anInt1015; i5++)
                {
                    anIntArray1016[i5] = anIntArray1016[i5 + 1];
                    anIntArray1017[i5] = anIntArray1017[i5 + 1];
                    anIntArray1018[i5] = anIntArray1018[i5 + 1];
                    anIntArray1019[i5] = anIntArray1019[i5 + 1];
                }

            }
        }

    }

    public void method77(String s, int i)
    {
        if(i == 2 || i == 4 || i == 6)
        {
            for(; s.length() > 5 && s.charAt(0) == '@' && s.charAt(4) == '@'; s = s.substring(5));
            int j = s.indexOf(":");
            if(j != -1)
            {
                String s1 = s.substring(0, j);
                long l = Class11.method353(s1);
                for(int i1 = 0; i1 < super.anInt621; i1++)
                    if(super.aLongArray622[i1] == l)
                        return;

            }
        }
        if(i == 2)
            s = "@yel@" + s;
        if(i == 3 || i == 4)
            s = "@whi@" + s;
        if(i == 6)
            s = "@cya@" + s;
        if(anInt817 != 0)
        {
            if(i == 4 || i == 3)
                anInt808 = 200;
            if(i == 2 && anInt817 != 1)
                anInt809 = 200;
            if(i == 5 && anInt817 != 2)
                anInt810 = 200;
            if(i == 6 && anInt817 != 3)
                anInt811 = 200;
            if(i == 3 && anInt817 != 0)
                anInt817 = 0;
            if(i == 6 && anInt817 != 3 && anInt817 != 0)
                anInt817 = 0;
        }
        for(int k = anInt818 - 1; k > 0; k--)
        {
            aStringArray819[k] = aStringArray819[k - 1];
            anIntArray820[k] = anIntArray820[k - 1];
        }

        aStringArray819[0] = s;
        anIntArray820[0] = 300;
        if(i == 2)
            if(aClass1_812.anIntArray60[anInt813] == aClass1_812.anIntArray61[anInt813] - 4)
                aClass1_812.method164(anInt813, s, true);
            else
                aClass1_812.method164(anInt813, s, false);
        if(i == 5)
            if(aClass1_812.anIntArray60[anInt815] == aClass1_812.anIntArray61[anInt815] - 4)
                aClass1_812.method164(anInt815, s, true);
            else
                aClass1_812.method164(anInt815, s, false);
        if(i == 6)
        {
            if(aClass1_812.anIntArray60[anInt816] == aClass1_812.anIntArray61[anInt816] - 4)
            {
                aClass1_812.method164(anInt816, s, true);
                return;
            }
            aClass1_812.method164(anInt816, s, false);
        }
    }

    public void method47(String s)
    {
        if(s.startsWith("@bor@"))
        {
            method77(s, 4);
            return;
        }
        if(s.startsWith("@que@"))
        {
            method77("@whi@" + s, 5);
            return;
        }
        if(s.startsWith("@pri@"))
        {
            method77(s, 6);
            return;
        } else
        {
            method77(s, 3);
            return;
        }
    }

    public Class15 method78(int i, int j, int k, int l)
    {
        if(aClass15Array713[i] == null)
        {
            aClass15Array713[i] = new Class15();
            aClass15Array713[i].anInt522 = i;
            aClass15Array713[i].anInt523 = 0;
        }
        Class15 class15 = aClass15Array713[i];
        boolean flag = false;
        for(int i1 = 0; i1 < anInt711; i1++)
        {
            if(aClass15Array715[i1].anInt522 != i)
                continue;
            flag = true;
            break;
        }

        if(flag)
        {
            class15.anInt529 = l;
            int j1 = class15.anInt531;
            if(j != class15.anIntArray532[j1] || k != class15.anIntArray533[j1])
            {
                class15.anInt531 = j1 = (j1 + 1) % 10;
                class15.anIntArray532[j1] = j;
                class15.anIntArray533[j1] = k;
            }
        } else
        {
            class15.anInt522 = i;
            class15.anInt530 = 0;
            class15.anInt531 = 0;
            class15.anIntArray532[0] = class15.anInt524 = j;
            class15.anIntArray533[0] = class15.anInt525 = k;
            class15.anInt529 = class15.anInt528 = l;
            class15.anInt527 = 0;
        }
        aClass15Array714[anInt710++] = class15;
        return class15;
    }

    public Class15 method79(int i, int j, int k, int l, int i1)
    {
        if(aClass15Array724[i] == null)
        {
            aClass15Array724[i] = new Class15();
            aClass15Array724[i].anInt522 = i;
        }
        Class15 class15 = aClass15Array724[i];
        boolean flag = false;
        for(int j1 = 0; j1 < anInt723; j1++)
        {
            if(aClass15Array726[j1].anInt522 != i)
                continue;
            flag = true;
            break;
        }

        if(flag)
        {
            class15.anInt526 = i1;
            class15.anInt529 = l;
            int k1 = class15.anInt531;
            if(j != class15.anIntArray532[k1] || k != class15.anIntArray533[k1])
            {
                class15.anInt531 = k1 = (k1 + 1) % 10;
                class15.anIntArray532[k1] = j;
                class15.anIntArray533[k1] = k;
            }
        } else
        {
            class15.anInt522 = i;
            class15.anInt530 = 0;
            class15.anInt531 = 0;
            class15.anIntArray532[0] = class15.anInt524 = j;
            class15.anIntArray533[0] = class15.anInt525 = k;
            class15.anInt526 = i1;
            class15.anInt529 = class15.anInt528 = l;
            class15.anInt527 = 0;
        }
        aClass15Array725[anInt722++] = class15;
        return class15;
    }

    public void method46(int i, int j, byte abyte0[])
    {
        try
        {
            if(i == 255)
            {
                anInt711 = anInt710;
                for(int k = 0; k < anInt711; k++)
                    aClass15Array715[k] = aClass15Array714[k];

                int l7 = 8;
                anInt717 = Class11.method349(abyte0, l7, 11);
                l7 += 11;
                anInt718 = Class11.method349(abyte0, l7, 13);
                l7 += 13;
                int i14 = Class11.method349(abyte0, l7, 4);
                l7 += 4;
                boolean flag1 = method100(anInt717, anInt718);
                anInt717 -= anInt694;
                anInt718 -= anInt695;
                int i23 = anInt717 * anInt666 + 64;
                int i26 = anInt718 * anInt666 + 64;
                if(flag1)
                {
                    aClass15_716.anInt531 = 0;
                    aClass15_716.anInt530 = 0;
                    aClass15_716.anInt524 = aClass15_716.anIntArray532[0] = i23;
                    aClass15_716.anInt525 = aClass15_716.anIntArray533[0] = i26;
                }
                anInt710 = 0;
                aClass15_716 = method78(anInt719, i23, i26, i14);
                int j29 = Class11.method349(abyte0, l7, 8);
                l7 += 8;
                for(int i34 = 0; i34 < j29; i34++)
                {
                    Class15 class15_3 = aClass15Array715[i34 + 1];
                    int l39 = Class11.method349(abyte0, l7, 1);
                    l7++;
                    if(l39 != 0)
                    {
                        int l41 = Class11.method349(abyte0, l7, 1);
                        l7++;
                        if(l41 == 0)
                        {
                            int i43 = Class11.method349(abyte0, l7, 3);
                            l7 += 3;
                            int i44 = class15_3.anInt531;
                            int k44 = class15_3.anIntArray532[i44];
                            int l44 = class15_3.anIntArray533[i44];
                            if(i43 == 2 || i43 == 1 || i43 == 3)
                                k44 += anInt666;
                            if(i43 == 6 || i43 == 5 || i43 == 7)
                                k44 -= anInt666;
                            if(i43 == 4 || i43 == 3 || i43 == 5)
                                l44 += anInt666;
                            if(i43 == 0 || i43 == 1 || i43 == 7)
                                l44 -= anInt666;
                            class15_3.anInt529 = i43;
                            class15_3.anInt531 = i44 = (i44 + 1) % 10;
                            class15_3.anIntArray532[i44] = k44;
                            class15_3.anIntArray533[i44] = l44;
                        } else
                        {
                            int j43 = Class11.method349(abyte0, l7, 4);
                            if((j43 & 0xc) == 12)
                            {
                                l7 += 2;
                                continue;
                            }
                            class15_3.anInt529 = Class11.method349(abyte0, l7, 4);
                            l7 += 4;
                        }
                    }
                    aClass15Array714[anInt710++] = class15_3;
                }

                int j37 = 0;
                while(l7 + 24 < j * 8) 
                {
                    int i40 = Class11.method349(abyte0, l7, 11);
                    l7 += 11;
                    int i42 = Class11.method349(abyte0, l7, 5);
                    l7 += 5;
                    if(i42 > 15)
                        i42 -= 32;
                    int k43 = Class11.method349(abyte0, l7, 5);
                    l7 += 5;
                    if(k43 > 15)
                        k43 -= 32;
                    int j14 = Class11.method349(abyte0, l7, 4);
                    l7 += 4;
                    int j44 = Class11.method349(abyte0, l7, 1);
                    l7++;
                    int j23 = (anInt717 + i42) * anInt666 + 64;
                    int j26 = (anInt718 + k43) * anInt666 + 64;
                    method78(i40, j23, j26, j14);
                    if(j44 == 0)
                        anIntArray727[j37++] = i40;
                }
                if(j37 > 0)
                {
                    super.aClass10_Sub1_614.method334(254, 120);
                    super.aClass10_Sub1_614.method328(j37);
                    for(int j40 = 0; j40 < j37; j40++)
                    {
                        Class15 class15_4 = aClass15Array713[anIntArray727[j40]];
                        super.aClass10_Sub1_614.method328(class15_4.anInt522);
                        super.aClass10_Sub1_614.method328(class15_4.anInt523);
                    }

                    super.aClass10_Sub1_614.method336();
                    j37 = 0;
                    return;
                }
            } else
            {
                if(i == 254)
                {
                    for(int l = 1; l < j;)
                        if(Class11.method343(abyte0[l]) == 255)
                        {
                            int i8 = 0;
                            int k14 = anInt717 + abyte0[l + 1] >> 3;
                            int j19 = anInt718 + abyte0[l + 2] >> 3;
                            l += 3;
                            for(int k23 = 0; k23 < anInt729; k23++)
                            {
                                int k26 = (anIntArray730[k23] >> 3) - k14;
                                int k29 = (anIntArray731[k23] >> 3) - j19;
                                if(k26 != 0 || k29 != 0)
                                {
                                    if(k23 != i8)
                                    {
                                        anIntArray730[i8] = anIntArray730[k23];
                                        anIntArray731[i8] = anIntArray731[k23];
                                        anIntArray732[i8] = anIntArray732[k23];
                                        anIntArray733[i8] = anIntArray733[k23];
                                    }
                                    i8++;
                                }
                            }

                            anInt729 = i8;
                        } else
                        {
                            int j8 = Class11.method344(abyte0, l);
                            l += 2;
                            int l14 = anInt717 + abyte0[l++];
                            int k19 = anInt718 + abyte0[l++];
                            if((j8 & 0x8000) == 0)
                            {
                                anIntArray730[anInt729] = l14;
                                anIntArray731[anInt729] = k19;
                                anIntArray732[anInt729] = j8;
                                anIntArray733[anInt729] = 0;
                                for(int l23 = 0; l23 < anInt735; l23++)
                                {
                                    if(anIntArray737[l23] != l14 || anIntArray738[l23] != k19)
                                        continue;
                                    anIntArray733[anInt729] = Class14.anIntArray479[anIntArray739[l23]];
                                    break;
                                }

                                anInt729++;
                            } else
                            {
                                j8 &= 0x7fff;
                                int i24 = 0;
                                for(int l26 = 0; l26 < anInt729; l26++)
                                    if(anIntArray730[l26] != l14 || anIntArray731[l26] != k19 || anIntArray732[l26] != j8)
                                    {
                                        if(l26 != i24)
                                        {
                                            anIntArray730[i24] = anIntArray730[l26];
                                            anIntArray731[i24] = anIntArray731[l26];
                                            anIntArray732[i24] = anIntArray732[l26];
                                            anIntArray733[i24] = anIntArray733[l26];
                                        }
                                        i24++;
                                    } else
                                    {
                                        j8 = -123;
                                    }

                                anInt729 = i24;
                            }
                        }

                    return;
                }
                if(i == 253)
                {
                    for(int i1 = 1; i1 < j;)
                        if(Class11.method343(abyte0[i1]) == 255)
                        {
                            int k8 = 0;
                            int i15 = anInt717 + abyte0[i1 + 1] >> 3;
                            int l19 = anInt718 + abyte0[i1 + 2] >> 3;
                            i1 += 3;
                            for(int j24 = 0; j24 < anInt735; j24++)
                            {
                                int i27 = (anIntArray737[j24] >> 3) - i15;
                                int l29 = (anIntArray738[j24] >> 3) - l19;
                                if(i27 != 0 || l29 != 0)
                                {
                                    if(j24 != k8)
                                    {
                                        aClass2Array736[k8] = aClass2Array736[j24];
                                        aClass2Array736[k8].anInt130 = k8;
                                        anIntArray737[k8] = anIntArray737[j24];
                                        anIntArray738[k8] = anIntArray738[j24];
                                        anIntArray739[k8] = anIntArray739[j24];
                                        anIntArray740[k8] = anIntArray740[j24];
                                    }
                                    k8++;
                                } else
                                {
                                    aClass6_664.method260(aClass2Array736[j24]);
                                    aClass17_689.method404(anIntArray737[j24], anIntArray738[j24], anIntArray739[j24]);
                                }
                            }

                            anInt735 = k8;
                        } else
                        {
                            int l8 = Class11.method344(abyte0, i1);
                            i1 += 2;
                            int j15 = anInt717 + abyte0[i1++];
                            int i20 = anInt718 + abyte0[i1++];
                            int k24 = 0;
                            for(int j27 = 0; j27 < anInt735; j27++)
                                if(anIntArray737[j27] != j15 || anIntArray738[j27] != i20)
                                {
                                    if(j27 != k24)
                                    {
                                        aClass2Array736[k24] = aClass2Array736[j27];
                                        aClass2Array736[k24].anInt130 = k24;
                                        anIntArray737[k24] = anIntArray737[j27];
                                        anIntArray738[k24] = anIntArray738[j27];
                                        anIntArray739[k24] = anIntArray739[j27];
                                        anIntArray740[k24] = anIntArray740[j27];
                                    }
                                    k24++;
                                } else
                                {
                                    aClass6_664.method260(aClass2Array736[j27]);
                                    aClass17_689.method404(anIntArray737[j27], anIntArray738[j27], anIntArray739[j27]);
                                }

                            anInt735 = k24;
                            if(l8 != 60000)
                            {
                                int i30 = aClass17_689.method418(j15, i20);
                                int j34;
                                int k37;
                                if(i30 == 0 || i30 == 4)
                                {
                                    j34 = Class14.anIntArray476[l8];
                                    k37 = Class14.anIntArray477[l8];
                                } else
                                {
                                    k37 = Class14.anIntArray476[l8];
                                    j34 = Class14.anIntArray477[l8];
                                }
                                int k40 = ((j15 + j15 + j34) * anInt666) / 2;
                                int j42 = ((i20 + i20 + k37) * anInt666) / 2;
                                int l43 = Class14.anIntArray475[l8];
                                Class2 class2_1 = aClass2Array741[l43].method202();
                                aClass6_664.method259(class2_1);
                                class2_1.anInt130 = anInt735;
                                class2_1.method187(0, i30 * 32, 0);
                                class2_1.method189(k40, -aClass17_689.method409(k40, j42), j42);
                                class2_1.method183(true, 48, 48, -50, -10, -50);
                                aClass17_689.method403(j15, i20, l8);
                                if(l8 == 74)
                                    class2_1.method189(0, -480, 0);
                                anIntArray737[anInt735] = j15;
                                anIntArray738[anInt735] = i20;
                                anIntArray739[anInt735] = l8;
                                anIntArray740[anInt735] = i30;
                                aClass2Array736[anInt735++] = class2_1;
                            }
                        }

                    return;
                }
                if(i == 252)
                {
                    int j1 = 1;
                    anInt753 = abyte0[j1++] & 0xff;
                    for(int i9 = 0; i9 < anInt753; i9++)
                    {
                        int k15 = Class11.method344(abyte0, j1);
                        j1 += 2;
                        anIntArray754[i9] = k15 & 0x7fff;
                        anIntArray756[i9] = k15 / 32768;
                        if(Class14.anIntArray435[k15 & 0x7fff] == 0)
                        {
                            anIntArray755[i9] = Class11.method348(abyte0, j1);
                            if(anIntArray755[i9] >= 128)
                                j1 += 4;
                            else
                                j1++;
                        } else
                        {
                            anIntArray755[i9] = 1;
                        }
                    }

                    return;
                }
                if(i == 250)
                {
                    int k1 = Class11.method344(abyte0, 1);
                    int j9 = 3;
                    for(int l15 = 0; l15 < k1; l15++)
                    {
                        int j20 = Class11.method344(abyte0, j9);
                        j9 += 2;
                        Class15 class15 = aClass15Array713[j20];
                        byte byte6 = abyte0[j9];
                        j9++;
                        if(byte6 == 0)
                        {
                            int j30 = Class11.method344(abyte0, j9);
                            j9 += 2;
                            if(class15 != null)
                            {
                                class15.anInt538 = 150;
                                class15.anInt537 = j30;
                            }
                        } else
                        if(byte6 == 1)
                        {
                            byte byte7 = abyte0[j9];
                            j9++;
                            if(class15 != null)
                            {
                                String s2 = Class12.method365(Class13.method390(abyte0, j9, byte7));
                                boolean flag3 = false;
                                for(int l40 = 0; l40 < super.anInt621; l40++)
                                    if(super.aLongArray622[l40] == class15.aLong520)
                                        flag3 = true;

                                if(!flag3)
                                {
                                    class15.anInt536 = 150;
                                    class15.aString535 = s2;
                                    method77(class15.aString521 + ": " + class15.aString535, 2);
                                }
                            }
                            j9 += byte7;
                        } else
                        if(byte6 == 2)
                        {
                            int k30 = Class11.method343(abyte0[j9]);
                            j9++;
                            int k34 = Class11.method343(abyte0[j9]);
                            j9++;
                            int l37 = Class11.method343(abyte0[j9]);
                            j9++;
                            if(class15 != null)
                            {
                                class15.anInt539 = k30;
                                class15.anInt540 = k34;
                                class15.anInt541 = l37;
                                class15.anInt542 = 200;
                                if(class15 == aClass15_716)
                                {
                                    anIntArray761[3] = k34;
                                    anIntArray762[3] = l37;
                                    aBoolean899 = false;
                                    aBoolean906 = false;
                                }
                            }
                        } else
                        if(byte6 == 3)
                        {
                            int l30 = Class11.method344(abyte0, j9);
                            j9 += 2;
                            int l34 = Class11.method344(abyte0, j9);
                            j9 += 2;
                            if(class15 != null)
                            {
                                class15.anInt548 = l30;
                                class15.anInt550 = l34;
                                class15.anInt549 = -1;
                                class15.anInt551 = anInt678;
                            }
                        } else
                        if(byte6 == 4)
                        {
                            int i31 = Class11.method344(abyte0, j9);
                            j9 += 2;
                            int i35 = Class11.method344(abyte0, j9);
                            j9 += 2;
                            if(class15 != null)
                            {
                                class15.anInt548 = i31;
                                class15.anInt549 = i35;
                                class15.anInt550 = -1;
                                class15.anInt551 = anInt678;
                            }
                        } else
                        if(byte6 == 5)
                        {
                            if(class15 != null)
                            {
                                class15.anInt523 = Class11.method344(abyte0, j9);
                                j9 += 2;
                                class15.aLong520 = Class11.method346(abyte0, j9);
                                j9 += 8;
                                class15.aString521 = Class11.method354(class15.aLong520);
                                int j31 = Class11.method343(abyte0[j9]);
                                j9++;
                                for(int j35 = 0; j35 < j31; j35++)
                                {
                                    class15.anIntArray534[j35] = Class11.method343(abyte0[j9]);
                                    j9++;
                                }

                                for(int i38 = j31; i38 < 12; i38++)
                                    class15.anIntArray534[i38] = 0;

                                class15.anInt544 = abyte0[j9++] & 0xff;
                                class15.anInt545 = abyte0[j9++] & 0xff;
                                class15.anInt546 = abyte0[j9++] & 0xff;
                                class15.anInt547 = abyte0[j9++] & 0xff;
                                class15.anInt543 = abyte0[j9++] & 0xff;
                                class15.anInt554 = abyte0[j9++] & 0xff;
                            } else
                            {
                                j9 += 14;
                                int k31 = Class11.method343(abyte0[j9]);
                                j9 += k31 + 1;
                            }
                        } else
                        if(byte6 == 6)
                        {
                            byte byte8 = abyte0[j9];
                            j9++;
                            if(class15 != null)
                            {
                                String s3 = Class13.method390(abyte0, j9, byte8);
                                class15.anInt536 = 150;
                                class15.aString535 = s3;
                                if(class15 == aClass15_716)
                                    method77(class15.aString521 + ": " + class15.aString535, 5);
                            }
                            j9 += byte8;
                        }
                    }

                    return;
                }
                if(i == 249)
                {
                    for(int l1 = 1; l1 < j;)
                        if(Class11.method343(abyte0[l1]) == 255)
                        {
                            int k9 = 0;
                            int i16 = anInt717 + abyte0[l1 + 1] >> 3;
                            int k20 = anInt718 + abyte0[l1 + 2] >> 3;
                            l1 += 3;
                            for(int l24 = 0; l24 < anInt744; l24++)
                            {
                                int k27 = (anIntArray746[l24] >> 3) - i16;
                                int l31 = (anIntArray747[l24] >> 3) - k20;
                                if(k27 != 0 || l31 != 0)
                                {
                                    if(l24 != k9)
                                    {
                                        aClass2Array745[k9] = aClass2Array745[l24];
                                        aClass2Array745[k9].anInt130 = k9 + 10000;
                                        anIntArray746[k9] = anIntArray746[l24];
                                        anIntArray747[k9] = anIntArray747[l24];
                                        anIntArray748[k9] = anIntArray748[l24];
                                        anIntArray749[k9] = anIntArray749[l24];
                                    }
                                    k9++;
                                } else
                                {
                                    aClass6_664.method260(aClass2Array745[l24]);
                                    aClass17_689.method402(anIntArray746[l24], anIntArray747[l24], anIntArray748[l24], anIntArray749[l24]);
                                }
                            }

                            anInt744 = k9;
                        } else
                        {
                            int l9 = Class11.method344(abyte0, l1);
                            l1 += 2;
                            int j16 = anInt717 + abyte0[l1++];
                            int l20 = anInt718 + abyte0[l1++];
                            byte byte5 = abyte0[l1++];
                            int l27 = 0;
                            for(int i32 = 0; i32 < anInt744; i32++)
                                if(anIntArray746[i32] != j16 || anIntArray747[i32] != l20 || anIntArray748[i32] != byte5)
                                {
                                    if(i32 != l27)
                                    {
                                        aClass2Array745[l27] = aClass2Array745[i32];
                                        aClass2Array745[l27].anInt130 = l27 + 10000;
                                        anIntArray746[l27] = anIntArray746[i32];
                                        anIntArray747[l27] = anIntArray747[i32];
                                        anIntArray748[l27] = anIntArray748[i32];
                                        anIntArray749[l27] = anIntArray749[i32];
                                    }
                                    l27++;
                                } else
                                {
                                    aClass6_664.method260(aClass2Array745[i32]);
                                    aClass17_689.method402(anIntArray746[i32], anIntArray747[i32], anIntArray748[i32], anIntArray749[i32]);
                                }

                            anInt744 = l27;
                            if(l9 != 65535)
                            {
                                aClass17_689.method401(j16, l20, byte5, l9);
                                Class2 class2 = method101(j16, l20, byte5, l9, anInt744);
                                aClass2Array745[anInt744] = class2;
                                anIntArray746[anInt744] = j16;
                                anIntArray747[anInt744] = l20;
                                anIntArray749[anInt744] = l9;
                                anIntArray748[anInt744++] = byte5;
                            }
                        }

                    return;
                }
                if(i == 248)
                {
                    anInt723 = anInt722;
                    anInt722 = 0;
                    for(int i2 = 0; i2 < anInt723; i2++)
                        aClass15Array726[i2] = aClass15Array725[i2];

                    int i10 = 8;
                    int k16 = Class11.method349(abyte0, i10, 8);
                    i10 += 8;
                    for(int i21 = 0; i21 < k16; i21++)
                    {
                        Class15 class15_1 = aClass15Array726[i21];
                        int i28 = Class11.method349(abyte0, i10, 1);
                        i10++;
                        if(i28 != 0)
                        {
                            int j32 = Class11.method349(abyte0, i10, 1);
                            i10++;
                            if(j32 == 0)
                            {
                                int k35 = Class11.method349(abyte0, i10, 3);
                                i10 += 3;
                                int j38 = class15_1.anInt531;
                                int i41 = class15_1.anIntArray532[j38];
                                int k42 = class15_1.anIntArray533[j38];
                                if(k35 == 2 || k35 == 1 || k35 == 3)
                                    i41 += anInt666;
                                if(k35 == 6 || k35 == 5 || k35 == 7)
                                    i41 -= anInt666;
                                if(k35 == 4 || k35 == 3 || k35 == 5)
                                    k42 += anInt666;
                                if(k35 == 0 || k35 == 1 || k35 == 7)
                                    k42 -= anInt666;
                                class15_1.anInt529 = k35;
                                class15_1.anInt531 = j38 = (j38 + 1) % 10;
                                class15_1.anIntArray532[j38] = i41;
                                class15_1.anIntArray533[j38] = k42;
                            } else
                            {
                                int l35 = Class11.method349(abyte0, i10, 4);
                                if((l35 & 0xc) == 12)
                                {
                                    i10 += 2;
                                    continue;
                                }
                                class15_1.anInt529 = Class11.method349(abyte0, i10, 4);
                                i10 += 4;
                            }
                        }
                        aClass15Array725[anInt722++] = class15_1;
                    }

                    while(i10 + 34 < j * 8) 
                    {
                        int i25 = Class11.method349(abyte0, i10, 12);
                        i10 += 12;
                        int j28 = Class11.method349(abyte0, i10, 5);
                        i10 += 5;
                        if(j28 > 15)
                            j28 -= 32;
                        int k32 = Class11.method349(abyte0, i10, 5);
                        i10 += 5;
                        if(k32 > 15)
                            k32 -= 32;
                        int i36 = Class11.method349(abyte0, i10, 4);
                        i10 += 4;
                        int k38 = (anInt717 + j28) * anInt666 + 64;
                        int j41 = (anInt718 + k32) * anInt666 + 64;
                        int l42 = Class11.method349(abyte0, i10, 10);
                        i10 += 10;
                        if(l42 >= Class14.anInt441)
                            l42 = 24;
                        method79(i25, k38, j41, i36, l42);
                    }
                    return;
                }
                if(i == 247)
                {
                    int j2 = Class11.method344(abyte0, 1);
                    int j10 = 3;
                    for(int l16 = 0; l16 < j2; l16++)
                    {
                        int j21 = Class11.method344(abyte0, j10);
                        j10 += 2;
                        Class15 class15_2 = aClass15Array724[j21];
                        int k28 = Class11.method343(abyte0[j10]);
                        j10++;
                        if(k28 == 1)
                        {
                            int l32 = Class11.method344(abyte0, j10);
                            j10 += 2;
                            byte byte9 = abyte0[j10];
                            j10++;
                            if(class15_2 != null)
                            {
                                String s4 = Class13.method390(abyte0, j10, byte9);
                                class15_2.anInt536 = 150;
                                class15_2.aString535 = s4;
                                if(l32 == aClass15_716.anInt522)
                                    method77("@yel@" + Class14.aStringArray442[class15_2.anInt526] + ": " + class15_2.aString535, 5);
                            }
                            j10 += byte9;
                        } else
                        if(k28 == 2)
                        {
                            int i33 = Class11.method343(abyte0[j10]);
                            j10++;
                            int j36 = Class11.method343(abyte0[j10]);
                            j10++;
                            int l38 = Class11.method343(abyte0[j10]);
                            j10++;
                            if(class15_2 != null)
                            {
                                class15_2.anInt539 = i33;
                                class15_2.anInt540 = j36;
                                class15_2.anInt541 = l38;
                                class15_2.anInt542 = 200;
                            }
                        }
                    }

                    return;
                }
                if(i == 246)
                {
                    aBoolean888 = true;
                    int k2 = Class11.method343(abyte0[1]);
                    anInt889 = k2;
                    int k10 = 2;
                    for(int i17 = 0; i17 < k2; i17++)
                    {
                        int k21 = Class11.method343(abyte0[k10]);
                        k10++;
                        aStringArray890[i17] = new String(abyte0, k10, k21);
                        k10 += k21;
                    }

                    return;
                }
                if(i == 245)
                {
                    aBoolean888 = false;
                    return;
                }
                if(i == 244)
                {
                    aBoolean912 = true;
                    anInt719 = Class11.method344(abyte0, 1);
                    anInt690 = Class11.method344(abyte0, 3);
                    anInt691 = Class11.method344(abyte0, 5);
                    anInt696 = Class11.method344(abyte0, 7);
                    anInt692 = Class11.method344(abyte0, 9);
                    anInt691 -= anInt696 * anInt692;
                    return;
                }
                if(i == 243)
                {
                    int l2 = 1;
                    for(int l10 = 0; l10 < 18; l10++)
                        anIntArray761[l10] = Class11.method343(abyte0[l2++]);

                    for(int j17 = 0; j17 < 18; j17++)
                        anIntArray762[j17] = Class11.method343(abyte0[l2++]);

                    for(int l21 = 0; l21 < 18; l21++)
                    {
                        anIntArray763[l21] = Class11.method345(abyte0, l2);
                        l2 += 4;
                    }

                    anInt765 = Class11.method343(abyte0[l2++]);
                    return;
                }
                if(i == 242)
                {
                    for(int i3 = 0; i3 < 5; i3++)
                        anIntArray764[i3] = Class11.method343(abyte0[1 + i3]);

                    return;
                }
                if(i == 241)
                {
                    anInt910 = 250;
                    return;
                }
                if(i == 240)
                {
                    int j3 = (j - 1) / 4;
                    for(int i11 = 0; i11 < j3; i11++)
                    {
                        int k17 = anInt717 + Class11.method347(abyte0, 1 + i11 * 4) >> 3;
                        int i22 = anInt718 + Class11.method347(abyte0, 3 + i11 * 4) >> 3;
                        int j25 = 0;
                        for(int l28 = 0; l28 < anInt729; l28++)
                        {
                            int j33 = (anIntArray730[l28] >> 3) - k17;
                            int k36 = (anIntArray731[l28] >> 3) - i22;
                            if(j33 != 0 || k36 != 0)
                            {
                                if(l28 != j25)
                                {
                                    anIntArray730[j25] = anIntArray730[l28];
                                    anIntArray731[j25] = anIntArray731[l28];
                                    anIntArray732[j25] = anIntArray732[l28];
                                    anIntArray733[j25] = anIntArray733[l28];
                                }
                                j25++;
                            }
                        }

                        anInt729 = j25;
                        j25 = 0;
                        for(int k33 = 0; k33 < anInt735; k33++)
                        {
                            int l36 = (anIntArray737[k33] >> 3) - k17;
                            int i39 = (anIntArray738[k33] >> 3) - i22;
                            if(l36 != 0 || i39 != 0)
                            {
                                if(k33 != j25)
                                {
                                    aClass2Array736[j25] = aClass2Array736[k33];
                                    aClass2Array736[j25].anInt130 = j25;
                                    anIntArray737[j25] = anIntArray737[k33];
                                    anIntArray738[j25] = anIntArray738[k33];
                                    anIntArray739[j25] = anIntArray739[k33];
                                    anIntArray740[j25] = anIntArray740[k33];
                                }
                                j25++;
                            } else
                            {
                                aClass6_664.method260(aClass2Array736[k33]);
                                aClass17_689.method404(anIntArray737[k33], anIntArray738[k33], anIntArray739[k33]);
                            }
                        }

                        anInt735 = j25;
                        j25 = 0;
                        for(int i37 = 0; i37 < anInt744; i37++)
                        {
                            int j39 = (anIntArray746[i37] >> 3) - k17;
                            int k41 = (anIntArray747[i37] >> 3) - i22;
                            if(j39 != 0 || k41 != 0)
                            {
                                if(i37 != j25)
                                {
                                    aClass2Array745[j25] = aClass2Array745[i37];
                                    aClass2Array745[j25].anInt130 = j25 + 10000;
                                    anIntArray746[j25] = anIntArray746[i37];
                                    anIntArray747[j25] = anIntArray747[i37];
                                    anIntArray748[j25] = anIntArray748[i37];
                                    anIntArray749[j25] = anIntArray749[i37];
                                }
                                j25++;
                            } else
                            {
                                aClass6_664.method260(aClass2Array745[i37]);
                                aClass17_689.method402(anIntArray746[i37], anIntArray747[i37], anIntArray748[i37], anIntArray749[i37]);
                            }
                        }

                        anInt744 = j25;
                    }

                    return;
                }
                if(i == 239)
                {
                    aBoolean998 = true;
                    return;
                }
                if(i == 238)
                {
                    int k3 = Class11.method344(abyte0, 1);
                    if(aClass15Array713[k3] != null)
                        aString849 = aClass15Array713[k3].aString521;
                    aBoolean848 = true;
                    aBoolean856 = false;
                    aBoolean857 = false;
                    anInt850 = 0;
                    anInt853 = 0;
                    return;
                }
                if(i == 237)
                {
                    aBoolean848 = false;
                    aBoolean861 = false;
                    return;
                }
                if(i == 236)
                {
                    anInt853 = abyte0[1] & 0xff;
                    int l3 = 2;
                    for(int j11 = 0; j11 < anInt853; j11++)
                    {
                        anIntArray854[j11] = Class11.method344(abyte0, l3);
                        l3 += 2;
                        anIntArray855[j11] = Class11.method345(abyte0, l3);
                        l3 += 4;
                    }

                    aBoolean856 = false;
                    aBoolean857 = false;
                    return;
                }
                if(i == 235)
                {
                    byte byte0 = abyte0[1];
                    if(byte0 == 1)
                    {
                        aBoolean856 = true;
                        return;
                    } else
                    {
                        aBoolean856 = false;
                        return;
                    }
                }
                if(i == 234)
                {
                    aBoolean869 = true;
                    int i4 = 1;
                    int k11 = abyte0[i4++] & 0xff;
                    byte byte4 = abyte0[i4++];
                    anInt870 = abyte0[i4++] & 0xff;
                    anInt871 = abyte0[i4++] & 0xff;
                    for(int j22 = 0; j22 < 40; j22++)
                        anIntArray872[j22] = -1;

                    for(int k25 = 0; k25 < k11; k25++)
                    {
                        anIntArray872[k25] = Class11.method344(abyte0, i4);
                        i4 += 2;
                        anIntArray873[k25] = Class11.method344(abyte0, i4);
                        i4 += 2;
                        anIntArray874[k25] = abyte0[i4++];
                    }

                    if(byte4 == 1)
                    {
                        int i29 = 39;
                        for(int l33 = 0; l33 < anInt753; l33++)
                        {
                            if(i29 < k11)
                                break;
                            boolean flag2 = false;
                            for(int k39 = 0; k39 < 40; k39++)
                            {
                                if(anIntArray872[k39] != anIntArray754[l33])
                                    continue;
                                flag2 = true;
                                break;
                            }

                            if(anIntArray754[l33] == 10)
                                flag2 = true;
                            if(!flag2)
                            {
                                anIntArray872[i29] = anIntArray754[l33] & 0x7fff;
                                anIntArray873[i29] = 0;
                                anIntArray874[i29] = 0;
                                i29--;
                            }
                        }

                    }
                    if(anInt875 >= 0 && anInt875 < 40 && anIntArray872[anInt875] != anInt876)
                    {
                        anInt875 = -1;
                        anInt876 = -2;
                        return;
                    }
                } else
                {
                    if(i == 233)
                    {
                        aBoolean869 = false;
                        return;
                    }
                    if(i == 232)
                    {
                        aBoolean972 = true;
                        aClass1_973.method165(anInt975, "");
                        aClass1_973.method165(anInt976, "");
                        aClass1_973.method165(anInt977, "");
                        aClass1_973.method165(anInt978, "");
                        return;
                    }
                    if(i == 229)
                    {
                        byte byte1 = abyte0[1];
                        if(byte1 == 1)
                        {
                            aBoolean857 = true;
                            return;
                        } else
                        {
                            aBoolean857 = false;
                            return;
                        }
                    }
                    if(i == 228)
                    {
                        aBoolean789 = Class11.method343(abyte0[1]) == 1;
                        aBoolean790 = Class11.method343(abyte0[2]) == 1;
                        aBoolean791 = Class11.method343(abyte0[3]) == 1;
                        return;
                    }
                    if(i == 227)
                    {
                        for(int j4 = 0; j4 < j - 1; j4++)
                        {
                            boolean flag = abyte0[j4 + 1] == 1;
                            if(!aBooleanArray787[j4] && flag)
                                method61("prayeron");
                            if(aBooleanArray787[j4] && !flag)
                                method61("prayeroff");
                            aBooleanArray787[j4] = flag;
                        }

                        return;
                    }
                    if(i == 226)
                    {
                        for(int k4 = 0; k4 < anInt784; k4++)
                            aBooleanArray786[k4] = abyte0[k4 + 1] == 1;

                        return;
                    }
                    if(i == 224)
                    {
                        aBoolean950 = true;
                        for(int l4 = 0; l4 < 5; l4++)
                        {
                            anIntArray959[l4] = l4;
                            aStringArray960[l4] = aStringArray1022[anIntArray959[l4]];
                            aClass1_951.method165(anIntArray956[l4], "");
                            aClass1_951.method165(anIntArray955[l4], (l4 + 1) + ": " + aStringArray960[l4]);
                        }

                        return;
                    }
                    if(i == 222)
                    {
                        aBoolean877 = true;
                        int i5 = 1;
                        anInt878 = abyte0[i5++] & 0xff;
                        anInt886 = abyte0[i5++] & 0xff;
                        for(int l11 = 0; l11 < anInt878; l11++)
                        {
                            anIntArray879[l11] = Class11.method344(abyte0, i5);
                            i5 += 2;
                            anIntArray880[l11] = Class11.method348(abyte0, i5);
                            if(anIntArray880[l11] >= 128)
                                i5 += 4;
                            else
                                i5++;
                        }

                        method80();
                        return;
                    }
                    if(i == 221)
                    {
                        aBoolean877 = false;
                        return;
                    }
                    if(i == 220)
                    {
                        int j5 = abyte0[1] & 0xff;
                        anIntArray763[j5] = Class11.method345(abyte0, 2);
                        return;
                    }
                    if(i == 219)
                    {
                        int k5 = Class11.method344(abyte0, 1);
                        if(aClass15Array713[k5] != null)
                            aString822 = aClass15Array713[k5].aString521;
                        aBoolean821 = true;
                        anInt823 = 0;
                        anInt826 = 0;
                        aBoolean829 = false;
                        aBoolean830 = false;
                        aBoolean831 = false;
                        aBoolean832 = false;
                        aBoolean833 = false;
                        aBoolean834 = false;
                        return;
                    }
                    if(i == 218)
                    {
                        aBoolean821 = false;
                        aBoolean835 = false;
                        return;
                    }
                    if(i == 217)
                    {
                        aBoolean861 = true;
                        aBoolean862 = false;
                        aBoolean848 = false;
                        int l5 = 1;
                        aLong860 = Class11.method346(abyte0, l5);
                        l5 += 8;
                        anInt866 = abyte0[l5++] & 0xff;
                        for(int i12 = 0; i12 < anInt866; i12++)
                        {
                            anIntArray867[i12] = Class11.method344(abyte0, l5);
                            l5 += 2;
                            anIntArray868[i12] = Class11.method345(abyte0, l5);
                            l5 += 4;
                        }

                        anInt863 = abyte0[l5++] & 0xff;
                        for(int l17 = 0; l17 < anInt863; l17++)
                        {
                            anIntArray864[l17] = Class11.method344(abyte0, l5);
                            l5 += 2;
                            anIntArray865[l17] = Class11.method345(abyte0, l5);
                            l5 += 4;
                        }

                        return;
                    }
                    if(i == 216)
                    {
                        anInt826 = abyte0[1] & 0xff;
                        int i6 = 2;
                        for(int j12 = 0; j12 < anInt826; j12++)
                        {
                            anIntArray827[j12] = Class11.method344(abyte0, i6);
                            i6 += 2;
                            anIntArray828[j12] = Class11.method345(abyte0, i6);
                            i6 += 4;
                        }

                        aBoolean829 = false;
                        aBoolean830 = false;
                        return;
                    }
                    if(i == 215)
                    {
                        if(abyte0[1] == 1)
                            aBoolean831 = true;
                        else
                            aBoolean831 = false;
                        if(abyte0[2] == 1)
                            aBoolean832 = true;
                        else
                            aBoolean832 = false;
                        if(abyte0[3] == 1)
                            aBoolean833 = true;
                        else
                            aBoolean833 = false;
                        if(abyte0[4] == 1)
                            aBoolean834 = true;
                        else
                            aBoolean834 = false;
                        aBoolean829 = false;
                        aBoolean830 = false;
                        return;
                    }
                    if(i == 214)
                    {
                        int j6 = 1;
                        int k12 = abyte0[j6++] & 0xff;
                        int i18 = Class11.method344(abyte0, j6);
                        j6 += 2;
                        int k22 = Class11.method348(abyte0, j6);
                        if(k22 >= 128)
                            j6 += 4;
                        else
                            j6++;
                        if(k22 == 0)
                        {
                            anInt878--;
                            for(int l25 = k12; l25 < anInt878; l25++)
                            {
                                anIntArray879[l25] = anIntArray879[l25 + 1];
                                anIntArray880[l25] = anIntArray880[l25 + 1];
                            }

                        } else
                        {
                            anIntArray879[k12] = i18;
                            anIntArray880[k12] = k22;
                            if(k12 >= anInt878)
                                anInt878 = k12 + 1;
                        }
                        method80();
                        return;
                    }
                    if(i == 213)
                    {
                        int k6 = 1;
                        int l12 = 1;
                        int j18 = abyte0[k6++] & 0xff;
                        int l22 = Class11.method344(abyte0, k6);
                        k6 += 2;
                        if(Class14.anIntArray435[l22 & 0x7fff] == 0)
                        {
                            l12 = Class11.method348(abyte0, k6);
                            if(l12 >= 128)
                                k6 += 4;
                            else
                                k6++;
                        }
                        anIntArray754[j18] = l22 & 0x7fff;
                        anIntArray756[j18] = l22 / 32768;
                        anIntArray755[j18] = l12;
                        if(j18 >= anInt753)
                        {
                            anInt753 = j18 + 1;
                            return;
                        }
                    } else
                    {
                        if(i == 212)
                        {
                            int l6 = abyte0[1] & 0xff;
                            anInt753--;
                            for(int i13 = l6; i13 < anInt753; i13++)
                            {
                                anIntArray754[i13] = anIntArray754[i13 + 1];
                                anIntArray755[i13] = anIntArray755[i13 + 1];
                                anIntArray756[i13] = anIntArray756[i13 + 1];
                            }

                            return;
                        }
                        if(i == 211)
                        {
                            int i7 = 1;
                            int j13 = abyte0[i7++] & 0xff;
                            anIntArray761[j13] = Class11.method343(abyte0[i7++]);
                            anIntArray762[j13] = Class11.method343(abyte0[i7++]);
                            anIntArray763[j13] = Class11.method345(abyte0, i7);
                            i7 += 4;
                            return;
                        }
                        if(i == 210)
                        {
                            byte byte2 = abyte0[1];
                            if(byte2 == 1)
                            {
                                aBoolean829 = true;
                                return;
                            } else
                            {
                                aBoolean829 = false;
                                return;
                            }
                        }
                        if(i == 209)
                        {
                            byte byte3 = abyte0[1];
                            if(byte3 == 1)
                            {
                                aBoolean830 = true;
                                return;
                            } else
                            {
                                aBoolean830 = false;
                                return;
                            }
                        }
                        if(i == 208)
                        {
                            aBoolean835 = true;
                            aBoolean836 = false;
                            aBoolean821 = false;
                            int j7 = 1;
                            aLong837 = Class11.method346(abyte0, j7);
                            j7 += 8;
                            anInt841 = abyte0[j7++] & 0xff;
                            for(int k13 = 0; k13 < anInt841; k13++)
                            {
                                anIntArray842[k13] = Class11.method344(abyte0, j7);
                                j7 += 2;
                                anIntArray843[k13] = Class11.method345(abyte0, j7);
                                j7 += 4;
                            }

                            anInt838 = abyte0[j7++] & 0xff;
                            for(int k18 = 0; k18 < anInt838; k18++)
                            {
                                anIntArray839[k18] = Class11.method344(abyte0, j7);
                                j7 += 2;
                                anIntArray840[k18] = Class11.method345(abyte0, j7);
                                j7 += 4;
                            }

                            anInt844 = abyte0[j7++] & 0xff;
                            anInt845 = abyte0[j7++] & 0xff;
                            anInt846 = abyte0[j7++] & 0xff;
                            anInt847 = abyte0[j7++] & 0xff;
                            return;
                        }
                        if(i == 207)
                        {
                            String s = new String(abyte0, 1, j - 1);
                            method61(s);
                            return;
                        }
                        if(i == 206)
                        {
                            if(anInt1015 < 50)
                            {
                                int k7 = abyte0[1] & 0xff;
                                int l13 = abyte0[2] + anInt717;
                                int l18 = abyte0[3] + anInt718;
                                anIntArray1019[anInt1015] = k7;
                                anIntArray1018[anInt1015] = 0;
                                anIntArray1016[anInt1015] = l13;
                                anIntArray1017[anInt1015] = l18;
                                anInt1015++;
                                return;
                            }
                        } else
                        if(i == 205)
                        {
                            if(!aBoolean898)
                            {
                                anInt902 = Class11.method345(abyte0, 1);
                                anInt903 = Class11.method345(abyte0, 5);
                                anInt900 = Class11.method345(abyte0, 9);
                                anInt904 = (int)(Math.random() * 6D);
                                aBoolean899 = true;
                                aBoolean898 = true;
                                aString901 = null;
                                return;
                            }
                        } else
                        {
                            if(i == 204)
                            {
                                aString907 = new String(abyte0, 1, j - 1);
                                aBoolean906 = true;
                                aBoolean905 = false;
                                return;
                            }
                            if(i == 203)
                            {
                                aString907 = new String(abyte0, 1, j - 1);
                                aBoolean906 = true;
                                aBoolean905 = true;
                                return;
                            }
                            if(i == 202)
                            {
                                anInt766 = Class11.method344(abyte0, 1);
                                return;
                            }
                            if(i == 201)
                            {
                                if(!aBoolean1020)
                                    anInt767 = anInt766;
                                aBoolean1020 = true;
                                super.aString40 = "";
                                super.aString41 = "";
                                aClass3_Sub1_665.method224(anInt675 + 1, abyte0);
                                aString1021 = null;
                                return;
                            }
                            if(i == 200)
                            {
                                anInt767 = Class11.method344(abyte0, 1);
                                return;
                            }
                            if(i == 199)
                            {
                                aBoolean1020 = false;
                                return;
                            }
                            if(i == 198)
                                aString1021 = "Incorrect - Please wait...";
                        }
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            if(anInt662 < 3)
            {
                super.aClass10_Sub1_614.method334(17, 743);
                super.aClass10_Sub1_614.method331(runtimeexception.toString());
                super.aClass10_Sub1_614.method336();
                super.aClass10_Sub1_614.method334(17, 743);
                super.aClass10_Sub1_614.method331("p-type:" + i + " p-size:" + j);
                super.aClass10_Sub1_614.method336();
                super.aClass10_Sub1_614.method334(17, 743);
                super.aClass10_Sub1_614.method331("rx:" + anInt717 + " ry:" + anInt718 + " num3l:" + anInt735);
                super.aClass10_Sub1_614.method336();
                String s1 = "";
                for(int i19 = 0; i19 < 80 && i19 < j; i19++)
                    s1 = s1 + abyte0[i19] + " ";

                super.aClass10_Sub1_614.method334(17, 743);
                super.aClass10_Sub1_614.method331(s1);
                super.aClass10_Sub1_614.method336();
                anInt662++;
            }
        }
    }

    public void method80()
    {
        anInt881 = anInt878;
        for(int i = 0; i < anInt878; i++)
        {
            anIntArray882[i] = anIntArray879[i];
            anIntArray883[i] = anIntArray880[i];
        }

        for(int j = 0; j < anInt753; j++)
        {
            if(anInt881 >= anInt886)
                break;
            int k = anIntArray754[j];
            boolean flag = false;
            for(int l = 0; l < anInt881; l++)
            {
                if(anIntArray882[l] != k)
                    continue;
                flag = true;
                break;
            }

            if(!flag)
            {
                anIntArray882[anInt881] = k;
                anIntArray883[anInt881] = 0;
                anInt881++;
            }
        }

    }

    public boolean method81(int i)
    {
        int j = aClass15_716.anInt524 / 128;
        int k = aClass15_716.anInt525 / 128;
        for(int l = 2; l >= 1; l--)
        {
            if(i == 1 && ((aClass17_689.anIntArrayArray590[j][k - l] & 0x80) == 128 || (aClass17_689.anIntArrayArray590[j - l][k] & 0x80) == 128 || (aClass17_689.anIntArrayArray590[j - l][k - l] & 0x80) == 128))
                return false;
            if(i == 3 && ((aClass17_689.anIntArrayArray590[j][k + l] & 0x80) == 128 || (aClass17_689.anIntArrayArray590[j - l][k] & 0x80) == 128 || (aClass17_689.anIntArrayArray590[j - l][k + l] & 0x80) == 128))
                return false;
            if(i == 5 && ((aClass17_689.anIntArrayArray590[j][k + l] & 0x80) == 128 || (aClass17_689.anIntArrayArray590[j + l][k] & 0x80) == 128 || (aClass17_689.anIntArrayArray590[j + l][k + l] & 0x80) == 128))
                return false;
            if(i == 7 && ((aClass17_689.anIntArrayArray590[j][k - l] & 0x80) == 128 || (aClass17_689.anIntArrayArray590[j + l][k] & 0x80) == 128 || (aClass17_689.anIntArrayArray590[j + l][k - l] & 0x80) == 128))
                return false;
            if(i == 0 && (aClass17_689.anIntArrayArray590[j][k - l] & 0x80) == 128)
                return false;
            if(i == 2 && (aClass17_689.anIntArrayArray590[j - l][k] & 0x80) == 128)
                return false;
            if(i == 4 && (aClass17_689.anIntArrayArray590[j][k + l] & 0x80) == 128)
                return false;
            if(i == 6 && (aClass17_689.anIntArrayArray590[j + l][k] & 0x80) == 128)
                return false;
        }

        return true;
    }

    public void method82()
    {
        if((anInt705 & 1) == 1 && method81(anInt705))
            return;
        if((anInt705 & 1) == 0 && method81(anInt705))
        {
            if(method81(anInt705 + 1 & 7))
            {
                anInt705 = anInt705 + 1 & 7;
                return;
            }
            if(method81(anInt705 + 7 & 7))
                anInt705 = anInt705 + 7 & 7;
            return;
        }
        int ai[] = {
            1, -1, 2, -2, 3, -3, 4
        };
        for(int i = 0; i < 7; i++)
        {
            if(!method81(anInt705 + ai[i] + 8 & 7))
                continue;
            anInt705 = anInt705 + ai[i] + 8 & 7;
            break;
        }

        if((anInt705 & 1) == 0 && method81(anInt705))
        {
            if(method81(anInt705 + 1 & 7))
            {
                anInt705 = anInt705 + 1 & 7;
                return;
            }
            if(method81(anInt705 + 7 & 7))
                anInt705 = anInt705 + 7 & 7;
        }
    }

    public void method83()
    {
        if(anInt910 != 0)
        {
            aClass3_Sub1_665.method219();
            aClass3_Sub1_665.method252("Oh dear! You are dead...", anInt668 / 2, anInt669 / 2, 7, 0xff0000);
            method85();
            aClass3_Sub1_665.method209(aGraphics663, 0, 0);
            return;
        }
        if(aBoolean998)
        {
            method70();
            return;
        }
        if(aBoolean950)
        {
            method64();
            return;
        }
        if(aBoolean972)
        {
            method67();
            return;
        }
        if(aBoolean1020)
        {
            aClass3_Sub1_665.method219();
            if(Math.random() < 0.14999999999999999D)
                aClass3_Sub1_665.method252("ZZZ", (int)(Math.random() * 80D), (int)(Math.random() * 334D), 5, (int)(Math.random() * 16777215D));
            if(Math.random() < 0.14999999999999999D)
                aClass3_Sub1_665.method252("ZZZ", 512 - (int)(Math.random() * 80D), (int)(Math.random() * 334D), 5, (int)(Math.random() * 16777215D));
            aClass3_Sub1_665.method214(anInt668 / 2 - 100, 160, 200, 40, 0);
            aClass3_Sub1_665.method252("You are sleeping", anInt668 / 2, 50, 7, 0xffff00);
            aClass3_Sub1_665.method252("Fatigue: " + (anInt767 * 100) / 750 + "%", anInt668 / 2, 90, 7, 0xffff00);
            aClass3_Sub1_665.method252("When you want to wake up just use your", anInt668 / 2, 140, 5, 0xffffff);
            aClass3_Sub1_665.method252("keyboard to type the word in the box below", anInt668 / 2, 160, 5, 0xffffff);
            aClass3_Sub1_665.method252(super.aString40 + "*", anInt668 / 2, 180, 5, 65535);
            if(aString1021 == null)
                aClass3_Sub1_665.method229(anInt668 / 2 - 127, 230, anInt675 + 1);
            else
                aClass3_Sub1_665.method252(aString1021, anInt668 / 2, 260, 5, 0xff0000);
            aClass3_Sub1_665.method215(anInt668 / 2 - 128, 229, 257, 42, 0xffffff);
            method85();
            aClass3_Sub1_665.method252("If you can't read the word", anInt668 / 2, 290, 1, 0xffffff);
            aClass3_Sub1_665.method252("@yel@click here@whi@ to get a different one", anInt668 / 2, 305, 1, 0xffffff);
            aClass3_Sub1_665.method209(aGraphics663, 0, 0);
            return;
        }
        if(!aClass17_689.aBoolean592)
            return;
        for(int i = 0; i < 64; i++)
        {
            aClass6_664.method260(aClass17_689.aClass2ArrayArray595[anInt693][i]);
            if(anInt693 == 0)
            {
                aClass6_664.method260(aClass17_689.aClass2ArrayArray594[1][i]);
                aClass6_664.method260(aClass17_689.aClass2ArrayArray595[1][i]);
                aClass6_664.method260(aClass17_689.aClass2ArrayArray594[2][i]);
                aClass6_664.method260(aClass17_689.aClass2ArrayArray595[2][i]);
            }
            aBoolean702 = true;
            if(anInt693 == 0 && (aClass17_689.anIntArrayArray590[aClass15_716.anInt524 / 128][aClass15_716.anInt525 / 128] & 0x80) == 0)
            {
                aClass6_664.method259(aClass17_689.aClass2ArrayArray595[anInt693][i]);
                if(anInt693 == 0)
                {
                    aClass6_664.method259(aClass17_689.aClass2ArrayArray594[1][i]);
                    aClass6_664.method259(aClass17_689.aClass2ArrayArray595[1][i]);
                    aClass6_664.method259(aClass17_689.aClass2ArrayArray594[2][i]);
                    aClass6_664.method259(aClass17_689.aClass2ArrayArray595[2][i]);
                }
                aBoolean702 = false;
            }
        }

        if(anInt680 != anInt683)
        {
            anInt683 = anInt680;
            for(int j = 0; j < anInt735; j++)
            {
                if(anIntArray739[j] == 97)
                    method84(j, "firea" + (anInt680 + 1));
                if(anIntArray739[j] == 274)
                    method84(j, "fireplacea" + (anInt680 + 1));
                if(anIntArray739[j] == 1031)
                    method84(j, "lightning" + (anInt680 + 1));
                if(anIntArray739[j] == 1036)
                    method84(j, "firespell" + (anInt680 + 1));
                if(anIntArray739[j] == 1147)
                    method84(j, "spellcharge" + (anInt680 + 1));
            }

        }
        if(anInt681 != anInt684)
        {
            anInt684 = anInt681;
            for(int k = 0; k < anInt735; k++)
            {
                if(anIntArray739[k] == 51)
                    method84(k, "torcha" + (anInt681 + 1));
                if(anIntArray739[k] == 143)
                    method84(k, "skulltorcha" + (anInt681 + 1));
            }

        }
        if(anInt682 != anInt685)
        {
            anInt685 = anInt682;
            for(int l = 0; l < anInt735; l++)
                if(anIntArray739[l] == 1142)
                    method84(l, "clawspell" + (anInt682 + 1));

        }
        aClass6_664.method263(anInt712);
        anInt712 = 0;
        for(int i1 = 0; i1 < anInt710; i1++)
        {
            Class15 class15 = aClass15Array714[i1];
            if(class15.anInt546 != 255)
            {
                int k1 = class15.anInt524;
                int i2 = class15.anInt525;
                int k2 = -aClass17_689.method409(k1, i2);
                int l3 = aClass6_664.method264(5000 + i1, k1, k2, i2, 145, 220, i1 + 10000);
                anInt712++;
                if(class15 == aClass15_716)
                    aClass6_664.method265(l3);
                if(class15.anInt528 == 8)
                    aClass6_664.method266(l3, -30);
                if(class15.anInt528 == 9)
                    aClass6_664.method266(l3, 30);
            }
        }

        for(int j1 = 0; j1 < anInt710; j1++)
        {
            Class15 class15_1 = aClass15Array714[j1];
            if(class15_1.anInt551 > 0)
            {
                Class15 class15_2 = null;
                if(class15_1.anInt550 != -1)
                    class15_2 = aClass15Array724[class15_1.anInt550];
                else
                if(class15_1.anInt549 != -1)
                    class15_2 = aClass15Array713[class15_1.anInt549];
                if(class15_2 != null)
                {
                    int l2 = class15_1.anInt524;
                    int i4 = class15_1.anInt525;
                    int k6 = -aClass17_689.method409(l2, i4) - 110;
                    int j8 = class15_2.anInt524;
                    int i9 = class15_2.anInt525;
                    int j9 = -aClass17_689.method409(j8, i9) - Class14.anIntArray456[class15_2.anInt526] / 2;
                    int k9 = (l2 * class15_1.anInt551 + j8 * (anInt678 - class15_1.anInt551)) / anInt678;
                    int l9 = (k6 * class15_1.anInt551 + j9 * (anInt678 - class15_1.anInt551)) / anInt678;
                    int i10 = (i4 * class15_1.anInt551 + i9 * (anInt678 - class15_1.anInt551)) / anInt678;
                    aClass6_664.method264(anInt674 + class15_1.anInt548, k9, l9, i10, 32, 32, 0);
                    anInt712++;
                }
            }
        }

        for(int l1 = 0; l1 < anInt722; l1++)
        {
            Class15 class15_3 = aClass15Array725[l1];
            int i3 = class15_3.anInt524;
            int j4 = class15_3.anInt525;
            int l6 = -aClass17_689.method409(i3, j4);
            int k8 = aClass6_664.method264(20000 + l1, i3, l6, j4, Class14.anIntArray455[class15_3.anInt526], Class14.anIntArray456[class15_3.anInt526], l1 + 30000);
            anInt712++;
            if(class15_3.anInt528 == 8)
                aClass6_664.method266(k8, -30);
            if(class15_3.anInt528 == 9)
                aClass6_664.method266(k8, 30);
        }

        for(int j2 = 0; j2 < anInt729; j2++)
        {
            int j3 = anIntArray730[j2] * anInt666 + 64;
            int k4 = anIntArray731[j2] * anInt666 + 64;
            aClass6_664.method264(40000 + anIntArray732[j2], j3, -aClass17_689.method409(j3, k4) - anIntArray733[j2], k4, 96, 64, j2 + 20000);
            anInt712++;
        }

        for(int k3 = 0; k3 < anInt1015; k3++)
        {
            int l4 = anIntArray1016[k3] * anInt666 + 64;
            int i7 = anIntArray1017[k3] * anInt666 + 64;
            int l8 = anIntArray1019[k3];
            if(l8 == 0)
            {
                aClass6_664.method264(50000 + k3, l4, -aClass17_689.method409(l4, i7), i7, 128, 256, k3 + 50000);
                anInt712++;
            }
            if(l8 == 1)
            {
                aClass6_664.method264(50000 + k3, l4, -aClass17_689.method409(l4, i7), i7, 128, 64, k3 + 50000);
                anInt712++;
            }
        }

        aClass3_Sub1_665.aBoolean208 = false;
        aClass3_Sub1_665.method210();
        aClass3_Sub1_665.aBoolean208 = super.aBoolean39;
        if(anInt693 == 3)
        {
            int i5 = 40 + (int)(Math.random() * 3D);
            int j7 = 40 + (int)(Math.random() * 7D);
            aClass6_664.method300(i5, j7, -50, -10, -50);
        }
        anInt986 = 0;
        anInt980 = 0;
        anInt991 = 0;
        if(aBoolean788)
        {
            if(aBoolean789 && !aBoolean702)
            {
                int j5 = anInt705;
                method82();
                if(anInt705 != j5)
                {
                    anInt703 = aClass15_716.anInt524;
                    anInt704 = aClass15_716.anInt525;
                }
            }
            aClass6_664.anInt248 = 3000;
            aClass6_664.anInt249 = 3000;
            aClass6_664.anInt250 = 1;
            aClass6_664.anInt251 = 2800;
            anInt707 = anInt705 * 32;
            int k5 = anInt703 + anInt657;
            int k7 = anInt704 + anInt659;
            aClass6_664.method288(k5, -aClass17_689.method409(k5, k7), k7, 912, anInt707 * 4, 0, 2000);
        } else
        {
            if(aBoolean789 && !aBoolean702)
                method82();
            if(!super.aBoolean39)
            {
                aClass6_664.anInt248 = 2400;
                aClass6_664.anInt249 = 2400;
                aClass6_664.anInt250 = 1;
                aClass6_664.anInt251 = 2300;
            } else
            {
                aClass6_664.anInt248 = 2200;
                aClass6_664.anInt249 = 2200;
                aClass6_664.anInt250 = 1;
                aClass6_664.anInt251 = 2100;
            }
            int l5 = anInt703 + anInt657;
            int l7 = anInt704 + anInt659;
            aClass6_664.method288(l5, -aClass17_689.method409(l5, l7), l7, 912, anInt707 * 4, 0, anInt701 * 2);
        }
        aClass6_664.method276();
        method90();
        if(anInt686 > 0)
            aClass3_Sub1_665.method229(anInt687 - 8, anInt688 - 8, anInt671 + 14 + (24 - anInt686) / 6);
        if(anInt686 < 0)
            aClass3_Sub1_665.method229(anInt687 - 8, anInt688 - 8, anInt671 + 18 + (24 + anInt686) / 6);
        if(!aBoolean912)
        {
            int i6 = 2203 - (anInt718 + anInt691 + anInt695);
            if(anInt717 + anInt690 + anInt694 >= 2640)
                i6 = -50;
            if(i6 > 0)
            {
                int i8 = 1 + i6 / 6;
                aClass3_Sub1_665.method229(453, anInt669 - 56, anInt671 + 13);
                aClass3_Sub1_665.method252("Wilderness", 465, anInt669 - 20, 1, 0xffff00);
                aClass3_Sub1_665.method252("Level: " + i8, 465, anInt669 - 7, 1, 0xffff00);
                if(anInt911 == 0)
                    anInt911 = 2;
            }
            if(anInt911 == 0 && i6 > -10 && i6 <= 0)
                anInt911 = 1;
        }
        if(anInt817 == 0)
        {
            for(int j6 = 0; j6 < anInt818; j6++)
                if(anIntArray820[j6] > 0)
                {
                    String s = aStringArray819[j6];
                    aClass3_Sub1_665.method254(s, 7, anInt669 - 18 - j6 * 12, 1, 0xffff00);
                }

        }
        aClass1_812.method168(anInt813);
        aClass1_812.method168(anInt815);
        aClass1_812.method168(anInt816);
        if(anInt817 == 1)
            aClass1_812.method167(anInt813);
        else
        if(anInt817 == 2)
            aClass1_812.method167(anInt815);
        else
        if(anInt817 == 3)
            aClass1_812.method167(anInt816);
        Class1.anInt98 = 2;
        aClass1_812.method136();
        Class1.anInt98 = 0;
        aClass3_Sub1_665.method231(((Class3) (aClass3_Sub1_665)).anInt184 - 3 - 197, 3, anInt671, 128);
        method102();
        aClass3_Sub1_665.aBoolean212 = false;
        method85();
        aClass3_Sub1_665.method209(aGraphics663, 0, 0);
    }

    public void method84(int i, String s)
    {
        int j = anIntArray737[i];
        int k = anIntArray738[i];
        int l = j - aClass15_716.anInt524 / 128;
        int i1 = k - aClass15_716.anInt525 / 128;
        byte byte0 = 7;
        if(j >= 0 && k >= 0 && j < 96 && k < 96 && l > -byte0 && l < byte0 && i1 > -byte0 && i1 < byte0)
        {
            aClass6_664.method260(aClass2Array736[i]);
            int j1 = Class14.method392(s);
            Class2 class2 = aClass2Array741[j1].method202();
            aClass6_664.method259(class2);
            class2.method183(true, 48, 48, -50, -10, -50);
            class2.method204(aClass2Array736[i]);
            class2.anInt130 = i;
            aClass2Array736[i] = class2;
        }
    }

    public void method85()
    {
        aClass3_Sub1_665.method229(0, anInt669 - 4, anInt671 + 23);
        int i = Class3.method221(200, 200, 255);
        if(anInt817 == 0)
            i = Class3.method221(255, 200, 50);
        if(anInt808 % 30 > 15)
            i = Class3.method221(255, 50, 50);
        aClass3_Sub1_665.method252("All messages", 54, anInt669 + 6, 0, i);
        i = Class3.method221(200, 200, 255);
        if(anInt817 == 1)
            i = Class3.method221(255, 200, 50);
        if(anInt809 % 30 > 15)
            i = Class3.method221(255, 50, 50);
        aClass3_Sub1_665.method252("Chat history", 155, anInt669 + 6, 0, i);
        i = Class3.method221(200, 200, 255);
        if(anInt817 == 2)
            i = Class3.method221(255, 200, 50);
        if(anInt810 % 30 > 15)
            i = Class3.method221(255, 50, 50);
        aClass3_Sub1_665.method252("Quest history", 255, anInt669 + 6, 0, i);
        i = Class3.method221(200, 200, 255);
        if(anInt817 == 3)
            i = Class3.method221(255, 200, 50);
        if(anInt811 % 30 > 15)
            i = Class3.method221(255, 50, 50);
        aClass3_Sub1_665.method252("Private history", 355, anInt669 + 6, 0, i);
        aClass3_Sub1_665.method252("Report abuse", 457, anInt669 + 6, 0, 0xffffff);
    }

    public void method86(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        int l1 = anIntArray1019[i1];
        int i2 = anIntArray1018[i1];
        if(l1 == 0)
        {
            int j2 = 255 + i2 * 5 * 256;
            aClass3_Sub1_665.method211(i + k / 2, j + l / 2, 20 + i2 * 2, j2, 255 - i2 * 5);
        }
        if(l1 == 1)
        {
            int k2 = 0xff0000 + i2 * 5 * 256;
            aClass3_Sub1_665.method211(i + k / 2, j + l / 2, 10 + i2, k2, 255 - i2 * 5);
        }
    }

    public void method87(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        int l1 = Class14.anIntArray433[i1] + anInt673;
        int i2 = Class14.anIntArray438[i1];
        aClass3_Sub1_665.method245(i, j, k, l, l1, i2, 0, 0, false);
    }

    public void method88(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        Class15 class15 = aClass15Array725[i1];
        int l1 = class15.anInt528 + (anInt707 + 16) / 32 & 7;
        boolean flag = false;
        int i2 = l1;
        if(i2 == 5)
        {
            i2 = 3;
            flag = true;
        } else
        if(i2 == 6)
        {
            i2 = 2;
            flag = true;
        } else
        if(i2 == 7)
        {
            i2 = 1;
            flag = true;
        }
        int j2 = i2 * 3 + anIntArray1010[(class15.anInt527 / Class14.anIntArray457[class15.anInt526]) % 4];
        if(class15.anInt528 == 8)
        {
            i2 = 5;
            l1 = 2;
            flag = false;
            i -= (Class14.anIntArray459[class15.anInt526] * k1) / 100;
            j2 = i2 * 3 + anIntArray1011[(anInt648 / (Class14.anIntArray458[class15.anInt526] - 1)) % 8];
        } else
        if(class15.anInt528 == 9)
        {
            i2 = 5;
            l1 = 2;
            flag = true;
            i += (Class14.anIntArray459[class15.anInt526] * k1) / 100;
            j2 = i2 * 3 + anIntArray1012[(anInt648 / Class14.anIntArray458[class15.anInt526]) % 8];
        }
        for(int k2 = 0; k2 < 12; k2++)
        {
            int l2 = anIntArrayArray997[l1][k2];
            int k3 = Class14.anIntArrayArray450[class15.anInt526][l2];
            if(k3 >= 0)
            {
                int i4 = 0;
                int j4 = 0;
                int k4 = j2;
                if(flag && i2 >= 1 && i2 <= 3 && Class14.anIntArray468[k3] == 1)
                    k4 += 15;
                if(i2 != 5 || Class14.anIntArray467[k3] == 1)
                {
                    int l4 = k4 + Class14.anIntArray469[k3];
                    i4 = (i4 * k) / ((Class3) (aClass3_Sub1_665)).anIntArray201[l4];
                    j4 = (j4 * l) / ((Class3) (aClass3_Sub1_665)).anIntArray202[l4];
                    int i5 = (k * ((Class3) (aClass3_Sub1_665)).anIntArray201[l4]) / ((Class3) (aClass3_Sub1_665)).anIntArray201[Class14.anIntArray469[k3]];
                    i4 -= (i5 - k) / 2;
                    int j5 = Class14.anIntArray465[k3];
                    int k5 = 0;
                    if(j5 == 1)
                    {
                        j5 = Class14.anIntArray451[class15.anInt526];
                        k5 = Class14.anIntArray454[class15.anInt526];
                    } else
                    if(j5 == 2)
                    {
                        j5 = Class14.anIntArray452[class15.anInt526];
                        k5 = Class14.anIntArray454[class15.anInt526];
                    } else
                    if(j5 == 3)
                    {
                        j5 = Class14.anIntArray453[class15.anInt526];
                        k5 = Class14.anIntArray454[class15.anInt526];
                    }
                    aClass3_Sub1_665.method245(i + i4, j + j4, i5, l, l4, j5, k5, j1, flag);
                }
            }
        }

        if(class15.anInt536 > 0)
        {
            anIntArray984[anInt980] = aClass3_Sub1_665.method258(class15.aString535, 1) / 2;
            if(anIntArray984[anInt980] > 150)
                anIntArray984[anInt980] = 150;
            anIntArray985[anInt980] = (aClass3_Sub1_665.method258(class15.aString535, 1) / 300) * aClass3_Sub1_665.method257(1);
            anIntArray982[anInt980] = i + k / 2;
            anIntArray983[anInt980] = j;
            aStringArray981[anInt980++] = class15.aString535;
        }
        if(class15.anInt528 == 8 || class15.anInt528 == 9 || class15.anInt542 != 0)
        {
            if(class15.anInt542 > 0)
            {
                int i3 = i;
                if(class15.anInt528 == 8)
                    i3 -= (20 * k1) / 100;
                else
                if(class15.anInt528 == 9)
                    i3 += (20 * k1) / 100;
                int l3 = (class15.anInt540 * 30) / class15.anInt541;
                anIntArray992[anInt991] = i3 + k / 2;
                anIntArray993[anInt991] = j;
                anIntArray994[anInt991++] = l3;
            }
            if(class15.anInt542 > 150)
            {
                int j3 = i;
                if(class15.anInt528 == 8)
                    j3 -= (10 * k1) / 100;
                else
                if(class15.anInt528 == 9)
                    j3 += (10 * k1) / 100;
                aClass3_Sub1_665.method229((j3 + k / 2) - 12, (j + l / 2) - 12, anInt671 + 12);
                aClass3_Sub1_665.method252(String.valueOf(class15.anInt539), (j3 + k / 2) - 1, j + l / 2 + 5, 3, 0xffffff);
            }
        }
    }

    public void method89(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        Class15 class15 = aClass15Array714[i1];
        if(class15.anInt546 == 255)
            return;
        int l1 = class15.anInt528 + (anInt707 + 16) / 32 & 7;
        boolean flag = false;
        int i2 = l1;
        if(i2 == 5)
        {
            i2 = 3;
            flag = true;
        } else
        if(i2 == 6)
        {
            i2 = 2;
            flag = true;
        } else
        if(i2 == 7)
        {
            i2 = 1;
            flag = true;
        }
        int j2 = i2 * 3 + anIntArray1010[(class15.anInt527 / 6) % 4];
        if(class15.anInt528 == 8)
        {
            i2 = 5;
            l1 = 2;
            flag = false;
            i -= (5 * k1) / 100;
            j2 = i2 * 3 + anIntArray1011[(anInt648 / 5) % 8];
        } else
        if(class15.anInt528 == 9)
        {
            i2 = 5;
            l1 = 2;
            flag = true;
            i += (5 * k1) / 100;
            j2 = i2 * 3 + anIntArray1012[(anInt648 / 6) % 8];
        }
        for(int k2 = 0; k2 < 12; k2++)
        {
            int l2 = anIntArrayArray997[l1][k2];
            int l3 = class15.anIntArray534[l2] - 1;
            if(l3 >= 0)
            {
                int k4 = 0;
                int i5 = 0;
                int j5 = j2;
                if(flag && i2 >= 1 && i2 <= 3)
                    if(Class14.anIntArray468[l3] == 1)
                        j5 += 15;
                    else
                    if(l2 == 4 && i2 == 1)
                    {
                        k4 = -22;
                        i5 = -3;
                        j5 = i2 * 3 + anIntArray1010[(2 + class15.anInt527 / 6) % 4];
                    } else
                    if(l2 == 4 && i2 == 2)
                    {
                        k4 = 0;
                        i5 = -8;
                        j5 = i2 * 3 + anIntArray1010[(2 + class15.anInt527 / 6) % 4];
                    } else
                    if(l2 == 4 && i2 == 3)
                    {
                        k4 = 26;
                        i5 = -5;
                        j5 = i2 * 3 + anIntArray1010[(2 + class15.anInt527 / 6) % 4];
                    } else
                    if(l2 == 3 && i2 == 1)
                    {
                        k4 = 22;
                        i5 = 3;
                        j5 = i2 * 3 + anIntArray1010[(2 + class15.anInt527 / 6) % 4];
                    } else
                    if(l2 == 3 && i2 == 2)
                    {
                        k4 = 0;
                        i5 = 8;
                        j5 = i2 * 3 + anIntArray1010[(2 + class15.anInt527 / 6) % 4];
                    } else
                    if(l2 == 3 && i2 == 3)
                    {
                        k4 = -26;
                        i5 = 5;
                        j5 = i2 * 3 + anIntArray1010[(2 + class15.anInt527 / 6) % 4];
                    }
                if(i2 != 5 || Class14.anIntArray467[l3] == 1)
                {
                    int k5 = j5 + Class14.anIntArray469[l3];
                    k4 = (k4 * k) / ((Class3) (aClass3_Sub1_665)).anIntArray201[k5];
                    i5 = (i5 * l) / ((Class3) (aClass3_Sub1_665)).anIntArray202[k5];
                    int l5 = (k * ((Class3) (aClass3_Sub1_665)).anIntArray201[k5]) / ((Class3) (aClass3_Sub1_665)).anIntArray201[Class14.anIntArray469[l3]];
                    k4 -= (l5 - k) / 2;
                    int i6 = Class14.anIntArray465[l3];
                    int j6 = anIntArray1009[class15.anInt547];
                    if(i6 == 1)
                        i6 = anIntArray1008[class15.anInt544];
                    else
                    if(i6 == 2)
                        i6 = anIntArray1007[class15.anInt545];
                    else
                    if(i6 == 3)
                        i6 = anIntArray1007[class15.anInt546];
                    aClass3_Sub1_665.method245(i + k4, j + i5, l5, l, k5, i6, j6, j1, flag);
                }
            }
        }

        if(class15.anInt536 > 0)
        {
            anIntArray984[anInt980] = aClass3_Sub1_665.method258(class15.aString535, 1) / 2;
            if(anIntArray984[anInt980] > 150)
                anIntArray984[anInt980] = 150;
            anIntArray985[anInt980] = (aClass3_Sub1_665.method258(class15.aString535, 1) / 300) * aClass3_Sub1_665.method257(1);
            anIntArray982[anInt980] = i + k / 2;
            anIntArray983[anInt980] = j;
            aStringArray981[anInt980++] = class15.aString535;
        }
        if(class15.anInt538 > 0)
        {
            anIntArray987[anInt986] = i + k / 2;
            anIntArray988[anInt986] = j;
            anIntArray989[anInt986] = k1;
            anIntArray990[anInt986++] = class15.anInt537;
        }
        if(class15.anInt528 == 8 || class15.anInt528 == 9 || class15.anInt542 != 0)
        {
            if(class15.anInt542 > 0)
            {
                int i3 = i;
                if(class15.anInt528 == 8)
                    i3 -= (20 * k1) / 100;
                else
                if(class15.anInt528 == 9)
                    i3 += (20 * k1) / 100;
                int i4 = (class15.anInt540 * 30) / class15.anInt541;
                anIntArray992[anInt991] = i3 + k / 2;
                anIntArray993[anInt991] = j;
                anIntArray994[anInt991++] = i4;
            }
            if(class15.anInt542 > 150)
            {
                int j3 = i;
                if(class15.anInt528 == 8)
                    j3 -= (10 * k1) / 100;
                else
                if(class15.anInt528 == 9)
                    j3 += (10 * k1) / 100;
                aClass3_Sub1_665.method229((j3 + k / 2) - 12, (j + l / 2) - 12, anInt671 + 11);
                aClass3_Sub1_665.method252(String.valueOf(class15.anInt539), (j3 + k / 2) - 1, j + l / 2 + 5, 3, 0xffffff);
            }
        }
        if(class15.anInt554 == 1 && class15.anInt538 == 0)
        {
            int k3 = j1 + i + k / 2;
            if(class15.anInt528 == 8)
                k3 -= (20 * k1) / 100;
            else
            if(class15.anInt528 == 9)
                k3 += (20 * k1) / 100;
            int j4 = (16 * k1) / 100;
            int l4 = (16 * k1) / 100;
            aClass3_Sub1_665.method230(k3 - j4 / 2, j - l4 / 2 - (10 * k1) / 100, j4, l4, anInt671 + 13);
        }
    }

    public void method90()
    {
        for(int i = 0; i < anInt980; i++)
        {
            int j = aClass3_Sub1_665.method257(1);
            int l = anIntArray982[i];
            int k1 = anIntArray983[i];
            int j2 = anIntArray984[i];
            int i3 = anIntArray985[i];
            boolean flag = true;
            while(flag) 
            {
                flag = false;
                for(int i4 = 0; i4 < i; i4++)
                    if(k1 + i3 > anIntArray983[i4] - j && k1 - j < anIntArray983[i4] + anIntArray985[i4] && l - j2 < anIntArray982[i4] + anIntArray984[i4] && l + j2 > anIntArray982[i4] - anIntArray984[i4] && anIntArray983[i4] - j - i3 < k1)
                    {
                        k1 = anIntArray983[i4] - j - i3;
                        flag = true;
                    }

            }
            anIntArray983[i] = k1;
            aClass3_Sub1_665.method253(aStringArray981[i], l, k1, 1, 0xffff00, 300);
        }

        for(int k = 0; k < anInt986; k++)
        {
            int i1 = anIntArray987[k];
            int l1 = anIntArray988[k];
            int k2 = anIntArray989[k];
            int j3 = anIntArray990[k];
            int l3 = (39 * k2) / 100;
            int j4 = (27 * k2) / 100;
            int k4 = l1 - j4;
            aClass3_Sub1_665.method232(i1 - l3 / 2, k4, l3, j4, anInt671 + 9, 85);
            int l4 = (36 * k2) / 100;
            int i5 = (24 * k2) / 100;
            aClass3_Sub1_665.method245(i1 - l4 / 2, (k4 + j4 / 2) - i5 / 2, l4, i5, Class14.anIntArray433[j3] + anInt673, Class14.anIntArray438[j3], 0, 0, false);
        }

        for(int j1 = 0; j1 < anInt991; j1++)
        {
            int i2 = anIntArray992[j1];
            int l2 = anIntArray993[j1];
            int k3 = anIntArray994[j1];
            aClass3_Sub1_665.method212(i2 - 15, l2 - 3, k3, 5, 65280, 192);
            aClass3_Sub1_665.method212((i2 - 15) + k3, l2 - 3, 30 - k3, 5, 0xff0000, 192);
        }

    }

    public int method91(int i)
    {
        int j = 0;
        for(int k = 0; k < anInt753; k++)
            if(anIntArray754[k] == i)
                if(Class14.anIntArray435[i] == 1)
                    j++;
                else
                    j += anIntArray755[k];

        return j;
    }

    public boolean method92(int i, int j)
    {
        if(i == 31 && (method93(197) || method93(615) || method93(682)))
            return true;
        if(i == 32 && (method93(102) || method93(616) || method93(683)))
            return true;
        if(i == 33 && (method93(101) || method93(617) || method93(684)))
            return true;
        if(i == 34 && (method93(103) || method93(618) || method93(685)))
            return true;
        return method91(i) >= j;
    }

    public boolean method93(int i)
    {
        for(int j = 0; j < anInt753; j++)
            if(anIntArray754[j] == i && anIntArray756[j] == 1)
                return true;

        return false;
    }

    public void method94(int i, int j, int k)
    {
        aClass3_Sub1_665.method218(i, j, k);
        aClass3_Sub1_665.method218(i - 1, j, k);
        aClass3_Sub1_665.method218(i + 1, j, k);
        aClass3_Sub1_665.method218(i, j - 1, k);
        aClass3_Sub1_665.method218(i, j + 1, k);
    }

    public void method95(int i, int j, int k, int l, boolean flag)
    {
        method99(i, j, k, l, k, l, false, flag);
    }

    public void method96(int i, int j, int k, int l, boolean flag)
    {
        if(method99(i, j, k, l, k, l, false, flag))
        {
            return;
        } else
        {
            method99(i, j, k, l, k, l, true, flag);
            return;
        }
    }

    public void method97(int i, int j, int k, int l)
    {
        int i1;
        int j1;
        if(k == 0 || k == 4)
        {
            i1 = Class14.anIntArray476[l];
            j1 = Class14.anIntArray477[l];
        } else
        {
            j1 = Class14.anIntArray476[l];
            i1 = Class14.anIntArray477[l];
        }
        if(Class14.anIntArray478[l] == 2 || Class14.anIntArray478[l] == 3)
        {
            if(k == 0)
            {
                i--;
                i1++;
            }
            if(k == 2)
                j1++;
            if(k == 4)
                i1++;
            if(k == 6)
            {
                j--;
                j1++;
            }
            method99(anInt717, anInt718, i, j, (i + i1) - 1, (j + j1) - 1, false, true);
            return;
        } else
        {
            method99(anInt717, anInt718, i, j, (i + i1) - 1, (j + j1) - 1, true, true);
            return;
        }
    }

    public void method98(int i, int j, int k)
    {
        if(k == 0)
        {
            method99(anInt717, anInt718, i, j - 1, i, j, false, true);
            return;
        }
        if(k == 1)
        {
            method99(anInt717, anInt718, i - 1, j, i, j, false, true);
            return;
        } else
        {
            method99(anInt717, anInt718, i, j, i, j, true, true);
            return;
        }
    }

    public boolean method99(int i, int j, int k, int l, int i1, int j1, boolean flag, 
            boolean flag1)
    {
        int k1 = aClass17_689.method398(i, j, k, l, i1, j1, anIntArray652, anIntArray653, flag);
        if(k1 == -1)
            return false;
        k1--;
        i = anIntArray652[k1];
        j = anIntArray653[k1];
        k1--;
        if(flag1)
            super.aClass10_Sub1_614.method334(215, 592);
        else
            super.aClass10_Sub1_614.method334(194, 770);
        super.aClass10_Sub1_614.method328(i + anInt694);
        super.aClass10_Sub1_614.method328(j + anInt695);
        for(int l1 = k1; l1 >= 0 && l1 > k1 - 25; l1--)
        {
            super.aClass10_Sub1_614.method327(anIntArray652[l1] - i);
            super.aClass10_Sub1_614.method327(anIntArray653[l1] - j);
        }

        super.aClass10_Sub1_614.method336();
        anInt686 = -24;
        anInt687 = super.anInt33;
        anInt688 = super.anInt34;
        return true;
    }

    public boolean method100(int i, int j)
    {
        if(anInt910 != 0)
        {
            aClass17_689.aBoolean592 = false;
            return false;
        }
        aBoolean912 = false;
        i += anInt690;
        j += anInt691;
        if(anInt693 == anInt696 && i > anInt697 && i < anInt699 && j > anInt698 && j < anInt700)
        {
            aClass17_689.aBoolean592 = true;
            return false;
        }
        aClass3_Sub1_665.method252("Loading... Please wait", 256, 192, 1, 0xffffff);
        method85();
        aClass3_Sub1_665.method209(aGraphics663, 0, 0);
        int k = anInt694;
        int l = anInt695;
        int i1 = (i + 24) / 48;
        int j1 = (j + 24) / 48;
        anInt693 = anInt696;
        anInt694 = i1 * 48 - 48;
        anInt695 = j1 * 48 - 48;
        anInt697 = i1 * 48 - 32;
        anInt698 = j1 * 48 - 32;
        anInt699 = i1 * 48 + 32;
        anInt700 = j1 * 48 + 32;
        aClass17_689.method425(i, j, anInt693);
        anInt694 -= anInt690;
        anInt695 -= anInt691;
        int k1 = anInt694 - k;
        int l1 = anInt695 - l;
        for(int i2 = 0; i2 < anInt735; i2++)
        {
            anIntArray737[i2] -= k1;
            anIntArray738[i2] -= l1;
            int j2 = anIntArray737[i2];
            int l2 = anIntArray738[i2];
            int k3 = anIntArray739[i2];
            Class2 class2 = aClass2Array736[i2];
            try
            {
                int l4 = anIntArray740[i2];
                int k5;
                int i6;
                if(l4 == 0 || l4 == 4)
                {
                    k5 = Class14.anIntArray476[k3];
                    i6 = Class14.anIntArray477[k3];
                } else
                {
                    i6 = Class14.anIntArray476[k3];
                    k5 = Class14.anIntArray477[k3];
                }
                int j6 = ((j2 + j2 + k5) * anInt666) / 2;
                int k6 = ((l2 + l2 + i6) * anInt666) / 2;
                if(j2 >= 0 && l2 >= 0 && j2 < 96 && l2 < 96)
                {
                    aClass6_664.method259(class2);
                    class2.method190(j6, -aClass17_689.method409(j6, k6), k6);
                    aClass17_689.method403(j2, l2, k3);
                    if(k3 == 74)
                        class2.method189(0, -480, 0);
                }
            }
            catch(RuntimeException runtimeexception)
            {
                System.out.println("Loc Error: " + runtimeexception.getMessage());
                System.out.println("i:" + i2 + " obj:" + class2);
                runtimeexception.printStackTrace();
            }
        }

        for(int k2 = 0; k2 < anInt744; k2++)
        {
            anIntArray746[k2] -= k1;
            anIntArray747[k2] -= l1;
            int i3 = anIntArray746[k2];
            int l3 = anIntArray747[k2];
            int j4 = anIntArray749[k2];
            int i5 = anIntArray748[k2];
            try
            {
                aClass17_689.method401(i3, l3, i5, j4);
                Class2 class2_1 = method101(i3, l3, i5, j4, k2);
                aClass2Array745[k2] = class2_1;
            }
            catch(RuntimeException runtimeexception1)
            {
                System.out.println("Bound Error: " + runtimeexception1.getMessage());
                runtimeexception1.printStackTrace();
            }
        }

        for(int j3 = 0; j3 < anInt729; j3++)
        {
            anIntArray730[j3] -= k1;
            anIntArray731[j3] -= l1;
        }

        for(int i4 = 0; i4 < anInt710; i4++)
        {
            Class15 class15 = aClass15Array714[i4];
            class15.anInt524 -= k1 * anInt666;
            class15.anInt525 -= l1 * anInt666;
            for(int j5 = 0; j5 <= class15.anInt531; j5++)
            {
                class15.anIntArray532[j5] -= k1 * anInt666;
                class15.anIntArray533[j5] -= l1 * anInt666;
            }

        }

        for(int k4 = 0; k4 < anInt722; k4++)
        {
            Class15 class15_1 = aClass15Array725[k4];
            class15_1.anInt524 -= k1 * anInt666;
            class15_1.anInt525 -= l1 * anInt666;
            for(int l5 = 0; l5 <= class15_1.anInt531; l5++)
            {
                class15_1.anIntArray532[l5] -= k1 * anInt666;
                class15_1.anIntArray533[l5] -= l1 * anInt666;
            }

        }

        aClass17_689.aBoolean592 = true;
        return true;
    }

    public Class2 method101(int i, int j, int k, int l, int i1)
    {
        int j1 = i;
        int k1 = j;
        int l1 = i;
        int i2 = j;
        int j2 = Class14.anIntArray486[l];
        int k2 = Class14.anIntArray487[l];
        int l2 = Class14.anIntArray485[l];
        Class2 class2 = new Class2(4, 1);
        if(k == 0)
            l1 = i + 1;
        if(k == 1)
            i2 = j + 1;
        if(k == 2)
        {
            j1 = i + 1;
            i2 = j + 1;
        }
        if(k == 3)
        {
            l1 = i + 1;
            i2 = j + 1;
        }
        j1 *= anInt666;
        k1 *= anInt666;
        l1 *= anInt666;
        i2 *= anInt666;
        int i3 = class2.method178(j1, -aClass17_689.method409(j1, k1), k1);
        int j3 = class2.method178(j1, -aClass17_689.method409(j1, k1) - l2, k1);
        int k3 = class2.method178(l1, -aClass17_689.method409(l1, i2) - l2, i2);
        int l3 = class2.method178(l1, -aClass17_689.method409(l1, i2), i2);
        int ai[] = {
            i3, j3, k3, l3
        };
        class2.method180(4, ai, j2, k2);
        class2.method183(false, 60, 24, -50, -10, -50);
        if(i >= 0 && j >= 0 && i < 96 && j < 96)
            aClass6_664.method259(class2);
        class2.anInt130 = i1 + 10000;
        return class2;
    }

    public void method102()
    {
        if(anInt908 != 0)
            method107();
        else
        if(aBoolean899)
            method105();
        else
        if(aBoolean906)
            method106();
        else
        if(anInt911 == 1)
            method108();
        else
        if(aBoolean877 && anInt909 == 0)
            method112();
        else
        if(aBoolean869 && anInt909 == 0)
            method113();
        else
        if(aBoolean861)
            method114();
        else
        if(aBoolean848)
            method115();
        else
        if(aBoolean835)
            method116();
        else
        if(aBoolean821)
            method117();
        else
        if(anInt895 != 0)
            method110();
        else
        if(anInt893 != 0)
            method109();
        else
        if(anInt892 != 0)
        {
            method111();
        } else
        {
            if(aBoolean888)
                method103();
            if(aClass15_716.anInt528 == 8 || aClass15_716.anInt528 == 9)
                method104();
            method118();
            boolean flag = !aBoolean888 && !aBoolean792;
            if(flag)
                anInt797 = 0;
            if(anInt751 == 0 && flag)
                method125();
            if(anInt751 == 1)
                method119(flag);
            if(anInt751 == 2)
                method120(flag);
            if(anInt751 == 3)
                method121(flag);
            if(anInt751 == 4)
                method122(flag);
            if(anInt751 == 5)
                method123(flag);
            if(anInt751 == 6)
                method124(flag);
            if(!aBoolean792 && !aBoolean888)
                method127();
            if(aBoolean792 && !aBoolean888)
                method126();
        }
        anInt650 = 0;
    }

    public void method103()
    {
        if(anInt650 != 0)
        {
            for(int i = 0; i < anInt889; i++)
            {
                if(super.anInt33 >= aClass3_Sub1_665.method258(aStringArray890[i], 1) || super.anInt34 <= i * 12 || super.anInt34 >= 12 + i * 12)
                    continue;
                super.aClass10_Sub1_614.method334(237, 3);
                super.aClass10_Sub1_614.method327(i);
                super.aClass10_Sub1_614.method336();
                break;
            }

            anInt650 = 0;
            aBoolean888 = false;
            return;
        }
        for(int j = 0; j < anInt889; j++)
        {
            int k = 65535;
            if(super.anInt33 < aClass3_Sub1_665.method258(aStringArray890[j], 1) && super.anInt34 > j * 12 && super.anInt34 < 12 + j * 12)
                k = 0xff0000;
            aClass3_Sub1_665.method254(aStringArray890[j], 6, 12 + j * 12, 1, k);
        }

    }

    public void method104()
    {
        byte byte0 = 7;
        byte byte1 = 15;
        char c = '\257';
        if(anInt650 != 0)
        {
            for(int i = 0; i < 5; i++)
            {
                if(i <= 0 || super.anInt33 <= byte0 || super.anInt33 >= byte0 + c || super.anInt34 <= byte1 + i * 20 || super.anInt34 >= byte1 + i * 20 + 20)
                    continue;
                anInt891 = i - 1;
                anInt650 = 0;
                super.aClass10_Sub1_614.method334(231, 700);
                super.aClass10_Sub1_614.method327(anInt891);
                super.aClass10_Sub1_614.method336();
                break;
            }

        }
        for(int j = 0; j < 5; j++)
        {
            if(j == anInt891 + 1)
                aClass3_Sub1_665.method212(byte0, byte1 + j * 20, c, 20, Class3.method221(255, 0, 0), 128);
            else
                aClass3_Sub1_665.method212(byte0, byte1 + j * 20, c, 20, Class3.method221(190, 190, 190), 128);
            aClass3_Sub1_665.method216(byte0, byte1 + j * 20, c, 0);
            aClass3_Sub1_665.method216(byte0, byte1 + j * 20 + 20, c, 0);
        }

        aClass3_Sub1_665.method252("Select combat style", byte0 + c / 2, byte1 + 16, 3, 0xffffff);
        aClass3_Sub1_665.method252("Controlled (+1 of each)", byte0 + c / 2, byte1 + 36, 3, 0);
        aClass3_Sub1_665.method252("Aggressive (+3 strength)", byte0 + c / 2, byte1 + 56, 3, 0);
        aClass3_Sub1_665.method252("Accurate   (+3 attack)", byte0 + c / 2, byte1 + 76, 3, 0);
        aClass3_Sub1_665.method252("Defensive  (+3 defense)", byte0 + c / 2, byte1 + 96, 3, 0);
    }

    public void method105()
    {
        char c;
        if(anInt903 > 0)
            c = '\264';
        else
            c = 'd';
        int i = 167 - c / 2;
        aClass3_Sub1_665.method214(56, 167 - c / 2, 400, c, 0);
        aClass3_Sub1_665.method215(56, 167 - c / 2, 400, c, 0xffffff);
        i += 20;
        aClass3_Sub1_665.method252("Welcome to RuneScape " + aString934, 256, i, 4, 0xffff00);
        i += 30;
        String s;
        if(anInt902 <= 0)
            s = "earlier today";
        else
        if(anInt902 == 1)
            s = "yesterday";
        else
            s = anInt902 + " days ago";
        aClass3_Sub1_665.method252("You last logged in " + s, 256, i, 1, 0xffffff);
        i += 15;
        if(aString901 == null)
            aString901 = method129(anInt900);
        aClass3_Sub1_665.method252("from: " + aString901, 256, i, 1, 0xffffff);
        i += 15;
        i += 15;
        if(anInt903 > 0)
        {
            String s1;
            if(anInt903 == 14)
                s1 = "Earlier today";
            else
            if(anInt903 == 13)
                s1 = "Yesterday";
            else
                s1 = (14 - anInt903) + " days ago";
            aClass3_Sub1_665.method252(s1 + " you changed your recovery questions", 256, i, 1, 0xff8000);
            i += 15;
            aClass3_Sub1_665.method252("If you do not remember making this change then", 256, i, 1, 0xff8000);
            i += 15;
            aClass3_Sub1_665.method252("cancel it and change your password immediately!", 256, i, 1, 0xff8000);
            i += 15;
            i += 15;
            int j = 0xffffff;
            if(super.anInt34 > i - 12 && super.anInt34 <= i && super.anInt33 > 106 && super.anInt33 < 406)
                j = 0xff0000;
            aClass3_Sub1_665.method252("No that wasn't me - Cancel the request!", 256, i, 1, j);
            if(j == 0xff0000 && anInt650 == 1)
            {
                super.aClass10_Sub1_614.method334(196, 651);
                super.aClass10_Sub1_614.method336();
                aBoolean899 = false;
            }
            i += 15;
            j = 0xffffff;
            if(super.anInt34 > i - 12 && super.anInt34 <= i && super.anInt33 > 106 && super.anInt33 < 406)
                j = 0xff0000;
            aClass3_Sub1_665.method252("That's ok, activate the new questions in " + anInt903 + " days time.", 256, i, 1, j);
            if(j == 0xff0000 && anInt650 == 1)
                aBoolean899 = false;
        } else
        {
            int k = 0xffffff;
            if(super.anInt34 > i - 12 && super.anInt34 <= i && super.anInt33 > 106 && super.anInt33 < 406)
                k = 0xff0000;
            aClass3_Sub1_665.method252("Click here to close window", 256, i, 1, k);
            if(anInt650 == 1)
            {
                if(k == 0xff0000)
                    aBoolean899 = false;
                if((super.anInt33 < 86 || super.anInt33 > 426) && (super.anInt34 < 167 - c / 2 || super.anInt34 > 167 + c / 2))
                    aBoolean899 = false;
            }
        }
        anInt650 = 0;
    }

    public void method106()
    {
        char c = '\u0190';
        char c1 = 'd';
        if(aBoolean905)
        {
            c1 = '\u01C2';
            c1 = '\u012C';
        }
        aClass3_Sub1_665.method214(256 - c / 2, 167 - c1 / 2, c, c1, 0);
        aClass3_Sub1_665.method215(256 - c / 2, 167 - c1 / 2, c, c1, 0xffffff);
        aClass3_Sub1_665.method253(aString907, 256, (167 - c1 / 2) + 20, 1, 0xffffff, c - 40);
        int i = 157 + c1 / 2;
        int j = 0xffffff;
        if(super.anInt34 > i - 12 && super.anInt34 <= i && super.anInt33 > 106 && super.anInt33 < 406)
            j = 0xff0000;
        aClass3_Sub1_665.method252("Click here to close window", 256, i, 1, j);
        if(anInt650 == 1)
        {
            if(j == 0xff0000)
                aBoolean906 = false;
            if((super.anInt33 < 256 - c / 2 || super.anInt33 > 256 + c / 2) && (super.anInt34 < 167 - c1 / 2 || super.anInt34 > 167 + c1 / 2))
                aBoolean906 = false;
        }
        anInt650 = 0;
    }

    public void method107()
    {
        aClass3_Sub1_665.method214(126, 137, 260, 60, 0);
        aClass3_Sub1_665.method215(126, 137, 260, 60, 0xffffff);
        aClass3_Sub1_665.method252("Logging out...", 256, 173, 5, 0xffffff);
    }

    public void method108()
    {
        int i = 97;
        aClass3_Sub1_665.method214(86, 77, 340, 180, 0);
        aClass3_Sub1_665.method215(86, 77, 340, 180, 0xffffff);
        aClass3_Sub1_665.method252("Warning! Proceed with caution", 256, i, 4, 0xff0000);
        i += 26;
        aClass3_Sub1_665.method252("If you go much further north you will enter the", 256, i, 1, 0xffffff);
        i += 13;
        aClass3_Sub1_665.method252("wilderness. This a very dangerous area where", 256, i, 1, 0xffffff);
        i += 13;
        aClass3_Sub1_665.method252("other players can attack you!", 256, i, 1, 0xffffff);
        i += 22;
        aClass3_Sub1_665.method252("The further north you go the more dangerous it", 256, i, 1, 0xffffff);
        i += 13;
        aClass3_Sub1_665.method252("becomes, but the more treasure you will find.", 256, i, 1, 0xffffff);
        i += 22;
        aClass3_Sub1_665.method252("In the wilderness an indicator at the bottom-right", 256, i, 1, 0xffffff);
        i += 13;
        aClass3_Sub1_665.method252("of the screen will show the current level of danger", 256, i, 1, 0xffffff);
        i += 22;
        int j = 0xffffff;
        if(super.anInt34 > i - 12 && super.anInt34 <= i && super.anInt33 > 181 && super.anInt33 < 331)
            j = 0xff0000;
        aClass3_Sub1_665.method252("Click here to close window", 256, i, 1, j);
        if(anInt650 != 0)
        {
            if(super.anInt34 > i - 12 && super.anInt34 <= i && super.anInt33 > 181 && super.anInt33 < 331)
                anInt911 = 2;
            if(super.anInt33 < 86 || super.anInt33 > 426 || super.anInt34 < 77 || super.anInt34 > 257)
                anInt911 = 2;
            anInt650 = 0;
        }
    }

    public void method109()
    {
        if(anInt650 != 0)
        {
            anInt650 = 0;
            if(super.anInt33 < 56 || super.anInt34 < 35 || super.anInt33 > 456 || super.anInt34 > 325)
            {
                anInt893 = 0;
                return;
            }
            int i = 140;
            for(int k = 0; k < 9; k++)
            {
                if(super.anInt33 > 66 && super.anInt33 < 446 && super.anInt34 >= i - 12 && super.anInt34 < i + 3)
                    anInt894 = k;
                i += 15;
            }

            i += 45;
            if(super.anInt33 > 196 && super.anInt33 < 316 && super.anInt34 > i - 15 && super.anInt34 < i + 5)
            {
                anInt893 = 0;
                return;
            }
        }
        if(super.aString41.length() > 0)
        {
            String s = super.aString41.trim();
            super.aString40 = "";
            super.aString41 = "";
            if(s.length() > 0)
            {
                long l = Class11.method353(s);
                super.aClass10_Sub1_614.method334(51, 277);
                super.aClass10_Sub1_614.method330(l);
                super.aClass10_Sub1_614.method327(anInt894);
                super.aClass10_Sub1_614.method336();
            }
            anInt893 = 0;
            return;
        }
        aClass3_Sub1_665.method214(56, 35, 400, 290, 0);
        aClass3_Sub1_665.method215(56, 35, 400, 290, 0xffffff);
        int j = 50;
        aClass3_Sub1_665.method252("This form sends a snapshot of the last 60 secs of trade/chat", 256, j, 1, 0xffffff);
        j += 15;
        aClass3_Sub1_665.method252("to customer support. Please only use this for serious abuse", 256, j, 1, 0xffffff);
        j += 15;
        aClass3_Sub1_665.method252("If you misuse this form, you will be banned.", 256, j, 1, 0xff8000);
        j += 15;
        aClass3_Sub1_665.method252("Do not report abuse unless you were genuinely offended", 256, j, 1, 0xff8000);
        j += 15;
        j += 15;
        aClass3_Sub1_665.method252("First indicate the type of abuse", 256, j, 1, 0xffff00);
        j += 15;
        int i1;
        if(anInt894 == 0)
        {
            aClass3_Sub1_665.method215(66, j - 12, 380, 15, 0xffffff);
            i1 = 0xff8000;
        } else
        {
            i1 = 0xffffff;
        }
        aClass3_Sub1_665.method252("Non-vulgar insult such as 'idiot', 'noob', 'loser', etc...", 256, j, 1, i1);
        j += 15;
        if(anInt894 == 1)
        {
            aClass3_Sub1_665.method215(66, j - 12, 380, 15, 0xffffff);
            i1 = 0xff8000;
        } else
        {
            i1 = 0xffffff;
        }
        aClass3_Sub1_665.method252("Swearing, profanity, or racial abuse directed at me personally", 256, j, 1, i1);
        j += 15;
        if(anInt894 == 2)
        {
            aClass3_Sub1_665.method215(66, j - 12, 380, 15, 0xffffff);
            i1 = 0xff8000;
        } else
        {
            i1 = 0xffffff;
        }
        aClass3_Sub1_665.method252("I overheard the player being abusive to someone else", 256, j, 1, i1);
        j += 15;
        if(anInt894 == 3)
        {
            aClass3_Sub1_665.method215(66, j - 12, 380, 15, 0xffffff);
            i1 = 0xff8000;
        } else
        {
            i1 = 0xffffff;
        }
        aClass3_Sub1_665.method252("Trade scam - lied about trade to steal items from me", 256, j, 1, i1);
        j += 15;
        if(anInt894 == 4)
        {
            aClass3_Sub1_665.method215(66, j - 12, 380, 15, 0xffffff);
            i1 = 0xff8000;
        } else
        {
            i1 = 0xffffff;
        }
        aClass3_Sub1_665.method252("Asking players for their password / trying to steal accounts", 256, j, 1, i1);
        j += 15;
        if(anInt894 == 5)
        {
            aClass3_Sub1_665.method215(66, j - 12, 380, 15, 0xffffff);
            i1 = 0xff8000;
        } else
        {
            i1 = 0xffffff;
        }
        aClass3_Sub1_665.method252("Attempting to buy/sell a RuneScape account", 256, j, 1, i1);
        j += 15;
        if(anInt894 == 6)
        {
            aClass3_Sub1_665.method215(66, j - 12, 380, 15, 0xffffff);
            i1 = 0xff8000;
        } else
        {
            i1 = 0xffffff;
        }
        aClass3_Sub1_665.method252("Impersonating Jagex staff", 256, j, 1, i1);
        j += 15;
        if(anInt894 == 7)
        {
            aClass3_Sub1_665.method215(66, j - 12, 380, 15, 0xffffff);
            i1 = 0xff8000;
        } else
        {
            i1 = 0xffffff;
        }
        aClass3_Sub1_665.method252("Advertising scam website", 256, j, 1, i1);
        j += 15;
        if(anInt894 == 8)
        {
            aClass3_Sub1_665.method215(66, j - 12, 380, 15, 0xffffff);
            i1 = 0xff8000;
        } else
        {
            i1 = 0xffffff;
        }
        aClass3_Sub1_665.method252("Other", 256, j, 1, i1);
        j += 15;
        j += 11;
        aClass3_Sub1_665.method252("Then type the name of the offending player, and press enter", 256, j, 1, 0xffff00);
        j += 15;
        aClass3_Sub1_665.method252("Name: " + super.aString40 + "*", 256, j, 4, 0xffffff);
        j += 19;
        i1 = 0xffffff;
        if(super.anInt33 > 196 && super.anInt33 < 316 && super.anInt34 > j - 15 && super.anInt34 < j + 5)
            i1 = 0xffff00;
        aClass3_Sub1_665.method252("Click here to cancel", 256, j, 1, i1);
    }

    public void method110()
    {
        if(anInt650 != 0)
        {
            anInt650 = 0;
            if(super.anInt33 < 106 || super.anInt34 < 150 || super.anInt33 > 406 || super.anInt34 > 210)
            {
                anInt895 = 0;
                return;
            }
        }
        int i = 150;
        aClass3_Sub1_665.method214(106, i, 300, 60, 0);
        aClass3_Sub1_665.method215(106, i, 300, 60, 0xffffff);
        i += 22;
        if(anInt895 == 6)
        {
            aClass3_Sub1_665.method252("Please enter your current password", 256, i, 4, 0xffffff);
            i += 25;
            String s = "*";
            for(int j = 0; j < super.aString40.length(); j++)
                s = "X" + s;

            aClass3_Sub1_665.method252(s, 256, i, 4, 0xffffff);
            if(super.aString41.length() > 0)
            {
                aString896 = super.aString41;
                super.aString40 = "";
                super.aString41 = "";
                anInt895 = 1;
                return;
            }
        } else
        if(anInt895 == 1)
        {
            aClass3_Sub1_665.method252("Please enter your new password", 256, i, 4, 0xffffff);
            i += 25;
            String s1 = "*";
            for(int k = 0; k < super.aString40.length(); k++)
                s1 = "X" + s1;

            aClass3_Sub1_665.method252(s1, 256, i, 4, 0xffffff);
            if(super.aString41.length() > 0)
            {
                aString897 = super.aString41;
                super.aString40 = "";
                super.aString41 = "";
                anInt895 = 2;
                if(aString897.length() < 5)
                    anInt895 = 5;
                if(aString897.trim().equalsIgnoreCase(aString934.trim()))
                {
                    anInt895 = 7;
                    return;
                }
            }
        } else
        if(anInt895 == 2)
        {
            aClass3_Sub1_665.method252("Enter password again to confirm", 256, i, 4, 0xffffff);
            i += 25;
            String s2 = "*";
            for(int l = 0; l < super.aString40.length(); l++)
                s2 = "X" + s2;

            aClass3_Sub1_665.method252(s2, 256, i, 4, 0xffffff);
            if(super.aString41.length() > 0)
                if(super.aString41.equalsIgnoreCase(aString897))
                {
                    anInt895 = 4;
                    method31(aString896, aString897);
                    return;
                } else
                {
                    anInt895 = 3;
                    return;
                }
        } else
        {
            if(anInt895 == 3)
            {
                aClass3_Sub1_665.method252("Passwords do not match!", 256, i, 4, 0xffffff);
                i += 25;
                aClass3_Sub1_665.method252("Press any key to close", 256, i, 4, 0xffffff);
                return;
            }
            if(anInt895 == 4)
            {
                aClass3_Sub1_665.method252("Ok, your request has been sent", 256, i, 4, 0xffffff);
                i += 25;
                aClass3_Sub1_665.method252("Press any key to close", 256, i, 4, 0xffffff);
                return;
            }
            if(anInt895 == 5)
            {
                aClass3_Sub1_665.method252("Password must be at", 256, i, 4, 0xffffff);
                i += 25;
                aClass3_Sub1_665.method252("least 5 letters long", 256, i, 4, 0xffffff);
                return;
            }
            if(anInt895 == 7)
            {
                aClass3_Sub1_665.method252("Your password must not be", 256, i, 4, 0xffffff);
                i += 25;
                aClass3_Sub1_665.method252("the same as your username", 256, i, 4, 0xffffff);
            }
        }
    }

    public void method111()
    {
        if(anInt650 != 0)
        {
            anInt650 = 0;
            if(anInt892 == 1 && (super.anInt33 < 106 || super.anInt34 < 145 || super.anInt33 > 406 || super.anInt34 > 215))
            {
                anInt892 = 0;
                return;
            }
            if(anInt892 == 2 && (super.anInt33 < 6 || super.anInt34 < 145 || super.anInt33 > 506 || super.anInt34 > 215))
            {
                anInt892 = 0;
                return;
            }
            if(anInt892 == 3 && (super.anInt33 < 106 || super.anInt34 < 145 || super.anInt33 > 406 || super.anInt34 > 215))
            {
                anInt892 = 0;
                return;
            }
            if(super.anInt33 > 236 && super.anInt33 < 276 && super.anInt34 > 193 && super.anInt34 < 213)
            {
                anInt892 = 0;
                return;
            }
        }
        int i = 145;
        if(anInt892 == 1)
        {
            aClass3_Sub1_665.method214(106, i, 300, 70, 0);
            aClass3_Sub1_665.method215(106, i, 300, 70, 0xffffff);
            i += 20;
            aClass3_Sub1_665.method252("Enter name to add to friends list", 256, i, 4, 0xffffff);
            i += 20;
            aClass3_Sub1_665.method252(super.aString40 + "*", 256, i, 4, 0xffffff);
            if(super.aString41.length() > 0)
            {
                String s = super.aString41.trim();
                super.aString40 = "";
                super.aString41 = "";
                anInt892 = 0;
                if(s.length() > 0 && Class11.method353(s) != aClass15_716.aLong520)
                    method35(s);
            }
        }
        if(anInt892 == 2)
        {
            aClass3_Sub1_665.method214(6, i, 500, 70, 0);
            aClass3_Sub1_665.method215(6, i, 500, 70, 0xffffff);
            i += 20;
            aClass3_Sub1_665.method252("Enter message to send to " + Class11.method354(aLong780), 256, i, 4, 0xffffff);
            i += 20;
            aClass3_Sub1_665.method252(super.aString42 + "*", 256, i, 4, 0xffffff);
            if(super.aString43.length() > 0)
            {
                String s1 = super.aString43;
                super.aString42 = "";
                super.aString43 = "";
                anInt892 = 0;
                int k = Class13.method391(s1);
                method37(aLong780, Class13.aByteArray425, k);
                s1 = Class13.method390(Class13.aByteArray425, 0, k);
                s1 = Class12.method365(s1);
                method47("@pri@You tell " + Class11.method354(aLong780) + ": " + s1);
            }
        }
        if(anInt892 == 3)
        {
            aClass3_Sub1_665.method214(106, i, 300, 70, 0);
            aClass3_Sub1_665.method215(106, i, 300, 70, 0xffffff);
            i += 20;
            aClass3_Sub1_665.method252("Enter name to add to ignore list", 256, i, 4, 0xffffff);
            i += 20;
            aClass3_Sub1_665.method252(super.aString40 + "*", 256, i, 4, 0xffffff);
            if(super.aString41.length() > 0)
            {
                String s2 = super.aString41.trim();
                super.aString40 = "";
                super.aString41 = "";
                anInt892 = 0;
                if(s2.length() > 0 && Class11.method353(s2) != aClass15_716.aLong520)
                    method33(s2);
            }
        }
        int j = 0xffffff;
        if(super.anInt33 > 236 && super.anInt33 < 276 && super.anInt34 > 193 && super.anInt34 < 213)
            j = 0xffff00;
        aClass3_Sub1_665.method252("Cancel", 256, 208, 1, j);
    }

    public void method112()
    {
        char c = '\u0198';
        char c1 = '\u014E';
        if(anInt887 > 0 && anInt881 <= 48)
            anInt887 = 0;
        if(anInt887 > 1 && anInt881 <= 96)
            anInt887 = 1;
        if(anInt887 > 2 && anInt881 <= 144)
            anInt887 = 2;
        if(anInt884 >= anInt881 || anInt884 < 0)
            anInt884 = -1;
        if(anInt884 != -1 && anIntArray882[anInt884] != anInt885)
        {
            anInt884 = -1;
            anInt885 = -2;
        }
        if(anInt650 != 0)
        {
            anInt650 = 0;
            int i = super.anInt33 - (256 - c / 2);
            int k = super.anInt34 - (170 - c1 / 2);
            if(i >= 0 && k >= 12 && i < 408 && k < 280)
            {
                int i1 = anInt887 * 48;
                for(int l1 = 0; l1 < 6; l1++)
                {
                    for(int j2 = 0; j2 < 8; j2++)
                    {
                        int l6 = 7 + j2 * 49;
                        int j7 = 28 + l1 * 34;
                        if(i > l6 && i < l6 + 49 && k > j7 && k < j7 + 34 && i1 < anInt881 && anIntArray882[i1] != -1)
                        {
                            anInt885 = anIntArray882[i1];
                            anInt884 = i1;
                        }
                        i1++;
                    }

                }

                i = 256 - c / 2;
                k = 170 - c1 / 2;
                int k2;
                if(anInt884 < 0)
                    k2 = -1;
                else
                    k2 = anIntArray882[anInt884];
                if(k2 != -1)
                {
                    int j1 = anIntArray883[anInt884];
                    if(Class14.anIntArray435[k2] == 1 && j1 > 1)
                        j1 = 1;
                    if(j1 >= 1 && super.anInt33 >= i + 220 && super.anInt34 >= k + 238 && super.anInt33 < i + 250 && super.anInt34 <= k + 249)
                    {
                        super.aClass10_Sub1_614.method334(206, 655);
                        super.aClass10_Sub1_614.method328(k2);
                        super.aClass10_Sub1_614.method328(1);
                        super.aClass10_Sub1_614.method336();
                    }
                    if(j1 >= 5 && super.anInt33 >= i + 250 && super.anInt34 >= k + 238 && super.anInt33 < i + 280 && super.anInt34 <= k + 249)
                    {
                        super.aClass10_Sub1_614.method334(206, 655);
                        super.aClass10_Sub1_614.method328(k2);
                        super.aClass10_Sub1_614.method328(5);
                        super.aClass10_Sub1_614.method336();
                    }
                    if(j1 >= 25 && super.anInt33 >= i + 280 && super.anInt34 >= k + 238 && super.anInt33 < i + 305 && super.anInt34 <= k + 249)
                    {
                        super.aClass10_Sub1_614.method334(206, 655);
                        super.aClass10_Sub1_614.method328(k2);
                        super.aClass10_Sub1_614.method328(25);
                        super.aClass10_Sub1_614.method336();
                    }
                    if(j1 >= 100 && super.anInt33 >= i + 305 && super.anInt34 >= k + 238 && super.anInt33 < i + 335 && super.anInt34 <= k + 249)
                    {
                        super.aClass10_Sub1_614.method334(206, 655);
                        super.aClass10_Sub1_614.method328(k2);
                        super.aClass10_Sub1_614.method328(100);
                        super.aClass10_Sub1_614.method336();
                    }
                    if(j1 >= 500 && super.anInt33 >= i + 335 && super.anInt34 >= k + 238 && super.anInt33 < i + 368 && super.anInt34 <= k + 249)
                    {
                        super.aClass10_Sub1_614.method334(206, 655);
                        super.aClass10_Sub1_614.method328(k2);
                        super.aClass10_Sub1_614.method328(500);
                        super.aClass10_Sub1_614.method336();
                    }
                    if(j1 >= 2500 && super.anInt33 >= i + 370 && super.anInt34 >= k + 238 && super.anInt33 < i + 400 && super.anInt34 <= k + 249)
                    {
                        super.aClass10_Sub1_614.method334(206, 655);
                        super.aClass10_Sub1_614.method328(k2);
                        super.aClass10_Sub1_614.method328(2500);
                        super.aClass10_Sub1_614.method336();
                    }
                    if(method91(k2) >= 1 && super.anInt33 >= i + 220 && super.anInt34 >= k + 263 && super.anInt33 < i + 250 && super.anInt34 <= k + 274)
                    {
                        super.aClass10_Sub1_614.method334(205, 523);
                        super.aClass10_Sub1_614.method328(k2);
                        super.aClass10_Sub1_614.method328(1);
                        super.aClass10_Sub1_614.method336();
                    }
                    if(method91(k2) >= 5 && super.anInt33 >= i + 250 && super.anInt34 >= k + 263 && super.anInt33 < i + 280 && super.anInt34 <= k + 274)
                    {
                        super.aClass10_Sub1_614.method334(205, 523);
                        super.aClass10_Sub1_614.method328(k2);
                        super.aClass10_Sub1_614.method328(5);
                        super.aClass10_Sub1_614.method336();
                    }
                    if(method91(k2) >= 25 && super.anInt33 >= i + 280 && super.anInt34 >= k + 263 && super.anInt33 < i + 305 && super.anInt34 <= k + 274)
                    {
                        super.aClass10_Sub1_614.method334(205, 523);
                        super.aClass10_Sub1_614.method328(k2);
                        super.aClass10_Sub1_614.method328(25);
                        super.aClass10_Sub1_614.method336();
                    }
                    if(method91(k2) >= 100 && super.anInt33 >= i + 305 && super.anInt34 >= k + 263 && super.anInt33 < i + 335 && super.anInt34 <= k + 274)
                    {
                        super.aClass10_Sub1_614.method334(205, 523);
                        super.aClass10_Sub1_614.method328(k2);
                        super.aClass10_Sub1_614.method328(100);
                        super.aClass10_Sub1_614.method336();
                    }
                    if(method91(k2) >= 500 && super.anInt33 >= i + 335 && super.anInt34 >= k + 263 && super.anInt33 < i + 368 && super.anInt34 <= k + 274)
                    {
                        super.aClass10_Sub1_614.method334(205, 523);
                        super.aClass10_Sub1_614.method328(k2);
                        super.aClass10_Sub1_614.method328(500);
                        super.aClass10_Sub1_614.method336();
                    }
                    if(method91(k2) >= 2500 && super.anInt33 >= i + 370 && super.anInt34 >= k + 263 && super.anInt33 < i + 400 && super.anInt34 <= k + 274)
                    {
                        super.aClass10_Sub1_614.method334(205, 523);
                        super.aClass10_Sub1_614.method328(k2);
                        super.aClass10_Sub1_614.method328(2500);
                        super.aClass10_Sub1_614.method336();
                    }
                }
            } else
            if(anInt881 > 48 && i >= 50 && i <= 115 && k <= 12)
                anInt887 = 0;
            else
            if(anInt881 > 48 && i >= 115 && i <= 180 && k <= 12)
                anInt887 = 1;
            else
            if(anInt881 > 96 && i >= 180 && i <= 245 && k <= 12)
                anInt887 = 2;
            else
            if(anInt881 > 144 && i >= 245 && i <= 310 && k <= 12)
            {
                anInt887 = 3;
            } else
            {
                super.aClass10_Sub1_614.method334(207, 886);
                super.aClass10_Sub1_614.method336();
                aBoolean877 = false;
                return;
            }
        }
        int j = 256 - c / 2;
        int l = 170 - c1 / 2;
        aClass3_Sub1_665.method214(j, l, 408, 12, 192);
        int k1 = 0x989898;
        aClass3_Sub1_665.method212(j, l + 12, 408, 17, k1, 160);
        aClass3_Sub1_665.method212(j, l + 29, 8, 204, k1, 160);
        aClass3_Sub1_665.method212(j + 399, l + 29, 9, 204, k1, 160);
        aClass3_Sub1_665.method212(j, l + 233, 408, 47, k1, 160);
        aClass3_Sub1_665.method254("Bank", j + 1, l + 10, 1, 0xffffff);
        int i2 = 50;
        if(anInt881 > 48)
        {
            int l2 = 0xffffff;
            if(anInt887 == 0)
                l2 = 0xff0000;
            else
            if(super.anInt33 > j + i2 && super.anInt34 >= l && super.anInt33 < j + i2 + 65 && super.anInt34 < l + 12)
                l2 = 0xffff00;
            aClass3_Sub1_665.method254("<page 1>", j + i2, l + 10, 1, l2);
            i2 += 65;
            l2 = 0xffffff;
            if(anInt887 == 1)
                l2 = 0xff0000;
            else
            if(super.anInt33 > j + i2 && super.anInt34 >= l && super.anInt33 < j + i2 + 65 && super.anInt34 < l + 12)
                l2 = 0xffff00;
            aClass3_Sub1_665.method254("<page 2>", j + i2, l + 10, 1, l2);
            i2 += 65;
        }
        if(anInt881 > 96)
        {
            int i3 = 0xffffff;
            if(anInt887 == 2)
                i3 = 0xff0000;
            else
            if(super.anInt33 > j + i2 && super.anInt34 >= l && super.anInt33 < j + i2 + 65 && super.anInt34 < l + 12)
                i3 = 0xffff00;
            aClass3_Sub1_665.method254("<page 3>", j + i2, l + 10, 1, i3);
            i2 += 65;
        }
        if(anInt881 > 144)
        {
            int j3 = 0xffffff;
            if(anInt887 == 3)
                j3 = 0xff0000;
            else
            if(super.anInt33 > j + i2 && super.anInt34 >= l && super.anInt33 < j + i2 + 65 && super.anInt34 < l + 12)
                j3 = 0xffff00;
            aClass3_Sub1_665.method254("<page 4>", j + i2, l + 10, 1, j3);
            i2 += 65;
        }
        int k3 = 0xffffff;
        if(super.anInt33 > j + 320 && super.anInt34 >= l && super.anInt33 < j + 408 && super.anInt34 < l + 12)
            k3 = 0xff0000;
        aClass3_Sub1_665.method251("Close window", j + 406, l + 10, 1, k3);
        aClass3_Sub1_665.method254("Number in bank in green", j + 7, l + 24, 1, 65280);
        aClass3_Sub1_665.method254("Number held in blue", j + 289, l + 24, 1, 65535);
        int i7 = 0xd0d0d0;
        int k7 = anInt887 * 48;
        for(int i8 = 0; i8 < 6; i8++)
        {
            for(int j8 = 0; j8 < 8; j8++)
            {
                int l8 = j + 7 + j8 * 49;
                int i9 = l + 28 + i8 * 34;
                if(anInt884 == k7)
                    aClass3_Sub1_665.method212(l8, i9, 49, 34, 0xff0000, 160);
                else
                    aClass3_Sub1_665.method212(l8, i9, 49, 34, i7, 160);
                aClass3_Sub1_665.method215(l8, i9, 50, 35, 0);
                if(k7 < anInt881 && anIntArray882[k7] != -1)
                {
                    aClass3_Sub1_665.method245(l8, i9, 48, 32, anInt673 + Class14.anIntArray433[anIntArray882[k7]], Class14.anIntArray438[anIntArray882[k7]], 0, 0, false);
                    aClass3_Sub1_665.method254(String.valueOf(anIntArray883[k7]), l8 + 1, i9 + 10, 1, 65280);
                    aClass3_Sub1_665.method251(String.valueOf(method91(anIntArray882[k7])), l8 + 47, i9 + 29, 1, 65535);
                }
                k7++;
            }

        }

        aClass3_Sub1_665.method216(j + 5, l + 256, 398, 0);
        if(anInt884 == -1)
        {
            aClass3_Sub1_665.method252("Select an object to withdraw or deposit", j + 204, l + 248, 3, 0xffff00);
            return;
        }
        int k8;
        if(anInt884 < 0)
            k8 = -1;
        else
            k8 = anIntArray882[anInt884];
        if(k8 != -1)
        {
            int l7 = anIntArray883[anInt884];
            if(Class14.anIntArray435[k8] == 1 && l7 > 1)
                l7 = 1;
            if(l7 > 0)
            {
                aClass3_Sub1_665.method254("Withdraw " + Class14.aStringArray430[k8], j + 2, l + 248, 1, 0xffffff);
                int l3 = 0xffffff;
                if(super.anInt33 >= j + 220 && super.anInt34 >= l + 238 && super.anInt33 < j + 250 && super.anInt34 <= l + 249)
                    l3 = 0xff0000;
                aClass3_Sub1_665.method254("One", j + 222, l + 248, 1, l3);
                if(l7 >= 5)
                {
                    int i4 = 0xffffff;
                    if(super.anInt33 >= j + 250 && super.anInt34 >= l + 238 && super.anInt33 < j + 280 && super.anInt34 <= l + 249)
                        i4 = 0xff0000;
                    aClass3_Sub1_665.method254("Five", j + 252, l + 248, 1, i4);
                }
                if(l7 >= 25)
                {
                    int j4 = 0xffffff;
                    if(super.anInt33 >= j + 280 && super.anInt34 >= l + 238 && super.anInt33 < j + 305 && super.anInt34 <= l + 249)
                        j4 = 0xff0000;
                    aClass3_Sub1_665.method254("25", j + 282, l + 248, 1, j4);
                }
                if(l7 >= 100)
                {
                    int k4 = 0xffffff;
                    if(super.anInt33 >= j + 305 && super.anInt34 >= l + 238 && super.anInt33 < j + 335 && super.anInt34 <= l + 249)
                        k4 = 0xff0000;
                    aClass3_Sub1_665.method254("100", j + 307, l + 248, 1, k4);
                }
                if(l7 >= 500)
                {
                    int l4 = 0xffffff;
                    if(super.anInt33 >= j + 335 && super.anInt34 >= l + 238 && super.anInt33 < j + 368 && super.anInt34 <= l + 249)
                        l4 = 0xff0000;
                    aClass3_Sub1_665.method254("500", j + 337, l + 248, 1, l4);
                }
                if(l7 >= 2500)
                {
                    int i5 = 0xffffff;
                    if(super.anInt33 >= j + 370 && super.anInt34 >= l + 238 && super.anInt33 < j + 400 && super.anInt34 <= l + 249)
                        i5 = 0xff0000;
                    aClass3_Sub1_665.method254("2500", j + 370, l + 248, 1, i5);
                }
            }
            if(method91(k8) > 0)
            {
                aClass3_Sub1_665.method254("Deposit " + Class14.aStringArray430[k8], j + 2, l + 273, 1, 0xffffff);
                int j5 = 0xffffff;
                if(super.anInt33 >= j + 220 && super.anInt34 >= l + 263 && super.anInt33 < j + 250 && super.anInt34 <= l + 274)
                    j5 = 0xff0000;
                aClass3_Sub1_665.method254("One", j + 222, l + 273, 1, j5);
                if(method91(k8) >= 5)
                {
                    int k5 = 0xffffff;
                    if(super.anInt33 >= j + 250 && super.anInt34 >= l + 263 && super.anInt33 < j + 280 && super.anInt34 <= l + 274)
                        k5 = 0xff0000;
                    aClass3_Sub1_665.method254("Five", j + 252, l + 273, 1, k5);
                }
                if(method91(k8) >= 25)
                {
                    int l5 = 0xffffff;
                    if(super.anInt33 >= j + 280 && super.anInt34 >= l + 263 && super.anInt33 < j + 305 && super.anInt34 <= l + 274)
                        l5 = 0xff0000;
                    aClass3_Sub1_665.method254("25", j + 282, l + 273, 1, l5);
                }
                if(method91(k8) >= 100)
                {
                    int i6 = 0xffffff;
                    if(super.anInt33 >= j + 305 && super.anInt34 >= l + 263 && super.anInt33 < j + 335 && super.anInt34 <= l + 274)
                        i6 = 0xff0000;
                    aClass3_Sub1_665.method254("100", j + 307, l + 273, 1, i6);
                }
                if(method91(k8) >= 500)
                {
                    int j6 = 0xffffff;
                    if(super.anInt33 >= j + 335 && super.anInt34 >= l + 263 && super.anInt33 < j + 368 && super.anInt34 <= l + 274)
                        j6 = 0xff0000;
                    aClass3_Sub1_665.method254("500", j + 337, l + 273, 1, j6);
                }
                if(method91(k8) >= 2500)
                {
                    int k6 = 0xffffff;
                    if(super.anInt33 >= j + 370 && super.anInt34 >= l + 263 && super.anInt33 < j + 400 && super.anInt34 <= l + 274)
                        k6 = 0xff0000;
                    aClass3_Sub1_665.method254("2500", j + 370, l + 273, 1, k6);
                }
            }
        }
    }

    public void method113()
    {
        if(anInt650 != 0)
        {
            anInt650 = 0;
            int i = super.anInt33 - 52;
            int j = super.anInt34 - 44;
            if(i >= 0 && j >= 12 && i < 408 && j < 246)
            {
                int k = 0;
                for(int i1 = 0; i1 < 5; i1++)
                {
                    for(int i2 = 0; i2 < 8; i2++)
                    {
                        int l2 = 7 + i2 * 49;
                        int l3 = 28 + i1 * 34;
                        if(i > l2 && i < l2 + 49 && j > l3 && j < l3 + 34 && anIntArray872[k] != -1)
                        {
                            anInt875 = k;
                            anInt876 = anIntArray872[k];
                        }
                        k++;
                    }

                }

                if(anInt875 >= 0)
                {
                    int j2 = anIntArray872[anInt875];
                    if(j2 != -1)
                    {
                        if(anIntArray873[anInt875] > 0 && i > 298 && j >= 204 && i < 408 && j <= 215)
                        {
                            int i3 = anInt871 + anIntArray874[anInt875];
                            if(i3 < 10)
                                i3 = 10;
                            int i4 = (i3 * Class14.anIntArray434[j2]) / 100;
                            super.aClass10_Sub1_614.method334(217, 666);
                            super.aClass10_Sub1_614.method328(anIntArray872[anInt875]);
                            super.aClass10_Sub1_614.method329(i4);
                            super.aClass10_Sub1_614.method336();
                        }
                        if(method91(j2) > 0 && i > 2 && j >= 229 && i < 112 && j <= 240)
                        {
                            int j3 = anInt870 + anIntArray874[anInt875];
                            if(j3 < 10)
                                j3 = 10;
                            int j4 = (j3 * Class14.anIntArray434[j2]) / 100;
                            super.aClass10_Sub1_614.method334(216, 665);
                            super.aClass10_Sub1_614.method328(anIntArray872[anInt875]);
                            super.aClass10_Sub1_614.method329(j4);
                            super.aClass10_Sub1_614.method336();
                        }
                    }
                }
            } else
            {
                super.aClass10_Sub1_614.method334(218, 312);
                super.aClass10_Sub1_614.method336();
                aBoolean869 = false;
                return;
            }
        }
        byte byte0 = 52;
        byte byte1 = 44;
        aClass3_Sub1_665.method214(byte0, byte1, 408, 12, 192);
        int l = 0x989898;
        aClass3_Sub1_665.method212(byte0, byte1 + 12, 408, 17, l, 160);
        aClass3_Sub1_665.method212(byte0, byte1 + 29, 8, 170, l, 160);
        aClass3_Sub1_665.method212(byte0 + 399, byte1 + 29, 9, 170, l, 160);
        aClass3_Sub1_665.method212(byte0, byte1 + 199, 408, 47, l, 160);
        aClass3_Sub1_665.method254("Buying and selling items", byte0 + 1, byte1 + 10, 1, 0xffffff);
        int j1 = 0xffffff;
        if(super.anInt33 > byte0 + 320 && super.anInt34 >= byte1 && super.anInt33 < byte0 + 408 && super.anInt34 < byte1 + 12)
            j1 = 0xff0000;
        aClass3_Sub1_665.method251("Close window", byte0 + 406, byte1 + 10, 1, j1);
        aClass3_Sub1_665.method254("Shops stock in green", byte0 + 2, byte1 + 24, 1, 65280);
        aClass3_Sub1_665.method254("Number you own in blue", byte0 + 135, byte1 + 24, 1, 65535);
        aClass3_Sub1_665.method254("Your money: " + method91(10) + "gp", byte0 + 280, byte1 + 24, 1, 0xffff00);
        int k2 = 0xd0d0d0;
        int k3 = 0;
        for(int k4 = 0; k4 < 5; k4++)
        {
            for(int l4 = 0; l4 < 8; l4++)
            {
                int j5 = byte0 + 7 + l4 * 49;
                int i6 = byte1 + 28 + k4 * 34;
                if(anInt875 == k3)
                    aClass3_Sub1_665.method212(j5, i6, 49, 34, 0xff0000, 160);
                else
                    aClass3_Sub1_665.method212(j5, i6, 49, 34, k2, 160);
                aClass3_Sub1_665.method215(j5, i6, 50, 35, 0);
                if(anIntArray872[k3] != -1)
                {
                    aClass3_Sub1_665.method245(j5, i6, 48, 32, anInt673 + Class14.anIntArray433[anIntArray872[k3]], Class14.anIntArray438[anIntArray872[k3]], 0, 0, false);
                    aClass3_Sub1_665.method254(String.valueOf(anIntArray873[k3]), j5 + 1, i6 + 10, 1, 65280);
                    aClass3_Sub1_665.method251(String.valueOf(method91(anIntArray872[k3])), j5 + 47, i6 + 10, 1, 65535);
                }
                k3++;
            }

        }

        aClass3_Sub1_665.method216(byte0 + 5, byte1 + 222, 398, 0);
        if(anInt875 == -1)
        {
            aClass3_Sub1_665.method252("Select an object to buy or sell", byte0 + 204, byte1 + 214, 3, 0xffff00);
            return;
        }
        int i5 = anIntArray872[anInt875];
        if(i5 != -1)
        {
            if(anIntArray873[anInt875] > 0)
            {
                int k5 = anInt871 + anIntArray874[anInt875];
                if(k5 < 10)
                    k5 = 10;
                int j6 = (k5 * Class14.anIntArray434[i5]) / 100;
                aClass3_Sub1_665.method254("Buy a new " + Class14.aStringArray430[i5] + " for " + j6 + "gp", byte0 + 2, byte1 + 214, 1, 0xffff00);
                int k1 = 0xffffff;
                if(super.anInt33 > byte0 + 298 && super.anInt34 >= byte1 + 204 && super.anInt33 < byte0 + 408 && super.anInt34 <= byte1 + 215)
                    k1 = 0xff0000;
                aClass3_Sub1_665.method251("Click here to buy", byte0 + 405, byte1 + 214, 3, k1);
            } else
            {
                aClass3_Sub1_665.method252("This item is not currently available to buy", byte0 + 204, byte1 + 214, 3, 0xffff00);
            }
            if(method91(i5) > 0)
            {
                int l5 = anInt870 + anIntArray874[anInt875];
                if(l5 < 10)
                    l5 = 10;
                int k6 = (l5 * Class14.anIntArray434[i5]) / 100;
                aClass3_Sub1_665.method251("Sell your " + Class14.aStringArray430[i5] + " for " + k6 + "gp", byte0 + 405, byte1 + 239, 1, 0xffff00);
                int l1 = 0xffffff;
                if(super.anInt33 > byte0 + 2 && super.anInt34 >= byte1 + 229 && super.anInt33 < byte0 + 112 && super.anInt34 <= byte1 + 240)
                    l1 = 0xff0000;
                aClass3_Sub1_665.method254("Click here to sell", byte0 + 2, byte1 + 239, 3, l1);
                return;
            }
            aClass3_Sub1_665.method252("You do not have any of this item to sell", byte0 + 204, byte1 + 239, 3, 0xffff00);
        }
    }

    public void method114()
    {
        byte byte0 = 22;
        byte byte1 = 36;
        aClass3_Sub1_665.method214(byte0, byte1, 468, 16, 192);
        int i = 0x989898;
        aClass3_Sub1_665.method212(byte0, byte1 + 16, 468, 246, i, 160);
        aClass3_Sub1_665.method252("Please confirm your trade with @yel@" + Class11.method354(aLong860), byte0 + 234, byte1 + 12, 1, 0xffffff);
        aClass3_Sub1_665.method252("You are about to give:", byte0 + 117, byte1 + 30, 1, 0xffff00);
        for(int j = 0; j < anInt863; j++)
        {
            String s = Class14.aStringArray430[anIntArray864[j]];
            if(Class14.anIntArray435[anIntArray864[j]] == 0)
                s = s + " (" + anIntArray865[j] + ")";
            aClass3_Sub1_665.method252(s, byte0 + 117, byte1 + 42 + j * 12, 1, 0xffffff);
        }

        if(anInt863 == 0)
            aClass3_Sub1_665.method252("Nothing!", byte0 + 117, byte1 + 42, 1, 0xffffff);
        aClass3_Sub1_665.method252("In return you will receive:", byte0 + 351, byte1 + 30, 1, 0xffff00);
        for(int k = 0; k < anInt866; k++)
        {
            String s1 = Class14.aStringArray430[anIntArray867[k]];
            if(Class14.anIntArray435[anIntArray867[k]] == 0)
                s1 = s1 + " (" + anIntArray868[k] + ")";
            aClass3_Sub1_665.method252(s1, byte0 + 351, byte1 + 42 + k * 12, 1, 0xffffff);
        }

        if(anInt866 == 0)
            aClass3_Sub1_665.method252("Nothing!", byte0 + 351, byte1 + 42, 1, 0xffffff);
        aClass3_Sub1_665.method252("Are you sure you want to do this?", byte0 + 234, byte1 + 200, 4, 65535);
        aClass3_Sub1_665.method252("There is NO WAY to reverse a trade if you change your mind.", byte0 + 234, byte1 + 215, 1, 0xffffff);
        aClass3_Sub1_665.method252("Remember that not all players are trustworthy", byte0 + 234, byte1 + 230, 1, 0xffffff);
        if(!aBoolean862)
        {
            aClass3_Sub1_665.method229((byte0 + 118) - 35, byte1 + 238, anInt671 + 25);
            aClass3_Sub1_665.method229((byte0 + 352) - 35, byte1 + 238, anInt671 + 26);
        } else
        {
            aClass3_Sub1_665.method252("Waiting for other player...", byte0 + 234, byte1 + 250, 1, 0xffff00);
        }
        if(anInt650 == 1)
        {
            if(super.anInt33 < byte0 || super.anInt34 < byte1 || super.anInt33 > byte0 + 468 || super.anInt34 > byte1 + 262)
            {
                aBoolean861 = false;
                super.aClass10_Sub1_614.method334(233, 235);
                super.aClass10_Sub1_614.method336();
            }
            if(super.anInt33 >= (byte0 + 118) - 35 && super.anInt33 <= byte0 + 118 + 70 && super.anInt34 >= byte1 + 238 && super.anInt34 <= byte1 + 238 + 21)
            {
                aBoolean862 = true;
                super.aClass10_Sub1_614.method334(202, 96);
                super.aClass10_Sub1_614.method336();
            }
            if(super.anInt33 >= (byte0 + 352) - 35 && super.anInt33 <= byte0 + 353 + 70 && super.anInt34 >= byte1 + 238 && super.anInt34 <= byte1 + 238 + 21)
            {
                aBoolean861 = false;
                super.aClass10_Sub1_614.method334(233, 235);
                super.aClass10_Sub1_614.method336();
            }
            anInt650 = 0;
        }
    }

    public void method115()
    {
        if(anInt650 != 0 && anInt859 == 0)
            anInt859 = 1;
        if(anInt859 > 0)
        {
            int i = super.anInt33 - 22;
            int j = super.anInt34 - 36;
            if(i >= 0 && j >= 0 && i < 468 && j < 262)
            {
                if(i > 216 && j > 30 && i < 462 && j < 235)
                {
                    int k = (i - 217) / 49 + ((j - 31) / 34) * 5;
                    if(k >= 0 && k < anInt753)
                    {
                        boolean flag = false;
                        int l1 = 0;
                        int k2 = anIntArray754[k];
                        for(int k3 = 0; k3 < anInt850; k3++)
                            if(anIntArray851[k3] == k2)
                                if(Class14.anIntArray435[k2] == 0)
                                {
                                    for(int i4 = 0; i4 < anInt859; i4++)
                                    {
                                        if(anIntArray852[k3] < anIntArray755[k])
                                            anIntArray852[k3]++;
                                        flag = true;
                                    }

                                } else
                                {
                                    l1++;
                                }

                        if(method91(k2) <= l1)
                            flag = true;
                        if(Class14.anIntArray439[k2] == 1)
                        {
                            method77("This object cannot be traded with other players", 3);
                            flag = true;
                        }
                        if(!flag && anInt850 < 12)
                        {
                            anIntArray851[anInt850] = k2;
                            anIntArray852[anInt850] = 1;
                            anInt850++;
                            flag = true;
                        }
                        if(flag)
                        {
                            super.aClass10_Sub1_614.method334(234, 500);
                            super.aClass10_Sub1_614.method327(anInt850);
                            for(int j4 = 0; j4 < anInt850; j4++)
                            {
                                super.aClass10_Sub1_614.method328(anIntArray851[j4]);
                                super.aClass10_Sub1_614.method329(anIntArray852[j4]);
                            }

                            super.aClass10_Sub1_614.method336();
                            aBoolean856 = false;
                            aBoolean857 = false;
                        }
                    }
                }
                if(i > 8 && j > 30 && i < 205 && j < 133)
                {
                    int l = (i - 9) / 49 + ((j - 31) / 34) * 4;
                    if(l >= 0 && l < anInt850)
                    {
                        int j1 = anIntArray851[l];
                        for(int i2 = 0; i2 < anInt859; i2++)
                        {
                            if(Class14.anIntArray435[j1] == 0 && anIntArray852[l] > 1)
                            {
                                anIntArray852[l]--;
                                continue;
                            }
                            anInt850--;
                            anInt858 = 0;
                            for(int l2 = l; l2 < anInt850; l2++)
                            {
                                anIntArray851[l2] = anIntArray851[l2 + 1];
                                anIntArray852[l2] = anIntArray852[l2 + 1];
                            }

                            break;
                        }

                        super.aClass10_Sub1_614.method334(234, 500);
                        super.aClass10_Sub1_614.method327(anInt850);
                        for(int i3 = 0; i3 < anInt850; i3++)
                        {
                            super.aClass10_Sub1_614.method328(anIntArray851[i3]);
                            super.aClass10_Sub1_614.method329(anIntArray852[i3]);
                        }

                        super.aClass10_Sub1_614.method336();
                        aBoolean856 = false;
                        aBoolean857 = false;
                    }
                }
                if(i >= 217 && j >= 238 && i <= 286 && j <= 259)
                {
                    aBoolean857 = true;
                    super.aClass10_Sub1_614.method334(232, 277);
                    super.aClass10_Sub1_614.method336();
                }
                if(i >= 394 && j >= 238 && i < 463 && j < 259)
                {
                    aBoolean848 = false;
                    super.aClass10_Sub1_614.method334(233, 235);
                    super.aClass10_Sub1_614.method336();
                }
            } else
            if(anInt650 != 0)
            {
                aBoolean848 = false;
                super.aClass10_Sub1_614.method334(233, 235);
                super.aClass10_Sub1_614.method336();
            }
            anInt650 = 0;
            anInt859 = 0;
        }
        if(!aBoolean848)
            return;
        byte byte0 = 22;
        byte byte1 = 36;
        aClass3_Sub1_665.method214(byte0, byte1, 468, 12, 192);
        int i1 = 0x989898;
        aClass3_Sub1_665.method212(byte0, byte1 + 12, 468, 18, i1, 160);
        aClass3_Sub1_665.method212(byte0, byte1 + 30, 8, 248, i1, 160);
        aClass3_Sub1_665.method212(byte0 + 205, byte1 + 30, 11, 248, i1, 160);
        aClass3_Sub1_665.method212(byte0 + 462, byte1 + 30, 6, 248, i1, 160);
        aClass3_Sub1_665.method212(byte0 + 8, byte1 + 133, 197, 22, i1, 160);
        aClass3_Sub1_665.method212(byte0 + 8, byte1 + 258, 197, 20, i1, 160);
        aClass3_Sub1_665.method212(byte0 + 216, byte1 + 235, 246, 43, i1, 160);
        int k1 = 0xd0d0d0;
        aClass3_Sub1_665.method212(byte0 + 8, byte1 + 30, 197, 103, k1, 160);
        aClass3_Sub1_665.method212(byte0 + 8, byte1 + 155, 197, 103, k1, 160);
        aClass3_Sub1_665.method212(byte0 + 216, byte1 + 30, 246, 205, k1, 160);
        for(int j2 = 0; j2 < 4; j2++)
            aClass3_Sub1_665.method216(byte0 + 8, byte1 + 30 + j2 * 34, 197, 0);

        for(int j3 = 0; j3 < 4; j3++)
            aClass3_Sub1_665.method216(byte0 + 8, byte1 + 155 + j3 * 34, 197, 0);

        for(int l3 = 0; l3 < 7; l3++)
            aClass3_Sub1_665.method216(byte0 + 216, byte1 + 30 + l3 * 34, 246, 0);

        for(int k4 = 0; k4 < 6; k4++)
        {
            if(k4 < 5)
                aClass3_Sub1_665.method217(byte0 + 8 + k4 * 49, byte1 + 30, 103, 0);
            if(k4 < 5)
                aClass3_Sub1_665.method217(byte0 + 8 + k4 * 49, byte1 + 155, 103, 0);
            aClass3_Sub1_665.method217(byte0 + 216 + k4 * 49, byte1 + 30, 205, 0);
        }

        aClass3_Sub1_665.method254("Trading with: " + aString849, byte0 + 1, byte1 + 10, 1, 0xffffff);
        aClass3_Sub1_665.method254("Your Offer", byte0 + 9, byte1 + 27, 4, 0xffffff);
        aClass3_Sub1_665.method254("Opponent's Offer", byte0 + 9, byte1 + 152, 4, 0xffffff);
        aClass3_Sub1_665.method254("Your Inventory", byte0 + 216, byte1 + 27, 4, 0xffffff);
        if(!aBoolean857)
            aClass3_Sub1_665.method229(byte0 + 217, byte1 + 238, anInt671 + 25);
        aClass3_Sub1_665.method229(byte0 + 394, byte1 + 238, anInt671 + 26);
        if(aBoolean856)
        {
            aClass3_Sub1_665.method252("Other player", byte0 + 341, byte1 + 246, 1, 0xffffff);
            aClass3_Sub1_665.method252("has accepted", byte0 + 341, byte1 + 256, 1, 0xffffff);
        }
        if(aBoolean857)
        {
            aClass3_Sub1_665.method252("Waiting for", byte0 + 217 + 35, byte1 + 246, 1, 0xffffff);
            aClass3_Sub1_665.method252("other player", byte0 + 217 + 35, byte1 + 256, 1, 0xffffff);
        }
        for(int l4 = 0; l4 < anInt753; l4++)
        {
            int i5 = 217 + byte0 + (l4 % 5) * 49;
            int k5 = 31 + byte1 + (l4 / 5) * 34;
            aClass3_Sub1_665.method245(i5, k5, 48, 32, anInt673 + Class14.anIntArray433[anIntArray754[l4]], Class14.anIntArray438[anIntArray754[l4]], 0, 0, false);
            if(Class14.anIntArray435[anIntArray754[l4]] == 0)
                aClass3_Sub1_665.method254(String.valueOf(anIntArray755[l4]), i5 + 1, k5 + 10, 1, 0xffff00);
        }

        for(int j5 = 0; j5 < anInt850; j5++)
        {
            int l5 = 9 + byte0 + (j5 % 4) * 49;
            int j6 = 31 + byte1 + (j5 / 4) * 34;
            aClass3_Sub1_665.method245(l5, j6, 48, 32, anInt673 + Class14.anIntArray433[anIntArray851[j5]], Class14.anIntArray438[anIntArray851[j5]], 0, 0, false);
            if(Class14.anIntArray435[anIntArray851[j5]] == 0)
                aClass3_Sub1_665.method254(String.valueOf(anIntArray852[j5]), l5 + 1, j6 + 10, 1, 0xffff00);
            if(super.anInt33 > l5 && super.anInt33 < l5 + 48 && super.anInt34 > j6 && super.anInt34 < j6 + 32)
                aClass3_Sub1_665.method254(Class14.aStringArray430[anIntArray851[j5]] + ": @whi@" + Class14.aStringArray431[anIntArray851[j5]], byte0 + 8, byte1 + 273, 1, 0xffff00);
        }

        for(int i6 = 0; i6 < anInt853; i6++)
        {
            int k6 = 9 + byte0 + (i6 % 4) * 49;
            int l6 = 156 + byte1 + (i6 / 4) * 34;
            aClass3_Sub1_665.method245(k6, l6, 48, 32, anInt673 + Class14.anIntArray433[anIntArray854[i6]], Class14.anIntArray438[anIntArray854[i6]], 0, 0, false);
            if(Class14.anIntArray435[anIntArray854[i6]] == 0)
                aClass3_Sub1_665.method254(String.valueOf(anIntArray855[i6]), k6 + 1, l6 + 10, 1, 0xffff00);
            if(super.anInt33 > k6 && super.anInt33 < k6 + 48 && super.anInt34 > l6 && super.anInt34 < l6 + 32)
                aClass3_Sub1_665.method254(Class14.aStringArray430[anIntArray854[i6]] + ": @whi@" + Class14.aStringArray431[anIntArray854[i6]], byte0 + 8, byte1 + 273, 1, 0xffff00);
        }

    }

    public void method116()
    {
        byte byte0 = 22;
        byte byte1 = 36;
        aClass3_Sub1_665.method214(byte0, byte1, 468, 16, 192);
        int i = 0x989898;
        aClass3_Sub1_665.method212(byte0, byte1 + 16, 468, 246, i, 160);
        aClass3_Sub1_665.method252("Please confirm your duel with @yel@" + Class11.method354(aLong837), byte0 + 234, byte1 + 12, 1, 0xffffff);
        aClass3_Sub1_665.method252("Your stake:", byte0 + 117, byte1 + 30, 1, 0xffff00);
        for(int j = 0; j < anInt838; j++)
        {
            String s = Class14.aStringArray430[anIntArray839[j]];
            if(Class14.anIntArray435[anIntArray839[j]] == 0)
                s = s + " (" + anIntArray840[j] + ")";
            aClass3_Sub1_665.method252(s, byte0 + 117, byte1 + 42 + j * 12, 1, 0xffffff);
        }

        if(anInt838 == 0)
            aClass3_Sub1_665.method252("Nothing!", byte0 + 117, byte1 + 42, 1, 0xffffff);
        aClass3_Sub1_665.method252("Your opponent's stake:", byte0 + 351, byte1 + 30, 1, 0xffff00);
        for(int k = 0; k < anInt841; k++)
        {
            String s1 = Class14.aStringArray430[anIntArray842[k]];
            if(Class14.anIntArray435[anIntArray842[k]] == 0)
                s1 = s1 + " (" + anIntArray843[k] + ")";
            aClass3_Sub1_665.method252(s1, byte0 + 351, byte1 + 42 + k * 12, 1, 0xffffff);
        }

        if(anInt841 == 0)
            aClass3_Sub1_665.method252("Nothing!", byte0 + 351, byte1 + 42, 1, 0xffffff);
        if(anInt844 == 0)
            aClass3_Sub1_665.method252("You can retreat from this duel", byte0 + 234, byte1 + 180, 1, 65280);
        else
            aClass3_Sub1_665.method252("No retreat is possible!", byte0 + 234, byte1 + 180, 1, 0xff0000);
        if(anInt845 == 0)
            aClass3_Sub1_665.method252("Magic may be used", byte0 + 234, byte1 + 192, 1, 65280);
        else
            aClass3_Sub1_665.method252("Magic cannot be used", byte0 + 234, byte1 + 192, 1, 0xff0000);
        if(anInt846 == 0)
            aClass3_Sub1_665.method252("Prayer may be used", byte0 + 234, byte1 + 204, 1, 65280);
        else
            aClass3_Sub1_665.method252("Prayer cannot be used", byte0 + 234, byte1 + 204, 1, 0xff0000);
        if(anInt847 == 0)
            aClass3_Sub1_665.method252("Weapons may be used", byte0 + 234, byte1 + 216, 1, 65280);
        else
            aClass3_Sub1_665.method252("Weapons cannot be used", byte0 + 234, byte1 + 216, 1, 0xff0000);
        aClass3_Sub1_665.method252("If you are sure click 'Accept' to begin the duel", byte0 + 234, byte1 + 230, 1, 0xffffff);
        if(!aBoolean836)
        {
            aClass3_Sub1_665.method229((byte0 + 118) - 35, byte1 + 238, anInt671 + 25);
            aClass3_Sub1_665.method229((byte0 + 352) - 35, byte1 + 238, anInt671 + 26);
        } else
        {
            aClass3_Sub1_665.method252("Waiting for other player...", byte0 + 234, byte1 + 250, 1, 0xffff00);
        }
        if(anInt650 == 1)
        {
            if(super.anInt33 < byte0 || super.anInt34 < byte1 || super.anInt33 > byte0 + 468 || super.anInt34 > byte1 + 262)
            {
                aBoolean835 = false;
                super.aClass10_Sub1_614.method334(233, 235);
                super.aClass10_Sub1_614.method336();
            }
            if(super.anInt33 >= (byte0 + 118) - 35 && super.anInt33 <= byte0 + 118 + 70 && super.anInt34 >= byte1 + 238 && super.anInt34 <= byte1 + 238 + 21)
            {
                aBoolean836 = true;
                super.aClass10_Sub1_614.method334(198, 412);
                super.aClass10_Sub1_614.method336();
            }
            if(super.anInt33 >= (byte0 + 352) - 35 && super.anInt33 <= byte0 + 353 + 70 && super.anInt34 >= byte1 + 238 && super.anInt34 <= byte1 + 238 + 21)
            {
                aBoolean835 = false;
                super.aClass10_Sub1_614.method334(203, 266);
                super.aClass10_Sub1_614.method336();
            }
            anInt650 = 0;
        }
    }

    public void method117()
    {
        if(anInt650 != 0 && anInt859 == 0)
            anInt859 = 1;
        if(anInt859 > 0)
        {
            int i = super.anInt33 - 22;
            int j = super.anInt34 - 36;
            if(i >= 0 && j >= 0 && i < 468 && j < 262)
            {
                if(i > 216 && j > 30 && i < 462 && j < 235)
                {
                    int k = (i - 217) / 49 + ((j - 31) / 34) * 5;
                    if(k >= 0 && k < anInt753)
                    {
                        boolean flag1 = false;
                        int l1 = 0;
                        int k2 = anIntArray754[k];
                        for(int k3 = 0; k3 < anInt823; k3++)
                            if(anIntArray824[k3] == k2)
                                if(Class14.anIntArray435[k2] == 0)
                                {
                                    for(int i4 = 0; i4 < anInt859; i4++)
                                    {
                                        if(anIntArray825[k3] < anIntArray755[k])
                                            anIntArray825[k3]++;
                                        flag1 = true;
                                    }

                                } else
                                {
                                    l1++;
                                }

                        if(method91(k2) <= l1)
                            flag1 = true;
                        if(Class14.anIntArray439[k2] == 1)
                        {
                            method77("This object cannot be added to a duel offer", 3);
                            flag1 = true;
                        }
                        if(!flag1 && anInt823 < 8)
                        {
                            anIntArray824[anInt823] = k2;
                            anIntArray825[anInt823] = 1;
                            anInt823++;
                            flag1 = true;
                        }
                        if(flag1)
                        {
                            super.aClass10_Sub1_614.method334(201, 53);
                            super.aClass10_Sub1_614.method327(anInt823);
                            for(int j4 = 0; j4 < anInt823; j4++)
                            {
                                super.aClass10_Sub1_614.method328(anIntArray824[j4]);
                                super.aClass10_Sub1_614.method329(anIntArray825[j4]);
                            }

                            super.aClass10_Sub1_614.method336();
                            aBoolean829 = false;
                            aBoolean830 = false;
                        }
                    }
                }
                if(i > 8 && j > 30 && i < 205 && j < 129)
                {
                    int l = (i - 9) / 49 + ((j - 31) / 34) * 4;
                    if(l >= 0 && l < anInt823)
                    {
                        int j1 = anIntArray824[l];
                        for(int i2 = 0; i2 < anInt859; i2++)
                        {
                            if(Class14.anIntArray435[j1] == 0 && anIntArray825[l] > 1)
                            {
                                anIntArray825[l]--;
                                continue;
                            }
                            anInt823--;
                            anInt858 = 0;
                            for(int l2 = l; l2 < anInt823; l2++)
                            {
                                anIntArray824[l2] = anIntArray824[l2 + 1];
                                anIntArray825[l2] = anIntArray825[l2 + 1];
                            }

                            break;
                        }

                        super.aClass10_Sub1_614.method334(201, 53);
                        super.aClass10_Sub1_614.method327(anInt823);
                        for(int i3 = 0; i3 < anInt823; i3++)
                        {
                            super.aClass10_Sub1_614.method328(anIntArray824[i3]);
                            super.aClass10_Sub1_614.method329(anIntArray825[i3]);
                        }

                        super.aClass10_Sub1_614.method336();
                        aBoolean829 = false;
                        aBoolean830 = false;
                    }
                }
                boolean flag = false;
                if(i >= 93 && j >= 221 && i <= 104 && j <= 232)
                {
                    aBoolean831 = !aBoolean831;
                    flag = true;
                }
                if(i >= 93 && j >= 240 && i <= 104 && j <= 251)
                {
                    aBoolean832 = !aBoolean832;
                    flag = true;
                }
                if(i >= 191 && j >= 221 && i <= 202 && j <= 232)
                {
                    aBoolean833 = !aBoolean833;
                    flag = true;
                }
                if(i >= 191 && j >= 240 && i <= 202 && j <= 251)
                {
                    aBoolean834 = !aBoolean834;
                    flag = true;
                }
                if(flag)
                {
                    super.aClass10_Sub1_614.method334(200, 285);
                    super.aClass10_Sub1_614.method327(aBoolean831 ? 1 : 0);
                    super.aClass10_Sub1_614.method327(aBoolean832 ? 1 : 0);
                    super.aClass10_Sub1_614.method327(aBoolean833 ? 1 : 0);
                    super.aClass10_Sub1_614.method327(aBoolean834 ? 1 : 0);
                    super.aClass10_Sub1_614.method336();
                    aBoolean829 = false;
                    aBoolean830 = false;
                }
                if(i >= 217 && j >= 238 && i <= 286 && j <= 259)
                {
                    aBoolean830 = true;
                    super.aClass10_Sub1_614.method334(199, 564);
                    super.aClass10_Sub1_614.method336();
                }
                if(i >= 394 && j >= 238 && i < 463 && j < 259)
                {
                    aBoolean821 = false;
                    super.aClass10_Sub1_614.method334(203, 266);
                    super.aClass10_Sub1_614.method336();
                }
            } else
            if(anInt650 != 0)
            {
                aBoolean821 = false;
                super.aClass10_Sub1_614.method334(203, 266);
                super.aClass10_Sub1_614.method336();
            }
            anInt650 = 0;
            anInt859 = 0;
        }
        if(!aBoolean821)
            return;
        byte byte0 = 22;
        byte byte1 = 36;
        aClass3_Sub1_665.method214(byte0, byte1, 468, 12, 0xc90b1d);
        int i1 = 0x989898;
        aClass3_Sub1_665.method212(byte0, byte1 + 12, 468, 18, i1, 160);
        aClass3_Sub1_665.method212(byte0, byte1 + 30, 8, 248, i1, 160);
        aClass3_Sub1_665.method212(byte0 + 205, byte1 + 30, 11, 248, i1, 160);
        aClass3_Sub1_665.method212(byte0 + 462, byte1 + 30, 6, 248, i1, 160);
        aClass3_Sub1_665.method212(byte0 + 8, byte1 + 99, 197, 24, i1, 160);
        aClass3_Sub1_665.method212(byte0 + 8, byte1 + 192, 197, 23, i1, 160);
        aClass3_Sub1_665.method212(byte0 + 8, byte1 + 258, 197, 20, i1, 160);
        aClass3_Sub1_665.method212(byte0 + 216, byte1 + 235, 246, 43, i1, 160);
        int k1 = 0xd0d0d0;
        aClass3_Sub1_665.method212(byte0 + 8, byte1 + 30, 197, 69, k1, 160);
        aClass3_Sub1_665.method212(byte0 + 8, byte1 + 123, 197, 69, k1, 160);
        aClass3_Sub1_665.method212(byte0 + 8, byte1 + 215, 197, 43, k1, 160);
        aClass3_Sub1_665.method212(byte0 + 216, byte1 + 30, 246, 205, k1, 160);
        for(int j2 = 0; j2 < 3; j2++)
            aClass3_Sub1_665.method216(byte0 + 8, byte1 + 30 + j2 * 34, 197, 0);

        for(int j3 = 0; j3 < 3; j3++)
            aClass3_Sub1_665.method216(byte0 + 8, byte1 + 123 + j3 * 34, 197, 0);

        for(int l3 = 0; l3 < 7; l3++)
            aClass3_Sub1_665.method216(byte0 + 216, byte1 + 30 + l3 * 34, 246, 0);

        for(int k4 = 0; k4 < 6; k4++)
        {
            if(k4 < 5)
                aClass3_Sub1_665.method217(byte0 + 8 + k4 * 49, byte1 + 30, 69, 0);
            if(k4 < 5)
                aClass3_Sub1_665.method217(byte0 + 8 + k4 * 49, byte1 + 123, 69, 0);
            aClass3_Sub1_665.method217(byte0 + 216 + k4 * 49, byte1 + 30, 205, 0);
        }

        aClass3_Sub1_665.method216(byte0 + 8, byte1 + 215, 197, 0);
        aClass3_Sub1_665.method216(byte0 + 8, byte1 + 257, 197, 0);
        aClass3_Sub1_665.method217(byte0 + 8, byte1 + 215, 43, 0);
        aClass3_Sub1_665.method217(byte0 + 204, byte1 + 215, 43, 0);
        aClass3_Sub1_665.method254("Preparing to duel with: " + aString822, byte0 + 1, byte1 + 10, 1, 0xffffff);
        aClass3_Sub1_665.method254("Your Stake", byte0 + 9, byte1 + 27, 4, 0xffffff);
        aClass3_Sub1_665.method254("Opponent's Stake", byte0 + 9, byte1 + 120, 4, 0xffffff);
        aClass3_Sub1_665.method254("Duel Options", byte0 + 9, byte1 + 212, 4, 0xffffff);
        aClass3_Sub1_665.method254("Your Inventory", byte0 + 216, byte1 + 27, 4, 0xffffff);
        aClass3_Sub1_665.method254("No retreating", byte0 + 8 + 1, byte1 + 215 + 16, 3, 0xffff00);
        aClass3_Sub1_665.method254("No magic", byte0 + 8 + 1, byte1 + 215 + 35, 3, 0xffff00);
        aClass3_Sub1_665.method254("No prayer", byte0 + 8 + 102, byte1 + 215 + 16, 3, 0xffff00);
        aClass3_Sub1_665.method254("No weapons", byte0 + 8 + 102, byte1 + 215 + 35, 3, 0xffff00);
        aClass3_Sub1_665.method215(byte0 + 93, byte1 + 215 + 6, 11, 11, 0xffff00);
        if(aBoolean831)
            aClass3_Sub1_665.method214(byte0 + 95, byte1 + 215 + 8, 7, 7, 0xffff00);
        aClass3_Sub1_665.method215(byte0 + 93, byte1 + 215 + 25, 11, 11, 0xffff00);
        if(aBoolean832)
            aClass3_Sub1_665.method214(byte0 + 95, byte1 + 215 + 27, 7, 7, 0xffff00);
        aClass3_Sub1_665.method215(byte0 + 191, byte1 + 215 + 6, 11, 11, 0xffff00);
        if(aBoolean833)
            aClass3_Sub1_665.method214(byte0 + 193, byte1 + 215 + 8, 7, 7, 0xffff00);
        aClass3_Sub1_665.method215(byte0 + 191, byte1 + 215 + 25, 11, 11, 0xffff00);
        if(aBoolean834)
            aClass3_Sub1_665.method214(byte0 + 193, byte1 + 215 + 27, 7, 7, 0xffff00);
        if(!aBoolean830)
            aClass3_Sub1_665.method229(byte0 + 217, byte1 + 238, anInt671 + 25);
        aClass3_Sub1_665.method229(byte0 + 394, byte1 + 238, anInt671 + 26);
        if(aBoolean829)
        {
            aClass3_Sub1_665.method252("Other player", byte0 + 341, byte1 + 246, 1, 0xffffff);
            aClass3_Sub1_665.method252("has accepted", byte0 + 341, byte1 + 256, 1, 0xffffff);
        }
        if(aBoolean830)
        {
            aClass3_Sub1_665.method252("Waiting for", byte0 + 217 + 35, byte1 + 246, 1, 0xffffff);
            aClass3_Sub1_665.method252("other player", byte0 + 217 + 35, byte1 + 256, 1, 0xffffff);
        }
        for(int l4 = 0; l4 < anInt753; l4++)
        {
            int i5 = 217 + byte0 + (l4 % 5) * 49;
            int k5 = 31 + byte1 + (l4 / 5) * 34;
            aClass3_Sub1_665.method245(i5, k5, 48, 32, anInt673 + Class14.anIntArray433[anIntArray754[l4]], Class14.anIntArray438[anIntArray754[l4]], 0, 0, false);
            if(Class14.anIntArray435[anIntArray754[l4]] == 0)
                aClass3_Sub1_665.method254(String.valueOf(anIntArray755[l4]), i5 + 1, k5 + 10, 1, 0xffff00);
        }

        for(int j5 = 0; j5 < anInt823; j5++)
        {
            int l5 = 9 + byte0 + (j5 % 4) * 49;
            int j6 = 31 + byte1 + (j5 / 4) * 34;
            aClass3_Sub1_665.method245(l5, j6, 48, 32, anInt673 + Class14.anIntArray433[anIntArray824[j5]], Class14.anIntArray438[anIntArray824[j5]], 0, 0, false);
            if(Class14.anIntArray435[anIntArray824[j5]] == 0)
                aClass3_Sub1_665.method254(String.valueOf(anIntArray825[j5]), l5 + 1, j6 + 10, 1, 0xffff00);
            if(super.anInt33 > l5 && super.anInt33 < l5 + 48 && super.anInt34 > j6 && super.anInt34 < j6 + 32)
                aClass3_Sub1_665.method254(Class14.aStringArray430[anIntArray824[j5]] + ": @whi@" + Class14.aStringArray431[anIntArray824[j5]], byte0 + 8, byte1 + 273, 1, 0xffff00);
        }

        for(int i6 = 0; i6 < anInt826; i6++)
        {
            int k6 = 9 + byte0 + (i6 % 4) * 49;
            int l6 = 124 + byte1 + (i6 / 4) * 34;
            aClass3_Sub1_665.method245(k6, l6, 48, 32, anInt673 + Class14.anIntArray433[anIntArray827[i6]], Class14.anIntArray438[anIntArray827[i6]], 0, 0, false);
            if(Class14.anIntArray435[anIntArray827[i6]] == 0)
                aClass3_Sub1_665.method254(String.valueOf(anIntArray828[i6]), k6 + 1, l6 + 10, 1, 0xffff00);
            if(super.anInt33 > k6 && super.anInt33 < k6 + 48 && super.anInt34 > l6 && super.anInt34 < l6 + 32)
                aClass3_Sub1_665.method254(Class14.aStringArray430[anIntArray827[i6]] + ": @whi@" + Class14.aStringArray431[anIntArray827[i6]], byte0 + 8, byte1 + 273, 1, 0xffff00);
        }

    }

    public void method118()
    {
        if(anInt751 == 0 && super.anInt33 >= ((Class3) (aClass3_Sub1_665)).anInt184 - 35 && super.anInt34 >= 3 && super.anInt33 < ((Class3) (aClass3_Sub1_665)).anInt184 - 3 && super.anInt34 < 35)
            anInt751 = 1;
        if(anInt751 == 0 && super.anInt33 >= ((Class3) (aClass3_Sub1_665)).anInt184 - 35 - 33 && super.anInt34 >= 3 && super.anInt33 < ((Class3) (aClass3_Sub1_665)).anInt184 - 3 - 33 && super.anInt34 < 35)
        {
            anInt751 = 2;
            anInt771 = (int)(Math.random() * 13D) - 6;
            anInt772 = (int)(Math.random() * 23D) - 11;
        }
        if(anInt751 == 0 && super.anInt33 >= ((Class3) (aClass3_Sub1_665)).anInt184 - 35 - 66 && super.anInt34 >= 3 && super.anInt33 < ((Class3) (aClass3_Sub1_665)).anInt184 - 3 - 66 && super.anInt34 < 35)
            anInt751 = 3;
        if(anInt751 == 0 && super.anInt33 >= ((Class3) (aClass3_Sub1_665)).anInt184 - 35 - 99 && super.anInt34 >= 3 && super.anInt33 < ((Class3) (aClass3_Sub1_665)).anInt184 - 3 - 99 && super.anInt34 < 35)
            anInt751 = 4;
        if(anInt751 == 0 && super.anInt33 >= ((Class3) (aClass3_Sub1_665)).anInt184 - 35 - 132 && super.anInt34 >= 3 && super.anInt33 < ((Class3) (aClass3_Sub1_665)).anInt184 - 3 - 132 && super.anInt34 < 35)
            anInt751 = 5;
        if(anInt751 == 0 && super.anInt33 >= ((Class3) (aClass3_Sub1_665)).anInt184 - 35 - 165 && super.anInt34 >= 3 && super.anInt33 < ((Class3) (aClass3_Sub1_665)).anInt184 - 3 - 165 && super.anInt34 < 35)
            anInt751 = 6;
        if(anInt751 != 0 && super.anInt33 >= ((Class3) (aClass3_Sub1_665)).anInt184 - 35 && super.anInt34 >= 3 && super.anInt33 < ((Class3) (aClass3_Sub1_665)).anInt184 - 3 && super.anInt34 < 26)
            anInt751 = 1;
        if(anInt751 != 0 && anInt751 != 2 && super.anInt33 >= ((Class3) (aClass3_Sub1_665)).anInt184 - 35 - 33 && super.anInt34 >= 3 && super.anInt33 < ((Class3) (aClass3_Sub1_665)).anInt184 - 3 - 33 && super.anInt34 < 26)
        {
            anInt751 = 2;
            anInt771 = (int)(Math.random() * 13D) - 6;
            anInt772 = (int)(Math.random() * 23D) - 11;
        }
        if(anInt751 != 0 && super.anInt33 >= ((Class3) (aClass3_Sub1_665)).anInt184 - 35 - 66 && super.anInt34 >= 3 && super.anInt33 < ((Class3) (aClass3_Sub1_665)).anInt184 - 3 - 66 && super.anInt34 < 26)
            anInt751 = 3;
        if(anInt751 != 0 && super.anInt33 >= ((Class3) (aClass3_Sub1_665)).anInt184 - 35 - 99 && super.anInt34 >= 3 && super.anInt33 < ((Class3) (aClass3_Sub1_665)).anInt184 - 3 - 99 && super.anInt34 < 26)
            anInt751 = 4;
        if(anInt751 != 0 && super.anInt33 >= ((Class3) (aClass3_Sub1_665)).anInt184 - 35 - 132 && super.anInt34 >= 3 && super.anInt33 < ((Class3) (aClass3_Sub1_665)).anInt184 - 3 - 132 && super.anInt34 < 26)
            anInt751 = 5;
        if(anInt751 != 0 && super.anInt33 >= ((Class3) (aClass3_Sub1_665)).anInt184 - 35 - 165 && super.anInt34 >= 3 && super.anInt33 < ((Class3) (aClass3_Sub1_665)).anInt184 - 3 - 165 && super.anInt34 < 26)
            anInt751 = 6;
        if(anInt751 == 1 && (super.anInt33 < ((Class3) (aClass3_Sub1_665)).anInt184 - 248 || super.anInt34 > 36 + (anInt752 / 5) * 34))
            anInt751 = 0;
        if(anInt751 == 3 && (super.anInt33 < ((Class3) (aClass3_Sub1_665)).anInt184 - 199 || super.anInt34 > 316))
            anInt751 = 0;
        if((anInt751 == 2 || anInt751 == 4 || anInt751 == 5) && (super.anInt33 < ((Class3) (aClass3_Sub1_665)).anInt184 - 199 || super.anInt34 > 240))
            anInt751 = 0;
        if(anInt751 == 6 && (super.anInt33 < ((Class3) (aClass3_Sub1_665)).anInt184 - 199 || super.anInt34 > 311))
            anInt751 = 0;
    }

    public void method119(boolean flag)
    {
        int i = ((Class3) (aClass3_Sub1_665)).anInt184 - 248;
        aClass3_Sub1_665.method229(i, 3, anInt671 + 1);
        for(int j = 0; j < anInt752; j++)
        {
            int k = i + (j % 5) * 49;
            int i1 = 36 + (j / 5) * 34;
            if(j < anInt753 && anIntArray756[j] == 1)
                aClass3_Sub1_665.method212(k, i1, 49, 34, 0xff0000, 128);
            else
                aClass3_Sub1_665.method212(k, i1, 49, 34, Class3.method221(181, 181, 181), 128);
            if(j < anInt753)
            {
                aClass3_Sub1_665.method245(k, i1, 48, 32, anInt673 + Class14.anIntArray433[anIntArray754[j]], Class14.anIntArray438[anIntArray754[j]], 0, 0, false);
                if(Class14.anIntArray435[anIntArray754[j]] == 0)
                    aClass3_Sub1_665.method254(String.valueOf(anIntArray755[j]), k + 1, i1 + 10, 1, 0xffff00);
            }
        }

        for(int l = 1; l <= 4; l++)
            aClass3_Sub1_665.method217(i + l * 49, 36, (anInt752 / 5) * 34, 0);

        for(int j1 = 1; j1 <= anInt752 / 5 - 1; j1++)
            aClass3_Sub1_665.method216(i, 36 + j1 * 34, 245, 0);

        if(!flag)
            return;
        i = super.anInt33 - (((Class3) (aClass3_Sub1_665)).anInt184 - 248);
        int k1 = super.anInt34 - 36;
        if(i >= 0 && k1 >= 0 && i < 248 && k1 < (anInt752 / 5) * 34)
        {
            int l1 = i / 49 + (k1 / 34) * 5;
            if(l1 < anInt753)
            {
                int i2 = anIntArray754[l1];
                if(anInt776 >= 0)
                {
                    if(Class14.anIntArray503[anInt776] == 3)
                    {
                        aStringArray800[anInt797] = "Cast " + Class14.aStringArray499[anInt776] + " on";
                        aStringArray799[anInt797] = "@lre@" + Class14.aStringArray430[i2];
                        anIntArray801[anInt797] = 600;
                        anIntArray804[anInt797] = l1;
                        anIntArray805[anInt797] = anInt776;
                        anInt797++;
                        return;
                    }
                } else
                {
                    if(anInt757 >= 0)
                    {
                        aStringArray800[anInt797] = "Use " + aString758 + " with";
                        aStringArray799[anInt797] = "@lre@" + Class14.aStringArray430[i2];
                        anIntArray801[anInt797] = 610;
                        anIntArray804[anInt797] = l1;
                        anIntArray805[anInt797] = anInt757;
                        anInt797++;
                        return;
                    }
                    if(anIntArray756[l1] == 1)
                    {
                        aStringArray800[anInt797] = "Remove";
                        aStringArray799[anInt797] = "@lre@" + Class14.aStringArray430[i2];
                        anIntArray801[anInt797] = 620;
                        anIntArray804[anInt797] = l1;
                        anInt797++;
                    } else
                    if(Class14.anIntArray437[i2] != 0)
                    {
                        if((Class14.anIntArray437[i2] & 0x18) != 0)
                            aStringArray800[anInt797] = "Wield";
                        else
                            aStringArray800[anInt797] = "Wear";
                        aStringArray799[anInt797] = "@lre@" + Class14.aStringArray430[i2];
                        anIntArray801[anInt797] = 630;
                        anIntArray804[anInt797] = l1;
                        anInt797++;
                    }
                    if(!Class14.aStringArray432[i2].equals(""))
                    {
                        aStringArray800[anInt797] = Class14.aStringArray432[i2];
                        aStringArray799[anInt797] = "@lre@" + Class14.aStringArray430[i2];
                        anIntArray801[anInt797] = 640;
                        anIntArray804[anInt797] = l1;
                        anInt797++;
                    }
                    aStringArray800[anInt797] = "Use";
                    aStringArray799[anInt797] = "@lre@" + Class14.aStringArray430[i2];
                    anIntArray801[anInt797] = 650;
                    anIntArray804[anInt797] = l1;
                    anInt797++;
                    aStringArray800[anInt797] = "Drop";
                    aStringArray799[anInt797] = "@lre@" + Class14.aStringArray430[i2];
                    anIntArray801[anInt797] = 660;
                    anIntArray804[anInt797] = l1;
                    anInt797++;
                    aStringArray800[anInt797] = "Examine";
                    aStringArray799[anInt797] = "@lre@" + Class14.aStringArray430[i2];
                    anIntArray801[anInt797] = 3600;
                    anIntArray804[anInt797] = i2;
                    anInt797++;
                }
            }
        }
    }

    public void method120(boolean flag)
    {
        int i = ((Class3) (aClass3_Sub1_665)).anInt184 - 199;
        char c = '\234';
        char c2 = '\230';
        aClass3_Sub1_665.method229(i - 49, 3, anInt671 + 2);
        i += 40;
        aClass3_Sub1_665.method214(i, 36, c, c2, 0);
        aClass3_Sub1_665.method207(i, 36, i + c, 36 + c2);
        int k = 192 + anInt772;
        int i1 = anInt707 + anInt771 & 0xff;
        int k1 = ((aClass15_716.anInt524 - 6040) * 3 * k) / 2048;
        int i3 = ((aClass15_716.anInt525 - 6040) * 3 * k) / 2048;
        int k4 = Class6.anIntArray252[1024 - i1 * 4 & 0x3ff];
        int i5 = Class6.anIntArray252[(1024 - i1 * 4 & 0x3ff) + 1024];
        int k5 = i3 * k4 + k1 * i5 >> 18;
        i3 = i3 * i5 - k1 * k4 >> 18;
        k1 = k5;
        aClass3_Sub1_665.method241((i + c / 2) - k1, 36 + c2 / 2 + i3, anInt671 - 1, i1 + 64 & 0xff, k);
        for(int i7 = 0; i7 < anInt735; i7++)
        {
            int l1 = (((anIntArray737[i7] * anInt666 + 64) - aClass15_716.anInt524) * 3 * k) / 2048;
            int j3 = (((anIntArray738[i7] * anInt666 + 64) - aClass15_716.anInt525) * 3 * k) / 2048;
            int l5 = j3 * k4 + l1 * i5 >> 18;
            j3 = j3 * i5 - l1 * k4 >> 18;
            l1 = l5;
            method94(i + c / 2 + l1, (36 + c2 / 2) - j3, 65535);
        }

        for(int j7 = 0; j7 < anInt729; j7++)
        {
            int i2 = (((anIntArray730[j7] * anInt666 + 64) - aClass15_716.anInt524) * 3 * k) / 2048;
            int k3 = (((anIntArray731[j7] * anInt666 + 64) - aClass15_716.anInt525) * 3 * k) / 2048;
            int i6 = k3 * k4 + i2 * i5 >> 18;
            k3 = k3 * i5 - i2 * k4 >> 18;
            i2 = i6;
            method94(i + c / 2 + i2, (36 + c2 / 2) - k3, 0xff0000);
        }

        for(int k7 = 0; k7 < anInt722; k7++)
        {
            Class15 class15 = aClass15Array725[k7];
            int j2 = ((class15.anInt524 - aClass15_716.anInt524) * 3 * k) / 2048;
            int l3 = ((class15.anInt525 - aClass15_716.anInt525) * 3 * k) / 2048;
            int j6 = l3 * k4 + j2 * i5 >> 18;
            l3 = l3 * i5 - j2 * k4 >> 18;
            j2 = j6;
            method94(i + c / 2 + j2, (36 + c2 / 2) - l3, 0xffff00);
        }

        for(int l7 = 0; l7 < anInt710; l7++)
        {
            Class15 class15_1 = aClass15Array714[l7];
            int k2 = ((class15_1.anInt524 - aClass15_716.anInt524) * 3 * k) / 2048;
            int i4 = ((class15_1.anInt525 - aClass15_716.anInt525) * 3 * k) / 2048;
            int k6 = i4 * k4 + k2 * i5 >> 18;
            i4 = i4 * i5 - k2 * k4 >> 18;
            k2 = k6;
            int j8 = 0xffffff;
            for(int k8 = 0; k8 < super.anInt618; k8++)
            {
                if(class15_1.aLong520 != super.aLongArray619[k8] || super.anIntArray620[k8] != 99)
                    continue;
                j8 = 65280;
                break;
            }

            method94(i + c / 2 + k2, (36 + c2 / 2) - i4, j8);
        }

        aClass3_Sub1_665.method211(i + c / 2, 36 + c2 / 2, 2, 0xffffff, 255);
        aClass3_Sub1_665.method241(i + 19, 55, anInt671 + 24, anInt707 + 128 & 0xff, 128);
        aClass3_Sub1_665.method207(0, 0, anInt668, anInt669 + 12);
        if(!flag)
            return;
        i = super.anInt33 - (((Class3) (aClass3_Sub1_665)).anInt184 - 199);
        int i8 = super.anInt34 - 36;
        if(i >= 40 && i8 >= 0 && i < 196 && i8 < 152)
        {
            char c1 = '\234';
            char c3 = '\230';
            int l = 192 + anInt772;
            int j1 = anInt707 + anInt771 & 0xff;
            int j = ((Class3) (aClass3_Sub1_665)).anInt184 - 199;
            j += 40;
            int l2 = ((super.anInt33 - (j + c1 / 2)) * 16384) / (3 * l);
            int j4 = ((super.anInt34 - (36 + c3 / 2)) * 16384) / (3 * l);
            int l4 = Class6.anIntArray252[1024 - j1 * 4 & 0x3ff];
            int j5 = Class6.anIntArray252[(1024 - j1 * 4 & 0x3ff) + 1024];
            int l6 = j4 * l4 + l2 * j5 >> 15;
            j4 = j4 * j5 - l2 * l4 >> 15;
            l2 = l6;
            l2 += aClass15_716.anInt524;
            j4 = aClass15_716.anInt525 - j4;
            if(anInt650 == 1)
                method95(anInt717, anInt718, l2 / 128, j4 / 128, false);
            anInt650 = 0;
        }
    }

    public void method121(boolean flag)
    {
        int i = ((Class3) (aClass3_Sub1_665)).anInt184 - 199;
        int j = 36;
        aClass3_Sub1_665.method229(i - 49, 3, anInt671 + 3);
        char c = '\304';
        char c1 = '\u0113';
        int l;
        int k = l = Class3.method221(160, 160, 160);
        if(anInt783 == 0)
            k = Class3.method221(220, 220, 220);
        else
            l = Class3.method221(220, 220, 220);
        aClass3_Sub1_665.method212(i, j, c / 2, 24, k, 128);
        aClass3_Sub1_665.method212(i + c / 2, j, c / 2, 24, l, 128);
        aClass3_Sub1_665.method212(i, j + 24, c, c1 - 24, Class3.method221(220, 220, 220), 128);
        aClass3_Sub1_665.method216(i, j + 24, c, 0);
        aClass3_Sub1_665.method217(i + c / 2, j, 24, 0);
        aClass3_Sub1_665.method252("Stats", i + c / 4, j + 16, 4, 0);
        aClass3_Sub1_665.method252("Quests", i + c / 4 + c / 2, j + 16, 4, 0);
        if(anInt783 == 0)
        {
            int i1 = 72;
            int k1 = -1;
            aClass3_Sub1_665.method254("Skills", i + 5, i1, 3, 0xffff00);
            i1 += 13;
            for(int l1 = 0; l1 < 9; l1++)
            {
                int i2 = 0xffffff;
                if(super.anInt33 > i + 3 && super.anInt34 >= i1 - 11 && super.anInt34 < i1 + 2 && super.anInt33 < i + 90)
                {
                    i2 = 0xff0000;
                    k1 = l1;
                }
                aClass3_Sub1_665.method254(aStringArray768[l1] + ":@yel@" + anIntArray761[l1] + "/" + anIntArray762[l1], i + 5, i1, 1, i2);
                i2 = 0xffffff;
                if(super.anInt33 >= i + 90 && super.anInt34 >= i1 - 13 - 11 && super.anInt34 < (i1 - 13) + 2 && super.anInt33 < i + 196)
                {
                    i2 = 0xff0000;
                    k1 = l1 + 9;
                }
                aClass3_Sub1_665.method254(aStringArray768[l1 + 9] + ":@yel@" + anIntArray761[l1 + 9] + "/" + anIntArray762[l1 + 9], (i + c / 2) - 5, i1 - 13, 1, i2);
                i1 += 13;
            }

            aClass3_Sub1_665.method254("Quest Points:@yel@" + anInt765, (i + c / 2) - 5, i1 - 13, 1, 0xffffff);
            i1 += 12;
            aClass3_Sub1_665.method254("Fatigue: @yel@" + (anInt766 * 100) / 750 + "%", i + 5, i1 - 13, 1, 0xffffff);
            i1 += 8;
            aClass3_Sub1_665.method254("Equipment Status", i + 5, i1, 3, 0xffff00);
            i1 += 12;
            for(int j2 = 0; j2 < 3; j2++)
            {
                aClass3_Sub1_665.method254(aStringArray770[j2] + ":@yel@" + anIntArray764[j2], i + 5, i1, 1, 0xffffff);
                if(j2 < 2)
                    aClass3_Sub1_665.method254(aStringArray770[j2 + 3] + ":@yel@" + anIntArray764[j2 + 3], i + c / 2 + 25, i1, 1, 0xffffff);
                i1 += 13;
            }

            i1 += 6;
            aClass3_Sub1_665.method216(i, i1 - 15, c, 0);
            if(k1 != -1)
            {
                aClass3_Sub1_665.method254(aStringArray769[k1] + " skill", i + 5, i1, 1, 0xffff00);
                i1 += 12;
                int k2 = anIntArray759[0];
                for(int i3 = 0; i3 < 98; i3++)
                    if(anIntArray763[k1] >= anIntArray759[i3])
                        k2 = anIntArray759[i3 + 1];

                aClass3_Sub1_665.method254("Total xp: " + anIntArray763[k1] / 4, i + 5, i1, 1, 0xffffff);
                i1 += 12;
                aClass3_Sub1_665.method254("Next level at: " + k2 / 4, i + 5, i1, 1, 0xffffff);
            } else
            {
                aClass3_Sub1_665.method254("Overall levels", i + 5, i1, 1, 0xffff00);
                i1 += 12;
                int l2 = 0;
                for(int j3 = 0; j3 < 18; j3++)
                    l2 += anIntArray762[j3];

                aClass3_Sub1_665.method254("Skill total: " + l2, i + 5, i1, 1, 0xffffff);
                i1 += 12;
                aClass3_Sub1_665.method254("Combat level: " + aClass15_716.anInt543, i + 5, i1, 1, 0xffffff);
                i1 += 12;
            }
        }
        if(anInt783 == 1)
        {
            aClass1_781.method161(anInt782);
            aClass1_781.method163(anInt782, 0, "@whi@Quest-list (green=completed)");
            for(int j1 = 0; j1 < anInt784; j1++)
                aClass1_781.method163(anInt782, j1 + 1, (aBooleanArray786[j1] ? "@gre@" : "@red@") + aStringArray785[j1]);

            aClass1_781.method136();
        }
        if(!flag)
            return;
        i = super.anInt33 - (((Class3) (aClass3_Sub1_665)).anInt184 - 199);
        j = super.anInt34 - 36;
        if(i >= 0 && j >= 0 && i < c && j < c1)
        {
            if(anInt783 == 1)
                aClass1_781.method133(i + (((Class3) (aClass3_Sub1_665)).anInt184 - 199), j + 36, super.anInt36, super.anInt35);
            if(j <= 24 && anInt650 == 1)
            {
                if(i < 98)
                {
                    anInt783 = 0;
                    return;
                }
                if(i > 98)
                    anInt783 = 1;
            }
        }
    }

    public void method122(boolean flag)
    {
        int i = ((Class3) (aClass3_Sub1_665)).anInt184 - 199;
        int j = 36;
        aClass3_Sub1_665.method229(i - 49, 3, anInt671 + 4);
        char c = '\304';
        char c1 = '\266';
        int l;
        int k = l = Class3.method221(160, 160, 160);
        if(anInt775 == 0)
            k = Class3.method221(220, 220, 220);
        else
            l = Class3.method221(220, 220, 220);
        aClass3_Sub1_665.method212(i, j, c / 2, 24, k, 128);
        aClass3_Sub1_665.method212(i + c / 2, j, c / 2, 24, l, 128);
        aClass3_Sub1_665.method212(i, j + 24, c, 90, Class3.method221(220, 220, 220), 128);
        aClass3_Sub1_665.method212(i, j + 24 + 90, c, c1 - 90 - 24, Class3.method221(160, 160, 160), 128);
        aClass3_Sub1_665.method216(i, j + 24, c, 0);
        aClass3_Sub1_665.method217(i + c / 2, j, 24, 0);
        aClass3_Sub1_665.method216(i, j + 113, c, 0);
        aClass3_Sub1_665.method252("Magic", i + c / 4, j + 16, 4, 0);
        aClass3_Sub1_665.method252("Prayers", i + c / 4 + c / 2, j + 16, 4, 0);
        if(anInt775 == 0)
        {
            aClass1_773.method161(anInt774);
            int i1 = 0;
            for(int i2 = 0; i2 < Class14.anInt498; i2++)
            {
                String s = "@yel@";
                for(int l3 = 0; l3 < Class14.anIntArray502[i2]; l3++)
                {
                    int k4 = Class14.anIntArrayArray504[i2][l3];
                    if(method92(k4, Class14.anIntArrayArray505[i2][l3]))
                        continue;
                    s = "@whi@";
                    break;
                }

                int l4 = anIntArray761[6];
                if(Class14.anIntArray501[i2] > l4)
                    s = "@bla@";
                aClass1_773.method163(anInt774, i1++, s + "Level " + Class14.anIntArray501[i2] + ": " + Class14.aStringArray499[i2]);
            }

            aClass1_773.method136();
            int i3 = aClass1_773.method171(anInt774);
            if(i3 != -1)
            {
                aClass3_Sub1_665.method254("Level " + Class14.anIntArray501[i3] + ": " + Class14.aStringArray499[i3], i + 2, j + 124, 1, 0xffff00);
                aClass3_Sub1_665.method254(Class14.aStringArray500[i3], i + 2, j + 136, 0, 0xffffff);
                for(int i4 = 0; i4 < Class14.anIntArray502[i3]; i4++)
                {
                    int i5 = Class14.anIntArrayArray504[i3][i4];
                    aClass3_Sub1_665.method229(i + 2 + i4 * 44, j + 150, anInt673 + Class14.anIntArray433[i5]);
                    int j5 = method91(i5);
                    int k5 = Class14.anIntArrayArray505[i3][i4];
                    String s2 = "@red@";
                    if(method92(i5, k5))
                        s2 = "@gre@";
                    aClass3_Sub1_665.method254(s2 + j5 + "/" + k5, i + 2 + i4 * 44, j + 150, 1, 0xffffff);
                }

            } else
            {
                aClass3_Sub1_665.method254("Point at a spell for a description", i + 2, j + 124, 1, 0);
            }
        }
        if(anInt775 == 1)
        {
            aClass1_773.method161(anInt774);
            int j1 = 0;
            for(int j2 = 0; j2 < Class14.anInt506; j2++)
            {
                String s1 = "@whi@";
                if(Class14.anIntArray509[j2] > anIntArray762[5])
                    s1 = "@bla@";
                if(aBooleanArray787[j2])
                    s1 = "@gre@";
                aClass1_773.method163(anInt774, j1++, s1 + "Level " + Class14.anIntArray509[j2] + ": " + Class14.aStringArray507[j2]);
            }

            aClass1_773.method136();
            int j3 = aClass1_773.method171(anInt774);
            if(j3 != -1)
            {
                aClass3_Sub1_665.method252("Level " + Class14.anIntArray509[j3] + ": " + Class14.aStringArray507[j3], i + c / 2, j + 130, 1, 0xffff00);
                aClass3_Sub1_665.method252(Class14.aStringArray508[j3], i + c / 2, j + 145, 0, 0xffffff);
                aClass3_Sub1_665.method252("Drain rate: " + Class14.anIntArray510[j3], i + c / 2, j + 160, 1, 0);
            } else
            {
                aClass3_Sub1_665.method254("Point at a prayer for a description", i + 2, j + 124, 1, 0);
            }
        }
        if(!flag)
            return;
        i = super.anInt33 - (((Class3) (aClass3_Sub1_665)).anInt184 - 199);
        j = super.anInt34 - 36;
        if(i >= 0 && j >= 0 && i < 196 && j < 182)
        {
            aClass1_773.method133(i + (((Class3) (aClass3_Sub1_665)).anInt184 - 199), j + 36, super.anInt36, super.anInt35);
            if(j <= 24 && anInt650 == 1)
                if(i < 98 && anInt775 == 1)
                {
                    anInt775 = 0;
                    aClass1_773.method162(anInt774);
                } else
                if(i > 98 && anInt775 == 0)
                {
                    anInt775 = 1;
                    aClass1_773.method162(anInt774);
                }
            if(anInt650 == 1 && anInt775 == 0)
            {
                int k1 = aClass1_773.method171(anInt774);
                if(k1 != -1)
                {
                    int k2 = anIntArray761[6];
                    if(Class14.anIntArray501[k1] > k2)
                    {
                        method77("Your magic ability is not high enough for this spell", 3);
                    } else
                    {
                        int k3;
                        for(k3 = 0; k3 < Class14.anIntArray502[k1]; k3++)
                        {
                            int j4 = Class14.anIntArrayArray504[k1][k3];
                            if(method92(j4, Class14.anIntArrayArray505[k1][k3]))
                                continue;
                            method77("You don't have all the reagents you need for this spell", 3);
                            k3 = -1;
                            break;
                        }

                        if(k3 == Class14.anIntArray502[k1])
                        {
                            anInt776 = k1;
                            anInt757 = -1;
                        }
                    }
                }
            }
            if(anInt650 == 1 && anInt775 == 1)
            {
                int l1 = aClass1_773.method171(anInt774);
                if(l1 != -1)
                {
                    int l2 = anIntArray762[5];
                    if(Class14.anIntArray509[l1] > l2)
                        method77("Your prayer ability is not high enough for this prayer", 3);
                    else
                    if(anIntArray761[5] == 0)
                        method77("You have run out of prayer points. Return to a church to recharge", 3);
                    else
                    if(aBooleanArray787[l1])
                    {
                        super.aClass10_Sub1_614.method334(211, 457);
                        super.aClass10_Sub1_614.method327(l1);
                        super.aClass10_Sub1_614.method336();
                        aBooleanArray787[l1] = false;
                        method61("prayeroff");
                    } else
                    {
                        super.aClass10_Sub1_614.method334(212, 126);
                        super.aClass10_Sub1_614.method327(l1);
                        super.aClass10_Sub1_614.method336();
                        aBooleanArray787[l1] = true;
                        method61("prayeron");
                    }
                }
            }
            anInt650 = 0;
        }
    }

    public void method123(boolean flag)
    {
        int i = ((Class3) (aClass3_Sub1_665)).anInt184 - 199;
        int j = 36;
        aClass3_Sub1_665.method229(i - 49, 3, anInt671 + 5);
        char c = '\304';
        char c1 = '\266';
        int l;
        int k = l = Class3.method221(160, 160, 160);
        if(anInt779 == 0)
            k = Class3.method221(220, 220, 220);
        else
            l = Class3.method221(220, 220, 220);
        aClass3_Sub1_665.method212(i, j, c / 2, 24, k, 128);
        aClass3_Sub1_665.method212(i + c / 2, j, c / 2, 24, l, 128);
        aClass3_Sub1_665.method212(i, j + 24, c, c1 - 24, Class3.method221(220, 220, 220), 128);
        aClass3_Sub1_665.method216(i, j + 24, c, 0);
        aClass3_Sub1_665.method217(i + c / 2, j, 24, 0);
        aClass3_Sub1_665.method216(i, (j + c1) - 16, c, 0);
        aClass3_Sub1_665.method252("Friends", i + c / 4, j + 16, 4, 0);
        aClass3_Sub1_665.method252("Ignore", i + c / 4 + c / 2, j + 16, 4, 0);
        aClass1_777.method161(anInt778);
        if(anInt779 == 0)
        {
            for(int i1 = 0; i1 < super.anInt618; i1++)
            {
                String s;
                if(super.anIntArray620[i1] == 99)
                    s = "@gre@";
                else
                if(super.anIntArray620[i1] > 0)
                    s = "@yel@";
                else
                    s = "@red@";
                aClass1_777.method163(anInt778, i1, s + Class11.method354(super.aLongArray619[i1]) + "~439~@whi@Remove         WWWWWWWWWW");
            }

        }
        if(anInt779 == 1)
        {
            for(int j1 = 0; j1 < super.anInt621; j1++)
                aClass1_777.method163(anInt778, j1, "@yel@" + Class11.method354(super.aLongArray622[j1]) + "~439~@whi@Remove         WWWWWWWWWW");

        }
        aClass1_777.method136();
        if(anInt779 == 0)
        {
            int k1 = aClass1_777.method171(anInt778);
            if(k1 >= 0 && super.anInt33 < 489)
            {
                if(super.anInt33 > 429)
                    aClass3_Sub1_665.method252("Click to remove " + Class11.method354(super.aLongArray619[k1]), i + c / 2, j + 35, 1, 0xffffff);
                else
                if(super.anIntArray620[k1] == 99)
                    aClass3_Sub1_665.method252("Click to message " + Class11.method354(super.aLongArray619[k1]), i + c / 2, j + 35, 1, 0xffffff);
                else
                if(super.anIntArray620[k1] > 0)
                    aClass3_Sub1_665.method252(Class11.method354(super.aLongArray619[k1]) + " is on world " + super.anIntArray620[k1], i + c / 2, j + 35, 1, 0xffffff);
                else
                    aClass3_Sub1_665.method252(Class11.method354(super.aLongArray619[k1]) + " is offline", i + c / 2, j + 35, 1, 0xffffff);
            } else
            {
                aClass3_Sub1_665.method252("Click a name to send a message", i + c / 2, j + 35, 1, 0xffffff);
            }
            int k2;
            if(super.anInt33 > i && super.anInt33 < i + c && super.anInt34 > (j + c1) - 16 && super.anInt34 < j + c1)
                k2 = 0xffff00;
            else
                k2 = 0xffffff;
            aClass3_Sub1_665.method252("Click here to add a friend", i + c / 2, (j + c1) - 3, 1, k2);
        }
        if(anInt779 == 1)
        {
            int l1 = aClass1_777.method171(anInt778);
            if(l1 >= 0 && super.anInt33 < 489 && super.anInt33 > 429)
            {
                if(super.anInt33 > 429)
                    aClass3_Sub1_665.method252("Click to remove " + Class11.method354(super.aLongArray622[l1]), i + c / 2, j + 35, 1, 0xffffff);
            } else
            {
                aClass3_Sub1_665.method252("Blocking messages from:", i + c / 2, j + 35, 1, 0xffffff);
            }
            int l2;
            if(super.anInt33 > i && super.anInt33 < i + c && super.anInt34 > (j + c1) - 16 && super.anInt34 < j + c1)
                l2 = 0xffff00;
            else
                l2 = 0xffffff;
            aClass3_Sub1_665.method252("Click here to add a name", i + c / 2, (j + c1) - 3, 1, l2);
        }
        if(!flag)
            return;
        i = super.anInt33 - (((Class3) (aClass3_Sub1_665)).anInt184 - 199);
        j = super.anInt34 - 36;
        if(i >= 0 && j >= 0 && i < 196 && j < 182)
        {
            aClass1_777.method133(i + (((Class3) (aClass3_Sub1_665)).anInt184 - 199), j + 36, super.anInt36, super.anInt35);
            if(j <= 24 && anInt650 == 1)
                if(i < 98 && anInt779 == 1)
                {
                    anInt779 = 0;
                    aClass1_777.method162(anInt778);
                } else
                if(i > 98 && anInt779 == 0)
                {
                    anInt779 = 1;
                    aClass1_777.method162(anInt778);
                }
            if(anInt650 == 1 && anInt779 == 0)
            {
                int i2 = aClass1_777.method171(anInt778);
                if(i2 >= 0 && super.anInt33 < 489)
                    if(super.anInt33 > 429)
                        method36(super.aLongArray619[i2]);
                    else
                    if(super.anIntArray620[i2] != 0)
                    {
                        anInt892 = 2;
                        aLong780 = super.aLongArray619[i2];
                        super.aString42 = "";
                        super.aString43 = "";
                    }
            }
            if(anInt650 == 1 && anInt779 == 1)
            {
                int j2 = aClass1_777.method171(anInt778);
                if(j2 >= 0 && super.anInt33 < 489 && super.anInt33 > 429)
                    method34(super.aLongArray622[j2]);
            }
            if(j > 166 && anInt650 == 1 && anInt779 == 0)
            {
                anInt892 = 1;
                super.aString40 = "";
                super.aString41 = "";
            }
            if(j > 166 && anInt650 == 1 && anInt779 == 1)
            {
                anInt892 = 3;
                super.aString40 = "";
                super.aString41 = "";
            }
            anInt650 = 0;
        }
    }

    public void method124(boolean flag)
    {
        int i = ((Class3) (aClass3_Sub1_665)).anInt184 - 199;
        int j = 36;
        aClass3_Sub1_665.method229(i - 49, 3, anInt671 + 6);
        char c = '\304';
        aClass3_Sub1_665.method212(i, 36, c, 65, Class3.method221(181, 181, 181), 160);
        aClass3_Sub1_665.method212(i, 101, c, 65, Class3.method221(201, 201, 201), 160);
        aClass3_Sub1_665.method212(i, 166, c, 95, Class3.method221(181, 181, 181), 160);
        aClass3_Sub1_665.method212(i, 261, c, 40, Class3.method221(201, 201, 201), 160);
        int k = i + 3;
        int i1 = j + 15;
        aClass3_Sub1_665.method254("Game options - click to toggle", k, i1, 1, 0);
        i1 += 15;
        if(aBoolean789)
            aClass3_Sub1_665.method254("Camera angle mode - @gre@Auto", k, i1, 1, 0xffffff);
        else
            aClass3_Sub1_665.method254("Camera angle mode - @red@Manual", k, i1, 1, 0xffffff);
        i1 += 15;
        if(aBoolean790)
            aClass3_Sub1_665.method254("Mouse buttons - @red@One", k, i1, 1, 0xffffff);
        else
            aClass3_Sub1_665.method254("Mouse buttons - @gre@Two", k, i1, 1, 0xffffff);
        i1 += 15;
        if(aBoolean641)
            if(aBoolean791)
                aClass3_Sub1_665.method254("Sound effects - @red@off", k, i1, 1, 0xffffff);
            else
                aClass3_Sub1_665.method254("Sound effects - @gre@on", k, i1, 1, 0xffffff);
        i1 += 15;
        i1 += 5;
        aClass3_Sub1_665.method254("Security settings", k, i1, 1, 0);
        i1 += 15;
        int k1 = 0xffffff;
        if(super.anInt33 > k && super.anInt33 < k + c && super.anInt34 > i1 - 12 && super.anInt34 < i1 + 4)
            k1 = 0xffff00;
        aClass3_Sub1_665.method254("Change password", k, i1, 1, k1);
        i1 += 15;
        k1 = 0xffffff;
        if(super.anInt33 > k && super.anInt33 < k + c && super.anInt34 > i1 - 12 && super.anInt34 < i1 + 4)
            k1 = 0xffff00;
        aClass3_Sub1_665.method254("Change recovery questions", k, i1, 1, k1);
        i1 += 15;
        k1 = 0xffffff;
        if(super.anInt33 > k && super.anInt33 < k + c && super.anInt34 > i1 - 12 && super.anInt34 < i1 + 4)
            k1 = 0xffff00;
        aClass3_Sub1_665.method254("Change contact details", k, i1, 1, k1);
        i1 += 15;
        i1 += 5;
        aClass3_Sub1_665.method254("Privacy settings. Will be applied to", i + 3, i1, 1, 0);
        i1 += 15;
        aClass3_Sub1_665.method254("all people not on your friends list", i + 3, i1, 1, 0);
        i1 += 15;
        if(super.anInt623 == 0)
            aClass3_Sub1_665.method254("Block chat messages: @red@<off>", i + 3, i1, 1, 0xffffff);
        else
            aClass3_Sub1_665.method254("Block chat messages: @gre@<on>", i + 3, i1, 1, 0xffffff);
        i1 += 15;
        if(super.anInt624 == 0)
            aClass3_Sub1_665.method254("Block private messages: @red@<off>", i + 3, i1, 1, 0xffffff);
        else
            aClass3_Sub1_665.method254("Block private messages: @gre@<on>", i + 3, i1, 1, 0xffffff);
        i1 += 15;
        if(super.anInt625 == 0)
            aClass3_Sub1_665.method254("Block trade requests: @red@<off>", i + 3, i1, 1, 0xffffff);
        else
            aClass3_Sub1_665.method254("Block trade requests: @gre@<on>", i + 3, i1, 1, 0xffffff);
        i1 += 15;
        if(aBoolean641)
            if(super.anInt626 == 0)
                aClass3_Sub1_665.method254("Block duel requests: @red@<off>", i + 3, i1, 1, 0xffffff);
            else
                aClass3_Sub1_665.method254("Block duel requests: @gre@<on>", i + 3, i1, 1, 0xffffff);
        i1 += 15;
        i1 += 5;
        aClass3_Sub1_665.method254("Always logout when you finish", k, i1, 1, 0);
        i1 += 15;
        k1 = 0xffffff;
        if(super.anInt33 > k && super.anInt33 < k + c && super.anInt34 > i1 - 12 && super.anInt34 < i1 + 4)
            k1 = 0xffff00;
        aClass3_Sub1_665.method254("Click here to logout", i + 3, i1, 1, k1);
        if(!flag)
            return;
        i = super.anInt33 - (((Class3) (aClass3_Sub1_665)).anInt184 - 199);
        j = super.anInt34 - 36;
        if(i >= 0 && j >= 0 && i < 196 && j < 265)
        {
            int l1 = ((Class3) (aClass3_Sub1_665)).anInt184 - 199;
            byte byte0 = 36;
            char c1 = '\304';
            int l = l1 + 3;
            int j1 = byte0 + 30;
            if(super.anInt33 > l && super.anInt33 < l + c1 && super.anInt34 > j1 - 12 && super.anInt34 < j1 + 4 && anInt650 == 1)
            {
                aBoolean789 = !aBoolean789;
                super.aClass10_Sub1_614.method334(213, 892);
                super.aClass10_Sub1_614.method327(0);
                super.aClass10_Sub1_614.method327(aBoolean789 ? 1 : 0);
                super.aClass10_Sub1_614.method336();
            }
            j1 += 15;
            if(super.anInt33 > l && super.anInt33 < l + c1 && super.anInt34 > j1 - 12 && super.anInt34 < j1 + 4 && anInt650 == 1)
            {
                aBoolean790 = !aBoolean790;
                super.aClass10_Sub1_614.method334(213, 892);
                super.aClass10_Sub1_614.method327(2);
                super.aClass10_Sub1_614.method327(aBoolean790 ? 1 : 0);
                super.aClass10_Sub1_614.method336();
            }
            j1 += 15;
            if(aBoolean641 && super.anInt33 > l && super.anInt33 < l + c1 && super.anInt34 > j1 - 12 && super.anInt34 < j1 + 4 && anInt650 == 1)
            {
                aBoolean791 = !aBoolean791;
                super.aClass10_Sub1_614.method334(213, 892);
                super.aClass10_Sub1_614.method327(3);
                super.aClass10_Sub1_614.method327(aBoolean791 ? 1 : 0);
                super.aClass10_Sub1_614.method336();
            }
            j1 += 15;
            j1 += 20;
            if(super.anInt33 > l && super.anInt33 < l + c1 && super.anInt34 > j1 - 12 && super.anInt34 < j1 + 4 && anInt650 == 1)
            {
                anInt895 = 6;
                super.aString40 = "";
                super.aString41 = "";
            }
            j1 += 15;
            if(super.anInt33 > l && super.anInt33 < l + c1 && super.anInt34 > j1 - 12 && super.anInt34 < j1 + 4 && anInt650 == 1)
            {
                super.aClass10_Sub1_614.method334(197, 882);
                super.aClass10_Sub1_614.method336();
            }
            j1 += 15;
            if(super.anInt33 > l && super.anInt33 < l + c1 && super.anInt34 > j1 - 12 && super.anInt34 < j1 + 4 && anInt650 == 1)
            {
                super.aClass10_Sub1_614.method334(247, 888);
                super.aClass10_Sub1_614.method336();
            }
            j1 += 15;
            boolean flag1 = false;
            j1 += 35;
            if(super.anInt33 > l && super.anInt33 < l + c1 && super.anInt34 > j1 - 12 && super.anInt34 < j1 + 4 && anInt650 == 1)
            {
                super.anInt623 = 1 - super.anInt623;
                flag1 = true;
            }
            j1 += 15;
            if(super.anInt33 > l && super.anInt33 < l + c1 && super.anInt34 > j1 - 12 && super.anInt34 < j1 + 4 && anInt650 == 1)
            {
                super.anInt624 = 1 - super.anInt624;
                flag1 = true;
            }
            j1 += 15;
            if(super.anInt33 > l && super.anInt33 < l + c1 && super.anInt34 > j1 - 12 && super.anInt34 < j1 + 4 && anInt650 == 1)
            {
                super.anInt625 = 1 - super.anInt625;
                flag1 = true;
            }
            j1 += 15;
            if(aBoolean641 && super.anInt33 > l && super.anInt33 < l + c1 && super.anInt34 > j1 - 12 && super.anInt34 < j1 + 4 && anInt650 == 1)
            {
                super.anInt626 = 1 - super.anInt626;
                flag1 = true;
            }
            j1 += 15;
            if(flag1)
                method32(super.anInt623, super.anInt624, super.anInt625, super.anInt626);
            j1 += 20;
            if(super.anInt33 > l && super.anInt33 < l + c1 && super.anInt34 > j1 - 12 && super.anInt34 < j1 + 4 && anInt650 == 1)
                method60();
            anInt650 = 0;
        }
    }

    public void method125()
    {
        int i = 2203 - (anInt718 + anInt691 + anInt695);
        if(anInt717 + anInt690 + anInt694 >= 2640)
            i = -50;
        int j = -1;
        for(int k = 0; k < anInt735; k++)
            aBooleanArray742[k] = false;

        for(int l = 0; l < anInt744; l++)
            aBooleanArray750[l] = false;

        int i1 = aClass6_664.method268();
        Class2 aclass2[] = aClass6_664.method270();
        int ai[] = aClass6_664.method269();
        for(int j1 = 0; j1 < i1; j1++)
        {
            if(anInt797 > 200)
                break;
            int k1 = ai[j1];
            Class2 class2 = aclass2[j1];
            if(class2.anIntArray131[k1] <= 65535 || class2.anIntArray131[k1] >= 0x30d40 && class2.anIntArray131[k1] <= 0x493e0)
                if(class2 == aClass6_664.aClass2_291)
                {
                    int i2 = class2.anIntArray131[k1] % 10000;
                    int l2 = class2.anIntArray131[k1] / 10000;
                    if(l2 == 1)
                    {
                        String s = "";
                        int k3 = 0;
                        if(aClass15_716.anInt543 > 0 && aClass15Array714[i2].anInt543 > 0)
                            k3 = aClass15_716.anInt543 - aClass15Array714[i2].anInt543;
                        if(k3 < 0)
                            s = "@or1@";
                        if(k3 < -3)
                            s = "@or2@";
                        if(k3 < -6)
                            s = "@or3@";
                        if(k3 < -9)
                            s = "@red@";
                        if(k3 > 0)
                            s = "@gr1@";
                        if(k3 > 3)
                            s = "@gr2@";
                        if(k3 > 6)
                            s = "@gr3@";
                        if(k3 > 9)
                            s = "@gre@";
                        s = " " + s + "(level-" + aClass15Array714[i2].anInt543 + ")";
                        if(anInt776 >= 0)
                        {
                            if(Class14.anIntArray503[anInt776] == 1 || Class14.anIntArray503[anInt776] == 2)
                            {
                                aStringArray800[anInt797] = "Cast " + Class14.aStringArray499[anInt776] + " on";
                                aStringArray799[anInt797] = "@whi@" + aClass15Array714[i2].aString521 + s;
                                anIntArray801[anInt797] = 800;
                                anIntArray802[anInt797] = aClass15Array714[i2].anInt524;
                                anIntArray803[anInt797] = aClass15Array714[i2].anInt525;
                                anIntArray804[anInt797] = aClass15Array714[i2].anInt522;
                                anIntArray805[anInt797] = anInt776;
                                anInt797++;
                            }
                        } else
                        if(anInt757 >= 0)
                        {
                            aStringArray800[anInt797] = "Use " + aString758 + " with";
                            aStringArray799[anInt797] = "@whi@" + aClass15Array714[i2].aString521 + s;
                            anIntArray801[anInt797] = 810;
                            anIntArray802[anInt797] = aClass15Array714[i2].anInt524;
                            anIntArray803[anInt797] = aClass15Array714[i2].anInt525;
                            anIntArray804[anInt797] = aClass15Array714[i2].anInt522;
                            anIntArray805[anInt797] = anInt757;
                            anInt797++;
                        } else
                        {
                            if(i > 0 && (aClass15Array714[i2].anInt525 - 64) / anInt666 + anInt691 + anInt695 < 2203)
                            {
                                aStringArray800[anInt797] = "Attack";
                                aStringArray799[anInt797] = "@whi@" + aClass15Array714[i2].aString521 + s;
                                if(k3 >= 0 && k3 < 5)
                                    anIntArray801[anInt797] = 805;
                                else
                                    anIntArray801[anInt797] = 2805;
                                anIntArray802[anInt797] = aClass15Array714[i2].anInt524;
                                anIntArray803[anInt797] = aClass15Array714[i2].anInt525;
                                anIntArray804[anInt797] = aClass15Array714[i2].anInt522;
                                anInt797++;
                            } else
                            if(aBoolean641)
                            {
                                aStringArray800[anInt797] = "Duel with";
                                aStringArray799[anInt797] = "@whi@" + aClass15Array714[i2].aString521 + s;
                                anIntArray802[anInt797] = aClass15Array714[i2].anInt524;
                                anIntArray803[anInt797] = aClass15Array714[i2].anInt525;
                                anIntArray801[anInt797] = 2806;
                                anIntArray804[anInt797] = aClass15Array714[i2].anInt522;
                                anInt797++;
                            }
                            aStringArray800[anInt797] = "Trade with";
                            aStringArray799[anInt797] = "@whi@" + aClass15Array714[i2].aString521 + s;
                            anIntArray801[anInt797] = 2810;
                            anIntArray804[anInt797] = aClass15Array714[i2].anInt522;
                            anInt797++;
                            aStringArray800[anInt797] = "Follow";
                            aStringArray799[anInt797] = "@whi@" + aClass15Array714[i2].aString521 + s;
                            anIntArray801[anInt797] = 2820;
                            anIntArray804[anInt797] = aClass15Array714[i2].anInt522;
                            anInt797++;
                        }
                    } else
                    if(l2 == 2)
                    {
                        if(anInt776 >= 0)
                        {
                            if(Class14.anIntArray503[anInt776] == 3)
                            {
                                aStringArray800[anInt797] = "Cast " + Class14.aStringArray499[anInt776] + " on";
                                aStringArray799[anInt797] = "@lre@" + Class14.aStringArray430[anIntArray732[i2]];
                                anIntArray801[anInt797] = 200;
                                anIntArray802[anInt797] = anIntArray730[i2];
                                anIntArray803[anInt797] = anIntArray731[i2];
                                anIntArray804[anInt797] = anIntArray732[i2];
                                anIntArray805[anInt797] = anInt776;
                                anInt797++;
                            }
                        } else
                        if(anInt757 >= 0)
                        {
                            aStringArray800[anInt797] = "Use " + aString758 + " with";
                            aStringArray799[anInt797] = "@lre@" + Class14.aStringArray430[anIntArray732[i2]];
                            anIntArray801[anInt797] = 210;
                            anIntArray802[anInt797] = anIntArray730[i2];
                            anIntArray803[anInt797] = anIntArray731[i2];
                            anIntArray804[anInt797] = anIntArray732[i2];
                            anIntArray805[anInt797] = anInt757;
                            anInt797++;
                        } else
                        {
                            aStringArray800[anInt797] = "Take";
                            aStringArray799[anInt797] = "@lre@" + Class14.aStringArray430[anIntArray732[i2]];
                            anIntArray801[anInt797] = 220;
                            anIntArray802[anInt797] = anIntArray730[i2];
                            anIntArray803[anInt797] = anIntArray731[i2];
                            anIntArray804[anInt797] = anIntArray732[i2];
                            anInt797++;
                            aStringArray800[anInt797] = "Examine";
                            aStringArray799[anInt797] = "@lre@" + Class14.aStringArray430[anIntArray732[i2]];
                            anIntArray801[anInt797] = 3200;
                            anIntArray804[anInt797] = anIntArray732[i2];
                            anInt797++;
                        }
                    } else
                    if(l2 == 3)
                    {
                        String s1 = "";
                        int l3 = -1;
                        int i4 = aClass15Array725[i2].anInt526;
                        if(Class14.anIntArray449[i4] > 0)
                        {
                            int j4 = (Class14.anIntArray445[i4] + Class14.anIntArray448[i4] + Class14.anIntArray446[i4] + Class14.anIntArray447[i4]) / 4;
                            int k4 = (anIntArray762[0] + anIntArray762[1] + anIntArray762[2] + anIntArray762[3] + 27) / 4;
                            l3 = k4 - j4;
                            s1 = "@yel@";
                            if(l3 < 0)
                                s1 = "@or1@";
                            if(l3 < -3)
                                s1 = "@or2@";
                            if(l3 < -6)
                                s1 = "@or3@";
                            if(l3 < -9)
                                s1 = "@red@";
                            if(l3 > 0)
                                s1 = "@gr1@";
                            if(l3 > 3)
                                s1 = "@gr2@";
                            if(l3 > 6)
                                s1 = "@gr3@";
                            if(l3 > 9)
                                s1 = "@gre@";
                            s1 = " " + s1 + "(level-" + j4 + ")";
                        }
                        if(anInt776 >= 0)
                        {
                            if(Class14.anIntArray503[anInt776] == 2)
                            {
                                aStringArray800[anInt797] = "Cast " + Class14.aStringArray499[anInt776] + " on";
                                aStringArray799[anInt797] = "@yel@" + Class14.aStringArray442[aClass15Array725[i2].anInt526];
                                anIntArray801[anInt797] = 700;
                                anIntArray802[anInt797] = aClass15Array725[i2].anInt524;
                                anIntArray803[anInt797] = aClass15Array725[i2].anInt525;
                                anIntArray804[anInt797] = aClass15Array725[i2].anInt522;
                                anIntArray805[anInt797] = anInt776;
                                anInt797++;
                            }
                        } else
                        if(anInt757 >= 0)
                        {
                            aStringArray800[anInt797] = "Use " + aString758 + " with";
                            aStringArray799[anInt797] = "@yel@" + Class14.aStringArray442[aClass15Array725[i2].anInt526];
                            anIntArray801[anInt797] = 710;
                            anIntArray802[anInt797] = aClass15Array725[i2].anInt524;
                            anIntArray803[anInt797] = aClass15Array725[i2].anInt525;
                            anIntArray804[anInt797] = aClass15Array725[i2].anInt522;
                            anIntArray805[anInt797] = anInt757;
                            anInt797++;
                        } else
                        {
                            if(Class14.anIntArray449[i4] > 0)
                            {
                                aStringArray800[anInt797] = "Attack";
                                aStringArray799[anInt797] = "@yel@" + Class14.aStringArray442[aClass15Array725[i2].anInt526] + s1;
                                if(l3 >= 0)
                                    anIntArray801[anInt797] = 715;
                                else
                                    anIntArray801[anInt797] = 2715;
                                anIntArray802[anInt797] = aClass15Array725[i2].anInt524;
                                anIntArray803[anInt797] = aClass15Array725[i2].anInt525;
                                anIntArray804[anInt797] = aClass15Array725[i2].anInt522;
                                anInt797++;
                            }
                            aStringArray800[anInt797] = "Talk-to";
                            aStringArray799[anInt797] = "@yel@" + Class14.aStringArray442[aClass15Array725[i2].anInt526];
                            anIntArray801[anInt797] = 720;
                            anIntArray802[anInt797] = aClass15Array725[i2].anInt524;
                            anIntArray803[anInt797] = aClass15Array725[i2].anInt525;
                            anIntArray804[anInt797] = aClass15Array725[i2].anInt522;
                            anInt797++;
                            if(!Class14.aStringArray444[i4].equals(""))
                            {
                                aStringArray800[anInt797] = Class14.aStringArray444[i4];
                                aStringArray799[anInt797] = "@yel@" + Class14.aStringArray442[aClass15Array725[i2].anInt526];
                                anIntArray801[anInt797] = 725;
                                anIntArray802[anInt797] = aClass15Array725[i2].anInt524;
                                anIntArray803[anInt797] = aClass15Array725[i2].anInt525;
                                anIntArray804[anInt797] = aClass15Array725[i2].anInt522;
                                anInt797++;
                            }
                            aStringArray800[anInt797] = "Examine";
                            aStringArray799[anInt797] = "@yel@" + Class14.aStringArray442[aClass15Array725[i2].anInt526];
                            anIntArray801[anInt797] = 3700;
                            anIntArray804[anInt797] = aClass15Array725[i2].anInt526;
                            anInt797++;
                        }
                    }
                } else
                if(class2 != null && class2.anInt130 >= 10000)
                {
                    int j2 = class2.anInt130 - 10000;
                    int i3 = anIntArray749[j2];
                    if(!aBooleanArray750[j2])
                    {
                        if(anInt776 >= 0)
                        {
                            if(Class14.anIntArray503[anInt776] == 4)
                            {
                                aStringArray800[anInt797] = "Cast " + Class14.aStringArray499[anInt776] + " on";
                                aStringArray799[anInt797] = "@cya@" + Class14.aStringArray481[i3];
                                anIntArray801[anInt797] = 300;
                                anIntArray802[anInt797] = anIntArray746[j2];
                                anIntArray803[anInt797] = anIntArray747[j2];
                                anIntArray804[anInt797] = anIntArray748[j2];
                                anIntArray805[anInt797] = anInt776;
                                anInt797++;
                            }
                        } else
                        if(anInt757 >= 0)
                        {
                            aStringArray800[anInt797] = "Use " + aString758 + " with";
                            aStringArray799[anInt797] = "@cya@" + Class14.aStringArray481[i3];
                            anIntArray801[anInt797] = 310;
                            anIntArray802[anInt797] = anIntArray746[j2];
                            anIntArray803[anInt797] = anIntArray747[j2];
                            anIntArray804[anInt797] = anIntArray748[j2];
                            anIntArray805[anInt797] = anInt757;
                            anInt797++;
                        } else
                        {
                            if(!Class14.aStringArray483[i3].equalsIgnoreCase("WalkTo"))
                            {
                                aStringArray800[anInt797] = Class14.aStringArray483[i3];
                                aStringArray799[anInt797] = "@cya@" + Class14.aStringArray481[i3];
                                anIntArray801[anInt797] = 320;
                                anIntArray802[anInt797] = anIntArray746[j2];
                                anIntArray803[anInt797] = anIntArray747[j2];
                                anIntArray804[anInt797] = anIntArray748[j2];
                                anInt797++;
                            }
                            if(!Class14.aStringArray484[i3].equalsIgnoreCase("Examine"))
                            {
                                aStringArray800[anInt797] = Class14.aStringArray484[i3];
                                aStringArray799[anInt797] = "@cya@" + Class14.aStringArray481[i3];
                                anIntArray801[anInt797] = 2300;
                                anIntArray802[anInt797] = anIntArray746[j2];
                                anIntArray803[anInt797] = anIntArray747[j2];
                                anIntArray804[anInt797] = anIntArray748[j2];
                                anInt797++;
                            }
                            aStringArray800[anInt797] = "Examine";
                            aStringArray799[anInt797] = "@cya@" + Class14.aStringArray481[i3];
                            anIntArray801[anInt797] = 3300;
                            anIntArray804[anInt797] = i3;
                            anInt797++;
                        }
                        aBooleanArray750[j2] = true;
                    }
                } else
                if(class2 != null && class2.anInt130 >= 0)
                {
                    int k2 = class2.anInt130;
                    int j3 = anIntArray739[k2];
                    if(!aBooleanArray742[k2])
                    {
                        if(anInt776 >= 0)
                        {
                            if(Class14.anIntArray503[anInt776] == 5)
                            {
                                aStringArray800[anInt797] = "Cast " + Class14.aStringArray499[anInt776] + " on";
                                aStringArray799[anInt797] = "@cya@" + Class14.aStringArray471[j3];
                                anIntArray801[anInt797] = 400;
                                anIntArray802[anInt797] = anIntArray737[k2];
                                anIntArray803[anInt797] = anIntArray738[k2];
                                anIntArray804[anInt797] = anIntArray740[k2];
                                anIntArray805[anInt797] = anIntArray739[k2];
                                anIntArray806[anInt797] = anInt776;
                                anInt797++;
                            }
                        } else
                        if(anInt757 >= 0)
                        {
                            aStringArray800[anInt797] = "Use " + aString758 + " with";
                            aStringArray799[anInt797] = "@cya@" + Class14.aStringArray471[j3];
                            anIntArray801[anInt797] = 410;
                            anIntArray802[anInt797] = anIntArray737[k2];
                            anIntArray803[anInt797] = anIntArray738[k2];
                            anIntArray804[anInt797] = anIntArray740[k2];
                            anIntArray805[anInt797] = anIntArray739[k2];
                            anIntArray806[anInt797] = anInt757;
                            anInt797++;
                        } else
                        {
                            if(!Class14.aStringArray473[j3].equalsIgnoreCase("WalkTo"))
                            {
                                aStringArray800[anInt797] = Class14.aStringArray473[j3];
                                aStringArray799[anInt797] = "@cya@" + Class14.aStringArray471[j3];
                                anIntArray801[anInt797] = 420;
                                anIntArray802[anInt797] = anIntArray737[k2];
                                anIntArray803[anInt797] = anIntArray738[k2];
                                anIntArray804[anInt797] = anIntArray740[k2];
                                anIntArray805[anInt797] = anIntArray739[k2];
                                anInt797++;
                            }
                            if(!Class14.aStringArray474[j3].equalsIgnoreCase("Examine"))
                            {
                                aStringArray800[anInt797] = Class14.aStringArray474[j3];
                                aStringArray799[anInt797] = "@cya@" + Class14.aStringArray471[j3];
                                anIntArray801[anInt797] = 2400;
                                anIntArray802[anInt797] = anIntArray737[k2];
                                anIntArray803[anInt797] = anIntArray738[k2];
                                anIntArray804[anInt797] = anIntArray740[k2];
                                anIntArray805[anInt797] = anIntArray739[k2];
                                anInt797++;
                            }
                            aStringArray800[anInt797] = "Examine";
                            aStringArray799[anInt797] = "@cya@" + Class14.aStringArray471[j3];
                            anIntArray801[anInt797] = 3400;
                            anIntArray804[anInt797] = j3;
                            anInt797++;
                        }
                        aBooleanArray742[k2] = true;
                    }
                } else
                {
                    if(k1 >= 0)
                        k1 = class2.anIntArray131[k1] - 0x30d40;
                    if(k1 >= 0)
                        j = k1;
                }
        }

        if(anInt776 >= 0 && Class14.anIntArray503[anInt776] <= 1)
        {
            aStringArray800[anInt797] = "Cast " + Class14.aStringArray499[anInt776] + " on self";
            aStringArray799[anInt797] = "";
            anIntArray801[anInt797] = 1000;
            anIntArray804[anInt797] = anInt776;
            anInt797++;
        }
        if(j != -1)
        {
            int l1 = j;
            if(anInt776 >= 0)
            {
                if(Class14.anIntArray503[anInt776] == 6)
                {
                    aStringArray800[anInt797] = "Cast " + Class14.aStringArray499[anInt776] + " on ground";
                    aStringArray799[anInt797] = "";
                    anIntArray801[anInt797] = 900;
                    anIntArray802[anInt797] = aClass17_689.anIntArray587[l1];
                    anIntArray803[anInt797] = aClass17_689.anIntArray588[l1];
                    anIntArray804[anInt797] = anInt776;
                    anInt797++;
                    return;
                }
            } else
            if(anInt757 < 0)
            {
                aStringArray800[anInt797] = "Walk here";
                aStringArray799[anInt797] = "";
                anIntArray801[anInt797] = 920;
                anIntArray802[anInt797] = aClass17_689.anIntArray587[l1];
                anIntArray803[anInt797] = aClass17_689.anIntArray588[l1];
                anInt797++;
            }
        }
    }

    public void method126()
    {
        if(anInt650 != 0)
        {
            for(int i = 0; i < anInt797; i++)
            {
                int k = anInt793 + 2;
                int i1 = anInt794 + 27 + i * 15;
                if(super.anInt33 <= k - 2 || super.anInt34 <= i1 - 12 || super.anInt34 >= i1 + 4 || super.anInt33 >= (k - 3) + anInt795)
                    continue;
                method128(anIntArray807[i]);
                break;
            }

            anInt650 = 0;
            aBoolean792 = false;
            return;
        }
        if(super.anInt33 < anInt793 - 10 || super.anInt34 < anInt794 - 10 || super.anInt33 > anInt793 + anInt795 + 10 || super.anInt34 > anInt794 + anInt796 + 10)
        {
            aBoolean792 = false;
            return;
        }
        aClass3_Sub1_665.method212(anInt793, anInt794, anInt795, anInt796, 0xd0d0d0, 160);
        aClass3_Sub1_665.method254("Choose option", anInt793 + 2, anInt794 + 12, 1, 65535);
        for(int j = 0; j < anInt797; j++)
        {
            int l = anInt793 + 2;
            int j1 = anInt794 + 27 + j * 15;
            int k1 = 0xffffff;
            if(super.anInt33 > l - 2 && super.anInt34 > j1 - 12 && super.anInt34 < j1 + 4 && super.anInt33 < (l - 3) + anInt795)
                k1 = 0xffff00;
            aClass3_Sub1_665.method254(aStringArray800[anIntArray807[j]] + " " + aStringArray799[anIntArray807[j]], l, j1, 1, k1);
        }

    }

    public void method127()
    {
        if(anInt776 >= 0 || anInt757 >= 0)
        {
            aStringArray800[anInt797] = "Cancel";
            aStringArray799[anInt797] = "";
            anIntArray801[anInt797] = 4000;
            anInt797++;
        }
        for(int i = 0; i < anInt797; i++)
            anIntArray807[i] = i;

        for(boolean flag = false; !flag;)
        {
            flag = true;
            for(int j = 0; j < anInt797 - 1; j++)
            {
                int l = anIntArray807[j];
                int j1 = anIntArray807[j + 1];
                if(anIntArray801[l] > anIntArray801[j1])
                {
                    anIntArray807[j] = j1;
                    anIntArray807[j + 1] = l;
                    flag = false;
                }
            }

        }

        if(anInt797 > 20)
            anInt797 = 20;
        if(anInt797 > 0)
        {
            int k = -1;
            for(int i1 = 0; i1 < anInt797; i1++)
            {
                if(aStringArray799[anIntArray807[i1]] == null || aStringArray799[anIntArray807[i1]].length() <= 0)
                    continue;
                k = i1;
                break;
            }

            String s = null;
            if((anInt757 >= 0 || anInt776 >= 0) && anInt797 == 1)
                s = "Choose a target";
            else
            if((anInt757 >= 0 || anInt776 >= 0) && anInt797 > 1)
                s = "@whi@" + aStringArray800[anIntArray807[0]] + " " + aStringArray799[anIntArray807[0]];
            else
            if(k != -1)
                s = aStringArray799[anIntArray807[k]] + ": @whi@" + aStringArray800[anIntArray807[0]];
            if(anInt797 == 2 && s != null)
                s = s + "@whi@ / 1 more option";
            if(anInt797 > 2 && s != null)
                s = s + "@whi@ / " + (anInt797 - 1) + " more options";
            if(s != null)
                aClass3_Sub1_665.method254(s, 6, 14, 1, 0xffff00);
            if(!aBoolean790 && anInt650 == 1 || aBoolean790 && anInt650 == 1 && anInt797 == 1)
            {
                method128(anIntArray807[0]);
                anInt650 = 0;
                return;
            }
            if(!aBoolean790 && anInt650 == 2 || aBoolean790 && anInt650 == 1)
            {
                anInt796 = (anInt797 + 1) * 15;
                anInt795 = aClass3_Sub1_665.method258("Choose option", 1) + 5;
                for(int k1 = 0; k1 < anInt797; k1++)
                {
                    int l1 = aClass3_Sub1_665.method258(aStringArray800[k1] + " " + aStringArray799[k1], 1) + 5;
                    if(l1 > anInt795)
                        anInt795 = l1;
                }

                anInt793 = super.anInt33 - anInt795 / 2;
                anInt794 = super.anInt34 - 7;
                aBoolean792 = true;
                if(anInt793 < 0)
                    anInt793 = 0;
                if(anInt794 < 0)
                    anInt794 = 0;
                if(anInt793 + anInt795 > 510)
                    anInt793 = 510 - anInt795;
                if(anInt794 + anInt796 > 315)
                    anInt794 = 315 - anInt796;
                anInt650 = 0;
            }
        }
    }

    public void method128(int i)
    {
        int j = anIntArray802[i];
        int k = anIntArray803[i];
        int l = anIntArray804[i];
        int i1 = anIntArray805[i];
        int j1 = anIntArray806[i];
        int k1 = anIntArray801[i];
        if(k1 == 200)
        {
            method96(anInt717, anInt718, j, k, true);
            super.aClass10_Sub1_614.method334(224, 821);
            super.aClass10_Sub1_614.method328(j + anInt694);
            super.aClass10_Sub1_614.method328(k + anInt695);
            super.aClass10_Sub1_614.method328(l);
            super.aClass10_Sub1_614.method328(i1);
            super.aClass10_Sub1_614.method336();
            anInt776 = -1;
        }
        if(k1 == 210)
        {
            method96(anInt717, anInt718, j, k, true);
            super.aClass10_Sub1_614.method334(250, 346);
            super.aClass10_Sub1_614.method328(j + anInt694);
            super.aClass10_Sub1_614.method328(k + anInt695);
            super.aClass10_Sub1_614.method328(l);
            super.aClass10_Sub1_614.method328(i1);
            super.aClass10_Sub1_614.method336();
            anInt757 = -1;
        }
        if(k1 == 220)
        {
            method96(anInt717, anInt718, j, k, true);
            super.aClass10_Sub1_614.method334(252, 634);
            super.aClass10_Sub1_614.method328(j + anInt694);
            super.aClass10_Sub1_614.method328(k + anInt695);
            super.aClass10_Sub1_614.method328(l);
            super.aClass10_Sub1_614.method336();
        }
        if(k1 == 3200)
            method77(Class14.aStringArray431[l], 3);
        if(k1 == 300)
        {
            method98(j, k, l);
            super.aClass10_Sub1_614.method334(223, 596);
            super.aClass10_Sub1_614.method328(j + anInt694);
            super.aClass10_Sub1_614.method328(k + anInt695);
            super.aClass10_Sub1_614.method327(l);
            super.aClass10_Sub1_614.method328(i1);
            super.aClass10_Sub1_614.method336();
            anInt776 = -1;
        }
        if(k1 == 310)
        {
            method98(j, k, l);
            super.aClass10_Sub1_614.method334(239, 792);
            super.aClass10_Sub1_614.method328(j + anInt694);
            super.aClass10_Sub1_614.method328(k + anInt695);
            super.aClass10_Sub1_614.method327(l);
            super.aClass10_Sub1_614.method328(i1);
            super.aClass10_Sub1_614.method336();
            anInt757 = -1;
        }
        if(k1 == 320)
        {
            method98(j, k, l);
            super.aClass10_Sub1_614.method334(238, 212);
            super.aClass10_Sub1_614.method328(j + anInt694);
            super.aClass10_Sub1_614.method328(k + anInt695);
            super.aClass10_Sub1_614.method327(l);
            super.aClass10_Sub1_614.method336();
        }
        if(k1 == 2300)
        {
            method98(j, k, l);
            super.aClass10_Sub1_614.method334(229, 726);
            super.aClass10_Sub1_614.method328(j + anInt694);
            super.aClass10_Sub1_614.method328(k + anInt695);
            super.aClass10_Sub1_614.method327(l);
            super.aClass10_Sub1_614.method336();
        }
        if(k1 == 3300)
            method77(Class14.aStringArray482[l], 3);
        if(k1 == 400)
        {
            method97(j, k, l, i1);
            super.aClass10_Sub1_614.method334(222, 555);
            super.aClass10_Sub1_614.method328(j + anInt694);
            super.aClass10_Sub1_614.method328(k + anInt695);
            super.aClass10_Sub1_614.method328(j1);
            super.aClass10_Sub1_614.method336();
            anInt776 = -1;
        }
        if(k1 == 410)
        {
            method97(j, k, l, i1);
            super.aClass10_Sub1_614.method334(241, 772);
            super.aClass10_Sub1_614.method328(j + anInt694);
            super.aClass10_Sub1_614.method328(k + anInt695);
            super.aClass10_Sub1_614.method328(j1);
            super.aClass10_Sub1_614.method336();
            anInt757 = -1;
        }
        if(k1 == 420)
        {
            method97(j, k, l, i1);
            super.aClass10_Sub1_614.method334(242, 863);
            super.aClass10_Sub1_614.method328(j + anInt694);
            super.aClass10_Sub1_614.method328(k + anInt695);
            super.aClass10_Sub1_614.method336();
        }
        if(k1 == 2400)
        {
            method97(j, k, l, i1);
            super.aClass10_Sub1_614.method334(230, 67);
            super.aClass10_Sub1_614.method328(j + anInt694);
            super.aClass10_Sub1_614.method328(k + anInt695);
            super.aClass10_Sub1_614.method336();
        }
        if(k1 == 3400)
            method77(Class14.aStringArray472[l], 3);
        if(k1 == 600)
        {
            super.aClass10_Sub1_614.method334(220, 567);
            super.aClass10_Sub1_614.method328(l);
            super.aClass10_Sub1_614.method328(i1);
            super.aClass10_Sub1_614.method336();
            anInt776 = -1;
        }
        if(k1 == 610)
        {
            super.aClass10_Sub1_614.method334(240, 377);
            super.aClass10_Sub1_614.method328(l);
            super.aClass10_Sub1_614.method328(i1);
            super.aClass10_Sub1_614.method336();
            anInt757 = -1;
        }
        if(k1 == 620)
        {
            super.aClass10_Sub1_614.method334(248, 466);
            super.aClass10_Sub1_614.method328(l);
            super.aClass10_Sub1_614.method336();
        }
        if(k1 == 630)
        {
            super.aClass10_Sub1_614.method334(249, 267);
            super.aClass10_Sub1_614.method328(l);
            super.aClass10_Sub1_614.method336();
        }
        if(k1 == 640)
        {
            super.aClass10_Sub1_614.method334(246, 237);
            super.aClass10_Sub1_614.method328(l);
            super.aClass10_Sub1_614.method336();
        }
        if(k1 == 650)
        {
            anInt757 = l;
            anInt751 = 0;
            aString758 = Class14.aStringArray430[anIntArray754[anInt757]];
        }
        if(k1 == 660)
        {
            super.aClass10_Sub1_614.method334(251, 664);
            super.aClass10_Sub1_614.method328(l);
            super.aClass10_Sub1_614.method336();
            anInt757 = -1;
            anInt751 = 0;
            method77("Dropping " + Class14.aStringArray430[anIntArray754[l]], 4);
        }
        if(k1 == 3600)
            method77(Class14.aStringArray431[l], 3);
        if(k1 == 700)
        {
            int l1 = (j - 64) / anInt666;
            int l3 = (k - 64) / anInt666;
            method95(anInt717, anInt718, l1, l3, true);
            super.aClass10_Sub1_614.method334(225, 824);
            super.aClass10_Sub1_614.method328(l);
            super.aClass10_Sub1_614.method328(i1);
            super.aClass10_Sub1_614.method336();
            anInt776 = -1;
        }
        if(k1 == 710)
        {
            int i2 = (j - 64) / anInt666;
            int i4 = (k - 64) / anInt666;
            method95(anInt717, anInt718, i2, i4, true);
            super.aClass10_Sub1_614.method334(243, 876);
            super.aClass10_Sub1_614.method328(l);
            super.aClass10_Sub1_614.method328(i1);
            super.aClass10_Sub1_614.method336();
            anInt757 = -1;
        }
        if(k1 == 720)
        {
            int j2 = (j - 64) / anInt666;
            int j4 = (k - 64) / anInt666;
            method95(anInt717, anInt718, j2, j4, true);
            super.aClass10_Sub1_614.method334(245, 586);
            super.aClass10_Sub1_614.method328(l);
            super.aClass10_Sub1_614.method336();
        }
        if(k1 == 725)
        {
            int k2 = (j - 64) / anInt666;
            int k4 = (k - 64) / anInt666;
            method95(anInt717, anInt718, k2, k4, true);
            super.aClass10_Sub1_614.method334(195, 543);
            super.aClass10_Sub1_614.method328(l);
            super.aClass10_Sub1_614.method336();
        }
        if(k1 == 715 || k1 == 2715)
        {
            int l2 = (j - 64) / anInt666;
            int l4 = (k - 64) / anInt666;
            method95(anInt717, anInt718, l2, l4, true);
            super.aClass10_Sub1_614.method334(244, 754);
            super.aClass10_Sub1_614.method328(l);
            super.aClass10_Sub1_614.method336();
        }
        if(k1 == 3700)
            method77(Class14.aStringArray443[l], 3);
        if(k1 == 800)
        {
            int i3 = (j - 64) / anInt666;
            int i5 = (k - 64) / anInt666;
            method95(anInt717, anInt718, i3, i5, true);
            super.aClass10_Sub1_614.method334(226, 117);
            super.aClass10_Sub1_614.method328(l);
            super.aClass10_Sub1_614.method328(i1);
            super.aClass10_Sub1_614.method336();
            anInt776 = -1;
        }
        if(k1 == 810)
        {
            int j3 = (j - 64) / anInt666;
            int j5 = (k - 64) / anInt666;
            method95(anInt717, anInt718, j3, j5, true);
            super.aClass10_Sub1_614.method334(219, 145);
            super.aClass10_Sub1_614.method328(l);
            super.aClass10_Sub1_614.method328(i1);
            super.aClass10_Sub1_614.method336();
            anInt757 = -1;
        }
        if(k1 == 805 || k1 == 2805)
        {
            int k3 = (j - 64) / anInt666;
            int k5 = (k - 64) / anInt666;
            method95(anInt717, anInt718, k3, k5, true);
            super.aClass10_Sub1_614.method334(228, 414);
            super.aClass10_Sub1_614.method328(l);
            super.aClass10_Sub1_614.method336();
        }
        if(k1 == 2806)
        {
            super.aClass10_Sub1_614.method334(204, 273);
            super.aClass10_Sub1_614.method328(l);
            super.aClass10_Sub1_614.method336();
        }
        if(k1 == 2810)
        {
            super.aClass10_Sub1_614.method334(235, 636);
            super.aClass10_Sub1_614.method328(l);
            super.aClass10_Sub1_614.method336();
        }
        if(k1 == 2820)
        {
            super.aClass10_Sub1_614.method334(214, 596);
            super.aClass10_Sub1_614.method328(l);
            super.aClass10_Sub1_614.method336();
        }
        if(k1 == 900)
        {
            method95(anInt717, anInt718, j, k, true);
            super.aClass10_Sub1_614.method334(221, 545);
            super.aClass10_Sub1_614.method328(j + anInt694);
            super.aClass10_Sub1_614.method328(k + anInt695);
            super.aClass10_Sub1_614.method328(l);
            super.aClass10_Sub1_614.method336();
            anInt776 = -1;
        }
        if(k1 == 920)
        {
            method95(anInt717, anInt718, j, k, false);
            if(anInt686 == -24)
                anInt686 = 24;
        }
        if(k1 == 1000)
        {
            super.aClass10_Sub1_614.method334(227, 411);
            super.aClass10_Sub1_614.method328(l);
            super.aClass10_Sub1_614.method336();
            anInt776 = -1;
        }
        if(k1 == 4000)
        {
            anInt757 = -1;
            anInt776 = -1;
        }
    }

    public byte[] method18(String s, String s1, int i)
    {
        if(!aBoolean647)
            s = "../release/" + s;
        byte abyte0[] = link.method433(s);
        if(abyte0 != null)
        {
            int j = ((abyte0[0] & 0xff) << 16) + ((abyte0[1] & 0xff) << 8) + (abyte0[2] & 0xff);
            int k = ((abyte0[3] & 0xff) << 16) + ((abyte0[4] & 0xff) << 8) + (abyte0[5] & 0xff);
            byte abyte1[] = new byte[abyte0.length - 6];
            for(int l = 0; l < abyte0.length - 6; l++)
                abyte1[l] = abyte0[l + 6];

            method15(i, "Unpacking " + s1);
            if(k != j)
            {
                byte abyte2[] = new byte[j];
                Class7.method306(abyte2, j, abyte1, k, 0);
                return abyte2;
            } else
            {
                return abyte1;
            }
        } else
        {
            return super.method18(s, s1, i);
        }
    }

    public int method22()
    {
        return link.anInt598;
    }

    public Graphics getGraphics()
    {
        if(Applet_Sub1.aFrame_Sub1_7 != null)
            return Applet_Sub1.aFrame_Sub1_7.getGraphics();
        if(link.anApplet597 != null)
            return link.anApplet597.getGraphics();
        else
            return super.getGraphics();
    }

    public Image createImage(int i, int j)
    {
        if(Applet_Sub1.aFrame_Sub1_7 != null)
            return Applet_Sub1.aFrame_Sub1_7.createImage(i, j);
        if(link.anApplet597 != null)
            return link.anApplet597.createImage(i, j);
        else
            return super.createImage(i, j);
    }

    public URL getCodeBase()
    {
        if(link.anApplet597 != null)
            return link.anApplet597.getCodeBase();
        else
            return super.getCodeBase();
    }

    public URL getDocumentBase()
    {
        if(link.anApplet597 != null)
            return link.anApplet597.getDocumentBase();
        else
            return super.getDocumentBase();
    }

    public String getParameter(String s)
    {
        if(link.anApplet597 != null)
            return link.anApplet597.getParameter(s);
        else
            return super.getParameter(s);
    }

    public Socket method19(String s, int i)
        throws IOException
    {
        if(link.anApplet597 != null)
        {
            Socket socket = link.method434(i);
            if(socket == null)
                throw new IOException();
            else
                return socket;
        }
        Socket socket1;
        if(method7())
            socket1 = new Socket(InetAddress.getByName(getCodeBase().getHost()), i);
        else
            socket1 = new Socket(InetAddress.getByName(s), i);
        socket1.setSoTimeout(30000);
        socket1.setTcpNoDelay(true);
        return socket1;
    }

    public void method20(Runnable runnable)
    {
        if(link.anApplet597 != null)
        {
            link.method435(runnable);
            return;
        } else
        {
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            thread.start();
            return;
        }
    }

    public String method129(int i)
    {
        if(link.anApplet597 != null)
            return link.method436(Class11.method352(i));
        else
            return Class11.method352(i);
    }

    public mudclient()
    {
        aBoolean641 = false;
        aBigInteger642 = new BigInteger("18439792161837834709");
        aBigInteger643 = new BigInteger("192956484481579778191558061814292671521");
        aBoolean644 = false;
        aBoolean645 = false;
        aBoolean646 = false;
        aBoolean647 = true;
        anInt649 = 0xbc614e;
        anInt651 = 8000;
        anIntArray652 = new int[anInt651];
        anIntArray653 = new int[anInt651];
        anIntArray655 = new int[8192];
        anIntArray656 = new int[8192];
        anInt658 = 2;
        anInt660 = 2;
        anInt666 = 128;
        anInt668 = 512;
        anInt669 = 334;
        anInt670 = 9;
        anInt678 = 40;
        anInt683 = -1;
        anInt684 = -1;
        anInt685 = -1;
        anInt693 = -1;
        anInt696 = -1;
        anInt701 = 550;
        aBoolean702 = false;
        anInt705 = 1;
        anInt707 = 128;
        anInt708 = 4000;
        anInt709 = 500;
        aClass15Array713 = new Class15[anInt708];
        aClass15Array714 = new Class15[anInt709];
        aClass15Array715 = new Class15[anInt709];
        aClass15_716 = new Class15();
        anInt719 = -1;
        anInt720 = 5000;
        anInt721 = 500;
        aClass15Array724 = new Class15[anInt720];
        aClass15Array725 = new Class15[anInt721];
        aClass15Array726 = new Class15[anInt721];
        anIntArray727 = new int[500];
        anInt728 = 5000;
        anIntArray730 = new int[anInt728];
        anIntArray731 = new int[anInt728];
        anIntArray732 = new int[anInt728];
        anIntArray733 = new int[anInt728];
        anInt734 = 1500;
        aClass2Array736 = new Class2[anInt734];
        anIntArray737 = new int[anInt734];
        anIntArray738 = new int[anInt734];
        anIntArray739 = new int[anInt734];
        anIntArray740 = new int[anInt734];
        aClass2Array741 = new Class2[1000];
        aBooleanArray742 = new boolean[anInt734];
        anInt743 = 500;
        aClass2Array745 = new Class2[anInt743];
        anIntArray746 = new int[anInt743];
        anIntArray747 = new int[anInt743];
        anIntArray748 = new int[anInt743];
        anIntArray749 = new int[anInt743];
        aBooleanArray750 = new boolean[anInt743];
        anInt752 = 30;
        anIntArray754 = new int[35];
        anIntArray755 = new int[35];
        anIntArray756 = new int[35];
        anInt757 = -1;
        aString758 = "";
        anIntArray759 = new int[99];
        anIntArray761 = new int[18];
        anIntArray762 = new int[18];
        anIntArray763 = new int[18];
        anIntArray764 = new int[5];
        anInt776 = -1;
        anInt784 = 50;
        aBooleanArray786 = new boolean[anInt784];
        aBooleanArray787 = new boolean[50];
        aBoolean788 = false;
        aBoolean789 = true;
        aBoolean790 = false;
        aBoolean791 = false;
        aBoolean792 = false;
        anInt798 = 250;
        aStringArray799 = new String[anInt798];
        aStringArray800 = new String[anInt798];
        anIntArray801 = new int[anInt798];
        anIntArray802 = new int[anInt798];
        anIntArray803 = new int[anInt798];
        anIntArray804 = new int[anInt798];
        anIntArray805 = new int[anInt798];
        anIntArray806 = new int[anInt798];
        anIntArray807 = new int[anInt798];
        anInt818 = 5;
        aStringArray819 = new String[anInt818];
        anIntArray820 = new int[anInt818];
        aBoolean821 = false;
        aString822 = "";
        anIntArray824 = new int[8];
        anIntArray825 = new int[8];
        anIntArray827 = new int[8];
        anIntArray828 = new int[8];
        aBoolean829 = false;
        aBoolean830 = false;
        aBoolean831 = false;
        aBoolean832 = false;
        aBoolean833 = false;
        aBoolean834 = false;
        aBoolean835 = false;
        aBoolean836 = false;
        anIntArray839 = new int[8];
        anIntArray840 = new int[8];
        anIntArray842 = new int[8];
        anIntArray843 = new int[8];
        aBoolean848 = false;
        aString849 = "";
        anIntArray851 = new int[14];
        anIntArray852 = new int[14];
        anIntArray854 = new int[14];
        anIntArray855 = new int[14];
        aBoolean856 = false;
        aBoolean857 = false;
        aBoolean861 = false;
        aBoolean862 = false;
        anIntArray864 = new int[14];
        anIntArray865 = new int[14];
        anIntArray867 = new int[14];
        anIntArray868 = new int[14];
        aBoolean869 = false;
        anIntArray872 = new int[256];
        anIntArray873 = new int[256];
        anIntArray874 = new int[256];
        anInt875 = -1;
        anInt876 = -2;
        aBoolean877 = false;
        anIntArray879 = new int[256];
        anIntArray880 = new int[256];
        anIntArray882 = new int[256];
        anIntArray883 = new int[256];
        anInt884 = -1;
        anInt885 = -2;
        anInt886 = 48;
        aBoolean888 = false;
        aStringArray890 = new String[5];
        aString896 = "";
        aString897 = "";
        aBoolean898 = false;
        aBoolean899 = false;
        aBoolean905 = false;
        aBoolean906 = false;
        aString907 = "";
        aBoolean912 = false;
        aString932 = "";
        aString933 = "";
        aString934 = "";
        aString935 = "";
        aBoolean950 = false;
        anInt954 = -1;
        anIntArray955 = new int[5];
        anIntArray956 = new int[5];
        anIntArray957 = new int[5];
        anIntArray958 = new int[5];
        aStringArray960 = new String[5];
        aBoolean961 = false;
        anIntArray970 = new int[5];
        anIntArray971 = new int[5];
        aBoolean972 = false;
        aStringArray981 = new String[50];
        anIntArray982 = new int[50];
        anIntArray983 = new int[50];
        anIntArray984 = new int[50];
        anIntArray985 = new int[50];
        anIntArray987 = new int[50];
        anIntArray988 = new int[50];
        anIntArray989 = new int[50];
        anIntArray990 = new int[50];
        anIntArray992 = new int[50];
        anIntArray993 = new int[50];
        anIntArray994 = new int[50];
        aBoolean998 = false;
        anInt1000 = 1;
        anInt1001 = 2;
        anInt1002 = 2;
        anInt1003 = 8;
        anInt1004 = 14;
        anInt1006 = 1;
        anIntArray1016 = new int[50];
        anIntArray1017 = new int[50];
        anIntArray1018 = new int[50];
        anIntArray1019 = new int[50];
        aBoolean1020 = false;
    }

    public boolean aBoolean641;
    public BigInteger aBigInteger642;
    public BigInteger aBigInteger643;
    public boolean aBoolean644;
    public boolean aBoolean645;
    public boolean aBoolean646;
    public boolean aBoolean647;
    public int anInt648;
    public int anInt649;
    public int anInt650;
    public int anInt651;
    public int anIntArray652[];
    public int anIntArray653[];
    public int anInt654;
    public int anIntArray655[];
    public int anIntArray656[];
    public int anInt657;
    public int anInt658;
    public int anInt659;
    public int anInt660;
    public int anInt661;
    public int anInt662;
    public Graphics aGraphics663;
    public Class6 aClass6_664;
    public Class3_Sub1 aClass3_Sub1_665;
    public int anInt666;
    public int anInt667;
    public int anInt668;
    public int anInt669;
    public int anInt670;
    public int anInt671;
    public int anInt672;
    public int anInt673;
    public int anInt674;
    public int anInt675;
    public int anInt676;
    public int anInt677;
    public int anInt678;
    public int anInt679;
    public int anInt680;
    public int anInt681;
    public int anInt682;
    public int anInt683;
    public int anInt684;
    public int anInt685;
    public int anInt686;
    public int anInt687;
    public int anInt688;
    public Class17 aClass17_689;
    public int anInt690;
    public int anInt691;
    public int anInt692;
    public int anInt693;
    public int anInt694;
    public int anInt695;
    public int anInt696;
    public int anInt697;
    public int anInt698;
    public int anInt699;
    public int anInt700;
    public int anInt701;
    public boolean aBoolean702;
    public int anInt703;
    public int anInt704;
    public int anInt705;
    public int anInt706;
    public int anInt707;
    public int anInt708;
    public int anInt709;
    public int anInt710;
    public int anInt711;
    public int anInt712;
    public Class15 aClass15Array713[];
    public Class15 aClass15Array714[];
    public Class15 aClass15Array715[];
    public Class15 aClass15_716;
    public int anInt717;
    public int anInt718;
    public int anInt719;
    public int anInt720;
    public int anInt721;
    public int anInt722;
    public int anInt723;
    public Class15 aClass15Array724[];
    public Class15 aClass15Array725[];
    public Class15 aClass15Array726[];
    public int anIntArray727[];
    public int anInt728;
    public int anInt729;
    public int anIntArray730[];
    public int anIntArray731[];
    public int anIntArray732[];
    public int anIntArray733[];
    public int anInt734;
    public int anInt735;
    public Class2 aClass2Array736[];
    public int anIntArray737[];
    public int anIntArray738[];
    public int anIntArray739[];
    public int anIntArray740[];
    public Class2 aClass2Array741[];
    public boolean aBooleanArray742[];
    public int anInt743;
    public int anInt744;
    public Class2 aClass2Array745[];
    public int anIntArray746[];
    public int anIntArray747[];
    public int anIntArray748[];
    public int anIntArray749[];
    public boolean aBooleanArray750[];
    public int anInt751;
    public int anInt752;
    public int anInt753;
    public int anIntArray754[];
    public int anIntArray755[];
    public int anIntArray756[];
    public int anInt757;
    public String aString758;
    public int anIntArray759[];
    public final int anInt760 = 18;
    public int anIntArray761[];
    public int anIntArray762[];
    public int anIntArray763[];
    public int anIntArray764[];
    public int anInt765;
    public int anInt766;
    public int anInt767;
    public String aStringArray768[] = {
        "Attack", "Defense", "Strength", "Hits", "Ranged", "Prayer", "Magic", "Cooking", "Woodcut", "Fletching", 
        "Fishing", "Firemaking", "Crafting", "Smithing", "Mining", "Herblaw", "Agility", "Thieving"
    };
    public String aStringArray769[] = {
        "Attack", "Defense", "Strength", "Hits", "Ranged", "Prayer", "Magic", "Cooking", "Woodcutting", "Fletching", 
        "Fishing", "Firemaking", "Crafting", "Smithing", "Mining", "Herblaw", "Agility", "Thieving"
    };
    public String aStringArray770[] = {
        "Armour", "WeaponAim", "WeaponPower", "Magic", "Prayer"
    };
    public int anInt771;
    public int anInt772;
    public Class1 aClass1_773;
    public int anInt774;
    public int anInt775;
    public int anInt776;
    public Class1 aClass1_777;
    public int anInt778;
    public int anInt779;
    public long aLong780;
    public Class1 aClass1_781;
    public int anInt782;
    public int anInt783;
    public int anInt784;
    public String aStringArray785[] = {
        "Black knight's fortress", "Cook's assistant", "Demon slayer", "Doric's quest", "The restless ghost", "Goblin diplomacy", "Ernest the chicken", "Imp catcher", "Pirate's treasure", "Prince Ali rescue", 
        "Romeo & Juliet", "Sheep shearer", "Shield of Arrav", "The knight's sword", "Vampire slayer", "Witch's potion", "Dragon slayer", "Witch's house (members)", "Lost city (members)", "Hero's quest (members)", 
        "Druidic ritual (members)", "Merlin's crystal (members)", "Scorpion catcher (members)", "Family crest (members)", "Tribal totem (members)", "Fishing contest (members)", "Monk's friend (members)", "Temple of Ikov (members)", "Clock tower (members)", "The Holy Grail (members)", 
        "Fight Arena (members)", "Tree Gnome Village (members)", "The Hazeel Cult (members)", "Sheep Herder (members)", "Plague City (members)", "Sea Slug (members)", "Waterfall quest (members)", "Biohazard (members)", "Jungle potion (members)", "Grand tree (members)", 
        "Shilo village (members)", "Underground pass (members)", "Observatory quest (members)", "Tourist trap (members)", "Watchtower (members)", "Dwarf Cannon (members)", "Murder Mystery (members)", "Digsite (members)", "Gertrude's Cat (members)", "Legend's Quest (members)"
    };
    public boolean aBooleanArray786[];
    public boolean aBooleanArray787[];
    public boolean aBoolean788;
    public boolean aBoolean789;
    public boolean aBoolean790;
    public boolean aBoolean791;
    public boolean aBoolean792;
    public int anInt793;
    public int anInt794;
    public int anInt795;
    public int anInt796;
    public int anInt797;
    public int anInt798;
    public String aStringArray799[];
    public String aStringArray800[];
    public int anIntArray801[];
    public int anIntArray802[];
    public int anIntArray803[];
    public int anIntArray804[];
    public int anIntArray805[];
    public int anIntArray806[];
    public int anIntArray807[];
    public int anInt808;
    public int anInt809;
    public int anInt810;
    public int anInt811;
    public Class1 aClass1_812;
    public int anInt813;
    public int anInt814;
    public int anInt815;
    public int anInt816;
    public int anInt817;
    public int anInt818;
    public String aStringArray819[];
    public int anIntArray820[];
    public boolean aBoolean821;
    public String aString822;
    public int anInt823;
    public int anIntArray824[];
    public int anIntArray825[];
    public int anInt826;
    public int anIntArray827[];
    public int anIntArray828[];
    public boolean aBoolean829;
    public boolean aBoolean830;
    public boolean aBoolean831;
    public boolean aBoolean832;
    public boolean aBoolean833;
    public boolean aBoolean834;
    public boolean aBoolean835;
    public boolean aBoolean836;
    public long aLong837;
    public int anInt838;
    public int anIntArray839[];
    public int anIntArray840[];
    public int anInt841;
    public int anIntArray842[];
    public int anIntArray843[];
    public int anInt844;
    public int anInt845;
    public int anInt846;
    public int anInt847;
    public boolean aBoolean848;
    public String aString849;
    public int anInt850;
    public int anIntArray851[];
    public int anIntArray852[];
    public int anInt853;
    public int anIntArray854[];
    public int anIntArray855[];
    public boolean aBoolean856;
    public boolean aBoolean857;
    public int anInt858;
    public int anInt859;
    public long aLong860;
    public boolean aBoolean861;
    public boolean aBoolean862;
    public int anInt863;
    public int anIntArray864[];
    public int anIntArray865[];
    public int anInt866;
    public int anIntArray867[];
    public int anIntArray868[];
    public boolean aBoolean869;
    public int anInt870;
    public int anInt871;
    public int anIntArray872[];
    public int anIntArray873[];
    public int anIntArray874[];
    public int anInt875;
    public int anInt876;
    public boolean aBoolean877;
    public int anInt878;
    public int anIntArray879[];
    public int anIntArray880[];
    public int anInt881;
    public int anIntArray882[];
    public int anIntArray883[];
    public int anInt884;
    public int anInt885;
    public int anInt886;
    public int anInt887;
    public boolean aBoolean888;
    public int anInt889;
    public String aStringArray890[];
    public int anInt891;
    public int anInt892;
    public int anInt893;
    public int anInt894;
    public int anInt895;
    public String aString896;
    public String aString897;
    public boolean aBoolean898;
    public boolean aBoolean899;
    public int anInt900;
    public String aString901;
    public int anInt902;
    public int anInt903;
    public int anInt904;
    public boolean aBoolean905;
    public boolean aBoolean906;
    public String aString907;
    public int anInt908;
    public int anInt909;
    public int anInt910;
    public int anInt911;
    public boolean aBoolean912;
    public int anInt913;
    public Class1 aClass1_914;
    public int anInt915;
    public int anInt916;
    public Class1 aClass1_917;
    public int anInt918;
    public int anInt919;
    public int anInt920;
    public int anInt921;
    public int anInt922;
    public int anInt923;
    public int anInt924;
    public Class1 aClass1_925;
    public int anInt926;
    public int anInt927;
    public int anInt928;
    public int anInt929;
    public int anInt930;
    public int anInt931;
    public String aString932;
    public String aString933;
    public String aString934;
    public String aString935;
    public Class1 aClass1_936;
    public int anInt937;
    public int anInt938;
    public int anInt939;
    public int anInt940;
    public int anInt941;
    public int anInt942;
    public int anInt943;
    public int anInt944;
    public int anInt945;
    public int anInt946;
    public int anInt947;
    public int anInt948;
    public int anInt949;
    public boolean aBoolean950;
    public Class1 aClass1_951;
    public int anInt952;
    public int anInt953;
    public int anInt954;
    public int anIntArray955[];
    public int anIntArray956[];
    public int anIntArray957[];
    public int anIntArray958[];
    public int anIntArray959[] = {
        0, 1, 2, 3, 4
    };
    public String aStringArray960[];
    public boolean aBoolean961;
    public Class1 aClass1_962;
    public int anInt963;
    public int anInt964;
    public int anInt965;
    public int anInt966;
    public int anInt967;
    public int anInt968;
    public int anInt969;
    public int anIntArray970[];
    public int anIntArray971[];
    public boolean aBoolean972;
    public Class1 aClass1_973;
    public int anInt974;
    public int anInt975;
    public int anInt976;
    public int anInt977;
    public int anInt978;
    public int anInt979;
    public int anInt980;
    public String aStringArray981[];
    public int anIntArray982[];
    public int anIntArray983[];
    public int anIntArray984[];
    public int anIntArray985[];
    public int anInt986;
    public int anIntArray987[];
    public int anIntArray988[];
    public int anIntArray989[];
    public int anIntArray990[];
    public int anInt991;
    public int anIntArray992[];
    public int anIntArray993[];
    public int anIntArray994[];
    public int anInt995;
    public int anInt996;
    public int anIntArrayArray997[][] = {
        {
            11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 
            3, 4
        }, {
            11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 
            3, 4
        }, {
            11, 3, 2, 9, 7, 1, 6, 10, 0, 5, 
            8, 4
        }, {
            3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 
            0, 5
        }, {
            3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 
            0, 5
        }, {
            4, 3, 2, 9, 7, 1, 6, 10, 8, 11, 
            0, 5
        }, {
            11, 4, 2, 9, 7, 1, 6, 10, 0, 5, 
            8, 3
        }, {
            11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 
            4, 3
        }
    };
    public boolean aBoolean998;
    public int anInt999;
    public int anInt1000;
    public int anInt1001;
    public int anInt1002;
    public int anInt1003;
    public int anInt1004;
    public int anInt1005;
    public int anInt1006;
    public int anIntArray1007[] = {
        0xff0000, 0xff8000, 0xffe000, 0xa0e000, 57344, 32768, 41088, 45311, 33023, 12528, 
        0xe000e0, 0x303030, 0x604000, 0x805000, 0xffffff
    };
    public int anIntArray1008[] = {
        0xffc030, 0xffa040, 0x805030, 0x604020, 0x303030, 0xff6020, 0xff4000, 0xffffff, 65280, 65535
    };
    public int anIntArray1009[] = {
        0xecded0, 0xccb366, 0xb38c40, 0x997326, 0x906020
    };
    public int anIntArray1010[] = {
        0, 1, 2, 1
    };
    public int anIntArray1011[] = {
        0, 1, 2, 1, 0, 0, 0, 0
    };
    public int anIntArray1012[] = {
        0, 0, 0, 0, 0, 1, 2, 1
    };
    public byte aByteArray1013[];
    public InputStream_Sub1 anInputStream_Sub1_1014;
    public int anInt1015;
    public int anIntArray1016[];
    public int anIntArray1017[];
    public int anIntArray1018[];
    public int anIntArray1019[];
    public boolean aBoolean1020;
    public String aString1021;
    public String aStringArray1022[] = {
        "Where were you born?", "What was your first teachers name?", "What is your fathers middle name?", "Who was your first best friend?", "What is your favourite vacation spot?", "What is your mothers middle name?", "What was your first pets name?", "What was the name of your first school?", "What is your mothers maiden name?", "Who was your first boyfriend/girlfriend?", 
        "What was the first computer game you purchased?", "Who is your favourite actor/actress?", "Who is your favourite author?", "Who is your favourite musician?", "Who is your favourite cartoon character?", "What is your favourite book?", "What is your favourite food?", "What is your favourite movie?"
    };
}
