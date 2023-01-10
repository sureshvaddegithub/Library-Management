package com.Library_DB.Library_Management.Models;

import com.Library_DB.Library_Management.Enums.Genre;
import jakarta.persistence.*;

@Entity
@Table(name = "book_table")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    @ManyToOne
    @JoinColumn
    private Author author;

    @ManyToOne
    @JoinColumn
    private Card card;
}
