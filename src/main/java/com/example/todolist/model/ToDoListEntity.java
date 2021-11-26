package com.example.todolist.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "todolist")
public class ToDoListEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "endtime")
    private LocalDate endtime;

    @Column(name = "isdone")
    private Boolean isdone;


    /*
        @DateTimeFormat(pattern = "dd-MM-yyyy")
    */


}
