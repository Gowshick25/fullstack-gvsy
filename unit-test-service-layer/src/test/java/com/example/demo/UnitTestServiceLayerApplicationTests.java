package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.persistence.EntityNotFoundException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.CabDriver;
import com.example.demo.services.CabDriverService;

@SpringBootTest
@AutoConfigureMockMvc
@TestInstance(Lifecycle.PER_CLASS)
class UnitTestServiceLayerApplicationTests {

	@Autowired
	CabDriverService service;
	
	
	@Test
	@DisplayName(value = "Find all method should return a empty array")
	void testFindAllFailure() {
		
		assertTrue(service.findAll().isEmpty());
//		to get this test case pass u should add values
//		assertFalse(service.findAll().isEmpty());

	}
	
	@Test
	@DisplayName(value = "Find all method should return an array with element")
	void testFindAllSuccess() {
		
		assertFalse(service.findAll().isEmpty());
		
	}
	
	@Test
	@DisplayName(value = "Find all method should return an  element with given id")
	void testFindById() {
		
		CabDriver obj = service.findById(101).orElseThrow(EntityNotFoundException::new);
		assertEquals("Gowshick", obj.getDriverName());
		
	}

}
