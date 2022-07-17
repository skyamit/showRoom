package com.showroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.showroom.entity.ModalEntity;

@Repository
public interface ModelRepository extends JpaRepository<ModalEntity, Integer>{
}
