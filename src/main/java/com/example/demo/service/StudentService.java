package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudentDetails;
    @Autowired
    StudentRepository studentRepository;
    public List<Student> findAllStudentDetails(){
        return studentRepository.findAll();
    }

    public Student getStudentById(long id) {
        return studentRepository.findById(id);
    }

    public String saveStudent(Student student) {
        return studentRepository.saveAll(student);
    }
}
