package com.tw.vapasi.assigments;

public enum Direction {
    N, E, S, W;

    static {
        N.left = W;
        N.right = E;
        E.left = N;
        E.right = S;
        S.left = E;
        S.right = W;
        W.left = S;
        W.right = N;
    }

    private Direction left;
    private Direction right;

    public Direction rotateTo(char instructionChar) {
        return instructionChar == 'L' ? left : right;
    }
}
