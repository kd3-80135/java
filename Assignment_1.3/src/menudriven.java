import java.util.Scanner;
class Menu {
	
   public int menus () {
		int choice;
		System.out.println("********************************************");
		System.out.println("0. To exit");
		System.out.println("1. Dosa -------------- Rs.50");
		System.out.println("2. Samosa------------- Rs.20");
		System.out.println("3. Idli--------------- Rs.25");
		System.out.println("4. Generate Bill");
		System.out.print("Enter your choice : ");
		Scanner scanner = new Scanner(System.in);
		choice = scanner.nextInt();
		System.out.println("********************************************");
		
		return choice;
   }
		
	public int calculate_Bill (int nd,int ns,int ni) 
		{
			int dosa_price = 50;
			int samosa_price = 20;
			int idli_price = 25;
			int total = 50*nd + 20*ns + 25*ni;
			return total;
		}
	}

public class menudriven extends Menu{
	public static void main (String[] args) {
		int nd = 0,ns = 0,ni = 0;
		Scanner scanner = new Scanner(System.in);
		int choice;
		Menu m = new Menu();
		while ((choice=m.menus())!=0) {
			switch (choice) {
			case 1: System.out.print("Enter the amount of dosas that you want : ");
					nd = scanner.nextInt();
					break;
					
			case 2: System.out.print("Enter the amount of samosas that you want : ");
					ns = scanner.nextInt();
					break;
				
			case 3: System.out.print("Enter the amount of idlis that you want : ");
					ni = scanner.nextInt();
					break;
				
			case 4: 
					System.out.print("Your total amount is "+m.calculate_Bill (nd,ns,ni));
					break;
			}
		}	
	}
}

