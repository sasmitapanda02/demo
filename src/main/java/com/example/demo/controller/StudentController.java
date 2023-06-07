package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/v1/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public List<Student> getAllDetails(){
        return studentService.findAllStudentDetails();
    }

    @GetMapping("/{id}")
    public Student findStudentById(@PathVariable long id){
        return studentService.getStudentById(id);
    }

    @PostMapping("/")
    public String addStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    // Update the student details based on the Id - PUT - PutMapping
    // Delete the student details based on the Id - DELETE - DeleteMapping
    // Fetch the student details based on the Id and Name - GET - GetMapping
}