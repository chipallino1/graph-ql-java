package com.example.graphql.demo.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Posts {
    private Long id;
    private String title;
    private String category;
    private String content;
    private Long authorId;
    private Authors authorsByAuthorId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 300)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "category", nullable = true, length = 300)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "content", nullable = true, length = 3000)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "author_id", nullable = true)
    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posts posts = (Posts) o;
        return Objects.equals(id, posts.id) &&
                Objects.equals(title, posts.title) &&
                Objects.equals(category, posts.category) &&
                Objects.equals(content, posts.content) &&
                Objects.equals(authorId, posts.authorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, category, content, authorId);
    }

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id", insertable = false, updatable = false)
    public Authors getAuthorsByAuthorId() {
        return authorsByAuthorId;
    }

    public void setAuthorsByAuthorId(Authors authorsByAuthorId) {
        this.authorsByAuthorId = authorsByAuthorId;
    }
}
