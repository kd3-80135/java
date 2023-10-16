package com.sunbeam.classes;
import java.util.Scanner;
import java.lang.*;

import com.app.geometry.Point2D;
import com.sunbeam.exceptions.NonNegativeException;
public class Circle extends Exception{
	Point2D p = new Point2D();
	private double myDiameter;
	
	public Circle() {
		p.setX_axis(0);
		p.setY_axis(0);
		this.myDiameter = 100;
	}
	
	public Circle (Point2D p,double myDiameter) throws NonNegativeException{
		this.p = p;
		if (myDiameter<0) {
			throw new NonNegativeException ("myDiameter", this.myDiameter, "The diameter of the circle should not be negative.");
		}
		this.myDiameter = myDiameter;
	}

	public Point2D getP() {
		return p;
	}

	public void setP(Point2D p) {
		this.p = p;
	}

	public double getMyDiameter() {
		return myDiameter;
	}

	public void setMyDiameter(double myDiameter) {
		this.myDiameter = myDiameter;
	}
	
	public void accept () {
		p.accept();
		try {
			System.out.print("Enter the diameter of the circle : ");
			this.myDiameter = new Scanner(System.in).nextDouble();
			if (myDiameter<0) {
				throw new NonNegativeException ("myDiameter", this.myDiameter, "The diameter of the circle should not be negative.");
			}	
		}
		catch (NonNegativeException e) {
			e.printStackTrace();
		}
	}
	
	public void display () {
		System.out.println("The center of the circle is ("+p.getX_axis()+","+p.getY_axis()+").");
		System.out.println("The diameter of the circle is "+this.myDiameter+".");
	}
	
}
