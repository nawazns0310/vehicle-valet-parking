package com.jsp.Vehicle1;

import java.util.Date;

public class Vehicle {
	private String Name;
	private String PhoneNumber;
	private String VehicleNo;
	private String VehicleType;
	long CheckIntime;

	public Vehicle() {

	}

	public Vehicle(String name, String phoneNumber, String vehicleNo, String vehicleType, long checkInTime) {
		Name = name;
		PhoneNumber = phoneNumber;
		VehicleNo = vehicleNo;
		VehicleType = vehicleType;
		CheckIntime = checkInTime;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getVehicleNo() {
		return VehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		VehicleNo = vehicleNo;
	}

	public String getVehicleType() {
		return VehicleType;
	}

	public void setVehicleType(String vehicleType) {
		VehicleType = vehicleType;
	}

	public long getCheckIntime() {
		return CheckIntime;
	}

	public void setCheckIntime(long checkIntime) {
		CheckIntime = checkIntime;
	}

	@Override
	public String toString() {
		return "Vehicle [Name=" + Name + ", PhoneNumber=" + PhoneNumber + ", VehicleNo=" + VehicleNo + ", VehicleType="
				+ VehicleType + ", CheckIntime=" + CheckIntime + "]";
	}
}
