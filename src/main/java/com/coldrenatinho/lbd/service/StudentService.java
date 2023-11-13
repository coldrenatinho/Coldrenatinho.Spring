package com.coldrenatinho.lbd.service;

import com.coldrenatinho.lbd.model.Student;
import com.coldrenatinho.lbd.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



import java.util.List;
import java.util.Optional;

@Service //Indica a classe de serviço
public class StudentService {

    public final StudentRepository studentRepository; //Faz injeção de dependecia com A Classe de interface StudentRepository

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    //Retorna uma lista com todos os studntes no banco de dadas usando um query
    public List<Student> getStudents(){
      return studentRepository.findAll();
    }

    //Adiciona um novo usuário depis de verifica se o email já existe
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

    @Transactional
    public void updateStudent(Long id, Student student) {
        boolean exists = studentRepository.existsById(id);
        if (exists) {
            ResponseEntity<Student> studentOptional = studentRepository.findById(id).map(record -> {
                record.setName(student.getName());
                record.setEmail(student.getEmail());
                record.setDob(student.getDob());
                Student update = studentRepository.save(record);
                return ResponseEntity.ok().body(update);
            }).orElse(ResponseEntity.notFound().build());
            System.out.println("Update Student: id: " + id + " " + "set:" + student);
        }else {
            throw new IllegalStateException("Not exist id: " + id + " " + " From postMetohod: " + student);
        }
    }
}
