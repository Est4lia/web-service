package com.praxis.webService.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Entity
@Table(name = "garzones")
public class Garzon {

	@Id
	@Column(name = "id_garzon")
	private Integer idGarzon;
	@Column(name = "rut")
	private String rut;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "correo")
	private String correo;
	@Column(name = "direccion")
	private String direccion;
	
}
