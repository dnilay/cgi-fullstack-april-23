package org.example.demo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String email;
	private String team;
	
public void initCricketCoach()
{
	System.out.println("cricket coach init called");
}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice spin today";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

	
	public void customDestroyMethod()
	{
		System.out.println("bean detroyed");
	}
}
