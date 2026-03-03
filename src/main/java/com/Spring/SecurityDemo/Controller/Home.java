package com.Spring.SecurityDemo.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @GetMapping("/")
    public String greet(HttpServletRequest request){
        return "Session Id : "+ request.getSession().getId();

    }
}
