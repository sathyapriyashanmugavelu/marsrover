package com.tw.vapasi.assignments;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeftCommandTest {
    @Test
    @DisplayName("Should the direction of Rover be West, when the direction is North and instruction to turn is left ")
    void shouldTheRoverRotateToWestWhenNorth() throws RoverOutOfBoundException, RoverNotDeployedInPlateauException {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Plateau plateau = new Plateau(initialCoordinates);
        Coordinates startingCoordinates = new Coordinates(2, 2);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.N);
        rover.processInstruction("L");
        assertEquals("2 2 W", rover.finalPositionAndDirectionToString());
    }

    @Test
    @DisplayName("Should the direction of Rover be South, when the direction is West and instruction to turn is left ")
    void shouldTheRoverRotateToSouthWhenWest() throws RoverOutOfBoundException, RoverNotDeployedInPlateauException {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Plateau plateau = new Plateau(initialCoordinates);
        Coordinates startingCoordinates = new Coordinates(2, 2);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.W);
        rover.processInstruction("L");
        assertEquals("2 2 S", rover.finalPositionAndDirectionToString());
    }

    @Test
    @DisplayName("Should the direction of Rover be East, when the direction is South and instruction to turn is left ")
    void shouldTheRoverRotateToEastWhenSouth() throws RoverOutOfBoundException, RoverNotDeployedInPlateauException {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Plateau plateau = new Plateau(initialCoordinates);
        Coordinates startingCoordinates = new Coordinates(2, 2);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.S);
        rover.processInstruction("L");
        assertEquals("2 2 E", rover.finalPositionAndDirectionToString());
    }

    @Test
    @DisplayName("Should the direction of Rover be North, when the direction is East and instruction to turn is left ")
    void shouldTheRoverRotateToNorthWhenEast() throws RoverOutOfBoundException, RoverNotDeployedInPlateauException {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Plateau plateau = new Plateau(initialCoordinates);
        Coordinates startingCoordinates = new Coordinates(2, 2);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.E);
        rover.processInstruction("L");
        assertEquals("2 2 N", rover.finalPositionAndDirectionToString());
    }
}
