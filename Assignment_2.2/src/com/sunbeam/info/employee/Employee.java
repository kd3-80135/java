package com.sunbeam.info.employee;

public class Employee {
	String first_Name;
	String last_Name;
	double monthly_Salary;
	
	public Employee (){
		if (this.monthly_Salary<0)
			this.monthly_Salary = 101;
		
	}

	public Employee(String first_Name, String last_Name, double monthly_Salary) {
		super();
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.monthly_Salary = monthly_Salary;
		if (this.monthly_Salary<0)
			this.monthly_Salary = 101;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public double getMonthly_Salary() {
		return monthly_Salary;
	}

	public void setMonthly_Salary(double monthly_Salary) {
		this.monthly_Salary = monthly_Salary;
	}
	
	public void display_Yearly () {
		System.out.println("The yearly salary is "+ (this.monthly_Salary*12));
	}
	
	public void raise_Sal () {
		this.monthly_Salary = this.monthly_Salary + this.monthly_Salary*0.1;
	}
}
