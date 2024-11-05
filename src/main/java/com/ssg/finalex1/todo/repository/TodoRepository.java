package com.ssg.finalex1.todo.repository;

import com.ssg.finalex1.todo.dto.TodoDTO;
import com.ssg.finalex1.todo.entity.TodoEntity;
import com.ssg.finalex1.todo.search.TodoSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface TodoRepository extends JpaRepository<TodoEntity, Long> , TodoSearch {
    @Query("select t from TodoEntity  t")
    Page<TodoEntity> listAll(Pageable pageable);

//    @Query(
//            value = " select * from tbl_todos t " ,
//            countQuery = " select count(*) from tbl_todos ",
//            nativeQuery = true
//    )
//    Page<TodoEntity> listAll(Pageable pageable);

    @Query("select t from todoEntity t where t.mno = : mno")
    Optional<TodoDTO> getDTO(@Param("mno") Long mno);


}
