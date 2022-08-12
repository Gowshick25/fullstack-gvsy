//package com.training.service;
//
//import com.training.ifaces.StaffRepository;
//import com.training.model.Staff;
//
//
//public class StaffService implements StaffRepository {
//
//	private  StaffRepository repo;
//	
//	
//	public StaffService(StaffRepository repo) {
//		super();
//		this.repo = repo;
//	}
//
//	@Override
//	public Staff getById(int id) {
//	    
////		int added = 0;
////		if(Staff.getRollNumber()== id)
////		{
////			this.repo.getById(id);
////			added = id;
////			
////		}
////		else
////		{
////			throw new RuntimeException("ele not found");
////		}
////		return added;
//		
//		Staff found = this.repo.getById(101).get();
//		
//		return found;
//	}
//
//	@Override
//	public int deleteById(int id) {
//		
//		return this.repo.deleteById(id);
//		
//	}
//
//
//}
