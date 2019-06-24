package be.intecbrussel.Shop;

import be.intecbrussel.ThemePark.Person;

public class SodaStand extends DrinkStand {

	public SodaStand(String name) {
		super(name);
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
