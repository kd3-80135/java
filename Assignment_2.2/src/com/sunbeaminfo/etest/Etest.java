package com.sunbeaminfo.etest;
import com.sunbeam.info.employee.Employee;

public class Etest {

	public static void main(String[] args) {
		Employee e1 = new Employee("abc","xyz",10000);
		Employee e2 = new Employee("abc","xyz",20000);
		
		e1.display_Yearly();
		e2.display_Yearly();
		
		e1.raise_Sal();
		e2.raise_Sal();
		
		e1.display_Yearly();
		e2.display_Yearly();
	}

}
