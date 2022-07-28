package com.amit.demo.modelDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amit.demo.model.Brands;


public interface BrandsDAO extends JpaRepository<Brands,Integer>{
	
}
