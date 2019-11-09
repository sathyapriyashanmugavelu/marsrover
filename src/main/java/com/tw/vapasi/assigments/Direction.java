package com.tw.vapasi.assigments;

public enum Direction {
    NORTH, EAST, SOUTH, WEST;

    static {
        NORTH.left = WEST;
        NORTH.right = EAST;
        EAST.left = NORTH;
        EAST.right = SOUTH;
        SOUTH.left = EAST;
        SOUTH.right = WEST;
        WEST.left = SOUTH;
        WEST.right = NORTH;
        NORTH.move = NORTH;
        EAST.move = EAST;
        SOUTH.move = SOUTH;
        WEST.move = WEST;

    }

    private Direction left;
    private Direction right;
    private Direction move;

    public Direction rotateTo(String instructionChar) {
        if (instructionChar.equals("M")) {
            return move;
        }
        return instructionChar.equals("L") ? left : right;
    }
}
