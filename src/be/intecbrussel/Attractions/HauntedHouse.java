package be.intecbrussel.Attractions;

import be.intecbrussel.ThemePark.AgeLimit;
import be.intecbrussel.ThemePark.Attraction;

public class HauntedHouse extends Attraction {

	private AgeLimit limit;

	public HauntedHouse(String name, int capacity) {
		super(name, capacity);
		this.limit = AgeLimit.KID;
	}

	public AgeLimit getLimit() {
		return limit;
	}

	public void setLimit(AgeLimit limit) {
		this.limit = limit;
	}

}
