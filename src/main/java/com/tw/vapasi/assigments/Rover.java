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

    public Direction processInstruction(String instructionString) {
        Direction currentDirection = this.direction;
        for (int i = 0; i < instructionString.length(); i++) {
            if (instructionString.charAt(i) == 'M') {
                currentDirection = currentDirection;
            } else {
                currentDirection = currentDirection.rotateTo(instructionString.charAt(i));
            }
        }
        return currentDirection;
    }
}
