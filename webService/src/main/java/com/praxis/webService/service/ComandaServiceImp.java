package com.praxis.webService.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.praxis.webService.controller.dto.ComandaDto;
import com.praxis.webService.controller.dto.GarzonDto;
import com.praxis.webService.model.dao.ComandaDao;
import com.praxis.webService.model.entity.Comanda;

@Service
public class ComandaServiceImp implements ComandaService{
	
	ComandaDao comandaDao;
	
	ComandaServiceImp(ComandaDao comandaDao){
		this.comandaDao = comandaDao;
	}

	@Override
	public List<ComandaDto> findAll() {
		// TODO Auto-generated method stub
		List<Comanda> comandasEntity = comandaDao.findAll();
		List<ComandaDto> comandasDto = comandasEntity.stream().map((comandaTemporal) -> {
			return ComandaDto.builder()
					.idComanda(comandaTemporal.getIdComanda())
					.fechaEmision(comandaTemporal.getFechaEmision())
					.estado(comandaTemporal.getEstado())
					.propinaSugerida(comandaTemporal.getPropinaSugerida())
					.garzon(GarzonDto.builder()
							.idGarzon(comandaTemporal.getGarzon().getIdGarzon())
							.rut(comandaTemporal.getGarzon().getRut())
							.nombre(comandaTemporal.getGarzon().getNombre())
							.apellido(comandaTemporal.getGarzon().getApellido())
							.correo(comandaTemporal.getGarzon().getCorreo())
							.direccion(comandaTemporal.getGarzon().getDireccion())
							.build())
					.build();
		}).toList();
		return comandasDto;
	}

	@Override
	public List<ComandaDto> filtro(String id, String rut) {
		// TODO Auto-generated method stub
		List<Comanda> comandasEntregar = new ArrayList<Comanda>();
		if(!id.equals("") && rut.equals("")) {
			Optional<Comanda> optionalComanda = comandaDao.findById(Integer.parseInt(id));
			comandasEntregar.add(optionalComanda.orElse(new Comanda()));
		}else if(id.equals("") && !rut.equals("")) {
			List<Comanda> comandas = comandaDao.findAll();
			List<Comanda> comandasFiltrada = comandas.stream().filter((comandaTemporal) -> {
				return comandaTemporal.getGarzon().getRut().equals(rut);
			}).toList();
			if(comandasFiltrada.size() != 0) {
				comandasEntregar = comandasFiltrada;
			}
		}else if(!id.equals("") && !rut.equals("")){
			List<Comanda> comandas = comandaDao.findAll();
			List<Comanda> comandaFiltrada = comandas.stream().filter((comandaTemporal) -> {
				return comandaTemporal.getIdComanda() == Integer.parseInt(id) && comandaTemporal.getGarzon().getRut().equals(rut);
			}).toList();
			comandasEntregar = comandaFiltrada;
		}else {
			comandasEntregar = comandaDao.findAll();
		}
		List<ComandaDto> comandasDto = comandasEntregar.stream().map((comandaTemporal) -> {
			return ComandaDto.builder()
					.idComanda(comandaTemporal.getIdComanda())
					.fechaEmision(comandaTemporal.getFechaEmision())
					.estado(comandaTemporal.getEstado())
					.propinaSugerida(comandaTemporal.getPropinaSugerida())
					.garzon(GarzonDto.builder()
							.idGarzon(comandaTemporal.getGarzon().getIdGarzon())
							.rut(comandaTemporal.getGarzon().getRut())
							.nombre(comandaTemporal.getGarzon().getNombre())
							.apellido(comandaTemporal.getGarzon().getApellido())
							.correo(comandaTemporal.getGarzon().getCorreo())
							.direccion(comandaTemporal.getGarzon().getDireccion())
							.build())
					.build();
		}).toList();
		return comandasDto;
	}

}
