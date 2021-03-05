package com.home.javabasic.day8;

public class PetsManager {
    public static void main(String[] args) {
        Pets mPet = new Pets();
        System.out.println(mPet.toString());
        mPet.eat("Fish");
        System.out.println(mPet.run(90.0f));
        System.out.println(mPet.sleep(10.0f));
    }
}
