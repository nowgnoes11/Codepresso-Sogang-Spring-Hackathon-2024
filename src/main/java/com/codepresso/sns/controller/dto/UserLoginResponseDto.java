package com.codepresso.sns.controller.dto;

import lombok.Getter;

import java.util.Random;

@Getter
public class UserLoginResponseDto {
    int userId;
    String userName;
    String email;
    String token;
    public UserLoginResponseDto(int userId, String userName, String email) {
        Random random = new Random();
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.token = random.ints(33, 122).limit(20)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
