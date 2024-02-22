package com.codepresso.sns.Service;

import com.codepresso.sns.controller.dto.MessageDto;
import com.codepresso.sns.controller.dto.UserFollowerRequestDto;
import com.codepresso.sns.mapper.UserFollowMapper;
import org.springframework.stereotype.Service;

@Service
public class UserFollowService {
    private UserFollowMapper userFollowMapper;

    public UserFollowService(UserFollowMapper userFollowMapper) {
        this.userFollowMapper = userFollowMapper;
    }

    public MessageDto createFollower(UserFollowerRequestDto user){
        userFollowMapper.createFollow(user);
        MessageDto answer=new MessageDto("User "+user.getFollowerId()+" successfully followed User "+user.getFollowingId()+".");
        return answer;
    }
}
