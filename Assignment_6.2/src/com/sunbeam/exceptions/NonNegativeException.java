package com.sunbeam.exceptions;

public class NonNegativeException extends Exception{
	private String fieldname;
	private double fieldvalue;
	
	public NonNegativeException() {
	}
	
	public NonNegativeException(String fieldname, double fieldvalue, String message){
		super(message);
		this.fieldname = fieldname;
		this.fieldvalue = fieldvalue;
	}
	
	public void display () {
		System.out.println("The "+this.fieldname+" has value "+this.fieldvalue+".");
		System.err.println("Exception : "+this.getMessage());
	}
}
