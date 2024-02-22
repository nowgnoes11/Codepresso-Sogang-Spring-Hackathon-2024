package com.codepresso.sns.controller.dto;

import lombok.Getter;

@Getter
public class PostLikeRequestDto {
    int userId;

    public PostLikeRequestDto(int userId) {
        this.userId = userId;
    }

    public PostLikeRequestDto(){}

}
