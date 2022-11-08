package com.javapractice.designTypes.Bridge_09;

public class ColorPrinter implements Printer{
    @Override
    public void print(int radius, int x, int y) {
        System.out.println("Black: " + radius +", x: " +x+", "+ y +"]");
    }
}
