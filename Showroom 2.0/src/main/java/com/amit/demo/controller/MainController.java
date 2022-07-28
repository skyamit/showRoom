package com.amit.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amit.demo.model.Brands;
import com.amit.demo.model.CarModel;
import com.amit.demo.model.Sales;
import com.amit.demo.modelDAO.BrandsDAO;
import com.amit.demo.modelDAO.CarModelDAO;
import com.amit.demo.modelDAO.CarVariationDAO;
import com.amit.demo.modelDAO.SalesDAO;

@RestController
public class MainController {

	@Autowired
	BrandsDAO brandsDao;
	
	@Autowired
	CarModelDAO carModelDao;
	
	@Autowired
	SalesDAO salesDao;
	
	@Autowired
	CarVariationDAO carVariationDao;
	
//  List all the car Model
	@RequestMapping("/model")
	public ResponseEntity<List<CarModel>> getModels() {
		return new ResponseEntity<List<CarModel>>(carModelDao.findAll(), HttpStatus.ACCEPTED);
	}
	
//	List all the brands
	@RequestMapping("/brands")
	public ResponseEntity<List<Brands>> getBrands() {
		return new ResponseEntity<List<Brands>>(brandsDao.findAll(), HttpStatus.ACCEPTED);
	}
	
//	Yearly Sale - last 10 year sale data
	@RequestMapping("/lastSale/{lastYear}")
	public ResponseEntity<List<Sales>> getSale() {
		return new ResponseEntity<List<Sales>>(salesDao.findAll(), HttpStatus.ACCEPTED);
	}
	
//	Yearly Sale by id - last 10 year sale data
	@RequestMapping("/lastSale/{lastYear}/{id}")
	public ResponseEntity<List<Sales>> getSaleId(int id,int lastYear) {
		return new ResponseEntity<List<Sales>>(salesDao.findAll(), HttpStatus.ACCEPTED);
	}
	
//	Monthly sale - last 12 month sale data
	
	
//	Monthly sale by id - last 12 month sale data
	
	
//	Sale for particular year - 1 year sale data of paricular year
	
	
//	Sale for particular year by id - 1 year sale data of that year
	
	
//	Add Brand
	
	
//	Add vechile model
	
	
//	Get model details - Specification of car
	
	
//	Available Vehicles - List all the available vehicles
	
	
//	Order by price
//	Order by date
//	Order by name
//	Out of stock models - List all the models which is not available
//	Get vehicle in range of price
//	Total Variation of car model based on color
	
	
	
}
