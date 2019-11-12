package ru.pavel_zhukoff.desk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.pavel_zhukoff.desk.entity.User;
import ru.pavel_zhukoff.desk.form.UserForm;
import ru.pavel_zhukoff.desk.service.UserService;
import ru.pavel_zhukoff.desk.utils.Utils;

import javax.validation.Valid;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String registerUser(Model model) {
        model.addAttribute("user", new UserForm());
        return "userRegister";
    }

    @PostMapping("/register")
    public String registerUser(@Valid UserForm user, BindingResult result, Model model) {
        model.addAttribute("user", user);
        if (result.hasErrors()) {
            model.addAttribute("noErrors", false);
            for (FieldError fe: result.getFieldErrors()) {
                model.addAttribute(String.format("%sError", fe.getField()) , fe.getDefaultMessage());
            }
            return "userRegister";
        }
        User newUser = new User();
        newUser.setUsername(user.getUsername());
        newUser.setEmail(user.getEmail());
        try {
            newUser.setPassword(Utils.hash(user.getPassword(), user.getUsername()));
        } catch ( NoSuchAlgorithmException ex) {
            System.out.println(ex.getMessage());
        }
        newUser.setDate(new Date());
        userService.save(newUser);
        return "redirect:/";
    }

    @GetMapping("/enter")
    public String enterUser(Model model) {
        return "userEnter";
    }
}
