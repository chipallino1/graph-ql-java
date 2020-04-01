package com.example.graphql.demo.resolvers;

import com.example.graphql.demo.entities.Posts;
import com.example.graphql.demo.services.PostsService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

//@Service
public class PostMutationResolver implements GraphQLMutationResolver {
    private final PostsService postsService;

    public PostMutationResolver(PostsService postsService) {
        this.postsService = postsService;
    }
/*
    public Mono<Posts> createPost(int id, String title, String category, String content, int authorId) {
        Posts posts = new Posts();
        posts.setId((long) id);
        posts.setTitle(title);
        posts.setCategory(category);
        posts.setContent(content);
        posts.setAuthorId((long) authorId);
        return postsService.createPost(posts);
    }*/
}
