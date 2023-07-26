package com.example.demo;

public class Boss {
    private int id;
    private String name;
    private int age;
    private double salary;
    private double rating;


    public Boss(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Boss() {
    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public double getRating() {
        return rating;
    }

    // Setter method for setting the boss's rating
    public void setRating(double rating) {
        this.rating = rating;
    }

    // Constructor, getters, setters, and other methods

    // ... (rest of the class code)
}
