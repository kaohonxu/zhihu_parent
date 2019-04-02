package com.zhihu.dao;

import com.zhihu.domain.BookCatalogue;
import com.zhihu.domain.BookCatalogueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookCatalogueMapper {
    long countByExample(BookCatalogueExample example);

    int deleteByExample(BookCatalogueExample example);

    int deleteByPrimaryKey(Integer catalogueid);

    int insert(BookCatalogue record);

    int insertSelective(BookCatalogue record);

    List<BookCatalogue> selectByExample(BookCatalogueExample example);

    BookCatalogue selectByPrimaryKey(Integer catalogueid);

    int updateByExampleSelective(@Param("record") BookCatalogue record, @Param("example") BookCatalogueExample example);

    int updateByExample(@Param("record") BookCatalogue record, @Param("example") BookCatalogueExample example);

    int updateByPrimaryKeySelective(BookCatalogue record);

    int updateByPrimaryKey(BookCatalogue record);
}