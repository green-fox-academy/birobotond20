package com.greenfoxacademy.connectionwithmysql.controller;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
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

    @GetMapping(value = "/{id}/delete")
    public String deleteTodo(@PathVariable long id) {
        todoRepository.deleteById(id);
        return "redirect:/todo/list";
    }

    @GetMapping(value = "/{id}/edit")
    public String editTodoForm(Model model, @PathVariable long id) {
        model.addAttribute("todo", todoRepository.findById(id).orElseThrow(NullPointerException::new));
        return "edit_todo";
    }

    @PostMapping(value = "/{id}/edit")
    public String editTodoSubmit(@PathVariable long id, Todo todo) {
        Optional<Todo> optionalTodo = todoRepository.findById(id);
        if (optionalTodo.isPresent()) {
            Todo updatedTodo = optionalTodo.get();
            updatedTodo.setTitle(todo.getTitle());
            updatedTodo.setDone(todo.isDone());
            updatedTodo.setUrgent(todo.isUrgent());
            todoRepository.save(updatedTodo);
        }
        return "redirect:/todo/list";
    }
}
