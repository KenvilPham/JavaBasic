package com.home.javabasic.solidexample.dependencyinversionprinciple.good;

public class BackendDeveloper implements Developer {
    @Override
    public void develop() {
        codeJava();
        //codeCSharp();
    }

    private void codeJava() {};
    private void codeCSharp() {};
}
