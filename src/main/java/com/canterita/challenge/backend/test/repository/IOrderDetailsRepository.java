//Creado por: Mauro Clavijo
//Fecha: 19/07/2021

package com.canterita.challenge.backend.test.repository;

import com.canterita.challenge.backend.test.model.OrderDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;


public interface IOrderDetailsRepository extends JpaRepository<OrderDetailsEntity, Long>, QuerydslPredicateExecutor<OrderDetailsEntity> {

}
