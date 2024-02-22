package com.codepresso.sns.controller.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class PostUserDto {
    int userId;
    String userName;

    List<PostSimpleDto> postlist;

    public PostUserDto(int userId, String userName, List<PostSimpleDto> postlist) {
        this.userId = userId;
        this.userName = userName;
        this.postlist = postlist;
    }
}
