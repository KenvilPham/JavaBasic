package com.home.javabasic.solidexample.dependencyinversionprinciple.bad;

public class Project {
    private BackendDeveloper backendDeveloper = new BackendDeveloper();
    private FrontendDeveloper frontendDeveloper = new FrontendDeveloper();

    public void build() {
        backendDeveloper.codeJava();
        frontendDeveloper.codeJS();
    }
}
