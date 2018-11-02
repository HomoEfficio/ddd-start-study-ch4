package io.homo.efficio.study.dddstart.chapter4.order.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author homo.efficio@gmail.com
 * created on 2018-11-02
 */
@Getter
@Embeddable
public class Address {

    private String zipCode;

    @Column(name = "shipping_addr1")
    private String address1;

    @Column(name = "shipping_addr2")
    private String address2;

    public Address(String zipCode, String address1, String address2) {
        this.zipCode = zipCode;
        this.address1 = address1;
        this.address2 = address2;
    }
}
