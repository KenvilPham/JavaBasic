package com.home.javabasic.day7;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        List<Student> mStudentsList = new ArrayList<>();
        System.out.println("Input number of student: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            mStudentsList.add(new Student());
        }

        for (Student student : mStudentsList) {
            student.displayInformation();
        }
    }
}
