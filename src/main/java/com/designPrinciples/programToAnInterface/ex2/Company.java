package com.designPrinciples.programToAnInterface.ex2;

import java.util.List;

public abstract class Company {

    protected abstract List<Employee> getEmployees();

    public void operate() {
        getEmployees().forEach(Employee::perform);
    }
}
