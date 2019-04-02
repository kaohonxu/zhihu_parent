package com.zhihu.dao;

import com.zhihu.domain.Voice;
import com.zhihu.domain.VoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VoiceMapper {
    long countByExample(VoiceExample example);

    int deleteByExample(VoiceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Voice record);

    int insertSelective(Voice record);

    List<Voice> selectByExampleWithBLOBs(VoiceExample example);

    List<Voice> selectByExample(VoiceExample example);

    Voice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Voice record, @Param("example") VoiceExample example);

    int updateByExampleWithBLOBs(@Param("record") Voice record, @Param("example") VoiceExample example);

    int updateByExample(@Param("record") Voice record, @Param("example") VoiceExample example);

    int updateByPrimaryKeySelective(Voice record);

    int updateByPrimaryKeyWithBLOBs(Voice record);

    int updateByPrimaryKey(Voice record);
}