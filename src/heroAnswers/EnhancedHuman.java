package heroAnswers;

import heroQuestions.SuperPower;

public class EnhancedHuman extends SuperHero {

	private SuperPower[] acquiredPowers;
	private int totalPower = 0;
	private String normalIdentity;
	private String enhancedIdentity;
	private String currentIdentity;
	
	public EnhancedHuman(String normalIdentity, String enhancedIdentity, SuperPower[] acquiredPowers) {
		super(normalIdentity, enhancedIdentity);
		this.normalIdentity = normalIdentity;
		this.enhancedIdentity = enhancedIdentity;
		this.currentIdentity = normalIdentity;
		this.acquiredPowers = acquiredPowers;
	}

	@Override
	public boolean hasPower(SuperPower queriedPower) {
		boolean x = false;
		if (currentIdentity == enhancedIdentity) {
			for (int i = 0; i < acquiredPowers.length; i++) {
				if (acquiredPowers[i] == queriedPower) {
					x = true;
					break;
				}
			}
		} else {
			return x;
		}
		return x;
	}

	@Override
	public int totalPower() {
		if (currentIdentity == enhancedIdentity) {
			for (int i = 0; i < acquiredPowers.length; i++) {
				totalPower = totalPower + acquiredPowers[i].getValue();
			}
			return totalPower;
		} else {
			totalPower = 0;
			return totalPower;
		}
	}

	public void switchIdentity() {
		super.switchIdentity();
		if(currentIdentity.equals(normalIdentity)) {
			currentIdentity = enhancedIdentity;
		} else {
			currentIdentity = normalIdentity;
		}
	}
}
