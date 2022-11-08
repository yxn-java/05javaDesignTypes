package com.javapractice.designTypes.Command_19;

class ResetCursor implements Command {
    private MouseCursor abcStock;

    public ResetCursor(MouseCursor abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.reset();
    }
}
