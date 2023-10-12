package com.app.fruits;

public class Apple extends Fruits {
	
	public Apple () {
		super("Apple", true);
	}

	public Apple(String colour, double weight) {
		super(colour, weight);
	}
	
	@Override
	public final String taste() {
		
		return "sweet n sour";
	}
	
	@Override
	public void acceptData() {
		super.acceptData();
	}
	
	
}
