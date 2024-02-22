package com.codepresso.sns.controller;

import com.codepresso.sns.Service.UserFollowService;
import com.codepresso.sns.controller.dto.MessageDto;
import com.codepresso.sns.controller.dto.UserFollowerRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
