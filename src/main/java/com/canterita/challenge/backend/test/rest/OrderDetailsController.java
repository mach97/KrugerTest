//Creado por: Mauro Clavijo
//Fecha: 19/07/2021

package com.canterita.challenge.backend.test.rest;

import com.canterita.challenge.backend.test.dto.request.OrderDetailsRequest;
import com.canterita.challenge.backend.test.model.OrderDetailsEntity;
import com.canterita.challenge.backend.test.service.IOrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Aqui declaramos las funciones que van a ser llamadas cuando se llaman las rutas
@RestController
@RequestMapping("/orders")
public class OrderDetailsController {
	
	@Autowired
	private IOrderDetailsService orderDetailsService;

	@GetMapping(value = "/{id}/details")
	@CrossOrigin(origins = "http://localhost:3000")
	@ResponseStatus(HttpStatus.OK)
	public List<OrderDetailsEntity> getOrderDetails(@PathVariable Long id) {
		return orderDetailsService.getOrderDetails(id);
	}

	@PostMapping(value = "/{id}/details")
	@ResponseStatus(HttpStatus.OK)
	public OrderDetailsEntity postOrderDetails( @PathVariable Long id, @RequestBody OrderDetailsRequest request) { return orderDetailsService.postOrderDetails(id, request);}
}
