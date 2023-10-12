package com.sunbeam.fruits.tester;

import java.util.Scanner;

import com.app.fruits.Fruits;
import com.app.fruits.Apple;
import com.app.fruits.Mango;
import com.app.fruits.Orange;



public class Tester {
	
	public static int menu () {
		int choice;
		System.out.println("********************************************");
		System.out.println("0. To Exit");
		System.out.println("1. To add Mango. ");
		System.out.println("2. To add Orange. ");
		System.out.println("3. To add Apple. ");
		System.out.println("4. To display all fruit names. ");
		System.out.println("5. To display all fresh fruits. ");
		System.out.println("6. To display tastes of all stale fruits. ");
		System.out.println("7. To change state of fruit. ");
		System.out.println("8. To mark all fruits as stale. ");
		choice = new Scanner(System.in).nextInt();
		System.out.println("********************************************");
		
		return choice;
	}

	public static void main(String[] args) {
		int n = 0,i = 0, choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the fruit basket : ");
		n = sc.nextInt();
		Fruits arr_f[] = new Fruits[n];
//		Tester t = new Tester;
		
		while ((choice = menu()) != 0) {
			switch (choice) {
				case 1 : if (i<n && i>=0) {
							arr_f[i] = new Mango();
							arr_f[i].acceptData();
							i++;
						 }
						 else {
							 System.out.println("Stack Overflow. Fruit Basket is full. ");
						 }
						 break;
						 
				case 2 : if (i<n && i>=0) {
							arr_f[i] = new Orange();
							arr_f[i].acceptData();
							i++;
				 		 }
						 else {
						 	System.out.println("Stack Overflow. Fruit Basket is full. ");
						 }
						 break;
				 
				case 3 : if (i<n && i>=0) {
							arr_f[i] = new Apple();
							arr_f[i].acceptData();
							i++;
				 		 }
						 else {
							System.out.println("Stack Overflow. Fruit Basket is full. ");
						 }
				 		 break;
				
				case 4 :System.out.println("Names of all the fruits in the basket are : ");
						for (Fruits f:arr_f) {
							 if(f != null) {
								 System.out.println(f.getName());
							 }
						 }			 
						break;
						
				case 5 : for (Fruits f:arr_f) {
					 		 if (f != null) {
					 			 if (f.getisFresh()) {
					 				 System.out.println(f.toString());
					 			 }
					 		 }
						 }
						break;
					
				case 6: for (Fruits f:arr_f) {
			 		 		if (f != null) {
			 		 			if (!(f.getisFresh())) {
			 		 				System.out.println(f.taste());
			 		 			}
			 		 		}
				 		} 
						break;
					
				case 7: int nn = 0;
						System.out.print("Enter the index of the fruit that you want to change the state of : ");
						nn = sc.nextInt();
						if (nn<n && nn>=0) {
							arr_f[nn].setFresh(false);
						}
						else {
							System.out.println("Invalid Input. Please try again. ");
						}
						break;
					
//				case 8: for (Fruits f:arr_f) {
//			 		 		if (f.taste()== "sour") {
//			 		 			if (f.setFresh(false)) {
//			 		 				f.toString();
//			 		 			}
//			 		 		}
//				 		} 
//						break;
		
			}			
			
		}
		
	}

}
