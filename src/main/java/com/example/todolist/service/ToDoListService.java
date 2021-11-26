package com.example.todolist.service;

import com.example.todolist.model.ToDoListEntity;

import java.util.List;

public interface ToDoListService {
    void add(ToDoListEntity toDoList);

    void update(ToDoListEntity toDoList);

    void delete(ToDoListEntity toDoList);

    List<ToDoListEntity> getAll();


}










