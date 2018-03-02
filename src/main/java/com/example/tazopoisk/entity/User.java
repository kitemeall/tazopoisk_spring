package com.example.tazopoisk.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User implements DomainObject {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;

}