package com.example.studentcoursemanagementsystem.controller;


import com.example.studentcoursemanagementsystem.models.Student;
import com.example.studentcoursemanagementsystem.service.CourseService;
import com.example.studentcoursemanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    // Show all students
    @GetMapping
    public String getAllStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    // Show form to add student
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("courses", courseService.getAllCourses());
        return "add-student";
    }

    // Handle form submission
    @PostMapping("/add")
    public String saveStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    // Show form to update student
    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        Student student = studentService.getStudentById(id).orElseThrow(() -> new IllegalArgumentException("Invalid student ID"));
        model.addAttribute("student", student);
        model.addAttribute("courses", courseService.getAllCourses());
        return "edit-student";
    }

    // Handle update
    @PostMapping("/update")
    public String updateStudent(@ModelAttribute Student student) {
        studentService.updateStudent(student);
        return "redirect:/students";
    }
}
