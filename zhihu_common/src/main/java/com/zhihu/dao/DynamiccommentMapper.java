package com.zhihu.dao;

import com.zhihu.domain.Dynamiccomment;
import com.zhihu.domain.DynamiccommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DynamiccommentMapper {
    long countByExample(DynamiccommentExample example);

    int deleteByExample(DynamiccommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dynamiccomment record);

    int insertSelective(Dynamiccomment record);

    List<Dynamiccomment> selectByExample(DynamiccommentExample example);

    Dynamiccomment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dynamiccomment record, @Param("example") DynamiccommentExample example);

    int updateByExample(@Param("record") Dynamiccomment record, @Param("example") DynamiccommentExample example);

    int updateByPrimaryKeySelective(Dynamiccomment record);

    int updateByPrimaryKey(Dynamiccomment record);
}