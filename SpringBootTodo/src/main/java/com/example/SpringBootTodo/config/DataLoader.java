package com.example.SpringBootTodo.config;

import com.example.SpringBootTodo.model.Todo;
import com.example.SpringBootTodo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Todoテーブルにレコードを追加する
 */
@RequiredArgsConstructor
//@Component
public class DataLoader implements CommandLineRunner {
  private final TodoRepository repository;

  @Override
  public void run(String... args) throws Exception {
    Todo todo = new Todo();
    todo.setContent("プレゼントを買う");
    repository.save(todo);

    todo = new Todo();
    todo.setContent("ケーキを買う");
    repository.save(todo);

    todo = new Todo();
    todo.setContent("チキンを買う");
    repository.save(todo);
  }
}
