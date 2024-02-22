package com.codepresso.sns.mapper;

import com.codepresso.sns.controller.dto.UserFollowRespondDto;
import com.codepresso.sns.controller.dto.UserFollowerRequestDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserFollowMapper {
    public int createFollow(UserFollowerRequestDto user);
    public int deleteFollow(UserFollowerRequestDto user);
    public List<UserFollowRespondDto> getmyfollowing(int userId);

    public List<UserFollowRespondDto> getmyfollower(int userId);
}
