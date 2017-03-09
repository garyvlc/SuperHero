package heroAnswers;

public class SecretAgent implements Hero {

	private String trueName;
	private String codeName;
	private String currentIdentity;
	private String gadget;
	
	public SecretAgent(String trueName, String codeName, String gadget) {
		this.trueName = trueName;
		this.codeName = codeName;
		this.currentIdentity = trueName;
		this.gadget = gadget;
	}
	
	@Override
	public String currentIdentity() {
		return currentIdentity;
	}

	@Override
	public void switchIdentity() {
		if (currentIdentity.equals(trueName)) {
			currentIdentity = codeName;
		} else {
			currentIdentity = trueName;
		}
	}

	public String getGadget() {
		return gadget;
	}
}
