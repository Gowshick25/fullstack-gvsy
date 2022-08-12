package com.training.stub;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.training.ifaces.StaffRepository;
import com.training.ifaces.StudentRepository;
import com.training.model.Staff;
import com.training.model.Student;
import com.training.service.StudentService;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {
	@Mock
	StudentRepository repo1;

	@InjectMocks
	StudentService service1;

	@Test
	@DisplayName(value = "Test Find All method with mockito stub")
//	 void testFindAll()
//	 {
//		 
//		 StudentRepository repo = mock(StudentRepository.class);
//		 
//		 StudentService service = new StudentService(repo);
//		 
//		 //stubbing
//		 
//		 List<Student> list = Arrays.asList(new Student(101, "maniii"),new Student(102, "mohan"));
//		 when(repo.findAll()).thenReturn(list);
//		 
//		 assertEquals(service.findStudentSize(),2);
//		 
//	 }

	void testFindall1() {
		List<Student> list1 = Arrays.asList(new Student(101, "maniii"), new Student(102, "mohan"));
		when(repo1.findAll()).thenReturn(list1);
		assertEquals(service1.findStudentSize(), 2);
	}

	@Test
	@DisplayName("Test addWithCondition Method of the Service it should add elements only if the"
			+ "roll number is greater than 2000 else it should return a null value")
	void testAddWithCondition() {
		Student ram = new Student(2021, "ram");
		assertNotNull(service1.addWithCondition(ram));
		// verify(service1,times(1)).addWithCondition(ram);
	}

//	@Test
//	void verfyWithCondition() {
//		Student ram = new Student(2021, "ram");
//
//		verify(service1, times(1)).addWithCondition(ram);
//	}

	@Test
	@DisplayName(value = "Test Find All method with mockito stub")

	void testFindById() {
		Student list = new Student(101, "maniii");

		Student list1 = new Student(102, "mohan");

		when(repo1.getById(101)).thenReturn(list);

		assertEquals(service1.getById(101), list);
	}
}
