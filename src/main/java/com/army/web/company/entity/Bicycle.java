package com.army.web.company.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
public class Bicycle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bicycleSeq;
    @Column private String title;
    @Column private String image;
    @Column private String year;
    @Column private String price;

}
