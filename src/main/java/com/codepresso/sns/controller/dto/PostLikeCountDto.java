package com.codepresso.sns.controller.dto;

import lombok.Getter;

@Getter
public class PostLikeCountDto {
    int postId;
    int likeCount;

    public PostLikeCountDto(int postId, int likeCount) {
        this.postId = postId;
        this.likeCount = likeCount;
    }
}
