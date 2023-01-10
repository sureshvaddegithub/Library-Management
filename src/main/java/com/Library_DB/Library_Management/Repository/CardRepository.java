package com.Library_DB.Library_Management.Repository;

import com.Library_DB.Library_Management.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Integer> {
}
