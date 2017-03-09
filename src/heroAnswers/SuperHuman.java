package heroAnswers;

import heroQuestions.SuperPower;

import java.util.Arrays;
import java.util.HashSet;

public class SuperHuman extends SuperHero {
	
	private HashSet<SuperPower> innatePowers;
	
	public SuperHuman(String realName, String secretIdentity, SuperPower[] innatePowers) {
		super(realName, secretIdentity);
		this.innatePowers = new HashSet<SuperPower>(Arrays.asList(innatePowers));
	}

	public void acquirePowers(SuperPower[] newPowers) {
		for (SuperPower superPower : newPowers) {
			innatePowers.add(superPower);
		}
	}
	
	@Override
	public boolean hasPower(SuperPower queriedPower) {
		return true;
	}

	public void losePowers(SuperPower[] oldPowers) {
		for (SuperPower superPower : oldPowers) {
			if(innatePowers.contains(superPower)) {
				innatePowers.remove(superPower);
			}
		}
	}
	
	@Override
	public int totalPower() {
		int totalPower = 0;
		for (SuperPower superPower : innatePowers) {
			totalPower = totalPower + superPower.getValue();
		}
		return totalPower;
	}

	//additional
	public void showPower() {
		int x = 1;
		for (SuperPower superPower : innatePowers) {
			System.out.println(x + ") " + superPower);
			x += 1;
		}
	}
}
