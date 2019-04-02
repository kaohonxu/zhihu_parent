package com.zhihu.dao;

import com.zhihu.domain.BookDiscuss;
import com.zhihu.domain.BookDiscussExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookDiscussMapper {
    long countByExample(BookDiscussExample example);

    int deleteByExample(BookDiscussExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BookDiscuss record);

    int insertSelective(BookDiscuss record);

    List<BookDiscuss> selectByExample(BookDiscussExample example);

    BookDiscuss selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BookDiscuss record, @Param("example") BookDiscussExample example);

    int updateByExample(@Param("record") BookDiscuss record, @Param("example") BookDiscussExample example);

    int updateByPrimaryKeySelective(BookDiscuss record);

    int updateByPrimaryKey(BookDiscuss record);
}