package com.codepresso.sns.controller.dto;
import lombok.Getter;

import java.util.List;
@Getter
public class UserFollowingRespondListDto {
    List<UserFollowRespondDto> following;

    public UserFollowingRespondListDto(List<UserFollowRespondDto> following) {
        this.following = following;
    }
}
