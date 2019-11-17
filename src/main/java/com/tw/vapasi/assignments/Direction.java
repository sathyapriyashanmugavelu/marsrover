package com.tw.vapasi.assignments;

public enum Direction {
    N(0, 1) {
        @Override
        public Direction right() {
            return E;
        }

        @Override
        public Direction left() {
            return W;
        }
    },
    E(1, 0) {
        @Override
        public Direction right() {
            return S;
        }

        @Override
        public Direction left() {
            return N;
        }
    },
    S(0, -1) {
        @Override
        public Direction right() {
            return W;
        }

        @Override
        public Direction left() {
            return E;
        }
    },
    W(-1, 0) {
        @Override
        public Direction right() {
            return N;
        }

        @Override
        public Direction left() {
            return S;
        }
    };

    public abstract Direction right();
    public abstract Direction left();

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

}
