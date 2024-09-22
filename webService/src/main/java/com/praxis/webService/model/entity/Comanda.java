package com.praxis.webService.model.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "comandas")
public class Comanda {

	@Id
	@Column(name = "id_comanda")
	private Integer idComanda;
	@Column(name = "fecha_emision")
	private Date fechaEmision;
	@Column(name = "estado")
	private Boolean estado;
	@Column(name = "propina_sugerida")
	private Integer propinaSugerida;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_garzon")
	private Garzon garzon;
	
}
