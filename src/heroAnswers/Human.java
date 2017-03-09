package heroAnswers;

import heroQuestions.SuperPower;

public class Human extends SuperHero {
	
	public Human(String realName, String secretIdentity) {
		super(realName, secretIdentity);
	}

	@Override
	public boolean hasPower(SuperPower queriedPower) {
		
		return false;
	}

	@Override
	public int totalPower() {
		
		return 0;
	}
	
}
