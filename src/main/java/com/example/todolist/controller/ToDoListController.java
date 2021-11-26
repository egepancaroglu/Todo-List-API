package com.example.todolist.controller;

import com.example.todolist.model.ToDoListEntity;
import com.example.todolist.service.ToDoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class ToDoListController {

    private final ToDoListService toDoListService;

    @Autowired
    public ToDoListController(ToDoListService toDoListService) {
        this.toDoListService = toDoListService;
    }

    @GetMapping("/list")
    public List<ToDoListEntity> get() {
        return this.toDoListService.getAll();
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody ToDoListEntity toDoList) {
        this.toDoListService.delete(toDoList);
    }

    @PostMapping("/add")
    public void add(@RequestBody ToDoListEntity toDoList) {
        this.toDoListService.add(toDoList);
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
