package io.homo.efficio.study.dddstart.chapter4.order.domain;

import lombok.Getter;

import javax.persistence.*;

/**
 * @author homo.efficio@gmail.com
 * created on 2018-11-02
 */
@Getter
@Embeddable
public class ShippingInfo {

//    @Column(name = "shipping_message")
    private String message;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "zipCode", column = @Column(name = "shipping_zipcode")),
            @AttributeOverride(name = "address1", column = @Column(name = "shipping_address1"))
    })
    private Address address;

    @Embedded
    private Receiver receiver;

    public ShippingInfo(String message, Address address, Receiver receiver) {
        this.message = message;
        this.address = address;
        this.receiver = receiver;
    }
}
