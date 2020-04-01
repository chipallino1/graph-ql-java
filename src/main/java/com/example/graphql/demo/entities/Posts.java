package com.example.graphql.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("authors")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Posts {
    @Id
    private Long id;
    private String title;
    private String category;
    private String content;
    private Long authorId;
    private Authors authorsByAuthorId;
}
