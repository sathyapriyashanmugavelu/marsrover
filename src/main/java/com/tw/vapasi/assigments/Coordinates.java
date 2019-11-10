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
        if (direction == Direction.N) {
            yCoordinate++;
        }
        if (direction == Direction.S) {
            yCoordinate--;
        }
        if (direction == Direction.E) {
            xCoordinate++;
        }
        if (direction == Direction.W) {
            xCoordinate--;
        }

        Coordinates coordinates = new Coordinates(xCoordinate, yCoordinate);
        return (coordinates);
    }

    public boolean hasCoordinatesWithInBounds(int plateauXCoordinate, int plateauYCoordinate) {
        if (this.xCoordinate <= plateauXCoordinate && this.xCoordinate >= 0) {
            if (this.yCoordinate <= plateauYCoordinate && this.yCoordinate >= 0) {
                return true;
            }
        }
        return false;
    }

}
