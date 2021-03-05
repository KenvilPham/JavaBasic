package com.home.javabasic.day8;

import java.sql.SQLOutput;

public class PhoneBook extends Phone{
    private String id;

    public PhoneBook(String name, String phoneNumber, String id) {
        super(name, phoneNumber);
        this.id = id;
    }

    public PhoneBook() {
        input();
    }

    @Override
    public void input() {
        System.out.println("Input the contact information: ");
        System.out.println("ID of contact: ");
        id = scanner.nextLine();
        super.input();
    }

    @Override
    public String toString() {
        System.out.println("----------------------------------");
        return "ID: " + id + super.toString();
    }
}
