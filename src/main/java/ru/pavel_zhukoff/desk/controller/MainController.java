package ru.pavel_zhukoff.desk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.pavel_zhukoff.desk.service.UserService;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
