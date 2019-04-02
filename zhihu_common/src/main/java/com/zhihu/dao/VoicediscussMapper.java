package com.zhihu.dao;

import com.zhihu.domain.Voicediscuss;
import com.zhihu.domain.VoicediscussExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VoicediscussMapper {
    long countByExample(VoicediscussExample example);

    int deleteByExample(VoicediscussExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Voicediscuss record);

    int insertSelective(Voicediscuss record);

    List<Voicediscuss> selectByExample(VoicediscussExample example);

    Voicediscuss selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Voicediscuss record, @Param("example") VoicediscussExample example);

    int updateByExample(@Param("record") Voicediscuss record, @Param("example") VoicediscussExample example);

    int updateByPrimaryKeySelective(Voicediscuss record);

    int updateByPrimaryKey(Voicediscuss record);
}