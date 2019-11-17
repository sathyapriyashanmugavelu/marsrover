package com.tw.vapasi.assigments;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlateauTest {
    @Test
    @DisplayName("Should the coordinates be with in the bounds when lower-left coordinates are (3,4) and upper right coordinates are (5,5) ")
    void shouldTheCoordinatesBeWithInTheBounds() {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Plateau plateauCoordinates = new Plateau(initialCoordinates);
        Coordinates coordinates = new Coordinates(3, 4);
        assertEquals(true, plateauCoordinates.areCoordinatesWithInBounds(coordinates));
    }

    @Test
    @DisplayName("Should the coordinates be out of the bounds when x coordinate is out of bound ")
    void shouldTheCoordinatesBeOutOfBoundsWhenXCoordinateIsOutOfBound() {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Plateau plateauCoordinates = new Plateau(initialCoordinates);
        Coordinates coordinates = new Coordinates(6, 5);
        assertEquals(false, plateauCoordinates.areCoordinatesWithInBounds(coordinates));
    }

    @Test
    @DisplayName("Should the coordinates be out of the bounds when x coordinate is negative")
    void shouldTheCoordinatesBeOutOfBoundsWhenXCoordinateIsNegative() {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Plateau plateauCoordinates = new Plateau(initialCoordinates);
        Coordinates coordinates = new Coordinates(-2, 4);
        assertEquals(false, plateauCoordinates.areCoordinatesWithInBounds(coordinates));
    }

    @Test
    @DisplayName("Should the coordinates be out of the bounds when y coordinate is out of bound ")
    void shouldTheCoordinatesBeOutOfBoundsWhenYCoordinateIsOutOfBound() {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Plateau plateauCoordinates = new Plateau(initialCoordinates);
        Coordinates coordinates = new Coordinates(4, 6);
        assertEquals(false, plateauCoordinates.areCoordinatesWithInBounds(coordinates));
    }

    @Test
    @DisplayName("Should the coordinates be out of the bounds when y coordinate is negative")
    void shouldTheCoordinatesBeOutOfBoundsWhenYCoordinateIsNegative() {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Plateau plateauCoordinates = new Plateau(initialCoordinates);
        Coordinates coordinates = new Coordinates(4, -4);
        assertEquals(false, plateauCoordinates.areCoordinatesWithInBounds(coordinates));
    }

    @Test
    @DisplayName("Should the coordinates be out of the bounds when x and y coordinates are negative")
    void shouldTheCoordinatesBeOutOfBoundsWhenXAndYCoordinateAreNegative() {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Plateau plateauCoordinates = new Plateau(initialCoordinates);
        Coordinates coordinates = new Coordinates(-4, -4);
        assertEquals(false, plateauCoordinates.areCoordinatesWithInBounds(coordinates));
    }

    @Test
    @DisplayName("Should the coordinates be out of the bounds when x and y coordinates are out of bound")
    void shouldTheCoordinatesBeOutOfBoundsWhenXAndYCoordinateAreOutOfBound() {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Plateau plateauCoordinates = new Plateau(initialCoordinates);
        Coordinates coordinates = new Coordinates(6, 6);
        assertEquals(false, plateauCoordinates.areCoordinatesWithInBounds(coordinates));
    }
}


