package com.example.graphql.demo.resolvers;

import com.example.graphql.demo.entities.Authors;
import com.example.graphql.demo.services.AuthorsService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Service;

@Service
public class AuthorMutationResolver implements GraphQLMutationResolver {
    private final AuthorsService authorsService;

    public AuthorMutationResolver(AuthorsService authorsService) {
        this.authorsService = authorsService;
    }

    public Authors createAuthor(int id, String firstName, String lastName, String email) {
        Authors authors = new Authors();
        authors.setId((long) id);
        authors.setFirstName(firstName);
        authors.setLastName(lastName);
        authors.setEmail(email);
        return authorsService.createAuthor(authors);
    }
}
