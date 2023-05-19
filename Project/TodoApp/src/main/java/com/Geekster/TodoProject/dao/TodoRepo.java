package com.Geekster.TodoProject.dao;

import com.Geekster.TodoProject.model.TodoModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class TodoRepo {
   List<TodoModel> list=new ArrayList<>();
    public void save(TodoModel todoModel)
    {

        list.add(todoModel);
    }

    public List<TodoModel> getTodo() {
        return list;
    }

    public TodoModel getTodobyId(int id) {
        for(TodoModel todo:list){
            if(todo.getId()==id){
                return todo;
            }
        }
        return null;
    }
}
