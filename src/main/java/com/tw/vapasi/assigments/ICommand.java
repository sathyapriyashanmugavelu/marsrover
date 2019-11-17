package com.tw.vapasi.assigments;

public interface ICommand {
    public void execute(final Rover rover) throws RoverOutOfBoundException;
}
