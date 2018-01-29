package com.example.tazopoisk.repository;

import com.example.tazopoisk.entity.DomainObject;

import java.util.Set;

public interface DataRepository<V extends DomainObject> {

    void persist(V object);

    void delete(V object);


}
