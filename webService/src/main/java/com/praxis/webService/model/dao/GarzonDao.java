package com.praxis.webService.model.dao;

import java.util.Optional;

import com.praxis.webService.model.entity.Garzon;

public interface GarzonDao {

	Optional<Garzon> findByRut(String rut);
	
}
