//Creado por: Mauro Clavijo
//Fecha: 19/07/2021

//Las entidades que operan con la db son creadas

package com.canterita.challenge.backend.test.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity(name = "ORDER_DETAILS_ENTITY")
public class OrderDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "id_order")
	private Long idOrder;
	
	@Column(name = "detail")
	private String detail;

	@Column(name = "cantidad")
	private Double cantidad;
	
	@Column(name = "precio_unitario")
	private Double precioUnitario;

	@Column(name = "total_detail")
	private Double totalDetail;
}
