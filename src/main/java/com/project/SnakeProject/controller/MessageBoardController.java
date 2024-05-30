package com.project.SnakeProject.controller;

import com.project.SnakeProject.service.impl.CommunityServiceImpl;
import com.project.SnakeProject.vo.CommunityCategoryVo;
import com.project.SnakeProject.vo.CommunityVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MessageBoardController {
    @Autowired
    private CommunityServiceImpl communityImpl;

    @GetMapping("/messageBoard")
    public String messageBoard(@RequestParam("groupCommunity") int parameterCommunity,
                               @RequestParam("pageGroup") int parameterPageGroup,
                               @RequestParam("category") int parameterCategory, Model model) {

        List<CommunityCategoryVo> CCtables = communityImpl.ViewCommunityCategory();
        List<CommunityVo> Ctables = communityImpl.ViewCommunity();

        List<List<CommunityCategoryVo>> groupedCCtables = new ArrayList<>();
        for(int i = 0; i < CCtables.size(); i += 6) {
            int end = Math.min(i + 6, CCtables.size());
            groupedCCtables.add(CCtables.subList(i, end));
        }

        List<List<CommunityVo>> groupedCtables = new ArrayList<>();
        for(int i = 0; i < Ctables.size(); i += 3) {
            int end = Math.min(i + 3, Ctables.size());
            groupedCtables.add(Ctables.subList(i, end));
        }

        List<List<List<CommunityVo>>> pageTables = new ArrayList<>();
        for(int i = 0; i < groupedCtables.size(); i += 3) {
            int end = Math.min(i + 3, groupedCtables.size());
            pageTables.add(groupedCtables.subList(i, end));
        }

        model.addAttribute("ViewCommunityCategory", groupedCCtables);
        model.addAttribute("ViewCommunity", groupedCtables);
        model.addAttribute("ViewpageTables", pageTables);
        model.addAttribute("parameterCommunity", parameterCommunity);
        model.addAttribute("parameterPageGroup", parameterPageGroup);
        model.addAttribute("parameterCategory", parameterCategory);

        return "content/messageBoard";
    }
}
