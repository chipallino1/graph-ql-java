package com.example.graphql.demo.resolvers;

import graphql.kickstart.tools.GraphQLSubscriptionResolver;
import graphql.schema.DataFetchingEnvironment;
import org.reactivestreams.Publisher;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
public class MySubscriptionResolver implements GraphQLSubscriptionResolver {

    Publisher<Integer> hello(DataFetchingEnvironment env) {
        return Flux.range(0, 100).delayElements(Duration.ofSeconds(1));
    }

}