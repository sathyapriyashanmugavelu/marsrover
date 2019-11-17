package com.tw.vapasi.assignments;

public interface ICommand {
    public void execute(final Rover rover) throws RoverOutOfBoundException;
}
