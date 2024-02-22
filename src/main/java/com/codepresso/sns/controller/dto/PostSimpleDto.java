package com.codepresso.sns.controller.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostSimpleDto {
    int postId;
    String content;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;

    public PostSimpleDto(int postId, String content, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.postId = postId;
        this.content = content;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
