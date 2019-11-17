package com.tw.vapasi.assignments;

public class Right implements ICommand {
    @Override
    public void execute(final Rover rover) {
        rover.rotateRight();
    }
}
