package com.project.SnakeProject.service;

import com.project.SnakeProject.mapper.MemberMapper;
import com.project.SnakeProject.vo.MemberVo;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;
import java.util.Map;


@Service
public class MemberService {
    @Autowired
    MemberMapper memberMapper;
    public int addMember(MemberVo memberVo) {
        return memberMapper.addMember(memberVo);
    }

    public boolean selectId(String id) {
        return memberMapper.selectId(id);
    }

    public String login(MemberVo memberVo, HttpSession session) {
        return memberMapper.login(memberVo);
    }

    public MemberVo selectInfo(String id) {
        return memberMapper.selectInfo(id);
    }

    public int updateInfo(MemberVo member) {
        return memberMapper.updateInfo(member);
    }
}
