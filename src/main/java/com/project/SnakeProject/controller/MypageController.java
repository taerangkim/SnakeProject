package com.project.SnakeProject.controller;

import com.project.SnakeProject.service.MemberService;
import com.project.SnakeProject.vo.MemberVo;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class MypageController {
    @Autowired
    private MemberService memberService;

    @RequestMapping(value="/mypage", method = RequestMethod.GET)
    public String mypage(String id, Model model, HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        if(session.getAttribute("userid") != null) {
            MemberVo member = memberService.selectInfo(id);
            model.addAttribute("data", member);

            return "content/mypage";
        } else {
            model.addAttribute("msg", "비정상 접근입니다.");
            model.addAttribute("url", "/");
            return "content/alert";

        }
    }
    @PostMapping("/MemberUpdate")
//    @RequestMapping(value="/MemberUpdate/{id}", method = RequestMethod.POST)
    public String updateInfo(@RequestParam(value="id") String id, MemberVo member, Model model) throws Exception {
        member.setMemberId(id);
//        int result = memberService.updateInfo(member);

        if(memberService.updateInfo(member) > 0) {
            model.addAttribute("msg", "개인정보가 수정되었습니다.");
            model.addAttribute("url", "/mypage?id=" + id);
            return "content/alert";
        } else {
            model.addAttribute("msg", "개인정보 수정에 실패하였습니다.");
            model.addAttribute("url", "/mypage");
            return "content/alert";
        }
    }
}
