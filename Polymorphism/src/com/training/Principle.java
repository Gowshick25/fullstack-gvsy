package com.training;

import com.training.model.Conditional;

public class Principle implements Conditional {
	
	public String TypeOfCollege;

	public String getTypeOfCollege() {
		return TypeOfCollege;
	}


	public void setTypeOfCollege(String typeOfCollege) {
		TypeOfCollege = typeOfCollege;
	}


	public Principle(String typeOfCollege) {
		super();
		TypeOfCollege = typeOfCollege;
	}


	
	public Principle() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public boolean test(Object value) {
		
		String strLocation = (String)value;
		
		boolean result =false;
		
		if (TypeOfCollege.equals("government")/*&& strLocation.equals("rural")*/) {
			result= true;
		}
		// TODO Auto-generated method stub
		return result;
	}


}