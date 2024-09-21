package com.muskaanproject.springboot_demo.controller;
import com.muskaanproject.springboot_demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//return json
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Hello home";
    }


    @GetMapping("/user")
    public User userData() {
        User user = new User();
        user.setId("1");
        user.setName("muskaan");
        user.setEmailId("shiwangidalakoti@gmail.com");

        return user;
    }

    @GetMapping("/user/{id}")
    public String userById(@PathVariable String id) {
        return "user id is should :" + id;
    }

    @GetMapping("/requestParam")
    public String requestParam(@RequestParam String name ,@RequestParam  (required = false, defaultValue = "muskan@gmail")String emailId) {

        return "your name is "+name+"and email id is "+emailId;
    }
}