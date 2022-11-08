package com.javapractice.designTypes.Template_14;

class Browser extends Software {
    @Override
    void end() {
        System.out.println("Browser Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Browser Initialized!.");
    }

    @Override
    void start() {
        System.out.println("Browser Started.");
    }
}
