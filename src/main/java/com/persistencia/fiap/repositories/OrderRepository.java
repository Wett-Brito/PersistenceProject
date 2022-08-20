package com.persistencia.fiap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistencia.fiap.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
}
