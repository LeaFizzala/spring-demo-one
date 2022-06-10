package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	
	private Random random = new Random();
	private int nextRandom = random.nextInt(3);
	
	private String[] fortunes = {
			"Life is a long kick in the urethra",
			"Sharing tea with a fascinating stranger is one of life's true delights",
			"Ooga Bonga"
			
	};

	@Override
	public String getFortune() {

		return fortunes[nextRandom];
	}

}
