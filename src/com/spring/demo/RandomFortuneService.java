package com.spring.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService{

    ArrayList fortuneList = new ArrayList<String>(Arrays.asList("A house divided against itself cannot stand.",
            "Important principles may, and must, be inflexible.",
            "I destroy my enemies when I make them my friends.",
            "You have to do your own growing no matter how tall your grandfather was.",
            "Most people are about as happy as they make up their minds to be",
            "Most folks are about as happy as they make up their minds to be.",
            "Give me six hours to chop down a tree and I will spend the first four sharpening the axe."));
    @Override
    public String getFortune() {
        Integer index = randomIndexGenerator();
        return String.valueOf(fortuneList.get(index));
    }

    private Integer randomIndexGenerator(){
        Random rand = new Random();
        return rand.nextInt(fortuneList.size());
    }
}
