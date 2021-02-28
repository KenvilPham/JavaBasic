package com.home.javabasic.solidexample.dependencyinversionprinciple.good;

public class FrontendDeveloper implements Developer {
    @Override
    public void develop() {
        codeJS();
        // codeAngular();
    }

    private void codeJS() {};
    private void codeAngular() {};
}
