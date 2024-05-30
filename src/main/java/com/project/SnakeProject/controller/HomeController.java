package com.project.SnakeProject.controller;

import com.project.SnakeProject.service.MemberService;
import com.project.SnakeProject.service.impl.MemberServiceImpl;
import com.project.SnakeProject.service.impl.StudyInfoServiceImpl;
import com.project.SnakeProject.vo.MemberVo;
import com.project.SnakeProject.vo.StudyGImgVo;
import com.project.SnakeProject.vo.StudyGInfoVo;
import com.project.SnakeProject.vo.StudyInInfoVo;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private MemberServiceImpl memberService;
    @Autowired
    private StudyInfoServiceImpl studyInfoImpl;

    @RequestMapping("/")
    public String home(Model model){
        List<StudyInInfoVo> SIItables = studyInfoImpl.ViewStudyInInfo();
        List<StudyGInfoVo> SGItables = studyInfoImpl.ViewStudyGInfo();
        List<StudyGImgVo> SGImgtables = studyInfoImpl.ViewStudyGImg();

        List<List<StudyInInfoVo>> groupedSIItables = new ArrayList<>();
        for (int i = 0; i < SIItables.size(); i += 6) {
            int end = Math.min(i + 6, SIItables.size());
            groupedSIItables.add(SIItables.subList(i, end));
        }

        model.addAttribute("ViewStudyInInfo", groupedSIItables);
        model.addAttribute("ViewStudyGInfo", SGItables);
        model.addAttribute("ViewStudyGImg", SGImgtables);
        model.addAttribute("title", "JAVA스터디");
        return "content/home";
    }

    @PostMapping("/updateSeat")
    public ResponseEntity<Integer> updateSeat(Integer selectId) {
        ResponseEntity<Integer> r = null;

        int result = 0;
        if(studyInfoImpl.UpdateStudyInInfo(selectId) > 0) {
            result = 1;
        } else {
            result = 0;
        }
        return new ResponseEntity<Integer>(result, HttpStatus.OK);

//        return int(result, HttpStatus.OK);
    }

    @PostMapping("/login")
    public String home(MemberVo memberVo, Model model, HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        String name = memberService.login(memberVo, session);
        if(name != null) {
            session.setAttribute("userid", memberVo.getMemberId());
            session.setAttribute("username", name);

            model.addAttribute("msg", name + "님 로그인이 완료되었습니다.");
            model.addAttribute("url", "/");
            // testtt
            return "content/alert";
        } else {
            model.addAttribute("msg", "아이디가 맞지 않거나 회원정보가 없습니다.");
            model.addAttribute("url", "/");
            return "content/alert";
        }
    }

    @RequestMapping(value="logout.do", method=RequestMethod.GET)
    public String logout(HttpServletRequest request, Model model) throws Exception {
        HttpSession session = request.getSession();
        session.invalidate();

        model.addAttribute("msg", "로그아웃 되었습니다.");
        model.addAttribute("url", "/");
        return "content/alert";
    }
}