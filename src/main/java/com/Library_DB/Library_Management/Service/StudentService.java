package com.Library_DB.Library_Management.Service;

import com.Library_DB.Library_Management.Enums.CardStatus;
import com.Library_DB.Library_Management.Models.Card;
import com.Library_DB.Library_Management.Models.Student;
import com.Library_DB.Library_Management.Repository.StudentRepository;
import com.Library_DB.Library_Management.RequestDtos.StudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CardService cardService;

    public String createStudent(StudentRequest studentRequest){
        Student student = new Student();
        student.setAge(studentRequest.getAge());
        student.setEmail(studentRequest.getEmail());
        student.setName(studentRequest.getName());
        student.setCountry(studentRequest.getCountry());

        Card newcard = cardService.createCard(student);

        student.setCard(newcard);
        studentRepository.save(student);

        return "added successfully";

    }
}
