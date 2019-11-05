package ru.pavel_zhukoff.desk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.pavel_zhukoff.desk.entity.Desk;
import ru.pavel_zhukoff.desk.entity.User;
import ru.pavel_zhukoff.desk.service.DeskService;
import ru.pavel_zhukoff.desk.service.UserService;

import java.util.*;

@Controller
@RequestMapping("/")
public class DeskController {

    @Autowired
    private UserService userService;

    @Autowired
    private DeskService deskService;

    @RequestMapping("/")
    public String index(Model model) {
        List<User> users = userService.findAll();
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.add(Calendar.MONTH, -1);
        List<Desk> desks = deskService.findByDateSince(calendar.getTime());
        List<HashMap<String, Object>> authors = new ArrayList<>();
        for (Desk desk: desks) {
            desk.setAuthorUser(userService.findById(desk.getAuthor()));
        }
        for (User user: users) {
            HashMap<String, Object> author = new HashMap<>();
            author.put("id", user.getUserId());
            author.put("username", user.getUsername());
            author.put("email", user.getEmail());
            author.put("register", user.getDate());
            int count = 0;
            for (Desk desk: desks) {
                if (desk.getAuthor() == user.getUserId()) count++;
            }
            author.put("pubCount", count);
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
