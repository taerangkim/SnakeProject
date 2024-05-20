package com.project.SnakeProject.service;

import com.project.SnakeProject.mapper.MemberMapper;
import com.project.SnakeProject.vo.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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

    public String login(MemberVo memberVo) {
        return memberMapper.login(memberVo);
    }
}
