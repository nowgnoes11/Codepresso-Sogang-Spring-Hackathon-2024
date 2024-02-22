package com.codepresso.sns.controller.dto;

import lombok.Setter;

@Setter
public class UserUpdateDto {
    String userName;
    String introduction;
    String occupation;
    String city;

    public UserUpdateDto() {
        this.userName = null;
        this.introduction = null;
        this.occupation = null;
        this.city = null;
    }
}
