package com.jsp.Vehicle1;

import java.util.Date;

public class CheckOut {

	public static void checkOut(Vehicle v) {

		System.out.println(v);
		Date d = new Date();
		int amount = Calculator.calculateAmount(v.getCheckIntime(), d.getTime(), v);
		System.out.println("Amount to be payable : " + amount);
		System.out.println();
		System.out.println("Thank you");
	}

}
