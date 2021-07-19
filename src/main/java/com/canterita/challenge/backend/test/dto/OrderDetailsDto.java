//Creado por: Mauro Clavijo
//Fecha: 19/07/2021

//Declaración de clases y atributos a utilizarse

package com.canterita.challenge.backend.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class OrderDetailsDto {

	private Long id;
	
	private Long idOrder;

	private String detail;
	
	private Double cantidad;

	private Double precioUnitario;

	private Double totalDetail;
	
}

