package com.showroom.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.showroom.dto.ModelDto;
import com.showroom.service.ModelService;

@RestController
public class ShowRoomRestController {

	@Autowired
	private ModelService modelService;
	
	
	@PostMapping("/model")
	public ResponseEntity<ModelDto> saveModel(@RequestBody ModelDto model) {
		ModelDto dto = modelService.save(model);
		return new ResponseEntity<ModelDto>(dto, HttpStatus.ACCEPTED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<ModelDto>> getByID(@PathVariable Integer id) {
		System.out.println("id :" +id);
		return new ResponseEntity<Optional<ModelDto>>(modelService.findById(id), HttpStatus.ACCEPTED);
	}

}
