package be.intecbrussel.ThemePark;

public enum AgeLimit {

	BABY(1), SMALLKID(3), KID(12), TEEN(16), ADULT(18);

	private int ageLimit;

	private AgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

}
