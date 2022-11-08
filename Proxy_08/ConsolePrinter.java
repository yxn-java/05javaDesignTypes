package com.javapractice.designTypes.Proxy_08;

class ConsolePrinter implements Printer {
    private String fileName;

    public ConsolePrinter(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void print() {
        System.out.println("Displaying " + fileName);
    }
}
