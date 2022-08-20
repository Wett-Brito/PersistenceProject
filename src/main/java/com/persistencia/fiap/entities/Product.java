package com.persistencia.fiap.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="products")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
    private Long id;

    private String name;

    private int inventory;

    private Double price;
    
    @ManyToOne(targetEntity = Order.class, fetch=FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="order_id")
    @JsonIgnore
    private List<Order> orders;

	public Product(Long id, String name, int inventory, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.inventory = inventory;
		this.price = price;
	} 


    
    
}
