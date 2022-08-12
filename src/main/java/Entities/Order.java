package Entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity

public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String name;

    @ManyToOne
    @JoinColumn(name = "product_id")
    @Getter
    private List<Product> product;

    @OneToOne
    @JoinColumn(name = "consumer_id")
    @Getter
    @Setter
    private Consumer consumer;


}
