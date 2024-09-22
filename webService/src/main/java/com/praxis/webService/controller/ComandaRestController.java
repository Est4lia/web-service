package com.praxis.webService.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.praxis.webService.controller.dto.ComandaDto;
import com.praxis.webService.service.ComandaService;

@RestController
@RequestMapping("/comandas")
public class ComandaRestController {
	
	ComandaService comandaService;
	
	ComandaRestController(ComandaService comandaService){
		this.comandaService = comandaService;
	}

	@GetMapping("/")
	public ResponseEntity<?> findAll() {
		List<ComandaDto> comandas = comandaService.findAll();
		if(comandas.size() == 0) {
			return ResponseEntity.noContent().build();	
		}
		return ResponseEntity.ok(comandas);
	}
	
	@GetMapping("/filtro")
	public ResponseEntity<?> findByIdComandaAndrutGarzon(@RequestParam(required = false) String rutGarzon, @RequestParam(required = false) String idComanda) {
		if(idComanda == null) {
			idComanda = "";
		}
		if(rutGarzon == null) {
			rutGarzon = "";
		}
		List<ComandaDto> comandas = comandaService.filtro(idComanda, rutGarzon);
		if(comandas.size() == 0) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(comandas);
	}
	
}
