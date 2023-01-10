package com.Library_DB.Library_Management.Controller;

import com.Library_DB.Library_Management.RequestDtos.AuthorRequestDto;
import com.Library_DB.Library_Management.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class AuthorRepository {

    @Autowired
    AuthorService authorService;

    @PostMapping("/create")
    public ResponseEntity<String> createAuthor(@RequestBody()AuthorRequestDto authorRequestDto){
        String result = authorService.createAuthor(authorRequestDto);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
