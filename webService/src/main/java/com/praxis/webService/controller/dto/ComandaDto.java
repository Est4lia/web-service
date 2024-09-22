package com.praxis.webService.controller.dto;

import java.sql.Date;

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
public class ComandaDto {

	private Integer idComanda;
	private Date fechaEmision;
	private Boolean estado;
	private Integer propinaSugerida;
	private GarzonDto garzon;
	
}
