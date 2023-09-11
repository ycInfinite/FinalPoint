package com.project.finalpoint.controller;

import com.project.finalpoint.pojo.Book;
import com.project.finalpoint.pojo.Result;
import com.project.finalpoint.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/all")
    public Result selectAll(){
        log.info("显示所有书的信息");

        List<Book> bookList=bookService.selectALl();
        return Result.success(bookList);
    }
}
