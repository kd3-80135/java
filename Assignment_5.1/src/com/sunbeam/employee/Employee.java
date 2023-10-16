package com.sunbeam.employee;

import java.util.Scanner;

abstract public class Employee {
	private String name;
	private int socialSecurityNumber;
	
	public void accept () {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the employee : ");
		this.name = sc.next();
		System.out.print("Enter the social security number of the employee : ");
		this.socialSecurityNumber = sc.nextInt();	
	}

	@Override
	public String toString() {
		return "Employee [name = " + name + ", socialSecurityNumber = " + socialSecurityNumber + "]";
	}
	
	abstract double calculateTotalSalary ();
}
