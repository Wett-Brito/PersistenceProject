package com.persistencia.fiap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persistencia.fiap.entities.Order;
import com.persistencia.fiap.repositories.OrderRepository;

@RestController
@RequestMapping(value = "/orders")
public class OrderControler {

    @Autowired
    OrderRepository repository;

    @GetMapping
    public List<Order> getAll(){
        return repository.findAll();
    }

    @PostMapping()
    public Order getAll(@RequestBody Order order){
        return repository.save(order);
    }
}
