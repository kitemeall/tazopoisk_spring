package com.example.tazopoisk.service;


import com.example.tazopoisk.entity.User;
import com.example.tazopoisk.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@Controller
@RequestMapping("/my")
public class MyService {

    private static final Logger LOG = Logger.getLogger(MyService.class.getName());

    @Autowired
    private DataRepository dataRepository;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public @ResponseBody
    User test () {

        User me = new User(null, "Vasya", "Petrov");
        dataRepository.persist(me);
        return  me;

    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public @ResponseBody User go (@RequestBody User user) {

        dataRepository.persist(user);
        System.out.println(user);
        return user;
    }


}
