package com.zhihu.dao;

import com.zhihu.domain.Roundtable;
import com.zhihu.domain.RoundtableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoundtableMapper {
    long countByExample(RoundtableExample example);

    int deleteByExample(RoundtableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Roundtable record);

    int insertSelective(Roundtable record);

    List<Roundtable> selectByExample(RoundtableExample example);

    Roundtable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Roundtable record, @Param("example") RoundtableExample example);

    int updateByExample(@Param("record") Roundtable record, @Param("example") RoundtableExample example);

    int updateByPrimaryKeySelective(Roundtable record);

    int updateByPrimaryKey(Roundtable record);
}