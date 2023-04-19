package com.example.todo.controller;

import com.example.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    
    @Autowired
    private TaskService service;

}
