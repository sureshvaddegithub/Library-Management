package com.Library_DB.Library_Management.Repository;

import com.Library_DB.Library_Management.Models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
