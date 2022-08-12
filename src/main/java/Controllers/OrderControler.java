package Controllers;

import Entities.Consumer;
import Entities.Order;
import Repositories.ConsumerRepository;
import Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
