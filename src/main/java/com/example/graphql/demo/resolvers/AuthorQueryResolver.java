package com.example.graphql.demo.resolvers;

import com.example.graphql.demo.entities.Authors;
import com.example.graphql.demo.services.AuthorsService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorQueryResolver implements GraphQLQueryResolver {
    private final AuthorsService authorsService;

    public AuthorQueryResolver(AuthorsService authorsService) {
        this.authorsService = authorsService;
    }

    public List<Authors> getAuthors() {
        return authorsService.getAuthors();
    }

    public Authors getAuthor(int id) {
        return authorsService.getAuthor((long) id);
    }
}
