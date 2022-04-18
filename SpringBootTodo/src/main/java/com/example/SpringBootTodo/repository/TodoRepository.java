package com.example.SpringBootTodo.repository;

import com.example.SpringBootTodo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * DB操作が簡単にできるようになる
 */
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
