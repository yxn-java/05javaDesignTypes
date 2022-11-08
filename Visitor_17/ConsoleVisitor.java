package com.javapractice.designTypes.Visitor_17;

public class ConsoleVisitor implements NodeVisitor {
    @Override
    public void visit(TreeNode n) {
        System.out.println("console:" + n.getName());
    }
}
