package com.zhihu.dao;

import com.zhihu.domain.Sensitivenumb;
import com.zhihu.domain.SensitivenumbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SensitivenumbMapper {
    long countByExample(SensitivenumbExample example);

    int deleteByExample(SensitivenumbExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sensitivenumb record);

    int insertSelective(Sensitivenumb record);

    List<Sensitivenumb> selectByExample(SensitivenumbExample example);

    Sensitivenumb selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sensitivenumb record, @Param("example") SensitivenumbExample example);

    int updateByExample(@Param("record") Sensitivenumb record, @Param("example") SensitivenumbExample example);

    int updateByPrimaryKeySelective(Sensitivenumb record);

    int updateByPrimaryKey(Sensitivenumb record);
}