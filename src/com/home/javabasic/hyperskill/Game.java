package com.home.javabasic.hyperskill;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private static final String CELL_IS_OCCUPIED = "This cell is occupied! Choose another one!";
    private static final String SHOULD_ENTER_NUMBERS = "You should enter numbers!";
    private static final String OVER_BOUND = "Coordinates should be from 1 to 3 !";
    private static final String MAKING_MOVE_CONTINUOUS = "Making move level \"easy\"";

    private Scanner scanner = new Scanner(System.in);

    private Field field;

    public Game() {
        createField();
    }

    private void createField() {
        field = new Field();
        printField();
    }

    private void printField() {
        System.out.print(field);
    }

    private void printGameState() {
        switch (field.getState()) {
            case DRAW:
            case O_WINS:
            case X_WINS:
                System.out.println(field.getState());
                break;
        }
    }

    public Field.FieldState getState() {
        return field.getState();
    }

    public void move() {
        int[] coordinates = new int[2];
        if (field.isXMove()) {
            coordinates = getCoordinates();
            field.setX(coordinates);
        } else {
            Random rd = new Random();
            System.out.println(MAKING_MOVE_CONTINUOUS);
            do {
                for (int i = 0; i < 2; i++) {
                    coordinates[i] = rd.nextInt(3) + 1;
                }
            } while (!checkOccupied(coordinates));
            field.setO(coordinates);
        }
        printField();
        printGameState();
    }

    private boolean checkOccupied(int[] coor) {
        coor[0]--;
        coor[1]--;
        if (field.isOccupied(coor)) {
            return false;
        }
        return true;
    }

    private int[] getCoordinates() {
        int[] coordinates = new int[2];
        do {
            System.out.print("Enter the coordinates: ");
        } while (!inputCheck(coordinates));
        return coordinates;
    }

    private boolean inputCheck(int[] coordinates) {
        for (int i = 0; i < 2; i++) {
            String s1 = scanner.next();
            if (!s1.matches("\\d+")) {
                System.out.println(SHOULD_ENTER_NUMBERS);
                return false;
            }
            coordinates[i] = Integer.valueOf(s1);
        }

        for (int i : coordinates) {
            if (i < 1 || i > 3) {
                System.out.println(OVER_BOUND);
                return false;
            }
        }

        if (!checkOccupied(coordinates)) {
            System.out.println(CELL_IS_OCCUPIED);
            return false;
        }

        return true;
    }
}
