package com.code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data= {
			"Beware of the wolf in sheep",
			"Hi hello",
			"Bye"
	};
	
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		int index =myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
