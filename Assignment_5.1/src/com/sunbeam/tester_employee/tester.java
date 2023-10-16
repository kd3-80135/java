package com.sunbeam.tester_employee;
import com.sunbeam.employee.*;
public class tester {

	public static void main(String[] args) {
		Employee e1 = new SalariedEmployee();
		Employee e2 = new HourlyEmployee();
		Employee e3 = new CommissionEmployee();
		Employee e4 = new BaseplusCommissionEmployee();
		
		e1.accept();
		e2.accept();
		e3.accept();
		e4.accept();
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
	}
}
