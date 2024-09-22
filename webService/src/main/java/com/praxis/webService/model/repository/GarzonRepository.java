package com.praxis.webService.model.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.praxis.webService.model.entity.Garzon;

@Repository
public interface GarzonRepository extends CrudRepository<Garzon, Integer>{

	Optional<Garzon> findByRut(String rut);
	
}
