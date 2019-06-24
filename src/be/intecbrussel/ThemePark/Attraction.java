package be.intecbrussel.ThemePark;

import be.intecbrussel.InterFaces.RideAble;

public class Attraction implements RideAble {

	//  Actracties zullen een naam hebben alsook een Capaciteit en een leeftijdslimiet. 

	private String name;
	private int capacity;
	private AgeLimit limit;

	public Attraction(String name, int capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	public AgeLimit getLimit() {
		return limit;
	}

	public void setLimit(AgeLimit limit) {
		this.limit = limit;
	}

	@Override
	public void Ride(Person p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Attraction [name=" + name + ", capacity=" + capacity + "]";
	}
	
	



}
