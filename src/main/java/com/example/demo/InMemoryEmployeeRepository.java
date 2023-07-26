package com.example.demo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryEmployeeRepository implements EmployeeRepository {
    private Map<Integer, Employee> employees;

    public InMemoryEmployeeRepository() {
        employees = new HashMap<>();
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    @Override
    public List<Employee> getEmployeesByAgeAndRating(int maxAge, double minimumRating) {
        List<Employee> filteredEmployees = new ArrayList<>();
        for (Employee employee : employees.values()) {
            if (employee.getAge() < maxAge && employee.getRating() > minimumRating) {
                filteredEmployees.add(employee);
            }
        }
        return filteredEmployees;
    }

    @Override
    public int getCountOfEmployees(double bossRating, int employeeYOE) {
        int count = 0;
        for (Employee employee : employees.values()) {
            if (employee.getYearsOfExperience() > employeeYOE) {
                Boss boss = employee.getBoss();
                if (boss != null && boss.getRating() > bossRating) {
                    count++;
                }
            }
        }
        return count;
    }
}
