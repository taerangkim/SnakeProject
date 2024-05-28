package com.project.SnakeProject.service;

import com.project.SnakeProject.mapper.StudyPareMapper;
import com.project.SnakeProject.vo.StudyGPareVo;
import com.project.SnakeProject.vo.StudyInPareVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyPareService {
    @Autowired
    StudyPareMapper mapper;

    public List<StudyInPareVo> typeList() {
        return mapper.typeList();
    };
    public List<StudyInPareVo> selectList1() {
        return mapper.selectList1();
    };
    public List<StudyInPareVo> selectList2() {
        return mapper.selectList2();
    };
    public List<StudyGPareVo> selectList3() {
        return mapper.selectList3();
    };

}
