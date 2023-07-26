package com.example.demo;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private int id;
    private String name;
    private int age;
    private double rating;
    private Boss boss;
    private LocalDate dateOfJoining;

    // Constructors, getters, setters, and other methods

    // ... (rest of the class code)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    public Employee(int id, String name, int age, double rating, Boss boss, LocalDate dateOfJoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.rating = rating;
        this.boss = boss;
        this.dateOfJoining = dateOfJoining;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", rating=" + rating +
                ", boss=" + boss +
                ", dateOfJoining=" + dateOfJoining +
                '}';
    }

    public Employee() {
    }

    // Getter and setter for dateOfJoining
    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    // Method to calculate years of experience
    public int getYearsOfExperience() {
        LocalDate currentDate = LocalDate.now();
        LocalDate dateOfJoining = getDateOfJoining();
        if (dateOfJoining == null) {
            return 0; // If dateOfJoining is not set, return 0 years of experience
        }

        Period period = Period.between(dateOfJoining, currentDate);
        return period.getYears();
    }

}
