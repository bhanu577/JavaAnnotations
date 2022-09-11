package com.code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class PingPongCoach implements Coach {
	
	public PingPongCoach() {
		System.out.println("I am inside pingPongCoach Constructor");
	}
	public String getDailyWorkout() {
		return "Inside PingPong Coach getDailyWorkout";
	}
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Nothing";
	}

}
