package com.codepresso.sns.Service;

import com.codepresso.sns.controller.dto.MessageDto;
import com.codepresso.sns.controller.dto.UserFollowRespondDto;
import com.codepresso.sns.controller.dto.UserFollowerRequestDto;
import com.codepresso.sns.mapper.UserFollowMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserFollowService {
    private UserFollowMapper userFollowMapper;

    public UserFollowService(UserFollowMapper userFollowMapper) {
        this.userFollowMapper = userFollowMapper;
    }

    public MessageDto createFollower(UserFollowerRequestDto user){
        if(user.getFollowerId() == 0 || user.getFollowingId() == 0){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "400 Bad Request");
        }
        if(userFollowMapper.checkfollow(user) != 0) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "409 Conflict");
        }
        if(userFollowMapper.checkid(user.getFollowerId())==0 ||
                userFollowMapper.checkid(user.getFollowingId())==0){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "404 Not Found");
        }

        userFollowMapper.createFollow(user);
        MessageDto answer=new MessageDto("User "+user.getFollowerId()+" successfully followed User "+user.getFollowingId()+".");
        return answer;
    }

    public MessageDto deleteFollower(UserFollowerRequestDto user){
        if(user.getFollowerId() == 0 || user.getFollowingId() == 0){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "400 Bad Request");
        }
        if(userFollowMapper.checkid(user.getFollowerId())==0 ||
                userFollowMapper.checkid(user.getFollowingId())==0){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "404 Not Found");
        }
        if(userFollowMapper.checkfollow(user) != 0) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "404 Not Found");
        }


        userFollowMapper.deleteFollow(user);
        MessageDto answer=new MessageDto("User "+user.getFollowerId()+" successfully unfollowed User "+user.getFollowingId()+".");
        return answer;
    }

    public List<UserFollowRespondDto> getmyfollowing(int userId){
        if(userFollowMapper.checkid(userId) == 0){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "404 Not Found");
        }

        List<UserFollowRespondDto>list =userFollowMapper.getmyfollowing(userId);
        return list;
    }
    public List<UserFollowRespondDto> getmyfollower(int userId){
        if(userFollowMapper.checkid(userId) == 0){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "404 Not Found");
        }


        List<UserFollowRespondDto>list =userFollowMapper.getmyfollower(userId);
        return list;
    }
}
