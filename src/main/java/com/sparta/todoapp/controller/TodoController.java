package com.sparta.todoapp.controller;


import com.sparta.todoapp.dto.TodoRequestDto;
import com.sparta.todoapp.dto.TodoResponseDto;
import com.sparta.todoapp.dto.UpdateTodoRequestDto;
import com.sparta.todoapp.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class TodoController {

    private final TodoService todoService;
    @PostMapping("/todo")
    public TodoResponseDto createTodo(@RequestBody TodoRequestDto requestDto){
        return todoService.createTodo(requestDto);
    }

    @GetMapping("/todo")
    public List<TodoResponseDto> getTodo(){
        return todoService.getTodo();
    }

    @GetMapping("/todo/{todoId}")
    public TodoResponseDto getTodoOne(@PathVariable Long todoId){
        return todoService.getTodoOne(todoId);
    }

    @PutMapping("/todo/{todoId}")
    public TodoResponseDto updateTodo(@PathVariable Long todoId,@RequestBody UpdateTodoRequestDto request){
        return todoService.updateTodo(todoId,request);
    }

    @DeleteMapping("/todo/{todoId}")
    public void deleteTodo(@PathVariable Long todoId){
        todoService.deleteTodo(todoId);
    }

}
