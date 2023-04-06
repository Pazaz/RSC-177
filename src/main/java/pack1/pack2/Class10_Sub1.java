// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package pack1.pack2;

import java.io.*;
import java.net.Socket;
import pack1.Class10;

// Referenced classes of package pack1.pack2:
//            Applet_Sub1, Class3

public class Class10_Sub1 extends Class10
    implements Runnable
{

    public Class10_Sub1(Socket socket, Applet_Sub1 applet_sub1)
        throws IOException
    {
        aBoolean636 = false;
        aBoolean640 = true;
        aSocket635 = socket;
        anInputStream633 = socket.getInputStream();
        anOutputStream634 = socket.getOutputStream();
        aBoolean640 = false;
        applet_sub1.method20(this);
    }

    public void method317()
    {
        super.method317();
        aBoolean636 = true;
        try
        {
            if(anInputStream633 != null)
                anInputStream633.close();
            if(anOutputStream634 != null)
                anOutputStream634.close();
            if(aSocket635 != null)
                aSocket635.close();
        }
        catch(IOException _ex)
        {
            System.out.println("Error closing stream");
        }
        aBoolean640 = true;
        synchronized(this)
        {
            notify();
        }
        aByteArray637 = null;
    }

    public int method318()
        throws IOException
    {
        if(aBoolean636)
            return 0;
        else
            return anInputStream633.read();
    }

    public int method319()
        throws IOException
    {
        if(aBoolean636)
            return 0;
        else
            return anInputStream633.available();
    }

    public void method320(int i, int j, byte abyte0[])
        throws IOException
    {
        if(aBoolean636)
            return;
        int k = 0;
        boolean flag = false;
        int l;
        for(; k < i; k += l)
            if((l = anInputStream633.read(abyte0, k + j, i - k)) <= 0)
                throw new IOException("EOF");

    }

    public void method321(byte abyte0[], int i, int j)
        throws IOException
    {
        if(aBoolean636)
            return;
        if(aByteArray637 == null)
            aByteArray637 = new byte[5000];
        synchronized(this)
        {
            for(int k = 0; k < j; k++)
            {
                aByteArray637[anInt639] = abyte0[k + i];
                anInt639 = (anInt639 + 1) % 5000;
                if(anInt639 == (anInt638 + 4900) % 5000)
                    throw new IOException("buffer overflow");
            }

            notify();
        }
    }

    public void run()
    {
        while(!aBoolean640) 
        {
            int i;
            int j;
            synchronized(this)
            {
                if(anInt639 == anInt638)
                    try
                    {
                        wait();
                    }
                    catch(InterruptedException _ex) { }
                if(aBoolean640)
                    return;
                j = anInt638;
                if(anInt639 >= anInt638)
                    i = anInt639 - anInt638;
                else
                    i = 5000 - anInt638;
            }
            if(i > 0)
            {
                try
                {
                    anOutputStream634.write(aByteArray637, j, i);
                }
                catch(IOException ioexception)
                {
                    super.aBoolean385 = true;
                    super.aString386 = "Twriter:" + ioexception;
                }
                anInt638 = (anInt638 + i) % 5000;
                try
                {
                    if(anInt639 == anInt638)
                        anOutputStream634.flush();
                }
                catch(IOException ioexception1)
                {
                    super.aBoolean385 = true;
                    super.aString386 = "Twriter:" + ioexception1;
                }
            }
        }
    }

    public InputStream anInputStream633;
    public OutputStream anOutputStream634;
    public Socket aSocket635;
    public boolean aBoolean636;
    public byte aByteArray637[];
    public int anInt638;
    public int anInt639;
    public boolean aBoolean640;
}
