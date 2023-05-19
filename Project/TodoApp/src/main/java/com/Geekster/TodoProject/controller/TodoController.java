package com.Geekster.TodoProject.controller;



import com.Geekster.TodoProject.model.TodoModel;
import com.Geekster.TodoProject.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    TodoService todoService;

    @PostMapping("/add-todo")
    public String addTodo(@RequestBody TodoModel todoModel){
        todoService.addTodo(todoModel);
        return "Your todo is Added";
    }
    @GetMapping("/get-todo")
    public List<TodoModel> getTodo(){
        return todoService.getTodo();
    }
     @GetMapping("/get-todo-bytodo/{id}")
    public TodoModel getTodoId(@PathVariable int id){
        return todoService.getTodobyId(id);
     }


}
