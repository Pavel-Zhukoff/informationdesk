package ru.pavel_zhukoff.desk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.pavel_zhukoff.desk.entity.User;
import ru.pavel_zhukoff.desk.service.DeskService;
import ru.pavel_zhukoff.desk.service.UserService;

@Controller
@RequestMapping("/")
public class DeskController {

    @Autowired
    private UserService userService;

    @Autowired
    private DeskService deskService;

    @RequestMapping("/")
    public String index(Model model) {
  
        return "index";
    }

    @RequestMapping("/user/{id}")
    public String user(@PathVariable("id") String id, Model model) {
        if (!id.matches("\\d+")) return "redirect:/";
        model.addAttribute("user", userService.findById(Integer.parseInt(id)));
        return "user";
    }
}
