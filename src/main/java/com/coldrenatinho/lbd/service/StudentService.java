package com.coldrenatinho.lbd.service;

import com.coldrenatinho.lbd.model.Student;
import com.coldrenatinho.lbd.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    public final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
      return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentOptional = studentRepository
                .findStudentByEmail(student.getEmail());
        if(studentOptional.isPresent()){
            throw new IllegalStateException("email taken");
        }
        else {
            studentRepository.save(student);
            System.out.println(student);
        }
    }

    public void deleteStudet(Long studentId) {
            boolean exists = studentRepository.existsById(studentId);
            if(!exists){
                throw new IllegalStateException(
                        "student with id" + " " + studentId + " " +"do not exists");
            }
            studentRepository.deleteById(studentId);
    }


    public void updateStudent(Long id, Student student) {
        ResponseEntity<Student> studentOptional = studentRepository.findById(id).map(record ->   {
            record.setName(student.getName());
            record.setEmail(student.getEmail());
            record.setDob(student.getDob());
            Student update = studentRepository.save(record);
            return ResponseEntity.ok().body(update);
        }).orElse(ResponseEntity.notFound().build());
    }

}
