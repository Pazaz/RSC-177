// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.applet.Applet;
import java.net.Socket;

public class link
{

    public static void method432(String s, byte abyte0[])
    {
        aStringArray605[anInt604] = s;
        aByteArrayArray606[anInt604] = abyte0;
        anInt604++;
    }

    public static byte[] method433(String s)
    {
        for(int i = 0; i < anInt604; i++)
            if(aStringArray605[i].equals(s))
                return aByteArrayArray606[i];

        return null;
    }

    public static Socket method434(int i)
    {
        for(anInt599 = i; anInt599 != 0;)
            try
            {
                Thread.sleep(100L);
            }
            catch(Exception _ex) { }

        return aSocket600;
    }

    public static void method435(Runnable runnable)
    {
        for(aRunnable601 = runnable; aRunnable601 != null;)
            try
            {
                Thread.sleep(100L);
            }
            catch(Exception _ex) { }

    }

    public static String method436(String s)
    {
        for(aString602 = s; aString602 != null;)
            try
            {
                Thread.sleep(100L);
            }
            catch(Exception _ex) { }

        return aString603;
    }

    public link()
    {
    }

    public static Applet anApplet597;
    public static int anInt598;
    public static int anInt599;
    public static Socket aSocket600;
    public static Runnable aRunnable601 = null;
    public static String aString602 = null;
    public static String aString603;
    public static int anInt604;
    public static String aStringArray605[] = new String[50];
    public static byte aByteArrayArray606[][] = new byte[50][];

}
