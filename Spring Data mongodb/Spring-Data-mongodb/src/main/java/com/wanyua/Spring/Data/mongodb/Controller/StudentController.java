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

    @PutMapping("/updateStudent")
    public void updateStudent(@RequestBody StudentModel studentModel){
        StudentModel studentToUpdate =studentRepository.findById(studentModel.getId()).orElse(null);
        if(studentToUpdate != null){
            studentToUpdate.setFirstName(studentModel.getFirstName());
            studentToUpdate.setLastName(studentModel.getLastName());
            studentToUpdate.setResidence(studentModel.getResidence());
            studentToUpdate.setCourse(studentModel.getCourse());
            studentToUpdate.setPhoneNumber(studentModel.getPhoneNumber());
            studentRepository.save(studentToUpdate);
        }

    }

    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable int id){
        studentRepository.deleteById(id);
    }

    @PostMapping("addListOfStudents")
    public void studentModelList(@RequestBody List<StudentModel> studentModelList){
        studentRepository.saveAll(studentModelList);
    }

}
