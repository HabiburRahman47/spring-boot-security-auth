package com.petproject.springsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "hello habib";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }
}