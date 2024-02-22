package com.codepresso.sns.Service;

import com.codepresso.sns.controller.dto.CommentRequestDto;
import com.codepresso.sns.mapper.CommentMapper;
import com.codepresso.sns.vo.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    CommentMapper commentMapper;

    public CommentService(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }

    public Comment createComment(int postId,CommentRequestDto requestDto) {
        commentMapper.createComment(postId, requestDto);
        Comment comment = commentMapper.getNewOne();
        return comment;
    }

    public List<Comment> findAllComment(int postId){
        List<Comment> list=commentMapper.findAllComment(postId);
        return list;
    }
}
