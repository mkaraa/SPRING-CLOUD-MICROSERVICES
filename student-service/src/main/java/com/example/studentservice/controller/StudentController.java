package com.example.studentservice.controller;

import com.example.studentservice.model.request.StudentRequest;
import com.example.studentservice.model.response.StudentResponse;
import com.example.studentservice.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping("create")
    public StudentResponse create(@RequestBody StudentRequest studentRequest){
        return studentService.create(studentRequest);
    }

    @GetMapping("/getById/{id}")
    public StudentResponse getById(@PathVariable Long id){
        return studentService.getById(id);
    }
}
