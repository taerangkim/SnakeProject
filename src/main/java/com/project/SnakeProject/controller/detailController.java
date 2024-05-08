package com.project.SnakeProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class detailController {
    @GetMapping("/detail")
    public String detail(Model model) {
        model.addAttribute("title", "요금정보");
        return "content/detail";
    }
}
