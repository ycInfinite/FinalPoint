package com.project.finalpoint.service;


import com.project.finalpoint.pojo.Book;

import java.util.List;

public interface BookService {
    List<Book> selectALl();

    List<Book> page(Integer ids);
}
