package com.tts.twooter.controller;

import com.tts.twooter.model.User;
import com.tts.twooter.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorizationController {

    private UserService userService;

    public AuthorizationController(UserService userService){
        this.userService = userService;
    }

    @GetMapping(value="/signup")
    public String registration(Model model){
        User user = new User();
        model.addAttribute("user", user);

        return "registration";
    }
}
