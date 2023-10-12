import java.util.Scanner;
public class Pattern_3 {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length of the pattern : ");
		n = scanner.nextInt();
		
		for (int i = 1 ; i<=n; i++) {
			System.out.println("");
			for (int j = 1; j<n+1-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k<=((2*i)-1); k++) {
				System.out.print("*");
			}	
		}
	}
}
