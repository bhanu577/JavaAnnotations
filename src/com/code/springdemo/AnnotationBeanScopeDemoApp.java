package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive bean from spring container
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach aplhaCoach = context.getBean("tennisCoach",Coach.class);
		
		boolean result = (theCoach==aplhaCoach);
		
		System.out.println(result);
		
		System.out.println(theCoach);
		
		System.out.println(aplhaCoach);
		
		//

	}

}
