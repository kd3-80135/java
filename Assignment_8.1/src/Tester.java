import com.sunbeam.generics.*;

public class Tester {
	
	public static void main(String[] args) {
		Box<Employee>b = new Box<Employee>();
		b.set(new SalariedEmployee());
		b.setTotalSalary();
		System.out.println(b.get());
		
		Box <SalariedEmployee>b1 = new Box<>();
		b1.set(new SalariedEmployee());
		b1.setTotalSalary();
		System.out.println(b1.get());
		
		Box <HourlyEmployee>b2 = new Box<>();
		b2.set(new HourlyEmployee());
		b2.setTotalSalary();
		System.out.println(b2.get());
		
		Box <BaseplusCommissionEmployee>b3 = new Box<>();
		b3.set(new BaseplusCommissionEmployee());
		b3.setTotalSalary();
		System.out.println(b1.get());
		
		Box <CommissionEmployee>b4 = new Box<>();
		b4.set(new CommissionEmployee());
		b4.setTotalSalary();
		System.out.println(b4.get());
//		SalariedEmployee obj1 = (SalariedEmployee)b1.get();
//		System.out.println("Salary of 1st Employee = " + obj1.calculateTotalSalary());
		
	}

}
