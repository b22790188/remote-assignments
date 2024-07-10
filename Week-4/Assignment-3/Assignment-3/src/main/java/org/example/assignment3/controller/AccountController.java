package org.example.assignment3.controller;

import org.example.assignment3.DTO.UserDto;
import org.example.assignment3.model.RegistrationResult;
import org.example.assignment3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private UserService userService;

    @GetMapping("/signup")
    public String getSignup(@ModelAttribute("message") String message, Model model){
        model.addAttribute("message", message);
        System.out.println(message);
        return "signup";
    }

    @PostMapping("/signup")
    public ModelAndView postSignup(@ModelAttribute UserDto userDto, RedirectAttributes redirectAttributes){
        RegistrationResult result = userService.signup(userDto);
        redirectAttributes.addFlashAttribute("message", result.getMessage());
        return new ModelAndView("redirect:/account/"+result.getTemplateName());
    }

    @GetMapping("/member")
    public String getMember(@ModelAttribute("message") String message,  Model model){
        model.addAttribute(message);
        return "member";
    }
}
