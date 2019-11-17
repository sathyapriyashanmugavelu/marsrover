package com.tw.vapasi.assigments;

import java.util.List;

public class Rover {
    private Plateau plateau;
    private Coordinates coordinates;
    private Direction direction;

    public Rover(Plateau plateau, Coordinates coordinates, Direction direction) throws RoverNotDeployedInPlateauException {
        this.plateau = plateau;
        this.coordinates = coordinates;
        this.direction = direction;

        if (!(plateau.areCoordinatesWithInBounds(coordinates))) {
            throw new RoverNotDeployedInPlateauException();
        }
    }

    public void processInstruction(String instructionString) throws RoverOutOfBoundException {
        List<ICommand> roverCommands = new CommandParser(instructionString).toCommands();
        for(ICommand command: roverCommands){
            command.execute(this);
        }
    }

    public void move() throws RoverOutOfBoundException {
        this.coordinates = coordinates.newCoordinatesForStepValue(direction.stepValueForXAxis(), direction.stepValueForYAxis());
        if (!(plateau.areCoordinatesWithInBounds(this.coordinates))) {
            throw new RoverOutOfBoundException();
        }
    }

    public void rotateLeft() {
        this.direction=this.direction.left();
    }

    public void rotateRight() {
        this.direction=this.direction.right();
    }


    public Direction direction() {
        return direction;
    }

    public String finalPositionAndDirectionToString() {
        return coordinates.toString() + " " + direction;
    }


}
