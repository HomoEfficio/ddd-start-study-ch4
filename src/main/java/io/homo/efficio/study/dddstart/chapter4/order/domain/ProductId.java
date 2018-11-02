package io.homo.efficio.study.dddstart.chapter4.order.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * @author homo.efficio@gmail.com
 * created on 2018-11-02
 */
@Getter
@Embeddable
public class ProductId implements Serializable {

    @Column(name = "product_id")
    private Long id;

    protected ProductId() {
    }

    public ProductId(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
