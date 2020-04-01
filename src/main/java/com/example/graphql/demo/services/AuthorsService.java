package com.example.graphql.demo.services;

import com.example.graphql.demo.entities.Authors;
import com.example.graphql.demo.repositories.AuthorsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorsService {
    private final AuthorsRepository authorsRepository;

    public AuthorsService(AuthorsRepository authorsRepository) {
        this.authorsRepository = authorsRepository;
    }

    public Authors getAuthor(Long id) {
        return authorsRepository.getOne(id);
    }

    public List<Authors> getAuthors(){
        return authorsRepository.findAll();
    }

    public Authors createAuthor(Authors authors) {
        return authorsRepository.save(authors);
    }
}
