package com.sosocafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class sosoController {

    @GetMapping("/sosomain")
    public String sosomain() {
        return "sosomain";
    }

    @GetMapping("/map")
    public String sosomap() {
        return "map";
    }

    @GetMapping("/login")
    public String login() {
        //if login !=0
        return "login";
    }

    @GetMapping("/join")
    public String join(){
        return "join";
    }
}
