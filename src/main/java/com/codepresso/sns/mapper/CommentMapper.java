package com.codepresso.sns.mapper;

import com.codepresso.sns.controller.dto.CommentRequestDto;
import com.codepresso.sns.vo.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {

    public int createComment(int postId, CommentRequestDto requestDto);

    public Comment getNewOne();

    List<Comment> findAllComment(int postId);
}
