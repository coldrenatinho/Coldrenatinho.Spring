package com.coldrenatinho.lbd.controller;


import com.coldrenatinho.lbd.model.Student;
import com.coldrenatinho.lbd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController//Adicionado o controlado de end pont
@RequestMapping(path ="api/v1/students" ) //Adiciona o endereço de requisições a ser mapeado
public class StudentController {

    private final StudentService studentService; //executa a injeção de dependêcia para o StudentService

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping //Mapea para o endereço do @RequestMapping a função GET. Retornando uma lista pra a Classa Student
    public List<Student> getStudents(){
        return  studentService.getStudents();
    }

    @PostMapping //Mapea a opção de Post. O marcador @RequestBody adiciona a opção de enviar um JSON para o endereço com as chaves valores a serem adiciondos
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }

    @DeleteMapping(path =  "{studentId}")//Mapea o a opção de delete para a variável passada depois do "\"
    public void deleteStudent(
            @PathVariable("studentId") Long studentId){ //@PathVariable define que é o nome da variavel e seu tipo para passar a função
                studentService.deleteStudet(studentId);
    }

    @PutMapping(path = "{id}") //Adiciona a opção de Put para alterar um dado passando o Id a ser alterado seu JSON
    public void updateStudent(@PathVariable("id") Long id, @RequestBody Student student){
            studentService.updateStudent(id, student);
    }
}
