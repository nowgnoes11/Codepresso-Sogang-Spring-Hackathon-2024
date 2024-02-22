package com.codepresso.sns.Service;

import com.codepresso.sns.controller.dto.*;
import com.codepresso.sns.mapper.UserMapper;
import com.codepresso.sns.vo.ErrorCode;
import com.codepresso.sns.vo.User;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;

@Service
public class UserService {
    UserMapper userMapper;

    public UserService(UserMapper userMapper) {this.userMapper = userMapper;
    }

    public UserResponseDto signupservice(UserRequestDto user)  {
        if(userMapper.checkuser(user) != 0){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "409 Conflict");
        }

        if(user.getUserName() == null || user.getEmail() == null || user.getPassword() == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "404 Conflict");
        }


        userMapper.signup(user);

        User useranswer = (User) userMapper.getNewOne();
        UserResponseDto answer = new UserResponseDto(useranswer.getUserId(), useranswer.getUserName(), useranswer.getEmail(), useranswer.getIntroduction(),
                useranswer.getOccupation(), useranswer.getBirthday(), useranswer.getCity());

        return answer;
    }

    public UserLoginResponseDto login(UserLoginRequestDto user) {
        if(user.getEmail() == null || user.getPassword() == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "400 Bad Request");
        }
        if(userMapper.checklogin(user) == 0) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "401 Unauthorized");
        }
        if(userMapper.checkpw(user) == 0) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "401 Unauthorized");
        }


        UserLoginResponseDto answer = userMapper.login(user);
        return answer;
    }

    public User getInfo(int id) {
        if(userMapper.checkid(id)==0) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "404 Not Found");
        }

        User user = userMapper.getInfo(id);
        return user;
    }

    public void update(int id, UserUpdateDto info){
        if(userMapper.checkid(id)==0) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "404 Not Found");
        }
        userMapper.update(id, info);
    }

    public MessageDto updatePassword(int id, UserpasswordUpdateDto user){
        if(userMapper.checkid(id)==0) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "404 Not Found");
        }
        if(userMapper.checkcur(user) == 0){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "400 Bad Request");
        }



        userMapper.updatePassword(id, user.getCurrentPassword(), user.getNewPassword());

        return new MessageDto("Password successfully updated.");
    }

}

