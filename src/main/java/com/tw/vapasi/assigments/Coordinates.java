package com.tw.vapasi.assigments;

public class Coordinates {
    private int xCoordinate;
    private int yCoordinate;

    Coordinates(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public String toString() {
        return xCoordinate + " " + yCoordinate;
    }

    public Coordinates finalCoordinate(Direction direction) {
        if (direction == Direction.NORTH) {
            yCoordinate++;
        }
        if (direction == Direction.SOUTH) {
            yCoordinate--;
        }
        if (direction == Direction.EAST) {
            xCoordinate++;
        }
        if (direction == Direction.WEST) {
            xCoordinate--;
        }

        Coordinates coordinates = new Coordinates(xCoordinate, yCoordinate);
        return (coordinates);
    }
}
