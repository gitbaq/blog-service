package com.sba.blogservice.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class BlogController {
    @GetMapping
    public String hello(){
        return "Alhamdolillah Rabbil Alameen";
    }

    @GetMapping("/msg")
    public String message(@RequestParam String msg){
        return "Message received: " + msg;
    }
}
