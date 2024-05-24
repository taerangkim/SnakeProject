package com.project.SnakeProject.service;

import com.project.SnakeProject.mapper.StudyInPareMapper;
import com.project.SnakeProject.vo.StudyInPareVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyInPareService {
    @Autowired
    StudyInPareMapper mapper;

    public List<StudyInPareVo> typeList() {
        return mapper.typeList();
    };
    public List<StudyInPareVo> selectList1() {
        return mapper.selectList1();
    };
    public List<StudyInPareVo> selectList2() {
        return mapper.selectList2();
    };
}
