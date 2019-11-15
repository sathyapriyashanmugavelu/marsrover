package com.tw.vapasi.assigments;

public class Rover {
    private Plateau plateau;
    private Coordinates coordinates;
    private Direction direction;

    public Rover(Plateau plateau, Coordinates coordinates, Direction direction) {
        this.plateau = plateau;
        this.coordinates = coordinates;
        this.direction = direction;
        //TODO move as exception for initial condition
/*
        if (!(plateau.areCoordinatesWithInBounds(currentCoordinates))) {
            return "Initial position of Rover out of bounds";
        }
*/
    }

    public String processInstruction(String instructionString) {

        for (char commandString : instructionString.toCharArray()) {
            if (commandString == 'M') {
                Coordinates newCoordinates = this.coordinates.finalCoordinate(this.direction);
                if (!(plateau.areCoordinatesWithInBounds(newCoordinates))) {
                    return "Rover has fallen out of the Plateau";
                }
                this.coordinates = newCoordinates;
                continue;
            }
            this.direction = this.direction.rotateTo(commandString);
        }
        return finalPositionAndDirectionToString();
    }



    public Direction direction() {
        return direction;
    }

    public String finalPositionAndDirectionToString() {
        return coordinates.toString() + " " + direction;
    }
}
