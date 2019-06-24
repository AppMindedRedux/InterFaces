package be.intecbrussel.Shop;

public class IceCreamShop extends FoodStand {

	private int cones;
	private int iceCreamBalls;

	public IceCreamShop(String name, int cones, int iceCreamBalls) {
		super(name);
		this.cones = cones;
		this.iceCreamBalls = iceCreamBalls;
	}

	public int getCones() {
		return cones;
	}

	public void setCones(int cones) {
		this.cones = cones;
	}

	public int getIceCreamBalls() {
		return iceCreamBalls;
	}

	public void setIceCeamBalls(int iceCreamBalls) {
		this.iceCreamBalls = iceCreamBalls;
	}

	public void makeIceCream(int balls) {
		
		if(cones >= 1 && balls <= iceCreamBalls)  {
		iceCreamBalls -= balls;
		cones -= 1;
		System.out.println("Uw ijsje met " + balls + " bol(len) is gemaakt, geniet er van!");
		} else {
			if(cones < 1) {
				System.out.println("Geen hoorntjes meer op voorraad");
			} else if (balls > iceCreamBalls) {
			
			System.out.println("Niet genoeg ijsbollen op stock");
			}
		}
		

	}

}
