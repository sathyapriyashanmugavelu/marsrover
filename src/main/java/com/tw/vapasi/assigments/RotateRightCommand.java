package com.tw.vapasi.assigments;

public class RotateRightCommand implements ICommand {
    @Override
    public void execute(final Rover rover) {
        rover.rotateRight();
    }
}
