package com.training;

public class Application {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
//		int value =Integer.parseInt(args[0]);
//		System.out.println(++value);
		CurrencyConvertor conv=new CurrencyConvertor();
		
		double conv1 =Double.parseDouble(args[0]);
		System.out.println(conv.inrToUsd(conv1));
		
		double conv2=Double.parseDouble(args[0]);
		System.out.println(conv.inrToEuro(conv2));
		
		double salary = 42500.00;
		int intSal =(int)salary;//using non professional way
		int age =42;
		String strAge =Integer.toString(age);//using professional way
		int intSall=Integer.valueOf(intSal);
		System.out.println(strAge);
		System.out.println(intSall);
	}

}
