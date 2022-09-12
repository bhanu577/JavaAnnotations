package com.code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("inside default constuctor");
	}
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/
	/*@Autowired
	public void doSomeCrazy(FortuneService theFortuneService) {
		System.out.println("inside soSomeCrazy method");
		fortuneService = theFortuneService;
	}*/
	@Override
	public String getDailyWorkout() {
		return "Practice your bachhand volley";
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
