package com.project.SnakeProject.mapper;

import com.project.SnakeProject.vo.CommunityCategoryVo;
import com.project.SnakeProject.vo.CommunityVo;
import com.project.SnakeProject.vo.TogetherStudyVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommunityMapper {
  List<CommunityVo> ViewCommunity();
  List<CommunityCategoryVo> ViewCommunityCategory();
  List<TogetherStudyVo> ViewTogetherStudy();
}
