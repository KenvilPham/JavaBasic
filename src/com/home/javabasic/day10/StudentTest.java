package com.home.javabasic.day10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Teacher> teaccherArrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            teaccherArrayList.add(new Teacher());
        }

        for (Teacher t : teaccherArrayList) {
            System.out.println("------------------------");
            System.out.println(t.toString());
        }

        File fileStudent = new File("myFile.txt");
        FileWriter fileWriter = new FileWriter(fileStudent);
        fileWriter.write(teaccherArrayList.get(0).toString());
        fileWriter.close();

        System.out.println("Input name of teacher need to remove: ");
        String teacherName = sc.nextLine();

        for (Teacher t : teaccherArrayList) {
            if (t.getName().equals(teacherName)) {
                System.out.println("Remove "+ t.getName());
                teaccherArrayList.remove(t);
                return;
            }
        }
        System.out.println("Does not have this teacher with name: " + teacherName);
    }
}
