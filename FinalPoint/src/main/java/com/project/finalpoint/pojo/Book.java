package com.project.finalpoint.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private Integer ID;
    private String bookName;
    private String author;
    private String bookStatus;
    private String mainType;
    private String  secondType;
    private Double wordCounts;
    private String latestChapter;
    private String briefIntroUrl;
    private String picUrl;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
