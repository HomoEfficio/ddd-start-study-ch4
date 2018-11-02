package io.homo.efficio.study.dddstart.chapter4.order.domain;

import lombok.Getter;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author homo.efficio@gmail.com
 * created on 2018-11-02
 */
@Getter
@Embeddable
public class Orderer {

    @AttributeOverrides(
            @AttributeOverride(name = "id", column = @Column(name = "orderer_id"))
    )
    private MemberId memberId;

    @Column(name = "orderer_name")
    private String name;

    public Orderer(MemberId memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }
}
