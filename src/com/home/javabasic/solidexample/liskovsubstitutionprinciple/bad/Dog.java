package com.home.javabasic.solidexample.liskovsubstitutionprinciple.bad;

public class Dog implements Animal {
    @Override
    public void fly() {
        //Dog can't fly
        throw new UnsupportedOperationException();
    }
}
