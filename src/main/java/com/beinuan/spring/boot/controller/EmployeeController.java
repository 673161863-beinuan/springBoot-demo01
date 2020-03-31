package com.beinuan.spring.boot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {


    @RequestMapping("/get/message")
    public String getMessage(){

        return "my first SpringBoot helloWorld !!!";
    }


}
