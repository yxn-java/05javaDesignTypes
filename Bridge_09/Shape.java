package com.javapractice.designTypes.Bridge_09;

abstract class Shape {
    protected Printer print;
    protected Shape(Printer p){
        this.print = p;
    }
    public abstract void draw();
}
