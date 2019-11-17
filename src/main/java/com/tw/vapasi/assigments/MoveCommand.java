package com.tw.vapasi.assigments;

public class MoveCommand implements ICommand {
    @Override
    public void execute(final Rover rover) throws RoverOutOfBoundException {
            rover.move();
    }
}
