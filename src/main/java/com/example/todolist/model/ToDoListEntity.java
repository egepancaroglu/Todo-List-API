package com.example.todolist.model;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "todolist")
@Getter
@Setter
@Builder
@NoArgsConstructor
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
    @Temporal(TemporalType.DATE)
    private Date endtime;

    @Column(name = "isdone")
    private Boolean isdone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "user", nullable = false)
    private UserEntity userEntity;


    /*
        @DateTimeFormat(pattern = "dd-MM-yyyy")
    */


}
