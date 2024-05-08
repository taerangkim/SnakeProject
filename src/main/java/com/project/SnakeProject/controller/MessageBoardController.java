package com.project.SnakeProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageBoardController {
    @GetMapping("/messageBoard")
    public String Order(Model model) {
        model.addAttribute("title", "게시판");
        return "content/messageBoard";
    }
}
