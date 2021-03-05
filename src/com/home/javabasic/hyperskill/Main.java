package com.home.javabasic.hyperskill;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        while (true) {
            game.move();
            if (game.getState() == Field.FieldState.DRAW
                || game.getState() == Field.FieldState.O_WINS
                || game.getState() == Field.FieldState.X_WINS) {
                break;
            }
        }
    }
}
