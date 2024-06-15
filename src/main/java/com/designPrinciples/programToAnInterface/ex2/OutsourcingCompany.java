package com.designPrinciples.programToAnInterface.ex2;

import java.util.List;

public class OutsourcingCompany extends Company {

    @Override
    protected List<Employee> getEmployees() {
        return List.of(new Developer(), new Tester(), new Maintainer());
    }
}
