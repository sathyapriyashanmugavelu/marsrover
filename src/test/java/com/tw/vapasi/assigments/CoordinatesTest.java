package com.tw.vapasi.assigments;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CoordinatesTest {
    @Test
    @DisplayName("Should the coordinates increment by one when the move forward instruction is given and the direction is NORTH ")
    void shouldTheYCoordinatesIncrementWhenMoveForwardDirectionIsNorth() {
        Coordinates lowerLeftCoordinates = new Coordinates(3, 4);
        Coordinates newCoordinateAfterMove= lowerLeftCoordinates.finalCoordinate(Direction.NORTH);
        assertEquals("3 5",newCoordinateAfterMove.toString());
    }
}
