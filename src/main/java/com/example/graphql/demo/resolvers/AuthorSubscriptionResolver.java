package com.example.graphql.demo.resolvers;

import com.example.graphql.demo.repositories.AuthorsRepository;
import graphql.kickstart.tools.GraphQLSubscriptionResolver;
//import reactor.core.publisher.Flux;

//@Service
public class AuthorSubscriptionResolver implements GraphQLSubscriptionResolver {

    private final AuthorsRepository authorsRepository;

    public AuthorSubscriptionResolver(AuthorsRepository authorsRepository) {
        this.authorsRepository = authorsRepository;
    }

    //public Publisher<Authors> getFluxAuthors() {
    //    return Flux.fromStream(authorsRepository.findAll().stream());
    //}

}
