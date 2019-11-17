package com.tw.vapasi.assignments;

public class Left implements ICommand {
    @Override
    public void execute(Rover rover) {
        rover.rotateLeft();
    }
}
