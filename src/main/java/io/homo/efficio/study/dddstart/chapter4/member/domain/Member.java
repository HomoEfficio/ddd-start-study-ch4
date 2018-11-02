package io.homo.efficio.study.dddstart.chapter4.member.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author homo.efficio@gmail.com
 * created on 2018-11-02
 */
@Getter
@Setter
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    private String name;

    private String email;

    private String address;
}
