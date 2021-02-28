package com.home.javabasic.day6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Developer mDeveloper = new Developer("Pham Duc Sang", 1, 18, "0888888888", "kenvil.pham@gmail.com", 120000f, 5.1f);
//        Tester mTester = new Tester("Doan Kim Dung", 2, 12, "0981197213", "mr.morning@gmail.com", 80000f, 30);
        Scanner scanner = new Scanner(System.in);
        String name, phoneNumber, email;
        int id, age, numberOfBug;
        float basicSalary, overTime;

        System.out.println("Input developer information: ");
        System.out.print("ID: ");
        id = Integer.valueOf(scanner.nextLine());
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Age: ");
        age = Integer.valueOf(scanner.nextLine());
        System.out.print("Phone number: ");
        phoneNumber = scanner.nextLine();
        System.out.print("Email: ");
        email = scanner.nextLine();
        System.out.print("Basic salary: ");
        basicSalary = scanner.nextFloat();
        System.out.print("Over time: ");
        overTime = scanner.nextFloat();
        scanner.nextLine();

        Developer mDeveloper = new Developer(name, id, age, phoneNumber, email, basicSalary, overTime);

        System.out.println("Input tester information: ");
        System.out.print("ID: ");
        id = Integer.valueOf(scanner.nextLine());
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Age: ");
        age = Integer.valueOf(scanner.nextLine());
        System.out.print("Phone number: ");
        phoneNumber = scanner.nextLine();
        System.out.print("Email: ");
        email = scanner.nextLine();
        System.out.print("Basic salary: ");
        basicSalary = scanner.nextFloat();
        System.out.print("Number of bug: ");
        numberOfBug = scanner.nextInt();
        scanner.nextLine();

        Tester mTester = new Tester(name, id, age, phoneNumber, email, basicSalary, numberOfBug);

        mDeveloper.getEmployeeInfo();
        mTester.getEmployeeInfo();

        scanner.close();
    }
}
