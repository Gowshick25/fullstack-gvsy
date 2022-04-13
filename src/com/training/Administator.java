package com.training;

import java.util.Scanner;

import com.training.Customer.Customer;
import com.training.Employee.Empolyee;
import com.training.hotel.Hotel;


public class Administator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hotel ob=new Hotel();
		ob.setHotelName("SGV");
		ob.setHotelType("Veg/Non_veg");
		ob.setHotelLocation("Chennai");
		ob.setHotelContactNumber(984537635);
		System.out.println("----------------------------------");
		System.out.println("HOTEL NAME           : "+ob.getHotelName());
		System.out.println("HOTEL TYPE           : "+ob.getHotelType());
		System.out.println("HOTEL LOCATION       : "+ob.getHotelLocation());
		System.out.println("HOTEL CONTACT NUMBER : "+ob.getHotelContactNumber());
		System.out.println("----------------------------------");
				
		Scanner sc=new Scanner(System.in);
		Customer ob1=new Customer();
		String name = null;
		String address = null;
		int MobNumber = 0;
		
		System.out.println();
		
		System.out.println("=================================================");
		
		System.out.println("ENTER CUSTOMER NAME  ");
		String n1=ob1.CustomerName(name);
		System.out.println("ENTER MOBILE NUMBER  ");
		int   n2=ob1.CustomerMobileNumber(MobNumber);
		System.out.println("ENTER ADDRESS  ");
		String n3=ob1.CustomerAddress(address);
		System.out.println("---------------------------");
		System.out.println("CUSTOMER NAME      :"+n1);
		System.out.println("MOBILE NUMBER      :"+n2);
		System.out.println("ADDRESS            :"+n3);
		System.out.println("---------------------------");
	}

}
