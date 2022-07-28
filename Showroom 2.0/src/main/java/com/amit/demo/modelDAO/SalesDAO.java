package com.amit.demo.modelDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amit.demo.model.Sales;

public interface SalesDAO extends JpaRepository<Sales,Integer> {

}
