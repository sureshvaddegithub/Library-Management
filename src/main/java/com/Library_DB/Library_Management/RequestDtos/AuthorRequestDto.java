package com.Library_DB.Library_Management.RequestDtos;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthorRequestDto {
    private String name;
    private  int age;
    private  String country;
    @Column(nullable = false,unique = true)
    private String email;
}
