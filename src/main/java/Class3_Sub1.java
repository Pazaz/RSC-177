// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.awt.Component;
import pack1.pack2.Class3;

public class Class3_Sub1 extends Class3
{

    public Class3_Sub1(int i, int j, int k, Component component)
    {
        super(i, j, k, component);
        boolean flag = false;
        if(flag)
            new Class3(i, j, k, component);
    }

    public void method244(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        if(i1 >= 50000)
        {
            aMudclient632.method86(i, j, k, l, i1 - 50000, j1, k1);
            return;
        }
        if(i1 >= 40000)
        {
            aMudclient632.method87(i, j, k, l, i1 - 40000, j1, k1);
            return;
        }
        if(i1 >= 20000)
        {
            aMudclient632.method88(i, j, k, l, i1 - 20000, j1, k1);
            return;
        }
        if(i1 >= 5000)
        {
            aMudclient632.method89(i, j, k, l, i1 - 5000, j1, k1);
            return;
        } else
        {
            super.method230(i, j, k, l, i1);
            return;
        }
    }

    public mudclient aMudclient632;
}
