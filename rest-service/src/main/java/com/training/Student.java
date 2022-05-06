package com.training;

public class Student {

	
	private int rollNumber;
	private String studentName;
	private double markScroed;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int rollNumber, String studentName, double markScroed) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.markScroed = markScroed;
	}
	
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", markScroed=" + markScroed
				+ "]";
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public double getMarkScroed() {
		return markScroed;
	}
	
	public void setMarkScroed(double markScroed) {
		this.markScroed = markScroed;
	}
}
