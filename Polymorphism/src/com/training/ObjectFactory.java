package com.training;

import com.training.model.Conditional;
import com.training.model.*;

public class ObjectFactory {
	
	public Conditional getConditional(int key) {
		
		switch (key)
 {
		case 1:
			return new Professor("phd");
		case 2:
			return new Student(89);
		default:
			return null;
		}
	}
	public double getValue(Conditional obj, Object value) {
		
		boolean result = obj.test(value);
		
		double travelAllowance = 1000;
		
		if(result) {
			travelAllowance = 2000;
		}
		return travelAllowance;
		}
	}
