package com.ssg.finalex1.todo.dto;

import com.ssg.finalex1.todo.entity.TodoEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class TodoDTO {
    private Long mno;
    private String title;
    private String writer;
    private LocalDateTime dueDate;

    public TodoDTO(TodoEntity todoEntity) {
        this.mno = todoEntity.getMno();
        this.title = todoEntity.getTitle();
        this.writer = todoEntity.getWriter();
        this.dueDate = todoEntity.getDueDate();
    }
}
