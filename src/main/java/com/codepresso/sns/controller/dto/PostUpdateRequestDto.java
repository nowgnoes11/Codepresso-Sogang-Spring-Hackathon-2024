package com.codepresso.sns.controller.dto;

import lombok.Getter;

@Getter
public class PostUpdateRequestDto {
    int userId;
    String content;

    public PostUpdateRequestDto(int userId, String content) {
        this.userId = userId;
        this.content = content;
    }
}
