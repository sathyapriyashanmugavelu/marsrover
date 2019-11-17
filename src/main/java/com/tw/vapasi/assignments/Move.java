package com.tw.vapasi.assignments;

public class Move implements ICommand {
    @Override
    public void execute(final Rover rover) throws RoverOutOfBoundException {
            rover.move();
    }
}
