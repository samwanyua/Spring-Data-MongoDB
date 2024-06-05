package com.wanyua.Spring.Data.mongodb.Controller;

import com.wanyua.Spring.Data.mongodb.Model.StudentModel;
import com.wanyua.Spring.Data.mongodb.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody StudentModel studentModel){
        studentRepository.save(studentModel);
    }
}
