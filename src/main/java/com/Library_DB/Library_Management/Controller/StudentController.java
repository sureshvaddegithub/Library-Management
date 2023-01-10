package com.Library_DB.Library_Management.Controller;

import com.Library_DB.Library_Management.RequestDtos.StudentRequest;
import com.Library_DB.Library_Management.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {


    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    public ResponseEntity<String> createStudent(@RequestBody()StudentRequest studentRequest)
    {
        String result = studentService.createStudent(studentRequest);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
}
