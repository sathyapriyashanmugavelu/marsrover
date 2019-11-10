package com.tw.vapasi.assigments;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CoordinatesTest {
    @Test
    @DisplayName("Should the y coordinate increment by one,when the move forward direction is NORTH")
    void shouldTheYCoordinateIncrementWhenMoveForwardNorth() {
        Coordinates lowerLeftCoordinates = new Coordinates(3, 3);
        Coordinates coordinatesAfterMove = lowerLeftCoordinates.finalCoordinate(Direction.NORTH);
        assertEquals("3 4",coordinatesAfterMove.toString());
    }

    @Test
    @DisplayName("Should the y coordinate decrements by one when the move forward instruction is given and the direction is SOUTH ")
    void shouldTheYCoordinatesDecrementsWhenMoveForwardDirectionIsSOUTH() {
        Coordinates lowerLeftCoordinates = new Coordinates(3, 4);
        Coordinates newCoordinateAfterMove= lowerLeftCoordinates.finalCoordinate(Direction.SOUTH);
        assertEquals("3 3",newCoordinateAfterMove.toString());
    }
}
