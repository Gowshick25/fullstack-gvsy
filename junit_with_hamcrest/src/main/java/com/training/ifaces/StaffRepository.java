package com.training.ifaces;

import com.training.model.Staff;

public interface StaffRepository {

	public Staff getById(int id);
	public int deleteById(int id);
	
}
