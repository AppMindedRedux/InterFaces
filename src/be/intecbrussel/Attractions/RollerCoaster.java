package be.intecbrussel.Attractions;

import be.intecbrussel.ThemePark.AgeLimit;
import be.intecbrussel.ThemePark.Attraction;

public class RollerCoaster extends Attraction {

	private AgeLimit limit;

	public RollerCoaster(String name, int capacity, AgeLimit limit) {
		super(name, capacity);
		this.limit = limit;
	}

	public AgeLimit getLimit() {
		return limit;
	}

	public void setLimit(AgeLimit limit) {
		this.limit = limit;
	}

}
