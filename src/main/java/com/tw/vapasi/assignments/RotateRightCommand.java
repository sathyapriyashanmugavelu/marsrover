package com.tw.vapasi.assignments;

public class RotateRightCommand implements ICommand {
    @Override
    public void execute(final Rover rover) {
        rover.rotateRight();
    }
}
