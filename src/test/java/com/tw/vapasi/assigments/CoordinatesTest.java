package com.tw.vapasi.assigments;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoordinatesTest {
    @Test
    @DisplayName("Should the y coordinate increment by one,when the move forward direction is NORTH")
    void shouldTheYCoordinateIncrementWhenMoveForwardNorth() throws RoverOutOfBoundException {
        Coordinates lowerLeftCoordinates = new Coordinates(3, 3);
        Coordinates coordinatesAfterMove = lowerLeftCoordinates.finalCoordinate(Direction.N);
        assertEquals("3 4", coordinatesAfterMove.toString());
    }

    @Test
    @DisplayName("Should the y coordinate decrements by one when the move forward instruction is given and the direction is SOUTH ")
    void shouldTheYCoordinateDecrementsWhenMoveForwardDirectionIsSOUTH() throws RoverOutOfBoundException {
        Coordinates lowerLeftCoordinates = new Coordinates(3, 4);
        Coordinates newCoordinateAfterMove = lowerLeftCoordinates.finalCoordinate(Direction.S);
        assertEquals("3 3", newCoordinateAfterMove.toString());
    }

    @Test
    @DisplayName("Should the x coordinate increment by one when the move forward instruction is given and the direction is EAST ")
    void shouldTheXCoordinateIncrementsWhenMoveForwardDirectionIsEAST() throws RoverOutOfBoundException {
        Coordinates lowerLeftCoordinates = new Coordinates(3, 4);
        Coordinates newCoordinateAfterMove = lowerLeftCoordinates.finalCoordinate(Direction.E);
        assertEquals("4 4", newCoordinateAfterMove.toString());
    }

    @Test
    @DisplayName("Should the x coordinate decrement by one when the move forward instruction is given and the direction is WEST ")
    void shouldTheXCoordinateDecrementsWhenMoveForwardDirectionIsEAST() throws RoverOutOfBoundException {
        Coordinates lowerLeftCoordinates = new Coordinates(3, 4);
        Coordinates newCoordinateAfterMove = lowerLeftCoordinates.finalCoordinate(Direction.W);
        assertEquals("2 4", newCoordinateAfterMove.toString());
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
