package com.canterita.challenge.backend.test.repository;

import com.canterita.challenge.backend.test.model.OrderDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IOrderDetailsRepository extends JpaRepository<OrderDetailsEntity, Long> {
List<OrderDetailsEntity> findByOrderId(Long id);
}
