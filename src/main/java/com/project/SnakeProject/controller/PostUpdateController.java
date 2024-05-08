package com.project.SnakeProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostUpdateController {
  @GetMapping("/postUpdate")
  public String home(Model model){
    model.addAttribute("title", "게시글 수정");
    return "content/postUpdate";
  }
}