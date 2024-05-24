package com.project.SnakeProject.controller;

import com.project.SnakeProject.service.MemberService;
import com.project.SnakeProject.vo.MemberVo;
import jakarta.servlet.http.HttpServletRequest;
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
    public String home(MemberVo memberVo, Model model, HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        String name = memberService.login(memberVo, session);
        if(name != null) {
            session.setAttribute("username",name);
            model.addAttribute("msg", name + "님 로그인이 완료되었습니다.");
            model.addAttribute("url", "/");
            // test
            // 백지민 깃허브 테스트
            return "content/alert";
        } else {
            model.addAttribute("msg", "아이디가 맞지 않거나 회원정보가 없습니다.");
            model.addAttribute("url", "/");
            return "content/alert";
        }
    }
}