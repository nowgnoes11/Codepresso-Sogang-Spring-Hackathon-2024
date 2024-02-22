package com.codepresso.sns.vo;

import lombok.Getter;

import java.time.LocalDateTime;
@Getter
public class Post {
    int postId;
    int userId;
    String content;
    int likeCount;
    int commentCount;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;

    public Post(int postId, int userId, String content, int likeCount, int commentCount, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.postId = postId;
        this.userId = userId;
        this.content = content;
        this.likeCount = likeCount;
        this.commentCount = commentCount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
