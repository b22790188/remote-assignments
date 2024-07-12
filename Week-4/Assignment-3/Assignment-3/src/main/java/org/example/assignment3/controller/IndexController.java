package org.example.assignment3.controller;

import jakarta.validation.Valid;
import org.example.assignment3.DTO.UserDto;
import org.example.assignment3.model.AuthResult;
import org.example.assignment3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;


@Controller
@Validated
@RequestMapping("/")
public class IndexController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public String index(@ModelAttribute("message") String message, Model model){
        model.addAttribute("message", message);
        return "index";
    }

    @PostMapping("/login")
    public RedirectView postSignup(@Valid UserDto userDto, RedirectAttributes redirectAttributes){
        AuthResult result = userService.login(userDto);
        redirectAttributes.addFlashAttribute("message", result.getMessage());
        return new RedirectView("/"+result.getFilePath());
    }
}
