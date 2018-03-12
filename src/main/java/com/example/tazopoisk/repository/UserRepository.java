package com.example.tazopoisk.repository;


import com.example.tazopoisk.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
}
