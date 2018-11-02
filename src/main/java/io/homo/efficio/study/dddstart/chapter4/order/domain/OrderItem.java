package io.homo.efficio.study.dddstart.chapter4.order.domain;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

/**
 * @author homo.efficio@gmail.com
 * created on 2018-11-02
 */
@Embeddable
public class OrderItem {

    @Embedded
    private ProductId productId;

    private Long price;

    private Integer quantity;

    private Integer amounts;

    protected OrderItem() {
    }

    public OrderItem(ProductId productId, Long price, Integer quantity, Integer amounts) {
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
        this.amounts = amounts;
    }
}
