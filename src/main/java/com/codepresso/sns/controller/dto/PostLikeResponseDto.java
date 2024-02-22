package com.codepresso.sns.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class PostLikeResponseDto {
    int postId;
    int userId;
    String userName;
    String content;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
    boolean likedByUser;
    int likeCount;

    public PostLikeResponseDto(int postId, int userId, String userName, String content, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.postId = postId;
        this.userId = userId;
        this.userName = userName;
        this.content = content;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.likedByUser=false;
        this.likeCount=0;
    }

    public PostLikeResponseDto(PostResponseDto responseDto) {
        this.postId = responseDto.getPostId();
        this.userId = responseDto.getUserId();
        this.userName = responseDto.getUserName();
        this.content = responseDto.getContent();
        this.createdAt = responseDto.getCreatedAt();
        this.updatedAt = responseDto.getUpdatedAt();
        this.likedByUser= responseDto.isLikedByUser();
        this.likeCount=0;
    }

}
