package com.showroom.service;

import java.util.Optional;

import com.showroom.dto.ModelDto;

public interface ModelService {

	public ModelDto save(ModelDto model);
	
	public Optional<ModelDto> findById(Integer id);

}
