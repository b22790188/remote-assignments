package org.example.assignment3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

    @GetMapping()
    public String getMember(@ModelAttribute("message") String message, Model model) {
        model.addAttribute(message);
        return "member";
    }
}
