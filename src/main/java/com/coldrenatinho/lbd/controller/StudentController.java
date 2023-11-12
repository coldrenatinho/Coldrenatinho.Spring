package com.coldrenatinho.lbd.controller;


import com.coldrenatinho.lbd.model.Student;
import com.coldrenatinho.lbd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping(path ="api/v1/students" )
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
        return  studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }

    @DeleteMapping(path =  "{studentId}")
    public void deleteStudent(
            @PathVariable("studentId") Long studentId){
                studentService.deleteStudet(studentId);
    }

    @PutMapping(path = "{id}")
    public void updateStudent(@PathVariable("id") Long id, @RequestBody Student student){
            studentService.updateStudent(id, student);
    }
}
