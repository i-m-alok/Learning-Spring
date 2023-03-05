package com.spring.demo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ballingMachine")
public class BallingMachine implements WorkoutMachine{

    @Autowired
    @Qualifier("cricketScoringService") // whenever we will have multiple beans, then to help spring in identifying the correct implementation we need to provide qualifier else it will throw error.
    ScoringService scoringService;

    /*
    // Constructor injection
    @Autowired
    public BallingMachine(ScoringService scoringService) {
        this.scoringService = scoringService;
    }
     */

    /*
    //Setter injection
    @Autowired
    public void setScoringService(ScoringService scoringService) {
        this.scoringService = scoringService;
    }
     */

    @Override
    public void turnOn() {
        System.out.println("Start throwing balls");
    }

    @Override
    public void turnOff() {
        System.out.println("Stop throwing balls");
    }

    public void onScore(){
        System.out.println(scoringService.getCheerMessageOnScore());
    }
}
