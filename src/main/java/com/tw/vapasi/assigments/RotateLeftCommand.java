package com.tw.vapasi.assigments;

public class RotateLeftCommand implements ICommand {
    @Override
    public void execute(Rover rover) {
        rover.rotateLeft();
    }
}
