package com.javapractice.designTypes.Visitor_17;

public class EmailVisitor implements NodeVisitor {
    @Override
    public void visit(TreeNode n) {
        System.out.println("email:" + n.getName());
    }
}
