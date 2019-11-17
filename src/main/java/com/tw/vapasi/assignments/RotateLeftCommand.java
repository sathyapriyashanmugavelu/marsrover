package com.tw.vapasi.assignments;

public class RotateLeftCommand implements ICommand {
    @Override
    public void execute(Rover rover) {
        rover.rotateLeft();
    }
}
