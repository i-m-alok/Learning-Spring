package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args){
        // Create a Spring container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Retrieve the beans
        CricketCoach coach = context.getBean("cricketCoach", CricketCoach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getEmail());
        System.out.println(coach.getTeam());

        System.out.println("------------------------");
        // Retrieve the beans
        Coach trackCoach = context.getBean("trackCoach", Coach.class);
        // check fortune should be random
        for(int i=0; i<5; i++)
            System.out.println(trackCoach.getDailyFortune());

        context.close();
    }
}
