package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class EmployeesTest {
    EmployeeRepositoryStub employeeRepositoryStub = new EmployeeRepositoryStub();
    BankService bankService = new BankServiceDummy();
    Employees employees = new Employees(employeeRepositoryStub, bankService);

    @Test
    void testFindAllShouldReturnOne() {
        EmployeeRepository employeeRepository = mock(EmployeeRepository.class);
        Assertions.assertNotSame(employeeRepository.findAll(),employeeRepositoryStub.findAll());

    }

    @Test
    void testIfPayEmployeesWorks() {
        int payouts = employees.payEmployees();
        Assertions.assertEquals(1, payouts);
    }
}
