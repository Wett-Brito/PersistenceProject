package Controllers;

import Entities.Consumer;
import Entities.Order;
import Entities.Product;
import Repositories.ConsumerRepository;
import Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductControler {

    @Autowired
    ProductRepository repository;

    @GetMapping
    public List<Product> getAll(){
        return repository.findAll();
    }

    @PostMapping()
    public Product getAll(@RequestBody Product product){
        return repository.save(product);
    }
}
