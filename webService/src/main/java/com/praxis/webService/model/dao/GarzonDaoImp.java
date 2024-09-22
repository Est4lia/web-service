package com.praxis.webService.model.dao;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.praxis.webService.model.entity.Garzon;
import com.praxis.webService.model.repository.GarzonRepository;

@Component
public class GarzonDaoImp implements GarzonDao{

	GarzonRepository garzonRepository;
	
	GarzonDaoImp(GarzonRepository garzonRepository){
		this.garzonRepository = garzonRepository;
	}
	
	@Override
	public Optional<Garzon> findByRut(String rut) {
		// TODO Auto-generated method stub
		return garzonRepository.findByRut(rut);
	}

}
