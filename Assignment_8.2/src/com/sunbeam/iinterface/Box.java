package com.sunbeam.iinterface;

public class Box <type> {
	private type obj;
	
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
