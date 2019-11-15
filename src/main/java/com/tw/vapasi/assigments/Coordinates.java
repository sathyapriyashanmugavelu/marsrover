package com.tw.vapasi.assigments;

public class Coordinates {
    public int xCoordinate;
    public int yCoordinate;

    Coordinates(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public String toString() {
        return xCoordinate + " " + yCoordinate;
    }

    public Coordinates finalCoordinate(Direction direction) {
        int newXCoordinate = this.xCoordinate;
        int newYCoordinate = this.yCoordinate;

        if (direction == Direction.N) {
            newYCoordinate++;
        }
        if (direction == Direction.S) {
            newYCoordinate--;
        }
        if (direction == Direction.E) {
            newXCoordinate++;
        }
        if (direction == Direction.W) {
            newXCoordinate--;
        }

        Coordinates coordinates = new Coordinates(newXCoordinate, newYCoordinate);
        return coordinates;
    }

    public boolean hasCoordinatesWithinBounds(Coordinates plateauCoordinate) {
        if (this.xCoordinate <= plateauCoordinate.xCoordinate && this.xCoordinate >= 0) {
            if (this.yCoordinate <= plateauCoordinate.yCoordinate && this.yCoordinate >= 0) {
                return true;
            }
        }
        return false;
    }

}
