package com.codepresso.sns.controller.dto;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
public class UserResponseDto {
    private int userId;
    private String username;
    private String email ;
    private String introduction;
    private String occupation ;
    private Date birthday;
    private String city;

    public UserResponseDto(int userId, String username, String email, String introduction, String occupation, Date birthday, String city) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.introduction = introduction;
        this.occupation = occupation;
        this.birthday = birthday;
        this.city = city;
    }


}


