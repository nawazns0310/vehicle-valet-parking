package com.jsp.Vehicle1;

import java.util.Date;
import java.util.Scanner;

public class CheckIn {

	public static Vehicle checkIn() {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter name");
		String name = scn.next();
		System.out.println("Enter phone no");
		String phnNo = scn.next();
		System.out.println("Enter vehicle number");
		String vehicleNo = scn.next();
		System.out.println("1.Two wheeler \n 2. Four wheeler");
		System.out.println("enter choice :");
		int choice = scn.nextInt();
		String vehicleType = null;
		if (choice == 1)
			vehicleType = "Two wheeler";
		else
			vehicleType = "Four wheeler";
		Date d = new Date();
		long checkInTime = d.getTime();
		System.out.println("checkIn Successfull....!");

		return new Vehicle(name, phnNo, vehicleNo, vehicleType, checkInTime);

	}

}
