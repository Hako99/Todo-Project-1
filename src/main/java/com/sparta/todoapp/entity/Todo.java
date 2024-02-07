package com.sparta.todoapp.entity;

import com.sparta.todoapp.dto.TodoRequestDto;
import com.sparta.todoapp.dto.UpdateTodoRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "todo")
public class Todo {
    // 게시글에 들어갈 데이터
    // 기본 id
    // 제목
    // 내용
    // 작성일
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String contents;

    @Column(nullable = false)
    private Date date;

    public Todo(TodoRequestDto requestDto){
        this.title = requestDto.getTitle();
        this.contents = requestDto.getContents();
        this.date = requestDto.getDate();
    }

    public void update(UpdateTodoRequestDto request) {
        this.title = request.getTitle();
        this.contents = request.getContents();
    }
}
