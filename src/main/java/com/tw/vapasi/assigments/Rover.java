package com.tw.vapasi.assigments;

public class Rover {
    private Plateau plateau;
    private Coordinates coordinates;
    private Direction direction;

    public Rover(Plateau plateau, Coordinates coordinates, Direction direction) {
        this.plateau = plateau;
        this.coordinates = coordinates;
        this.direction = direction;
    }

    public String processInstruction(String instructionString) {
        Direction currentDirection = this.direction;
        Plateau currentRoverPosition = this.plateau;
        Coordinates positionAfterMove = this.coordinates;

        if (!(plateau.areCoordinatesWithInBounds(positionAfterMove))) {
            return "Initial position of Rover out of bounds";
        }

        for (char commandString : instructionString.toCharArray()) {
            if (commandString == 'M') {
                positionAfterMove = positionAfterMove.finalCoordinate(currentDirection);
                if (!(plateau.areCoordinatesWithInBounds(positionAfterMove))) {
                    return "Rover has fallen out of the Plateau";
                }
                continue;
            }
            currentDirection = currentDirection.rotateTo(commandString);
        }
        finalPositionAndDirection(positionAfterMove, currentDirection);
        return finalPositionAndDirectionToString();
    }

    public void finalPositionAndDirection(Coordinates positionAfterMove, Direction currentDirection) {
        this.coordinates = positionAfterMove;
        this.direction = currentDirection;
    }

    public Direction finalDirection() {
        return direction;
    }

    public String finalPositionAndDirectionToString() {
        return coordinates.toString() + " " + direction;
    }
}
