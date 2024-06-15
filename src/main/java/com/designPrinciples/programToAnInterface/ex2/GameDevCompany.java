package com.designPrinciples.programToAnInterface.ex2;

import java.util.List;

public class GameDevCompany extends Company {

    @Override
    protected List<Employee> getEmployees() {
        return List.of(new Designer(), new Artist());
    }
}
