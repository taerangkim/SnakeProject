package com.project.SnakeProject.mapper;

import com.project.SnakeProject.vo.MemberVo;
import jakarta.servlet.http.HttpSession;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MemberMapper {
    public int addMember(MemberVo memberVo);
    public boolean selectId(String Id);
    public String login(MemberVo memberVo);
//    public String login(MemberVo memberVo, HttpSession session);
    public void logout(HttpSession session);
}
