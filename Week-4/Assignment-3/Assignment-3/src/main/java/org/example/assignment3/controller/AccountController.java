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
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@Validated
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private UserService userService;

    /**
     *
     * @param message message shows that if signUp is successful or not.
     */
    @GetMapping("/signup")
    public String getSignup(@ModelAttribute("message") String message){
        return "signup";
    }

    /**
     *
     * @param userDto - user info provided by client
     * @param redirectAttributes - used to pass attribute when redirecting.
     * @return ModelView
     */
    @PostMapping("/signup")
    public RedirectView postSignup(@Valid UserDto userDto, RedirectAttributes redirectAttributes){
        AuthResult result = userService.signup(userDto);
        redirectAttributes.addFlashAttribute("message", result.getMessage());
        return new RedirectView("/"+result.getFilePath());
    }
}
