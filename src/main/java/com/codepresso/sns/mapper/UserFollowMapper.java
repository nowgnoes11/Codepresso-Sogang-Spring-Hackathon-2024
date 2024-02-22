package com.codepresso.sns.mapper;

import com.codepresso.sns.controller.dto.UserFollowerRequestDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserFollowMapper {
    public int createFollow(UserFollowerRequestDto user);
}
