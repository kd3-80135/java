package com.sunbeam.exceptions;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		String s1 = new String();
		try {
			System.out.println("Enter a string :");
			s1 = new Scanner(System.in).next();
			if (s1.length()>10) {
				throw new ExceptionLineTooLong("String",s1,"The String is too long. ");
			}
		}
		catch (ExceptionLineTooLong e){
			e.printStackTrace();
		}
		System.out.println("Program Completed.");
	}

}
