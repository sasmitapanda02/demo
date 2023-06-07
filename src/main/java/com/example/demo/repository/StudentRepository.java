package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private List<Student> preStudentList = new ArrayList<>();
    private List<Student> studentList = new ArrayList<>();

    public StudentRepository() {
        preStudentList = List.of(
                new Student(1l, "Coyote", 10, "coyote@gmail.com"),
                new Student(2l, "Catalina", 20, "catalina@gmail.com"),
                new Student(3l, "Jasper", 30, "jasper@gmail.com")
        );
        studentList.addAll(preStudentList);
    }

    public List<Student> findAll() {
        return studentList;
    }

    public Student findById(long id) {
        return studentList.stream().filter(x -> (x.getId() == id)).findAny().get();
    }

    public String saveAll(Student student) {
        Student student1 = new Student(
                student.getId(),
                student.getName(),
                student.getAge(),
                student.getEmail()
        );
        studentList.add(student1);
        return "Saved the record ... ";
    }
}