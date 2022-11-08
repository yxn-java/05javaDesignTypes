package com.javapractice.designTypes.Proxy_08;




public class Main {

    public static void main(String[] args) {
        Printer image = new ProxyPrinter("test");
        image.print();
    }
}

