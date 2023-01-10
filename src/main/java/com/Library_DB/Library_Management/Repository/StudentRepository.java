package com.Library_DB.Library_Management.Repository;

import com.Library_DB.Library_Management.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
