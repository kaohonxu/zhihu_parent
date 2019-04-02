package com.zhihu.dao;

import com.zhihu.domain.Officialtopic;
import com.zhihu.domain.OfficialtopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfficialtopicMapper {
    long countByExample(OfficialtopicExample example);

    int deleteByExample(OfficialtopicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Officialtopic record);

    int insertSelective(Officialtopic record);

    List<Officialtopic> selectByExample(OfficialtopicExample example);

    Officialtopic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Officialtopic record, @Param("example") OfficialtopicExample example);

    int updateByExample(@Param("record") Officialtopic record, @Param("example") OfficialtopicExample example);

    int updateByPrimaryKeySelective(Officialtopic record);

    int updateByPrimaryKey(Officialtopic record);
}