package com.tw.vapasi.assigments;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RoverTest {
    @Test
    @DisplayName("Should the direction be WEST, when the direction is NORTH and instruction to turn is left ")
    void shouldTheDirectionBeWestWhenNorthRotatesLeft() {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Plateau plateau = new Plateau(initialCoordinates);
        Coordinates startingCoordinates = new Coordinates(3, 4);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.N);
        rover.processInstruction("L");
        assertEquals(Direction.W, rover.direction());
    }

    @Test
    @DisplayName("Should the direction not be SOUTH, when the direction is EAST and instruction to turn is left ")
    void shouldTheDirectionNotBeSouthWhenEastRotatesLeft() {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Plateau plateau = new Plateau(initialCoordinates);
        Coordinates startingCoordinates = new Coordinates(2, 2);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.E);
        rover.processInstruction("L");
        assertNotEquals(Direction.S, rover.direction());
    }

    @Test
    @DisplayName("Should the direction be EAST, when the direction is NORTH and instruction to turn is right ")
    void shouldTheDirectionBeEastWhenNorthRotatesRight() {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Plateau plateau = new Plateau(initialCoordinates);
        Coordinates startingCoordinates = new Coordinates(3, 4);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.N);
        rover.processInstruction("R");
        assertEquals(Direction.E, rover.direction());
    }

    @Test
    @DisplayName("Should the direction not be NORTH, when the direction is EAST and instruction to turn is right ")
    void shouldTheDirectionNotBeNorthWhenEastRotatesRight() {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Plateau plateau = new Plateau(initialCoordinates);
        Coordinates startingCoordinates = new Coordinates(2, 2);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.E);
        rover.processInstruction("L");
        assertNotEquals(Direction.S, rover.direction());
    }

    @Test
    @DisplayName("Should the instruction is to MoveForward (M), then return the same direction ")
    void shouldTheDirectionBeTheSameWhenM() {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Plateau plateau = new Plateau(initialCoordinates);
        Coordinates startingCoordinates = new Coordinates(2, 2);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.E);
        rover.processInstruction("M");
        assertEquals(Direction.E, rover.direction());
    }

    @Test
    @DisplayName("Should the final direction be SOUTH when the instruction is 'LML'")
    void shouldTheFinalDirectionBeSouthWhenTheStringIsLML() {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Plateau plateau = new Plateau(initialCoordinates);
        Coordinates startingCoordinates = new Coordinates(2, 2);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.N);
        rover.processInstruction("LML");
        assertEquals(Direction.S, rover.direction());
    }

    @Test
    @DisplayName("Should the final direction and coordinates be SOUTH (1 3 N),when the instruction is 'LMLMLMLMM' and the input is (1 2 N)")
    void shouldTheFinalPositionAndDirectionBeEqual() {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Plateau plateau = new Plateau(initialCoordinates);
        Coordinates startingCoordinates = new Coordinates(1, 2);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.N);
        rover.processInstruction("LMLMLMLMM");
        assertEquals("1 3 N", rover.finalPositionAndDirectionToString());
    }

    @Test
    @DisplayName("Should the initial rover position out of bound,Stop processing the instructions and display error message")
    void shouldTheInitialRoverCoordinatesOutOfBoundDisplayMessage() {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Plateau plateau = new Plateau(initialCoordinates);
        Coordinates startingCoordinates = new Coordinates(-1, 2);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.N);
        assertEquals("Initial position of Rover out of bounds", rover.processInstruction("LMLMLMLMM"));
    }

    @Test
    @DisplayName("Should display error message and stop processing the instruction when the rover position is out of bound")
    void shouldTheRoverCoordinatesOutOfBoundDisplayMessage() {
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Plateau plateau = new Plateau(initialCoordinates);
        Coordinates startingCoordinates = new Coordinates(2, 5);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.N);
        assertEquals("Rover has fallen out of the Plateau", rover.processInstruction("MM"));
    }
}
