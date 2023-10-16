package com.sunbeam.tester;
import com.app.geometry.Point2D;
import com.sunbeam.classes.*;
import com.sunbeam.exceptions.NonNegativeException;

public class Tester {

	public static void main(String[] args) {
		try {
			Circle c = new Circle();
			c.accept();
			c.display();
		}
		finally {
			System.out.println("Program Executed.");
		}
	}
}
