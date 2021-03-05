package com.home.javabasic.hyperskill;

public class Field {
    private static final int SIZE = 3;
    private static final int X = 1;
    private static final int O = -1;
    private static final int BLANK = 0;

    private int[][] field = new int[SIZE][SIZE];
    private FieldState state;

    public Field() {
    }

    public Field(String initialState) {
        int charCount = 0;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                switch (initialState.charAt(charCount++)) {
                    case 'X':
                        field[i][j] = X;
                        break;
                    case 'O':
                        field[i][j] = O;
                        break;
                    case '_':
                        field[i][j] = BLANK;
                        break;
                }
            }
        }
        updateState();
    }

    public boolean isOccupied(int[] coordinates) {
        return field[coordinates[0]][coordinates[1]] != 0;
    }

    public void setX(int[] coordinates) {
        set(coordinates, true);
    }

    public void setO(int[] coordinates) {
        set(coordinates, false);
    }

    public boolean isXMove() {
        int count = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                count += field[i][j];
            }
        }
        return count < 1;
    }

    public FieldState getState() {
        return state;
    }

    private void set(int[] coordinates, boolean x) {
        field[coordinates[0]][coordinates[1]] = x ? X : O;
        updateState();
    }


    private void updateState() {
        int sumAllFields = 0;
        int[][] sums = {
                {0, 0, 0}, // rows
                {0, 0, 0}, // columms
                {0, 0} // diagonals
        };

        boolean hasEmptyCells = false;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                int f = field[i][j];
                sumAllFields += f;
                sums[0][i] += f;
                sums[1][j] += f;

                if (i == j) {
                    sums[2][0] += f;
                }
                if (i + j == 2) {
                    sums[2][1] += f;
                }
                if (f == 0) {
                    hasEmptyCells = true;
                }
            }
        }

        if (Math.abs(sumAllFields) > 1) {
            state = FieldState.IMPOSSIBLE;
            return;
        }

        boolean winX = false;
        boolean winO = false;
        for (int[] sum : sums) {
            for (int s : sum) {
                if (!winX && s == 3) {
                    winX = true;
                } else if(!winO && s == -3) {
                    winO = true;
                }

                if (winO && winX) {
                    state = FieldState.IMPOSSIBLE;
                    return;
                }
            }
        }

        if (winX) {
            state = FieldState.X_WINS;
            return;
        }
        if (winO) {
            state = FieldState.O_WINS;
            return;
        }

        if (!hasEmptyCells) {
            state = FieldState.DRAW;
            return;
        }

        state = FieldState.NOT_FINISHED;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("---------\n");
        for (int i = 0; i < SIZE; i++) {
            sb.append('|').append(' ');
            for (int j = 0; j < SIZE; j++) {
                switch (field[i][j]) {
                    case BLANK:
                        sb.append(' ');
                        break;
                    case X:
                        sb.append('X');
                        break;
                    case O:
                        sb.append('O');
                        break;
                }
                sb.append(' ');
            }
            sb.append('|').append('\n');
        }
        sb.append("---------\n");
        return sb.toString();
    }

    enum FieldState {
        IMPOSSIBLE("Impossible"),
        NOT_FINISHED("Game not finished"),
        X_WINS("X wins"),
        O_WINS("O wins"),
        DRAW("Draw");

        private String msg;
        FieldState(String msg) {
            this.msg = msg;
        }


        @Override
        public String toString() {
            return msg;
        }
    }
}
