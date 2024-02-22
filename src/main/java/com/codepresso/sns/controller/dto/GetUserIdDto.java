package com.codepresso.sns.controller.dto;

import lombok.Getter;

@Getter
public class GetUserIdDto {
    int userId;

    public GetUserIdDto(int userId) {
        this.userId = userId;
    }
    public GetUserIdDto() {
    }
}
