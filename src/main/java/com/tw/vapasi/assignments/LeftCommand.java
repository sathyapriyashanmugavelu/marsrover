package com.tw.vapasi.assignments;

public class LeftCommand implements ICommand {
    @Override
    public void execute(final Rover rover) {
        rover.rotateLeft();
    }
}
