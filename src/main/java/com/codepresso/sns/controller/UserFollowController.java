package com.codepresso.sns.controller;

import com.codepresso.sns.Service.UserFollowService;
import com.codepresso.sns.controller.dto.MessageDto;
import com.codepresso.sns.controller.dto.UserFollowerRequestDto;
import com.codepresso.sns.controller.dto.UserFollowerRespondListDto;
import com.codepresso.sns.controller.dto.UserFollowingRespondListDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserFollowController {
    private UserFollowService userFollowService;

    public UserFollowController(UserFollowService userFollowService) {
        this.userFollowService = userFollowService;
    }

    @PostMapping("/follow")
    public MessageDto createFollow(@RequestBody UserFollowerRequestDto user){
        MessageDto answer= userFollowService.createFollower(user);
        return answer;
    }
    @DeleteMapping("/follow")
    public MessageDto deleteFollow(@RequestBody UserFollowerRequestDto user){
        MessageDto answer= userFollowService.deleteFollower(user);
        return answer;
    }

    @GetMapping("/user/{userId}/following")
    public UserFollowingRespondListDto getmyfollowing(@PathVariable int userId){
        return new UserFollowingRespondListDto(userFollowService.getmyfollowing(userId));
    }

    @GetMapping("/user/{userId}/followers")
    public UserFollowerRespondListDto getmyfollower(@PathVariable int userId){
        return new UserFollowerRespondListDto(userFollowService.getmyfollower(userId));
    }
}
