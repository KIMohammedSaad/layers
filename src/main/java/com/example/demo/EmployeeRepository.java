package com.example.demo;


import java.util.List;

public interface EmployeeRepository {
    void addEmployee(Employee employee);
    List<Employee> getEmployeesByAgeAndRating(int maxAge, double minimumRating);
    int getCountOfEmployees(double bossRating, int employeeYOE);
}
