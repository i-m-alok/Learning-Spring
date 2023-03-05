package com.spring.demo.annotations;

import org.springframework.stereotype.Component;

@Component
public class CricketScoringService implements ScoringService{


    @Override
    public String getCheerMessageOnScore() {
        return "Hitman on fire !!!";
    }
}
