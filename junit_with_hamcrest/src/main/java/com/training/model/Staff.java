package com.training.model;

public class Staff {

	private static int rollNumber;
	private String staffName;

	
	public static int getRollNumber() {
		return rollNumber;
	}
	
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public String getStaffName() {
		return staffName;
	}
	
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public Staff(int rollNumber, String staffName) {
		super();
		this.rollNumber = rollNumber;
		this.staffName = staffName;
	}
	
	

	@Override
	public String toString() {
		return "Staff [rollNumber=" + rollNumber + ", staffName=" + staffName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((staffName == null) ? 0 : staffName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Staff other = (Staff) obj;
		if (staffName == null) {
			if (other.staffName != null)
				return false;
		} else if (!staffName.equals(other.staffName))
			return false;
		return true;
	}

	
}
