package com.army.web.company.entity;

import lombok.Data;

import javax.persistence.*;


@Entity @Data
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long memberSeq;
    @Column private String name;
    @Column private String email;
    @Column private String password;
}
