package com.bst.sds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentDataController {
    @Autowired
    private StudentDataRepository studentDataRepository;

    @GetMapping("/")
    public String viewHomePage() {
        return "Welcome To Student Management System";
    }

    @PostMapping("student/add")
    public StudentData addStudent(@RequestBody StudentData studentData) {
        return studentDataRepository.save(studentData);
    }

    @GetMapping("student/viewAll")
    public List<StudentData> viewAllStudents() {
        return studentDataRepository.findAll();
    }

    @GetMapping("student/viewOne/{id}")
    public StudentData viewOne(@PathVariable int id) {
        var studentDataOptional = studentDataRepository.findById(id);
        return studentDataOptional.orElse(null);
    }

    @DeleteMapping("student/delete/{id}")
    public void deleteOne(@PathVariable int id) {
        studentDataRepository.deleteById(id);
    }
}
