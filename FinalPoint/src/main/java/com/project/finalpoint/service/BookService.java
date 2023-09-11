package com.project.finalpoint.service;


import com.project.finalpoint.pojo.Book;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {
    List<Book> selectALl();
}
