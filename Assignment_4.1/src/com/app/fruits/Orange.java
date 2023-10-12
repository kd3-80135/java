package com.app.fruits;

public class Orange extends Fruits{

	public Orange() {
		super("Orange", true);
	}

	public Orange(String colour, double weight) {
		super(colour, weight);
	}
	
	@Override
	public final String taste() {
		return "sour";
	}
	
	@Override
	public void acceptData() {
		super.acceptData();
	}

	
}
