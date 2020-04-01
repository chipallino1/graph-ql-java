package com.example.graphql.demo.repositories;

import com.example.graphql.demo.entities.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepositories extends JpaRepository<Posts, Long> {
}
