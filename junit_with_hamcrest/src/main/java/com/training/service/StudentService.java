package com.training.service;

import java.util.List;

import com.training.ifaces.StudentRepository;
import com.training.model.Staff;
import com.training.model.Student;

public class StudentService {

	private StudentRepository repo;
	
	
	public StudentService(StudentRepository repo) {
		super();
		this.repo = repo;
	}

	public Student add(Student entity) { 
		return this.repo.add(entity);
	}
	
	public List<Student> findAll(){
		return this.repo.findAll();
	}

	public int findStudentSize() {
		return this.repo.findAll().size();
	}

/*===========================================================*/
	public Student addWithCondition(Student ram) {
		// TODO Auto-generated method stub
		Student added = null;
		
		if(ram.getRollNumber()>2000)
		{
			this.repo.add(ram);
			added = ram;
		}
		return added;
	}
	
	
//	if(ram.getRollNumber()>2000)
//	{
//		return this.repo.add(ram);
//	}
//	return null;
//}
/*===========================================================*/	
	public Student getById(int id) {
		int found = id;
		if(id==found) {
			return this.repo.getById(id);
		}
			return null;
	}
	
//	public int getById(int id) {
//	    
//		int added = 0;
//		if(Student.getRollNumber()== id)
//		{
//			this.repo.getById(id);
//			added = id;
//			
//		}
//		else
//		{
//			throw new RuntimeException("ele not found");
//		}
//		return added;

}
/*===========================================================*/
