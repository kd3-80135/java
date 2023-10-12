package com.sunbeaminfo.invoice;

import java.util.Scanner;

public class Invoice {
	String part_Number;
	String part_Description;
	int quantity;
	double price;
	
	public Invoice (){
		if (this.quantity < 0) {
			this.quantity = 0;
		}
		if (this.price < 0) {
			this.price = 0;
		}
	}
	
	public Invoice(String part_Number, String part_Description, int quantity, double price) {
		this.part_Number = part_Number;
		this.part_Description = part_Description;
		this.quantity = quantity;
		this.price = price;
		if (this.quantity < 0) {
			this.quantity = 0;
		}
		if (this.price < 0) {
			this.price = 0;
		}
	}

	public String getPart_Number() {
		return part_Number;
	}

	public void setPart_Number(String part_Number) {
		this.part_Number = part_Number;
	}

	public String getPart_Description() {
		return part_Description;
	}

	public void setPart_Description(String part_Description) {
		this.part_Description = part_Description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double invoiceAmount() {
		return ((this.price)*(this.quantity));
	}
	
	public void accept() {
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Enter the id of the part :");
		this.part_Number = scanner.nextLine();
		
		System.out.print("Enter the description/name of the part :");
		this.part_Description = scanner.nextLine();
		
		System.out.print("Enter the quantities required :");
		this.quantity = scanner.nextInt();
		
		System.out.print("Enter the price of the part :");
		this.price = scanner.nextDouble();
		if (this.quantity < 0) {
			this.quantity = 0;
		}
		if (this.price < 0) {
			this.price = 0;
		}
		scanner.close();
	}
	
	public void display() {
		System.out.print("Enter the id of the part : " + this.part_Number);
		
		System.out.print("Enter the description/name of the part : " + this.part_Description);
		
		System.out.print("Enter the quantities required : " + this.quantity);
		
		System.out.print("Enter the price of the part : "+ this.price);
	}
	
	
	public int menus () {
		int choice;
		System.out.println("********************************************");
		System.out.println("0. To exit");
		System.out.println("1. Accept Values");
		System.out.println("2. Display Values");
		System.out.println("3. Display Amount");
		System.out.print("Enter your choice : ");
		Scanner scanner = new Scanner(System.in);
		choice = scanner.nextInt();
		System.out.println("********************************************");
		scanner.close();
		return choice;
   }

}







