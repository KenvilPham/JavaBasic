package com.home.javabasic.day5;

public class Student {
    private String name;
    private int id;
    private float theoryPoint;
    private float practicePoint;

    public Student() {}

    public Student(String name, int id, float theoryPoint, float practicePoint) {
        this.name = name;
        this.id = id;
        this.theoryPoint = theoryPoint;
        this.practicePoint = practicePoint;
    }

    public float getAverageMark() {
        return (theoryPoint + practicePoint) / 2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTheoryPoint() {
        return theoryPoint;
    }

    public void setTheoryPoint(float theoryPoint) {
        this.theoryPoint = theoryPoint;
    }

    public float getPracticePoint() {
        return practicePoint;
    }

    public void setPracticePoint(float practicePoint) {
        this.practicePoint = practicePoint;
    }

    public void getStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("The theory point: " + theoryPoint);
        System.out.println("The practice point: " + practicePoint);
        System.out.printf("The average mark is: %.2f ", getAverageMark());
    }
}
