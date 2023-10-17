package com.sunbeam.generics;
import java.util.*;
public class BaseplusCommissionEmployee extends Employee{
	private double baseSalary;
	private double commissionRate;
	private int grossSales;
	

	public BaseplusCommissionEmployee() {
	}
	
	@Override
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("For the BaseplusCommissionEmployee.");
		super.accept();
		System.out.print("Enter the base Salary : ");
		this.baseSalary = sc.nextDouble();
		System.out.print("Enter the commission of the employee : ");
		this.commissionRate = sc.nextDouble();
		System.out.print("Enter the Gross sales made by the employee : ");
		this.grossSales = sc.nextInt();
	}
	
	@Override
	double calculateTotalSalary() {
		return this.commissionRate*this.grossSales+(this.baseSalary+0.1*this.baseSalary);
	}

	@Override
	public String toString() {
		return "BaseplusCommissionEmployee [baseSalary=" + baseSalary + ", toString()=" + super.toString() + "]";
	}	
}
