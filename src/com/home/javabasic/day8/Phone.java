package com.home.javabasic.day8;

import java.util.Scanner;

public abstract class Phone {
    private String name;
    private String phoneNumber;

    public Scanner scanner = new Scanner(System.in);

    public Phone(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Phone() {
    }

    public void input() {
        System.out.println("Name of contact: ");
        name = scanner.nextLine();
        System.out.println("Phone number: ");
        phoneNumber = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "\nName: " + name
                +"\nPhone number: " + phoneNumber;
    }
}
