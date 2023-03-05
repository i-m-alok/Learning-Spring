package com.spring.demo;

public class TrackCoach implements Coach{

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Run for hard 5km";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
