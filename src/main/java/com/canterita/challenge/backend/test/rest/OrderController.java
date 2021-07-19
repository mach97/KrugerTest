package com.canterita.challenge.backend.test.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.canterita.challenge.backend.test.dto.OrderDto;
import com.canterita.challenge.backend.test.service.IOrderService;


@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private IOrderService orderService;

	@GetMapping(value = "/{id}")
	@CrossOrigin(origins = "http://localhost:3000")
	@ResponseStatus(HttpStatus.OK)
	public OrderDto getOrder(@PathVariable Long id) {
		return orderService.getOrder(id);
	}

}
