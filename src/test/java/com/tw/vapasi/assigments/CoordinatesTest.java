package com.tw.vapasi.assigments;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoordinatesTest {
    @Test
    @DisplayName("XCoordinate value should be incremented by one")
    public void shouldXCoordinatedBeIncremented() {
        Coordinates InitialCoordinates = new Coordinates(2,3);
        InitialCoordinates = InitialCoordinates.newCoordinatesForStepValue(1, 0);
        assertEquals("3 3", InitialCoordinates.toString());
    }

    @Test
    @DisplayName("XCoordinate value should be decremented by one")
    public void shouldXCoordinatedBeDecremented() {
        Coordinates InitialCoordinates = new Coordinates(2,3);
        InitialCoordinates = InitialCoordinates.newCoordinatesForStepValue(-1, 0);
        assertEquals("1 3", InitialCoordinates.toString());
    }

    @Test
    @DisplayName("YCoordinate value should be incremented by one")
    public void shouldYCoordinatedBeIncremented() {
        Coordinates InitialCoordinates = new Coordinates(2,3);
        InitialCoordinates = InitialCoordinates.newCoordinatesForStepValue(0, 1);
        assertEquals("2 4", InitialCoordinates.toString());
    }

    @Test
    @DisplayName("YCoordinate value should be decremented by one")
    public void shouldYCoordinatedBeDecremented() {
        Coordinates InitialCoordinates = new Coordinates(2,3);
        InitialCoordinates = InitialCoordinates.newCoordinatesForStepValue(0, -1);
        assertEquals("2 2", InitialCoordinates.toString());
    }

    @Test
    @DisplayName("Should the coordinates be out of the bounds when x coordinates is negative")
    void shouldTheCoordinatesBeOutOfBoundsWhenXCoordinateIsNegative() {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Coordinates coordinates = new Coordinates(-4, 3);
        assertEquals(false, coordinates.isCoordinatesWithinBounds(initialCoordinates));
    }

    @Test
    @DisplayName("Should the coordinates be out of the bounds when xCoordinate is greater than initial xCoordinate")
    void shouldTheCoordinatesBeOutOfBoundsWhenXCoordinateOutOfBound() {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Coordinates coordinates = new Coordinates(6, 4);
        assertEquals(false, coordinates.isCoordinatesWithinBounds(initialCoordinates));
    }

    @Test
    @DisplayName("Should the coordinates be out of the bounds when y coordinates is negative")
    void shouldTheCoordinatesBeOutOfBoundsWhenYCoordinateIsNegative() {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Coordinates coordinates = new Coordinates(2, -4);
        assertEquals(false, coordinates.isCoordinatesWithinBounds(initialCoordinates));
    }

    @Test
    @DisplayName("Should the coordinates be out of the bounds when yCoordinate is greater than initial xCoordinate")
    void shouldTheCoordinatesBeOutOfBoundsWhenYCoordinateOutOfBound() {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Coordinates coordinates = new Coordinates(2, 9);
        assertEquals(false, coordinates.isCoordinatesWithinBounds(initialCoordinates));
    }

    @Test
    @DisplayName("Should the coordinates be out of the bounds when x and y coordinates are out of bound")
    void shouldTheCoordinatesBeOutOfBoundsWhenXAndYCoordinateAreOutOfBound() {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Coordinates coordinates = new Coordinates(6, 6);
        assertEquals(false, coordinates.isCoordinatesWithinBounds(initialCoordinates));
    }

    @Test
    @DisplayName("Should the coordinates be out of the bounds when x and y coordinates are negative")
    void shouldTheCoordinatesBeOutOfBoundsWhenXAndYCoordinateAreNegative() {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Coordinates coordinates = new Coordinates(-4, -4);
        assertEquals(false, coordinates.isCoordinatesWithinBounds(initialCoordinates));
    }
}
