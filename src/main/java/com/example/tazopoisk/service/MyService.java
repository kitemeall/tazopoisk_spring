package com.example.tazopoisk.service;


import com.example.tazopoisk.entity.User;
import com.example.tazopoisk.repository.DataRepository;
import com.example.tazopoisk.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/my")
public class MyService {

    private static final Logger LOG = Logger.getLogger(MyService.class.getName());

    private  Integer a = 10;

    @Autowired
    private UserRepository dataRepository;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public @ResponseBody
    User test (@RequestParam(value = "name")String name ) {

        User me = new User(null, name, "Petrov");
        dataRepository.save(me);
        LOG.log(Level.WARNING, "HELLO HOW ARE YOU?");
        return  me;

    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public @ResponseBody User go (@RequestBody User user) {

        dataRepository.save(user);
        System.out.println(user);
        return user;
    }

    @RequestMapping(value = "/all")
    public  Iterable<User> all () {
        return dataRepository.findAll();
    }


}
