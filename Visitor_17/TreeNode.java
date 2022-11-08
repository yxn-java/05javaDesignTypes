package com.javapractice.designTypes.Visitor_17;

public class TreeNode {
    private String name;
    public TreeNode(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void accept(NodeVisitor v) {
        v.visit(this);
    }
}
