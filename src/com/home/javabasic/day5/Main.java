package com.home.javabasic.day5;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student("Pham Duc Sang", 123, 9.0f, 10.0f);

        student1.setName("Nguyen Van A");
        student1.setId(124);
        student1.setTheoryPoint(9.5f);
        student1.setPracticePoint(6.8f);

        student2.setName("Phan Van B");
        student2.setId(125);
        student2.setTheoryPoint(6.5f);
        student2.setPracticePoint(7.8f);

        student3.setName("Truong Van A");
        student3.setId(126);
        student3.setTheoryPoint(8.5f);
        student3.setPracticePoint(9.8f);

        student1.getStudentInfo();
        student4.getStudentInfo();
    }
}
