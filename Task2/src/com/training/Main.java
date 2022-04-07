package com.training;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileBill ob=new MobileBill("Sathiya", 845634262, "prepaid");
		Address ob1=new Address(102, "Food Street", "Chennai");
		System.out.println("MOBILE BRAND :"+MobileBill.BRAND);
		System.out.println("CUSTOMER NAME :"+ob.getCustomerName()+","+"MOBILE NUMBER :"+ob.getMobilenumber()+","+"CUSTOMER PLAN :"+ob.getPlanname());
		System.out.println(ob1.doorNumber + ","+ ob1.streetName+","+ob1.location);
		System.out.println(ob.findAmount(null));
		
		

	}

}
