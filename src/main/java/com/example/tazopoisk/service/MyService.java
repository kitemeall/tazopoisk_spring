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
    String test () {

        User me = new User(10, "Vasya", "Petrov");
        dataRepository.persist(me);

        return "hello world! ";
    }


}
