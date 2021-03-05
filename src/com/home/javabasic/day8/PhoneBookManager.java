package com.home.javabasic.day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBookManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<PhoneBook> phoneBookList = new ArrayList<>();
        System.out.println("Input number of contact: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            phoneBookList.add(new PhoneBook());
        }

        for (int i = 0; i < n; i++) {
            System.out.println(phoneBookList.get(i).toString());
        }
    }
}
