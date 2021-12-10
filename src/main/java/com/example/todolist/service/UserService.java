package com.example.todolist.service;

import com.example.todolist.model.UserEntity;

import java.util.List;

public interface UserService {

    void add(UserEntity user);

    void update(UserEntity user);

    void delete(UserEntity user);

    List<UserEntity> getAll();


}