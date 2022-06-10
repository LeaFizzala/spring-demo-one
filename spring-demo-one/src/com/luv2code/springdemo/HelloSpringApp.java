package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		//load the Spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve a bean from the Spring container
		Coach theCoach = context.getBean("myCoach", Coach.class); //points to the bean and its interface, the bean itself pointing toward the Java class
		Coach substituteCoach = context.getBean("substituteCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(substituteCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
