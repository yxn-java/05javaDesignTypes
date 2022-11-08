package com.javapractice.designTypes.Command_19;

class MoveCursor implements Command {
    private MouseCursor abcStock;

    public MoveCursor(MouseCursor abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.move();
    }
}
