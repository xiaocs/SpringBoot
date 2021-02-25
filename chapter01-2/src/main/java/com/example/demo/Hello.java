package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alan Chen
 * @description hellojava
 * @date 2021/2/25
 */
@RestController
public class Hello {
    @GetMapping(value="/hello")
    public String hello(){
        return "Hello StringBoot!";
    }
}
