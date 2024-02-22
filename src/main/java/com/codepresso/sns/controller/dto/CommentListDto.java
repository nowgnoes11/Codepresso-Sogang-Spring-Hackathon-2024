package com.codepresso.sns.controller.dto;

import com.codepresso.sns.vo.Comment;
import lombok.Getter;

import java.util.List;
@Getter
public class CommentListDto {
    List<Comment> comments;

    public CommentListDto(List<Comment> comments) {
        this.comments = comments;
    }
}
