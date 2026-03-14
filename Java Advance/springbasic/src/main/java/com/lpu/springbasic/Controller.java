package com.lpu.springbasic;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Controller {
    @GetMapping("/demo")
    public String demo(){
        return "Hi i am triggered by springboot";
    }

    @PostMapping("/demo1")
    public String demo1(@RequestParam String name){
        return "Name is "+name + " and i am response of post request";
    }


    @PostMapping("/demo2/{id}")
    public String demo2(@PathVariable int id){
        return "Id is "+id;
    }

    @PutMapping("/demo3")
    public Student demo3(@RequestBody Student student){
        return student;
    }
}
