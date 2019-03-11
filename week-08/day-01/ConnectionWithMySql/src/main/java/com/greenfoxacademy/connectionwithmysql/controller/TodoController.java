package com.greenfoxacademy.connectionwithmysql.controller;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = {"", "/", "/list"})
    public String list(Model model, @RequestParam(value = "isActive", required = false) String isActive) {

        if (isActive != null && isActive.equals("true")) {
            List<Todo> dontTodos = ((List<Todo>) todoRepository.findAll())
                    .stream()
                    .filter(todo -> !todo.isDone())
                    .collect(Collectors.toList());
            model.addAttribute("todos", dontTodos);
        } else {
            model.addAttribute("todos", todoRepository.findAll());
        }
        return "todolist";
    }

    @GetMapping(value = "/add")
    public String addNewTodoForm(Model model) {
        model.addAttribute("todo", new Todo());
        return "add_new_todo";
    }

    @PostMapping(value = "/add")
    public String addNewTodoSubmit(Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo/list";
    }
}
