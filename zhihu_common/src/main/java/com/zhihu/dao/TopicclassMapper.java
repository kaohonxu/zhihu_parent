package com.zhihu.dao;

import com.zhihu.domain.Topicclass;
import com.zhihu.domain.TopicclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TopicclassMapper {
    long countByExample(TopicclassExample example);

    int deleteByExample(TopicclassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Topicclass record);

    int insertSelective(Topicclass record);

    List<Topicclass> selectByExample(TopicclassExample example);

    Topicclass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Topicclass record, @Param("example") TopicclassExample example);

    int updateByExample(@Param("record") Topicclass record, @Param("example") TopicclassExample example);

    int updateByPrimaryKeySelective(Topicclass record);

    int updateByPrimaryKey(Topicclass record);
}