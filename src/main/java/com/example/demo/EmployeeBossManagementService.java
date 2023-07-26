package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeBossManagementService {
    private final EmployeeRepository employeeRepository;
    private final BossRepository bossRepository;

    @Autowired
    public EmployeeBossManagementService(EmployeeRepository employeeRepository, BossRepository bossRepository) {
        this.employeeRepository = employeeRepository;
        this.bossRepository = bossRepository;
    }

    // POST: Add an employee
    public void addEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
    }

    // POST: Add a boss
    public void addBoss(Boss boss) {
        bossRepository.addBoss(boss);
    }

    // PUT: Update the salary of bosses with a rating greater than a given value
    public void updateBossesSalary(double minimumRating, double salaryIncrement) {
        bossRepository.updateBossesSalary(minimumRating, salaryIncrement);
    }

    // GET: Retrieve employees under a given age and with a rating greater than a given value
    public List<Employee> getEmployeesByAgeAndRating(int maxAge, double minimumRating) {
        return employeeRepository.getEmployeesByAgeAndRating(maxAge, minimumRating);
    }

    // GET: Get the count of employees whose boss's rating and employee's years of experience are greater than a given value
    public int getCountOfEmployees(double bossRating, int employeeYOE) {
        return employeeRepository.getCountOfEmployees(bossRating, employeeYOE);
    }
}
