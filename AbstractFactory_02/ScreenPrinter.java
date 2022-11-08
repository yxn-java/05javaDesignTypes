package com.javapractice.designTypes.AbstractFactory_02;

public class ScreenPrinter implements Printer{

    @Override
    public void print() {
        System.out.println("screen");
    }
}
