package com.codepresso.sns.controller.dto;

import lombok.Getter;

import java.time.LocalDateTime;

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
    LocalDateTime birthday;
    String city;
    LocalDateTime createdAt, updatedAt;
}
