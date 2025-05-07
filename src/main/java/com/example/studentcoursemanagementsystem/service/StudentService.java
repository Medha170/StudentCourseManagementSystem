package com.example.studentcoursemanagementsystem.service;


import com.example.studentcoursemanagementsystem.models.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudents();
    Optional<Student> getStudentById(Long id);
    Student updateStudent(Student student);
}
