import java.util.Scanner;
public class Pattern_1 {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of levels you want to see : ");
		n = scanner.nextInt();
		for (int a = 0; a<=n; a++) {
		for (int i = 0; i<=n-a; i++) {
			System.out.print(" ");
		}
			for (int j = 0; j<=a; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
