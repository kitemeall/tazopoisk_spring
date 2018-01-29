package com.example.tazopoisk.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class Data implements DomainObject {

    private Integer id;
    private String firstName;
    private String lastName;

}