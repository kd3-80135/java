package com.sunbeam.exceptions;

import java.io.IOException;

public class ExceptionLineTooLong extends Exception {
	private String name;
	private String str;
	
	public ExceptionLineTooLong() {	
	}
	
	public ExceptionLineTooLong(String str,String name, String message) {
		super(message);
		this.str = str;
		this.name = name;
	}

	void display () {
		System.out.println("The type of data is :" +this.name);
		System.out.println("The given string is : "+this.str);
		System.out.println("Exception message is : "+ super.getMessage());
	}

}
