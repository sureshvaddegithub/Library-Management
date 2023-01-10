package com.Library_DB.Library_Management.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name= "student")
@Getter
@Setter
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String  name;
    @Column(name= "school-email",unique = true,nullable = false)
    private String email;
    private int age;
    private String country;


    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private Card card;

    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedON;

    public Student(String name, String email, int age, String country) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.country = country;
    }
}
