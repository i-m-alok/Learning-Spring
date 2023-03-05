package com.spring.demo.annotations;

import org.springframework.stereotype.Component;

@Component
public class FootballScoringService implements ScoringService{
    @Override
    public String getCheerMessageOnScore() {
        return "Your goal is like Messy super-goal";
    }
}
