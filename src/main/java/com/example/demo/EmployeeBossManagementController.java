package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeBossManagementController {
    private final EmployeeBossManagementService service;

    @Autowired
    public EmployeeBossManagementController(EmployeeBossManagementService service) {
        this.service = service;
    }

    // POST: Add an employee
    @PostMapping("/employee")
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
        service.addEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body("Employee added successfully");
    }

    // POST: Add a boss
    @PostMapping("/boss")
    public ResponseEntity<String> addBoss(@RequestBody Boss boss) {
        service.addBoss(boss);
        return ResponseEntity.status(HttpStatus.CREATED).body("Boss added successfully");
    }

    // PUT: Update the salary of bosses with a rating greater than a given value
    @PutMapping("/boss/salary")
    public ResponseEntity<String> updateBossesSalary(@RequestParam double minimumRating, @RequestParam double salaryIncrement) {
        service.updateBossesSalary(minimumRating, salaryIncrement);
        return ResponseEntity.ok("Boss salaries updated successfully");
    }

    // GET: Retrieve employees under a given age and with a rating greater than a given value
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getEmployeesByAgeAndRating(@RequestParam int maxAge, @RequestParam double minimumRating) {
        List<Employee> employees = service.getEmployeesByAgeAndRating(maxAge, minimumRating);
        return ResponseEntity.ok(employees);
    }

    // GET: Get the count of employees whose boss's rating and employee's years of experience are greater than a given value
    @GetMapping("/employees/count")
    public ResponseEntity<String> getCountOfEmployees(@RequestParam double bossRating, @RequestParam int employeeYOE) {
        int count = service.getCountOfEmployees(bossRating, employeeYOE);
        return ResponseEntity.ok("Count of employees: " + count);
    }
}
