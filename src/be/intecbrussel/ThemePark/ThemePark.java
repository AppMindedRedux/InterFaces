package be.intecbrussel.ThemePark;

import be.intecbrussel.Shop.Shop;

public class ThemePark {

	private String nameThemePark;
	private Attraction[] attractions;
	private Shop[] shops;

	public ThemePark(String nameThemePark) {
		super();
		this.nameThemePark = nameThemePark;
	}

	public String getNameThemePark() {
		return nameThemePark;
	}

	public void setNameThemePark(String nameThemePark) {
		this.nameThemePark = nameThemePark;
	}

	public Attraction[] getAttractions() {
		return attractions;
	}

	public void setAttractions(Attraction[] attractions) {
		this.attractions = attractions;
	}

	public Shop[] getShops() {
		return shops;
	}

	public void setShops(Shop[] shops) {
		this.shops = shops;
	}

	public void runADay() {

	}

	public void showCapacity() {

	}

}
