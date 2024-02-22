package com.codepresso.sns.controller.dto;

import lombok.Getter;

@Getter
public class UserSummaryInfoDto {
    int userId;
    String userName;
    int likeCount;
    int followingCount ;
    int followerCount;
    String introduction;
    String occupation ;

    public UserSummaryInfoDto(int userId, String userName, int followingCount, int followerCount, String introduction, String occupation) {
        this.userId = userId;
        this.userName = userName;
        this.likeCount = 0;
        this.followingCount = followingCount;
        this.followerCount = followerCount;
        this.introduction = introduction;
        this.occupation = occupation;
    }
}