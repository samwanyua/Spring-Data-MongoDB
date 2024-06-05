package com.wanyua.Spring.Data.mongodb.Controller;

import com.wanyua.Spring.Data.mongodb.Model.StudentModel;
import com.wanyua.Spring.Data.mongodb.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody StudentModel studentModel){
        studentRepository.save(studentModel);
    }

    @GetMapping("/getStudentById/{id}")
    public StudentModel getStudentById(@PathVariable Integer id){
        return studentRepository.findById(id).orElse(null);
    }
    @GetMapping("/getAllStudents")
    public List<StudentModel> getAllStudents(){
        return studentRepository.findAll();
    }

}
