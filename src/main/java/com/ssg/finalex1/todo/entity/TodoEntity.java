package com.ssg.finalex1.todo.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="tbl_todos")
@Builder
public class TodoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;
    @Column(length = 500, nullable = false)
    private String title;
    @Column(length = 500, nullable = false)
    private String writer;

    private LocalDateTime dueDate;

    public void changeTitle(String title) {
        this.title = title;
    }

    public void changeWriter(String writer) {
        this.writer = writer;
    }

    public void changeDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }
}
