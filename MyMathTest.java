package com.jw.assigns;

import javax.swing.*;


public class MyMathTest {
    public static void main(String[] args){
        //declare and populate two variables
        int a=Integer.parseInt(JOptionPane.showInputDialog("Enter number"));
        int b=Integer.parseInt(JOptionPane.showInputDialog("Enter number"));

        //call MyMath method
        MyMath.sum(a,b);

        //create object of MyMath class
        MyMath c = new MyMath(Integer.parseInt(JOptionPane.showInputDialog("Enter number")));

        //call different??? MyMath method
        int d= c.sum(a);

        JOptionPane.showMessageDialog(null,"Sum is: "+d);

    }
}
