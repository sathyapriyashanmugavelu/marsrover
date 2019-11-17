package com.tw.vapasi.assignments;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoveCommandTest {
    @Test
    @DisplayName("When the instruction is to MoveForward with the direction as N, then return the same direction and increment the y axis by 1")
    void shouldTheRoverMoveNorth() throws RoverNotDeployedInPlateauException, RoverOutOfBoundException {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Plateau plateau = new Plateau(initialCoordinates);
        Coordinates startingCoordinates = new Coordinates(1, 2);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.N);
        rover.processInstruction("M");
        assertEquals("1 3 N", rover.finalPositionAndDirectionToString());
    }

    @Test
    @DisplayName("When the instruction is to MoveForward with the direction as S, then return the same direction and decrement the y axis by 1")
    void shouldRoverMoveSouth() throws RoverNotDeployedInPlateauException, RoverOutOfBoundException {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Plateau plateau = new Plateau(initialCoordinates);
        Coordinates startingCoordinates = new Coordinates(1, 2);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.S);
        rover.processInstruction("M");
        assertEquals("1 1 S", rover.finalPositionAndDirectionToString());
    }

    @Test
    @DisplayName("When the instruction is to MoveForward with the direction as E, then return the same direction and increment the x axis by 1")
    void shouldTheRoverMoveEast() throws RoverNotDeployedInPlateauException, RoverOutOfBoundException {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Plateau plateau = new Plateau(initialCoordinates);
        Coordinates startingCoordinates = new Coordinates(1, 2);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.E);
        rover.processInstruction("M");
        assertEquals("2 2 E", rover.finalPositionAndDirectionToString());
    }

    @Test
    @DisplayName("When the instruction is to MoveForward with the direction as W, then return the same direction and decrement the x axis by 1")
    void shouldTheRoverMoveWest() throws RoverNotDeployedInPlateauException, RoverOutOfBoundException {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Plateau plateau = new Plateau(initialCoordinates);
        Coordinates startingCoordinates = new Coordinates(2, 2);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.W);
        rover.processInstruction("M");
        assertEquals("1 2 W", rover.finalPositionAndDirectionToString());
    }
}
