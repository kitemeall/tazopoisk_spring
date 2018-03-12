package com.example.tazopoisk.service;


import com.example.tazopoisk.entity.User;
import com.example.tazopoisk.repository.DataRepository;
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
    private DataRepository dataRepository;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public @ResponseBody
    User test (@RequestParam(value = "name")String name ) {

        User me = new User(null, name, "Petrov");
        dataRepository.persist(me);
        LOG.log(Level.WARNING, "HELLO HOW ARE YOU?");
        return  me;

    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public @ResponseBody User go (@RequestBody User user) {

        dataRepository.persist(user);
        System.out.println(user);
        return user;
    }

    @RequestMapping(value = "/int")
    public @ResponseBody Integer inte () {

        a ++;
        return  a;
    }


}
