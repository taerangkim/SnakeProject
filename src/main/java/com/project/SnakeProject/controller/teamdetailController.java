package com.project.SnakeProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class teamdetailController {
  @GetMapping("/teamdetail")
  public String teamdetail(Model model){
    model.addAttribute("title", "스터디 룸");
    return "content/teamdetail";
  }
}