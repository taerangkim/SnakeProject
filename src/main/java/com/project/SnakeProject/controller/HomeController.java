package com.project.SnakeProject.controller;

import com.project.SnakeProject.service.MemberService;
import com.project.SnakeProject.vo.MemberVo;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @Autowired
    MemberService memberService;
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("title", "JAVA스터디");
        return "content/home";
    }

    @PostMapping("/login")
    public String login(MemberVo memberVo, Model model, HttpSession session) throws Exception {
        if(memberVo != null) {
            session.setAttribute("memberName", memberVo);

            model.addAttribute("msg", "로그인이 완료되었습니다.");
            model.addAttribute("url", "/");
            return "content/alert";
        } else {
            model.addAttribute("msg", "아이디가 맞지 않거나 회원정보가 없습니다.");
            model.addAttribute("url", "/");
            return "content/alert";
        }
    }

}