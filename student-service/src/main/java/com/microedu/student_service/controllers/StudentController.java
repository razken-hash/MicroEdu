package com.microedu.student_service.controllers;

import com.microedu.student_service.models.Student;
import com.microedu.student_service.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {
    final private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{studentId}")
    public Student getStudentById(@PathVariable Integer studentId) {
        return studentService.getStudentById(studentId);
    }

    @PostMapping("/create")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @DeleteMapping("/delete/{studentId}")
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteStudentById(@PathVariable Integer studentId) {
        studentService.deleteStudent(studentId);
    }
}
