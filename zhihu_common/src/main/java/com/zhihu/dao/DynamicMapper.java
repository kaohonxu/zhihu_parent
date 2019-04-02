package com.zhihu.dao;

import com.zhihu.domain.Dynamic;
import com.zhihu.domain.DynamicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DynamicMapper {
    long countByExample(DynamicExample example);

    int deleteByExample(DynamicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dynamic record);

    int insertSelective(Dynamic record);

    List<Dynamic> selectByExample(DynamicExample example);

    Dynamic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dynamic record, @Param("example") DynamicExample example);

    int updateByExample(@Param("record") Dynamic record, @Param("example") DynamicExample example);

    int updateByPrimaryKeySelective(Dynamic record);

    int updateByPrimaryKey(Dynamic record);
}