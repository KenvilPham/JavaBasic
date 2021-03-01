package com.home.javabasic.day6;

public class Tester extends Employee {
    private int numberOfBug;

    public Tester() {
    }

    public Tester(String name, int id, int age, String phoneNumber, String email, float salary, int numberOfBug) {
        super(name, id, age, phoneNumber, email, salary);
        this.numberOfBug = numberOfBug;
    }

    public int getNumberOfBug() {
        return numberOfBug;
    }

    public void setNumberOfBug(int numberOfBug) {
        this.numberOfBug = numberOfBug;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Number of bug: ");
        numberOfBug = scanner.nextInt();
    }

    @Override
    float getRealSalary() {
        return (getSalary() + numberOfBug * 50000);
    }

    @Override
    public void getEmployeeInfo() {
        System.out.println("\n***********Information of tester: " + getName() + " ***********");
        super.getEmployeeInfo();
        System.out.println("Number of bug: " + numberOfBug);
        System.out.println("Real earnings: " + getRealSalary());
    }

    @Override
    public String toString() {
        System.out.println("\n***********Information of tester: " + getName() + " ***********");
        return super.toString() + "\nNumber of bug: " + numberOfBug
                                + "\nReal earnings: " + getRealSalary();
    }
}
