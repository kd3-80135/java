package com.app.fruits;

import java.util.Scanner;

public class Fruits {
	private String colour;
	private double weight;
	private String name;
	private boolean isFresh;
	
	public Fruits(){
		
	}
	
	public Fruits(String colour, double weight) {
		this.colour = colour;
		this.weight = weight;
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the colour of the fruit : ");
		this.colour = sc.next();
		System.out.print("Enter the weight of the fruit : ");
		this.weight = sc.nextDouble();
	}

	public Fruits(String name, boolean isFresh) {
		this.name = name;
		this.isFresh = isFresh;
	}
	
	public String taste() {
		return "No Specific Taste";
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public boolean getisFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	@Override
	public String toString() {
		return "Apple [Name = " + getName() + ", Taste = " + taste() + ", Colour = " + getColour() + ", Weight = " + getWeight()
				+ "]";
	}
	
	

}
