package com.javapractice.designTypes.Visitor_17;


public class Main {
    public static void main(String[] args) {

        TreeNode computer = new TreeNode("w3cschool.cn");
        computer.accept(new ConsoleVisitor());
        computer.accept(new EmailVisitor());
    }
}
