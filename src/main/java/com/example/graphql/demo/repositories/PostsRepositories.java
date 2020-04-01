package com.example.graphql.demo.repositories;

import com.example.graphql.demo.entities.Posts;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PostsRepositories extends ReactiveCrudRepository<Posts, Long> {
}
