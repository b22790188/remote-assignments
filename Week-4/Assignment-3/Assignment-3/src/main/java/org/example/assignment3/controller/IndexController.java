package org.example.assignment3.controller;

import org.example.assignment3.DTO.UserDto;
import org.example.assignment3.model.User;
import org.example.assignment3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/signup")
    public String getSignup(){
        return "signup";
    }

    @PostMapping("/signup")
    public String postSignup(@ModelAttribute UserDto userDto, Model model){
        String signupMessage = userService.signup(userDto);
        model.addAttribute("message", signupMessage);
        return "signup";
    }

}
