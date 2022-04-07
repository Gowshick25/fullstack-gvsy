package com.training;

public class Address {
	public int doorNumber;
	public String streetName;
	
	
	public Address(int doorNumber, String streetName, String location) {
		super();
		this.doorNumber = doorNumber;
		this.streetName = streetName;
		this.location = location;
	}
	public String location;
	
	
	public int getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

	

}
