package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	
	private String team;
	
	
	
	//create a no-arg constructoe because Spring is gonna call it
	
	public CricketCoach() {
		System.out.println("CricketCoach : inside no-arg constructor");
	}
	
	// create the setter method that will be called by Spring when it injects the dependency
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : inside the setter method setFortuneService");
		this.fortuneService = fortuneService;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : inside the setter method setEmailAddress");

		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : inside the setter method setTeam");

		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes a day.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
