package io.homo.efficio.study.dddstart.chapter4.order.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author homo.efficio@gmail.com
 * created on 2018-11-02
 */
@Getter
@Entity
@Table(name = "purchase_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    @Embedded
    private Orderer orderer;

    @Embedded
    private ShippingInfo shippingInfo;

    @ElementCollection
//    @CollectionTable(name = "order_item", joinColumns = { @JoinColumn(name = "order_id") })
//    @OrderColumn(name = "item_idx")
    private List<OrderItem> orderItems = new ArrayList<>();

    public Order(Orderer orderer, ShippingInfo shippingInfo, List<OrderItem> orderItems) {
        this.orderer = orderer;
        this.shippingInfo = shippingInfo;
        this.orderItems.addAll(orderItems);
    }
}
