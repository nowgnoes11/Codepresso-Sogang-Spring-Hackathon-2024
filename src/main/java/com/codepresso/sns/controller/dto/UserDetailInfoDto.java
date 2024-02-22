package com.codepresso.sns.controller.dto;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
public class UserDetailInfoDto {
    int userId;
    String userName;
    String email;
    int postCount;
    int followingCount;
    int followerCount;
    String introduction;
    String occupation;
    Date birthday;
    String city;
    LocalDateTime createdAt, updatedAt;

    public UserDetailInfoDto(int userId, String userName, String email, int postCount, int followingCount, int followerCount, String introduction, String occupation, Date birthday, String city, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.postCount = postCount;
        this.followingCount = followingCount;
        this.followerCount = followerCount;
        this.introduction = introduction;
        this.occupation = occupation;
        this.birthday = birthday;
        this.city = city;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
