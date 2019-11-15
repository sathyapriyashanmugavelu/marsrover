package com.tw.vapasi.assigments;

public class Plateau {
    public final Coordinates plateauCoordinates;

    Plateau(Coordinates plateauCoordinates) {
        this.plateauCoordinates = plateauCoordinates;
    }

    public boolean areCoordinatesWithInBounds(Coordinates coordinates) {
        return coordinates.hasCoordinatesWithinBounds(plateauCoordinates);
    }

    public String plateauToString() {
        return plateauCoordinates.xCoordinate + " " + plateauCoordinates.yCoordinate;
    }
}
