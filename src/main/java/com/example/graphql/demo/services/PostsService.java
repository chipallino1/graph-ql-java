package com.example.graphql.demo.services;

import com.example.graphql.demo.entities.Posts;
import com.example.graphql.demo.repositories.PostsRepositories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsService {
    private final PostsRepositories postsRepositories;

    public PostsService(PostsRepositories postsRepositories) {
        this.postsRepositories = postsRepositories;
    }

    public Posts createPost(Posts posts) {
        return postsRepositories.save(posts);
    }

    public List<Posts> getPosts() {
        return postsRepositories.findAll();
    }

    public Posts getPost(Long id) {
        return postsRepositories.getOne(id);
    }
}
