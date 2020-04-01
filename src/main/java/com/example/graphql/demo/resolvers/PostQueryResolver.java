package com.example.graphql.demo.resolvers;

import com.example.graphql.demo.entities.Posts;
import com.example.graphql.demo.services.PostsService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

//@Service
public class PostQueryResolver  {
    private final PostsService postsService;

    public PostQueryResolver(PostsService postsService) {
        this.postsService = postsService;
    }
/*
    public Flux<Posts> getPosts() {
        return postsService.getPosts();
    }

    public Mono<Posts> getPost(int id) {
        return postsService.getPost((long) id);
    }*/
}
