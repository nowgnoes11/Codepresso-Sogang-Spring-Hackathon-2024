package com.codepresso.sns.vo;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Comment {
    int commentId ;
    int postId;
    int userId;
    String comment;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;

    public Comment(int commentId, int postId, int userId, String comment,
                   LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.commentId = commentId;
        this.postId = postId;
        this.userId = userId;
        this.comment = comment;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
