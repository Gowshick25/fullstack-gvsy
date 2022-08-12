package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.BDDMockito.*;
import static org.hamcrest.Matchers.hasSize;
import com.example.demo.entity.CabDriver;
import com.example.demo.services.CabDriverService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@SpringBootTest
@AutoConfigureMockMvc
@TestInstance(Lifecycle.PER_CLASS)
public class CabDriverTest {

	@Autowired
	MockMvc mock;

	@Autowired
	ObjectMapper mapper;

	@MockBean
	CabDriverService service;

	private CabDriver canna;
	private CabDriver damu;
	private CabDriver david;

	@BeforeAll
	void init() {
		canna = new CabDriver(101, "canna", 983498734,LocalDate.of(2000, 12, 25), 5.00);
		damu = new CabDriver(101, "damu", 983498734,LocalDate.of(2001, 11, 2), 5.00);
		david = new CabDriver(101, "david", 983498734,LocalDate.of(2006, 9, 15), 5.00);

	}

	@DisplayName("test find all method return a array")
	@Test
	void testFindAll() throws Exception {
//		List<CabDriver> list = Arrays.asList(new  CabDriver(101, "canna", 983498734, 5.00),
//				new  CabDriver(101, "damu", 983498734, 5.00) , 
//				new  CabDriver(101, "david", 983498734, 5.00) );

		List<CabDriver> list = new ArrayList<>();
		list.add(canna);
		list.add(damu);
		list.add(david);

		given(service.findAll()).willReturn(list);

		mock.perform(MockMvcRequestBuilders.get("/api/v1/drivers").contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$", hasSize(3)))
				.andExpect(jsonPath("$[2].driverName", is("david")));
	}
	@Test
	@DisplayName("Teset Add Method return status code 201 and returns the element Added")
	void testAdd() throws Exception {
		CabDriver parth = new CabDriver(1013,"Gowse", 8695955, LocalDate.of(2000, 12, 25), 5);
		
		given(service.save(parth)).willReturn(parth);
		
		mock.perform(MockMvcRequestBuilders.post("/api/v1/drivers")
	               .contentType(MediaType.APPLICATION_JSON)
	               .content(asJsonString(parth)))
	     			.andExpect(status().isCreated())
	     			.andExpect(content().contentType(MediaType.APPLICATION_JSON))
	     			.andExpect(jsonPath("$.driverName", is("Gowse"))); 
	}

	public String asJsonString(CabDriver obj) {
		
		
		try {
			
			return mapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}
