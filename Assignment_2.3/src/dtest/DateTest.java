package dtest;
import date.Date;

public class DateTest {

	public static void main(String[] args) {
		Date d1 = new Date(12,02,2025);
		Date d2 = new Date(2,12,1913);
		
		d1.display();
		d2.display();
	}
}
