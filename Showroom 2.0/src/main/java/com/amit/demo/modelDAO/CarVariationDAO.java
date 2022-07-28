package com.amit.demo.modelDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amit.demo.model.CarVariation;

public interface CarVariationDAO extends JpaRepository<CarVariation,Integer>{

}
