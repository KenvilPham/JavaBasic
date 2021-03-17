package com.home.javabasic.day10;

import java.util.Scanner;

public class Teacher {
    private String name;
    private int age;
    private String address;
    private String subject;

    Scanner scanner = new Scanner(System.in);

    public Teacher(String name, int age, String address, String subject) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.subject = subject;
    }

    public Teacher() {
        input();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getSubject() {
        return subject;
    }

    private void input() {
        System.out.println("Input name: ");
        name = scanner.nextLine();
        System.out.println("Age: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Address: ");
        address = scanner.nextLine();
        System.out.println("Subject: ");
        subject = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "\nname: " + name
                +"\nage: " + age
                +"\naddress: " + address
                +"\nsubject: " + subject;
    }
}
