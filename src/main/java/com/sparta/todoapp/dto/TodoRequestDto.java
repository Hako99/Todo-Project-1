package com.sparta.todoapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TodoRequestDto {
    // 제목
    private String title;
    // 내용
    private String contents;
    // 날짜
    private Date date;
}
