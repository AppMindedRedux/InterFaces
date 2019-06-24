package be.intecbrussel.Shop;

import be.intecbrussel.ThemePark.Person;

public abstract class DrinkStand extends Shop {

	public DrinkStand(String name) {
		super(name);
	}
	
	public abstract void checkAge(Person p);
	

}
