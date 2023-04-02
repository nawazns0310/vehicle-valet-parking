package com.jsp.Vehicle1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Map<String, Vehicle> m = new LinkedHashMap<>();

		for (;;) {
			System.out.println("please enter your choice \n 1.CheckIn \n 2.CheckOut \n 3.Display \n 4.Exit\n");
			int n = scn.nextInt();
			switch (n) {
			case 1:
				Vehicle v = CheckIn.checkIn();
				m.put(v.getVehicleNo(), v);
				break;

			case 2:
				System.out.println("enter vehicle number");
				String s = scn.next().toLowerCase();

				if (!(m.containsKey(s)))
					System.out.println("vehicle is not availble");
				else {
					CheckOut.checkOut(m.get(s));
					System.out.println();
				}
				break;

			case 3:
				if (m.size() == 0)
					System.out.println("vehicle details are not found");
				else
					System.out.println(m);

			case 4:
				System.out.println("Thank you for visiting");
				break;

			default:
				System.out.println("please enter valid choice");
				break;
			}
		}
	}

}
