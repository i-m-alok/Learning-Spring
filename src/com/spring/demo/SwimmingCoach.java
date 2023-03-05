package com.spring.demo;

import org.springframework.beans.factory.DisposableBean;

public class SwimmingCoach implements Coach, DisposableBean {
    private FortuneService fortuneService;

    public SwimmingCoach() {
    }

    @Override
    public String getDailyWorkout(){
        return "Do breathing practice inside water";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


    @Override
    public void destroy() throws Exception {
        cleanPool();
    }

    public void preparePool() {
        System.out.println("Ready necessary equipments and life saver jackets near pool");
    }

    public void cleanPool(){
        System.out.println("Clean the pool and keep the equipments on their place");
    }
}
