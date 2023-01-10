package com.Library_DB.Library_Management.RequestDtos;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StudentRequest {
    private int age;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    private String country;

}
