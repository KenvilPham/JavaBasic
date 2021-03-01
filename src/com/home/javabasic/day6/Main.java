package com.home.javabasic.day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of employees: ");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine();

        List<Employee> employees = new ArrayList<>();

        int typeOfEmployee;

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Choose type of employee: \n1 - Developer \n2 - Tester");
            typeOfEmployee = scanner.nextInt();

            if (typeOfEmployee == 1) {
                employees.add(new Developer());
            } else if (typeOfEmployee == 2) {
                employees.add(new Tester());
            }
            employees.get(i).input();
        }

        for (Employee d : employees) {
            System.out.println(d.toString());
        }

        scanner.close();
    }
}
