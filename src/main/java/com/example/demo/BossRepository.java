package com.example.demo;

public interface BossRepository {
    void addBoss(Boss boss);
    void updateBossesSalary(double minimumRating, double salaryIncrement);
}
