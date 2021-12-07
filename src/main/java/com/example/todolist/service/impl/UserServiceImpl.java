package com.example.todolist.service.impl;


import com.example.todolist.model.UserEntity;
import com.example.todolist.repository.UserRepository;
import com.example.todolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void add(UserEntity user) {
        this.userRepository.save(user);

    }

    @Override
    public void update(UserEntity user) {

    }

    @Override
    @Transactional
    public void delete(UserEntity user) {
        this.userRepository.delete(user);
    }

    @Override
    @Transactional
    public List<UserEntity> getAll() {
        return this.userRepository.findAll();
    }
}

