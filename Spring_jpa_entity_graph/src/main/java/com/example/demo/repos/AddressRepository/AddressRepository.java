package com.example.demo.repos.AddressRepository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Address.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
	
	//@EntityGraph (attributePaths = {"user","city"},type = EntityGraph.EntityGraphType.LOAD)
	//List<Address> findAll();
	
	
	@EntityGraph (attributePaths = {"user"},type = EntityGraph.EntityGraphType.FETCH)
	List<Address> findAll();

}
