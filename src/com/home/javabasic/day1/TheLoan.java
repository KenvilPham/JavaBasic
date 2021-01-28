package com.home.javabasic.day1;

public class TheLoan {
    public static void main(String[] args) {
        double mLoan = 100000000;
        double interestRatePerYear = 0.12;
        double interestOfMonth, payOfMonth;

        interestOfMonth = mLoan * (interestRatePerYear / 12);
        payOfMonth = (mLoan / 12) + interestOfMonth;

        System.out.println("The interest of month is: " + interestOfMonth);

        System.out.println("The payment of month is: " + payOfMonth);

    }
}
