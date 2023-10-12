
import java.util.Scanner;
public class Wrapper_class {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number :");
		n = scanner.nextInt();
		
		System.out.println("Binary of the number is " + (Integer.toBinaryString(n)));
		System.out.println("Octal form of the number is " + (Integer.toOctalString(n)));
		System.out.println("Hexadecimal form of the number is " + (Integer.toHexString(n)));
		
		
		

	}

}
