package com.coldrenatinho.lbd.repository;

import com.coldrenatinho.lbd.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository
        extends JpaRepository<Student, Long> {
}
