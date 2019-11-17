package com.tw.vapasi.assignments;

public class RightCommand implements ICommand {
    @Override
    public void execute(final Rover rover) {
        rover.rotateRight();
    }
}
