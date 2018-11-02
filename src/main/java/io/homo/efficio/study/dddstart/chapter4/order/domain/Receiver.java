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
public class Receiver {

//    @Column(name = "receiver_name")
    private String name;

//    @Column(name = "receiver_phone")
    private String phone;

    public Receiver(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}
