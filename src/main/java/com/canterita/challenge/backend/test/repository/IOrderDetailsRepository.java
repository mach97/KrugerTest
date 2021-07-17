package com.canterita.challenge.backend.test.repository;

import com.canterita.challenge.backend.test.model.OrderDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface IOrderDetailsRepository extends JpaRepository<OrderDetailsEntity, Long>, QuerydslPredicateExecutor<OrderDetailsEntity> {

}
