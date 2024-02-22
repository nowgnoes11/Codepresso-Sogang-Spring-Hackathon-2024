package com.codepresso.sns.controller.dto;
import lombok.Getter;

import java.util.List;
@Getter
public class UserFollowerRespondListDto {
    List<UserFollowRespondDto> follower;

    public UserFollowerRespondListDto(List<UserFollowRespondDto> follower) {
        this.follower = follower;
    }
}