package com.example.SpringBootTodo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Todoモデル
 */
@Getter
@Setter
@Entity
public class Todo {
  @Id
  @GeneratedValue
  private Long id;

  private String content;
}
