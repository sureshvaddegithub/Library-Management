package com.Library_DB.Library_Management.Converters;

import com.Library_DB.Library_Management.Models.Author;
import com.Library_DB.Library_Management.RequestDtos.AuthorRequestDto;

public class AuthorConvertor {

    public static Author convertDtoToEntity(AuthorRequestDto authorRequestDto){
        Author author = Author.builder().name(authorRequestDto.getName())
                .age(authorRequestDto.getAge()).country(authorRequestDto.getCountry())
                .email(authorRequestDto.getEmail()).build();
        return author;
    }
}
