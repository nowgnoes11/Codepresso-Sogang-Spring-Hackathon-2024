package com.codepresso.sns.controller.dto;

import lombok.Getter;

public class CommentRequestDto {
    int userId;
    String comment;

    public CommentRequestDto(int userId, String comment) {
        this.userId = userId;
        this.comment = comment;
    }

    public int getUserId() {
        return userId;
    }

    public String getComment() {
        return comment;
    }
}
