package com.project.finalpoint.mapper;

import com.project.finalpoint.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface BookMapper {
    @Select("select * from book_new")
    List<Book> selectALl();

    @Update("update book_new set pic_url =  #{urlList} where id =#{i}")
    void updateBookPicUrl(String urlList,Integer i);

    List<Book> page(Integer ids);
}
