package com.praxis.webService.model.dao;

import java.util.List;
import java.util.Optional;

import com.praxis.webService.model.entity.Comanda;

public interface ComandaDao {

	List<Comanda> findAll();
	
	Optional<Comanda> findById(Integer id);
	
}
