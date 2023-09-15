package com.project.finalpoint.controller;

import com.project.finalpoint.pojo.Book;
import com.project.finalpoint.pojo.Result;
import com.project.finalpoint.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class BookController {
    @Autowired
    BookService bookService;

    @CrossOrigin
    @GetMapping("/all/")
    public Result selectAll(){
        log.info("显示所有书的信息");

        List<Book> bookList=bookService.page(1);
        return Result.success(bookList);
    }

    @GetMapping("/all/{pageid}")
    public Result page(@PathVariable String pageid){
        String id=pageid.substring(4);
        Integer ids=Integer.parseInt(id);
        log.info("分页查询");

        List<Book> bookList=bookService.page(ids);
        return  Result.success(bookList);
    }
}
