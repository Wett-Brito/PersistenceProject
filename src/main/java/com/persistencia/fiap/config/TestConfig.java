package com.persistencia.fiap.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.persistencia.fiap.entities.Consumer;
import com.persistencia.fiap.entities.Order;
import com.persistencia.fiap.entities.Product;
import com.persistencia.fiap.repositories.ConsumerRepository;
import com.persistencia.fiap.repositories.OrderRepository;
import com.persistencia.fiap.repositories.ProductRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private ConsumerRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private ProductRepository productRepository;

	
	@Override
	public void run(String... args) throws Exception {

		
		Product p1 = new Product(null, "Notebook", 10, 1455.99);
		Product p2 = new Product(null, "Mouse", 30, 55.99);
		Product p3 = new Product(null, "TV", 3, 999.99);
		
		Consumer c1 = new Consumer(null, "Joao", "Rua teste, 154");
		Consumer c2 = new Consumer(null, "Maria", "Avenida paulista, 5001");
				
		Order o1 = new Order(null ,Arrays.asList(p1), c1);
		Order o2 = new Order(null, Arrays.asList(p2), c2);
		
		userRepository.saveAll(Arrays.asList(c1, c2));
		productRepository.saveAll(Arrays.asList(p1, p2, p3));
		orderRepository.saveAll(Arrays.asList(o1, o2));
		
		c1.setOrder(o1);
		c2.setOrder(o2);

		userRepository.saveAll(Arrays.asList(c1, c2));
		
//		p1.setOrders(Arrays.asList(o1));
//		p2.setOrders(Arrays.asList(o1,o2));
//		p3.setOrders(Arrays.asList(o2));
//
//		productRepository.saveAll(Arrays.asList(p1, p2, p3));

	}
}
