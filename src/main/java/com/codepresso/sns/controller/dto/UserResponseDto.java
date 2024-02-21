package com.codepresso.sns.controller.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class UserResponseDto {
    private int userId;
    private String username;
    private String email ;
    private String introduction;
    private String occupation ;
    private LocalDateTime birthday;
    private String city;

    public UserResponseDto(int userId, String username, String email, String introduction, String occupation, LocalDateTime birthday, String city) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.introduction = introduction;
        this.occupation = occupation;
        this.birthday = birthday;
        this.city = city;
    }


}


