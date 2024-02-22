package com.codepresso.sns.controller.dto;

import lombok.Getter;


import java.util.List;

@Getter
public class PostLikeListDto {
    List<PostLikeResponseDto> posts;

    public PostLikeListDto(List<PostLikeResponseDto> posts) {
        this.posts = posts;
    }
}
