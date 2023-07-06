package com.swagger.controller;

import com.swagger.model.Task;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Tag(name = "First Api", description = "First Api Description")
public class TaskController {

    private final List<Task> saveList = new ArrayList<>();

    @PostMapping("/save")
    @Operation(summary = "Create to Task Entity")
    public ResponseEntity<Task> save(@RequestBody Task task) {
        saveList.add(task);
        return ResponseEntity.ok(task);
    }

    @GetMapping("/getAll")
    @Operation(summary = "Get All to Task Entity")
    public List<Task> getAll() {
        return saveList;
    }

    @GetMapping("/findById/{id}")
    @Operation(summary = "Get All to Task Entity by Id")
    public Task findById(@PathVariable int id) {
        return saveList.get(id);
    }
}
