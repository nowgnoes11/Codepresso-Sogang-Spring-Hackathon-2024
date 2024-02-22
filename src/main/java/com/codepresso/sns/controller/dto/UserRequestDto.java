package com.codepresso.sns.controller.dto;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
public class UserRequestDto {
    String userName;
    String email ;
    String password;
    String introduction;
    String occupation ;
    Date birthday;
    String city;

    public UserRequestDto(String userName, String email, String password, String introduction, String occupation, Date birthday, String city) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.introduction = introduction;
        this.occupation = occupation;
        this.birthday = birthday;
        this.city = city;
    }

}
