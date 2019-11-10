package com.tw.vapasi.assigments;

public class Plateau {
    public int xCoordinate;
    public int yCoordinate;

    Plateau(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public boolean areCoordinatesWithInBounds(Coordinates coordinates) {
        return coordinates.hasCoordinatesWithInBounds(xCoordinate, yCoordinate);
    }

    public String plateauToString() {
        return xCoordinate + " " + yCoordinate;
    }
}
