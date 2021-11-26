package com.example.todolist.service.impl;

import com.example.todolist.model.ToDoListEntity;
import com.example.todolist.repository.ToDoListRepository;
import com.example.todolist.service.ToDoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ToDoListServiceImpl implements ToDoListService {

    private ToDoListRepository toDoListRepository;

    @Autowired
    public ToDoListServiceImpl(ToDoListRepository toDoListRepository) {
        this.toDoListRepository = toDoListRepository;
    }

    @Override
    public void add(ToDoListEntity toDoList) {
        this.toDoListRepository.save(toDoList);

    }

    @Override
    public void update(ToDoListEntity toDoList) {

    }

    @Override
    @Transactional
    public void delete(ToDoListEntity toDoList) {
        this.toDoListRepository.delete(toDoList);
    }

    @Override
    @Transactional
    public List<ToDoListEntity> getAll() {
        return this.toDoListRepository.findAll();
    }
}
