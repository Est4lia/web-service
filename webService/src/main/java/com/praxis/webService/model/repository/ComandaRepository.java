package com.praxis.webService.model.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.praxis.webService.model.entity.Comanda;
import com.praxis.webService.model.entity.Garzon;

@Repository
public interface ComandaRepository extends CrudRepository<Comanda, Integer>{
	
	List<Comanda> findAllByGarzon(Garzon garzon);
	
}
