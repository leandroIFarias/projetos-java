package com.example.todo.service;


import com.example.todo.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    public Task create() {
        return new Task();
    }

    public List<Task> findAll() {
        return new ArrayList<Task>();
    }

    public Task findById(Long id) {
        return new Task();
    }

    public void delete(Long id) {

    }

    public Task update(Task task) {
        return new Task();
    }
}
