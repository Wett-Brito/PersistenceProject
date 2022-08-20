package com.persistencia.fiap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistencia.fiap.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
}
