package com.training;

public class Application {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
          Greetings ob=new Greetings();
        //  System s=new System(); System class is private so we cant use that
          System.out.println(ob.getMessage());
        // System.out.println(ob.get());
          System.out.println(Greetings.get());
	}

}
