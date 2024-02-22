package com.codepresso.sns.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class PostResponseDto {
    int postId;
    int userId;
    String userName;
    String content;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
    boolean likedByUser;

    public PostResponseDto(int postId, int userId, String userName, String content, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.postId = postId;
        this.userId = userId;
        this.userName = userName;
        this.content = content;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.likedByUser=false;
    }
}
