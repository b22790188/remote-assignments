package org.example.assignment3.controller;

import org.example.assignment3.model.User;
import org.example.assignment3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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


    @PostMapping("/handleSignUp")
    public void  handleSignUp(@RequestBody String formdata){
        System.out.println(formdata);
    }


    /**
     * test api
     */
    @ResponseBody
    @GetMapping("/test")
    public String userTest(){
        try{
            Optional<User> user = Optional.ofNullable(userService.getUserByEmail("test@gmail.com", "test123"));
            return user.map(User::getEmail).orElse("User not found");
        } catch(Exception e){
            return "Error occurred: "+e.getMessage();
        }
    }
}
