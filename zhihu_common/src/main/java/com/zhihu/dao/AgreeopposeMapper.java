package com.zhihu.dao;

import com.zhihu.domain.Agreeoppose;
import com.zhihu.domain.AgreeopposeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgreeopposeMapper {
    long countByExample(AgreeopposeExample example);

    int deleteByExample(AgreeopposeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Agreeoppose record);

    int insertSelective(Agreeoppose record);

    List<Agreeoppose> selectByExample(AgreeopposeExample example);

    Agreeoppose selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Agreeoppose record, @Param("example") AgreeopposeExample example);

    int updateByExample(@Param("record") Agreeoppose record, @Param("example") AgreeopposeExample example);

    int updateByPrimaryKeySelective(Agreeoppose record);

    int updateByPrimaryKey(Agreeoppose record);
}