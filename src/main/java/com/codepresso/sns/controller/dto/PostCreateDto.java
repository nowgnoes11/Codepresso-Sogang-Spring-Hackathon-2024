package com.codepresso.sns.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostCreateDto {
    int userId;
    String content;

    public PostCreateDto(int userId, String content) {
        this.userId = userId;
        this.content = content;
    }
}
