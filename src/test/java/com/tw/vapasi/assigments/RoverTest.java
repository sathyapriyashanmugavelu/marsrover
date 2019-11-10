package com.tw.vapasi.assigments;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RoverTest {
    @Test
    @DisplayName("Should the direction be WEST, when the direction is NORTH and instruction to turn is left ")
    void shouldTheDirectionBeWestWhenNorthRotatesLeft() {
        Plateau plateau = new Plateau(5, 5);
        Coordinates startingCoordinates = new Coordinates(3, 4);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.N);
        rover.processInstruction("L");
        assertEquals(Direction.W, rover.finalDirection());
    }

    @Test
    @DisplayName("Should the direction not be SOUTH, when the direction is EAST and instruction to turn is left ")
    void shouldTheDirectionNotBeSouthWhenEastRotatesLeft() {
        Plateau plateau = new Plateau(5, 5);
        Coordinates startingCoordinates = new Coordinates(2, 2);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.E);
        rover.processInstruction("L");
        assertNotEquals(Direction.S, rover.finalDirection());
    }

    @Test
    @DisplayName("Should the direction be EAST, when the direction is NORTH and instruction to turn is right ")
    void shouldTheDirectionBeEastWhenNorthRotatesRight() {
        Plateau plateau = new Plateau(5, 5);
        Coordinates startingCoordinates = new Coordinates(3, 4);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.N);
        rover.processInstruction("R");
        assertEquals(Direction.E, rover.finalDirection());
    }

    @Test
    @DisplayName("Should the direction not be NORTH, when the direction is EAST and instruction to turn is right ")
    void shouldTheDirectionNotBeNorthWhenEastRotatesRight() {
        Plateau plateau = new Plateau(5, 5);
        Coordinates startingCoordinates = new Coordinates(2, 2);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.E);
        rover.processInstruction("L");
        assertNotEquals(Direction.S, rover.finalDirection());
    }

    @Test
    @DisplayName("Should the instruction is to MoveForward (M), then return the same direction ")
    void shouldTheDirectionBeTheSameWhenM() {
        Plateau plateau = new Plateau(5, 5);
        Coordinates startingCoordinates = new Coordinates(2, 2);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.E);
        rover.processInstruction("M");
        assertEquals(Direction.E, rover.finalDirection());
    }

    @Test
    @DisplayName("Should the final direction be SOUTH when the instruction is 'LML'")
    void shouldTheFinalDirectionBeSouthWhenTheStringIsLML() {
        Plateau plateau = new Plateau(5, 5);
        Coordinates startingCoordinates = new Coordinates(2, 2);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.N);
        rover.processInstruction("LML");
        assertEquals(Direction.S, rover.finalDirection());
    }

    @Test
    @DisplayName("Should the final direction and coordinates be SOUTH (1 3 N),when the instruction is 'LMLMLMLMM' and the input is (1 2 N)")
    void shouldTheFinalPositionAndDirectionBeEqual() {
        Plateau plateau = new Plateau(5, 5);
        Coordinates startingCoordinates = new Coordinates(1, 2);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.N);
        rover.processInstruction("LMLMLMLMM");
        assertEquals("1 3 N", rover.finalPositionAndDirectionToString());
    }

    @Test
    @DisplayName("Should the initial rover position out of bound,Stop processing the instructions and display error message")
    void shouldTheInitialRoverCoordinatesOutOfBoundDisplayMessage() {
        Plateau plateau = new Plateau(5, 5);
        Coordinates startingCoordinates = new Coordinates(-1, 2);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.N);
        assertEquals("Initial position of Rover out of bounds", rover.processInstruction("LMLMLMLMM"));
    }
}
