package com.arun.springbootuseofprofiles.controller;

import com.arun.springbootuseofprofiles.model.Student;
import com.arun.springbootuseofprofiles.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/students/v1/student/name/{name}/age/{age}/standard/{standard}")
    public ResponseEntity<Student> createStudent(@PathVariable String name, @PathVariable String age, @PathVariable String standard) {
        Student student = new Student(name, age, standard);
        Student student1 = studentService.createStudent(student);
        ResponseEntity<Student> response = new ResponseEntity<>(student1, HttpStatus.OK);
        return response;
    }
}
