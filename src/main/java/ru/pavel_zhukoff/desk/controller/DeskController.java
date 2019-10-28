package ru.pavel_zhukoff.desk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.pavel_zhukoff.desk.entity.Desk;
import ru.pavel_zhukoff.desk.entity.User;
import ru.pavel_zhukoff.desk.service.DeskService;
import ru.pavel_zhukoff.desk.service.UserService;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/")
public class DeskController {

    @Autowired
    private UserService userService;

    @Autowired
    private DeskService deskService;

    @RequestMapping("/")
    public String index(Model model) {
        List<Desk> desks = deskService.findAll();
        List<User> users = userService.findAll();
        List<HashMap<String, String>> authors = new ArrayList<>();
        HashMap<Integer, Integer> pubs = new HashMap<>();
        for (Desk desk: desks) {
            desk.setAuthorUser(userService.findById(desk.getAuthor()));
        }
        for (User user: users) {
            HashMap<String, String> author = new HashMap<>();
            author.put("id", String.valueOf(user.getUserId()));
            author.put("username", user.getUsername());
            author.put("email", user.getEmail());
            author.put("register", String.valueOf(user.getDate()));
            author.put("pubCount", String.valueOf(deskService.findAllByUser(user).size()));
            authors.add(author);
        }
        model.addAttribute("desks", desks);
        model.addAttribute("users", authors);
        return "index";
    }

    @RequestMapping("/user/{id}")
    public String user(@PathVariable("id") String id, Model model) {
        if (!id.matches("\\d+")) return "redirect:/";
        model.addAttribute("user", userService.findById(Integer.parseInt(id)));
        return "user";
    }
}
