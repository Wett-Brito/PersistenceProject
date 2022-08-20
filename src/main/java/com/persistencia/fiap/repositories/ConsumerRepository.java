package com.persistencia.fiap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistencia.fiap.entities.Consumer;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer, Long>{
}
