package com.project.SnakeProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MedicalController {
    @GetMapping("/information")
    public String Medical(){
        return "content/information";
    }
}
