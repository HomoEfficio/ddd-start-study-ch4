package io.homo.efficio.study.dddstart.chapter4.product.domain;

import lombok.Getter;

import javax.persistence.*;

/**
 * @author homo.efficio@gmail.com
 * created on 2018-11-02
 */
@Getter
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    private String name;
}
