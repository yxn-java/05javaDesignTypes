package com.javapractice.designTypes.AbstractFactory_02;

class PaperPrinter implements Printer{

    @Override
    public void print() {
        System.out.println("paper");
    }
}
