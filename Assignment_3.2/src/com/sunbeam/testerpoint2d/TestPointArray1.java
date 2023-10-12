package com.sunbeam.testerpoint2d;

import static com.sunbeam.point2d.Point2D.isEqual;
import com.sunbeam.point2d.Point2D;
import java.util.Scanner;
public class TestPointArray1 {
	
	public static int menu(){
		int choice = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("*********************************************************");
		System.out.println("0. To exit.");
		System.out.println("1. To display a specific point.");
		System.out.println("2. To display all points.");
		System.out.println("3. Check two points and display distance.");
		System.out.println("*********************************************************");
		choice = scanner.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		int n = 0,choice = 0;
		Point2D p = new Point2D();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of points that you want to enter : ");
		n = sc.nextInt();
		
		Point2D[] point_arr = new Point2D[n];
//		for (int i = 0; i<n; i++) {
//			point_arr[i] = new Point2D();
//			System.out.println("Point a["+i+"] : ");
//			point_arr[i].accept();
		for (Point2D abc:point_arr) {
			abc = new Point2D();
			int i = 0;
			System.out.println("Point a["+i+"] : ");
			i++;
			abc.accept();
		}
		
		while ((choice = menu())!=0) {
			switch (choice) {
			case 1 : int m = n - 1;
					 System.out.print("Enter the index of the point (0 to "+m+") :"); 
					 int j = sc.nextInt(); 
					 if (j<0 && j>9) {
						 System.out.println("Invalid Index...Please give inputs in the provided range.");
					 }
					 point_arr[j].getDetails();
					 break;
						
			case 2 : for (int k = 0; k<n; k++) {
		   		 	 System.out.println("The a["+k+"] point : ");
			   	 	 point_arr[k].getDetails();
					 }
					break;
					
			case 3 : System.out.print("Enter the index of the first point (0 to 9) :"); 
			 		 int a = sc.nextInt(); 
			 		 if (a<0 && a>9) {
			 			 System.out.println("Invalid Index...Please give inputs in the provided range.");
			 		 }
			 		 System.out.print("Enter the index of the second point (0 to 9) :"); 
			 		 int b = sc.nextInt(); 
			 		 if (b<0 && b>9) {
			 			 System.out.println("Invalid Index...Please give inputs in the provided range.");
			 		 }
			 		 
			 		 if (isEqual(point_arr[a],point_arr[b])) {
			 			 System.out.println("The points are one and the same.");
			 			 System.out.println("The Distance between the points is 0."); 
			 		 }
			 		 else {
			 			System.out.println("The points are different.");
			 			System.out.println("The distance between the points is "+ p.calculateDistance(point_arr[a],point_arr[b]));
			 		 }
			 		 
					 break;			
			}
		}
	}
}
