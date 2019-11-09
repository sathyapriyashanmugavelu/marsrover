package com.tw.vapasi.assigments;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PlateauTest {
    @Test
    @DisplayName("Should the coordinates be with in the bounds when lower-left coordinates are (3,4) and upper right coordinates are (5,5) ")
    void shouldTheCoordinatesBeWithInTheBounds () {
        Plateau initializeCoordinates = new Plateau(5, 5);
        Plateau givenCoordinates = new Plateau(3, 4);
        assertEquals(true,initializeCoordinates.withInBounds(givenCoordinates));
    }

    @Test
    @DisplayName("Should the coordinates be out of the bounds when lower-left coordinates are (6,5) and upper right coordinates are (5,5) ")
    void shouldTheCoordinatesBeOutOfBoundsWhenXCoordinateIsOutOfBound () {
        Plateau initializeCoordinates = new Plateau(5, 5);
        Plateau givenCoordinates = new Plateau(6, 5);
        assertEquals(false,initializeCoordinates.withInBounds(givenCoordinates));
    }

    @Test
    @DisplayName("Should the coordinates be out of the bounds when x coordinate is negative")
    void shouldTheCoordinatesBeOutOfBoundsWhenXCoordinateIsNegative () {
        Plateau initializeCoordinates = new Plateau(5, 5);
        Plateau givenCoordinates = new Plateau(-2, 4);
        assertEquals(false,initializeCoordinates.withInBounds(givenCoordinates));
    }

}


