package com.praxis.webService.service;

import java.util.List;

import com.praxis.webService.controller.dto.ComandaDto;

public interface ComandaService {

	List<ComandaDto> findAll();
	
	List<ComandaDto> filtro(String id, String rut);
	
}
