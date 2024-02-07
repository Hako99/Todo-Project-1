package com.sparta.todoapp.dto;

import lombok.Getter;

@Getter
public class UpdateTodoRequestDto {
    private String title;
    private String contents;
}
