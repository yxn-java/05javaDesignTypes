package com.javapractice.designTypes.Decorator_07;

public class PaperPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Paper Printer");
    }
}
