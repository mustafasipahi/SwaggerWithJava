package com.swagger.controller;

import com.swagger.model.Task;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(value = "First Api")
public class TaskController {

    private final List<Task> saveList = new ArrayList<>();

    @PostMapping("/save")
    @ApiOperation(value = "Create to Task Entity")
    public @ApiResponse(response = ResponseEntity.class, code = 202, message = "Api Response Message For Create") ResponseEntity<Task> save(@RequestBody @ApiParam(value = "My Task Entity Param for Create") Task task) {
        saveList.add(task);
        return ResponseEntity.ok(task);
    }

    @GetMapping("/getAll")
    @ApiOperation(value = "Get All to Task Entity")
    public List<Task> getAll() {
        return saveList;
    }

    @GetMapping("/findById/{id}")
    @ApiOperation(value = "Get All to Task Entity by Id")
    public @ApiResponse(response = Task.class, code = 202, message = "Api Response Message For List") Task findById(@PathVariable @ApiParam(value = "My Task Entity Id Param for List") int id) {
        return saveList.get(id);
    }
}
