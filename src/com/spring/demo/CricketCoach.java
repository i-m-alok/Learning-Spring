package com.spring.demo;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;
    private Integer workoutDuration;
    private String email;
    private String team;

    public CricketCoach() {
        System.out.println("No-arg Constructor called");
    }

    public CricketCoach(Integer workoutDuration) {
        System.out.println("Constructor called");
        this.workoutDuration = workoutDuration;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Setter method called");
        this.fortuneService = fortuneService;
    }

    public Integer getWorkoutDuration() {
        return workoutDuration;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Daily field practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
