package com.Geekster.TodoProject.service;


import com.Geekster.TodoProject.dao.TodoRepo;
import com.Geekster.TodoProject.model.TodoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TodoService {

    @Autowired
    TodoRepo todoRepo;
    public void addTodo(TodoModel todoModel) {
        todoRepo.save(todoModel);
    }

    public List<TodoModel> getTodo() {
        return todoRepo.getTodo();
    }

    public TodoModel getTodobyId(int id) {
       return  todoRepo.getTodobyId(id);
    }
}
