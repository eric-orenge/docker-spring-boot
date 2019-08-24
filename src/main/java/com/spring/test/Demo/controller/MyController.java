package com.spring.test.Demo.controller;

import com.spring.test.Demo.model.Student;
import com.spring.test.Demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private IStudentService studentService ;

    @GetMapping(value = "/students")
    public List<Student> getStudents(){
        List<Student> students = studentService.findAll();
        return students;
    }
//    @PostMapping(value = "/register")
//    public Student addStudent(@RequestBody Student stud){
//        studentService.addStudent(stud.getId(),stud.getName(),stud.getAge());
//        return stud;
//    }
}
