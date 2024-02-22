package com.codepresso.sns.vo;

import lombok.Getter;

import java.time.LocalDateTime;
@Getter
public class UserFollow {
    int followerId;
    int followingId;
    LocalDateTime TIMESTAMP;

    public UserFollow(int followerId, int followingId, LocalDateTime TIMESTAMP) {
        this.followerId = followerId;
        this.followingId = followingId;
        this.TIMESTAMP = TIMESTAMP;
    }
}
