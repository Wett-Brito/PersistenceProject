package Controllers;

import Entities.Consumer;
import Repositories.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/consumers")
public class ConsumerControler {

    @Autowired
    ConsumerRepository repository;

    @GetMapping
    public List<Consumer> getAll(){
        return repository.findAll();
    }

    @PostMapping()
    public Consumer getAll(@RequestBody Consumer consumer){
        return repository.save(consumer);
    }
}
