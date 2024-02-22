package com.codepresso.sns.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    USERNAME_NOT_FOUND(HttpStatus.NOT_FOUND, "유저를 찾을 수 없습니다"),
    INVALID_PERMISSION(HttpStatus.UNAUTHORIZED, "권한이 없습니다"),
    DUPLICATED_USER_NAME(HttpStatus.CONFLICT, "409 Conflict"),
    DATABASE_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "DB에러가 발생하였습니다"),
    BAD_REQUEST(HttpStatus.BAD_REQUEST, "400 Bad Request");


    private HttpStatus status;
    private String message;
}
