package com.codepresso.sns.controller.dto;

import lombok.Getter;

@Getter
public class UserFollowerRequestDto {
    int followerId;
    int followingId;

    public UserFollowerRequestDto(int followerId, int followingId) {
        this.followerId = followerId;
        this.followingId = followingId;
    }
}
