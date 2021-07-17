package com.canterita.challenge.backend.test.service;


import com.canterita.challenge.backend.test.dto.OrderDetailsDto;
import com.canterita.challenge.backend.test.dto.request.OrderDetailsRequest;
import com.canterita.challenge.backend.test.model.OrderDetailsEntity;
import com.canterita.challenge.backend.test.model.QOrderDetailsEntity;
import com.canterita.challenge.backend.test.repository.IOrderDetailsRepository;
import com.querydsl.core.support.FetchableQueryBase;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class OrderDetailsService implements IOrderDetailsService{

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private IOrderDetailsRepository IOrderDetailsRepository;

	@Override
	public List<OrderDetailsEntity> getOrderDetails(Long id) {
		JPAQuery query = new JPAQuery(entityManager);
		System.out.println("Hola");
		QOrderDetailsEntity detail = QOrderDetailsEntity.orderDetailsEntity;
		FetchableQueryBase result = (FetchableQueryBase) query.from(detail).where(detail.idOrder.eq(id));

		return result.fetch();
		//return IOrderDetailsRepository.findAll();
				//.stream().filter(orderDetailsEntity -> orderDetailsEntity.getIdOrder().equals(id));
				//.map(order -> new OrderDetailsDto(order.getId(), order.getIdOrder(), order.getDetail(), order.getCantidad(), order.getPrecioUnitario(), order.getTotalDetail()));
				//.orElse(null);
	}

	@Override
	public OrderDetailsDto postOrderDetails(Long id, OrderDetailsRequest request) {
		OrderDetailsEntity detail = new OrderDetailsEntity();
		detail.setIdOrder(id);
		detail.setDetail(request.getDetail());
		detail.setTotalDetail(request.getTotalDetail());
		detail.setCantidad(request.getCantidad());
		detail.setPrecioUnitario(request.getPrecioUnitario());
		IOrderDetailsRepository.save(detail);
		detail.setDetail(request.getDetail());
		return null;
	}

}
