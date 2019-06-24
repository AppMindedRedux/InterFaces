package be.intecbrussel.Shop;

import be.intecbrussel.InterFaces.Sellable;
import be.intecbrussel.ThemePark.AgeLimit;

public class Shop implements Sellable {

	private String name;
	private AgeLimit limit;

	public AgeLimit getLimit() {
		return limit;
	}

	public void setLimit(AgeLimit limit) {
		this.limit = limit;
	}

	public Shop(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void sell() {
		System.out.println("Sell method implemented");
	}

	@Override
	public String toString() {
		return "Shop [name=" + name + "]";
	}

}
