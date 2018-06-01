package com.scsa.balbadak.nexquick.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {


    private final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @GetMapping("/students")
    public List<Student> getStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    @PostMapping("/students")
    public Student createStudents(@RequestBody Student student) {
        return studentRepository.save(student);
    }

}
