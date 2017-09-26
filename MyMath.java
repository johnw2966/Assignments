package com.jw.assigns;

import javax.swing.*;


public class MyMath {

    private int x;

    //What is this?
    public MyMath(int z){
        x=z;
    }

    //What kind of method is this?
    public static void sum(int x, int y){
        JOptionPane.showMessageDialog(null,"Sum is :"+new Integer(x+y));
    }

    //What kind of method is this?
    public int sum(int y){
        return this.x+y;
    }

}
