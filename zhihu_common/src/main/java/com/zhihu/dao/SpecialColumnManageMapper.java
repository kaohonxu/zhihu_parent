package com.zhihu.dao;

import com.zhihu.domain.SpecialColumnManageExample;
import com.zhihu.domain.SpecialColumnManageKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecialColumnManageMapper {
    long countByExample(SpecialColumnManageExample example);

    int deleteByExample(SpecialColumnManageExample example);

    int deleteByPrimaryKey(SpecialColumnManageKey key);

    int insert(SpecialColumnManageKey record);

    int insertSelective(SpecialColumnManageKey record);

    List<SpecialColumnManageKey> selectByExample(SpecialColumnManageExample example);

    int updateByExampleSelective(@Param("record") SpecialColumnManageKey record, @Param("example") SpecialColumnManageExample example);

    int updateByExample(@Param("record") SpecialColumnManageKey record, @Param("example") SpecialColumnManageExample example);
}