package com.home.javabasic.day8;

import java.util.Scanner;

public abstract class Animal {
    private String name;
    private String gender;
    private float age;
    private float weight;
    private String color;
    private Scanner scanner = new Scanner(System.in);

    public Animal(String name, String gender, float age, float weight, String color) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public Animal() {
        input();
    }

    public void input() {
        System.out.println("Input information of this animal: ");
        System.out.println("Name: ");
        name = scanner.nextLine();
        System.out.println("Gender: ");
        gender = scanner.nextLine();
        System.out.println("Age: ");
        age = Float.parseFloat(scanner.nextLine());
        System.out.println("Weight: ");
        weight = Float.parseFloat(scanner.nextLine());
        System.out.println("Color: ");
        color = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "\nName: " + name
                +"\nGender: " + gender
                +"\nAge: " + age
                +"\nWeight: " + weight
                +"\nColor: " + color;
    }

    abstract void eat(String food);
    abstract float run(float speed);
    abstract float sleep(float hours);
}
