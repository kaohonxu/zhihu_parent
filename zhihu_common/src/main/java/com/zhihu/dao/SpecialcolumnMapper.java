package com.zhihu.dao;

import com.zhihu.domain.Specialcolumn;
import com.zhihu.domain.SpecialcolumnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecialcolumnMapper {
    long countByExample(SpecialcolumnExample example);

    int deleteByExample(SpecialcolumnExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Specialcolumn record);

    int insertSelective(Specialcolumn record);

    List<Specialcolumn> selectByExample(SpecialcolumnExample example);

    Specialcolumn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Specialcolumn record, @Param("example") SpecialcolumnExample example);

    int updateByExample(@Param("record") Specialcolumn record, @Param("example") SpecialcolumnExample example);

    int updateByPrimaryKeySelective(Specialcolumn record);

    int updateByPrimaryKey(Specialcolumn record);
}