package com.showroom.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.showroom.dto.ModelDto;
import com.showroom.entity.ModalEntity;
import com.showroom.repository.ModelRepository;
import com.showroom.service.ModelService;

@Service
public class ModelImpl implements ModelService {
	
	@Autowired
	public ModelRepository modelRepository;
	
	@Autowired
	public ModelMapper modelMapper;

	@Override
	public ModelDto save(ModelDto model) {
		ModalEntity entity = modelRepository.save(modelMapper.map(model ,ModalEntity.class));
		System.out.println(entity.toString());
		ModelDto dto = modelMapper.map(entity,ModelDto.class);
		System.out.println(dto.toString());
		return dto;
	}

	@Override
	public Optional<ModelDto> findById(Integer id) {
		Optional<ModalEntity> entity =modelRepository.findById(id);
		return Optional.ofNullable(modelMapper.map(entity.get(),ModelDto.class));
	}


}
