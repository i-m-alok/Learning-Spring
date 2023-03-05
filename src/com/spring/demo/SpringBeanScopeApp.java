package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanScopeApp {
    public static void main(String[] args){
        // Create a Spring container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Retrieve the beans
        Coach xCoach = context.getBean("swimCoach", Coach.class);
        Coach yCoach = context.getBean("swimCoach", Coach.class);

        System.out.println("------------------------");
        // the beans are equal or not (as scope is prototype it should be unequal)
        System.out.println(xCoach==yCoach);

        // memory address of xCoach
        System.out.println("memory address of xCoach: " + xCoach);
        System.out.println("memory address of yCoach: " + yCoach);
        context.close();
    }
}
