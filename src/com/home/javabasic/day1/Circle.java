package com.home.javabasic.day1;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	    double circleRadius, circlePerimeter, circleArea;

        System.out.println("Input circle radius: ");
        circleRadius = sc.nextDouble();

        circlePerimeter = 2 * Math.PI * circleRadius;
        circleArea = Math.PI * circleRadius * circleRadius;

        System.out.printf("\nPerimeter of circle is: %.3f", circlePerimeter);
        System.out.printf("\nArea of circle is: %.3f", circleArea);

        sc.close();
    }
}
