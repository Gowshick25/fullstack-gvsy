package com.example;

import com.example.model.Student;;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram=new Student(420,234,"hello","cse");
		//ram.rollNumber =101;
		//"public" method able to access
		//ram.setRollNumber(50020);
		/*"default" method unable to access => "package"*
		 because student class is in com.examble.model package
		 and Application is in com.example package*/
		//ram.setBranch("cse");
		/* "protected" unable to access because Application is not a Subclass of Student*/
		//ram.setMarkScored(1200);
		//ram.setFirstName("Gowse");
		
		
		System.out.println("RollNumber: " + ram.getRollNumber());
		System.out.println("MarkScored: " + ram.getMarkScored());
		System.out.println("StudentName: " + ram.getFirstName());
		System.out.println("Branch : " + ram.getBranch());
		
	}
	

}
