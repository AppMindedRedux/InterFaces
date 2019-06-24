package be.intecbrussel.ThemePark;


import be.intecbrussel.Attractions.HauntedHouse;
import be.intecbrussel.Attractions.RollerCoaster;
import be.intecbrussel.Attractions.TeaCups;
import be.intecbrussel.Shop.DrinkStand;
import be.intecbrussel.Shop.IceCreamShop;
import be.intecbrussel.Shop.PopCornStand;
import be.intecbrussel.Shop.Saloon;
import be.intecbrussel.Shop.Shop;
import be.intecbrussel.Shop.SodaStand;
import be.intecbrussel.Shop.ToyShop;

public class ThemeParkApp {

	public static void main(String[] args) {

		ThemePark park1 = new ThemePark("TaiRi Daiza");

		System.out.println(park1.getNameThemePark());

		Attraction attr1 = new RollerCoaster("Dragon Kahn", 80, AgeLimit.TEEN);
		Attraction attr2 = new RollerCoaster("Wooden Thunder", 60, AgeLimit.KID);
		Attraction attr3 = new RollerCoaster("Jolly JungleSling", 50, AgeLimit.KID);
		Attraction attr4 = new HauntedHouse("Tempo Del Fuego", 100);
		attr4.setLimit(AgeLimit.ADULT);
		Attraction attr5 = new TeaCups("Gaston Spin", 35);

		Attraction[] all5Attractions = { attr1, attr2, attr3, attr4, attr5 };
		
		Shop shop1 = new PopCornStand("De Popper");
		Shop shop2 = new SodaStand("De Drankfontijn");
		Shop shop3 = new Saloon("De Ranch", AgeLimit.TEEN);
		Shop shop4 = new ToyShop("The PlayGround");
		
		Shop[] allShops = {shop1, shop2, shop3, shop4};
		
		for(Shop s : allShops) {
			System.out.println(s);
		}


		park1.setAttractions(all5Attractions);

		int totalCapacity = 0;

		for (Attraction a : all5Attractions) {

			System.out.println(a);
			totalCapacity += a.getCapacity();
		}

		System.out.println("");
		System.out.println("Totale Attractie Capaciteit van " + park1.getNameThemePark() + " is: " + totalCapacity);

		IceCreamShop ice1 = new IceCreamShop("Panache", 2, 10);
		IceCreamShop ice2 = new IceCreamShop("De Post", 1000, 2000);
		
		//System.out.println(ice1.getCones());
		
		ice1.makeIceCream(8);
		System.out.println("Stock cones: " + ice1.getCones());
		System.out.println("Stock ijsbollen: " + ice1.getIceCreamBalls());
		
		
//		Saloon saloon1 = new Saloon("SaloonAllo", AgeLimit.ADULT);
//		System.out.println(saloon1.getLimit());
		
		System.out.println(shop3.getLimit());
		System.out.println(attr3.getLimit());
		System.out.println(attr4.getLimit());
		
		
		Person pers1 = new Person("Mike", 8);
		
		
	}

}
