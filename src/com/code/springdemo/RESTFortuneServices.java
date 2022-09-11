package com.code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneServices implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "I am in RESTFortuneServices";
	}

}
