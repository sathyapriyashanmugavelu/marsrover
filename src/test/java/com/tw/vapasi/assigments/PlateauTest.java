package com.tw.vapasi.assigments;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PlateauTest {
    @Test
    @DisplayName("Should the coordinates be with in the bounds when lower-left coordinates are (3,4) and upper right coordinates are (5,5) ")
    void shouldTheCoordinatesBeWithInTheBounds() {
        Plateau upperRightCoordinates = new Plateau(5, 5);
        Plateau lowerLeftCoordinates = new Plateau(3, 4);
        assertEquals(true, upperRightCoordinates.withInBounds(lowerLeftCoordinates));
    }

    @Test
    @DisplayName("Should the coordinates be out of the bounds when lower-left coordinates are (6,5) and upper right coordinates are (5,5) ")
    void shouldTheCoordinatesBeOutOfBoundsWhenXCoordinateIsOutOfBound() {
        Plateau initializeCoordinates = new Plateau(5, 5);
        Plateau givenCoordinates = new Plateau(6, 5);
        assertEquals(false, initializeCoordinates.withInBounds(givenCoordinates));
    }

    @Test
    @DisplayName("Should the coordinates be out of the bounds when x coordinate is negative")
    void shouldTheCoordinatesBeOutOfBoundsWhenXCoordinateIsNegative() {
        Plateau initializeCoordinates = new Plateau(5, 5);
        Plateau givenCoordinates = new Plateau(-2, 4);
        assertEquals(false, initializeCoordinates.withInBounds(givenCoordinates));
    }

    @Test
    @DisplayName("Should the coordinates be out of the bounds when lower-left coordinates are (4,6) and upper right coordinates are (5,5) ")
    void shouldTheCoordinatesBeOutOfBoundsWhenYCoordinateIsOutOfBound() {
        Plateau initializeCoordinates = new Plateau(5, 5);
        Plateau givenCoordinates = new Plateau(4, 6);
        assertEquals(false, initializeCoordinates.withInBounds(givenCoordinates));
    }

    @Test
    @DisplayName("Should the coordinates be out of the bounds when y coordinate is negative")
    void shouldTheCoordinatesBeOutOfBoundsWhenYCoordinateIsNegative() {
        Plateau initializeCoordinates = new Plateau(5, 5);
        Plateau givenCoordinates = new Plateau(4, -4);
        assertEquals(false, initializeCoordinates.withInBounds(givenCoordinates));
    }

    @Test
    @DisplayName("Should the coordinates be out of the bounds when x and y coordinates are negative")
    void shouldTheCoordinatesBeOutOfBoundsWhenXAndYCoordinateAreNegative() {
        Plateau initializeCoordinates = new Plateau(5, 5);
        Plateau givenCoordinates = new Plateau(-4, -4);
        assertEquals(false, initializeCoordinates.withInBounds(givenCoordinates));
    }

    @Test
    @DisplayName("Should the coordinates be out of the bounds when x and y coordinates are out of bound")
    void shouldTheCoordinatesBeOutOfBoundsWhenXAndYCoordinateAreOutOfBound() {
        Plateau initializeCoordinates = new Plateau(5, 5);
        Plateau givenCoordinates = new Plateau(7, 9);
        assertEquals(false, initializeCoordinates.withInBounds(givenCoordinates));
    }
}


