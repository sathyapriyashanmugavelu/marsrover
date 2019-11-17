package com.tw.vapasi.assignments;

public class MoveCommand implements ICommand {
    @Override
    public void execute(final Rover rover) throws RoverOutOfBoundException {
        rover.move();
    }
}
