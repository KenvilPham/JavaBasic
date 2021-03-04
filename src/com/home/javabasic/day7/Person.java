package com.home.javabasic.day7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {
    private String name;
    private String gender;
    private String address;
    private Date dateOfBirth;

    public Scanner scanner = new Scanner(System.in);

    public Person(String name, String gender, String address, Date dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void inputInfo() throws ParseException {
        System.out.println("Name: ");
        name = scanner.nextLine();
        System.out.println("Gender: ");
        gender = scanner.nextLine();
        System.out.println("Address: ");
        address = scanner.nextLine();
        System.out.println("Date of birth(dd/mm/yyyy): ");
        String dob = scanner.nextLine();
        dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
    }

    @Override
    public String toString() {
        return "\nName: " + name
                + "\nGender: " + gender
                + "\nAddress: " + address
                + "\nDate of birth: " + dateOfBirth;
    }

    public void displayInformation() {
        System.out.println(this.toString());
    }
}
