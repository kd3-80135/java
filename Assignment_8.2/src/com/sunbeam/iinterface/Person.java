package com.sunbeam.iinterface;

import java.util.Scanner;

public class Person implements Displayable{
	    String name;
	    String addr;

	    public Person (String name, String addr){
	        this.name = name;
	        this.addr = addr;
	    }

	    public Person (){
	        this.name = "";
	        this.addr = "";
	    }

	    public void acceptPerson (){
	    	Scanner sc1 = new Scanner(System.in);
	        System.out.print("Enter the name : ");
	        this.name = sc1.next();
	        System.out.print("Enter the address : ");
	        this.addr = sc1.next();
	        System.out.println("");
	    
	    }

	    public void displayData (){
	        System.out.println("The name of the person is "+this.name);
	        System.out.println("The address of the person is " +this.addr);
	        System.out.println("");
	    }
}
