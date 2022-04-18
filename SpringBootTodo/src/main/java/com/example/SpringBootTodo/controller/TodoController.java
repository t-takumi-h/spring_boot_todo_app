package com.example.SpringBootTodo.controller;

import com.example.SpringBootTodo.model.Todo;
import com.example.SpringBootTodo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


/**
 * コントローラー
 * CRUD
 */
@RequiredArgsConstructor
@Controller
public class TodoController {

  private final TodoRepository repository;

  //  Read
  @GetMapping("/")
  public String showAllTodo(@ModelAttribute Todo todo, Model model) {
    model.addAttribute("todos", repository.findAll());
    return "index";
  }

  //  Create
  @PostMapping("/add")
  public String addTodo(@ModelAttribute Todo todo) {
    repository.save(todo);
    return "redirect:/";
  }


//  @GetMapping("/edit/{id}")
//  public String editTodoForm(@PathVariable Long id, Model model) {
//    model.addAttribute("todo", repository.findById(id));
//    return "edit_form";
//  }

  //  Update
  @PostMapping("/edit")
  public String editTodo(@ModelAttribute Todo todo) {
    repository.save(todo);
    return "redirect:/";
  }

//  Delete
  @GetMapping("/delete/{id}")
  public String deleteTodo(@PathVariable Long id) {
    repository.deleteById(id);
    return "redirect:/";
  }


}
