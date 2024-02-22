package com.codepresso.sns.controller.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CommentResponseDto {
    int commentId;
    int postId;
    int userId;
    String comment;
    LocalDateTime createdAt;

    public CommentResponseDto(int commentId, int postId, int userId, String comment, LocalDateTime createdAt) {
        this.commentId = commentId;
        this.postId = postId;
        this.userId = userId;
        this.comment = comment;
        this.createdAt = createdAt;
    }
}
