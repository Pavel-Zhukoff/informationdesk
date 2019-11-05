package ru.pavel_zhukoff.desk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.pavel_zhukoff.desk.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/register")
    public String registerUser(Model model) {
        return "userRegister";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {
        return "redirect:/";
    }

    @GetMapping("/enter")
    public String enterUser(Model model) {
        return "userEnter";
    }
}
