package com.example.graphql.demo.resolvers;

import com.example.graphql.demo.entities.Posts;
import com.example.graphql.demo.services.PostsService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostQueryResolver implements GraphQLQueryResolver {
    private final PostsService postsService;

    public PostQueryResolver(PostsService postsService) {
        this.postsService = postsService;
    }

    public List<Posts> getPosts() {
        return postsService.getPosts();
    }

    public Posts getPost(int id) {
        return postsService.getPost((long) id);
    }
}
