package com.example.todo.controller;

import com.example.todo.model.Task;
import com.example.todo.service.TaskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
@Api(value = "TASKs API REST")
@CrossOrigin(origins = "*")
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping("/tasks")
    @ApiOperation("find a tasks in TODO list")
    public ResponseEntity<List<Task>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @PostMapping("/tasks")
    @ApiOperation("Create a new Task in TODO list")
    public ResponseEntity<Task> create(@RequestBody Task task) {
        return new ResponseEntity<Task>(service.create(task), HttpStatus.CREATED);
    }
}
