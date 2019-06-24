package be.intecbrussel.Shop;

import be.intecbrussel.ThemePark.AgeLimit;
import be.intecbrussel.ThemePark.Person;

public class Saloon extends DrinkStand {
	
	private AgeLimit limit = AgeLimit.ADULT;

	public Saloon(String name, AgeLimit limit) {
		super(name);
		this.limit = limit;
	}
	
	public Saloon(String name) {
		super(name);
	}

	public AgeLimit getLimit() {
		return limit;
	}

	public void setLimit(AgeLimit limit) {
		this.limit = limit;
	}

	@Override
	public void checkAge(Person p) {
		if(p.getAge() < 18) {
			System.out.println("Sorry, you're not allowed, only 18 and above");;
		} else {
			System.out.println("Welcome to our saloon!");
		}
	}

	
}
