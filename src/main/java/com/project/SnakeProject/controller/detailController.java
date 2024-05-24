package com.project.SnakeProject.controller;

import com.project.SnakeProject.mapper.StudyInPareMapper;
import com.project.SnakeProject.service.StudyInPareService;
import com.project.SnakeProject.vo.BoardVo;
import com.project.SnakeProject.vo.StudyInPareVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class detailController {

    @Autowired
    private StudyInPareService studyInPareService;

    @GetMapping("/detail")
    public String detail(Model model) {
        List<StudyInPareVo> typeList = new ArrayList<>();
        List<StudyInPareVo> selectList1 = new ArrayList<>();
        List<StudyInPareVo> selectList2 = new ArrayList<>();

        typeList.addAll(studyInPareService.typeList());
        selectList1.addAll(studyInPareService.selectList1());
        selectList2.addAll(studyInPareService.selectList2());

        String type1 = typeList.get(0).getSIPName();
        String type2 = typeList.get(1).getSIPName();

        model.addAttribute("type1", type1);
        model.addAttribute("type2", type2);
        model.addAttribute("selectList1", selectList1);
        model.addAttribute("selectList2", selectList2);

        model.addAttribute("title", "요금정보");
        return "content/detail";
    }
}
