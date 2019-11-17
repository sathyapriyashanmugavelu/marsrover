package com.tw.vapasi.assignments;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommandParserTest {
    @Test
    @DisplayName("Should the rover should not rotate or move when the string is null ")
    void shouldTheCommandListBeEmpty() {
        CommandParser parser = new CommandParser(" ");
        List<ICommand> commands = parser.toCommands();
        assertEquals(0, commands.size());
    }

    @Test
    @DisplayName("Should the rover be rotated to left when the command string is L")
    void shouldMapToRotateLeftCommandWhenL() {
        CommandParser parser = new CommandParser("L");
        List<ICommand> commands = parser.toCommands();
        assertTrue(commands.get(0) instanceof Left);
    }

    @Test
    @DisplayName("Should the rover be rotated to right when the command string is R")
    void shouldMapToRotateRightCommandWhenR() {
        CommandParser parser = new CommandParser("R");
        List<ICommand> commands = parser.toCommands();
        assertTrue(commands.get(0) instanceof Right);
    }

    @Test
    @DisplayName("Should the rover move when the command string is M")
    void shouldMapToMoveCommandWhenM() {
        CommandParser parser = new CommandParser("M");
        List<ICommand> commands = parser.toCommands();
        assertTrue(commands.get(0) instanceof Move);
    }

    @Test
    @DisplayName("Should the rover be mapped to the respective commands in order")
    void shouldTheRoverBeMappedToMultiCommandInOrder() {
        CommandParser parser = new CommandParser("LMR");
        List<ICommand> commands = parser.toCommands();
        assertTrue(commands.get(0) instanceof Left);
        assertTrue(commands.get(1) instanceof Move);
        assertTrue(commands.get(2) instanceof Right);
    }
}
