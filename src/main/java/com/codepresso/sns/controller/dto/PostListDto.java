package com.codepresso.sns.controller.dto;
import lombok.Getter;

import java.util.List;
@Getter
public class PostListDto {
    List<PostResponseDto> posts;

    public PostListDto(List<PostResponseDto> posts) {
        this.posts = posts;
    }
}
