package com.codepresso.sns.controller.dto;

import lombok.Getter;
import java.util.Random;

@Getter
public class UserLoginRequestDto {
    String email;
    String password;

    public UserLoginRequestDto(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
