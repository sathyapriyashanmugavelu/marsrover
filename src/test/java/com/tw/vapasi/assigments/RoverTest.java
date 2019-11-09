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
        Rover rover = new Rover(plateau, startingCoordinates, Direction.NORTH);

        assertEquals(Direction.WEST, rover.processInstruction("L"));
    }

    @Test
    @DisplayName("Should the direction not be SOUTH, when the direction is EAST and instruction to turn is left ")
    void shouldTheDirectionNotBeSouthWhenEastRotatesLeft() {
        Plateau plateau = new Plateau(5, 5);
        Coordinates startingCoordinates = new Coordinates(2, 2);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.EAST);

        assertNotEquals(Direction.SOUTH, rover.processInstruction("L"));
    }

    @Test
    @DisplayName("Should the direction be EAST, when the direction is NORTH and instruction to turn is right ")
    void shouldTheDirectionBeEastWhenNorthRotatesRight() {
        Plateau plateau = new Plateau(5, 5);
        Coordinates startingCoordinates = new Coordinates(3, 4);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.NORTH);

        assertEquals(Direction.EAST, rover.processInstruction("R"));
    }


}