package com.training;

import com.training.model.Conditional;
import com.training.model.Student;

public class NewObjectFactory extends ObjectFactory {

	@Override
	public Conditional getConditional(int key) {
		// TODO Auto-generated method stub
		switch (key)
		{
		case 3:
			return new Principle("cit");
		
		default:
			return super.getConditional(key);
		}
		
	}
	
		
		
}
