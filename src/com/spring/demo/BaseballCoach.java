package com.spring.demo;

public class BaseballCoach implements Coach {
    FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService=fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 mins in batting practice " + fortuneService.getFortune();
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
