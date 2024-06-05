package com.wanyua.Spring.Data.mongodb.Repository;

import com.wanyua.Spring.Data.mongodb.Model.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<StudentModel, Integer> {

}
