package com.coldrenatinho.lbd.config;

import com.coldrenatinho.lbd.model.Student;
import com.coldrenatinho.lbd.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//@Configuration //Desativado. Só pode existir somente uma classa de configurador 15/11/2023 12:05
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student mariam = new Student(
                    1L,
                    "Marian",
                    "marim@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            Student Jose = new Student(
                    "Jose",
                    "Jose@gmail.com",
                    LocalDate.of(2008, Month.JANUARY, 5)
            );

            Student Alex = new Student(
                    "Alex",
                    "Alex@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );


            studentRepository.saveAll(
                    List.of(mariam, Alex, Jose)
            );
        };
    }


}
