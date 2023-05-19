package com.Geekster.TodoProject.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public  class TodoModel {

    private Integer id;
    private String todoName;
    private Boolean todoStatus;
}
