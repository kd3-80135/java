package com.sunbeam.drivingcost;
import java.util.Scanner;

public class DrivingCost {
	private double distanceTravelled;
	private double costPerGallon;
	private double bikeMileage;
	private double parkingFees;
	private double tollFees;
	
	public DrivingCost() {
		this(0.0,0.0,0.0,0.0,0.0);
	}

	public DrivingCost(double distanceTravelled, double costPerGallon, double bikeMileage, double parkingFees,
			double tollFees) {
		super();
		this.distanceTravelled = distanceTravelled;
		this.costPerGallon = costPerGallon;
		this.bikeMileage = bikeMileage;
		this.parkingFees = parkingFees;
		this.tollFees = tollFees;
	}
	
	public void accept () {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the distance travelled per day (in miles) : ");
		this.distanceTravelled = sc.nextDouble();
		System.out.print("Enter the cost per gallon : ");
		this.costPerGallon = sc.nextDouble();
		System.out.print("Enter the mileage of the bike : ");
		this.bikeMileage = sc.nextDouble();
		System.out.print("Enter the parking fees amount : ");
		this.parkingFees = sc.nextDouble();
		System.out.print("Enter the toll fees amount : ");
		this.tollFees = sc.nextDouble();
	}
	
	public void display () {
		System.out.println("The distance travelled by the bike is "+this.distanceTravelled + " miles.");
		double cost = ((this.distanceTravelled*this.costPerGallon)/this.bikeMileage)+ this.parkingFees + this.tollFees;
		System.out.println("The user's cost per day of driving to work is Rs. "+ cost);
	}
}
