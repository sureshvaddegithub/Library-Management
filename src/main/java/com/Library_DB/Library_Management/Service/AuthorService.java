package com.Library_DB.Library_Management.Service;

import com.Library_DB.Library_Management.Converters.AuthorConvertor;
import com.Library_DB.Library_Management.Models.Author;
import com.Library_DB.Library_Management.Repository.AuthorRepository;
import com.Library_DB.Library_Management.RequestDtos.AuthorRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public String createAuthor(AuthorRequestDto authorRequestDto){

        try{
            Author author = AuthorConvertor.convertDtoToEntity(authorRequestDto);
            authorRepository.save(author);
        } catch (Exception e) {
            log.info("authorcreated has raise the Error");
            return "authorCreated has Error";
        }
        return "author add successfully";
    }
}
