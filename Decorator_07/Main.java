package com.javapractice.designTypes.Decorator_07;
//装饰器模式:动态地给一个对象添加一些额外的职责。就增加功能来说，装饰 器模式相比生成子类更为灵活
public class Main {
    public static void main(String[] args) {
        Printer plasticPrinter = new PlasticPrinter();
        Printer plastic3DPrinter = new Printer3D(new PlasticPrinter());
        Printer paper3DPrinter = new Printer3D(new PaperPrinter());
        plasticPrinter.print();
        plastic3DPrinter.print();
        paper3DPrinter.print();
    }
}
