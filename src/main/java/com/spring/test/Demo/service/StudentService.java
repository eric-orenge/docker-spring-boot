package com.spring.test.Demo.service;

import com.spring.test.Demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements IStudentService {
    List<Student> students  = new ArrayList<Student>();;

    @Override
    public List<Student> findAll(){
        students.add(new Student(1L,"Eric Orenge", 23));
        students.add(new Student(2L,"Fab Rotich", 22));
        students.add(new Student(3L,"Thuku Viklen", 23));
        return students;
    }

//    @Override
//    public void addStudent(long id, String name, int age){
//        students.add(new Student(1L,"Eric Orenge", 23));
//    }

}
