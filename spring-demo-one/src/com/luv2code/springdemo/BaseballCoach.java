package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	//define a private field for the dependency
	// every dependency will be an attribute of the main app class (from what I get so far)
	private FortuneService fortuneService;
	
	//define a constructor for the dependency injection
	// each and every constructor will call a different version of the app, with different dependencies (again from what I get so far)
	
	public BaseballCoach(FortuneService theFortuneService) { // here we pass the interface as an argument for creating an object of the class
		
		fortuneService = theFortuneService;
		
	}
	
	public BaseballCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice.";
	}

	@Override
	public String getDailyFortune() {
		
		// to give fortunes, the CoachApp will need to use the FortuneService dependency (aka helper)
		return fortuneService.getFortune();
	}

}
