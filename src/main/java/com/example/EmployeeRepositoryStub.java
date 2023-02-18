package com.example;

import java.util.Arrays;
import java.util.List;

public class EmployeeRepositoryStub implements EmployeeRepository {

    @Override
    public List<Employee> findAll() {
        Employee employee1 = new Employee("1", 30000.00);

        return Arrays.asList(employee1);
    }

    @Override
    public Employee save(Employee e) {
        return e;
    }
}
