package com.praxis.webService.service;

import com.praxis.webService.controller.dto.GarzonDto;

public interface GarzonService {

	GarzonDto findByRut(String rut);
	
}
