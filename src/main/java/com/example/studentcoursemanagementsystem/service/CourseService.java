package com.example.studentcoursemanagementsystem.service;


import com.example.studentcoursemanagementsystem.models.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    Course saveCourse(Course course);
    List<Course> getAllCourses();
    Optional<Course> getCourseById(Long id);
    Course updateCourse(Course course);
}
