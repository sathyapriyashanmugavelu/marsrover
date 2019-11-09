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
        Direction currentDirection = direction.rotateTo(instructionString);
        return currentDirection;
    }

}
