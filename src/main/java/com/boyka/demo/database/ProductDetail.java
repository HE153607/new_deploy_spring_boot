package com.boyka.demo.database;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@Table(name = "product_detail")
public class ProductDetail {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn()
    @Column(name = "product_id")
    private String productId;

    private int price;

    private int amount;
}
