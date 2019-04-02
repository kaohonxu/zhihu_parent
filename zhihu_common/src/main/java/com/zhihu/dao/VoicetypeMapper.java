package com.zhihu.dao;

import com.zhihu.domain.Voicetype;
import com.zhihu.domain.VoicetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VoicetypeMapper {
    long countByExample(VoicetypeExample example);

    int deleteByExample(VoicetypeExample example);

    int deleteByPrimaryKey(Integer typeid);

    int insert(Voicetype record);

    int insertSelective(Voicetype record);

    List<Voicetype> selectByExample(VoicetypeExample example);

    Voicetype selectByPrimaryKey(Integer typeid);

    int updateByExampleSelective(@Param("record") Voicetype record, @Param("example") VoicetypeExample example);

    int updateByExample(@Param("record") Voicetype record, @Param("example") VoicetypeExample example);

    int updateByPrimaryKeySelective(Voicetype record);

    int updateByPrimaryKey(Voicetype record);
}