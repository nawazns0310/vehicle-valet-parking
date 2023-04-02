package com.jsp.Vehicle1;

public class Calculator {

	public static int amount2W(double min) {
		if (min <= 30 * 60) {
			return 10;
		} else {
			double m = min / 30 * 60;
			int m1 = (int) min / 30 * 60;
			if (m > m1) {
				m1 = m1 + 1;
			}
			return m1 * 10;
		}
	}

	public static int calculateAmount(long in, long out, Vehicle v) {
		double l = out - in;
		System.out.println(" in = " + in);
		System.out.println(" out " + out);
		System.out.println(l);
		double min = 1 / 1000;
		System.out.println(min);
		if (v.getVehicleType().equals("Two wheeler")) {
			return amount2W(min);
		}
		return 0;
	}
}
