package com.codepresso.sns.Service;

import com.codepresso.sns.controller.dto.*;
import com.codepresso.sns.mapper.UserMapper;
import com.codepresso.sns.vo.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserResponseDto signupservice(UserRequestDto user) {
        userMapper.signup(user);
        User useranswer = (User) userMapper.getNewOne();
        UserResponseDto answer = new UserResponseDto(useranswer.getUserId(), useranswer.getUserName(), useranswer.getEmail(), useranswer.getIntroduction(),
                useranswer.getOccupation(), useranswer.getBirthday(), useranswer.getCity());
        return answer;
    }

    public UserLoginResponseDto login(UserLoginRequestDto user) {
        UserLoginResponseDto answer = userMapper.login(user);
        return answer;
    }

    public User summary(int id) {
        User user = userMapper.summary(id);
        return user;
    }

}

