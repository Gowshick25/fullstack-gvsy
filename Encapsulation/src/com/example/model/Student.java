package com.example.model;

public class Student {
	private int rollNumber;
	private String firstName;
	private double markScored;
    private String branch;
	
    
	public Student(int rollNumber, int markScored, String firstName, String branch) {
		// TODO Auto-generated constructor stub
		this(rollNumber,firstName,99,branch);
		this.rollNumber=rollNumber;
		this.branch=branch;
		this.firstName=firstName;
		
	}
	public Student(int rollNumber, String firstName,double markScored,String branch)
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getMarkScored() {
		return markScored;
	}
	protected void setMarkScored(double markScored) {
		this.markScored = markScored;
	}
	public String getBranch() {
		return branch;
	}
	void setBranch(String branch) {
		this.branch = branch;
	}

}
