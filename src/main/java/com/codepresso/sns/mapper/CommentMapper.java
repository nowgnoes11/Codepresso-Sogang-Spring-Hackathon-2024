package com.codepresso.sns.mapper;

import com.codepresso.sns.controller.dto.CommentRequestDto;
import com.codepresso.sns.vo.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {

    int createComment(int postId, CommentRequestDto requestDto);

    Comment getNewOne();

    int checkpost(int postId);

    List<Comment> findAllComment(int postId);
}
