package com.example.todolist.controller;

import com.example.todolist.model.UserEntity;
import com.example.todolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/list")
    public List<UserEntity> get() {
        return this.userService.getAll();
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody UserEntity user) {
        this.userService.delete(user);
    }

    @PostMapping("/add")
    public void add(@RequestBody UserEntity user) {
        this.userService.add(user);
    }




    /*@GetMapping("/todolists")
    @ResponseBody
    public ResponseEntity<ToDoListEntity> getToDoLists(@PathVariable Long id) {
        return new ResponseEntity(toDoListService.getToDoList(id), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public Optional<ToDoListEntity> getToDoList(@PathVariable Long id) {
        return toDoListRepository.findById(id);
    }*/


    /*@DeleteMapping(path = {id})
    public void deleteToDoList(@PathVariable("id") Long id){
        toDoListService.deleteToDoList(id);
    }*/

}
