package com.home.javabasic.day8;

public class Pets extends Animal {

    public Pets() {
    }

    @Override
    void eat(String food) {
        System.out.println("The pet eat " + food);
    }

    @Override
    float run(float speed) {
        System.out.print("The pet run(km/h): ");
        return speed;
    }

    @Override
    float sleep(float hours) {
        System.out.print("The pet sleep(h): ");
        return hours;
    }
}
