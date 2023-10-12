package com.sunbeaminfo.itest;

import java.util.Scanner;
import com.sunbeaminfo.invoice.Invoice;

public class InvoiceMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		Invoice i = new Invoice();
		while ((choice=i.menus())!=0) {
			switch (choice) {
			case 1: i.accept();
					break;
					
			case 2: i.display();
					break;
				
			case 3: System.out.println("The total amount to be paid is Rs." + i.invoiceAmount());
					break;
			}
		}
		scanner.close();
	}
}
