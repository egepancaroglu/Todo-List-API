package com.example.todolist.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
@Getter
@Setter
@Builder
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private int password;

    @OneToMany(mappedBy = "userEntity")
    private List<ToDoListEntity> toDoListEntityList;


}
