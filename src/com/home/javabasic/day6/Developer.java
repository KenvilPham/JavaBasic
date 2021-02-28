package com.home.javabasic.day6;

public class Developer extends Employee {
    private float overTimes;

    public Developer() {
    }

    public Developer(String name, int id, int age, String phoneNumber, String email, float salary, float overTimes) {
        super(name, id, age, phoneNumber, email, salary);
        this.overTimes = overTimes;
    }

    public float getOverTimes() {
        return overTimes;
    }

    public void setOverTimes(float overTimes) {
        this.overTimes = overTimes;
    }


    @Override
    float getRealSalary() {
        return (getSalary() + overTimes * 200000);
    }

    @Override
    public void getEmployeeInfo() {
        System.out.println("\n***********Information of developer: " + getName() + " ***********");
        super.getEmployeeInfo();
        System.out.println("Over time: " + overTimes);
        System.out.println("Real earnings: " + getRealSalary());
    }
}
