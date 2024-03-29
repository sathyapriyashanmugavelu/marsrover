package com.tw.vapasi.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandParser {
    private String commandString;
    public static Rover rover;

    public CommandParser(String instructionString) {
        this.commandString = instructionString;
    }

    private static Map<Character, ICommand> commandMap = new HashMap<Character, ICommand>() {{
        put('L', new LeftCommand());
        put('R', new RightCommand());
        put('M', new MoveCommand());
    }};

    public List<ICommand> toCommands() {
        if ((commandString == null) && (commandString.length() == 0)) {
            return new ArrayList<ICommand>();
        }
        List<ICommand> commands = new ArrayList<>();
        for (Character commandChar : commandString.trim().toUpperCase().toCharArray()) {
            ICommand mapCommand = lookUpCommandMap(commandChar);
            commands.add(mapCommand);
        }
        return commands;
    }

    private ICommand lookUpCommandMap(Character commandChar) {
        return commandMap.get(commandChar);
    }
}
