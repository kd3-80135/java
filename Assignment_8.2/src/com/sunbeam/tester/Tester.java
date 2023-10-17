package com.sunbeam.tester;
import com.sunbeam.iinterface.*;

public class Tester {
	
	public static void printDisplayableBox(Box<? extends Displayable>b1) {
		b1.get().displayData();
		}
	
		public static void printAnyBox(Box<?> b2) {
		System.out.println(b2.get().toString());
		}

	public static void main(String[] args) {
		
//		Box<Person> p = new Box<>();
//		p.set(new Person());
//		p.get().acceptPerson();
//		printDisplayableBox(p);
//		
//		Box<Date> d = new Box<>();
//		d.set(new Date());
//		d.get().acceptDate();
//		printDisplayableBox(d);	
		String s= new String("Sunbeam");
		Box <String> b3 = new Box<>();
		b3.set(s);
		printAnyBox(b3);
		
		
	}
}
