package com.codepresso.sns.controller.dto;

import lombok.Getter;

@Getter
public class UserFollowRespondDto {
    int userId;
    String userName;
    String occupation;

    public UserFollowRespondDto(int userId, String userName, String occupation) {
        this.userId = userId;
        this.userName = userName;
        this.occupation = occupation;
    }
}
