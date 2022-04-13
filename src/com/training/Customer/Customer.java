package com.training.Customer;

import java.util.Scanner;

public class Customer {
	private String CustomerName;
	private long CustomerMobileNumber;
	private String CustomeAddress;
	
	
	public String CustomerName(String name)
	{
		Scanner sc=new Scanner(System.in);
		return name=sc.next();
	}
	
   public int CustomerMobileNumber(int MobNumber)
	{
		Scanner sc=new Scanner(System.in);
		return MobNumber=sc.nextInt();
	}
	public String CustomerAddress(String address)
	{
		Scanner sc=new Scanner(System.in);
		return address=sc.next();
	}
	
}
