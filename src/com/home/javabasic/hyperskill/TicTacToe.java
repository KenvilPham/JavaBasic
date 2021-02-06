package com.home.javabasic.hyperskill;

import java.util.InputMismatchException;
import java.util.Scanner;

//https://hyperskill.org/

public class TicTacToe {
    public static void printInput(char[][] arr) {
        System.out.printf("\n---------");
        for (int i = 0; i < 3; i++) {
            System.out.println();
            System.out.printf("|");
            for (int j = 0; j < 3; j++) {
                System.out.printf("%2s", arr[i][j]);
            }
            System.out.printf(" |");
        }
        System.out.printf("\n---------");
    }

    public static void statesGame(char[][] arr) {
        int countSpace = 0, mainX = 0, mainO = 0, extraX = 0, extraO = 0;
        for (int i = 0; i < 3; i++) {
            int countX = 0, countO = 0;
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == ' ') {
                    countSpace++;
                }
                if (arr[i][j] == 'X') {
                    countX++;
                }

                if (arr[i][j] == 'O') {
                    countO++;
                }

            }

            if (countX == 3) {
                System.out.println("X wins");
                break;
            } else if (countO == 3) {
                System.out.println("O wins");
                break;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (arr[i][i] == 'X') {
                mainX++;
            }
            if (arr[i][3-i-1] == 'X') {
                extraX++;
            }
            if (arr[i][i] == 'O') {
                mainO++;
            }
            if (arr[i][3-i-1] == 'O') {
                extraO++;
            }
        }

        if (mainX == 3 || extraX == 3) {
            System.out.println("X wins");
        } else if (mainO == 3 || extraO == 3) {
            System.out.println("O wins");
        } else if (countSpace != 0) {
            System.out.println("Game not finished");
        } else {
            System.out.println("Draw");
        }
    }
    public static boolean compareNumberXO(char[][] arr) {
        int countX = 0, countO = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == 'X') {
                    countX++;
                }

                if (arr[i][j] == 'O') {
                    countO++;
                }
            }
        }
        return (countX <= countO);
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the cells: ");
        String input = scanner.nextLine().trim().replace('_', ' ');
        char[][]arrInput = new char[3][3];

        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrInput[i][j] = input.charAt(index++);
            }
        }

        printInput(arrInput);

        int coordX = 0, coordY = 0;

        boolean finished = false;
        while (!finished) {
            System.out.printf("\nEnter the coordinates: ");
            try {
                coordX = scanner.nextInt();
                coordY = scanner.nextInt();

                if (coordX >= 4 || coordX <= 0 || coordY >= 4 || coordY <= 0) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    finished = false;
                } else if (arrInput[coordX-1][coordY-1] == 'X' || arrInput[coordX-1][coordY-1] == 'O') {
                    System.out.println("This cell is occupied! Choose another one!");
                    finished = false;
                } else {
                    if (compareNumberXO(arrInput)) {
                        arrInput[coordX-1][coordY-1] = 'X';
                    } else {
                        arrInput[coordX-1][coordY-1] = 'O';
                    }
                    printInput(arrInput);
                    System.out.println();
                    statesGame(arrInput);

                    finished = true;
                }

            } catch (InputMismatchException e) {
                System.out.println("You should enter numbers!");
                scanner.nextLine();
            }
        }
    }
}
