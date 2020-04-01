package com.example.graphql.demo.services;

import com.example.graphql.demo.entities.Authors;
import com.example.graphql.demo.repositories.AuthorsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

@Service
public class AuthorsService {
    private final AuthorsRepository authorsRepository;

    public AuthorsService(AuthorsRepository authorsRepository) {
        this.authorsRepository = authorsRepository;
    }

    public Authors getAuthor(Long id) {
        return new Authors();
    }

    public List<Authors> getAuthors() {
        return Arrays.asList(new Authors(), new Authors());
    }



    public Mono<Authors> createAuthor(Authors authors) {
        //Object[] objects = authorsRepository.save(authors).flux().toStream().toArray();
        return authorsRepository.save(authors);
    }
}
