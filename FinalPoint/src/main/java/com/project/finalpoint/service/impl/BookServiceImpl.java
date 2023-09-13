package com.project.finalpoint.service.impl;

import com.project.finalpoint.mapper.BookMapper;
import com.project.finalpoint.pojo.Book;
import com.project.finalpoint.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper bookMapper;
    @Override
    public List<Book> selectALl() {

        return bookMapper.page(1);
    }

    @Override
    public List<Book> page(Integer ids) {
        Integer begin=(ids-1) * 20;
        return bookMapper.page(begin);
    }
}
