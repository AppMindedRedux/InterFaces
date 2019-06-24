package be.intecbrussel.Attractions;

import be.intecbrussel.ThemePark.AgeLimit;
import be.intecbrussel.ThemePark.Attraction;

public class TeaCups extends Attraction {
	
	private AgeLimit limit;

	public TeaCups(String name, int capacity) {
		super(name, capacity);
		this.limit = AgeLimit.SMALLKID;
	}

	public AgeLimit getLimit() {
		return limit;
	}

	public void setLimit(AgeLimit limit) {
		this.limit = limit;
	}
	
	

}
