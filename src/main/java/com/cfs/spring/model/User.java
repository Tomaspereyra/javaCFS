package com.cfs.spring.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;


}
