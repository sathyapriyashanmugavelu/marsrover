package com.tw.vapasi.assigments;

public enum Direction {
    N(0,1),
    E(1,0),
    S(0,-1),
    W(-1,0);

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
    private final int stepOnXAxis;
    private final int stepOnYAxis;

    Direction(final int stepOnXAxis, final int stepOnYAxis) {
        this.stepOnXAxis = stepOnXAxis;
        this.stepOnYAxis = stepOnYAxis;
    }

    public int stepForXAxis() {
        return this.stepOnXAxis;
    }

    public int stepForYAxis() {
        return this.stepOnYAxis;
    }

    public Direction rotateTo(char instructionChar) {
        return instructionChar == 'L' ? left : right;
    }
}
