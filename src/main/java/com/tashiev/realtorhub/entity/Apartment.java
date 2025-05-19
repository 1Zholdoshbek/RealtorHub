package com.tashiev.realtorhub.entity;


import com.tashiev.realtorhub.entity.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;


@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "apartments")
public class Apartment extends BaseEntity {

    private String title;
    private String location;
    private BigDecimal price;
    private int rooms;

    @ManyToOne
    private User postedBy;

}
