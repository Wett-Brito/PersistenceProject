package com.persistencia.fiap.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="orders")
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="order_id")
	private Long id;

	@OneToMany(mappedBy = "orders")
    private List<Product> products;

	@OneToOne(mappedBy = "order")
	private Consumer consumer;

	@Override
	public String toString() {
		return "Order [id=" + id + ", products=" + products + ", consumer=" + consumer + "]";
	}

	
	
}
