package com.tw.vapasi.assigments;

public class Rover {
    private Plateau plateau;
    private Coordinates coordinates;
    private Direction direction;

    public Rover() {
    }

    public Rover(Plateau plateau, Coordinates coordinates, Direction direction) throws RoverNotDeployedInPlateauException {
        this.plateau = plateau;
        this.coordinates = coordinates;
        this.direction = direction;

        if (!(plateau.areCoordinatesWithInBounds(coordinates))) {
            throw new RoverNotDeployedInPlateauException();
        }
    }

    public String processInstruction(String instructionString) throws RoverOutOfBoundException {
        for (char commandString : instructionString.toCharArray()) {
            if (commandString == 'M') {
                move();
                continue;
            }
            rotateRover(commandString);
        }
        return finalPositionAndDirectionToString();
    }

    public void move() throws RoverOutOfBoundException {
        Coordinates newCoordinates=coordinates.newCoordinatesForStepSize(direction.stepForXAxis(), direction.stepForYAxis());
        if (!(plateau.areCoordinatesWithInBounds(newCoordinates))) {
            throw new RoverOutOfBoundException();
        }
        this.coordinates = newCoordinates;
    }

    public void rotateRover(char rotateString) {
        this.direction = this.direction.rotateTo(rotateString);
    }

    public Direction direction() {
        return direction;
    }

    public String finalPositionAndDirectionToString() {
        return coordinates.toString() + " " + direction;
    }
}
