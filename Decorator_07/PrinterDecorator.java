package com.javapractice.designTypes.Decorator_07;

public abstract class PrinterDecorator implements Printer {
    protected Printer decoratedPrinter;
    public PrinterDecorator(Printer d){
        this.decoratedPrinter = d;
    }
    public void print(){
        decoratedPrinter.print();
    }
}
