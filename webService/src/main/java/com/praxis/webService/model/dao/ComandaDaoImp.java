package com.praxis.webService.model.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.praxis.webService.model.entity.Comanda;
import com.praxis.webService.model.repository.ComandaRepository;

@Component
public class ComandaDaoImp implements ComandaDao{

	ComandaRepository comandaRepository;
	
	ComandaDaoImp(ComandaRepository comandaRepository){
		this.comandaRepository = comandaRepository;
	}
	
	@Override
	public List<Comanda> findAll() {
		// TODO Auto-generated method stub
		return (List<Comanda>) comandaRepository.findAll();
	}

	@Override
	public Optional<Comanda> findById(Integer id) {
		// TODO Auto-generated method stub
		return comandaRepository.findById(id);
	}

}
