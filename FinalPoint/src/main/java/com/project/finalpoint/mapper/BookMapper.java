package com.project.finalpoint.mapper;

import com.project.finalpoint.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface BookMapper {
    @Select("select * from book")
    List<Book> selectALl();

    @Update("update book set pic_url =  #{urlList} where id =#{i}")
    void updateBookPicUrl(String urlList,Integer i);
}
