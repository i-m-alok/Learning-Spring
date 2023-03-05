package com.spring.demo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppWithAnnotation {
    public static void main(String[] args){
        // Create a Spring container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextForAnnotations.xml");
        // Retrieve the beans
        BallingMachine ballingMachine = context.getBean("ballingMachine", BallingMachine.class);

        ballingMachine.turnOn();
        ballingMachine.onScore();
    }
}
