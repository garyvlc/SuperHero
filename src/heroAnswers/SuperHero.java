package heroAnswers;

import heroQuestions.SuperPower;

public abstract class SuperHero extends Object implements Hero {

	private String trueIdentity;
	private String currentIdentity;
	private String alterEgo;
	
	public SuperHero(String trueIdentity, String alterEgo) {
		this.trueIdentity = trueIdentity;
		this.currentIdentity = trueIdentity;
		this.alterEgo = alterEgo;
	}
	
	public String currentIdentity() {
		return currentIdentity;
	}
	
	public abstract boolean hasPower(SuperPower queriedPower);
	
	public void switchIdentity() {
		if(currentIdentity.equals(trueIdentity)) {
			currentIdentity = alterEgo;
		} else {
			currentIdentity = trueIdentity;
		}
	}
	
	public abstract int totalPower();
}
