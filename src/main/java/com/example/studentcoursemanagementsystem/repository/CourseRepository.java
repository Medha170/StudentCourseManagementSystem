package com.example.studentcoursemanagementsystem.repository;

import com.example.studentcoursemanagementsystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
