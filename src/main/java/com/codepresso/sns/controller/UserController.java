package com.codepresso.sns.controller;

import com.codepresso.sns.Service.UserService;
import com.codepresso.sns.controller.dto.*;
import com.codepresso.sns.vo.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public UserResponseDto signUp(@RequestBody UserRequestDto user) {

        UserResponseDto useranswer = userService.signupservice(user);
        return useranswer;
    }

    @PostMapping("/login")
    public UserLoginResponseDto login(@RequestBody UserLoginRequestDto user) {
        UserLoginResponseDto answer = userService.login(user);
        return answer;
    }

    @GetMapping("{userId}/summary")
    public UserSummaryInfoDto summary(@PathVariable int userId) {
        User user = userService.summary(userId);
        UserSummaryInfoDto answer = new UserSummaryInfoDto(user.getUserId(), user.getUserName(), user.getFollowingCount(),
                user.getFollowerCount(), user.getIntroduction(), user.getOccupation());
        return answer;
    }

    @GetMapping("{userId}/detail")
    public UserDetailInfoDto detail(@PathVariable int userId) {
        User user = userService.summary(userId);
        UserDetailInfoDto answer = new UserDetailInfoDto(user);
        return answer;
    }
}
