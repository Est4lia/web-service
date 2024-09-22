package com.praxis.webService.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class GarzonDto {

	private Integer idGarzon;
	private String rut;
	private String nombre;
	private String apellido;
	private String correo;
	private String direccion;
	
}
