package com.example.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zsw
 * @create 2023-02-20 14:57
 */
@RestController
public class HelloController {
    @RequestMapping("hello1")
    public String hello1(){
        return "Zsw";
    }
}
