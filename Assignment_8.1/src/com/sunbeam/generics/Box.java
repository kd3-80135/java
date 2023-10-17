package com.sunbeam.generics;
import com.sunbeam.generics.*;

public class Box <type extends Employee> {
	private type obj;
	
	public double getTotalSalary() {
		return obj.calculateTotalSalary();
	}
	
	public void setTotalSalary() {
		obj.accept();
	}
	
	public Box() 
	{		
	}
	
	public Box(type obj) 
	{		
		this.obj = obj;
	}
	
	public void set(type obj) 
	{
		this.obj = obj;
	}
	public type get() {
		return this.obj;
	}
}
