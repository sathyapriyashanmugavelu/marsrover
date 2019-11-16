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

    public Coordinates newCoordinatesForStepSize(final int xCoordinateStepValue, final int yCoordinateStepValue) {
        return new Coordinates(xCoordinate+xCoordinateStepValue, yCoordinate+yCoordinateStepValue);
    }

    public boolean isCoordinatesWithinBounds(Coordinates plateauCoordinate) {
        if (this.xCoordinate <= plateauCoordinate.xCoordinate && this.xCoordinate >= 0) {
            if (this.yCoordinate <= plateauCoordinate.yCoordinate && this.yCoordinate >= 0) {
                return true;
            }
        }
        return false;
    }
}
