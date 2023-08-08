package com.projeto1.CRUD.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto1.CRUD.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

