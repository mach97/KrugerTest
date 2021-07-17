package com.canterita.challenge.backend.test.service;

import com.canterita.challenge.backend.test.dto.OrderDetailsDto;
import com.canterita.challenge.backend.test.dto.request.OrderDetailsRequest;
import com.canterita.challenge.backend.test.model.OrderDetailsEntity;

import java.util.List;

public interface IOrderDetailsService {
	
	public List<OrderDetailsEntity> getOrderDetails(Long id);

	OrderDetailsDto postOrderDetails(Long id, OrderDetailsRequest request);
}