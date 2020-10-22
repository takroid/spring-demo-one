package com.luv2code.springdemo;

public class BaseBallCoach implements Coach {

	//依存性の為privateで宣言
	private FortuneService fortuneService;

	//依存性の注入のためコンストラクタ定義	
	public BaseBallCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {

		//use my fortuneService to get a Fortune
		return fortuneService.getFortune();
	}
}
