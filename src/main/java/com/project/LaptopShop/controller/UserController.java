package com.project.LaptopShop.controller;

import com.project.LaptopShop.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {
    private UserService userService;

    //dependency injection
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getPageHome(){
       String test = userService.hello();
        return "hello";
    }
}
//@RestController
//public class UserController{
//    private UserService userService;
//
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping("")
//    public String getPageHome(){
//        return this.userService.hello();
//    }
//}
