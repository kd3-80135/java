package com.sunbeam.test;

import com.sunbeam.calculator.CreditLimitCalculator;

public class TestCalculator {

	public static void main(String[] args) {
		CreditLimitCalculator cred = new CreditLimitCalculator();
		cred.accept();
		cred.display();
	}
}
