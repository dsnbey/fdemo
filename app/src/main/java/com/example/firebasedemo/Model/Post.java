package com.example.firebasedemo.Model;

public class Post {

    private String description, imageUrl, postId, publisher;

    public Post() {
    }

    public Post(String description, String imageUrl,
                String postId, String publisher) {
        this.postId = postId;
        this.description = description;
        this.imageUrl = imageUrl;
        this.publisher = publisher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
