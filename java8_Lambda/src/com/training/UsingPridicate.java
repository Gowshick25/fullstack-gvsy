package com.training;

import java.util.*;

import  java.util.function.*;
public class UsingPridicate {
	
	public static void main(String[] args) {
		{
			List<String> names=Arrays.asList("India","Srilanka","Indonesia","Bhutan");
			
			Predicate<String> containsChar = (country) -> country.toUpperCase().startsWith("I"); 
			
			Consumer<String> consumer =(value) ->
			
			{
				if (containsChar.test(value))
				{
					System.out.println(value);
			}
					
			};
		
		
			names.forEach(consumer);
			
			//names.forEach((value) -> System.out.println(value));
			
		}
		
	}
}


