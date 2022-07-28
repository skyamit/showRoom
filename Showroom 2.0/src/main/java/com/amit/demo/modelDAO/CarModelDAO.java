package com.amit.demo.modelDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amit.demo.model.CarModel;

public interface CarModelDAO extends JpaRepository<CarModel,Integer>{

}
