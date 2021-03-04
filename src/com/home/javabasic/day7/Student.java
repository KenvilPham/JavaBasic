package com.home.javabasic.day7;

import java.text.ParseException;
import java.util.Date;

public class Student extends Person {
    private String id;
    private float GPA;
    private String email;

    public Student(String name, String gender, String address, Date dateOfBirth, String id, float GPA, String email) {
        super(name, gender, address, dateOfBirth);
        this.id = id;
        this.GPA = GPA;
        this.email = email;
    }

    public Student() throws ParseException {
        inputInfo();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void inputInfo() throws ParseException {
        System.out.println("Input information of this Student: ");
        System.out.println("ID: ");
        id = scanner.nextLine();
        super.inputInfo();
        System.out.println("GPA: ");
        GPA = Float.valueOf(scanner.nextLine());
        System.out.println("Email: ");
        email = scanner.nextLine();

    }

    @Override
    public String toString() {
        System.out.println("----------------------" + getName() + "----------------------");
        return "ID: " + id
                + super.toString()
                + "\nEmail: " + email
                + "\nGPA: " + GPA;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
    }
}
