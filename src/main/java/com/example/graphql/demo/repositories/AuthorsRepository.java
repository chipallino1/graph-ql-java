package com.example.graphql.demo.repositories;

import com.example.graphql.demo.entities.Authors;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AuthorsRepository extends ReactiveCrudRepository<Authors, Long> {
}
