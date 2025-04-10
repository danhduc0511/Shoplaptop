package com.project.LaptopShop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index(){
        return "hello world from spring boot with  ducc ";
    }

@GetMapping("/user")
    public String userPage(){
        return "only userr access this page ";
    }
@GetMapping("/admin")
    public String adminPage(){
        return "only admin access this page";
    }
}
