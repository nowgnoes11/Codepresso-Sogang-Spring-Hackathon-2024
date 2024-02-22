package com.codepresso.sns.mapper;

import com.codepresso.sns.controller.dto.*;
import com.codepresso.sns.vo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    int checkuser(UserRequestDto userRequestDto);

    int checklogin(UserLoginRequestDto userLoginRequestDto);

    int checkpw(UserLoginRequestDto userLoginRequestDto);

    int checkid(int id);

    int checkcur(UserpasswordUpdateDto userpasswordUpdateDto);

    int signup(UserRequestDto userRequestDto);
    User getNewOne();

    UserLoginResponseDto login(UserLoginRequestDto userLoginRequestDto);

    User getInfo(int id);

    int update(@Param("id") int id, @Param("info") UserUpdateDto info);

    int updatePassword(@Param("id") int id, String currentPassword, String newPassword);
}
