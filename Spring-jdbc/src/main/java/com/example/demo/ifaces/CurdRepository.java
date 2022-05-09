package com.example.demo.ifaces;

import java.util.List;
import java.util.Optional;

public interface CurdRepository<T> {
	
	public int add(T t);
	
	public List<T> findAll();
	
	public  Optional<T> findbyId(int id);
	
	public int update (T t);
	
	public int remove (int id );
	
	

}
