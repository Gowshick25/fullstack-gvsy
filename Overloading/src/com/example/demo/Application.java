package com.example.demo;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter The Name :");
		String name = sc.next();
		
		
		System.out.println("Enter the Farenheit Temp : ");
		double farenTemp =sc.nextDouble();
		
		System.out.println("Enter The amount :");
		Double amt = sc.nextDouble();
		System.out.println("Enter The frm :");
		int frm = sc.nextInt();
		
		Converter converter =new Converter();
		System.out.println("Name : "+converter.convert(name));
		System.out.println("Celsius Temp := "+converter.convert(farenTemp));
		System.out.println("the conversion: "+converter.convert(amt , frm));
		
		
		sc.close();

	}

}
