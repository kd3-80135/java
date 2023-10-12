package com.app.fruits;

public class Mango extends Fruits{

	public Mango() {
		super("Mango", true);
	}

	public Mango(String colour, double weight) {
		super(colour, weight);
	}
	
	@Override
	public final String taste() {
		return "sweet";
	}
	
	@Override
	public void acceptData() {
		super.acceptData();
	}	
	

}
