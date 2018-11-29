package com.leyou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class UserController {

    @RequestMapping("/user")
    public  String item(){
        return "hello";
    }
}
