package com.codepresso.sns.controller.dto;

import lombok.Getter;

@Getter
public class UserpasswordUpdateDto {

    private String currentPassword;
    private String newPassword;

    public UserpasswordUpdateDto(String currentPassword, String newPassword) {
        this.currentPassword = currentPassword;
        this.newPassword = newPassword;
    }
}
