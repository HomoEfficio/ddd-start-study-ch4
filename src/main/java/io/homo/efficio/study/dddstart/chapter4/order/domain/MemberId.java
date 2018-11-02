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
public class MemberId implements Serializable {

    @Column(name = "member_id")
    private String id;

    protected MemberId() {
    }

    public MemberId(String id) {
        this.id = id;
    }
}
