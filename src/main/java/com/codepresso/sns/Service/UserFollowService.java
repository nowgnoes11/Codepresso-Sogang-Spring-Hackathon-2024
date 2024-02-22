package com.codepresso.sns.Service;

import com.codepresso.sns.controller.dto.MessageDto;
import com.codepresso.sns.controller.dto.UserFollowRespondDto;
import com.codepresso.sns.controller.dto.UserFollowerRequestDto;
import com.codepresso.sns.mapper.UserFollowMapper;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public MessageDto deleteFollower(UserFollowerRequestDto user){
        userFollowMapper.deleteFollow(user);
        MessageDto answer=new MessageDto("User "+user.getFollowerId()+" successfully unfollowed User "+user.getFollowingId()+".");
        return answer;
    }

    public List<UserFollowRespondDto> getmyfollowing(int userId){
        List<UserFollowRespondDto>list =userFollowMapper.getmyfollowing(userId);
        return list;
    }
    public List<UserFollowRespondDto> getmyfollower(int userId){
        List<UserFollowRespondDto>list =userFollowMapper.getmyfollower(userId);
        return list;
    }
}
