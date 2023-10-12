//import java.util.Scanner;
//
//public class Datatype_check {
//
//	public static void main(String[] args) {
//		double a,b;
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter the first input : ");
//		a = scanner.nextDouble();
//		System.out.print("Enter the second input : ");
//		b = scanner.nextDouble();
//		if (Math.floor(a) == Math.ceil(a)) {
//			System.out.println("The first input is not a double.");
//		}
//		else if (Math.floor(b) == Math.ceil(b)){
//			System.out.println("The second input is not a double.");
//		}
//		else {
//			double avg = (a+b)/2;
//			System.out.println("The average number is " + avg);
//		}
//	}
//}

import java.util.Scanner;

public class Datatype_check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first input : ");
        if (scanner.hasNextDouble() && !(scanner.hasNextInt())) {
            double a = scanner.nextDouble();

            System.out.print("Enter the second input : ");
            if (scanner.hasNextDouble() && !(scanner.hasNextInt())) {
                double b = scanner.nextDouble();

                // Calculate the average
                double avg = (a + b) / 2;

                System.out.println("Average: " + avg);
            } else {
                System.out.println("The second input is not a double.");
            }
        } else {
            System.out.println("The first input is not a double.");
        }

        scanner.close();
    }
}



