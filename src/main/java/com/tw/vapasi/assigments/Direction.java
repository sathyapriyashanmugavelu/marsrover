package com.tw.vapasi.assigments;

public enum Direction {
    N(0, 1),
    E(1, 0),
    S(0, -1),
    W(-1, 0);

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
    private final int stepValueOnXAxis;
    private final int stepValueOnYAxis;

    Direction(final int stepValueOnXAxis, final int stepValueOnYAxis) {
        this.stepValueOnXAxis = stepValueOnXAxis;
        this.stepValueOnYAxis = stepValueOnYAxis;
    }

    public int stepValueForXAxis() {
        return this.stepValueOnXAxis;
    }

    public int stepValueForYAxis() {
        return this.stepValueOnYAxis;
    }

    public Direction rotateTo(char instructionChar) {
        return instructionChar == 'L' ? left : right;
    }
}
