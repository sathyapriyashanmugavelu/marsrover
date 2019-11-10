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

    }

    private Direction left;
    private Direction right;

    public Direction rotateTo(char instructionChar) {
        return instructionChar == 'L' ? left : right;
    }
}
