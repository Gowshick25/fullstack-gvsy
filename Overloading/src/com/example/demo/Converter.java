package com.example.demo;

import java.util.Locale;

public class Converter {
	
	public String convert(String str) {

		return str.toLowerCase();//TO MAKE LOWER CASE
	}
	
//	public String convert(String str2)  //duplicate method
//	{
//		
//	}
		
	
	//Creating a overloaded method
	
	public double convert(double farenTemp)
	{
		
		return (farenTemp-32)*5/9;
	}
	
	public double convert(double amt, int frm)
	{
		double response =amt*100;
		if (frm>1)
		{
			return amt*120;
			
		}
	
			return response;
		
	}
}
