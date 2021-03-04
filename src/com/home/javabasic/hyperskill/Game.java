package com.home.javabasic.hyperskill;

import java.util.Scanner;

public class Game {
    private static final String CELL_IS_OCCUPIED = "This cell is occupied! Choose another one!";
    private static final String SHOULD_ENTER_NUMBERS = "You should enter numbers!";
    private static final String OVER_BOUND = "Coordinates should be from 1 to 3!";
    private static final String MAKING_MOVE_CONTINUOUS = "Making move level \"easy\"";

    private Scanner scanner = new Scanner(System.in);

    private Field field;

    public Game() {
        createField();
    }

    private void createField() {
//        System.out.print("Enter cells: ");
//        String initialState = scanner.nextLine();
//        field = new Field(initialState);
        field = new Field();
        printField();
    }

    private void printField() {
        System.out.print(field);
    }

    private void printGameState() {
        System.out.println(field.getState());
    }

    public void move() {
        int[] coordinates = getCoordinates();
        if (field.isXmove()) {
            field.setX(coordinates);
        } else {
            field.setO(coordinates);
        }
        printField();
        printGameState();
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

        coordinates[0]--;
        coordinates[1]--;
        if (field.isOccupied(coordinates)) {
            System.out.println(CELL_IS_OCCUPIED);
            return false;
        }
        return true;
    }
}
