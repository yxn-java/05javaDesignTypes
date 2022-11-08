package com.javapractice.designTypes.Proxy_08;

class ProxyPrinter implements Printer{
    private ConsolePrinter consolePrinter;
    private String fileName;

    public ProxyPrinter(String fileName){
        this.fileName = fileName;
    }//定义代理类

    @Override
    public void print() {
        if(consolePrinter == null){
            consolePrinter = new ConsolePrinter(fileName);
        }
        consolePrinter.print();
    }
}
