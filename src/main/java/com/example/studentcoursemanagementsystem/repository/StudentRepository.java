package com.example.studentcoursemanagementsystem.repository;

import com.example.studentcoursemanagementsystem.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
