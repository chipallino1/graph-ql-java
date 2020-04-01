package com.example.graphql.demo.services;

import com.example.graphql.demo.entities.Posts;
import com.example.graphql.demo.repositories.PostsRepositories;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PostsService {
    private final PostsRepositories postsRepositories;

    public PostsService(PostsRepositories postsRepositories) {
        this.postsRepositories = postsRepositories;
    }

    public Mono<Posts> createPost(Posts posts) {
        return postsRepositories.save(posts);
    }

    public Flux<Posts> getPosts() {
        return postsRepositories.findAll();
    }

    public Mono<Posts> getPost(Long id) {
        return postsRepositories.findById(id);
    }
}
