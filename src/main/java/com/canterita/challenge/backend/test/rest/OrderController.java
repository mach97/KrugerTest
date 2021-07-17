package com.canterita.challenge.backend.test.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.canterita.challenge.backend.test.dto.OrderDto;
import com.canterita.challenge.backend.test.service.IOrderService;


@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private IOrderService orderService;

	@GetMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public OrderDto getOrder(@PathVariable Long id) {
		return orderService.getOrder(id);
	}

}
