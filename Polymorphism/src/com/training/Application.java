package com.training;

import com.training.model.Conditional;
import com.training.model.*;

public class Application {
	
	public static void main(String[] args) {
		
		ObjectFactory ob=new NewObjectFactory();
		
		Conditional profobj = ob.getConditional(1);
		
		Conditional studobj = ob.getConditional(2);
		
		Conditional prinobj=ob.getConditional(3);
		
		//object.test("phd");
		
		System.out.println("Allowance :- "+ob.getValue(profobj, "chennai"));
		System.out.println("Allowance :- "+ob.getValue(studobj, "ece"));
		System.out.println("Allowance: :-"+ob.getValue(prinobj, "government"));
	}
}