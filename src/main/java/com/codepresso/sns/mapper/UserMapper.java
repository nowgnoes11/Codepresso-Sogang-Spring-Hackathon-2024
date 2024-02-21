package com.codepresso.sns.mapper;

import com.codepresso.sns.controller.dto.*;
import com.codepresso.sns.vo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    int signup(UserRequestDto userRequestDto);
    User getNewOne();

    UserLoginResponseDto login(UserLoginRequestDto userLoginRequestDto);

    User summary(int id);


}
