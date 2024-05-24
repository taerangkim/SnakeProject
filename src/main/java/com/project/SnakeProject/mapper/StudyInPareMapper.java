package com.project.SnakeProject.mapper;

import com.project.SnakeProject.vo.StudyInPareVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudyInPareMapper {
    List<StudyInPareVo> typeList();

    List<StudyInPareVo> selectList1();
    List<StudyInPareVo> selectList2();
}
