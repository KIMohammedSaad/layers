package com.example.demo;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryBossRepository implements BossRepository {
    private Map<Integer, Boss> bosses;

    public InMemoryBossRepository() {
        bosses = new HashMap<>();
    }

    @Override
    public void addBoss(Boss boss) {
        bosses.put(boss.getId(), boss);
    }

    @Override
    public void updateBossesSalary(double minimumRating, double salaryIncrement) {
        for (Boss boss : bosses.values()) {
            if (boss.getRating() > minimumRating) {
                double currentSalary = boss.getSalary();
                boss.setSalary(currentSalary + salaryIncrement);
            }
        }
    }
}
