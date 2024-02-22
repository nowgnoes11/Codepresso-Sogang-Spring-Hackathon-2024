package com.codepresso.sns.vo;

import lombok.Getter;

import java.time.LocalDateTime;
@Getter
public class PostLike {
    int userId;
    int postId;
    LocalDateTime createdAt;

    public PostLike(int userId, int postId, LocalDateTime createdAt) {
        this.userId = userId;
        this.postId = postId;
        this.createdAt = createdAt;
    }
}
