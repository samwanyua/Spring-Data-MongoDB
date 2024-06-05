package com.wanyua.Spring.Data.mongodb.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentModel {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String residence;
    private String course;
    private String phoneNumber;
}
