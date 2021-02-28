package com.home.javabasic.day6;

abstract class Employee {
    private String name;
    private int id;
    private int age;
    private String phoneNumber;
    private String email;
    private float salary;

    public Employee() {
    }

    public Employee(String name, int id, int age, String phoneNumber, String email, float salary) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salary = salary;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void getEmployeeInfo() {
        System.out.println("ID: " + id
                + "\nName: " + name
                + "\nAge: " + age
                + "\nPhone number: " + phoneNumber
                + "\nEmail: " + email
                + "\nBasic salary: " + salary);
    }
    abstract float getRealSalary();
}
